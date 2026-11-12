package defpackage;

import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes3.dex */
public class y7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39901b;
    public double c;
    public double d;
    public w7o e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f39902k;
    public int l;
    public boolean m = true;
    public boolean n;

    public final void a() {
        this.m = true;
    }

    public boolean b() {
        if (this.e == null || this.m) {
            return false;
        }
        if (this.n) {
            this.m = true;
            this.d = this.h;
            this.c = this.f;
            return true;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f39901b = jCurrentAnimationTimeMillis;
        float fMin = Math.min((jCurrentAnimationTimeMillis - this.f39900a) / 1000.0f, 0.016f);
        float f = fMin != 0.0f ? fMin : 0.016f;
        this.f39900a = this.f39901b;
        if (this.l == 2) {
            double dA = this.e.a(this.f39902k, f, this.h, this.i);
            double d = this.i + (((double) f) * dA);
            this.d = d;
            this.f39902k = dA;
            if (g(d, this.h)) {
                this.n = true;
            } else {
                this.i = this.d;
            }
        } else {
            double dA2 = this.e.a(this.f39902k, f, this.f, this.g);
            double d2 = this.g + (((double) f) * dA2);
            this.c = d2;
            this.f39902k = dA2;
            if (g(d2, this.f)) {
                this.n = true;
            } else {
                this.g = this.c;
            }
        }
        return true;
    }

    public final int c() {
        return (int) this.c;
    }

    public final int d() {
        return (int) this.d;
    }

    public final int e() {
        return (int) this.f;
    }

    public final int f() {
        return (int) this.g;
    }

    public boolean g(double d, double d2) {
        return Math.abs(d - d2) < 1.0d;
    }

    public final boolean h() {
        return this.m;
    }

    public void i(int i) {
        this.f = i;
        this.m = false;
    }

    public void j(float f, float f2, float f3, float f4, float f5) {
        this.m = false;
        this.n = false;
        this.g = f;
        this.f = f2;
        double d = f3;
        this.i = d;
        this.j = d;
        this.d = (int) d;
        this.h = f4;
        double d2 = f5;
        this.f39902k = d2;
        if (Math.abs(d2) <= 5000.0d) {
            this.e = new w7o(0.9f, 0.35f);
        } else {
            this.e = new w7o(0.9f, 0.35f);
        }
        this.l = Math.abs(f4 - f3) > Math.abs(f2 - f) ? 2 : 1;
        this.f39900a = AnimationUtils.currentAnimationTimeMillis();
    }
}
