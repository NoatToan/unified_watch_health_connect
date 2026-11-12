package rx.exceptions;

/* JADX INFO: loaded from: classes11.dex */
public final class OnCompletedFailedException extends RuntimeException {
    private static final long serialVersionUID = 8622579378868820554L;

    public OnCompletedFailedException(Throwable th3) {
        super(th3 == null ? new NullPointerException() : th3);
    }

    public OnCompletedFailedException(String str, Throwable th3) {
        super(str, th3 == null ? new NullPointerException() : th3);
    }
}
