package com.hm.opuslib;

/* JADX INFO: loaded from: classes5.dex */
public class OpusTool {
    private static final String TAG = "OpusTool";

    static {
        try {
            System.loadLibrary("opustool");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public native int decode(String str, String str2, String str3);

    public native int decodeBytes(byte[] bArr, short[] sArr, int i);

    public native int decodeOriginOpus(String str, String str2, int i, int i2);

    public native void deinit();

    public native int init();
}
