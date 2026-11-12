package rx.exceptions;

/* JADX INFO: loaded from: classes11.dex */
public final class UnsubscribeFailedException extends RuntimeException {
    private static final long serialVersionUID = 4594672310593167598L;

    public UnsubscribeFailedException(Throwable th3) {
        super(th3 == null ? new NullPointerException() : th3);
    }

    public UnsubscribeFailedException(String str, Throwable th3) {
        super(str, th3 == null ? new NullPointerException() : th3);
    }
}
