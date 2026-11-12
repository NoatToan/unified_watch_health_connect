package com.huawei.ui.main.stories;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import defpackage.qly;
import defpackage.qlz;
import defpackage.qno;

/* JADX INFO: loaded from: classes18.dex */
public class BarChartRender extends qlz {

    public interface OnTimeChangedListener {
        void onTimeChangedListener(float f, float f2);
    }

    public BarChartRender(HwHealthBarDataProvider hwHealthBarDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(hwHealthBarDataProvider, chartAnimator, viewPortHandler);
    }

    public void c(HwHealthBarChart hwHealthBarChart, HwHealthBarDataProvider hwHealthBarDataProvider) {
        if (hwHealthBarChart == null || hwHealthBarDataProvider == null) {
            return;
        }
        this.f46467b = hwHealthBarDataProvider;
        this.mHighlightPaint = new Paint(1);
        this.mHighlightPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(120);
        this.g = new Paint(1);
        this.g.setStyle(Paint.Style.FILL);
        this.e = new Paint(1);
        this.e.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        qly barData = this.f46467b.getBarData();
        if (barData == null) {
            LogUtil.e("BarChartRender", "initBuffers() barData is null!");
            return;
        }
        this.f46468c = new qno[barData.getDataSetCount()];
        for (int i = 0; i < this.f46468c.length; i++) {
            IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) barData.getDataSetByIndex(i);
            this.f46468c[i] = new qno(iHwHealthBarDataSet.getEntryCount() * 4 * (iHwHealthBarDataSet.isStacked() ? iHwHealthBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iHwHealthBarDataSet.isStacked());
        }
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        qly barData = this.f46467b.getBarData();
        if (barData == null) {
            LogUtil.e("BarChartRender", "drawData() barData is null!");
            return;
        }
        for (int i = 0; i < barData.getDataSetCount(); i++) {
            IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) barData.getDataSetByIndex(i);
            if (iHwHealthBarDataSet.isVisible()) {
                c(canvas, iHwHealthBarDataSet, i);
            }
        }
    }

    protected boolean e(float f) {
        float axisMinimum = (!(this.f46467b instanceof HwHealthBarChart) || ((HwHealthBarChart) this.f46467b).getAxisFirstParty() == null) ? 0.0f : ((HwHealthBarChart) this.f46467b).getAxisFirstParty().getAxisMinimum();
        LogUtil.d("BarChartRender", "isOutOfChart min = ", Float.valueOf(f), " axisMin = ", Float.valueOf(axisMinimum));
        return f < axisMinimum;
    }
}
