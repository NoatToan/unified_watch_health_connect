package com.huawei.health.knit.section.chart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import defpackage.lrd;

/* JADX INFO: loaded from: classes7.dex */
public class HwHealthDetailBarChart extends HwHealthBarChart {
    public HwHealthDetailBarChart(Context context) {
        super(context);
        c();
    }

    public HwHealthDetailBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public HwHealthDetailBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    private void c() {
        lrd.c((View) this, 1, false);
        enableMarkerView(true);
        enableSpacePreserveForDataOverlay(true);
        e(true, false);
    }
}
