package k;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23281a;

    public a(int i) {
        this(i, "");
    }

    public int a() {
        return this.f23281a;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ", errorCode: " + this.f23281a;
    }

    public a(int i, String str) {
        super(str);
        this.f23281a = i;
    }

    public a(int i, String str, Throwable th) {
        super(str, th);
        this.f23281a = i;
    }
}
