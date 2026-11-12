package com.github.mikephil.chartingv2.interfaces.datasets;

import com.github.mikephil.chartingv2.data.BarEntry;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface IBarDataSet extends IBarLineScatterCandleBubbleDataSet<BarEntry> {
    int getBarShadowColor();

    float getBarSpace();

    int getHighLightAlpha();

    String[] getStackLabels();

    int getStackSize();

    boolean isStacked();
}
