package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.e1;
import com.google.android.material.animation.AnimationUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class ExpandCollapseAnimationHelper {
    private ValueAnimator.AnimatorUpdateListener additionalUpdateListener;
    private final View collapsedView;
    private int collapsedViewOffsetY;
    private long duration;
    private final View expandedView;
    private int expandedViewOffsetY;
    private final List<AnimatorListenerAdapter> listeners = new ArrayList();
    private final List<View> endAnchoredViews = new ArrayList();

    public ExpandCollapseAnimationHelper(View view2, View view3) {
        this.collapsedView = view2;
        this.expandedView = view3;
    }

    private void addListeners(Animator animator, List<AnimatorListenerAdapter> list) {
        Iterator<AnimatorListenerAdapter> it = list.iterator();
        while (it.hasNext()) {
            animator.addListener(it.next());
        }
    }

    private AnimatorSet getAnimatorSet(boolean z14) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getExpandCollapseAnimator(z14), getExpandedViewChildrenAlphaAnimator(z14), getEndAnchoredViewsTranslateAnimator(z14));
        return animatorSet;
    }

    private Animator getEndAnchoredViewsTranslateAnimator(boolean z14) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.collapsedView.getRight() - this.expandedView.getRight()) + (this.expandedView.getLeft() - this.collapsedView.getLeft()), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(this.endAnchoredViews));
        valueAnimatorOfFloat.setDuration(this.duration);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z14, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return valueAnimatorOfFloat;
    }

    private Animator getExpandCollapseAnimator(boolean z14) {
        Rect rectCalculateRectFromBounds = ViewUtils.calculateRectFromBounds(this.collapsedView, this.collapsedViewOffsetY);
        Rect rectCalculateRectFromBounds2 = ViewUtils.calculateRectFromBounds(this.expandedView, this.expandedViewOffsetY);
        Rect rect = new Rect(rectCalculateRectFromBounds);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(rect), rectCalculateRectFromBounds, rectCalculateRectFromBounds2);
        valueAnimatorOfObject.addUpdateListener(new e1(2, this, rect));
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.additionalUpdateListener;
        if (animatorUpdateListener != null) {
            valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
        }
        valueAnimatorOfObject.setDuration(this.duration);
        valueAnimatorOfObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z14, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return valueAnimatorOfObject;
    }

    private Animator getExpandedViewChildrenAlphaAnimator(boolean z14) {
        List<View> children = ViewUtils.getChildren(this.expandedView);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(children));
        valueAnimatorOfFloat.setDuration(this.duration);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z14, AnimationUtils.LINEAR_INTERPOLATOR));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getExpandCollapseAnimator$0(Rect rect, ValueAnimator valueAnimator) {
        ViewUtils.setBoundsFromRect(this.expandedView, rect);
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(View... viewArr) {
        Collections.addAll(this.endAnchoredViews, viewArr);
        return this;
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.listeners.add(animatorListenerAdapter);
        return this;
    }

    public Animator getCollapseAnimator() {
        AnimatorSet animatorSet = getAnimatorSet(false);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExpandCollapseAnimationHelper.this.expandedView.setVisibility(8);
            }
        });
        addListeners(animatorSet, this.listeners);
        return animatorSet;
    }

    public Animator getExpandAnimator() {
        AnimatorSet animatorSet = getAnimatorSet(true);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ExpandCollapseAnimationHelper.this.expandedView.setVisibility(0);
            }
        });
        addListeners(animatorSet, this.listeners);
        return animatorSet;
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setAdditionalUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.additionalUpdateListener = animatorUpdateListener;
        return this;
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int i14) {
        this.collapsedViewOffsetY = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setDuration(long j8) {
        this.duration = j8;
        return this;
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setExpandedViewOffsetY(int i14) {
        this.expandedViewOffsetY = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(Collection<View> collection) {
        this.endAnchoredViews.addAll(collection);
        return this;
    }
}
