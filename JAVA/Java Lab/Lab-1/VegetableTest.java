class Vegetable {
    String color;

    public Vegetable(String color) {
        this.color = color;

    }

    public abstract String getName();

    public String toString() {
        return "Vegetable:" + getName() + ",color: " + color;

    }
}

class potato extends Vegetable {
    public potato() {
        super("Brown");
    }

    public String getName() {
        return "potato";

    }

}

class Brinjal extends Vegetable {
    public Brinjal() {
        super("purple");
    }

    public String getName() {
        return "Brinjal";
    }
}

class Tomato extends Vegetable {
    public Tomato() {
        super("Red");
    }

    public String getName() {
        return "Tomato";
    }
}

public class VegetableTest {
    public static void main(String[] args) {
        Vegetable potato = new potato();
        Vegetable brinjal = new Brinjal();
        Vegetable tomato = new Tomato();
        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}