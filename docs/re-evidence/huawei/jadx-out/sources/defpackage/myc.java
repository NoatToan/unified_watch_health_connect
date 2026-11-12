package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class myc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42687c;
    private int d;
    private int e;

    public int a() {
        return ((Integer) lst.d(Integer.valueOf(this.d))).intValue();
    }

    public void a(int i) {
        this.d = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int e() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }

    public void d(int i) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long c() {
        return ((Long) lst.d(Long.valueOf(this.f42687c))).longValue();
    }

    public void e(long j) {
        this.f42687c = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public String toString() {
        return "[StressRecord: stressScore = " + this.d + ", stressTime = " + this.f42687c + ", stressTestType = " + this.e + "]";
    }
}
