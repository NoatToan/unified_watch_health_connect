package com.xiaomi.smarthome.library.common.util;

import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.TextView;
import java.lang.reflect.Array;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class TextViewUtils {
    public static void clearTextLineCache() {
        Object obj;
        Field textLineCacheField = getTextLineCacheField();
        if (textLineCacheField == null) {
            return;
        }
        try {
            obj = textLineCacheField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                Array.set(obj, i, null);
            }
        }
    }

    private static Field getTextLineCacheField() {
        Field declaredField = null;
        try {
            declaredField = Class.forName("android.text.TextLine").getDeclaredField("sCached");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception e) {
            e.printStackTrace();
            return declaredField;
        }
    }

    public static float getTextViewWidth(TextView textView, CharSequence charSequence) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textView.getTextSize());
        return textPaint.measureText(charSequence, 0, charSequence.length() - 1);
    }

    public static int getTextWidth(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        int iCeil = 0;
        for (int i = 0; i < length; i++) {
            iCeil += (int) Math.ceil(fArr[i]);
        }
        return iCeil;
    }

    public static void setTextWithMaxCharNum(TextView textView, CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (charSequence.length() <= i) {
            textView.setText(charSequence);
            return;
        }
        textView.setText(new StringBuilder(charSequence).substring(0, i2) + ((Object) charSequence2));
    }

    public static void setTextWithMaxLength(TextView textView, CharSequence charSequence, float f, CharSequence charSequence2) {
        if (f > getTextViewWidth(textView, charSequence)) {
            textView.setText(charSequence);
            return;
        }
        int length = charSequence.length() - 2;
        StringBuilder sb = new StringBuilder(charSequence);
        String string = sb.toString();
        while (getTextViewWidth(textView, string) > f) {
            length--;
            string = sb.substring(0, length);
        }
        textView.setText(string + ((Object) charSequence2));
    }
}
