package com.github.mikephil.chartingv2.jobs;

import android.view.View;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class ViewPortJob implements Runnable {
    protected Transformer mTrans;
    protected ViewPortHandler mViewPortHandler;
    protected float[] pts = new float[2];

    /* JADX INFO: renamed from: view, reason: collision with root package name */
    protected View f52831view;
    protected float xValue;
    protected float yValue;

    public ViewPortJob(ViewPortHandler viewPortHandler, float f14, float f15, Transformer transformer, View view2) {
        this.mViewPortHandler = viewPortHandler;
        this.xValue = f14;
        this.yValue = f15;
        this.mTrans = transformer;
        this.f52831view = view2;
    }

    public float getXValue() {
        return this.xValue;
    }

    public float getYValue() {
        return this.yValue;
    }
}
