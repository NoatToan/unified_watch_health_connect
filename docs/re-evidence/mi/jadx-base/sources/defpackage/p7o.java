package defpackage;

import com.facebook.react.bridge.ReadableMap;
import miuix.animation.FolmeEase;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public class p7o extends kc1 {
    public long e;
    public boolean f;
    public double g;
    public double h;
    public double i;
    public double j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f30094k;
    public final b l;
    public double m;
    public double n;
    public double o;
    public double p;
    public double q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f30095r;
    public int s;
    public double t;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f30096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f30097b;

        public b() {
        }
    }

    public p7o(ReadableMap readableMap) {
        b bVar = new b();
        this.l = bVar;
        bVar.f30097b = readableMap.getDouble("initialVelocity");
        a(readableMap);
    }

    @Override // defpackage.kc1
    public void a(ReadableMap readableMap) {
        this.g = readableMap.getDouble("stiffness");
        this.h = readableMap.getDouble(FolmeEase.DAMPING);
        this.i = readableMap.getDouble("mass");
        this.j = this.l.f30097b;
        this.n = readableMap.getDouble("toValue");
        this.o = readableMap.getDouble("restSpeedThreshold");
        this.p = readableMap.getDouble("restDisplacementThreshold");
        this.f30094k = readableMap.getBoolean("overshootClamping");
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f30095r = i;
        this.f23702a = i == 0;
        this.s = 0;
        this.q = 0.0d;
        this.f = false;
    }

    @Override // defpackage.kc1
    public void b(long j) {
        long j2 = j / FolmeCore.NANOS_TO_MS;
        if (!this.f) {
            if (this.s == 0) {
                this.t = this.f23703b.f;
                this.s = 1;
            }
            b bVar = this.l;
            double d = this.f23703b.f;
            bVar.f30096a = d;
            this.m = d;
            this.e = j2;
            this.q = 0.0d;
            this.f = true;
        }
        c((j2 - this.e) / 1000.0d);
        this.e = j2;
        this.f23703b.f = this.l.f30096a;
        if (e()) {
            int i = this.f30095r;
            if (i != -1 && this.s >= i) {
                this.f23702a = true;
                return;
            }
            this.f = false;
            this.f23703b.f = this.t;
            this.s++;
        }
    }

    public final void c(double d) {
        double dSin;
        double dSin2;
        if (e()) {
            return;
        }
        this.q += d <= 0.064d ? d : 0.064d;
        double d2 = this.h;
        double d3 = this.i;
        double d4 = this.g;
        double d5 = -this.j;
        double dSqrt = d2 / (Math.sqrt(d4 * d3) * 2.0d);
        double dSqrt2 = Math.sqrt(d4 / d3);
        double dSqrt3 = Math.sqrt(1.0d - (dSqrt * dSqrt)) * dSqrt2;
        double d6 = this.n - this.m;
        double d7 = this.q;
        if (dSqrt < 1.0d) {
            double dExp = Math.exp((-dSqrt) * dSqrt2 * d7);
            double d8 = dSqrt * dSqrt2;
            double d9 = d5 + (d8 * d6);
            double d10 = d7 * dSqrt3;
            dSin2 = this.n - ((((d9 / dSqrt3) * Math.sin(d10)) + (Math.cos(d10) * d6)) * dExp);
            dSin = ((d8 * dExp) * (((Math.sin(d10) * d9) / dSqrt3) + (Math.cos(d10) * d6))) - (((Math.cos(d10) * d9) - ((dSqrt3 * d6) * Math.sin(d10))) * dExp);
        } else {
            double dExp2 = Math.exp((-dSqrt2) * d7);
            double d11 = this.n - (((((dSqrt2 * d6) + d5) * d7) + d6) * dExp2);
            dSin = dExp2 * ((d5 * ((d7 * dSqrt2) - 1.0d)) + (d7 * d6 * dSqrt2 * dSqrt2));
            dSin2 = d11;
        }
        b bVar = this.l;
        bVar.f30096a = dSin2;
        bVar.f30097b = dSin;
        if (e() || (this.f30094k && f())) {
            if (this.g > 0.0d) {
                double d12 = this.n;
                this.m = d12;
                this.l.f30096a = d12;
            } else {
                double d13 = this.l.f30096a;
                this.n = d13;
                this.m = d13;
            }
            this.l.f30097b = 0.0d;
        }
    }

    public final double d(b bVar) {
        return Math.abs(this.n - bVar.f30096a);
    }

    public final boolean e() {
        return Math.abs(this.l.f30097b) <= this.o && (d(this.l) <= this.p || this.g == 0.0d);
    }

    public final boolean f() {
        if (this.g > 0.0d) {
            double d = this.m;
            double d2 = this.n;
            if ((d < d2 && this.l.f30096a > d2) || (d > d2 && this.l.f30096a < d2)) {
                return true;
            }
        }
        return false;
    }
}
