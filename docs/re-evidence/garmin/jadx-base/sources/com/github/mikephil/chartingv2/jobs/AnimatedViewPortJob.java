package com.github.mikephil.chartingv2.jobs;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"NewApi"})
@Deprecated
public abstract class AnimatedViewPortJob extends ViewPortJob implements ValueAnimator.AnimatorUpdateListener {
    protected ObjectAnimator animator;
    protected float phase;
    protected float xOrigin;
    protected float yOrigin;

    public AnimatedViewPortJob(ViewPortHandler viewPortHandler, float f14, float f15, Transformer transformer, View view2, float f16, float f17, long j8) {
        super(viewPortHandler, f14, f15, transformer, view2);
        this.xOrigin = f16;
        this.yOrigin = f17;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phase", 0.0f, 1.0f);
        this.animator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(j8);
        this.animator.addUpdateListener(this);
    }

    public float getPhase() {
        return this.phase;
    }

    public float getXOrigin() {
        return this.xOrigin;
    }

    public float getYOrigin() {
        return this.yOrigin;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"NewApi"})
    public void run() {
        this.animator.start();
    }

    public void setPhase(float f14) {
        this.phase = f14;
    }
}
