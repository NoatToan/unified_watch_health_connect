package com.google.crypto.tink.subtle;

import com.google.android.gms.internal.measurement.a;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
class Poly1305 {
    public static final int MAC_KEY_SIZE_IN_BYTES = 32;
    public static final int MAC_TAG_SIZE_IN_BYTES = 16;

    private Poly1305() {
    }

    public static byte[] computeMac(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            h.s("The key length in bytes must be 32.");
            return null;
        }
        long jLoad26 = load26(bArr, 0, 0) & 67108863;
        int i14 = 3;
        int i15 = 2;
        long jLoad27 = load26(bArr, 3, 2) & 67108611;
        long jLoad28 = load26(bArr, 6, 4) & 67092735;
        long jLoad29 = load26(bArr, 9, 6) & 66076671;
        long jLoad210 = load26(bArr, 12, 8) & 1048575;
        long j8 = jLoad27 * 5;
        long j14 = jLoad28 * 5;
        long j15 = jLoad29 * 5;
        long j16 = jLoad210 * 5;
        byte[] bArr3 = new byte[17];
        long j17 = 0;
        int i16 = 0;
        long j18 = 0;
        long j19 = 0;
        long j24 = 0;
        long j25 = 0;
        while (i16 < bArr2.length) {
            copyBlockSize(bArr3, bArr2, i16);
            long jLoad211 = j25 + load26(bArr3, 0, 0);
            long jLoad212 = j17 + load26(bArr3, i14, i15);
            long jLoad213 = j18 + load26(bArr3, 6, 4);
            long jLoad214 = j19 + load26(bArr3, 9, 6);
            long j26 = jLoad27;
            long jLoad215 = j24 + (load26(bArr3, 12, 8) | ((long) (bArr3[16] << Ascii.CAN)));
            long j27 = (jLoad215 * j8) + (jLoad214 * j14) + (jLoad213 * j15) + (jLoad212 * j16) + (jLoad211 * jLoad26);
            long j28 = (jLoad215 * j14) + (jLoad214 * j15) + (jLoad213 * j16) + (jLoad212 * jLoad26) + (jLoad211 * j26);
            long j29 = (jLoad215 * j15) + (jLoad214 * j16) + (jLoad213 * jLoad26) + (jLoad212 * j26) + (jLoad211 * jLoad28);
            long j34 = (jLoad215 * j16) + (jLoad214 * jLoad26) + (jLoad213 * j26) + (jLoad212 * jLoad28) + (jLoad211 * jLoad29);
            long j35 = jLoad214 * j26;
            long j36 = jLoad215 * jLoad26;
            long j37 = j36 + j35 + (jLoad213 * jLoad28) + (jLoad212 * jLoad29) + (jLoad211 * jLoad210);
            long j38 = j28 + (j27 >> 26);
            long j39 = j29 + (j38 >> 26);
            j18 = j39 & 67108863;
            long j44 = j34 + (j39 >> 26);
            j19 = j44 & 67108863;
            long j45 = j37 + (j44 >> 26);
            long j46 = j45 >> 26;
            j24 = j45 & 67108863;
            long j47 = (j46 * 5) + (j27 & 67108863);
            j25 = j47 & 67108863;
            j17 = (j38 & 67108863) + (j47 >> 26);
            i16 += 16;
            jLoad27 = j26;
            i14 = 3;
            i15 = 2;
        }
        long j48 = j18 + (j17 >> 26);
        long j49 = j48 & 67108863;
        long j54 = j19 + (j48 >> 26);
        long j55 = j54 & 67108863;
        long j56 = j24 + (j54 >> 26);
        long j57 = j56 & 67108863;
        long j58 = ((j56 >> 26) * 5) + j25;
        long j59 = j58 >> 26;
        long j64 = j58 & 67108863;
        long j65 = (j17 & 67108863) + j59;
        long j66 = j64 + 5;
        long j67 = j66 & 67108863;
        long j68 = j65 + (j66 >> 26);
        long j69 = j49 + (j68 >> 26);
        long j74 = j55 + (j69 >> 26);
        long j75 = j74 & 67108863;
        long j76 = (j57 + (j74 >> 26)) - 67108864;
        long j77 = j76 >> 63;
        long j78 = j64 & j77;
        long j79 = j65 & j77;
        long j84 = j49 & j77;
        long j85 = j55 & j77;
        long j86 = j57 & j77;
        long j87 = ~j77;
        long j88 = j79 | (j68 & 67108863 & j87);
        long j89 = j84 | (j69 & 67108863 & j87);
        long j93 = j85 | (j75 & j87);
        long j94 = (j78 | (j67 & j87) | (j88 << 26)) & 4294967295L;
        long j95 = ((j88 >> 6) | (j89 << 20)) & 4294967295L;
        long j96 = ((j89 >> 12) | (j93 << 14)) & 4294967295L;
        long j97 = ((j93 >> 18) | ((j86 | (j76 & j87)) << 8)) & 4294967295L;
        long jLoad32 = j94 + load32(bArr, 16);
        long j98 = jLoad32 & 4294967295L;
        long jLoad33 = j95 + load32(bArr, 20) + (jLoad32 >> 32);
        long j99 = jLoad33 & 4294967295L;
        long jLoad34 = j96 + load32(bArr, 24) + (jLoad33 >> 32);
        long j100 = jLoad34 & 4294967295L;
        long jLoad35 = (j97 + load32(bArr, 28) + (jLoad34 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        toByteArray(bArr4, j98, 0);
        toByteArray(bArr4, j99, 4);
        toByteArray(bArr4, j100, 8);
        toByteArray(bArr4, jLoad35, 12);
        return bArr4;
    }

    private static void copyBlockSize(byte[] bArr, byte[] bArr2, int i14) {
        int iMin = Math.min(16, bArr2.length - i14);
        System.arraycopy(bArr2, i14, bArr, 0, iMin);
        bArr[iMin] = 1;
        if (iMin != 16) {
            Arrays.fill(bArr, iMin + 1, bArr.length, (byte) 0);
        }
    }

    private static long load26(byte[] bArr, int i14, int i15) {
        return (load32(bArr, i14) >> i15) & 67108863;
    }

    private static long load32(byte[] bArr, int i14) {
        return ((long) (((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16))) & 4294967295L;
    }

    private static void toByteArray(byte[] bArr, long j8, int i14) {
        int i15 = 0;
        while (i15 < 4) {
            bArr[i14 + i15] = (byte) (255 & j8);
            i15++;
            j8 >>= 8;
        }
    }

    public static void verifyMac(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (Bytes.equal(computeMac(bArr, bArr2), bArr3)) {
            return;
        }
        a.t("invalid MAC");
    }
}
