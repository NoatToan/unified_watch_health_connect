package cn.hutool.core.lang.hash;

import defpackage.au3;
import defpackage.tt3;
import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class MurmurHash implements Serializable {
    private static final long C1 = -8663945395140668459L;
    private static final int C1_32 = -862048943;
    private static final long C2 = 5545529020109919103L;
    private static final int C2_32 = 461845907;
    private static final Charset DEFAULT_CHARSET = au3.f3449b;
    private static final int DEFAULT_SEED = 0;
    private static final int M = 5;
    private static final int M_32 = 5;
    private static final int N1 = 1390208809;
    private static final int N2 = 944331445;
    private static final int N_32 = -430675100;
    private static final int R1 = 31;
    private static final int R1_32 = 15;
    private static final int R2 = 27;
    private static final int R2_32 = 13;
    private static final int R3 = 33;
    private static final long serialVersionUID = 1;

    private static long fmix64(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    public static long[] hash128(CharSequence charSequence) {
        return hash128(tt3.g(charSequence, DEFAULT_CHARSET));
    }

    public static int hash32(CharSequence charSequence) {
        return hash32(tt3.g(charSequence, DEFAULT_CHARSET));
    }

    public static long hash64(CharSequence charSequence) {
        return hash64(tt3.g(charSequence, DEFAULT_CHARSET));
    }

    public static long[] hash128(byte[] bArr) {
        return hash128(bArr, bArr.length, 0);
    }

    public static int hash32(byte[] bArr) {
        return hash32(bArr, bArr.length, 0);
    }

    public static long hash64(byte[] bArr) {
        return hash64(bArr, bArr.length, 0);
    }

    public static long[] hash128(byte[] bArr, int i, int i2) {
        long jRotateLeft;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long jRotateLeft2;
        long j14 = i2;
        int i3 = i >> 4;
        long jRotateLeft3 = j14;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i4 << 4;
            long j15 = (((long) bArr[i5]) & 255) | ((((long) bArr[i5 + 1]) & 255) << 8) | ((((long) bArr[i5 + 2]) & 255) << 16) | ((((long) bArr[i5 + 3]) & 255) << 24) | ((((long) bArr[i5 + 4]) & 255) << 32) | ((((long) bArr[i5 + 5]) & 255) << 40) | ((((long) bArr[i5 + 6]) & 255) << 48) | ((((long) bArr[i5 + 7]) & 255) << 56);
            long j16 = jRotateLeft3;
            long j17 = (((long) bArr[i5 + 8]) & 255) | ((((long) bArr[i5 + 9]) & 255) << 8) | ((((long) bArr[i5 + 10]) & 255) << 16) | ((((long) bArr[i5 + 11]) & 255) << 24) | ((((long) bArr[i5 + 12]) & 255) << 32) | ((((long) bArr[i5 + 13]) & 255) << 40) | ((((long) bArr[i5 + 14]) & 255) << 48) | ((((long) bArr[i5 + 15]) & 255) << 56);
            long jRotateLeft4 = ((Long.rotateLeft(j14 ^ (Long.rotateLeft(j15 * C1, 31) * C2), 27) + j16) * 5) + 1390208809;
            jRotateLeft3 = ((Long.rotateLeft(j16 ^ (Long.rotateLeft(j17 * C2, 33) * C1), 31) + jRotateLeft4) * 5) + 944331445;
            i4++;
            j14 = jRotateLeft4;
        }
        long j18 = j14;
        long j19 = jRotateLeft3;
        int i6 = i3 << 4;
        switch (i - i6) {
            case 1:
                jRotateLeft = j19;
                j = 0;
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 2:
                jRotateLeft = j19;
                j2 = 0;
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 3:
                jRotateLeft = j19;
                j3 = 0;
                j2 = j3 ^ (((long) (bArr[i6 + 2] & 255)) << 16);
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 4:
                jRotateLeft = j19;
                j4 = 0;
                j3 = j4 ^ (((long) (bArr[i6 + 3] & 255)) << 24);
                j2 = j3 ^ (((long) (bArr[i6 + 2] & 255)) << 16);
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 5:
                jRotateLeft = j19;
                j5 = 0;
                j4 = j5 ^ (((long) (bArr[i6 + 4] & 255)) << 32);
                j3 = j4 ^ (((long) (bArr[i6 + 3] & 255)) << 24);
                j2 = j3 ^ (((long) (bArr[i6 + 2] & 255)) << 16);
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 6:
                jRotateLeft = j19;
                j6 = 0;
                j5 = j6 ^ (((long) (bArr[i6 + 5] & 255)) << 40);
                j4 = j5 ^ (((long) (bArr[i6 + 4] & 255)) << 32);
                j3 = j4 ^ (((long) (bArr[i6 + 3] & 255)) << 24);
                j2 = j3 ^ (((long) (bArr[i6 + 2] & 255)) << 16);
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 7:
                jRotateLeft = j19;
                j7 = 0;
                j6 = j7 ^ (((long) (bArr[i6 + 6] & 255)) << 48);
                j5 = j6 ^ (((long) (bArr[i6 + 5] & 255)) << 40);
                j4 = j5 ^ (((long) (bArr[i6 + 4] & 255)) << 32);
                j3 = j4 ^ (((long) (bArr[i6 + 3] & 255)) << 24);
                j2 = j3 ^ (((long) (bArr[i6 + 2] & 255)) << 16);
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 8:
                jRotateLeft = j19;
                j7 = ((long) (bArr[i6 + 7] & 255)) << 56;
                j6 = j7 ^ (((long) (bArr[i6 + 6] & 255)) << 48);
                j5 = j6 ^ (((long) (bArr[i6 + 5] & 255)) << 40);
                j4 = j5 ^ (((long) (bArr[i6 + 4] & 255)) << 32);
                j3 = j4 ^ (((long) (bArr[i6 + 3] & 255)) << 24);
                j2 = j3 ^ (((long) (bArr[i6 + 2] & 255)) << 16);
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 9:
                j8 = 0;
                jRotateLeft = j19 ^ (Long.rotateLeft((j8 ^ ((long) (bArr[i6 + 8] & 255))) * C2, 33) * C1);
                j7 = ((long) (bArr[i6 + 7] & 255)) << 56;
                j6 = j7 ^ (((long) (bArr[i6 + 6] & 255)) << 48);
                j5 = j6 ^ (((long) (bArr[i6 + 5] & 255)) << 40);
                j4 = j5 ^ (((long) (bArr[i6 + 4] & 255)) << 32);
                j3 = j4 ^ (((long) (bArr[i6 + 3] & 255)) << 24);
                j2 = j3 ^ (((long) (bArr[i6 + 2] & 255)) << 16);
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 10:
                j9 = 0;
                j8 = j9 ^ (((long) (bArr[i6 + 9] & 255)) << 8);
                jRotateLeft = j19 ^ (Long.rotateLeft((j8 ^ ((long) (bArr[i6 + 8] & 255))) * C2, 33) * C1);
                j7 = ((long) (bArr[i6 + 7] & 255)) << 56;
                j6 = j7 ^ (((long) (bArr[i6 + 6] & 255)) << 48);
                j5 = j6 ^ (((long) (bArr[i6 + 5] & 255)) << 40);
                j4 = j5 ^ (((long) (bArr[i6 + 4] & 255)) << 32);
                j3 = j4 ^ (((long) (bArr[i6 + 3] & 255)) << 24);
                j2 = j3 ^ (((long) (bArr[i6 + 2] & 255)) << 16);
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 11:
                j10 = 0;
                j9 = j10 ^ (((long) (bArr[i6 + 10] & 255)) << 16);
                j8 = j9 ^ (((long) (bArr[i6 + 9] & 255)) << 8);
                jRotateLeft = j19 ^ (Long.rotateLeft((j8 ^ ((long) (bArr[i6 + 8] & 255))) * C2, 33) * C1);
                j7 = ((long) (bArr[i6 + 7] & 255)) << 56;
                j6 = j7 ^ (((long) (bArr[i6 + 6] & 255)) << 48);
                j5 = j6 ^ (((long) (bArr[i6 + 5] & 255)) << 40);
                j4 = j5 ^ (((long) (bArr[i6 + 4] & 255)) << 32);
                j3 = j4 ^ (((long) (bArr[i6 + 3] & 255)) << 24);
                j2 = j3 ^ (((long) (bArr[i6 + 2] & 255)) << 16);
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 12:
                j11 = 0;
                j10 = j11 ^ (((long) (bArr[i6 + 11] & 255)) << 24);
                j9 = j10 ^ (((long) (bArr[i6 + 10] & 255)) << 16);
                j8 = j9 ^ (((long) (bArr[i6 + 9] & 255)) << 8);
                jRotateLeft = j19 ^ (Long.rotateLeft((j8 ^ ((long) (bArr[i6 + 8] & 255))) * C2, 33) * C1);
                j7 = ((long) (bArr[i6 + 7] & 255)) << 56;
                j6 = j7 ^ (((long) (bArr[i6 + 6] & 255)) << 48);
                j5 = j6 ^ (((long) (bArr[i6 + 5] & 255)) << 40);
                j4 = j5 ^ (((long) (bArr[i6 + 4] & 255)) << 32);
                j3 = j4 ^ (((long) (bArr[i6 + 3] & 255)) << 24);
                j2 = j3 ^ (((long) (bArr[i6 + 2] & 255)) << 16);
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 13:
                j12 = 0;
                j11 = j12 ^ (((long) (bArr[i6 + 12] & 255)) << 32);
                j10 = j11 ^ (((long) (bArr[i6 + 11] & 255)) << 24);
                j9 = j10 ^ (((long) (bArr[i6 + 10] & 255)) << 16);
                j8 = j9 ^ (((long) (bArr[i6 + 9] & 255)) << 8);
                jRotateLeft = j19 ^ (Long.rotateLeft((j8 ^ ((long) (bArr[i6 + 8] & 255))) * C2, 33) * C1);
                j7 = ((long) (bArr[i6 + 7] & 255)) << 56;
                j6 = j7 ^ (((long) (bArr[i6 + 6] & 255)) << 48);
                j5 = j6 ^ (((long) (bArr[i6 + 5] & 255)) << 40);
                j4 = j5 ^ (((long) (bArr[i6 + 4] & 255)) << 32);
                j3 = j4 ^ (((long) (bArr[i6 + 3] & 255)) << 24);
                j2 = j3 ^ (((long) (bArr[i6 + 2] & 255)) << 16);
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 14:
                j13 = 0;
                j12 = j13 ^ (((long) (bArr[i6 + 13] & 255)) << 40);
                j11 = j12 ^ (((long) (bArr[i6 + 12] & 255)) << 32);
                j10 = j11 ^ (((long) (bArr[i6 + 11] & 255)) << 24);
                j9 = j10 ^ (((long) (bArr[i6 + 10] & 255)) << 16);
                j8 = j9 ^ (((long) (bArr[i6 + 9] & 255)) << 8);
                jRotateLeft = j19 ^ (Long.rotateLeft((j8 ^ ((long) (bArr[i6 + 8] & 255))) * C2, 33) * C1);
                j7 = ((long) (bArr[i6 + 7] & 255)) << 56;
                j6 = j7 ^ (((long) (bArr[i6 + 6] & 255)) << 48);
                j5 = j6 ^ (((long) (bArr[i6 + 5] & 255)) << 40);
                j4 = j5 ^ (((long) (bArr[i6 + 4] & 255)) << 32);
                j3 = j4 ^ (((long) (bArr[i6 + 3] & 255)) << 24);
                j2 = j3 ^ (((long) (bArr[i6 + 2] & 255)) << 16);
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            case 15:
                j13 = ((long) (bArr[i6 + 14] & 255)) << 48;
                j12 = j13 ^ (((long) (bArr[i6 + 13] & 255)) << 40);
                j11 = j12 ^ (((long) (bArr[i6 + 12] & 255)) << 32);
                j10 = j11 ^ (((long) (bArr[i6 + 11] & 255)) << 24);
                j9 = j10 ^ (((long) (bArr[i6 + 10] & 255)) << 16);
                j8 = j9 ^ (((long) (bArr[i6 + 9] & 255)) << 8);
                jRotateLeft = j19 ^ (Long.rotateLeft((j8 ^ ((long) (bArr[i6 + 8] & 255))) * C2, 33) * C1);
                j7 = ((long) (bArr[i6 + 7] & 255)) << 56;
                j6 = j7 ^ (((long) (bArr[i6 + 6] & 255)) << 48);
                j5 = j6 ^ (((long) (bArr[i6 + 5] & 255)) << 40);
                j4 = j5 ^ (((long) (bArr[i6 + 4] & 255)) << 32);
                j3 = j4 ^ (((long) (bArr[i6 + 3] & 255)) << 24);
                j2 = j3 ^ (((long) (bArr[i6 + 2] & 255)) << 16);
                j = j2 ^ (((long) (bArr[i6 + 1] & 255)) << 8);
                jRotateLeft2 = j18 ^ (Long.rotateLeft((j ^ ((long) (bArr[i6] & 255))) * C1, 31) * C2);
                break;
            default:
                jRotateLeft2 = j18;
                jRotateLeft = j19;
                break;
        }
        long j20 = i;
        long j21 = jRotateLeft2 ^ j20;
        long j22 = j20 ^ jRotateLeft;
        long j23 = j21 + j22;
        long j24 = j22 + j23;
        long jFmix64 = fmix64(j23);
        long jFmix65 = fmix64(j24);
        long j25 = jFmix64 + jFmix65;
        return new long[]{j25, jFmix65 + j25};
    }

    public static int hash32(byte[] bArr, int i, int i2) {
        int i3 = i >> 2;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i5 << 2;
            i2 = (Integer.rotateLeft(i2 ^ (Integer.rotateLeft((((bArr[i6 + 3] & 255) << 24) | (((bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8)) | ((bArr[i6 + 2] & 255) << 16))) * (-862048943), 15) * C2_32), 13) * 5) + N_32;
        }
        int i7 = i3 << 2;
        int i8 = i - i7;
        if (i8 != 1) {
            if (i8 != 2) {
                i4 = i8 == 3 ? bArr[i7 + 2] << 16 : 0;
            }
            i4 ^= bArr[i7 + 1] << 8;
            i2 ^= Integer.rotateLeft((bArr[i7] ^ i4) * (-862048943), 15) * C2_32;
        } else {
            i2 ^= Integer.rotateLeft((bArr[i7] ^ i4) * (-862048943), 15) * C2_32;
        }
        int i9 = i2 ^ i;
        int i10 = (i9 ^ (i9 >>> 16)) * (-2048144789);
        int i11 = (i10 ^ (i10 >>> 13)) * (-1028477387);
        return i11 ^ (i11 >>> 16);
    }

    public static long hash64(byte[] bArr, int i, int i2) {
        long jRotateLeft = i2;
        int i3 = i >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 << 3;
            jRotateLeft = (Long.rotateLeft(jRotateLeft ^ (Long.rotateLeft(((((((((((long) bArr[i5]) & 255) | ((((long) bArr[i5 + 1]) & 255) << 8)) | ((((long) bArr[i5 + 2]) & 255) << 16)) | ((((long) bArr[i5 + 3]) & 255) << 24)) | ((((long) bArr[i5 + 4]) & 255) << 32)) | ((((long) bArr[i5 + 5]) & 255) << 40)) | ((((long) bArr[i5 + 6]) & 255) << 48)) | ((((long) bArr[i5 + 7]) & 255) << 56)) * C1, 31) * C2), 27) * 5) + 1390208809;
        }
        int i6 = i3 << 3;
        long j = 0;
        switch (i - i6) {
            case 7:
                j = (((long) bArr[i6 + 6]) & 255) << 48;
            case 6:
                j ^= (((long) bArr[i6 + 5]) & 255) << 40;
            case 5:
                j ^= (((long) bArr[i6 + 4]) & 255) << 32;
            case 4:
                j ^= (((long) bArr[i6 + 3]) & 255) << 24;
            case 3:
                j ^= (((long) bArr[i6 + 2]) & 255) << 16;
            case 2:
                j ^= (((long) bArr[i6 + 1]) & 255) << 8;
            case 1:
                jRotateLeft ^= Long.rotateLeft(((((long) bArr[i6]) & 255) ^ j) * C1, 31) * C2;
                break;
        }
        return fmix64(jRotateLeft ^ ((long) i));
    }
}
