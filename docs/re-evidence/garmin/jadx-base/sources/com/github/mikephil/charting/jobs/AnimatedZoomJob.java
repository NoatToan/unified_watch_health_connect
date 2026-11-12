package com.github.mikephil.charting.jobs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.ObjectPool;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import j20.x;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"NewApi"})
public class AnimatedZoomJob extends AnimatedViewPortJob implements Animator.AnimatorListener {
    private static ObjectPool<AnimatedZoomJob> pool = ObjectPool.create(8, new AnimatedZoomJob(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0));
    protected Matrix mOnAnimationUpdateMatrixBuffer;
    protected float xAxisRange;
    protected YAxis yAxis;
    protected float zoomCenterX;
    protected float zoomCenterY;
    protected float zoomOriginX;
    protected float zoomOriginY;

    @SuppressLint({"NewApi"})
    public AnimatedZoomJob(ViewPortHandler viewPortHandler, View view2, Transformer transformer, YAxis yAxis, float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f24, float f25, long j8) {
        super(viewPortHandler, f15, f16, transformer, view2, f17, f18, j8);
        this.mOnAnimationUpdateMatrixBuffer = new Matrix();
        this.zoomCenterX = f19;
        this.zoomCenterY = f22;
        this.zoomOriginX = f24;
        this.zoomOriginY = f25;
        this.animator.addListener(this);
        this.yAxis = yAxis;
        this.xAxisRange = f14;
    }

    public static AnimatedZoomJob getInstance(ViewPortHandler viewPortHandler, View view2, Transformer transformer, YAxis yAxis, float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f24, float f25, long j8) {
        AnimatedZoomJob animatedZoomJob = (AnimatedZoomJob) pool.get();
        animatedZoomJob.mViewPortHandler = viewPortHandler;
        animatedZoomJob.xValue = f15;
        animatedZoomJob.yValue = f16;
        animatedZoomJob.mTrans = transformer;
        animatedZoomJob.f52822view = view2;
        animatedZoomJob.xOrigin = f17;
        animatedZoomJob.yOrigin = f18;
        animatedZoomJob.yAxis = yAxis;
        animatedZoomJob.xAxisRange = f14;
        animatedZoomJob.resetAnimator();
        animatedZoomJob.animator.setDuration(j8);
        return animatedZoomJob;
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public ObjectPool.Poolable instantiate() {
        return new AnimatedZoomJob(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ((BarLineChartBase) this.f52822view).calculateOffsets();
        this.f52822view.postInvalidate();
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f14 = this.xOrigin;
        float f15 = this.xValue - f14;
        float f16 = this.phase;
        float f17 = (f15 * f16) + f14;
        float f18 = this.yOrigin;
        float fA = x.a(this.yValue, f18, f16, f18);
        Matrix matrix = this.mOnAnimationUpdateMatrixBuffer;
        this.mViewPortHandler.setZoom(f17, fA, matrix);
        this.mViewPortHandler.refresh(matrix, this.f52822view, false);
        float scaleY = this.yAxis.mAxisRange / this.mViewPortHandler.getScaleY();
        float scaleX = this.xAxisRange / this.mViewPortHandler.getScaleX();
        float[] fArr = this.pts;
        float f19 = this.zoomOriginX;
        float f22 = (this.zoomCenterX - (scaleX / 2.0f)) - f19;
        float f24 = this.phase;
        fArr[0] = (f22 * f24) + f19;
        float f25 = this.zoomOriginY;
        fArr[1] = ((((scaleY / 2.0f) + this.zoomCenterY) - f25) * f24) + f25;
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.translate(this.pts, matrix);
        this.mViewPortHandler.refresh(matrix, this.f52822view, true);
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob
    public void recycleSelf() {
    }
}
