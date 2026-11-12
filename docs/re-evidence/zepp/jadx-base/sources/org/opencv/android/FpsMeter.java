package org.opencv.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import java.text.DecimalFormat;
import org.opencv.core.Core;

/* JADX INFO: loaded from: classes23.dex */
public class FpsMeter {
    private static final String i = "FpsMeter";
    private static final int j = 20;
    private static final DecimalFormat k = new DecimalFormat("0.00");
    private int a;
    private double b;
    private long c;
    private String d;
    public Paint e;
    public boolean f = false;
    public int g = 0;
    public int h = 0;

    public void draw(Canvas canvas, float f, float f2) {
        Log.d(i, this.d);
        canvas.drawText(this.d, f, f2, this.e);
    }

    public void init() {
        this.a = 0;
        this.b = Core.getTickFrequency();
        this.c = Core.getTickCount();
        this.d = "";
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(-16776961);
        this.e.setTextSize(20.0f);
    }

    public void measure() {
        if (!this.f) {
            init();
            this.f = true;
            return;
        }
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 % 20 == 0) {
            long tickCount = Core.getTickCount();
            double d = (this.b * 20.0d) / (tickCount - this.c);
            this.c = tickCount;
            if (this.g == 0 || this.h == 0) {
                this.d = k.format(d) + " FPS";
            } else {
                this.d = k.format(d) + " FPS@" + Integer.valueOf(this.g) + "x" + Integer.valueOf(this.h);
            }
            Log.i(i, this.d);
        }
    }

    public void setResolution(int i2, int i3) {
        this.g = i2;
        this.h = i3;
    }
}
