package com.github.mikephil.chartingv2.interfaces.datasets;

import com.github.mikephil.chartingv2.data.Entry;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface IRadarDataSet extends ILineRadarDataSet<Entry> {
    int getHighlightCircleFillColor();

    float getHighlightCircleInnerRadius();

    float getHighlightCircleOuterRadius();

    int getHighlightCircleStrokeAlpha();

    int getHighlightCircleStrokeColor();

    float getHighlightCircleStrokeWidth();

    boolean isDrawHighlightCircleEnabled();

    void setDrawHighlightCircleEnabled(boolean z14);
}
