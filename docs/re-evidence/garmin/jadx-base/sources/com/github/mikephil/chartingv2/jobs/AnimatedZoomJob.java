package com.github.mikephil.chartingv2.jobs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.github.mikephil.chartingv2.charts.BarLineChartBase;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import j20.x;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"NewApi"})
@Deprecated
public class AnimatedZoomJob extends AnimatedViewPortJob implements Animator.AnimatorListener {
    protected float xValCount;
    protected YAxis yAxis;
    protected float zoomCenterX;
    protected float zoomCenterY;
    protected float zoomOriginX;
    protected float zoomOriginY;

    @SuppressLint({"NewApi"})
    public AnimatedZoomJob(ViewPortHandler viewPortHandler, View view2, Transformer transformer, YAxis yAxis, float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f24, float f25, long j8) {
        super(viewPortHandler, f15, f16, transformer, view2, f17, f18, j8);
        this.zoomCenterX = f19;
        this.zoomCenterY = f22;
        this.zoomOriginX = f24;
        this.zoomOriginY = f25;
        this.animator.addListener(this);
        this.yAxis = yAxis;
        this.xValCount = f14;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ((BarLineChartBase) this.f52831view).calculateOffsets();
        this.f52831view.postInvalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f14 = this.xOrigin;
        float f15 = this.xValue - f14;
        float f16 = this.phase;
        float f17 = (f15 * f16) + f14;
        float f18 = this.yOrigin;
        this.mViewPortHandler.refresh(this.mViewPortHandler.setZoom(f17, x.a(this.yValue, f18, f16, f18)), this.f52831view, false);
        float scaleY = this.yAxis.mAxisRange / this.mViewPortHandler.getScaleY();
        float scaleX = this.xValCount / this.mViewPortHandler.getScaleX();
        float[] fArr = this.pts;
        float f19 = this.zoomOriginX;
        float f22 = (this.zoomCenterX - (scaleX / 2.0f)) - f19;
        float f24 = this.phase;
        fArr[0] = (f22 * f24) + f19;
        float f25 = this.zoomOriginY;
        fArr[1] = ((((scaleY / 2.0f) + this.zoomCenterY) - f25) * f24) + f25;
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.refresh(this.mViewPortHandler.translate(this.pts), this.f52831view, true);
    }
}
