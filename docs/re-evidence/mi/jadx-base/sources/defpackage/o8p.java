package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;

/* JADX INFO: loaded from: classes6.dex */
public class o8p {
    public static float a(Paint paint, String str) {
        if (paint == null || str == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return Math.abs(rect.bottom);
    }

    public static float b(Paint paint, String str) {
        if (paint == null || str == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return Math.abs(rect.top - rect.bottom);
    }

    public static float c(Paint paint, String str) {
        if (paint == null || str == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return Math.abs(rect.top);
    }

    public static SpannableStringBuilder d(Context context, float f, boolean z, ForegroundColorSpan foregroundColorSpan, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        StyleSpan styleSpan = new StyleSpan(0);
        int length = 0;
        for (String str2 : strArr) {
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(DisplayUtil.sp2px(context, f));
            int iIndexOf = str.indexOf(str2, length);
            if (iIndexOf != -1) {
                length = str2.length() + iIndexOf;
                spannableStringBuilder.setSpan(absoluteSizeSpan, iIndexOf, length, 33);
                if (z) {
                    styleSpan = new StyleSpan(1);
                }
                spannableStringBuilder.setSpan(styleSpan, iIndexOf, length, 34);
                if (foregroundColorSpan != null) {
                    spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, length, 34);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder e(Context context, int i, ForegroundColorSpan foregroundColorSpan, String str, String... strArr) {
        return d(context, i, true, foregroundColorSpan, str, strArr);
    }

    public static SpannableStringBuilder f(int i, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = 0;
        for (String str2 : strArr) {
            int iIndexOf = str.indexOf(str2, length);
            if (iIndexOf != -1) {
                length = str2.length() + iIndexOf;
                spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, length, 34);
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder g(Typeface typeface, Context context, float f, ForegroundColorSpan foregroundColorSpan, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int length = 0;
        for (String str2 : strArr) {
            ne5 ne5Var = new ne5(typeface);
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(DisplayUtil.sp2px(context, f));
            int iIndexOf = str.indexOf(str2, length);
            if (iIndexOf != -1) {
                length = str2.length() + iIndexOf;
                spannableStringBuilder.setSpan(absoluteSizeSpan, iIndexOf, length, 33);
                spannableStringBuilder.setSpan(ne5Var, iIndexOf, length, 34);
                if (foregroundColorSpan != null) {
                    spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, length, 34);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static float h(RectF rectF, Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (rectF.centerY() - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f);
    }

    public static float i(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.bottom - fontMetrics.top;
    }

    public static void j(Paint paint, int i) {
        if (i != 0) {
            paint.setTypeface(ApplicationExtKt.getApplication().getBaseContext().getResources().getFont(i));
        }
    }
}
