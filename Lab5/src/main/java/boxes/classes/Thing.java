package boxes.classes;

import java.util.Objects;

public class Thing {
    private String name;
    private double weight;

    public Thing(String name, double weight) {
        if(weight < 0) {
            throw new IllegalArgumentException("Weight can't be negative!");
        }
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Double.compare(weight, thing.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }
}
