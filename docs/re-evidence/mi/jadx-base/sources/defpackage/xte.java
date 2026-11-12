package defpackage;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class xte extends w82 implements Choreographer.FrameCallback {
    public lse l;
    public float d = 1.0f;
    public boolean e = false;
    public long f = 0;
    public float g = 0.0f;
    public float h = 0.0f;
    public int i = 0;
    public float j = -2.14748365E9f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f39457k = 2.14748365E9f;

    @VisibleForTesting
    public boolean m = false;
    public boolean n = false;

    public void A(float f) {
        if (this.g == f) {
            return;
        }
        float fB = d5g.b(f, p(), n());
        this.g = fB;
        if (this.n) {
            fB = (float) Math.floor(fB);
        }
        this.h = fB;
        this.f = 0L;
        g();
    }

    public void B(float f) {
        C(this.j, f);
    }

    public void C(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        lse lseVar = this.l;
        float fP = lseVar == null ? -3.4028235E38f : lseVar.p();
        lse lseVar2 = this.l;
        float f3 = lseVar2 == null ? Float.MAX_VALUE : lseVar2.f();
        float fB = d5g.b(f, fP, f3);
        float fB2 = d5g.b(f2, fP, f3);
        if (fB == this.j && fB2 == this.f39457k) {
            return;
        }
        this.j = fB;
        this.f39457k = fB2;
        A((int) d5g.b(this.h, fB, fB2));
    }

    public void D(int i) {
        C(i, (int) this.f39457k);
    }

    public void F(float f) {
        this.d = f;
    }

    public void G(boolean z) {
        this.n = z;
    }

    public final void H() {
        if (this.l == null) {
            return;
        }
        float f = this.h;
        if (f < this.j || f > this.f39457k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.j), Float.valueOf(this.f39457k), Float.valueOf(this.h)));
        }
    }

    @Override // defpackage.w82
    public void a() {
        super.a();
        b(r());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        v();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        u();
        if (this.l == null || !isRunning()) {
            return;
        }
        w1e.a("LottieValueAnimator#doFrame");
        long j2 = this.f;
        float fL = (j2 != 0 ? j - j2 : 0L) / l();
        float f = this.g;
        if (r()) {
            fL = -fL;
        }
        float f2 = f + fL;
        boolean z = !d5g.d(f2, p(), n());
        float f3 = this.g;
        float fB = d5g.b(f2, p(), n());
        this.g = fB;
        if (this.n) {
            fB = (float) Math.floor(fB);
        }
        this.h = fB;
        this.f = j;
        if (!this.n || this.g != f3) {
            g();
        }
        if (z) {
            if (getRepeatCount() == -1 || this.i < getRepeatCount()) {
                d();
                this.i++;
                if (getRepeatMode() == 2) {
                    this.e = !this.e;
                    y();
                } else {
                    float fN = r() ? n() : p();
                    this.g = fN;
                    this.h = fN;
                }
                this.f = j;
            } else {
                float fP = this.d < 0.0f ? p() : n();
                this.g = fP;
                this.h = fP;
                v();
                b(r());
            }
        }
        H();
        w1e.b("LottieValueAnimator#doFrame");
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float fP;
        float fN;
        float fP2;
        if (this.l == null) {
            return 0.0f;
        }
        if (r()) {
            fP = n() - this.h;
            fN = n();
            fP2 = p();
        } else {
            fP = this.h - p();
            fN = n();
            fP2 = p();
        }
        return fP / (fN - fP2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(j());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        lse lseVar = this.l;
        if (lseVar == null) {
            return 0L;
        }
        return (long) lseVar.d();
    }

    public void h() {
        this.l = null;
        this.j = -2.14748365E9f;
        this.f39457k = 2.14748365E9f;
    }

    public void i() {
        v();
        b(r());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.m;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float j() {
        lse lseVar = this.l;
        if (lseVar == null) {
            return 0.0f;
        }
        return (this.h - lseVar.p()) / (this.l.f() - this.l.p());
    }

    public float k() {
        return this.h;
    }

    public final float l() {
        lse lseVar = this.l;
        if (lseVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / lseVar.i()) / Math.abs(this.d);
    }

    public float n() {
        lse lseVar = this.l;
        if (lseVar == null) {
            return 0.0f;
        }
        float f = this.f39457k;
        return f == 2.14748365E9f ? lseVar.f() : f;
    }

    public float p() {
        lse lseVar = this.l;
        if (lseVar == null) {
            return 0.0f;
        }
        float f = this.j;
        return f == -2.14748365E9f ? lseVar.p() : f;
    }

    public float q() {
        return this.d;
    }

    public final boolean r() {
        return q() < 0.0f;
    }

    public void s() {
        v();
        c();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        y();
    }

    public void t() {
        this.m = true;
        f(r());
        A((int) (r() ? n() : p()));
        this.f = 0L;
        this.i = 0;
        u();
    }

    public void u() {
        if (isRunning()) {
            w(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void v() {
        w(true);
    }

    public void w(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.m = false;
        }
    }

    public void x() {
        this.m = true;
        u();
        this.f = 0L;
        if (r() && k() == p()) {
            A(n());
        } else if (!r() && k() == n()) {
            A(p());
        }
        e();
    }

    public void y() {
        F(-q());
    }

    public void z(lse lseVar) {
        boolean z = this.l == null;
        this.l = lseVar;
        if (z) {
            C(Math.max(this.j, lseVar.p()), Math.min(this.f39457k, lseVar.f()));
        } else {
            C((int) lseVar.p(), (int) lseVar.f());
        }
        float f = this.h;
        this.h = 0.0f;
        this.g = 0.0f;
        A((int) f);
        g();
    }
}
