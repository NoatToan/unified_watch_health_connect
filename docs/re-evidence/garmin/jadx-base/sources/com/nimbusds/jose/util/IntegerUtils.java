package com.nimbusds.jose.util;

/* JADX INFO: loaded from: classes3.dex */
public class IntegerUtils {
    private IntegerUtils() {
    }

    public static byte[] toBytes(int i14) {
        return new byte[]{(byte) (i14 >>> 24), (byte) ((i14 >>> 16) & 255), (byte) ((i14 >>> 8) & 255), (byte) (i14 & 255)};
    }
}
