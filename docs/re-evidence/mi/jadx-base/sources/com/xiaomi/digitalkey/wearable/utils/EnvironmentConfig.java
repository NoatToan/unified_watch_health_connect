package com.xiaomi.digitalkey.wearable.utils;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class EnvironmentConfig {
    private static Context sContext;
    private static IDeviceInfo sIDeviceInfo;

    public static Context getContext() {
        return sContext;
    }

    public static IDeviceInfo getDeviceInfo() {
        return sIDeviceInfo;
    }

    public static void setContext(Context context) {
        sContext = context;
    }

    public static void setDeviceInfo(IDeviceInfo iDeviceInfo) {
        sIDeviceInfo = iDeviceInfo;
    }
}
