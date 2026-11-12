package com.xiaomi.hm.health.relation.chart.util;

import android.content.Context;
import android.graphics.Color;

/* JADX INFO: loaded from: classes21.dex */
public class ChartUtil {
    private static float a = -1.0f;
    private static float b = -1.0f;
    private static float c = -1.0f;

    public static int colorToColor(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
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

    public static float itemLevelSize(int i, int i2, float f, int i3) {
        int i4 = i / i3;
        int i5 = ((i2 + i4) - 1) / i4;
        float f2 = (((i2 - 1) % i4) + 1) / i4;
        int i6 = i5 - 1;
        return levelSize(i6, f, i3) + ((levelSize(i5, f, i3) - levelSize(i6, f, i3)) * f2);
    }

    public static float levelSize(int i, float f, int i2) {
        if (i <= 0) {
            return 0.0f;
        }
        return (((i2 + ((i2 - i) + 1)) * i) / 2.0f) * f;
    }

    public static float updateLevelSize(int i, float f, int i2) {
        return (f * (((i / i2) * i2) / i)) / (((i2 + 1) * i2) / 2.0f);
    }
}
