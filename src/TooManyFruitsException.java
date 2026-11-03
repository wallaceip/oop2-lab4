public class TooManyFruitsException extends Exception {
    public TooManyFruitsException() {
        super("Fruits cannot be larger than 1000.");
    }
    public TooManyFruitsException(String message) {super(message);}
}
