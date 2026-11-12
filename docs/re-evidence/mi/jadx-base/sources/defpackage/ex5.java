package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes4.dex */
public final class ex5 {
    public static ColorStateList a(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            typedArrayObtainStyledAttributes.recycle();
            return colorStateList;
        } catch (Throwable th) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th;
        }
    }

    public static ColorStateList b(Context context) {
        return a(context, R.attr.textColor);
    }

    public static int c(Context context) {
        return a(context, R.attr.textColorHighlight).getDefaultColor();
    }

    public static ColorStateList d(Context context) {
        return a(context, R.attr.textColorHint);
    }
}
