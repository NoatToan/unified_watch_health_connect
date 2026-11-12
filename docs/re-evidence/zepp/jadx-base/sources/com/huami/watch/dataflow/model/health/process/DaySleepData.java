package com.huami.watch.dataflow.model.health.process;

import android.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class DaySleepData {
    public static final int BYTES_EVERY_MINUTE = 4;
    public static final int MINUTES_COUNT = 1440;
    private static final String b = "DaySleepData";
    private byte[] a;

    public DaySleepData(byte[] bArr) {
        if (bArr == null) {
            Log.w(b, "init DaySleepData with null data!");
        } else if (bArr.length / 4 != 1440) {
            Log.e(b, "illegal length of sleep data! data will be null.");
        }
    }

    public byte[] getBinaryData() {
        return this.a;
    }
}
