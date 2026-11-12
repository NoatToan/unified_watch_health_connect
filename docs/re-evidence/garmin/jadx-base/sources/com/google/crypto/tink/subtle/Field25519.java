package com.google.crypto.tink.subtle;

import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.annotations.Alpha;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@Alpha
final class Field25519 {
    static final int FIELD_LEN = 32;
    static final int LIMB_CNT = 10;
    private static final long TWO_TO_25 = 33554432;
    private static final long TWO_TO_26 = 67108864;
    private static final int[] EXPAND_START = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] EXPAND_SHIFT = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] MASK = {67108863, 33554431};
    private static final int[] SHIFT = {26, 25};

    public static byte[] contract(long[] jArr) {
        int i14;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i15 = 0;
        while (true) {
            if (i15 >= 2) {
                break;
            }
            int i16 = 0;
            while (i16 < 9) {
                long j8 = jArrCopyOf[i16];
                int i17 = SHIFT[i16 & 1];
                int i18 = -((int) (((j8 >> 31) & j8) >> i17));
                jArrCopyOf[i16] = j8 + ((long) (i18 << i17));
                i16++;
                jArrCopyOf[i16] = jArrCopyOf[i16] - ((long) i18);
            }
            long j14 = jArrCopyOf[9];
            int i19 = -((int) (((j14 >> 31) & j14) >> 25));
            jArrCopyOf[9] = j14 + ((long) (i19 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - ((long) (i19 * 19));
            i15++;
        }
        long j15 = jArrCopyOf[0];
        int i24 = -((int) (((j15 >> 31) & j15) >> 26));
        jArrCopyOf[0] = j15 + ((long) (i24 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i24);
        for (int i25 = 0; i25 < 2; i25++) {
            int i26 = 0;
            while (i26 < 9) {
                long j16 = jArrCopyOf[i26];
                int i27 = i26 & 1;
                int i28 = (int) (j16 >> SHIFT[i27]);
                jArrCopyOf[i26] = j16 & ((long) MASK[i27]);
                i26++;
                jArrCopyOf[i26] = jArrCopyOf[i26] + ((long) i28);
            }
        }
        long j17 = jArrCopyOf[9];
        jArrCopyOf[9] = j17 & 33554431;
        long j18 = jArrCopyOf[0] + ((long) (((int) (j17 >> 25)) * 19));
        jArrCopyOf[0] = j18;
        int iGte = gte((int) j18, 67108845);
        for (int i29 = 1; i29 < 10; i29++) {
            iGte &= eq((int) jArrCopyOf[i29], MASK[i29 & 1]);
        }
        jArrCopyOf[0] = jArrCopyOf[0] - ((long) (67108845 & iGte));
        long j19 = 33554431 & iGte;
        jArrCopyOf[1] = jArrCopyOf[1] - j19;
        for (i14 = 2; i14 < 10; i14 += 2) {
            jArrCopyOf[i14] = jArrCopyOf[i14] - ((long) (67108863 & iGte));
            int i30 = i14 + 1;
            jArrCopyOf[i30] = jArrCopyOf[i30] - j19;
        }
        for (int i34 = 0; i34 < 10; i34++) {
            jArrCopyOf[i34] = jArrCopyOf[i34] << EXPAND_SHIFT[i34];
        }
        byte[] bArr = new byte[32];
        for (int i35 = 0; i35 < 10; i35++) {
            int i36 = EXPAND_START[i35];
            long j24 = bArr[i36];
            long j25 = jArrCopyOf[i35];
            bArr[i36] = (byte) (j24 | (j25 & 255));
            int i37 = i36 + 1;
            bArr[i37] = (byte) (((long) bArr[i37]) | ((j25 >> 8) & 255));
            int i38 = i36 + 2;
            bArr[i38] = (byte) (((long) bArr[i38]) | ((j25 >> 16) & 255));
            int i39 = i36 + 3;
            bArr[i39] = (byte) (((long) bArr[i39]) | ((j25 >> 24) & 255));
        }
        return bArr;
    }

    private static int eq(int i14, int i15) {
        int i16 = ~(i14 ^ i15);
        int i17 = i16 & (i16 << 16);
        int i18 = i17 & (i17 << 8);
        int i19 = i18 & (i18 << 4);
        int i24 = i19 & (i19 << 2);
        return (i24 & (i24 << 1)) >> 31;
    }

    public static long[] expand(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i14 = 0; i14 < 10; i14++) {
            int i15 = EXPAND_START[i14];
            jArr[i14] = ((((((long) (bArr[i15] & UnsignedBytes.MAX_VALUE)) | (((long) (bArr[i15 + 1] & UnsignedBytes.MAX_VALUE)) << 8)) | (((long) (bArr[i15 + 2] & UnsignedBytes.MAX_VALUE)) << 16)) | (((long) (bArr[i15 + 3] & UnsignedBytes.MAX_VALUE)) << 24)) >> EXPAND_SHIFT[i14]) & ((long) MASK[i14 & 1]);
        }
        return jArr;
    }

    private static int gte(int i14, int i15) {
        return ~((i14 - i15) >> 31);
    }

    public static void inverse(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        square(jArr3, jArr2);
        square(jArr12, jArr3);
        square(jArr11, jArr12);
        mult(jArr4, jArr11, jArr2);
        mult(jArr5, jArr4, jArr3);
        square(jArr11, jArr5);
        mult(jArr6, jArr11, jArr4);
        square(jArr11, jArr6);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        mult(jArr7, jArr11, jArr6);
        square(jArr11, jArr7);
        square(jArr12, jArr11);
        for (int i14 = 2; i14 < 10; i14 += 2) {
            square(jArr11, jArr12);
            square(jArr12, jArr11);
        }
        mult(jArr8, jArr12, jArr7);
        square(jArr11, jArr8);
        square(jArr12, jArr11);
        for (int i15 = 2; i15 < 20; i15 += 2) {
            square(jArr11, jArr12);
            square(jArr12, jArr11);
        }
        mult(jArr11, jArr12, jArr8);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        for (int i16 = 2; i16 < 10; i16 += 2) {
            square(jArr12, jArr11);
            square(jArr11, jArr12);
        }
        mult(jArr9, jArr11, jArr7);
        square(jArr11, jArr9);
        square(jArr12, jArr11);
        for (int i17 = 2; i17 < 50; i17 += 2) {
            square(jArr11, jArr12);
            square(jArr12, jArr11);
        }
        mult(jArr10, jArr12, jArr9);
        square(jArr12, jArr10);
        square(jArr11, jArr12);
        for (int i18 = 2; i18 < 100; i18 += 2) {
            square(jArr12, jArr11);
            square(jArr11, jArr12);
        }
        mult(jArr12, jArr11, jArr10);
        square(jArr11, jArr12);
        square(jArr12, jArr11);
        for (int i19 = 2; i19 < 50; i19 += 2) {
            square(jArr11, jArr12);
            square(jArr12, jArr11);
        }
        mult(jArr11, jArr12, jArr9);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        square(jArr12, jArr11);
        mult(jArr, jArr12, jArr5);
    }

    public static void mult(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        product(jArr4, jArr2, jArr3);
        reduce(jArr4, jArr);
    }

    public static void product(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j8 = jArr2[0];
        long j14 = jArr3[1] * j8;
        long j15 = jArr2[1];
        long j16 = jArr3[0];
        jArr[1] = (j15 * j16) + j14;
        long j17 = jArr2[1];
        long j18 = jArr3[1];
        jArr[2] = (jArr2[2] * j16) + (jArr3[2] * j8) + (j17 * 2 * j18);
        long j19 = jArr3[2];
        long j24 = jArr2[2];
        jArr[3] = (jArr2[3] * j16) + (jArr3[3] * j8) + (j24 * j18) + (j17 * j19);
        long j25 = jArr3[3];
        long j26 = jArr2[3];
        jArr[4] = (jArr2[4] * j16) + (jArr3[4] * j8) + (((j26 * j18) + (j17 * j25)) * 2) + (j24 * j19);
        long j27 = jArr3[4];
        long j28 = (j17 * j27) + (j26 * j19) + (j24 * j25);
        long j29 = jArr2[4];
        jArr[5] = (jArr2[5] * j16) + (jArr3[5] * j8) + (j29 * j18) + j28;
        long j34 = jArr3[5];
        long j35 = jArr2[5];
        jArr[6] = (jArr2[6] * j16) + (jArr3[6] * j8) + (j29 * j19) + (j24 * j27) + (((j35 * j18) + (j17 * j34) + (j26 * j25)) * 2);
        long j36 = (j35 * j19) + (j24 * j34) + (j29 * j25) + (j26 * j27);
        long j37 = jArr3[6];
        long j38 = (j17 * j37) + j36;
        long j39 = jArr2[6];
        jArr[7] = (jArr2[7] * j16) + (jArr3[7] * j8) + (j39 * j18) + j38;
        long j44 = jArr3[7];
        long j45 = (j17 * j44) + (j35 * j25) + (j26 * j34);
        long j46 = jArr2[7];
        long j47 = (((j46 * j18) + j45) * 2) + (j29 * j27);
        jArr[8] = (jArr2[8] * j16) + (jArr3[8] * j8) + (j39 * j19) + (j24 * j37) + j47;
        long j48 = (j46 * j19) + (j24 * j44) + (j39 * j25) + (j26 * j37) + (j35 * j27) + (j29 * j34);
        long j49 = jArr3[8];
        long j54 = (j17 * j49) + j48;
        long j55 = jArr2[8];
        jArr[9] = (jArr2[9] * j16) + (j8 * jArr3[9]) + (j55 * j18) + j54;
        long j56 = (j46 * j25) + (j26 * j44) + (j35 * j34);
        long j57 = jArr3[9];
        long j58 = jArr2[9];
        long j59 = j29 * j37;
        jArr[10] = (j55 * j19) + (j24 * j49) + (j39 * j27) + j59 + (((j18 * j58) + (j17 * j57) + j56) * 2);
        long j64 = j24 * j57;
        long j65 = j19 * j58;
        jArr[11] = j65 + j64 + (j55 * j25) + (j26 * j49) + (j46 * j27) + (j29 * j44) + (j39 * j34) + (j35 * j37);
        long j66 = j26 * j57;
        long j67 = j25 * j58;
        long j68 = j55 * j27;
        jArr[12] = j68 + (j29 * j49) + ((j67 + j66 + (j46 * j34) + (j35 * j44)) * 2) + (j39 * j37);
        long j69 = j29 * j57;
        long j74 = j27 * j58;
        jArr[13] = j74 + j69 + (j55 * j34) + (j35 * j49) + (j46 * j37) + (j39 * j44);
        long j75 = j34 * j58;
        long j76 = j55 * j37;
        jArr[14] = j76 + (j39 * j49) + ((j75 + (j35 * j57) + (j46 * j44)) * 2);
        long j77 = j39 * j57;
        long j78 = j37 * j58;
        jArr[15] = j78 + j77 + (j55 * j44) + (j46 * j49);
        jArr[16] = (((j44 * j58) + (j46 * j57)) * 2) + (j55 * j49);
        jArr[17] = (j49 * j58) + (j55 * j57);
        jArr[18] = j58 * 2 * j57;
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        reduceSizeByModularReduction(jArr);
        reduceCoefficients(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void reduceCoefficients(long[] jArr) {
        jArr[10] = 0;
        int i14 = 0;
        while (i14 < 10) {
            long j8 = jArr[i14];
            long j14 = j8 / TWO_TO_26;
            jArr[i14] = j8 - (j14 << 26);
            int i15 = i14 + 1;
            long j15 = jArr[i15] + j14;
            jArr[i15] = j15;
            long j16 = j15 / TWO_TO_25;
            jArr[i15] = j15 - (j16 << 25);
            i14 += 2;
            jArr[i14] = jArr[i14] + j16;
        }
        long j17 = jArr[0];
        long j18 = jArr[10];
        long j19 = j17 + (j18 << 4);
        jArr[0] = j19;
        long j24 = j19 + (j18 << 1);
        jArr[0] = j24;
        long j25 = j24 + j18;
        jArr[0] = j25;
        jArr[10] = 0;
        long j26 = j25 / TWO_TO_26;
        jArr[0] = j25 - (j26 << 26);
        jArr[1] = jArr[1] + j26;
    }

    public static void reduceSizeByModularReduction(long[] jArr) {
        long j8 = jArr[8];
        long j14 = jArr[18];
        long j15 = j8 + (j14 << 4);
        jArr[8] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[8] = j16;
        jArr[8] = j16 + j14;
        long j17 = jArr[7];
        long j18 = jArr[17];
        long j19 = j17 + (j18 << 4);
        jArr[7] = j19;
        long j24 = j19 + (j18 << 1);
        jArr[7] = j24;
        jArr[7] = j24 + j18;
        long j25 = jArr[6];
        long j26 = jArr[16];
        long j27 = j25 + (j26 << 4);
        jArr[6] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[6] = j28;
        jArr[6] = j28 + j26;
        long j29 = jArr[5];
        long j34 = jArr[15];
        long j35 = j29 + (j34 << 4);
        jArr[5] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[5] = j36;
        jArr[5] = j36 + j34;
        long j37 = jArr[4];
        long j38 = jArr[14];
        long j39 = j37 + (j38 << 4);
        jArr[4] = j39;
        long j44 = j39 + (j38 << 1);
        jArr[4] = j44;
        jArr[4] = j44 + j38;
        long j45 = jArr[3];
        long j46 = jArr[13];
        long j47 = j45 + (j46 << 4);
        jArr[3] = j47;
        long j48 = j47 + (j46 << 1);
        jArr[3] = j48;
        jArr[3] = j48 + j46;
        long j49 = jArr[2];
        long j54 = jArr[12];
        long j55 = j49 + (j54 << 4);
        jArr[2] = j55;
        long j56 = j55 + (j54 << 1);
        jArr[2] = j56;
        jArr[2] = j56 + j54;
        long j57 = jArr[1];
        long j58 = jArr[11];
        long j59 = j57 + (j58 << 4);
        jArr[1] = j59;
        long j64 = j59 + (j58 << 1);
        jArr[1] = j64;
        jArr[1] = j64 + j58;
        long j65 = jArr[0];
        long j66 = jArr[10];
        long j67 = j65 + (j66 << 4);
        jArr[0] = j67;
        long j68 = j67 + (j66 << 1);
        jArr[0] = j68;
        jArr[0] = j68 + j66;
    }

    public static void scalarProduct(long[] jArr, long[] jArr2, long j8) {
        for (int i14 = 0; i14 < 10; i14++) {
            jArr[i14] = jArr2[i14] * j8;
        }
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[19];
        squareInner(jArr3, jArr2);
        reduce(jArr3, jArr);
    }

    private static void squareInner(long[] jArr, long[] jArr2) {
        long j8 = jArr2[0];
        jArr[0] = j8 * j8;
        long j14 = jArr2[0];
        jArr[1] = j14 * 2 * jArr2[1];
        long j15 = jArr2[1];
        jArr[2] = ((jArr2[2] * j14) + (j15 * j15)) * 2;
        long j16 = jArr2[2];
        jArr[3] = ((jArr2[3] * j14) + (j15 * j16)) * 2;
        long j17 = jArr2[3];
        jArr[4] = (j14 * 2 * jArr2[4]) + (j15 * 4 * j17) + (j16 * j16);
        long j18 = jArr2[4];
        long j19 = jArr2[5] * j14;
        jArr[5] = (j19 + (j15 * j18) + (j16 * j17)) * 2;
        long j24 = jArr2[6] * j14;
        long j25 = jArr2[5];
        jArr[6] = ((j15 * 2 * j25) + j24 + (j16 * j18) + (j17 * j17)) * 2;
        long j26 = jArr2[6];
        jArr[7] = ((jArr2[7] * j14) + (j15 * j26) + (j16 * j25) + (j17 * j18)) * 2;
        long j27 = (jArr2[8] * j14) + (j16 * j26);
        long j28 = jArr2[7];
        jArr[8] = (((((j17 * j25) + (j15 * j28)) * 2) + j27) * 2) + (j18 * j18);
        long j29 = jArr2[8];
        long j34 = j15 * j29;
        jArr[9] = ((j14 * jArr2[9]) + j34 + (j16 * j28) + (j17 * j26) + (j18 * j25)) * 2;
        long j35 = jArr2[9];
        jArr[10] = ((((j15 * j35) + (j17 * j28)) * 2) + (j16 * j29) + (j18 * j26) + (j25 * j25)) * 2;
        long j36 = j16 * j35;
        jArr[11] = (j36 + (j17 * j29) + (j18 * j28) + (j25 * j26)) * 2;
        jArr[12] = (((((j17 * j35) + (j25 * j28)) * 2) + (j18 * j29)) * 2) + (j26 * j26);
        long j37 = j18 * j35;
        jArr[13] = (j37 + (j25 * j29) + (j26 * j28)) * 2;
        long j38 = j25 * 2 * j35;
        jArr[14] = (j38 + (j26 * j29) + (j28 * j28)) * 2;
        jArr[15] = ((j26 * j35) + (j28 * j29)) * 2;
        jArr[16] = (j28 * 4 * j35) + (j29 * j29);
        jArr[17] = j29 * 2 * j35;
        jArr[18] = 2 * j35 * j35;
    }

    public static void sub(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i14 = 0; i14 < 10; i14++) {
            jArr[i14] = jArr2[i14] - jArr3[i14];
        }
    }

    public static void sum(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i14 = 0; i14 < 10; i14++) {
            jArr[i14] = jArr2[i14] + jArr3[i14];
        }
    }

    public static void sub(long[] jArr, long[] jArr2) {
        sub(jArr, jArr2, jArr);
    }

    public static void sum(long[] jArr, long[] jArr2) {
        sum(jArr, jArr, jArr2);
    }
}
