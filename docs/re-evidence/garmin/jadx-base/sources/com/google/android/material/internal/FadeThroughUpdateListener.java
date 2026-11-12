package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes14.dex */
public class FadeThroughUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    private final float[] alphas = new float[2];
    private final View fadeInView;
    private final View fadeOutView;

    public FadeThroughUpdateListener(View view2, View view3) {
        this.fadeOutView = view2;
        this.fadeInView = view3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        FadeThroughUtils.calculateFadeOutAndInAlphas(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.alphas);
        View view2 = this.fadeOutView;
        if (view2 != null) {
            view2.setAlpha(this.alphas[0]);
        }
        View view3 = this.fadeInView;
        if (view3 != null) {
            view3.setAlpha(this.alphas[1]);
        }
    }
}
