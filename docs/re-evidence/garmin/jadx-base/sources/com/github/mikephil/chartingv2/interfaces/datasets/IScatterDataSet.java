package com.github.mikephil.chartingv2.interfaces.datasets;

import com.github.mikephil.chartingv2.charts.ScatterChart;
import com.github.mikephil.chartingv2.data.Entry;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface IScatterDataSet extends ILineScatterCandleRadarDataSet<Entry> {
    ScatterChart.ScatterShape getScatterShape();

    int getScatterShapeHoleColor();

    float getScatterShapeHoleRadius();

    float getScatterShapeSize();
}
