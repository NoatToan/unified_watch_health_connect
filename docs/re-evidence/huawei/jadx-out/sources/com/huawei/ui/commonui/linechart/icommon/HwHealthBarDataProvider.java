package com.huawei.ui.commonui.linechart.icommon;

import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import defpackage.qly;
import defpackage.qmi;

/* JADX INFO: loaded from: classes16.dex */
public interface HwHealthBarDataProvider extends BarLineScatterCandleBubbleDataProvider {
    qmi getAxisDataRenderArg(HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency);

    qly getBarData();

    HwHealthTransformer getTransformer(HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency);

    XAxis getXAxis();

    boolean isDrawBarShadowEnabled();

    boolean isDrawValueAboveBarEnabled();

    boolean isHighlightFullBarEnabled();
}
