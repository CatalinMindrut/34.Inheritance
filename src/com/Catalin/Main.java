package com.Catalin;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        /** This is the base Animal class, called with 5 parameters that were set in the constructor.
         */

        Dog dog = new Dog("Yorkie", 8,20,2,4,20,20,"silky");
        /** This initialises the Dog class that uses states and behaviors from the Animal class and additional
         * states and behaviors that are unique to the Dog class.
         */
        dog.eat();
        /** You can call a method for the Dog class, even if that method is not defined in the Dog class.
         * This is possible because the method (behavior) is defined in the Animal class, its access modifier is
         * "public" and the Dog extends the Animal class, meaning that it inherits its fields and methods
         * (states and behaviors).
         *
         * The result of dog.eat() will be:
         * Dog.eat() called
         * Dog.chew() called
         * Animal.eat() called
         * This is because we are firstly calling the dog.eat method and inside that method we got another chew
         * method called and below that we are also calling the eat method from the Animal super class.
         */
        dog.walk();
        dog.run();


    }
}
