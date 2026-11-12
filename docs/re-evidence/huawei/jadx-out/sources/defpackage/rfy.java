package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes16.dex */
public class rfy {
    public static float e(float f, TextPaint textPaint, int i) {
        textPaint.setTextSize(i);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        return (f + ((fontMetrics.bottom - fontMetrics.top) / 2.0f)) - fontMetrics.bottom;
    }
}
