package defpackage;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class wr1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f38266r = ViewConfiguration.getTapTimeout();
    public final View c;
    public Runnable d;
    public int g;
    public int h;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f38267a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Interpolator f38268b = new AccelerateInterpolator();
    public float[] e = {0.0f, 0.0f};
    public float[] f = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] i = {0.0f, 0.0f};
    public float[] j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f38269k = {Float.MAX_VALUE, Float.MAX_VALUE};

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38271b;
        public float c;
        public float d;
        public float j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f38272k;
        public long e = Long.MIN_VALUE;
        public long i = -1;
        public long f = 0;
        public int g = 0;
        public int h = 0;

        public void a() {
            if (this.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f;
            this.f = jCurrentAnimationTimeMillis;
            float f = j * fG;
            this.g = (int) (this.c * f);
            this.h = (int) (f * this.d);
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f = this.c;
            return (int) (f / Math.abs(f));
        }

        public final float e(long j) {
            long j2 = this.e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.i;
            if (j3 < 0 || j < j3) {
                return wr1.e((j - j2) / this.f38270a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.j;
            return (1.0f - f) + (f * wr1.e((j - j3) / this.f38272k, 0.0f, 1.0f));
        }

        public int f() {
            float f = this.d;
            return (int) (f / Math.abs(f));
        }

        public final float g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        public boolean h() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.f38272k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f38272k = wr1.f((int) (jCurrentAnimationTimeMillis - this.e), 0, this.f38271b);
            this.j = e(jCurrentAnimationTimeMillis);
            this.i = jCurrentAnimationTimeMillis;
        }

        public void j(int i) {
            this.f38271b = i;
        }

        public void k(int i) {
            this.f38270a = i;
        }

        public void l(float f, float f2) {
            this.c = f;
            this.d = f2;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = jCurrentAnimationTimeMillis;
            this.i = -1L;
            this.f = jCurrentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wr1 wr1Var = wr1.this;
            if (wr1Var.o) {
                if (wr1Var.m) {
                    wr1Var.m = false;
                    wr1Var.f38267a.m();
                }
                a aVar = wr1.this.f38267a;
                if (aVar.h() || !wr1.this.u()) {
                    wr1.this.o = false;
                    return;
                }
                wr1 wr1Var2 = wr1.this;
                if (wr1Var2.n) {
                    wr1Var2.n = false;
                    wr1Var2.c();
                }
                aVar.a();
                wr1.this.j(aVar.b(), aVar.c());
                c.i0(wr1.this.c, this);
            }
        }
    }

    public wr1(View view) {
        this.c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        p(f3, f3);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f38266r);
        r(500);
        q(500);
    }

    public static float e(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    public static int f(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    public abstract boolean a(int i);

    public abstract boolean b(int i);

    public void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i, float f, float f2, float f3) {
        float fH = h(this.e[i], f2, this.f[i], f);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f4 = this.i[i];
        float f5 = this.j[i];
        float f6 = this.f38269k[i];
        float f7 = f4 * f3;
        return fH > 0.0f ? e(fH * f7, f5, f6) : -e((-fH) * f7, f5, f6);
    }

    public final float g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.g;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public final float h(float f, float f2, float f3, float f4) {
        float interpolation;
        float fE = e(f * f2, 0.0f, f3);
        float fG = g(f2 - f4, fE) - g(f4, fE);
        if (fG < 0.0f) {
            interpolation = -this.f38268b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f38268b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.m) {
            this.o = false;
        } else {
            this.f38267a.i();
        }
    }

    public abstract void j(int i, int i2);

    public wr1 k(int i) {
        this.h = i;
        return this;
    }

    public wr1 l(int i) {
        this.g = i;
        return this;
    }

    public wr1 m(boolean z) {
        if (this.p && !z) {
            i();
        }
        this.p = z;
        return this;
    }

    public wr1 n(float f, float f2) {
        float[] fArr = this.f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public wr1 o(float f, float f2) {
        float[] fArr = this.f38269k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i();
                }
            }
            return this.q && this.o;
        }
        this.n = true;
        this.l = false;
        this.f38267a.l(d(0, motionEvent.getX(), view.getWidth(), this.c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.c.getHeight()));
        if (!this.o && u()) {
            v();
        }
        if (this.q) {
            return false;
        }
    }

    public wr1 p(float f, float f2) {
        float[] fArr = this.j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public wr1 q(int i) {
        this.f38267a.j(i);
        return this;
    }

    public wr1 r(int i) {
        this.f38267a.k(i);
        return this;
    }

    public wr1 s(float f, float f2) {
        float[] fArr = this.e;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public wr1 t(float f, float f2) {
        float[] fArr = this.i;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public boolean u() {
        a aVar = this.f38267a;
        int iF = aVar.f();
        int iD = aVar.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }

    public final void v() {
        int i;
        if (this.d == null) {
            this.d = new b();
        }
        this.o = true;
        this.m = true;
        if (this.l || (i = this.h) <= 0) {
            this.d.run();
        } else {
            c.j0(this.c, this.d, i);
        }
        this.l = true;
    }
}
