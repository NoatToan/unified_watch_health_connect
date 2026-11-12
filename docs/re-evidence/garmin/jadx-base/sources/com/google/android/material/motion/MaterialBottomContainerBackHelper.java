package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import b.c;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import q9.b;

/* JADX INFO: loaded from: classes14.dex */
public class MaterialBottomContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistance;
    private final float maxScaleYDistance;

    public MaterialBottomContainerBackHelper(View view2) {
        super(view2);
        Resources resources = view2.getResources();
        this.maxScaleXDistance = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.maxScaleYDistance = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    private Animator createResetScaleAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f53211view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f53211view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v14 = this.f53211view;
        if (v14 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v14;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i14), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new b());
        return animatorSet;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        Animator animatorCreateResetScaleAnimator = createResetScaleAnimator();
        animatorCreateResetScaleAnimator.setDuration(this.cancelDuration);
        animatorCreateResetScaleAnimator.start();
    }

    public void finishBackProgressNotPersistent(c cVar, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f53211view, (Property<V, Float>) View.TRANSLATION_Y, this.f53211view.getScaleY() * this.f53211view.getHeight());
        objectAnimatorOfFloat.setInterpolator(new b());
        objectAnimatorOfFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, cVar.f13789c));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialBottomContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialBottomContainerBackHelper.this.f53211view.setTranslationY(0.0f);
                MaterialBottomContainerBackHelper.this.updateBackProgress(0.0f);
            }
        });
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void finishBackProgressPersistent(c cVar, Animator.AnimatorListener animatorListener) {
        Animator animatorCreateResetScaleAnimator = createResetScaleAnimator();
        animatorCreateResetScaleAnimator.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, cVar.f13789c));
        if (animatorListener != null) {
            animatorCreateResetScaleAnimator.addListener(animatorListener);
        }
        animatorCreateResetScaleAnimator.start();
    }

    public void startBackProgress(c cVar) {
        super.onStartBackProgress(cVar);
    }

    public void updateBackProgress(float f14) {
        float fInterpolateProgress = interpolateProgress(f14);
        float width = this.f53211view.getWidth();
        float height = this.f53211view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f15 = this.maxScaleXDistance / width;
        float f16 = this.maxScaleYDistance / height;
        float fLerp = 1.0f - AnimationUtils.lerp(0.0f, f15, fInterpolateProgress);
        float fLerp2 = 1.0f - AnimationUtils.lerp(0.0f, f16, fInterpolateProgress);
        this.f53211view.setScaleX(fLerp);
        this.f53211view.setPivotY(height);
        this.f53211view.setScaleY(fLerp2);
        V v14 = this.f53211view;
        if (v14 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v14;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                View childAt = viewGroup.getChildAt(i14);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fLerp2 != 0.0f ? fLerp / fLerp2 : 1.0f);
            }
        }
    }

    public void updateBackProgress(c cVar) {
        if (super.onUpdateBackProgress(cVar) == null) {
            return;
        }
        updateBackProgress(cVar.f13789c);
    }
}
