package com.hm.opuslib;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class OpusTool {
    private static final String TAG = "OpusTool";

    static {
        try {
            System.loadLibrary("opustool");
            Log.d(TAG, "loaded library ");
        } catch (UnsatisfiedLinkError unused) {
            Log.e(TAG, "Could not load library ");
        }
    }

    public native int decode(String str, String str2, String str3);

    public native int decodeBytes(byte[] bArr, short[] sArr);

    public native int decodeOriginOpus(String str, String str2, int i, int i2);

    public native void deinit();

    public native int init();
}
