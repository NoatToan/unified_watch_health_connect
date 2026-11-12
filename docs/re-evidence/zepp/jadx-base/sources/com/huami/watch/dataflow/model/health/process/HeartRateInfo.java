package com.huami.watch.dataflow.model.health.process;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateInfo {
    public static final int HR_EMPTY_VALUE = 255;
    public static final int HR_NOT_GET_VALUE = 0;
    public static final int MAX_HR_VALUE = 221;
    public static final int MIN_HR_VALUE = 39;
    public static final int NO_HR_VALUE = 254;

    private HeartRateInfo() {
    }

    public static boolean isHRValueValid(int i) {
        return i < 221 && i > 39;
    }

    public static boolean isValueGetByMeasured(int i) {
        return isHRValueValid(i) || i == 0 || i == 255;
    }
}
