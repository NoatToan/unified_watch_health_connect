package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t7o {
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f34426a = Math.sqrt(1500.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f34427b = 0.5d;
    public double c = 1000.0d;
    public boolean d = false;
    public double j = Double.MAX_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a77.p f34428k = new a77.p();

    public float a() {
        return (float) this.j;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        if (this.j == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the miuix.animation starts");
        }
        double d = this.f34427b;
        if (d > 1.0d) {
            double d2 = this.f34426a;
            this.g = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
            double d3 = this.f34427b;
            double d4 = this.f34426a;
            this.h = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
        } else if (d >= 0.0d && d < 1.0d) {
            this.i = this.f34426a * Math.sqrt(1.0d - (d * d));
        }
        this.d = true;
    }

    public boolean c(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f && ((double) Math.abs(f - a())) < this.e;
    }

    public t7o d(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f34427b = f;
        this.d = false;
        return this;
    }

    public t7o e(float f) {
        this.j = f;
        return this;
    }

    public t7o f(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f34426a = Math.sqrt(f);
        this.d = false;
        return this;
    }

    public t7o g(double d) {
        this.c = d;
        return this;
    }

    public a77.p h(double d, double d2, long j) {
        double dCos;
        double dPow;
        b();
        double d3 = j / 1.0E9d;
        double d4 = d - this.j;
        double d5 = this.f34427b;
        if (d5 > 1.0d) {
            double d6 = this.h;
            double d7 = this.g;
            double d8 = d4 - (((d6 * d4) - d2) / (d6 - d7));
            double d9 = ((d4 * d6) - d2) / (d6 - d7);
            dPow = (Math.pow(2.718281828459045d, d6 * d3) * d8) + (Math.pow(2.718281828459045d, this.g * d3) * d9);
            double d10 = this.h;
            double dPow2 = d8 * d10 * Math.pow(2.718281828459045d, d10 * d3);
            double d11 = this.g;
            dCos = dPow2 + (d9 * d11 * Math.pow(2.718281828459045d, d11 * d3));
        } else if (d5 == 1.0d) {
            double d12 = this.f34426a;
            double d13 = d2 + (d12 * d4);
            double d14 = d4 + (d13 * d3);
            dPow = Math.pow(2.718281828459045d, (-d12) * d3) * d14;
            double dPow3 = d14 * Math.pow(2.718281828459045d, (-this.f34426a) * d3);
            double d15 = this.f34426a;
            dCos = (d13 * Math.pow(2.718281828459045d, (-d15) * d3)) + (dPow3 * (-d15));
        } else {
            double d16 = 1.0d / this.i;
            double d17 = this.f34426a;
            double d18 = d16 * ((d5 * d17 * d4) + d2);
            double dPow4 = Math.pow(2.718281828459045d, (-d5) * d17 * d3) * ((Math.cos(this.i * d3) * d4) + (Math.sin(this.i * d3) * d18));
            double d19 = this.f34426a;
            double d20 = this.f34427b;
            double d21 = (-d19) * dPow4 * d20;
            double dPow5 = Math.pow(2.718281828459045d, (-d20) * d19 * d3);
            double d22 = this.i;
            double dSin = (-d22) * d4 * Math.sin(d22 * d3);
            double d23 = this.i;
            dCos = d21 + (dPow5 * (dSin + (d18 * d23 * Math.cos(d23 * d3))));
            dPow = dPow4;
        }
        if (Math.abs(dPow) < 0.6000000238418579d) {
            dPow = 0.0d;
            dCos = 0.0d;
        }
        a77.p pVar = this.f34428k;
        pVar.f709a = (float) (dPow + this.j);
        pVar.f710b = (float) dCos;
        return pVar;
    }
}
