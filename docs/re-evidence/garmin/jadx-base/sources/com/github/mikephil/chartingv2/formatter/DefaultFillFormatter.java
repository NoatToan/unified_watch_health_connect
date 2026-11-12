package com.github.mikephil.chartingv2.formatter;

import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class DefaultFillFormatter implements FillFormatter {
    @Override // com.github.mikephil.chartingv2.formatter.FillFormatter
    public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        float yChartMax = lineDataProvider.getYChartMax();
        float yChartMin = lineDataProvider.getYChartMin();
        LineData lineData = lineDataProvider.getLineData();
        if (iLineDataSet.getYMax() > 0.0f && iLineDataSet.getYMin() < 0.0f) {
            return 0.0f;
        }
        if (lineData.getYMax() > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.getYMin() < 0.0f) {
            yChartMin = 0.0f;
        }
        return iLineDataSet.getYMin() >= 0.0f ? yChartMin : yChartMax;
    }
}
