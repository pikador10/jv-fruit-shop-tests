package core.basesyntax.model;

public class FruitTransaction {
    private String operation;
    private String fruit;
    private int quantity;

    private FruitTransaction(String operation, String fruit, int quantity) {
        this.operation = operation;
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public static FruitTransaction of(String operation, String fruit, int quantity) {
        return new FruitTransaction(operation, fruit, quantity);
    }

    public String getOperation() {
        return operation;
    }

    public String getFruit() {
        return fruit;
    }

    public int getQuantity() {
        return quantity;
    }
}

