package com.huami.mifit.sportlib.utils;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes11.dex */
public class HeartRateConstant {
    public static final int HR_STATE_PAUSE = 44;
    public static final int HR_STATE_SUCC = 43;
    public static final int MAX_HR_VALUE = 221;
    public static final int MIN_HR_VALUE = 39;
    public static SparseArray<Integer> reserveHRArray = new SparseArray<>();
    public static float[] rangeArray = new float[5];

    public static boolean isHRValueValid(int i) {
        return i < 221 && i > 39;
    }

    public static void saveReserveHRArray(int i, int i2) {
        reserveHRArray.put(i, Integer.valueOf(i2));
    }

    public static void setRangeArray(float[] fArr) {
        rangeArray = fArr;
    }
}
