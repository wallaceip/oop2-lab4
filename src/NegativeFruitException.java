public class NegativeFruitException extends Exception {
    public NegativeFruitException() {
        super("Fruits cannot be negative");
    }
    public NegativeFruitException(String message) {super(message);}
}
