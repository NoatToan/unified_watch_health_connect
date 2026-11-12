package com.huawei.ui.commonui.linechart.icommon;

import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;

/* JADX INFO: loaded from: classes16.dex */
public interface IChartLayerHolder<T extends HwHealthBaseBarLineDataSet<? extends HwHealthBaseEntry>, C extends HwHealthBaseScrollBarLineChart> {

    public interface DataTypeFilter {
        boolean isAccept(DataInfos dataInfos);
    }

    T addDataLayer(C c2, HwHealthChartHolder.c cVar);

    T addDataLayer(C c2, DataInfos dataInfos);

    T addDataLayer(C c2, T t, HwHealthChartHolder.c cVar);

    T fakeDataLayer(HwHealthChartHolder.c cVar);

    void rmDataLayer(C c2, T t);

    void spetifiyDataTypeUnit(DataTypeFilter dataTypeFilter, String str);
}
