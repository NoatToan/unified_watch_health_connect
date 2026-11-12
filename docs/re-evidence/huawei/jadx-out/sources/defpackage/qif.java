package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes43.dex */
public class qif {
    public static float e(String str, float f) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        return textPaint.measureText(str);
    }
}
