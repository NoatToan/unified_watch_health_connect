package com.huami.watch.connect;

import android.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class Config {
    private static final String a = "LOGGER";

    public static boolean isDebug() {
        return Log.isLoggable(a, 2);
    }
}
