package com.Catalin;

public class Dog extends Animal{
    /** This class will inherit states and behaviors from the Animal class.
     * In order to do this, the "extends" keyword is being used.
     * As soon as you create the class that extends another class, you will notice that an error occurs,
     * saying that no default constructor is available.
     * The Dog class needs a constructor that will call the constructors of the other class, Animal.
     */
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
//    }
    /** Using the Generate option, IntelliJ has created a constructor for the Dog class, using the fields
     * in the Animal class.
     * "super" is used to call the class that we're extending from, the super class, the big class that is
     * the foundation of the Dog class.
     * The Dog class inherits the fields of the super class, Animal and it can continue to build on that with
     * states and behaviors that are specific to this class, Dog.
     * Using super, the basic characteristics of an animal were initialized in the Dog class.
     */
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
        /** In this example, we know that all dogs have one brain and one body so we don't need to specify those
         * every time. What we can do is to actually set the parameters in the super keyword, instead of using
         * the field names and we can also remove the parameters from the Dog constructor, since these will now
         * have a default value of 1.
         *
         * In addition, we can add the new fields, that are specific to the Dog class, to the constructor as
         * parameters.
         */

    }
    private void chew(){
        System.out.println("Dog.chew() called");
    }
    /** Using generate, select override methods.
     * The list will show the available methods from the Animal class, which is extended and will allow you
     * to override the eat method in order to create a behavior unique to the Dog class.
     */
    @Override //symbol, pointing out that the method is overridden
    public void eat() {
        System.out.println("Dog.eat() called");
        chew(); // calling another behavior that is specific to a dog. When the dog eats, he chews.
        super.eat();
        /** This way we are overriding a method that is in the super class, in the Animal class.
         * Super.eat() will check to see what is the super class, what class does Dog extend, then search
         * for an eat method and call that here.
         * In the Dog eat method, we're calling the eat method that is created in the super class, Animal.
         */
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5); //method called from the Animal class
    }
    public  void run(){
        System.out.println("Dog.run() called");
        move(10); //method called from the Animal class
    }
    /** Using move(); means that it will look for a move method inside this class and if no method is found,
     * it will automatically call the move method that is extended from the Animal class.
     * If in the future you decide to actually create a move method that is specific to the Dog class, you
     * will need to differentiate between the move that comes from the Animal class and the one that comes from
     * the dog class. You can do this by using super.move(); for the Animal move and move(); for the Dog move.
     */
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
