package com.github.mikephil.chartingv2.jobs;

import android.animation.ValueAnimator;
import android.view.View;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import j20.x;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class AnimatedMoveViewJob extends AnimatedViewPortJob {
    public AnimatedMoveViewJob(ViewPortHandler viewPortHandler, float f14, float f15, Transformer transformer, View view2, float f16, float f17, long j8) {
        super(viewPortHandler, f14, f15, transformer, view2, f16, f17, j8);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = this.pts;
        float f14 = this.xOrigin;
        float f15 = this.xValue - f14;
        float f16 = this.phase;
        fArr[0] = (f15 * f16) + f14;
        float f17 = this.yOrigin;
        fArr[1] = x.a(this.yValue, f17, f16, f17);
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.centerViewPort(this.pts, this.f52831view);
    }
}
