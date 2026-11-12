package defpackage;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import miuix.animation.internal.AnimData;
import miuix.animation.physics.SpringOperator;

/* JADX INFO: loaded from: classes3.dex */
public class mfh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f26105b;
    public final a c;
    public Interpolator d;
    public final boolean e;

    public static class a {
        public static float t = (float) (Math.log(0.78d) / Math.log(0.9d));
        public static final float[] u = new float[101];
        public static final float[] v = new float[101];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f26106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f26107b;
        public double c;
        public double d;
        public double e;
        public double f;
        public float g;
        public long h;
        public int i;
        public float m;
        public SpringOperator n;
        public double[] o;
        public AnimData p;
        public boolean q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public double f26109r;
        public double[] s;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f26108k = ViewConfiguration.getScrollFriction();
        public int l = 0;
        public boolean j = true;

        static {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11 = 0.0f;
            float f12 = 0.0f;
            for (int i = 0; i < 100; i++) {
                float f13 = i / 100.0f;
                float f14 = 1.0f;
                while (true) {
                    f = 2.0f;
                    f2 = ((f14 - f11) / 2.0f) + f11;
                    f3 = 3.0f;
                    f4 = 1.0f - f2;
                    f5 = f2 * 3.0f * f4;
                    f6 = f2 * f2 * f2;
                    float f15 = (((f4 * 0.175f) + (f2 * 0.35000002f)) * f5) + f6;
                    if (Math.abs(f15 - f13) < 1.0E-5d) {
                        break;
                    } else if (f15 > f13) {
                        f14 = f2;
                    } else {
                        f11 = f2;
                    }
                }
                u[i] = (f5 * ((f4 * 0.5f) + f2)) + f6;
                float f16 = 1.0f;
                while (true) {
                    f7 = ((f16 - f12) / f) + f12;
                    f8 = 1.0f - f7;
                    f9 = f7 * f3 * f8;
                    f10 = f7 * f7 * f7;
                    float f17 = (((f8 * 0.5f) + f7) * f9) + f10;
                    if (Math.abs(f17 - f13) < 1.0E-5d) {
                        break;
                    }
                    if (f17 > f13) {
                        f16 = f7;
                    } else {
                        f12 = f7;
                    }
                    f = 2.0f;
                    f3 = 3.0f;
                }
                v[i] = (f9 * ((f8 * 0.175f) + (f7 * 0.35000002f))) + f10;
            }
            float[] fArr = u;
            v[100] = 1.0f;
            fArr[100] = 1.0f;
        }

        public a(Context context) {
            this.f26106a = context;
            this.m = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        }

        public final void A(boolean z) {
            this.j = z;
        }

        public final void B(int i) {
            this.f26107b = i;
        }

        public final void C(long j) {
            this.h = j;
        }

        public final void D(int i) {
            this.l = i;
        }

        public boolean E(int i, int i2, int i3) {
            throw null;
        }

        public void F(int i, int i2, int i3) {
            this.j = false;
            double d = i;
            this.f26107b = d;
            this.c = d;
            this.d = i + i2;
            this.h = vc1.a();
            this.i = i3;
            this.g = 0.0f;
            this.e = 0.0d;
        }

        public void G(float f, int i, int i2) {
            this.j = false;
            this.q = false;
            D(0);
            double d = f;
            this.f26109r = d;
            this.f26107b = d;
            this.c = d;
            this.d = f + i;
            this.h = vc1.a();
            double d2 = i2;
            this.e = d2;
            this.f = d2;
            this.n = new SpringOperator();
            this.o = new double[]{0.99d, 0.4d};
            AnimData animData = new AnimData();
            this.p = animData;
            animData.startValue = this.f26107b;
            animData.targetValue = this.d;
            animData.value = this.c;
            animData.velocity = this.f;
            double[] dArr = new double[3];
            this.s = dArr;
            this.n.getParameters(this.o, dArr);
        }

        public boolean H() {
            throw null;
        }

        public void I(float f) {
            double d = this.f26107b;
            this.c = d + Math.round(((double) f) * (this.d - d));
        }

        public boolean j() {
            if (this.n == null || this.j) {
                return false;
            }
            if (this.q) {
                this.j = true;
                this.c = this.d;
                return true;
            }
            long jA = vc1.a();
            double dMin = Math.min((jA - this.h) / 1.0E9d, 0.01600000075995922d);
            double d = dMin == 0.0d ? 0.01600000075995922d : dMin;
            this.h = jA;
            AnimData animData = this.p;
            animData.startValue = this.f26107b;
            animData.targetValue = this.d;
            animData.value = this.c;
            double d2 = this.o[0];
            double[] dArr = this.s;
            SpringOperator.updateValues(animData, d2, dArr[1], dArr[2], d, false);
            AnimData animData2 = this.p;
            double d3 = animData2.value;
            this.c = d3;
            this.f = animData2.velocity;
            if (s(d3, this.d)) {
                this.q = true;
            } else {
                this.f26107b = this.c;
            }
            return true;
        }

        public boolean k() {
            throw null;
        }

        public void l() {
            throw null;
        }

        public void m(int i, int i2, int i3, int i4, int i5) {
            throw null;
        }

        public final float n() {
            return (float) this.f;
        }

        public final int o() {
            return (int) this.c;
        }

        public final int p() {
            return (int) this.d;
        }

        public final int q() {
            return (int) this.f26107b;
        }

        public final int r() {
            return this.l;
        }

        public boolean s(double d, double d2) {
            return Math.abs(d - d2) < 1.0d;
        }

        public final boolean t() {
            return this.j;
        }

        public void u(int i, int i2, int i3) {
            throw null;
        }

        public final void v(float f) {
            this.f = f;
        }

        public final void w(int i) {
            this.c = i;
        }

        public final void x(int i) {
            this.i = i;
        }

        public final void y(int i) {
            this.d = i;
        }

        public void z(int i) {
            this.d = i;
            this.j = false;
        }
    }

    public static class b implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final float f26110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final float f26111b;

        static {
            float fA = 1.0f / a(1.0f);
            f26110a = fA;
            f26111b = 1.0f - (fA * a(1.0f));
        }

        public static float a(float f) {
            float f2 = f * 8.0f;
            return f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : 0.36787945f + ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float fA = f26110a * a(f);
            return fA > 0.0f ? fA + f26111b : fA;
        }
    }

    public mfh(Context context) {
        this(context, null);
    }

    public void a() {
        this.f26105b.l();
        this.c.l();
    }

    public boolean b() {
        if (p()) {
            return false;
        }
        int i = this.f26104a;
        if (i == 0) {
            long jA = vc1.a() - this.f26105b.h;
            int i2 = this.f26105b.i;
            if (jA < i2) {
                float interpolation = this.d.getInterpolation(jA / i2);
                this.f26105b.I(interpolation);
                this.c.I(interpolation);
            } else {
                a();
            }
        } else if (i == 1) {
            if (!this.f26105b.j && !this.f26105b.H() && !this.f26105b.k()) {
                this.f26105b.l();
            }
            if (!this.c.j && !this.c.H() && !this.c.k()) {
                this.c.l();
            }
        } else if (i == 2) {
            return this.c.j() || this.f26105b.j();
        }
        return true;
    }

    public void c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        d(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    public void d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.e && !p()) {
            float f = (float) this.f26105b.f;
            float f2 = (float) this.c.f;
            i11 = i3;
            float f3 = i11;
            if (Math.signum(f3) == Math.signum(f)) {
                i12 = i4;
                float f4 = i12;
                if (Math.signum(f4) == Math.signum(f2)) {
                    i13 = (int) (f4 + f2);
                    i14 = (int) (f3 + f);
                }
                this.f26104a = 1;
                this.f26105b.m(i, i14, i5, i6, i9);
                this.c.m(i2, i13, i7, i8, i10);
            }
            i13 = i12;
            i14 = i11;
            this.f26104a = 1;
            this.f26105b.m(i, i14, i5, i6, i9);
            this.c.m(i2, i13, i7, i8, i10);
        }
        i11 = i3;
        i12 = i4;
        i13 = i12;
        i14 = i11;
        this.f26104a = 1;
        this.f26105b.m(i, i14, i5, i6, i9);
        this.c.m(i2, i13, i7, i8, i10);
    }

    public final void e(boolean z) {
        this.f26105b.j = this.c.j = z;
    }

    public float f() {
        return (float) Math.hypot(this.f26105b.f, this.c.f);
    }

    public float g() {
        return (float) this.f26105b.f;
    }

    public float h() {
        return (float) this.c.f;
    }

    public final int i() {
        return (int) this.f26105b.c;
    }

    public final int j() {
        return (int) this.c.c;
    }

    public final int k() {
        return (int) this.f26105b.d;
    }

    public final int l() {
        return (int) this.c.d;
    }

    public int m() {
        return this.f26104a;
    }

    public final int n() {
        return (int) this.f26105b.f26107b;
    }

    public final int o() {
        return (int) this.c.f26107b;
    }

    public final boolean p() {
        return this.f26105b.j && this.c.j;
    }

    public void q(int i, int i2, int i3) {
        this.f26105b.u(i, i2, i3);
    }

    public void r(int i, int i2, int i3) {
        this.c.u(i, i2, i3);
    }

    public final void s() {
        t(this.f26105b);
        t(this.c);
    }

    public final void t(a aVar) {
        aVar.B(0);
        aVar.y(0);
        aVar.w(0);
    }

    public boolean u(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f26104a = 1;
        return this.f26105b.E(i, i3, i4) || this.c.E(i2, i5, i6);
    }

    public void v(int i, int i2, int i3, int i4) {
        w(i, i2, i3, i4, 250);
    }

    public void w(int i, int i2, int i3, int i4, int i5) {
        this.f26104a = 0;
        this.f26105b.F(i, i3, i5);
        this.c.F(i2, i4, i5);
    }

    public void x(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f26104a = 2;
        this.f26105b.G(i, i3, i5);
        this.c.G(i2, i4, i6);
    }

    public mfh(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public mfh(Context context, Interpolator interpolator, boolean z) {
        if (interpolator == null) {
            this.d = new b();
        } else {
            this.d = interpolator;
        }
        this.e = z;
        this.f26105b = new k77(context);
        this.c = new k77(context);
    }
}
