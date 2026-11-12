package com.github.mikephil.chartingv2.interfaces.datasets;

import android.graphics.drawable.Drawable;
import com.github.mikephil.chartingv2.data.Entry;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface ILineRadarDataSet<T extends Entry> extends ILineScatterCandleRadarDataSet<T> {
    int getFillAlpha();

    int getFillColor();

    Drawable getFillDrawable();

    float getLineWidth();

    boolean isDrawFilledEnabled();

    void setDrawFilled(boolean z14);
}
