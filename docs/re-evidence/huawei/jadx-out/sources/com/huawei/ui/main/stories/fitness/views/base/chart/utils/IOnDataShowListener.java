package com.huawei.ui.main.stories.fitness.views.base.chart.utils;

import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;

/* JADX INFO: loaded from: classes19.dex */
public interface IOnDataShowListener {
    void onDataShowChanged(DataInfos dataInfos, int i, int i2, HwHealthBaseBarLineChart hwHealthBaseBarLineChart);

    void onUserEvent(UserEvent userEvent);
}
