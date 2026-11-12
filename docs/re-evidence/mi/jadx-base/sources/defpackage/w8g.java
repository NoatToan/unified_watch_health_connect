package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class w8g {
    public static float a(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    public static boolean c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static int d(Context context, int i, int i2) {
        return e8f.c(context, i, i2);
    }

    public static TimeInterpolator e(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!c(strValueOf, "cubic-bezier")) {
            if (c(strValueOf, "path")) {
                return tlh.b(xlh.e(b(strValueOf, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + strValueOf);
        }
        String[] strArrSplit = b(strValueOf, "cubic-bezier").split(",");
        if (strArrSplit.length == 4) {
            return tlh.a(a(strArrSplit, 0), a(strArrSplit, 1), a(strArrSplit, 2), a(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }
}
