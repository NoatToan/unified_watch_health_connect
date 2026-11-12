package com.airoha.liblogger.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class ByteHelper {
    public static final String a = "ByteHelper";
    private static final char[] b = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bArr) {
        try {
            char[] cArr = new char[bArr.length * 2];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = bArr[i] & 255;
                int i3 = i * 2;
                char[] cArr2 = b;
                cArr[i3] = cArr2[i2 >>> 4];
                cArr[i3 + 1] = cArr2[i2 & 15];
            }
            return new String(cArr);
        } catch (Exception e) {
            Log.e(a, e.getMessage());
            return "";
        }
    }
}
