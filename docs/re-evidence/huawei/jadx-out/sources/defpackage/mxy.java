package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class mxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f42675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42676b;
    private int d;
    private int e;

    public int d() {
        return ((Integer) lst.d(Integer.valueOf(this.d))).intValue();
    }

    public void c(int i) {
        this.d = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int e() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }

    public void d(int i) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long c() {
        return ((Long) lst.d(Long.valueOf(this.f42675a))).longValue();
    }

    public void e(long j) {
        this.f42675a = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int a() {
        return ((Integer) lst.d(Integer.valueOf(this.f42676b))).intValue();
    }

    public void b(int i) {
        this.f42676b = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String toString() {
        return "[RelaxRecord: relaxScore = " + this.e + ", relaxLength = " + this.d + ", relaxTime = " + this.f42675a + ", relaxType = " + this.f42676b + "]";
    }
}
