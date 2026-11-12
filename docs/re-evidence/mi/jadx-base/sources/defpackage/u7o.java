package defpackage;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class u7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f35500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f35501b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final z67.o j;

    public u7o() {
        this.f35500a = Math.sqrt(1500.0d);
        this.f35501b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new z67.o();
    }

    public float a() {
        return (float) this.i;
    }

    public final void b() {
        if (this.c) {
            return;
        }
        if (this.i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d = this.f35501b;
        if (d > 1.0d) {
            double d2 = this.f35500a;
            this.f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
            double d3 = this.f35501b;
            double d4 = this.f35500a;
            this.g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
        } else if (d >= 0.0d && d < 1.0d) {
            this.h = this.f35500a * Math.sqrt(1.0d - (d * d));
        }
        this.c = true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean c(float f, float f2) {
        return ((double) Math.abs(f2)) < this.e && ((double) Math.abs(f - a())) < this.d;
    }

    public u7o d(@FloatRange(from = 0.0d) float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f35501b = f;
        this.c = false;
        return this;
    }

    public u7o e(float f) {
        this.i = f;
        return this;
    }

    public u7o f(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f35500a = Math.sqrt(f);
        this.c = false;
        return this;
    }

    public void g(double d) {
        double dAbs = Math.abs(d);
        this.d = dAbs;
        this.e = dAbs * 62.5d;
    }

    public z67.o h(double d, double d2, long j) {
        double dCos;
        double dPow;
        b();
        double d3 = j / 1000.0d;
        double d4 = d - this.i;
        double d5 = this.f35501b;
        if (d5 > 1.0d) {
            double d6 = this.g;
            double d7 = this.f;
            double d8 = d4 - (((d6 * d4) - d2) / (d6 - d7));
            double d9 = ((d4 * d6) - d2) / (d6 - d7);
            dPow = (Math.pow(2.718281828459045d, d6 * d3) * d8) + (Math.pow(2.718281828459045d, this.f * d3) * d9);
            double d10 = this.g;
            double dPow2 = d8 * d10 * Math.pow(2.718281828459045d, d10 * d3);
            double d11 = this.f;
            dCos = dPow2 + (d9 * d11 * Math.pow(2.718281828459045d, d11 * d3));
        } else if (d5 == 1.0d) {
            double d12 = this.f35500a;
            double d13 = d2 + (d12 * d4);
            double d14 = d4 + (d13 * d3);
            dPow = Math.pow(2.718281828459045d, (-d12) * d3) * d14;
            double dPow3 = d14 * Math.pow(2.718281828459045d, (-this.f35500a) * d3);
            double d15 = this.f35500a;
            dCos = (d13 * Math.pow(2.718281828459045d, (-d15) * d3)) + (dPow3 * (-d15));
        } else {
            double d16 = 1.0d / this.h;
            double d17 = this.f35500a;
            double d18 = d16 * ((d5 * d17 * d4) + d2);
            double dPow4 = Math.pow(2.718281828459045d, (-d5) * d17 * d3) * ((Math.cos(this.h * d3) * d4) + (Math.sin(this.h * d3) * d18));
            double d19 = this.f35500a;
            double d20 = this.f35501b;
            double d21 = (-d19) * dPow4 * d20;
            double dPow5 = Math.pow(2.718281828459045d, (-d20) * d19 * d3);
            double d22 = this.h;
            double dSin = (-d22) * d4 * Math.sin(d22 * d3);
            double d23 = this.h;
            dCos = d21 + (dPow5 * (dSin + (d18 * d23 * Math.cos(d23 * d3))));
            dPow = dPow4;
        }
        z67.o oVar = this.j;
        oVar.f40943a = (float) (dPow + this.i);
        oVar.f40944b = (float) dCos;
        return oVar;
    }

    public u7o(float f) {
        this.f35500a = Math.sqrt(1500.0d);
        this.f35501b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new z67.o();
        this.i = f;
    }
}
