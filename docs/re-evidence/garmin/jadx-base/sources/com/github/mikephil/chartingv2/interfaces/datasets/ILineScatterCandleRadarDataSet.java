package com.github.mikephil.chartingv2.interfaces.datasets;

import android.graphics.DashPathEffect;
import com.github.mikephil.chartingv2.data.Entry;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface ILineScatterCandleRadarDataSet<T extends Entry> extends IBarLineScatterCandleBubbleDataSet<T> {
    DashPathEffect getDashPathEffectHighlight();

    float getHighlightLineWidth();

    boolean isHorizontalHighlightIndicatorEnabled();

    boolean isVerticalHighlightIndicatorEnabled();
}
