@FunctionalInterface
public interface Printable {
    String print(String prefix, String suffix); // abstract method -> no implementation

    // Functional interface -> when an interaface has excatly one abtract method its
    // called a functional interface
}
