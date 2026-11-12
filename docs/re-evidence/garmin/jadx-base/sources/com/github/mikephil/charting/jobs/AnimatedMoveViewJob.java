package com.github.mikephil.charting.jobs;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.github.mikephil.charting.utils.ObjectPool;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import j20.x;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"NewApi"})
public class AnimatedMoveViewJob extends AnimatedViewPortJob {
    private static ObjectPool<AnimatedMoveViewJob> pool;

    static {
        ObjectPool<AnimatedMoveViewJob> objectPoolCreate = ObjectPool.create(4, new AnimatedMoveViewJob(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L));
        pool = objectPoolCreate;
        objectPoolCreate.setReplenishPercentage(0.5f);
    }

    public AnimatedMoveViewJob(ViewPortHandler viewPortHandler, float f14, float f15, Transformer transformer, View view2, float f16, float f17, long j8) {
        super(viewPortHandler, f14, f15, transformer, view2, f16, f17, j8);
    }

    public static AnimatedMoveViewJob getInstance(ViewPortHandler viewPortHandler, float f14, float f15, Transformer transformer, View view2, float f16, float f17, long j8) {
        AnimatedMoveViewJob animatedMoveViewJob = (AnimatedMoveViewJob) pool.get();
        animatedMoveViewJob.mViewPortHandler = viewPortHandler;
        animatedMoveViewJob.xValue = f14;
        animatedMoveViewJob.yValue = f15;
        animatedMoveViewJob.mTrans = transformer;
        animatedMoveViewJob.f52822view = view2;
        animatedMoveViewJob.xOrigin = f16;
        animatedMoveViewJob.yOrigin = f17;
        animatedMoveViewJob.animator.setDuration(j8);
        return animatedMoveViewJob;
    }

    public static void recycleInstance(AnimatedMoveViewJob animatedMoveViewJob) {
        pool.recycle(animatedMoveViewJob);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public ObjectPool.Poolable instantiate() {
        return new AnimatedMoveViewJob(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L);
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = this.pts;
        float f14 = this.xOrigin;
        float f15 = this.xValue - f14;
        float f16 = this.phase;
        fArr[0] = (f15 * f16) + f14;
        float f17 = this.yOrigin;
        fArr[1] = x.a(this.yValue, f17, f16, f17);
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.centerViewPort(this.pts, this.f52822view);
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob
    public void recycleSelf() {
        recycleInstance(this);
    }
}
