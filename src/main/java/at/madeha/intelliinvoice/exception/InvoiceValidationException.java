package at.madeha.intelliinvoice.exception;

public class InvoiceValidationException extends RuntimeException {

    public InvoiceValidationException() {
        super();
    }

    public InvoiceValidationException(String message) {
        super(message);
    }

    public InvoiceValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}