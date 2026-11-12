package com.xiaomi.hm.health.relation.chart.base;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes21.dex */
public class ColorRenderer extends Renderer {
    public ColorRenderer(int i) {
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(i);
    }

    public void setColor(int i) {
        this.paint.setColor(i);
    }
}
