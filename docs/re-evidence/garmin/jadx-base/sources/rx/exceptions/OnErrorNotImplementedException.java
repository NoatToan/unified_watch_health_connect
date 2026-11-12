package rx.exceptions;

/* JADX INFO: loaded from: classes11.dex */
public class OnErrorNotImplementedException extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public OnErrorNotImplementedException(Throwable th3) {
        super(th3 != null ? th3.getMessage() : null, th3 == null ? new NullPointerException() : th3);
    }

    public OnErrorNotImplementedException(String str, Throwable th3) {
        super(str, th3 == null ? new NullPointerException() : th3);
    }
}
