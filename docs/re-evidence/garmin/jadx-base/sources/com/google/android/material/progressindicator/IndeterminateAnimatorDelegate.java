package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
abstract class IndeterminateAnimatorDelegate<T extends Animator> {
    protected final List<DrawingDelegate.ActiveIndicator> activeIndicators = new ArrayList();
    protected IndeterminateDrawable drawable;

    public IndeterminateAnimatorDelegate(int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            this.activeIndicators.add(new DrawingDelegate.ActiveIndicator());
        }
    }

    public abstract void cancelAnimatorImmediately();

    public float getFractionInRange(int i14, int i15, int i16) {
        return (i14 - i15) / i16;
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(b bVar);

    public void registerDrawable(IndeterminateDrawable indeterminateDrawable) {
        this.drawable = indeterminateDrawable;
    }

    public abstract void requestCancelAnimatorAfterCurrentCycle();

    public abstract void resetPropertiesForNewStart();

    public abstract void setAnimationFraction(float f14);

    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
