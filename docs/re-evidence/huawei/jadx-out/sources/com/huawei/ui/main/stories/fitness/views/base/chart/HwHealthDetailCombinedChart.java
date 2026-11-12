package com.huawei.ui.main.stories.fitness.views.base.chart;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChart;

/* JADX INFO: loaded from: classes19.dex */
public class HwHealthDetailCombinedChart extends HwHealthCombinedChart {
    public HwHealthDetailCombinedChart(Context context) {
        super(context);
        a();
    }

    public HwHealthDetailCombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public HwHealthDetailCombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        enableMarkerView(true);
        enableSpacePreserveForDataOverlay(true);
    }
}
