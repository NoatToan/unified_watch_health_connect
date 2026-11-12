package defpackage;

import android.view.Choreographer;
import com.airbnb.lottie.utils.BaseLottieAnimator;

/* JADX INFO: loaded from: classes21.dex */
public class jd extends BaseLottieAnimator implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private cx f38396c;
    private float f = 1.0f;
    private boolean j = false;
    private long e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f38394a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38395b = 0.0f;
    private int h = 0;
    private float i = -2.1474836E9f;
    private float g = 2.1474836E9f;
    protected boolean d = false;
    private boolean m = false;

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    public float a() {
        cx cxVar = this.f38396c;
        if (cxVar == null) {
            return 0.0f;
        }
        return (this.f38395b - cxVar.l()) / (this.f38396c.b() - this.f38396c.l());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fH;
        float fE;
        float fH2;
        if (this.f38396c == null) {
            return 0.0f;
        }
        if (k()) {
            fH = e() - this.f38395b;
            fE = e();
            fH2 = h();
        } else {
            fH = this.f38395b - h();
            fE = e();
            fH2 = h();
        }
        return fH / (fE - fH2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        cx cxVar = this.f38396c;
        if (cxVar == null) {
            return 0L;
        }
        return (long) cxVar.e();
    }

    public float b() {
        return this.f38395b;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.d;
    }

    public void d(boolean z) {
        this.m = z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        j();
        if (this.f38396c == null || !isRunning()) {
            return;
        }
        if (cv.e()) {
            cv.c("LottieValueAnimator#doFrame");
        }
        long j2 = this.e;
        float fL = (j2 != 0 ? j - j2 : 0L) / l();
        float f = this.f38394a;
        if (k()) {
            fL = -fL;
        }
        float f2 = f + fL;
        boolean zD = jc.d(f2, h(), e());
        float f3 = this.f38394a;
        float fB = jc.b(f2, h(), e());
        this.f38394a = fB;
        if (this.m) {
            fB = (float) Math.floor(fB);
        }
        this.f38395b = fB;
        this.e = j;
        if (!this.m || this.f38394a != f3) {
            notifyUpdate();
        }
        if (!zD) {
            if (getRepeatCount() != -1 && this.h >= getRepeatCount()) {
                float fH = this.f < 0.0f ? h() : e();
                this.f38394a = fH;
                this.f38395b = fH;
                n();
                notifyEnd(k());
            } else {
                notifyRepeat();
                this.h++;
                if (getRepeatMode() == 2) {
                    this.j = !this.j;
                    m();
                } else {
                    float fE = k() ? e() : h();
                    this.f38394a = fE;
                    this.f38395b = fE;
                }
                this.e = j;
            }
        }
        s();
        if (cv.e()) {
            cv.e("LottieValueAnimator#doFrame");
        }
    }

    private float l() {
        cx cxVar = this.f38396c;
        if (cxVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / cxVar.f()) / Math.abs(this.f);
    }

    public void d() {
        this.f38396c = null;
        this.i = -2.1474836E9f;
        this.g = 2.1474836E9f;
    }

    public void a(cx cxVar) {
        boolean z = this.f38396c == null;
        this.f38396c = cxVar;
        if (z) {
            c(Math.max(this.i, cxVar.l()), Math.min(this.g, cxVar.b()));
        } else {
            c((int) cxVar.l(), (int) cxVar.b());
        }
        float f = this.f38395b;
        this.f38395b = 0.0f;
        this.f38394a = 0.0f;
        e((int) f);
        notifyUpdate();
    }

    public void e(float f) {
        if (this.f38394a == f) {
            return;
        }
        float fB = jc.b(f, h(), e());
        this.f38394a = fB;
        if (this.m) {
            fB = (float) Math.floor(fB);
        }
        this.f38395b = fB;
        this.e = 0L;
        notifyUpdate();
    }

    public void d(int i) {
        c(i, (int) this.g);
    }

    public void b(float f) {
        c(this.i, f);
    }

    public void c(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        cx cxVar = this.f38396c;
        float fL = cxVar == null ? -3.4028235E38f : cxVar.l();
        cx cxVar2 = this.f38396c;
        float fB = cxVar2 == null ? Float.MAX_VALUE : cxVar2.b();
        float fB2 = jc.b(f, fL, fB);
        float fB3 = jc.b(f2, fL, fB);
        if (fB2 == this.i && fB3 == this.g) {
            return;
        }
        this.i = fB2;
        this.g = fB3;
        e((int) jc.b(this.f38395b, fB2, fB3));
    }

    public void m() {
        a(-i());
    }

    public void a(float f) {
        this.f = f;
    }

    public float i() {
        return this.f;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.j) {
            return;
        }
        this.j = false;
        m();
    }

    public void f() {
        this.d = true;
        notifyStart(k());
        e((int) (k() ? e() : h()));
        this.e = 0L;
        this.h = 0;
        j();
    }

    public void c() {
        n();
        notifyEnd(k());
    }

    public void g() {
        n();
        notifyPause();
    }

    public void o() {
        this.d = true;
        j();
        this.e = 0L;
        if (k() && b() == h()) {
            e(e());
        } else if (!k() && b() == e()) {
            e(h());
        }
        notifyResume();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        notifyCancel();
        n();
    }

    private boolean k() {
        return i() < 0.0f;
    }

    public float h() {
        cx cxVar = this.f38396c;
        if (cxVar == null) {
            return 0.0f;
        }
        float f = this.i;
        return f == -2.1474836E9f ? cxVar.l() : f;
    }

    public float e() {
        cx cxVar = this.f38396c;
        if (cxVar == null) {
            return 0.0f;
        }
        float f = this.g;
        return f == 2.1474836E9f ? cxVar.b() : f;
    }

    @Override // com.airbnb.lottie.utils.BaseLottieAnimator
    public void notifyCancel() {
        super.notifyCancel();
        notifyEnd(k());
    }

    protected void j() {
        if (isRunning()) {
            a(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void n() {
        a(true);
    }

    protected void a(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.d = false;
        }
    }

    private void s() {
        if (this.f38396c == null) {
            return;
        }
        float f = this.f38395b;
        float f2 = this.i;
        if (f < f2 || f > this.g) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f2), Float.valueOf(this.g), Float.valueOf(f)));
        }
    }
}
