package com.github.mikephil.charting.components;

import android.graphics.Canvas;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;

/* JADX INFO: loaded from: classes13.dex */
public interface IMarker {
    void draw(Canvas canvas, float f14, float f15);

    MPPointF getOffset();

    MPPointF getOffsetForDrawingAtPoint(float f14, float f15);

    void refreshContent(Entry entry, Highlight highlight);
}
