package com.huawei.health.motiontrack.api;

import android.view.View;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;

/* JADX INFO: loaded from: classes7.dex */
public interface ViewHolderBase {
    HwHealthBaseCombinedChart acquireHeartRateChart();

    View buildView(int i, int i2);
}
