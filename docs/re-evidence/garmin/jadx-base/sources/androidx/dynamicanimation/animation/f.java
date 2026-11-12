package androidx.dynamicanimation.animation;

import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f7015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f7016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f7018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f7019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f7020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f7021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f7022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f7023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b.p f7024j;

    public f(float f14) {
        this.f7015a = Math.sqrt(1500.0d);
        this.f7016b = 0.5d;
        this.f7017c = false;
        this.f7023i = Double.MAX_VALUE;
        this.f7024j = new b.p();
        this.f7023i = f14;
    }

    public final void a(float f14) {
        if (f14 <= 0.0f) {
            h.s("Spring stiffness constant must be positive.");
        } else {
            this.f7015a = Math.sqrt(f14);
            this.f7017c = false;
        }
    }

    public final b.p b(double d14, double d15, long j8) {
        double dSin;
        double dCos;
        if (!this.f7017c) {
            if (this.f7023i == Double.MAX_VALUE) {
                h.z("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
            double d16 = this.f7016b;
            if (d16 > 1.0d) {
                double d17 = this.f7015a;
                this.f7020f = (Math.sqrt((d16 * d16) - 1.0d) * d17) + ((-d16) * d17);
                double d18 = this.f7016b;
                double d19 = this.f7015a;
                this.f7021g = ((-d18) * d19) - (Math.sqrt((d18 * d18) - 1.0d) * d19);
            } else if (d16 >= 0.0d && d16 < 1.0d) {
                this.f7022h = Math.sqrt(1.0d - (d16 * d16)) * this.f7015a;
            }
            this.f7017c = true;
        }
        double d24 = j8 / 1000.0d;
        double d25 = d14 - this.f7023i;
        double d26 = this.f7016b;
        if (d26 > 1.0d) {
            double d27 = this.f7021g;
            double d28 = ((d27 * d25) - d15) / (d27 - this.f7020f);
            double d29 = d25 - d28;
            dSin = (Math.pow(2.718281828459045d, this.f7020f * d24) * d28) + (Math.pow(2.718281828459045d, d27 * d24) * d29);
            double d34 = this.f7021g;
            double dPow = Math.pow(2.718281828459045d, d34 * d24) * d29 * d34;
            double d35 = this.f7020f;
            dCos = (Math.pow(2.718281828459045d, d35 * d24) * d28 * d35) + dPow;
        } else if (d26 == 1.0d) {
            double d36 = this.f7015a;
            double d37 = (d36 * d25) + d15;
            double d38 = (d37 * d24) + d25;
            double dPow2 = Math.pow(2.718281828459045d, (-d36) * d24) * d38;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f7015a) * d24) * d38;
            double d39 = -this.f7015a;
            dCos = (Math.pow(2.718281828459045d, d39 * d24) * d37) + (dPow3 * d39);
            dSin = dPow2;
        } else {
            double d44 = 1.0d / this.f7022h;
            double d45 = this.f7015a;
            double d46 = ((d26 * d45 * d25) + d15) * d44;
            dSin = ((Math.sin(this.f7022h * d24) * d46) + (Math.cos(this.f7022h * d24) * d25)) * Math.pow(2.718281828459045d, (-d26) * d45 * d24);
            double d47 = this.f7015a;
            double d48 = this.f7016b;
            double d49 = (-d47) * dSin * d48;
            double dPow4 = Math.pow(2.718281828459045d, (-d48) * d47 * d24);
            double d54 = this.f7022h;
            double dSin2 = Math.sin(d54 * d24) * (-d54) * d25;
            double d55 = this.f7022h;
            dCos = (((Math.cos(d55 * d24) * d46 * d55) + dSin2) * dPow4) + d49;
        }
        float f14 = (float) (dSin + this.f7023i);
        b.p pVar = this.f7024j;
        pVar.f7008a = f14;
        pVar.f7009b = (float) dCos;
        return pVar;
    }

    public f() {
        this.f7015a = Math.sqrt(1500.0d);
        this.f7016b = 0.5d;
        this.f7017c = false;
        this.f7023i = Double.MAX_VALUE;
        this.f7024j = new b.p();
    }
}
