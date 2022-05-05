package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface TransactionHandler {
    void execute(List<FruitTransaction> transactions);
}