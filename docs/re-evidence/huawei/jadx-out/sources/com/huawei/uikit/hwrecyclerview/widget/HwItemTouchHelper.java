package com.huawei.uikit.hwrecyclerview.widget;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.huawei.uikit.hwanimations.R;
import defpackage.xet;

/* JADX INFO: loaded from: classes44.dex */
public class HwItemTouchHelper extends HwItemTouchHelperEx {

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xet f29605a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HwItemTouchHelperEx.Callback f29607c;
        final /* synthetic */ View e;

        b(HwItemTouchHelperEx.Callback callback, View view, xet xetVar) {
            this.f29607c = callback;
            this.e = view;
            this.f29605a = xetVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.05f) + 1.0f;
            this.f29607c.updateSelectedScale(fFloatValue);
            this.e.setScaleX(fFloatValue);
            this.e.setScaleY(fFloatValue);
            xet xetVar = this.f29605a;
            if (xetVar != null) {
                xetVar.c(true);
            }
        }
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwItemTouchHelperEx
    public void b(View view, HwItemTouchHelperEx.Callback callback, xet xetVar) {
        super.b(view, callback, xetVar);
        if (view == null || callback == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(view.getContext(), R.interpolator.cubic_bezier_interpolator_type_20_80));
        valueAnimatorOfFloat.addUpdateListener(new b(callback, view, xetVar));
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.start();
    }
}
