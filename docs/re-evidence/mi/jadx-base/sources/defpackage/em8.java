package defpackage;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes10.dex */
public class em8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f16803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16804b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    public interface a {
        boolean a();

        void b(int i, int i2, int i3, int i4, int i5);

        void c();

        int d();

        int e();

        boolean f();
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Scroller f16805a;

        public b(Context context, Interpolator interpolator) {
            this.f16805a = new Scroller(context, interpolator);
        }

        @Override // em8.a
        public boolean a() {
            return this.f16805a.isFinished();
        }

        @Override // em8.a
        public void b(int i, int i2, int i3, int i4, int i5) {
            this.f16805a.startScroll(i, i2, i3, i4, i5);
        }

        @Override // em8.a
        public void c() {
            this.f16805a.abortAnimation();
        }

        @Override // em8.a
        public int d() {
            return this.f16805a.getCurrX();
        }

        @Override // em8.a
        public int e() {
            return this.f16805a.getCurrY();
        }

        @Override // em8.a
        public boolean f() {
            return this.f16805a.computeScrollOffset();
        }
    }

    public em8(Context context) {
        this(context, null);
    }

    public static int b(int i, int i2, int i3, int i4, int i5) {
        int iAbs = Math.abs(i4);
        int iAbs2 = Math.abs(i5);
        int iAbs3 = Math.abs(i3);
        if (iAbs3 == 0) {
            return iAbs2;
        }
        if (iAbs2 > iAbs) {
            throw new IllegalArgumentException();
        }
        float fSqrt = (float) Math.sqrt(Math.abs(i * i) + Math.abs(i2 * i2));
        if (fSqrt == 0.0f) {
            return 0;
        }
        float f = iAbs2;
        return Math.min((int) (((fSqrt / iAbs3) * f) + f), iAbs);
    }

    public final boolean a() {
        this.f16803a.c();
        return n(true);
    }

    public final boolean c() {
        int i;
        boolean zF = this.f16803a.f();
        int iD = this.f16803a.d();
        int iE = this.f16803a.e();
        if (zF && (iD != (i = this.e) || iE != this.f)) {
            e(i, this.f, iD, iE);
        }
        this.e = iD;
        this.f = iE;
        m();
        return zF;
    }

    public final boolean d() {
        return this.g;
    }

    public void e(int i, int i2, int i3, int i4) {
    }

    public void f(boolean z) {
    }

    public void g() {
    }

    public final boolean h(int i, int i2, int i3, int i4, int i5) {
        boolean z = (i3 == 0 && i4 == 0) ? false : true;
        if (z) {
            this.e = i;
            this.f = i2;
            if (i5 < 0) {
                i5 = b(i3, i4, this.f16804b, this.c, this.d);
            }
            this.f16803a.b(i, i2, i3, i4, i5);
            m();
        }
        return z;
    }

    public final boolean i(int i, int i2, int i3, int i4, int i5) {
        return h(i, i2, i3 - i, i4 - i2, i5);
    }

    public final boolean j(int i, int i2, int i3) {
        return i(i, 0, i2, 0, i3);
    }

    public final void k(int i) {
        this.f16804b = i;
    }

    public void l(a aVar) {
        aVar.getClass();
        this.f16803a = aVar;
    }

    public final void m() {
        n(false);
    }

    public final boolean n(boolean z) {
        boolean zA = this.f16803a.a();
        if (this.g == zA) {
            return false;
        }
        this.g = zA;
        if (zA) {
            f(z);
            return true;
        }
        g();
        return true;
    }

    public em8(Context context, Interpolator interpolator) {
        this(new b(context, interpolator));
    }

    public em8(a aVar) {
        this.c = 400;
        this.d = 200;
        this.g = true;
        l(aVar);
    }
}
