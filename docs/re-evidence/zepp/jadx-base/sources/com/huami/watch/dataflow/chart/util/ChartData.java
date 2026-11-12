package com.huami.watch.dataflow.chart.util;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes16.dex */
public final class ChartData {
    public static final int MODE_ALLDAY_HR = 4096;
    public static final int MODE_CALORIE = 1048576;
    public static final int MODE_ECG = 268435456;
    public static final int MODE_HR = 256;
    public static final int MODE_SLEEP = 16;
    public static final int MODE_SPORT = 65536;
    public static final int MODE_STEP = 1;
    public static final int MODE_TARGET = 2097152;

    public static class TextMarginSpan extends ReplacementSpan {
        private float a;
        private float b;
        private float c;
        private float d;

        public TextMarginSpan(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            canvas.drawText(charSequence.subSequence(i, i2).toString(), (f + this.a) - this.c, (i4 + this.b) - this.d, paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence.subSequence(i, i2).toString());
        }
    }
}
