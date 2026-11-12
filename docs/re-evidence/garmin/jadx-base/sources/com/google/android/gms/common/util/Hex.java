package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ShowFirstParty
@KeepForSdk
public class Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @KeepForSdk
    public static String bytesToStringLowercase(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i14 = 0;
        for (byte b14 : bArr) {
            int i15 = b14 & UnsignedBytes.MAX_VALUE;
            char[] cArr2 = zzb;
            cArr[i14] = cArr2[i15 >>> 4];
            cArr[i14 + 1] = cArr2[b14 & Ascii.SI];
            i14 += 2;
        }
        return new String(cArr);
    }

    @KeepForSdk
    public static String bytesToStringUppercase(byte[] bArr, boolean z14) {
        int length = bArr.length;
        StringBuilder sb3 = new StringBuilder(length + length);
        for (int i14 = 0; i14 < length && (!z14 || i14 != length - 1 || (bArr[i14] & UnsignedBytes.MAX_VALUE) != 0); i14++) {
            char[] cArr = zza;
            sb3.append(cArr[(bArr[i14] & 240) >>> 4]);
            sb3.append(cArr[bArr[i14] & Ascii.SI]);
        }
        return sb3.toString();
    }

    @KeepForSdk
    public static byte[] stringToBytes(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            h.s("Hex string has odd number of characters");
            return null;
        }
        byte[] bArr = new byte[length / 2];
        int i14 = 0;
        while (i14 < length) {
            int i15 = i14 + 2;
            bArr[i14 / 2] = (byte) Integer.parseInt(str.substring(i14, i15), 16);
            i14 = i15;
        }
        return bArr;
    }

    @KeepForSdk
    public static String bytesToStringUppercase(byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }
}
