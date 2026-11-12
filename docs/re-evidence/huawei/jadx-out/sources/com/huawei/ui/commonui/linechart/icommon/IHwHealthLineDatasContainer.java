package com.huawei.ui.commonui.linechart.icommon;

import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import defpackage.qod;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface IHwHealthLineDatasContainer extends IHwHealthDatasContainer {
    HwHealthBaseBarLineChart acquireChart();

    HwHealthBaseEntry acquireNearestPoint(float f);

    void load(HwHealthLineDataSet hwHealthLineDataSet);

    List<qod> queryNewNodes();

    List<qod> queryNodes();

    void reset();

    List<HwHealthBaseEntry> searchEntryForXValue(float f);
}
