/**
Main.java

Functionality for testing Virtual Pet classes
*/
public class Main {
    public static void main(String[] args) {
		// Define starting pets
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Luna");

		// Print information about the pets
<<<<<<< HEAD
        System.out.println("Welcome from partner A!");
=======
        System.out.println("Welcome to this Tyler's cat paradise");
>>>>>>> 3d3cf320e3f2f4241bd44f18dc90c18b176ab889
        dog.bark();
        cat.meow();

        dog.feed();
        cat.play();

        dog.showStatus();
        cat.showStatus();
    }
}
