package com.thanosfisherman.wifiutils.utils;

import android.os.Build;

/* JADX INFO: loaded from: classes18.dex */
public class VersionUtils {
    private VersionUtils() {
    }

    public static boolean isAndroidQOrLater() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean isJellyBeanOrLater() {
        return Build.VERSION.SDK_INT >= 17;
    }

    public static boolean isLollipopOrLater() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean isMarshmallowOrLater() {
        return Build.VERSION.SDK_INT >= 23;
    }
}
