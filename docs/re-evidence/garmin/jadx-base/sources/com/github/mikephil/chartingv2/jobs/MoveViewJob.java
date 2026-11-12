package com.github.mikephil.chartingv2.jobs;

import android.view.View;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class MoveViewJob extends ViewPortJob {
    public MoveViewJob(ViewPortHandler viewPortHandler, float f14, float f15, Transformer transformer, View view2) {
        super(viewPortHandler, f14, f15, transformer, view2);
    }

    @Override // java.lang.Runnable
    public void run() {
        float[] fArr = this.pts;
        fArr[0] = this.xValue;
        fArr[1] = this.yValue;
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.centerViewPort(this.pts, this.f52831view);
    }
}
