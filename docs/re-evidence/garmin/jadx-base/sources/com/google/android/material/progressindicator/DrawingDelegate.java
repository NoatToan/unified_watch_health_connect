package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes14.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    S spec;

    public static class ActiveIndicator {
        int color;
        float endFraction;
        int gapSize;
        float startFraction;
    }

    public DrawingDelegate(S s8) {
        this.spec = s8;
    }

    public abstract void adjustCanvas(Canvas canvas, Rect rect, float f14, boolean z14, boolean z15);

    public abstract void drawStopIndicator(Canvas canvas, Paint paint, int i14, int i15);

    public abstract void fillIndicator(Canvas canvas, Paint paint, ActiveIndicator activeIndicator, int i14);

    public abstract void fillTrack(Canvas canvas, Paint paint, float f14, float f15, int i14, int i15, int i16);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public void validateSpecAndAdjustCanvas(Canvas canvas, Rect rect, float f14, boolean z14, boolean z15) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f14, z14, z15);
    }
}
