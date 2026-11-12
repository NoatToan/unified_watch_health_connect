package ch.qos.logback.core.spi;

/* JADX INFO: loaded from: classes7.dex */
public class ScanException extends Exception {
    private static final long serialVersionUID = -3132040414328475658L;
    Throwable cause;

    public ScanException(String str, Throwable th3) {
        super(str);
        this.cause = th3;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public ScanException(String str) {
        super(str);
    }
}
