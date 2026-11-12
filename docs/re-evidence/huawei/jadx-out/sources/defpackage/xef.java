package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public class xef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52772c;
    private int d;

    public xef() {
        this(0, 0, 0, 0);
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.f52770a;
    }

    public int c() {
        return this.f52771b;
    }

    public int d() {
        return this.f52772c;
    }

    public String toString() {
        return "HwColumn{mMargin=" + this.f52771b + ", mGutter=" + this.f52770a + ", mColumnCount=" + this.f52772c + ", mMaxColumnCount=" + this.d + '}';
    }

    xef(int i, int i2, int i3, int i4) {
        this.f52771b = i;
        this.f52770a = i2;
        this.f52772c = i3;
        this.d = i4;
    }

    public void a(int i) {
        this.f52770a = i;
    }

    public void b(int i) {
        this.f52771b = i;
    }

    public void d(int i) {
        this.f52772c = i;
    }

    public void e(int i) {
        this.d = i;
    }
}
