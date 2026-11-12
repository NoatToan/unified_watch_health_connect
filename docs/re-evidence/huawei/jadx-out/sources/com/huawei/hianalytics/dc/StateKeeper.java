package com.huawei.hianalytics.dc;

/* JADX INFO: loaded from: classes3.dex */
public class StateKeeper {
    private static volatile boolean isInit = false;
    private static volatile boolean isMetricInit = false;

    public static boolean isInit() {
        return isInit;
    }

    public static boolean isMetricInit() {
        return isMetricInit;
    }

    public static void setInit(boolean z) {
        isInit = z;
    }

    public static void setMetricInit(boolean z) {
        isMetricInit = z;
    }
}
