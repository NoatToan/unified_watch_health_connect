package com.huami.lib.rainbow.utils;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class RainbowUtils {
    private RainbowUtils() {
    }

    public static boolean isDarkMode(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
