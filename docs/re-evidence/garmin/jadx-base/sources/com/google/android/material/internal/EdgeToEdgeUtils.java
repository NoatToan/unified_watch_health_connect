package com.google.android.material.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.view.Window;
import androidx.core.view.k1;
import androidx.core.view.o1;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes14.dex */
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    public static void applyEdgeToEdge(Window window, boolean z14, Integer num, Integer num2) {
        boolean z15 = num == null || num.intValue() == 0;
        boolean z16 = num2 == null || num2.intValue() == 0;
        if (z15 || z16) {
            int color = MaterialColors.getColor(window.getContext(), R.attr.colorBackground, -16777216);
            if (z15) {
                num = Integer.valueOf(color);
            }
            if (z16) {
                num2 = Integer.valueOf(color);
            }
        }
        k1.a(window, !z14);
        int statusBarColor = getStatusBarColor(window.getContext(), z14);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z14);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue())));
    }

    @TargetApi(21)
    private static int getNavigationBarColor(Context context, boolean z14) {
        if (z14) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216);
    }

    @TargetApi(21)
    private static int getStatusBarColor(Context context, boolean z14) {
        if (z14) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean isUsingLightSystemBar(int i14, boolean z14) {
        if (MaterialColors.isColorLight(i14)) {
            return true;
        }
        return i14 == 0 && z14;
    }

    public static void setLightNavigationBar(Window window, boolean z14) {
        new o1(window, window.getDecorView()).a(z14);
    }

    public static void setLightStatusBar(Window window, boolean z14) {
        new o1(window, window.getDecorView()).b(z14);
    }

    public static void applyEdgeToEdge(Window window, boolean z14) {
        applyEdgeToEdge(window, z14, null, null);
    }
}
