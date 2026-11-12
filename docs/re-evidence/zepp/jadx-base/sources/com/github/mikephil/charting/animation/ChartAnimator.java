package com.github.mikephil.charting.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public class ChartAnimator {
    private ValueAnimator.AnimatorUpdateListener a;
    public float mPhaseY = 1.0f;
    public float mPhaseX = 1.0f;

    public ChartAnimator() {
    }

    @RequiresApi(11)
    private ObjectAnimator a(int i, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.setDuration(i);
        return objectAnimatorOfFloat;
    }

    @RequiresApi(11)
    private ObjectAnimator b(int i, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.setDuration(i);
        return objectAnimatorOfFloat;
    }

    @RequiresApi(11)
    public void animateX(int i) {
        animateX(i, Easing.Linear);
    }

    @RequiresApi(11)
    public void animateXY(int i, int i2) {
        Easing.EasingFunction easingFunction = Easing.Linear;
        animateXY(i, i2, easingFunction, easingFunction);
    }

    @RequiresApi(11)
    public void animateY(int i) {
        animateY(i, Easing.Linear);
    }

    public float getPhaseX() {
        return this.mPhaseX;
    }

    public float getPhaseY() {
        return this.mPhaseY;
    }

    public void setPhaseX(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.mPhaseX = f;
    }

    public void setPhaseY(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.mPhaseY = f;
    }

    @RequiresApi(11)
    public void animateX(int i, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorA = a(i, easingFunction);
        objectAnimatorA.addUpdateListener(this.a);
        objectAnimatorA.start();
    }

    @RequiresApi(11)
    public void animateXY(int i, int i2, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorA = a(i, easingFunction);
        ObjectAnimator objectAnimatorB = b(i2, easingFunction);
        if (i > i2) {
            objectAnimatorA.addUpdateListener(this.a);
        } else {
            objectAnimatorB.addUpdateListener(this.a);
        }
        objectAnimatorA.start();
        objectAnimatorB.start();
    }

    @RequiresApi(11)
    public void animateY(int i, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorB = b(i, easingFunction);
        objectAnimatorB.addUpdateListener(this.a);
        objectAnimatorB.start();
    }

    @RequiresApi(11)
    public ChartAnimator(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a = animatorUpdateListener;
    }

    @RequiresApi(11)
    public void animateXY(int i, int i2, Easing.EasingFunction easingFunction, Easing.EasingFunction easingFunction2) {
        ObjectAnimator objectAnimatorA = a(i, easingFunction);
        ObjectAnimator objectAnimatorB = b(i2, easingFunction2);
        if (i > i2) {
            objectAnimatorA.addUpdateListener(this.a);
        } else {
            objectAnimatorB.addUpdateListener(this.a);
        }
        objectAnimatorA.start();
        objectAnimatorB.start();
    }
}
