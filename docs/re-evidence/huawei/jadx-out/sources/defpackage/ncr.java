package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class ncr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42894b;
    private int d;
    private int e;

    public int c() {
        return this.e;
    }

    public void d(int i) {
        this.e = i;
    }

    public int e() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public int a() {
        return this.f42894b;
    }

    public void e(int i) {
        this.f42894b = i;
    }

    public int b() {
        return this.f42893a;
    }

    public void c(int i) {
        this.f42893a = i;
    }

    public String toString() {
        return "NotifySendParam{msgType=" + this.e + ", yellowPagesFormat=" + this.d + ", contentSignFormat=" + this.f42894b + ", incomingNumberFormat=" + this.f42893a + '}';
    }
}
