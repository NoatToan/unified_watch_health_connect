package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import b.c;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes14.dex */
public class MaterialMainContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private static final float MIN_SCALE = 0.9f;
    private Integer expandedCornerSize;
    private Rect initialHideFromClipBounds;
    private Rect initialHideToClipBounds;
    private float initialTouchY;
    private final float maxTranslationY;
    private final float minEdgeGap;

    public MaterialMainContainerBackHelper(View view2) {
        super(view2);
        Resources resources = view2.getResources();
        this.minEdgeGap = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.maxTranslationY = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    private ValueAnimator createCornerAnimator(ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getCornerRadius(), getExpandedCornerSize());
        valueAnimatorOfFloat.addUpdateListener(new a(clippableRoundedCornerLayout, 0));
        return valueAnimatorOfFloat;
    }

    private AnimatorSet createResetScaleAndTranslationAnimator(final View view2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f53211view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f53211view, (Property<V, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f53211view, (Property<V, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f53211view, (Property<V, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialMainContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View view3 = view2;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    private int getMaxDeviceCornerRadius() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.f53211view.getRootWindowInsets()) == null) {
            return 0;
        }
        return Math.max(Math.max(getRoundedCornerRadius(rootWindowInsets, 0), getRoundedCornerRadius(rootWindowInsets, 1)), Math.max(getRoundedCornerRadius(rootWindowInsets, 3), getRoundedCornerRadius(rootWindowInsets, 2)));
    }

    private int getRoundedCornerRadius(WindowInsets windowInsets, int i14) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i14);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private boolean isAtTopOfScreen() {
        int[] iArr = new int[2];
        this.f53211view.getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createCornerAnimator$0(ClippableRoundedCornerLayout clippableRoundedCornerLayout, ValueAnimator valueAnimator) {
        clippableRoundedCornerLayout.updateCornerRadius(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void resetInitialValues() {
        this.initialTouchY = 0.0f;
        this.initialHideToClipBounds = null;
        this.initialHideFromClipBounds = null;
    }

    public void cancelBackProgress(View view2) {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSetCreateResetScaleAndTranslationAnimator = createResetScaleAndTranslationAnimator(view2);
        V v14 = this.f53211view;
        if (v14 instanceof ClippableRoundedCornerLayout) {
            animatorSetCreateResetScaleAndTranslationAnimator.playTogether(createCornerAnimator((ClippableRoundedCornerLayout) v14));
        }
        animatorSetCreateResetScaleAndTranslationAnimator.setDuration(this.cancelDuration);
        animatorSetCreateResetScaleAndTranslationAnimator.start();
        resetInitialValues();
    }

    public void finishBackProgress(long j8, View view2) {
        AnimatorSet animatorSetCreateResetScaleAndTranslationAnimator = createResetScaleAndTranslationAnimator(view2);
        animatorSetCreateResetScaleAndTranslationAnimator.setDuration(j8);
        animatorSetCreateResetScaleAndTranslationAnimator.start();
        resetInitialValues();
    }

    public int getExpandedCornerSize() {
        if (this.expandedCornerSize == null) {
            this.expandedCornerSize = Integer.valueOf(isAtTopOfScreen() ? getMaxDeviceCornerRadius() : 0);
        }
        return this.expandedCornerSize.intValue();
    }

    public Rect getInitialHideFromClipBounds() {
        return this.initialHideFromClipBounds;
    }

    public Rect getInitialHideToClipBounds() {
        return this.initialHideToClipBounds;
    }

    public void startBackProgress(float f14, View view2) {
        this.initialHideToClipBounds = ViewUtils.calculateRectFromBounds(this.f53211view);
        if (view2 != null) {
            this.initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(this.f53211view, view2);
        }
        this.initialTouchY = f14;
    }

    public void updateBackProgress(float f14, boolean z14, float f15, float f16) {
        float fInterpolateProgress = interpolateProgress(f14);
        float width = this.f53211view.getWidth();
        float height = this.f53211view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float fLerp = AnimationUtils.lerp(1.0f, MIN_SCALE, fInterpolateProgress);
        float fLerp2 = AnimationUtils.lerp(0.0f, Math.max(0.0f, hb.a.c(width, MIN_SCALE, width, 2.0f) - this.minEdgeGap), fInterpolateProgress) * (z14 ? 1 : -1);
        float fMin = Math.min(Math.max(0.0f, hb.a.c(fLerp, height, height, 2.0f) - this.minEdgeGap), this.maxTranslationY);
        float f17 = f15 - this.initialTouchY;
        float fLerp3 = AnimationUtils.lerp(0.0f, fMin, Math.abs(f17) / height) * Math.signum(f17);
        this.f53211view.setScaleX(fLerp);
        this.f53211view.setScaleY(fLerp);
        this.f53211view.setTranslationX(fLerp2);
        this.f53211view.setTranslationY(fLerp3);
        V v14 = this.f53211view;
        if (v14 instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) v14).updateCornerRadius(AnimationUtils.lerp(getExpandedCornerSize(), f16, fInterpolateProgress));
        }
    }

    public void startBackProgress(c cVar, View view2) {
        super.onStartBackProgress(cVar);
        startBackProgress(cVar.f13788b, view2);
    }

    public void updateBackProgress(c cVar, View view2, float f14) {
        if (super.onUpdateBackProgress(cVar) == null) {
            return;
        }
        if (view2 != null && view2.getVisibility() != 4) {
            view2.setVisibility(4);
        }
        updateBackProgress(cVar.f13789c, cVar.f13790d == 0, cVar.f13788b, f14);
    }
}
