package com.github.mikephil.chartingv2.interfaces.dataprovider;

import android.graphics.PointF;
import android.graphics.RectF;
import com.github.mikephil.chartingv2.data.ChartData;
import com.github.mikephil.chartingv2.formatter.ValueFormatter;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface ChartInterface {
    PointF getCenterOfView();

    PointF getCenterOffsets();

    RectF getContentRect();

    ChartData getData();

    ValueFormatter getDefaultValueFormatter();

    int getHeight();

    int getWidth();

    float getXChartMax();

    float getXChartMin();

    int getXValCount();

    float getYChartMax();

    float getYChartMin();
}
