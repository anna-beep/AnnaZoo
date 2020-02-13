public class Unicorn extends Animal {

    public Unicorn(String name) {
        // don't forget to correct the call to the superclass initializer!
        super(name, "marshmallows");
    }

    public void sleep() {
        System.out.println(name + " sleeps in a cloud");
    }
    public void eat(String food) {
        if (food == favoriteFood){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! "+name+" wants more "+food);
        } else {
            sleep();
        }
    }
}
