package junit.framework;

/* JADX INFO: loaded from: classes23.dex */
public class AssertionFailedError extends AssertionError {
    private static final long serialVersionUID = 1;

    public AssertionFailedError() {
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    public AssertionFailedError(String str) {
        super(a(str));
    }
}
