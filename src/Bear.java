public class Bear extends Animal {

    public Bear(String name) {
        // don't forget to correct the call to the superclass initializer!
        super(name, "fish");
    }

    public void sleep() {
        System.out.println(name + " hibernates for 4 months");
    }

}
