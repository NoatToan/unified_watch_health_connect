package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.g1;
import androidx.core.view.s0;
import b.c;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import java.util.WeakHashMap;
import q9.b;

/* JADX INFO: loaded from: classes14.dex */
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;

    public MaterialSideContainerBackHelper(View view2) {
        super(view2);
        Resources resources = view2.getResources();
        this.maxScaleXDistanceShrink = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.maxScaleXDistanceGrow = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.maxScaleYDistance = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    private boolean checkAbsoluteGravity(int i14, int i15) {
        V v14 = this.f53211view;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        return (Gravity.getAbsoluteGravity(i14, v14.getLayoutDirection()) & i15) == i15;
    }

    private int getEdgeMargin(boolean z14) {
        ViewGroup.LayoutParams layoutParams = this.f53211view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z14 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f53211view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f53211view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v14 = this.f53211view;
        if (v14 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v14;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i14), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.cancelDuration);
        animatorSet.start();
    }

    public void finishBackProgress(c cVar, final int i14, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        final boolean z14 = cVar.f13790d == 0;
        boolean zCheckAbsoluteGravity = checkAbsoluteGravity(i14, 3);
        float scaleX = (this.f53211view.getScaleX() * this.f53211view.getWidth()) + getEdgeMargin(zCheckAbsoluteGravity);
        V v14 = this.f53211view;
        Property property = View.TRANSLATION_X;
        if (zCheckAbsoluteGravity) {
            scaleX = -scaleX;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v14, (Property<V, Float>) property, scaleX);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new b());
        objectAnimatorOfFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, cVar.f13789c));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper.this.f53211view.setTranslationX(0.0f);
                MaterialSideContainerBackHelper.this.updateBackProgress(0.0f, z14, i14);
            }
        });
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void startBackProgress(c cVar) {
        super.onStartBackProgress(cVar);
    }

    public void updateBackProgress(float f14, boolean z14, int i14) {
        float fInterpolateProgress = interpolateProgress(f14);
        boolean zCheckAbsoluteGravity = checkAbsoluteGravity(i14, 3);
        boolean z15 = z14 == zCheckAbsoluteGravity;
        int width = this.f53211view.getWidth();
        int height = this.f53211view.getHeight();
        float f15 = width;
        if (f15 > 0.0f) {
            float f16 = height;
            if (f16 <= 0.0f) {
                return;
            }
            float f17 = this.maxScaleXDistanceShrink / f15;
            float f18 = this.maxScaleXDistanceGrow / f15;
            float f19 = this.maxScaleYDistance / f16;
            V v14 = this.f53211view;
            if (zCheckAbsoluteGravity) {
                f15 = 0.0f;
            }
            v14.setPivotX(f15);
            if (!z15) {
                f18 = -f17;
            }
            float fLerp = AnimationUtils.lerp(0.0f, f18, fInterpolateProgress);
            float f22 = fLerp + 1.0f;
            this.f53211view.setScaleX(f22);
            float fLerp2 = 1.0f - AnimationUtils.lerp(0.0f, f19, fInterpolateProgress);
            this.f53211view.setScaleY(fLerp2);
            V v15 = this.f53211view;
            if (v15 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v15;
                for (int i15 = 0; i15 < viewGroup.getChildCount(); i15++) {
                    View childAt = viewGroup.getChildAt(i15);
                    childAt.setPivotX(zCheckAbsoluteGravity ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f24 = z15 ? 1.0f - fLerp : 1.0f;
                    float f25 = fLerp2 != 0.0f ? (f22 / fLerp2) * f24 : 1.0f;
                    childAt.setScaleX(f24);
                    childAt.setScaleY(f25);
                }
            }
        }
    }

    public void updateBackProgress(c cVar, int i14) {
        if (super.onUpdateBackProgress(cVar) == null) {
            return;
        }
        updateBackProgress(cVar.f13789c, cVar.f13790d == 0, i14);
    }
}
