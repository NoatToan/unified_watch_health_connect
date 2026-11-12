package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class muu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f42456a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double[] f42457c;

    public long e() {
        return ((Long) lst.d(Long.valueOf(this.f42456a))).longValue();
    }

    public void e(long j) {
        this.f42456a = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public double[] c() {
        double[] dArr = this.f42457c;
        return dArr == null ? dArr : (double[]) lst.d((double[]) dArr.clone());
    }

    public void b(double[] dArr) {
        if (dArr != null) {
            this.f42457c = (double[]) lst.d((double[]) dArr.clone());
        }
    }
}
