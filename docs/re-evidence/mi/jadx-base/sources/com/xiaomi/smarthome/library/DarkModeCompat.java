package com.xiaomi.smarthome.library;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class DarkModeCompat {
    private static final String TAG = "DarkModeCompat";

    public static boolean isDarkMode(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
