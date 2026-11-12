package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    private final Listener listener;
    private final View[] views;

    public interface Listener {
        void onAnimationUpdate(ValueAnimator valueAnimator, View view2);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(Listener listener, Collection<View> collection) {
        this.listener = listener;
        this.views = (View[]) collection.toArray(new View[0]);
    }

    public static MultiViewUpdateListener alphaListener(View... viewArr) {
        return new MultiViewUpdateListener(new a(3), viewArr);
    }

    public static MultiViewUpdateListener scaleListener(View... viewArr) {
        return new MultiViewUpdateListener(new a(1), viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setAlpha(ValueAnimator valueAnimator, View view2) {
        view2.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setScale(ValueAnimator valueAnimator, View view2) {
        Float f14 = (Float) valueAnimator.getAnimatedValue();
        view2.setScaleX(f14.floatValue());
        view2.setScaleY(f14.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationX(ValueAnimator valueAnimator, View view2) {
        view2.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationY(ValueAnimator valueAnimator, View view2) {
        view2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static MultiViewUpdateListener translationXListener(View... viewArr) {
        return new MultiViewUpdateListener(new a(0), viewArr);
    }

    public static MultiViewUpdateListener translationYListener(View... viewArr) {
        return new MultiViewUpdateListener(new a(2), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view2 : this.views) {
            this.listener.onAnimationUpdate(valueAnimator, view2);
        }
    }

    public static MultiViewUpdateListener alphaListener(Collection<View> collection) {
        return new MultiViewUpdateListener(new a(3), collection);
    }

    public static MultiViewUpdateListener scaleListener(Collection<View> collection) {
        return new MultiViewUpdateListener(new a(1), collection);
    }

    public static MultiViewUpdateListener translationXListener(Collection<View> collection) {
        return new MultiViewUpdateListener(new a(0), collection);
    }

    public static MultiViewUpdateListener translationYListener(Collection<View> collection) {
        return new MultiViewUpdateListener(new a(2), collection);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(Listener listener, View... viewArr) {
        this.listener = listener;
        this.views = viewArr;
    }
}
