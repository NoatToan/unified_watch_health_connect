package com.github.mikephil.chartingv2.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class ChartAnimator {
    private ValueAnimator.AnimatorUpdateListener mListener;
    protected float mPhaseY = 1.0f;
    protected float mPhaseX = 1.0f;

    public ChartAnimator(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.mListener = animatorUpdateListener;
    }

    public void animateX(int i14, Easing.EasingOption easingOption) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(Easing.getEasingFunctionFromOption(easingOption));
        objectAnimatorOfFloat.setDuration(i14);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateXY(int i14, int i15, Easing.EasingOption easingOption, Easing.EasingOption easingOption2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(Easing.getEasingFunctionFromOption(easingOption2));
        objectAnimatorOfFloat.setDuration(i15);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(Easing.getEasingFunctionFromOption(easingOption));
        objectAnimatorOfFloat2.setDuration(i14);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.mListener;
        if (i14 > i15) {
            objectAnimatorOfFloat2.addUpdateListener(animatorUpdateListener);
        } else {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat2.start();
        objectAnimatorOfFloat.start();
    }

    public void animateY(int i14, Easing.EasingOption easingOption) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(Easing.getEasingFunctionFromOption(easingOption));
        objectAnimatorOfFloat.setDuration(i14);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public float getPhaseX() {
        return this.mPhaseX;
    }

    public float getPhaseY() {
        return this.mPhaseY;
    }

    public void setPhaseX(float f14) {
        this.mPhaseX = f14;
    }

    public void setPhaseY(float f14) {
        this.mPhaseY = f14;
    }

    public ChartAnimator() {
    }

    public void animateX(int i14, EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.setDuration(i14);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateY(int i14, EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.setDuration(i14);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateX(int i14) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(i14);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateY(int i14) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(i14);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateXY(int i14, int i15, EasingFunction easingFunction, EasingFunction easingFunction2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction2);
        objectAnimatorOfFloat.setDuration(i15);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(easingFunction);
        objectAnimatorOfFloat2.setDuration(i14);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.mListener;
        if (i14 > i15) {
            objectAnimatorOfFloat2.addUpdateListener(animatorUpdateListener);
        } else {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat2.start();
        objectAnimatorOfFloat.start();
    }

    public void animateXY(int i14, int i15) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(i15);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(i14);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.mListener;
        if (i14 > i15) {
            objectAnimatorOfFloat2.addUpdateListener(animatorUpdateListener);
        } else {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat2.start();
        objectAnimatorOfFloat.start();
    }
}
