package junit.framework;

/* JADX INFO: loaded from: classes23.dex */
public class ComparisonFailure extends AssertionFailedError {
    private static final int c = 20;
    private static final long serialVersionUID = 1;
    private String a;
    private String b;

    public ComparisonFailure(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    public String getActual() {
        return this.b;
    }

    public String getExpected() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new ComparisonCompactor(20, this.a, this.b).compact(super.getMessage());
    }
}
