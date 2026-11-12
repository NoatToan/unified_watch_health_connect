package defpackage;

/* JADX INFO: loaded from: classes19.dex */
public class vfv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f51046c;
    private double d;
    private double e;

    public vfv(double d, double d2, long j, int i) {
        this.d = d;
        this.e = d2;
        this.f51046c = j;
        this.f51045b = i;
    }

    public double d() {
        return this.d;
    }

    public double c() {
        return this.e;
    }

    public long b() {
        return this.f51046c;
    }

    public int e() {
        return this.f51045b;
    }

    public String toString() {
        return "WeightBean{Weight=" + this.d + ", FatRate=" + this.e + ", WeightTime=" + this.f51046c + '}';
    }
}
