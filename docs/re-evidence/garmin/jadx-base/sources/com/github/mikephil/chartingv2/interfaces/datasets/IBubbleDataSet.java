package com.github.mikephil.chartingv2.interfaces.datasets;

import com.github.mikephil.chartingv2.data.BubbleEntry;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface IBubbleDataSet extends IBarLineScatterCandleBubbleDataSet<BubbleEntry> {
    float getHighlightCircleWidth();

    float getMaxSize();

    float getXMax();

    float getXMin();

    void setHighlightCircleWidth(float f14);
}
