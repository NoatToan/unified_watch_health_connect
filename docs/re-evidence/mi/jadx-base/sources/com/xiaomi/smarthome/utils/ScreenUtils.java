package com.xiaomi.smarthome.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public class ScreenUtils {
    private static final String TAG = "DisplayUtils";
    private static int sInsertTop;

    public static int getInsertLeft(Activity activity) {
        DisplayCutout displayCutout;
        if (activity != null && Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
                    int iMax = Math.max(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetRight());
                    StringBuilder sb = new StringBuilder();
                    sb.append("WindowInsets top is:");
                    sb.append(sInsertTop);
                    return iMax;
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error:");
                sb2.append(e.toString());
            }
        }
        return 0;
    }

    public static int getInsertTop(Activity activity) {
        DisplayCutout displayCutout;
        if (activity != null && Build.VERSION.SDK_INT >= 28) {
            int i = sInsertTop;
            if (i != 0) {
                return i;
            }
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
                    sInsertTop = displayCutout.getSafeInsetTop();
                    StringBuilder sb = new StringBuilder();
                    sb.append("WindowInsets top is:");
                    sb.append(sInsertTop);
                    return sInsertTop;
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error:");
                sb2.append(e.toString());
            }
        }
        return 0;
    }

    public static int getScreenWidth(Context context) {
        if (context == null) {
            return 0;
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
    }
}
