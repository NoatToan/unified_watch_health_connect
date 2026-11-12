package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.VisibleForTesting;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class uw3 extends n7d<ObjectAnimator> {
    public static final int[] l = {0, 1350, 2700, 4050};
    public static final int[] m = {667, GLMapStaticValue.AM_PARAMETERNAME_SHOW_BUILDING_MARK, 3367, 4717};
    public static final int[] n = {1000, 2350, 3700, 5050};
    public static final Property<uw3, Float> o = new c(Float.class, "animationFraction");
    public static final Property<uw3, Float> p = new d(Float.class, "completeEndFraction");
    public ObjectAnimator d;
    public ObjectAnimator e;
    public final ha9 f;
    public final fa2 g;
    public int h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public cb1 f36203k;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            uw3 uw3Var = uw3.this;
            uw3Var.h = (uw3Var.h + 4) % uw3.this.g.c.length;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            uw3.this.a();
            uw3 uw3Var = uw3.this;
            cb1 cb1Var = uw3Var.f36203k;
            if (cb1Var != null) {
                cb1Var.onAnimationEnd(uw3Var.f27616a);
            }
        }
    }

    public class c extends Property<uw3, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(uw3 uw3Var) {
            return Float.valueOf(uw3Var.o());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(uw3 uw3Var, Float f) {
            uw3Var.t(f.floatValue());
        }
    }

    public class d extends Property<uw3, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(uw3 uw3Var) {
            return Float.valueOf(uw3Var.p());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(uw3 uw3Var, Float f) {
            uw3Var.u(f.floatValue());
        }
    }

    public uw3(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.h = 0;
        this.f36203k = null;
        this.g = circularProgressIndicatorSpec;
        this.f = new ha9();
    }

    @Override // defpackage.n7d
    public void a() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.n7d
    public void c() {
        s();
    }

    @Override // defpackage.n7d
    public void d(cb1 cb1Var) {
        this.f36203k = cb1Var;
    }

    @Override // defpackage.n7d
    public void f() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f27616a.isVisible()) {
            this.e.start();
        } else {
            a();
        }
    }

    @Override // defpackage.n7d
    public void g() {
        q();
        s();
        this.d.start();
    }

    @Override // defpackage.n7d
    public void h() {
        this.f36203k = null;
    }

    public final float o() {
        return this.i;
    }

    public final float p() {
        return this.j;
    }

    public final void q() {
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new a());
        }
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, p, 0.0f, 1.0f);
            this.e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.e.setInterpolator(this.f);
            this.e.addListener(new b());
        }
    }

    public final void r(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float fB = b(i, n[i2], 333);
            if (fB >= 0.0f && fB <= 1.0f) {
                int i3 = i2 + this.h;
                int[] iArr = this.g.c;
                int length = i3 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                this.c[0] = fj1.b().evaluate(this.f.getInterpolation(fB), Integer.valueOf(i8f.a(iArr[length], this.f27616a.getAlpha())), Integer.valueOf(i8f.a(this.g.c[length2], this.f27616a.getAlpha()))).intValue();
                return;
            }
        }
    }

    @VisibleForTesting
    public void s() {
        this.h = 0;
        this.c[0] = i8f.a(this.g.c[0], this.f27616a.getAlpha());
        this.j = 0.0f;
    }

    @VisibleForTesting
    public void t(float f) {
        this.i = f;
        int i = (int) (f * 5400.0f);
        v(i);
        r(i);
        this.f27616a.invalidateSelf();
    }

    public final void u(float f) {
        this.j = f;
    }

    public final void v(int i) {
        float[] fArr = this.f27617b;
        float f = this.i;
        fArr[0] = (f * 1520.0f) - 20.0f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float fB = b(i, l[i2], 667);
            float[] fArr2 = this.f27617b;
            fArr2[1] = fArr2[1] + (this.f.getInterpolation(fB) * 250.0f);
            float fB2 = b(i, m[i2], 667);
            float[] fArr3 = this.f27617b;
            fArr3[0] = fArr3[0] + (this.f.getInterpolation(fB2) * 250.0f);
        }
        float[] fArr4 = this.f27617b;
        float f2 = fArr4[0];
        float f3 = fArr4[1];
        float f4 = f2 + ((f3 - f2) * this.j);
        fArr4[0] = f4;
        fArr4[0] = f4 / 360.0f;
        fArr4[1] = f3 / 360.0f;
    }
}
