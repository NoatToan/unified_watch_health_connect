package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes19.dex */
public class ukj {
    private static final Object d = new Object();
    private static ukj e;

    public static ukj e() {
        ukj ukjVar;
        synchronized (d) {
            if (e == null) {
                e = new ukj();
            }
            ukjVar = e;
        }
        return ukjVar;
    }

    public float b(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (float) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
    }

    public float e(Paint paint, String str) {
        if (str.length() == 0) {
            return 0.0f;
        }
        return paint.measureText(str, 0, str.length());
    }

    public float c(Paint paint, String str) {
        if (str.length() == 0) {
            return 0.0f;
        }
        return b(paint) * str.length();
    }

    public static float b(int i, float f) {
        return TypedValue.applyDimension(i, f, Resources.getSystem().getDisplayMetrics());
    }
}
