package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes14.dex */
public class CanvasCompat {

    public interface CanvasOperation {
        void run(Canvas canvas);
    }

    private CanvasCompat() {
    }

    public static int saveLayerAlpha(Canvas canvas, RectF rectF, int i14) {
        return canvas.saveLayerAlpha(rectF, i14);
    }

    public static int saveLayerAlpha(Canvas canvas, float f14, float f15, float f16, float f17, int i14) {
        return canvas.saveLayerAlpha(f14, f15, f16, f17, i14);
    }
}
