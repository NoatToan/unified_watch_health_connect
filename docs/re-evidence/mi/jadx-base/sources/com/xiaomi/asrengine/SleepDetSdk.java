package com.xiaomi.asrengine;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class SleepDetSdk {
    private static final String TAG = "com.xiaomi.asrengine.SleepDetSdk";

    static {
        System.loadLibrary("sleep_detect");
    }

    private static native String Feed_data(byte[] bArr, int i);

    private static native String GetModelVersion_sleep();

    private static native boolean Init_sleep(String str, String str2, int i);

    private static native boolean UnInit_sleep();

    public String feedData(byte[] bArr, int i) {
        return Feed_data(bArr, i);
    }

    public boolean init(@NotNull String str) {
        return Init_sleep(str, "sleepnet.mdl", 6);
    }

    public boolean release() {
        return UnInit_sleep();
    }
}
