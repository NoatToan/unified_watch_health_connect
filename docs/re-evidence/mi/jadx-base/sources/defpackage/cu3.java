package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes4.dex */
public class cu3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f14715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14716b = 1.0f;
    public float c = 1.0f;

    @RequiresApi(11)
    public cu3(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f14715a = animatorUpdateListener;
    }

    @RequiresApi(11)
    public void a(int i) {
        b(i, ca7.f5115a);
    }

    @RequiresApi(11)
    public void b(int i, ca7.c0 c0Var) {
        ObjectAnimator objectAnimatorJ = j(i, c0Var);
        objectAnimatorJ.addUpdateListener(this.f14715a);
        objectAnimatorJ.start();
    }

    @RequiresApi(11)
    public void c(int i, int i2) {
        ca7.c0 c0Var = ca7.f5115a;
        e(i, i2, c0Var, c0Var);
    }

    @RequiresApi(11)
    public void d(int i, int i2, ca7.c0 c0Var) {
        ObjectAnimator objectAnimatorJ = j(i, c0Var);
        ObjectAnimator objectAnimatorK = k(i2, c0Var);
        if (i > i2) {
            objectAnimatorJ.addUpdateListener(this.f14715a);
        } else {
            objectAnimatorK.addUpdateListener(this.f14715a);
        }
        objectAnimatorJ.start();
        objectAnimatorK.start();
    }

    @RequiresApi(11)
    public void e(int i, int i2, ca7.c0 c0Var, ca7.c0 c0Var2) {
        ObjectAnimator objectAnimatorJ = j(i, c0Var);
        ObjectAnimator objectAnimatorK = k(i2, c0Var2);
        if (i > i2) {
            objectAnimatorJ.addUpdateListener(this.f14715a);
        } else {
            objectAnimatorK.addUpdateListener(this.f14715a);
        }
        objectAnimatorJ.start();
        objectAnimatorK.start();
    }

    @RequiresApi(11)
    public void f(int i) {
        g(i, ca7.f5115a);
    }

    @RequiresApi(11)
    public void g(int i, ca7.c0 c0Var) {
        ObjectAnimator objectAnimatorK = k(i, c0Var);
        objectAnimatorK.addUpdateListener(this.f14715a);
        objectAnimatorK.start();
    }

    public float h() {
        return this.c;
    }

    public float i() {
        return this.f14716b;
    }

    @RequiresApi(11)
    public final ObjectAnimator j(int i, ca7.c0 c0Var) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(c0Var);
        objectAnimatorOfFloat.setDuration(i);
        return objectAnimatorOfFloat;
    }

    @RequiresApi(11)
    public final ObjectAnimator k(int i, ca7.c0 c0Var) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(c0Var);
        objectAnimatorOfFloat.setDuration(i);
        return objectAnimatorOfFloat;
    }
}
