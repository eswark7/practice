// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Meat extends Animal {
    void eat() {
        System.out.println("This animal eats meat.");
    }
}

// Main class to test the inheritance
public class meat1 {
    public static void main(String[] args) {
        Meat meatEater = new Meat();
        meatEater.eat();  // This will call the eat method of Meat class
    }
}