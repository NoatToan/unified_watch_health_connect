package com.huawei.health.knit.section.chart;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import defpackage.frt;
import defpackage.qnz;

/* JADX INFO: loaded from: classes7.dex */
public class TemperatureBarChart extends HwHealthBarChart {
    private OnDataChangedListener e;

    public interface OnDataChangedListener {
        void onDataChangedListener(frt frtVar);
    }

    public TemperatureBarChart(Context context) {
        super(context);
        c();
    }

    public void setShowDataType(String str) {
        if (this.mRenderer instanceof TemperatureBarChartRender) {
            ((TemperatureBarChartRender) this.mRenderer).d(str);
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void setMarkerViewPosition(HwHealthBaseBarLineChart.d dVar) {
        this.mMarkerViewPosition = dVar;
    }

    private void c() {
        LogUtil.a("TemperatureBarChart", "initStyle");
        this.mRenderer = new TemperatureBarChartRender(this, this, this.mAnimator, this.mViewPortHandler);
        this.mAxisRendererFirstParty = new qnz(getContext(), this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
        enableMarkerView(true);
        enableSpacePreserveForDataOverlay(true);
        if (this.mMarker instanceof HwHealthMarkerView) {
            ((HwHealthMarkerView) this.mMarker).b(false);
        }
        if (this.mRenderer instanceof TemperatureBarChartRender) {
            ((TemperatureBarChartRender) this.mRenderer).a(new TemperatureBarChartRender.OnTemperatureTimeChangedListener() { // from class: frn
                @Override // com.huawei.health.knit.section.chart.TemperatureBarChartRender.OnTemperatureTimeChangedListener
                public final void onTemperatureTimeChangedListener(frt frtVar) {
                    this.e.b(frtVar);
                }
            });
        }
    }

    public /* synthetic */ void b(frt frtVar) {
        OnDataChangedListener onDataChangedListener = this.e;
        if (onDataChangedListener != null) {
            onDataChangedListener.onDataChangedListener(frtVar);
        }
    }

    public void setOnDataChangedListener(OnDataChangedListener onDataChangedListener) {
        this.e = onDataChangedListener;
    }
}
