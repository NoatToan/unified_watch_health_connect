package com.xiaomi.smarthome.library.common.util;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;

/* JADX INFO: loaded from: classes2.dex */
public class SystemUiUtils {
    public static void closeSoftKeyboard(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            Activity activity = (Activity) context;
            if (activity.getCurrentFocus() != null) {
                inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 2);
            }
        }
    }

    private static void hideSystemBars(View view, boolean z, boolean z2) {
        int i = !z2 ? 5380 : 13572;
        if (z) {
            i |= SportSummary.VRESION_202;
        }
        view.setSystemUiVisibility(i);
    }

    public static void setSystemBarVisible(boolean z, View view) {
        if (z) {
            showSystemBars(view, false, true);
        } else {
            hideSystemBars(view, false, true);
        }
    }

    private static void showSystemBars(View view, boolean z, boolean z2) {
        int i = !z2 ? 1280 : 9472;
        if (z) {
            i |= 512;
        }
        view.setSystemUiVisibility(i);
    }
}
