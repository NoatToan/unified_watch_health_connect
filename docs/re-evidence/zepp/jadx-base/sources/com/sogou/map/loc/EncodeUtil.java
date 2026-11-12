package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
class EncodeUtil {
    static {
        try {
            System.loadLibrary("sogouenc");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    public static native byte[] encode(byte[] bArr, byte[] bArr2);
}
