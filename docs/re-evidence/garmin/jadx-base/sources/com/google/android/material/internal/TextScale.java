package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.m;
import androidx.transition.t;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public class TextScale extends m {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    private void captureValues(t tVar) {
        View view2 = tVar.f11164b;
        if (view2 instanceof TextView) {
            tVar.f11163a.put(PROPNAME_SCALE, Float.valueOf(((TextView) view2).getScaleX()));
        }
    }

    @Override // androidx.transition.m
    public void captureEndValues(t tVar) {
        captureValues(tVar);
    }

    @Override // androidx.transition.m
    public void captureStartValues(t tVar) {
        captureValues(tVar);
    }

    @Override // androidx.transition.m
    public Animator createAnimator(ViewGroup viewGroup, t tVar, t tVar2) {
        if (tVar == null || tVar2 == null || !(tVar.f11164b instanceof TextView)) {
            return null;
        }
        View view2 = tVar2.f11164b;
        if (!(view2 instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view2;
        HashMap map = tVar.f11163a;
        HashMap map2 = tVar2.f11163a;
        float fFloatValue = map.get(PROPNAME_SCALE) != null ? ((Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        float fFloatValue2 = map2.get(PROPNAME_SCALE) != null ? ((Float) map2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(fFloatValue3);
                textView.setScaleY(fFloatValue3);
            }
        });
        return valueAnimatorOfFloat;
    }
}
