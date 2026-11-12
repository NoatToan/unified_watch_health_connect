package com.huawei.hianalytics.core.common;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class EnvUtils {
    private static Context appContext;

    private EnvUtils() {
    }

    public static Context getAppContext() {
        return appContext;
    }

    public static void setAppContext(Context context) {
        appContext = context;
    }
}
