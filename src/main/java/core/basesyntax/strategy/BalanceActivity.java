package core.basesyntax.strategy;

import core.basesyntax.database.Storage;
import core.basesyntax.model.Fruit;
import core.basesyntax.model.FruitTransaction;

public class BalanceActivity implements TypeOfActivity {
    @Override
    public void realizeType(FruitTransaction fruitTransaction) {
        Fruit fruit = new Fruit(fruitTransaction.getFruit());
        Storage.storage.put(fruit, fruitTransaction.getQuantity());
    }
}
