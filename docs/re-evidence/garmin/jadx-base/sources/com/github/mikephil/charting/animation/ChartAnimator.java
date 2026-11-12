package com.github.mikephil.charting.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes13.dex */
public class ChartAnimator {
    private ValueAnimator.AnimatorUpdateListener mListener;
    protected float mPhaseY = 1.0f;
    protected float mPhaseX = 1.0f;

    public ChartAnimator(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.mListener = animatorUpdateListener;
    }

    private ObjectAnimator xAnimator(int i14, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.setDuration(i14);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator yAnimator(int i14, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.setDuration(i14);
        return objectAnimatorOfFloat;
    }

    public void animateX(int i14, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorXAnimator = xAnimator(i14, easingFunction);
        objectAnimatorXAnimator.addUpdateListener(this.mListener);
        objectAnimatorXAnimator.start();
    }

    public void animateXY(int i14, int i15, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorXAnimator = xAnimator(i14, easingFunction);
        ObjectAnimator objectAnimatorYAnimator = yAnimator(i15, easingFunction);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.mListener;
        if (i14 > i15) {
            objectAnimatorXAnimator.addUpdateListener(animatorUpdateListener);
        } else {
            objectAnimatorYAnimator.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorXAnimator.start();
        objectAnimatorYAnimator.start();
    }

    public void animateY(int i14, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorYAnimator = yAnimator(i14, easingFunction);
        objectAnimatorYAnimator.addUpdateListener(this.mListener);
        objectAnimatorYAnimator.start();
    }

    public float getPhaseX() {
        return this.mPhaseX;
    }

    public float getPhaseY() {
        return this.mPhaseY;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    public void setPhaseX(float f14) {
        float f15 = 1.0f;
        if (f14 > 1.0f) {
            f14 = f15;
        } else {
            f15 = 0.0f;
            if (f14 < 0.0f) {
                f14 = f15;
            }
        }
        this.mPhaseX = f14;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    public void setPhaseY(float f14) {
        float f15 = 1.0f;
        if (f14 > 1.0f) {
            f14 = f15;
        } else {
            f15 = 0.0f;
            if (f14 < 0.0f) {
                f14 = f15;
            }
        }
        this.mPhaseY = f14;
    }

    public ChartAnimator() {
    }

    public void animateX(int i14) {
        animateX(i14, Easing.Linear);
    }

    public void animateY(int i14) {
        animateY(i14, Easing.Linear);
    }

    public void animateXY(int i14, int i15) {
        Easing.EasingFunction easingFunction = Easing.Linear;
        animateXY(i14, i15, easingFunction, easingFunction);
    }

    public void animateXY(int i14, int i15, Easing.EasingFunction easingFunction, Easing.EasingFunction easingFunction2) {
        ObjectAnimator objectAnimatorXAnimator = xAnimator(i14, easingFunction);
        ObjectAnimator objectAnimatorYAnimator = yAnimator(i15, easingFunction2);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.mListener;
        if (i14 > i15) {
            objectAnimatorXAnimator.addUpdateListener(animatorUpdateListener);
        } else {
            objectAnimatorYAnimator.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorXAnimator.start();
        objectAnimatorYAnimator.start();
    }
}
