public class Fruit {
    String name;
    int quantity;

    public Fruit(String name, int quantity) throws TooManyFruitsException, NegativeFruitException {
        this.setQuantity(quantity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws TooManyFruitsException, NegativeFruitException {
        if (quantity > 1000) {
            throw new TooManyFruitsException();
        } else if (quantity < 0) {
            throw new NegativeFruitException();
        }
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
