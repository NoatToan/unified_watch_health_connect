package com.github.mikephil.chartingv2.interfaces.dataprovider;

import com.github.mikephil.chartingv2.data.BarData;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface BarDataProvider extends BarLineScatterCandleBubbleDataProvider {
    BarData getBarData();

    boolean isDrawBarShadowEnabled();

    boolean isDrawHighlightArrowEnabled();

    boolean isDrawValueAboveBarEnabled();
}
