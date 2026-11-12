package com.xiaomi.phonesleepsdk;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class PhoneSleepSDK {
    static {
        System.loadLibrary("PhoneSleepSDK");
    }

    public static native String SleepReport_Result(List<Float> list, List<Float> list2, List<Float> list3, int i, int i2, int i3, double d, int i4, int i5);
}
