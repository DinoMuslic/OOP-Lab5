package boxes.classes;

import java.util.ArrayList;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private ArrayList<Thing> things = new ArrayList<>();

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }


    public void add(Thing thing) {
        if(thing.getWeight() < this.maxWeight) {
            this.things.add(thing);
        } else {
            System.out.println("Can't add item, too much weight!");
        }
    }
}
