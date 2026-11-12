package rx.exceptions;

/* JADX INFO: loaded from: classes11.dex */
public class OnErrorFailedException extends RuntimeException {
    private static final long serialVersionUID = -419289748403337611L;

    public OnErrorFailedException(Throwable th3) {
        super(th3 != null ? th3.getMessage() : null, th3 == null ? new NullPointerException() : th3);
    }

    public OnErrorFailedException(String str, Throwable th3) {
        super(str, th3 == null ? new NullPointerException() : th3);
    }
}
