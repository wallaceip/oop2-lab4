public class Main {
    public static void main(String[] args) {
        Fruit apple = createFruit("Apple", 500);
        Fruit banana = createFruit("Banana", 1200);
        Fruit peach = createFruit("Peach", 0);
        Fruit kumquat = createFruit("Kumquat", -5);
    }

    private static Fruit createFruit(String name, int quantity) {
        try {
            Fruit fruit = new Fruit(name, quantity);
            System.out.println("Created: " + fruit);
            return fruit;
        } catch (TooManyFruitsException | NegativeFruitException e) {
            System.err.println("Failed to create " + name + ": " + e.getMessage());
            return null;
        }
    }
}
