package com.huami.watch.util;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes11.dex */
public class DensityUtil {
    private static float a = -1.0f;
    private static float b = -1.0f;
    private static float c = -1.0f;

    private static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static int b(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static float dpToPx(Context context, float f) {
        return f * getDensity(context);
    }

    public static float getDensity(Context context) {
        if (a < 0.0f) {
            if (context == null) {
                return 3.0f;
            }
            float f = context.getResources().getDisplayMetrics().density;
            a = f;
            if (c < 0.0f) {
                c = f;
            }
        }
        return a;
    }

    public static float getDensityScale(Context context) {
        if (b < 0.0f) {
            if (context == null) {
                return 1.0f;
            }
            b = context.getResources().getDisplayMetrics().density / 3.0f;
        }
        return b;
    }

    public static float getOriginalDensity(Context context) {
        if (c < 0.0f) {
            getDensity(context);
        }
        return c;
    }

    public static float pxToDp(Context context, float f) {
        return f / getDensity(context);
    }

    public static void setDensityDPI(Context context, int i) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Configuration configuration = context.getResources().getConfiguration();
        configuration.densityDpi = i;
        displayMetrics.densityDpi = i;
        displayMetrics.density = i / 160;
        context.getResources().updateConfiguration(configuration, displayMetrics);
        a = -1.0f;
        b = -1.0f;
        getDensity(context);
    }

    public static float sp2px(Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }
}
