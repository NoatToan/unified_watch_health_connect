package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class mqf {
    private int f;
    private int i;
    private long d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42170a = 60;
    private int e = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42172c = 0;
    private int j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42171b = 0;

    public mqf(int i, int i2) {
        this.i = i;
        this.f = i2;
    }

    public long b() {
        return this.d;
    }

    public int e() {
        return this.f42170a;
    }

    public int d() {
        return this.i;
    }

    public int c() {
        return this.f;
    }

    public int a() {
        return this.j;
    }

    public void c(long j) {
        this.d = j;
    }

    public void e(int i) {
        this.j = i;
    }

    public void d(int i) {
        this.f42171b = i;
    }

    public String toString() {
        String str;
        String str2 = "Sample{startTime=" + this.d + ", duration=" + this.f42170a + ", type=" + this.i;
        int i = this.i;
        if (i == 6 || i == 7) {
            str = str2 + ", value=xx";
        } else {
            str = str2 + ", value=" + this.f;
        }
        return str + ", intensive=" + this.f42171b + '}';
    }
}
