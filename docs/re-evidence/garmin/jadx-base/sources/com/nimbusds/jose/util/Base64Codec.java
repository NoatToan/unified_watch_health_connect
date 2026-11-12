package com.nimbusds.jose.util;

import am.j;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class Base64Codec {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static int checkedCast(long j8) {
        int i14 = (int) j8;
        if (i14 == j8) {
            return i14;
        }
        throw new IllegalArgumentException(j8 + " cannot be cast to int without changing its value.");
    }

    public static int computeEncodedLength(int i14, boolean z14) {
        if (i14 == 0) {
            return 0;
        }
        if (!z14) {
            return j.a(i14, 1, 3, 1) << 2;
        }
        int i15 = (i14 / 3) << 2;
        int i16 = i14 % 3;
        return i16 == 0 ? i15 : i15 + i16 + 1;
    }

    public static byte[] decode(String str) {
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(StandardCharset.UTF_8);
        int length = bytes.length;
        byte[] bArr = new byte[checkedCast((((long) length) * 6) >> 3)];
        int i14 = 0;
        int i15 = 0;
        while (i14 < bytes.length) {
            int i16 = 0;
            int i17 = 0;
            while (i16 < 4 && i14 < length) {
                int i18 = i14 + 1;
                int iDecodeDigit = decodeDigit(bytes[i14]);
                if (iDecodeDigit >= 0) {
                    i17 |= iDecodeDigit << (18 - (i16 * 6));
                    i16++;
                }
                i14 = i18;
            }
            if (i16 >= 2) {
                int i19 = i15 + 1;
                bArr[i15] = (byte) (i17 >> 16);
                if (i16 >= 3) {
                    int i24 = i15 + 2;
                    bArr[i19] = (byte) (i17 >> 8);
                    if (i16 >= 4) {
                        i15 += 3;
                        bArr[i24] = (byte) i17;
                    } else {
                        i15 = i24;
                    }
                } else {
                    i15 = i19;
                }
            }
        }
        return Arrays.copyOf(bArr, i15);
    }

    public static int decodeDigit(byte b14) {
        int iTpGT = tpGT(b14, 64) & tpLT(b14, 91);
        int iTpGT2 = tpGT(b14, 96) & tpLT(b14, 123);
        int iTpGT3 = tpGT(b14, 47) & tpLT(b14, 58);
        int iTpEq = tpEq(b14, 45) | tpEq(b14, 43);
        int iTpEq2 = tpEq(b14, 47) | tpEq(b14, 95);
        return tpSelect(iTpGT3, b14 + 4, 0) | tpSelect(iTpGT, b14 - 65, 0) | tpSelect(iTpGT2, b14 - 71, 0) | tpSelect(iTpEq, 62, 0) | tpSelect(iTpEq2, 63, 0) | tpSelect(iTpGT | iTpGT2 | iTpGT3 | iTpEq | iTpEq2, 0, -1);
    }

    public static byte encodeDigitBase64(int i14) {
        int iTpLT = tpLT(i14, 26);
        int iTpGT = tpGT(i14, 25) & tpLT(i14, 52);
        return (byte) (tpSelect(tpGT(i14, 51) & tpLT(i14, 62), i14 - 4, 0) | tpSelect(iTpLT, i14 + 65, 0) | tpSelect(iTpGT, i14 + 71, 0) | tpSelect(tpEq(i14, 62), 43, 0) | tpSelect(tpEq(i14, 63), 47, 0));
    }

    public static byte encodeDigitBase64URL(int i14) {
        int iTpLT = tpLT(i14, 26);
        int iTpGT = tpGT(i14, 25) & tpLT(i14, 52);
        return (byte) (tpSelect(tpGT(i14, 51) & tpLT(i14, 62), i14 - 4, 0) | tpSelect(iTpLT, i14 + 65, 0) | tpSelect(iTpGT, i14 + 71, 0) | tpSelect(tpEq(i14, 62), 45, 0) | tpSelect(tpEq(i14, 63), 95, 0));
    }

    public static String encodeToString(byte[] bArr, boolean z14) {
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return "";
        }
        int i14 = (length / 3) * 3;
        int iComputeEncodedLength = computeEncodedLength(length, z14);
        byte[] bArr2 = new byte[iComputeEncodedLength];
        int i15 = 0;
        int i16 = 0;
        while (i15 < i14) {
            int i17 = i15 + 2;
            int i18 = ((bArr[i15 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i15] & UnsignedBytes.MAX_VALUE) << 16);
            i15 += 3;
            int i19 = i18 | (bArr[i17] & UnsignedBytes.MAX_VALUE);
            if (z14) {
                bArr2[i16] = encodeDigitBase64URL((i19 >>> 18) & 63);
                bArr2[i16 + 1] = encodeDigitBase64URL((i19 >>> 12) & 63);
                int i24 = i16 + 3;
                bArr2[i16 + 2] = encodeDigitBase64URL((i19 >>> 6) & 63);
                i16 += 4;
                bArr2[i24] = encodeDigitBase64URL(i19 & 63);
            } else {
                bArr2[i16] = encodeDigitBase64((i19 >>> 18) & 63);
                bArr2[i16 + 1] = encodeDigitBase64((i19 >>> 12) & 63);
                int i25 = i16 + 3;
                bArr2[i16 + 2] = encodeDigitBase64((i19 >>> 6) & 63);
                i16 += 4;
                bArr2[i25] = encodeDigitBase64(i19 & 63);
            }
        }
        int i26 = length - i14;
        if (i26 > 0) {
            int i27 = ((bArr[i14] & UnsignedBytes.MAX_VALUE) << 10) | (i26 == 2 ? (bArr[length - 1] & UnsignedBytes.MAX_VALUE) << 2 : 0);
            if (!z14) {
                bArr2[iComputeEncodedLength - 4] = encodeDigitBase64(i27 >> 12);
                bArr2[iComputeEncodedLength - 3] = encodeDigitBase64((i27 >>> 6) & 63);
                bArr2[iComputeEncodedLength - 2] = i26 == 2 ? encodeDigitBase64(i27 & 63) : (byte) 61;
                bArr2[iComputeEncodedLength - 1] = 61;
            } else if (i26 == 2) {
                bArr2[iComputeEncodedLength - 3] = encodeDigitBase64URL(i27 >> 12);
                bArr2[iComputeEncodedLength - 2] = encodeDigitBase64URL((i27 >>> 6) & 63);
                bArr2[iComputeEncodedLength - 1] = encodeDigitBase64URL(i27 & 63);
            } else {
                bArr2[iComputeEncodedLength - 2] = encodeDigitBase64URL(i27 >> 12);
                bArr2[iComputeEncodedLength - 1] = encodeDigitBase64URL((i27 >>> 6) & 63);
            }
        }
        return new String(bArr2, StandardCharset.UTF_8);
    }

    public static int tpEq(int i14, int i15) {
        int i16 = i14 ^ i15;
        return ((~i16) & (i16 - 1)) >>> 63;
    }

    public static int tpGT(int i14, int i15) {
        return (int) ((((long) i15) - ((long) i14)) >>> 63);
    }

    public static int tpLT(int i14, int i15) {
        return (int) ((((long) i14) - ((long) i15)) >>> 63);
    }

    public static int tpSelect(int i14, int i15, int i16) {
        return ((i14 - 1) & (i16 ^ i15)) ^ i15;
    }
}
