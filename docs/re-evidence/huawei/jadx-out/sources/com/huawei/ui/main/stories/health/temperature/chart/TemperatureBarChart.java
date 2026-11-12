package com.huawei.ui.main.stories.health.temperature.chart;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.main.stories.BarChartRender;
import defpackage.qnz;
import defpackage.vap;

/* JADX INFO: loaded from: classes19.dex */
public class TemperatureBarChart extends HwHealthBarChart {
    private OnDataChangedListener d;

    public interface OnDataChangedListener {
        void onDataChangedListener(float f, float f2);
    }

    public TemperatureBarChart(Context context) {
        super(context);
        b();
    }

    public void setShowDataType(String str) {
        if (this.mRenderer instanceof vap) {
            ((vap) this.mRenderer).b(str);
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void setMarkerViewPosition(HwHealthBaseBarLineChart.d dVar) {
        this.mMarkerViewPosition = dVar;
    }

    private void b() {
        LogUtil.a("TemperatureBarChart", "initStyle");
        this.mRenderer = new vap(this, this, this.mAnimator, this.mViewPortHandler);
        this.mAxisRendererFirstParty = new qnz(getContext(), this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
        enableMarkerView(true);
        enableSpacePreserveForDataOverlay(true);
        if (this.mMarker instanceof HwHealthMarkerView) {
            ((HwHealthMarkerView) this.mMarker).b(false);
        }
        if (this.mRenderer instanceof vap) {
            ((vap) this.mRenderer).b(new BarChartRender.OnTimeChangedListener() { // from class: vak
                @Override // com.huawei.ui.main.stories.BarChartRender.OnTimeChangedListener
                public final void onTimeChangedListener(float f, float f2) {
                    this.e.c(f, f2);
                }
            });
        }
    }

    public /* synthetic */ void c(float f, float f2) {
        OnDataChangedListener onDataChangedListener = this.d;
        if (onDataChangedListener != null) {
            onDataChangedListener.onDataChangedListener(f, f2);
        }
    }

    public void setOnDataChangedListener(OnDataChangedListener onDataChangedListener) {
        this.d = onDataChangedListener;
    }
}
