package bg.sofia.uni.fmi.mjt.uno.database.account.exception;

public class UsernameTakenException extends Exception {

    public UsernameTakenException(String message) {
        super(message);
    }

    public UsernameTakenException(String message, Throwable cause) {
        super(message, cause);
    }

}
