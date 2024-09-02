public class Lambdas {
    public static void main(String[] args) {

        // Cat myCat = new Cat();
        // myCat.print();

        // java will infer the type form the Printable interface method
        Printable lambdPrintable = (p, s) -> p + " Meow " + s;

        printThing(lambdPrintable);
        // we are using a lambda to pass in the implementaion of our print method as an
        // object like we would any other object

        // gives ability to make method implementation into objects so that it can be
        // saved int acariabnles and passed into methods as parameters
    }

    static void printThing(Printable thing) {
        thing.print("Mhm", "!");
    }

    //in a lambda you are only able to define one method therfore it can only be used on functional interface
}