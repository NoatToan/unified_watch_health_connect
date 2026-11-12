package com.github.mikephil.chartingv2.interfaces.datasets;

import android.graphics.DashPathEffect;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.formatter.FillFormatter;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface ILineDataSet extends ILineRadarDataSet<Entry> {
    int getCircleColor(int i14);

    int getCircleHoleColor();

    float getCircleRadius();

    float getCubicIntensity();

    DashPathEffect getDashPathEffect();

    FillFormatter getFillFormatter();

    boolean isDashedLineEnabled();

    boolean isDrawCircleHoleEnabled();

    boolean isDrawCirclesEnabled();

    boolean isDrawCubicEnabled();

    boolean isDrawSteppedEnabled();
}
