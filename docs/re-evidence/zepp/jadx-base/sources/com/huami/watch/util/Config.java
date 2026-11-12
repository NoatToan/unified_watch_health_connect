package com.huami.watch.util;

import android.os.Build;

/* JADX INFO: loaded from: classes11.dex */
public class Config {
    private static final String a = "LOGGER";
    private static final String b = "userdebug";

    public static boolean isDebug() {
        return Build.TYPE.equalsIgnoreCase(b);
    }
}
