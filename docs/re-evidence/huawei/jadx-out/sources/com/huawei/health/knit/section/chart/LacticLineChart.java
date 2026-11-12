package com.huawei.health.knit.section.chart;

import android.content.Context;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.linechart.view.commonlinechart.HwHealthCommonLineChart;
import defpackage.frc;

/* JADX INFO: loaded from: classes7.dex */
public class LacticLineChart extends HwHealthCommonLineChart {
    public LacticLineChart(Context context) {
        super(context);
        this.mRenderer = new frc(this, this.mAnimator, this.mViewPortHandler, context);
    }

    @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.HwHealthCommonLineChart
    public void c() {
        super.c();
        acquireLayout().m(getResources().getDimensionPixelSize(R.dimen.health_common_28dp));
    }
}
