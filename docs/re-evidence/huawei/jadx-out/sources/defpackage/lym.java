package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class lym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41129c;
    private long d;
    private int e;
    private int f;
    private int g;
    private int j;

    public lym() {
        this.d = 0L;
        this.e = 60;
        this.g = -1;
        this.j = 0;
        this.f41128b = -1;
        this.f41129c = 0;
        this.f = 0;
        this.f41127a = 0;
    }

    public lym(int i, int i2) {
        this.d = 0L;
        this.e = 60;
        this.g = i;
        this.j = i2;
        this.f41128b = -1;
        this.f41129c = 0;
        this.f = 0;
        this.f41127a = 0;
    }

    public long b() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public int c() {
        return this.g;
    }

    public int a() {
        return this.j;
    }

    public int d() {
        return this.f;
    }

    public void d(long j) {
        this.d = j;
    }

    public void b(int i) {
        this.f = i;
    }

    public void c(int i) {
        this.f41127a = i;
    }

    public String toString() {
        String str;
        String str2 = "Sample{startTime=" + this.d + ", duration=" + this.e + ", type=" + this.g;
        int i = this.g;
        if (i == 6 || i == 7) {
            str = str2 + ", value=xx";
        } else {
            str = str2 + ", value=" + this.j;
        }
        return str + ", intensive=" + this.f41127a + '}';
    }
}
