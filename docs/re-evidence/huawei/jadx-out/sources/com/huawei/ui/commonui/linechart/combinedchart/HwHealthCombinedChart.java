package com.huawei.ui.commonui.linechart.combinedchart;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.highlight.Highlight;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBaseBarDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.HwHealthCombinedDataProvider;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import defpackage.njy;
import defpackage.qly;
import defpackage.qmc;
import defpackage.qmd;
import defpackage.qnt;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthCombinedChart extends HwHealthBaseScrollBarLineChart<qmc> implements HwHealthCombinedDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23609a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected DrawOrder[] f23610c;
    private boolean d;
    protected boolean e;

    public enum DrawOrder {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public HwHealthCombinedChart(Context context) {
        super(context);
        this.e = false;
        this.f23609a = false;
        this.d = true;
        a();
    }

    public HwHealthCombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        this.f23609a = false;
        this.d = true;
        a();
    }

    public HwHealthCombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        this.f23609a = false;
        this.d = true;
        a();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.f23610c = new DrawOrder[]{DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER};
        setHighlighter(new qmd(this, this));
        setHighlightFullBarEnabled(true);
        this.mRenderer = new HwHealthCombinedChartRenderer(this, this.mAnimator, this.mViewPortHandler);
    }

    private void a() {
        this.mAxisFirstParty.setDrawAxisLine(false);
        this.mAxisSecondParty.setDrawAxisLine(false);
        this.mAxisFirstParty.setAxisMinimum(0.0f);
        this.mAxisSecondParty.setEnabled(false);
        getXAxis().setDrawGridLines(false);
        this.mAxisFirstParty.setAxisMaximum(12000.0f);
        makeReverse(true);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthCombinedDataProvider
    public qmc getCombinedData() {
        return (qmc) this.mData;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setData(qmc qmcVar) {
        super.setData(qmcVar);
        setHighlighter(new qmd(this, this));
        if (this.mRenderer instanceof HwHealthCombinedChartRenderer) {
            ((HwHealthCombinedChartRenderer) this.mRenderer).b();
        }
        this.mRenderer.initBuffers();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public Highlight getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == 0) {
            Log.e(Chart.LOG_TAG, "Can't select by touch. No data set.");
            return null;
        }
        Highlight highlight = getHighlighter().getHighlight(f, f2);
        return (highlight == null || !isHighlightFullBarEnabled()) ? highlight : new Highlight(highlight.getX(), highlight.getY(), highlight.getXPx(), highlight.getYPx(), highlight.getDataSetIndex(), -1, highlight.getAxis());
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider
    public qnt getLineData() {
        if (this.mData == 0) {
            return null;
        }
        return ((qmc) this.mData).j();
    }

    public void e() {
        if (this.mData == 0) {
            return;
        }
        ((qmc) this.mData).c();
    }

    public void b() {
        if (this.mData == 0) {
            return;
        }
        ((qmc) this.mData).b();
    }

    public void c() {
        if (this.mData == 0) {
            return;
        }
        ((qmc) this.mData).g();
    }

    public void d() {
        if (this.mData == 0) {
            return;
        }
        ((qmc) this.mData).k();
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider
    public qly getBarData() {
        if (this.mData == 0) {
            return null;
        }
        return ((qmc) this.mData).h();
    }

    public void c(HwHealthBarDataSet hwHealthBarDataSet) {
        if (this.mData == 0) {
            return;
        }
        ((qmc) this.mData).c(hwHealthBarDataSet);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider
    public boolean isDrawBarShadowEnabled() {
        return this.f23609a;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider
    public boolean isDrawValueAboveBarEnabled() {
        return this.d;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.e = z;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider
    public boolean isHighlightFullBarEnabled() {
        return this.e;
    }

    public DrawOrder[] getDrawOrder() {
        return (DrawOrder[]) this.f23610c.clone();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void refresh() {
        ((qmc) this.mData).e();
        for (T t : ((qmc) this.mData).getDataSets()) {
            if (t != null) {
                t.setValues(t.acquireEntryVals());
                t.makeDataCalculated(true);
                if (t instanceof IHwHealthLineDataSet) {
                    ((IHwHealthLineDataSet) t).checkIfNeedReload();
                }
            }
        }
        notifyDataSetChanged();
        invalidate();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public long queryMarkerViewTimeRangeMin() {
        long jQueryMarkerViewTimeMills = queryMarkerViewTimeMills();
        List<T> dataSets = ((qmc) this.mData).getDataSets();
        if (!njy.e(dataSets)) {
            HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet = (HwHealthBaseBarLineDataSet) dataSets.get(0);
            if (hwHealthBaseBarLineDataSet instanceof HwHealthBaseBarDataSet) {
                return ((long) ((HwHealthBaseBarDataSet) hwHealthBaseBarLineDataSet).acquireValuePresentRangeMin((int) (jQueryMarkerViewTimeMills / 60000))) * 60000;
            }
        }
        return jQueryMarkerViewTimeMills;
    }
}
