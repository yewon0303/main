package seedu.address.logic.commands;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

/**
 * Splits an amount of money with an existing person in the address book.
 */

public class SplitCommand extends Command {

    public static final String COMMAND_WORD = "split";
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Splits the amount of money " + "with a person. "
            + "Parameters: AMOUNT (must be a positive integer), INDEX (must be a positive integer)\n "
            + "split [AMOUNT]" + PREFIX_NAME + "[NAME] \n"
            + "Example: " + COMMAND_WORD + " split 100" + PREFIX_NAME + "Bob";
    public static final String MESSAGE_NOT_IMPLEMENTED_YET = "Remark command not implemented yet";
    public static final String MESSAGE_ARGUMENTS = "Amount: %1$d, Name: %2$s";

    private final int amount;
    private final String name;

    /**
     * Constructs SplitCommand
     * @param amount amount to be split
     * @param name name of the person to share the amount with
     */
    public SplitCommand(int amount, String name) {
        requireAllNonNull(amount, name);

        this.amount = amount;
        this.name = name;
    }

    @Override
    public CommandResult execute(Model mode) throws CommandException {
        throw new CommandException(String.format(MESSAGE_ARGUMENTS, amount, name));
    }

    @Override
    public boolean equals(Object other) {
        //short circuit if same object
        if (other == this) {
            return true;
        }

        //instanceof handles nulls
        if (!(other instanceof SplitCommand)) {
            return false;
        }

        //state check
        SplitCommand e = (SplitCommand) other;
        return amount == e.amount && name.equals(e.name);
    }
}
