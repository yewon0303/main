package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Person's balance in the address book.
 * Gurantees: immutable; is always valid
 */
public class Balance {
    public final int balance;

    public Balance(int balance) {
        requireNonNull(balance);
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "" + balance;
    }
}
