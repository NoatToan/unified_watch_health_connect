package com.google.crypto.tink.subtle;

import com.google.common.primitives.UnsignedBytes;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class Hex {
    public static byte[] decode(String str) {
        if (str.length() % 2 != 0) {
            h.s("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = i14 * 2;
            int iDigit = Character.digit(str.charAt(i15), 16);
            int iDigit2 = Character.digit(str.charAt(i15 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                h.s("input is not hexadecimal");
                return null;
            }
            bArr[i14] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static String encode(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder(bArr.length * 2);
        for (byte b14 : bArr) {
            int i14 = b14 & UnsignedBytes.MAX_VALUE;
            sb3.append("0123456789abcdef".charAt(i14 / 16));
            sb3.append("0123456789abcdef".charAt(i14 % 16));
        }
        return sb3.toString();
    }
}
