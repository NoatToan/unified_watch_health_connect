package com.huawei.health.knit.section.chart;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.huawei.health.knit.section.view.SectionLineChart;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.UnixChartType;
import com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable;
import com.huawei.ui.commonui.linechart.view.commonlinechart.HwHealthCommonBarChart;
import defpackage.frf;
import defpackage.frh;
import defpackage.qnq;
import defpackage.qnr;

/* JADX INFO: loaded from: classes7.dex */
public class HwHealthPressureBarChart extends HwHealthCommonBarChart {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SectionLineChart f7471b;

    @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.HwHealthCommonBarChart
    public qnr getHealthLineDataSet(HwHealthBaseBarLineData hwHealthBaseBarLineData) {
        return null;
    }

    public HwHealthPressureBarChart(Context context, DataInfos dataInfos) {
        super(context, dataInfos);
        LogUtil.d("HwHealthPressureBarChart", "construct chart");
    }

    public HwHealthPressureBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HwHealthPressureBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.HwHealthCommonBarChart
    public void initCursorMode() {
        setBackgroundColor(this.mContext.getResources().getColor(R.color.emui_color_bg));
        enableMarkerView(true);
        setMarkerSlidingMode(HwHealthBaseBarLineChart.MarkerViewSlidingMode.ACCORDING_DATA);
        enableSpacePreserveForDataOverlay(true);
    }

    @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.HwHealthCommonBarChart
    public void initYRender() {
        this.mAxisRendererFirstParty = new frh(this.mContext, this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
        this.mAxisRendererSecondParty = new frh(this.mContext, this.mViewPortHandler, this.mAxisSecondParty, this.mSecondAxisTransformer, this);
        this.mAxisRendererThirdParty = new frh(this.mContext, this.mViewPortHandler, this.mAxisThirdParty, this.mThirdPartyAxisTransformer, this);
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChart, com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void refresh() {
        LogUtil.d("HwHealthPressureBarChart", "refresh chart");
        super.refresh();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public float computeTipsCenterHeightPx() {
        return (this.mAxisFirstParty.mEntries[1] + this.mAxisFirstParty.mEntries[2]) / 2.0f;
    }

    @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.HwHealthCommonBarChart
    public qnq getLineChartRender(Context context, DataInfos dataInfos) {
        return new frf(this, this.mAnimator, this.mViewPortHandler, context, dataInfos);
    }

    @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.HwHealthCommonBarChart
    public void initXAxis() {
        XAxis xAxis = getXAxis();
        xAxis.setValueFormatter(new HwHealthBaseScrollBarLineChart.i());
        xAxis.setAxisMinimum(0.0f);
        xAxis.setAxisMaximum(1440.0f);
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthBaseLineChart, com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart
    public void enableScrollMode(UnixChartType unixChartType, DynamicBorderSupportable dynamicBorderSupportable) {
        if (this.mChartShowMode != HwHealthBaseScrollBarLineChart.ChartShowMode.NORMAL) {
            return;
        }
        super.enableScrollMode(unixChartType, dynamicBorderSupportable);
        this.mScrollAdapter.acquireXAxisValueFormatter().enableMarkerViewShowRange(true);
    }

    public void setSection(SectionLineChart sectionLineChart) {
        this.f7471b = sectionLineChart;
    }

    public SectionLineChart getSection() {
        return this.f7471b;
    }
}
