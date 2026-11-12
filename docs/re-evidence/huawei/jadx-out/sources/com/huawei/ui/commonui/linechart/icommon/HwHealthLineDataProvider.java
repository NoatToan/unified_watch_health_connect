package com.huawei.ui.commonui.linechart.icommon;

import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import defpackage.qmi;
import defpackage.qnt;

/* JADX INFO: loaded from: classes16.dex */
public interface HwHealthLineDataProvider extends BarLineScatterCandleBubbleDataProvider {
    HwHealthYAxis getAxis(HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency);

    qmi getAxisDataRenderArg(HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency);

    qnt getLineData();

    default qnt getPointData() {
        return null;
    }

    HwHealthTransformer getTransformer(HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency);

    XAxis getXAxis();
}
