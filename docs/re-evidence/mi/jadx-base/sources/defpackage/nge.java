package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class nge extends n7d<ObjectAnimator> {
    public static final Property<nge, Float> j = new b(Float.class, "animationFraction");
    public ObjectAnimator d;
    public ha9 e;
    public final fa2 f;
    public int g;
    public boolean h;
    public float i;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            nge ngeVar = nge.this;
            ngeVar.g = (ngeVar.g + 1) % nge.this.f.c.length;
            nge.this.h = true;
        }
    }

    public class b extends Property<nge, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(nge ngeVar) {
            return Float.valueOf(ngeVar.n());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(nge ngeVar, Float f) {
            ngeVar.r(f.floatValue());
        }
    }

    public nge(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.g = 1;
        this.f = linearProgressIndicatorSpec;
        this.e = new ha9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.i;
    }

    private void o() {
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, j, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new a());
        }
    }

    private void s(int i) {
        this.f27617b[0] = 0.0f;
        float fB = b(i, 0, 667);
        float[] fArr = this.f27617b;
        float interpolation = this.e.getInterpolation(fB);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f27617b;
        float interpolation2 = this.e.getInterpolation(fB + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f27617b[5] = 1.0f;
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
        q();
    }

    @Override // defpackage.n7d
    public void d(cb1 cb1Var) {
    }

    @Override // defpackage.n7d
    public void f() {
    }

    @Override // defpackage.n7d
    public void g() {
        o();
        q();
        this.d.start();
    }

    @Override // defpackage.n7d
    public void h() {
    }

    public final void p() {
        if (!this.h || this.f27617b[3] >= 1.0f) {
            return;
        }
        int[] iArr = this.c;
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        iArr[0] = i8f.a(this.f.c[this.g], this.f27616a.getAlpha());
        this.h = false;
    }

    @VisibleForTesting
    public void q() {
        this.h = true;
        this.g = 1;
        Arrays.fill(this.c, i8f.a(this.f.c[0], this.f27616a.getAlpha()));
    }

    @VisibleForTesting
    public void r(float f) {
        this.i = f;
        s((int) (f * 333.0f));
        p();
        this.f27616a.invalidateSelf();
    }
}
