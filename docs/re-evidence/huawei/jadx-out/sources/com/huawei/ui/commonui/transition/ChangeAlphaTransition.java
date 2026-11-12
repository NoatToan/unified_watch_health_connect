package com.huawei.ui.commonui.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class ChangeAlphaTransition extends Visibility {
    private float e = 0.4f;

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        transitionValues.values.put("health:ChangeAlpha:alpha", Float.valueOf(transitionValues.view.getAlpha()));
    }

    private Animator d(final View view, float f, float f2) {
        float f3;
        float f4;
        if (f == f2) {
            LogUtil.j("ChangeAlphaTransition", "createAnimation null");
            return null;
        }
        view.setAlpha(f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", f2);
        addListener(new TransitionListenerAdapter() { // from class: com.huawei.ui.commonui.transition.ChangeAlphaTransition.5
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                view.setAlpha(1.0f);
                transition.removeListener(this);
            }
        });
        float f5 = 1.0f;
        if (Float.compare(f2, 0.0f) == 0) {
            f4 = this.e;
            f3 = 1.0f;
        } else {
            f3 = this.e;
            f4 = 1.0f;
            f5 = f3;
        }
        view.setScaleX(f5);
        view.setScaleY(f3);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", f4);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleY", f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        return animatorSet;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Float f = transitionValues != null ? (Float) transitionValues.values.get("health:ChangeAlpha:alpha") : null;
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        return d(view, fFloatValue != 1.0f ? fFloatValue : 0.0f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Float f = transitionValues != null ? (Float) transitionValues.values.get("health:ChangeAlpha:alpha") : null;
        return d(view, f != null ? f.floatValue() : 1.0f, 0.0f);
    }
}
