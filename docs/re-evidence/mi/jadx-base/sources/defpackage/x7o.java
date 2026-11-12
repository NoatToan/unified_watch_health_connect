package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class x7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f38792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38793b;
    public double c;
    public double d;
    public v7o e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f38794k;
    public double l;
    public double m;
    public int n;
    public boolean o = true;
    public boolean p;
    public int q;

    public boolean a() {
        if (this.e == null || this.o) {
            return false;
        }
        int i = this.q;
        if (i != 0) {
            if (this.n == 1) {
                this.c = i;
                this.g = i;
            } else {
                this.d = i;
                this.j = i;
            }
            this.q = 0;
            return true;
        }
        if (this.p) {
            this.o = true;
            return true;
        }
        long jA = vc1.a();
        this.f38793b = jA;
        double dMin = Math.min((jA - this.f38792a) / 1.0E9d, 0.01600000075995922d);
        double d = dMin != 0.0d ? dMin : 0.01600000075995922d;
        this.f38792a = this.f38793b;
        if (this.n == 2) {
            double dA = this.e.a(this.m, d, this.i, this.j);
            double d2 = this.j + (d * dA);
            this.d = d2;
            this.m = dA;
            if (e(d2, this.f38794k, this.i)) {
                this.p = true;
                this.d = this.i;
            } else {
                this.j = this.d;
            }
        } else {
            double dA2 = this.e.a(this.m, d, this.f, this.g);
            double d3 = this.g + (d * dA2);
            this.c = d3;
            this.m = dA2;
            if (e(d3, this.h, this.f)) {
                this.p = true;
                this.c = this.f;
            } else {
                this.g = this.c;
            }
        }
        return true;
    }

    public final void b() {
        this.o = true;
        this.q = 0;
    }

    public final int c() {
        return (int) this.c;
    }

    public final int d() {
        return (int) this.d;
    }

    public boolean e(double d, double d2, double d3) {
        if (d2 < d3 && d > d3) {
            return true;
        }
        if (d2 <= d3 || d >= d3) {
            return (d2 == d3 && Math.signum(this.l) != Math.signum(d)) || Math.abs(d - d3) < 1.0d;
        }
        return true;
    }

    public final boolean f() {
        return this.o;
    }

    public void g(float f, float f2, float f3, float f4, float f5, int i, boolean z) {
        this.o = false;
        this.p = false;
        double d = f;
        this.g = d;
        this.h = d;
        this.f = f2;
        double d2 = f3;
        this.j = d2;
        this.f38794k = d2;
        this.d = (int) d2;
        this.i = f4;
        double d3 = f5;
        this.l = d3;
        this.m = d3;
        if (Math.abs(d3) <= 5000.0d || z) {
            this.e = new v7o(1.0f, 0.4f);
        } else {
            this.e = new v7o(1.0f, 0.55f);
        }
        this.n = i;
        this.f38792a = vc1.a();
    }

    public void h(int i) {
        this.q = i;
    }
}
