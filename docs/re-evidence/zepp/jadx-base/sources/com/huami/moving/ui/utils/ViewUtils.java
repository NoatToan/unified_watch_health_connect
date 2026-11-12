package com.huami.moving.ui.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.core.text.TextUtilsCompat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class ViewUtils {
    private static final String a = "status_bar_height";

    public static float dp2px(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static int getHeight(View view) {
        int height = view.getHeight();
        if (height > 0) {
            return height;
        }
        view.measure(0, 0);
        return view.getMeasuredHeight();
    }

    public static int getStatusBarHeight(Context context) {
        try {
            int identifier = context.getResources().getIdentifier(a, "dimen", "android");
            if (identifier > 0) {
                return context.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int getWidth(View view) {
        int width = view.getWidth();
        if (width > 0) {
            return width;
        }
        view.measure(0, 0);
        return view.getMeasuredWidth();
    }

    public static boolean isRTL() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static float sp2px(Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }
}
