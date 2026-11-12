package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public class yob extends Exception {
    private final int d;

    public yob(String str) {
        super(str);
        this.d = 100001;
    }

    public int a() {
        return this.d;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "[errorCode:" + this.d + " message:" + getMessage() + "]";
    }
}
