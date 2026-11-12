package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes14.dex */
public final class ScaleProvider implements VisibilityAnimatorProvider {
    private boolean growing;
    private float incomingEndScale;
    private float incomingStartScale;
    private float outgoingEndScale;
    private float outgoingStartScale;
    private boolean scaleOnDisappear;

    public ScaleProvider(boolean z14) {
        this.outgoingStartScale = 1.0f;
        this.outgoingEndScale = 1.1f;
        this.incomingStartScale = 0.8f;
        this.incomingEndScale = 1.0f;
        this.scaleOnDisappear = true;
        this.growing = z14;
    }

    private static Animator createScaleAnimator(final View view2, float f14, float f15) {
        final float scaleX = view2.getScaleX();
        final float scaleY = view2.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f14, scaleX * f15), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f14 * scaleY, f15 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.ScaleProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view2.setScaleX(scaleX);
                view2.setScaleY(scaleY);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    public Animator createAppear(ViewGroup viewGroup, View view2) {
        return this.growing ? createScaleAnimator(view2, this.incomingStartScale, this.incomingEndScale) : createScaleAnimator(view2, this.outgoingEndScale, this.outgoingStartScale);
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    public Animator createDisappear(ViewGroup viewGroup, View view2) {
        if (this.scaleOnDisappear) {
            return this.growing ? createScaleAnimator(view2, this.outgoingStartScale, this.outgoingEndScale) : createScaleAnimator(view2, this.incomingEndScale, this.incomingStartScale);
        }
        return null;
    }

    public float getIncomingEndScale() {
        return this.incomingEndScale;
    }

    public float getIncomingStartScale() {
        return this.incomingStartScale;
    }

    public float getOutgoingEndScale() {
        return this.outgoingEndScale;
    }

    public float getOutgoingStartScale() {
        return this.outgoingStartScale;
    }

    public boolean isGrowing() {
        return this.growing;
    }

    public boolean isScaleOnDisappear() {
        return this.scaleOnDisappear;
    }

    public void setGrowing(boolean z14) {
        this.growing = z14;
    }

    public void setIncomingEndScale(float f14) {
        this.incomingEndScale = f14;
    }

    public void setIncomingStartScale(float f14) {
        this.incomingStartScale = f14;
    }

    public void setOutgoingEndScale(float f14) {
        this.outgoingEndScale = f14;
    }

    public void setOutgoingStartScale(float f14) {
        this.outgoingStartScale = f14;
    }

    public void setScaleOnDisappear(boolean z14) {
        this.scaleOnDisappear = z14;
    }

    public ScaleProvider() {
        this(true);
    }
}
