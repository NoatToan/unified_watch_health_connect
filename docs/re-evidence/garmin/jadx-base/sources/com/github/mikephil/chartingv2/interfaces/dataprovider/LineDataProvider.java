package com.github.mikephil.chartingv2.interfaces.dataprovider;

import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.LineData;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {
    YAxis getAxis(YAxis.AxisDependency axisDependency);

    LineData getLineData();
}
