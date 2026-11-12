package com.nimbusds.jose.crypto.utils;

/* JADX INFO: loaded from: classes3.dex */
public class ConstantTimeUtils {
    private ConstantTimeUtils() {
    }

    public static boolean areEqual(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < bArr.length; i15++) {
            i14 |= bArr[i15] ^ bArr2[i15];
        }
        return i14 == 0;
    }
}
