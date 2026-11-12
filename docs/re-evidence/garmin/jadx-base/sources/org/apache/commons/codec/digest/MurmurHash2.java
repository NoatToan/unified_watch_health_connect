package org.apache.commons.codec.digest;

import com.google.common.primitives.UnsignedBytes;
import org.apache.commons.codec.binary.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class MurmurHash2 {
    private static final int M32 = 1540483477;
    private static final long M64 = -4132994306676758123L;
    private static final int R32 = 24;
    private static final int R64 = 47;

    private MurmurHash2() {
    }

    private static int getLittleEndianInt(byte[] bArr, int i14) {
        return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    private static long getLittleEndianLong(byte[] bArr, int i14) {
        return ((((long) bArr[i14 + 7]) & 255) << 56) | (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) & 255) << 8) | ((((long) bArr[i14 + 2]) & 255) << 16) | ((((long) bArr[i14 + 3]) & 255) << 24) | ((((long) bArr[i14 + 4]) & 255) << 32) | ((((long) bArr[i14 + 5]) & 255) << 40) | ((((long) bArr[i14 + 6]) & 255) << 48);
    }

    public static int hash32(byte[] bArr, int i14, int i15) {
        int i16 = i15 ^ i14;
        int i17 = i14 >> 2;
        for (int i18 = 0; i18 < i17; i18++) {
            int littleEndianInt = getLittleEndianInt(bArr, i18 << 2) * M32;
            i16 = (i16 * M32) ^ ((littleEndianInt ^ (littleEndianInt >>> 24)) * M32);
        }
        int i19 = i17 << 2;
        int i24 = i14 - i19;
        if (i24 == 1) {
            i16 = ((bArr[i19] & 255) ^ i16) * M32;
        } else {
            if (i24 != 2) {
                if (i24 == 3) {
                    i16 ^= (bArr[i19 + 2] & 255) << 16;
                }
            }
            i16 ^= (bArr[i19 + 1] & 255) << 8;
            i16 = ((bArr[i19] & 255) ^ i16) * M32;
        }
        int i25 = ((i16 >>> 13) ^ i16) * M32;
        return i25 ^ (i25 >>> 15);
    }

    public static long hash64(byte[] bArr, int i14, int i15) {
        long j8 = (((long) i15) & 4294967295L) ^ (((long) i14) * M64);
        int i16 = i14 >> 3;
        for (int i17 = 0; i17 < i16; i17++) {
            long littleEndianLong = getLittleEndianLong(bArr, i17 << 3) * M64;
            j8 = (j8 ^ ((littleEndianLong ^ (littleEndianLong >>> 47)) * M64)) * M64;
        }
        int i18 = i16 << 3;
        switch (i14 - i18) {
            case 7:
                j8 ^= (((long) bArr[i18 + 6]) & 255) << 48;
            case 6:
                j8 ^= (((long) bArr[i18 + 5]) & 255) << 40;
            case 5:
                j8 ^= (((long) bArr[i18 + 4]) & 255) << 32;
            case 4:
                j8 ^= (((long) bArr[i18 + 3]) & 255) << 24;
            case 3:
                j8 ^= (((long) bArr[i18 + 2]) & 255) << 16;
            case 2:
                j8 ^= (((long) bArr[i18 + 1]) & 255) << 8;
            case 1:
                j8 = ((((long) bArr[i18]) & 255) ^ j8) * M64;
                break;
        }
        long j14 = ((j8 >>> 47) ^ j8) * M64;
        return j14 ^ (j14 >>> 47);
    }

    public static int hash32(byte[] bArr, int i14) {
        return hash32(bArr, i14, -1756908916);
    }

    public static int hash32(String str) {
        byte[] bytesUtf8 = StringUtils.getBytesUtf8(str);
        return hash32(bytesUtf8, bytesUtf8.length);
    }

    public static int hash32(String str, int i14, int i15) {
        return hash32(str.substring(i14, i15 + i14));
    }

    public static long hash64(byte[] bArr, int i14) {
        return hash64(bArr, i14, -512093083);
    }

    public static long hash64(String str) {
        byte[] bytesUtf8 = StringUtils.getBytesUtf8(str);
        return hash64(bytesUtf8, bytesUtf8.length);
    }

    public static long hash64(String str, int i14, int i15) {
        return hash64(str.substring(i14, i15 + i14));
    }
}
