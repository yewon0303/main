package seedu.address.logic.parser;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;

import seedu.address.logic.commands.SplitCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new {@code SplitCommand} object
 */
public class SplitCommandParser implements Parser<SplitCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the {@code SplitCommand}
     * and returns a {@code SplitCommand} object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public SplitCommand parse(String args) throws ParseException {
        requireNonNull(args);
        ArgumentMultimap argMultimap = ArgumentTokenizer.tokenize(args, PREFIX_NAME);

        int amount = Integer.parseInt(argMultimap.getPreamble());
        String name = argMultimap.getValue(PREFIX_NAME).orElse("");

        return new SplitCommand(amount, name);
    }

}
