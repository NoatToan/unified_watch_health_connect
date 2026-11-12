package com.huawei.health.knit.section.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import defpackage.frk;
import defpackage.frl;

/* JADX INFO: loaded from: classes7.dex */
public class CoreSleepBarChartView extends HwHealthBarChart {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnBarChartViewDataChangedListener f7466c;

    public interface OnBarChartViewDataChangedListener {
        void onBarChartViewDataChangedListener(float f, float f2);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public boolean isDrawYaxisLabelsOnHighLight() {
        return true;
    }

    public CoreSleepBarChartView(Context context) {
        super(context);
        e();
    }

    private void e() {
        this.mRenderer = new SleepBarChartRenderer(this, this, this.mAnimator, this.mViewPortHandler);
        this.mAxisFirstParty = new frl(this, HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        this.mAxisFirstParty.setDrawAxisLine(false);
        this.mAxisFirstParty.setAxisMinimum(0.0f);
        this.mAxisSecondParty = new frl(this, HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY);
        this.mAxisSecondParty.setDrawAxisLine(false);
        this.mAxisThirdParty = new frl(this, HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY);
        this.mAxisRendererFirstParty = new frk(getContext(), this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
        this.mAxisRendererSecondParty = new frk(getContext(), this.mViewPortHandler, this.mAxisSecondParty, this.mSecondAxisTransformer, this);
        this.mAxisRendererThirdParty = new frk(getContext(), this.mViewPortHandler, this.mAxisThirdParty, this.mThirdPartyAxisTransformer, this);
        ((frl) this.mAxisFirstParty).setTextColor(Color.argb(255, 255, 255, 255));
        this.mAxisThirdParty.setDrawGridLines(false);
        this.mAxisThirdParty.setDrawLabels(false);
        this.mAxisThirdParty.setEnabled(false);
        this.mAxisThirdParty.setDrawAxisLine(false);
        this.mAxisFirstParty.setTextColor(Color.argb(127, 0, 0, 0));
        this.mAxisSecondParty.setTextColor(Color.argb(127, 0, 0, 0));
        this.mAxisThirdParty.setTextColor(Color.argb(127, 0, 0, 0));
        enableMarkerView(true);
        enableSpacePreserveForDataOverlay(true);
        e(true, false);
        ((SleepBarChartRenderer) this.mRenderer).c(new SleepBarChartRenderer.OnSleepTimeChangedListener() { // from class: com.huawei.health.knit.section.chart.CoreSleepBarChartView.4
            @Override // com.huawei.health.knit.section.chart.SleepBarChartRenderer.OnSleepTimeChangedListener
            public void onSleepTimeChangedListener(float f, float f2) {
                if (CoreSleepBarChartView.this.f7466c != null) {
                    CoreSleepBarChartView.this.f7466c.onBarChartViewDataChangedListener(f, f2);
                }
            }
        });
    }

    public void setOnBarChartViewDataChangedListener(OnBarChartViewDataChangedListener onBarChartViewDataChangedListener) {
        this.f7466c = onBarChartViewDataChangedListener;
    }

    public void a(int i, int i2, String... strArr) {
        ((frk) this.mAxisRendererFirstParty).a(i, i2, strArr);
    }

    public void d(boolean z) {
        frk.d(z);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void clipDataArea(Canvas canvas) {
        RectF rectF = new RectF(this.mViewPortHandler.getContentRect());
        rectF.bottom += this.mXAxis.getYOffset();
        rectF.top = 0.0f;
        rectF.right += rectF.left;
        rectF.left = 0.0f;
        canvas.clipRect(rectF);
    }
}
