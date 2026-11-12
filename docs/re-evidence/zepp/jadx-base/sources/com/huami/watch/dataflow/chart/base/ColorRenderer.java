package com.huami.watch.dataflow.chart.base;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes16.dex */
public class ColorRenderer extends Renderer {
    public ColorRenderer(int i) {
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(i);
    }

    public void setColor(int i) {
        this.paint.setColor(i);
    }

    public ColorRenderer(int i, int i2) {
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(i);
        Paint paint2 = new Paint(1);
        this.deepPaint = paint2;
        paint2.setColor(i2);
    }
}
