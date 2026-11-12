package com.github.mikephil.chartingv2.jobs;

import android.view.View;
import com.github.mikephil.chartingv2.charts.BarLineChartBase;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class ZoomJob extends ViewPortJob {
    protected YAxis.AxisDependency axisDependency;
    protected float scaleX;
    protected float scaleY;

    public ZoomJob(ViewPortHandler viewPortHandler, float f14, float f15, float f16, float f17, Transformer transformer, YAxis.AxisDependency axisDependency, View view2) {
        super(viewPortHandler, f16, f17, transformer, view2);
        this.scaleX = f14;
        this.scaleY = f15;
        this.axisDependency = axisDependency;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.mViewPortHandler.refresh(this.mViewPortHandler.zoom(this.scaleX, this.scaleY), this.f52831view, false);
        float deltaY = ((BarLineChartBase) this.f52831view).getDeltaY(this.axisDependency) / this.mViewPortHandler.getScaleY();
        float size = ((BarLineChartBase) this.f52831view).getXAxis().getValues().size() / this.mViewPortHandler.getScaleX();
        float[] fArr = this.pts;
        fArr[0] = this.xValue - (size / 2.0f);
        fArr[1] = (deltaY / 2.0f) + this.yValue;
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.refresh(this.mViewPortHandler.translate(this.pts), this.f52831view, false);
        ((BarLineChartBase) this.f52831view).calculateOffsets();
        this.f52831view.postInvalidate();
    }
}
