package boxes.classes;

import boxes.interfaces.ToBeStored;

import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<Double> totalWeight = new ArrayList<>();
    private ArrayList<ToBeStored> objects = new ArrayList<>();

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Box() {
    }

    public void add(ToBeStored object) {
        this.objects.add(object);
        double currentWeight = weight();
        if(currentWeight + object.weight() < maxWeight) {
            totalWeight.add(object.weight());
        } else {
            System.out.println("Can't add item, too much weight!");
        }
    }

    public double weight() {
        double tWeight = 0;
        for(ToBeStored w : this.objects) {
            tWeight += w.weight();
        }
        return tWeight;
    }

    public String toString() {
        return "Box: " + this.objects.size() + " things, total weight: " + weight();
    }
}
