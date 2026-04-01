package seedu.address.commons.exceptions;

/**
 * Represents an error during loading of data from a file.
 */
import java.nio.file.Path;
import java.util.Optional;

public class DataLoadingException extends Exception {

    private final Path backupFilePath;

    public DataLoadingException(Exception cause) {
        this(cause, null);
    }

    public DataLoadingException(Exception cause, Path backupFilePath) {
        super(cause);
        this.backupFilePath = backupFilePath;
    }

    public Optional<Path> getBackupFilePath() {
        return Optional.ofNullable(backupFilePath);
    }
}
