package r;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32043a;

    public a(int i) {
        this(i, "");
    }

    public int a() {
        return this.f32043a;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ", errorCode: " + this.f32043a;
    }

    public a(int i, String str) {
        super(str);
        this.f32043a = i;
    }

    public a(int i, String str, Throwable th) {
        super(str, th);
        this.f32043a = i;
    }
}
