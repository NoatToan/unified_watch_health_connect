package com.github.mikephil.chartingv2.interfaces.dataprovider;

import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.chartingv2.utils.Transformer;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {
    BarLineScatterCandleBubbleData getData();

    int getHighestVisibleXIndex();

    int getLowestVisibleXIndex();

    int getMaxVisibleCount();

    Transformer getTransformer(YAxis.AxisDependency axisDependency);

    boolean isInverted(YAxis.AxisDependency axisDependency);
}
