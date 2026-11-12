package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahg {
    public static int A(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr2[5]) & 4294967295L;
        long j8 = ((long) iArr2[6]) & 4294967295L;
        long j9 = ((long) iArr2[7]) & 4294967295L;
        long j10 = 0;
        int i = 0;
        while (i < 8) {
            long j11 = j9;
            long j12 = ((long) iArr[i]) & j;
            long j13 = j7;
            long j14 = (((long) iArr3[i]) & j) + (j12 * j2);
            iArr3[i] = (int) j14;
            int i2 = i + 1;
            long j15 = j3;
            long j16 = (j14 >>> 32) + (j12 * j3) + (((long) iArr3[i2]) & j);
            iArr3[i2] = (int) j16;
            int i3 = i + 2;
            long j17 = (j16 >>> 32) + (j12 * j4) + (((long) iArr3[i3]) & j);
            iArr3[i3] = (int) j17;
            int i4 = i + 3;
            long j18 = (j17 >>> 32) + (j12 * j5) + (((long) iArr3[i4]) & j);
            iArr3[i4] = (int) j18;
            int i5 = i + 4;
            long j19 = (j18 >>> 32) + (j12 * j6) + (((long) iArr3[i5]) & j);
            iArr3[i5] = (int) j19;
            int i6 = i + 5;
            long j20 = (j19 >>> 32) + (j12 * j13) + (((long) iArr3[i6]) & j);
            iArr3[i6] = (int) j20;
            int i7 = i + 6;
            long j21 = (j20 >>> 32) + (j12 * j8) + (((long) iArr3[i7]) & j);
            iArr3[i7] = (int) j21;
            int i8 = i + 7;
            long j22 = (j21 >>> 32) + (j12 * j11) + (((long) iArr3[i8]) & j);
            iArr3[i8] = (int) j22;
            int i9 = i + 8;
            long j23 = (j22 >>> 32) + j10 + (((long) iArr3[i9]) & j);
            iArr3[i9] = (int) j23;
            j10 = j23 >>> 32;
            i = i2;
            j9 = j11;
            j7 = j13;
            j3 = j15;
            j = 4294967295L;
        }
        return (int) j10;
    }

    public static int B(int i, int[] iArr, int[] iArr2) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((((long) iArr2[0]) & 4294967295L) * j) + (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((((long) iArr2[1]) & 4294967295L) * j) + (((long) iArr[1]) & 4294967295L);
        iArr2[1] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr2[2]) & 4294967295L) * j) + (((long) iArr[2]) & 4294967295L);
        iArr2[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr2[3]) & 4294967295L) * j) + (((long) iArr[3]) & 4294967295L);
        iArr2[3] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr2[4]) & 4294967295L) * j) + (((long) iArr[4]) & 4294967295L);
        iArr2[4] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr2[5]) & 4294967295L) * j) + (((long) iArr[5]) & 4294967295L);
        iArr2[5] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr2[6]) & 4294967295L) * j) + (((long) iArr[6]) & 4294967295L);
        iArr2[6] = (int) j8;
        long j9 = (j8 >>> 32) + (j * (((long) iArr2[7]) & 4294967295L)) + (4294967295L & ((long) iArr[7]));
        iArr2[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static void C(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i]) & 4294967295L;
        int i3 = 0;
        int i4 = 16;
        int i5 = 7;
        while (true) {
            int i6 = i5 - 1;
            long j2 = ((long) iArr[i + i5]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i2 + (i4 - 1)] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 -= 2;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i3 << 31)) & 4294967295L);
                iArr2[i2] = (int) j4;
                int i7 = ((int) (j4 >>> 32)) & 1;
                long j6 = ((long) iArr[i + 1]) & 4294967295L;
                int i8 = i2 + 2;
                long j7 = ((long) iArr2[i8]) & 4294967295L;
                long j8 = j5 + (j6 * j);
                int i9 = (int) j8;
                iArr2[i2 + 1] = (i9 << 1) | i7;
                int i10 = i9 >>> 31;
                long j9 = j7 + (j8 >>> 32);
                long j10 = ((long) iArr[i + 2]) & 4294967295L;
                int i11 = i2 + 3;
                long j11 = ((long) iArr2[i11]) & 4294967295L;
                int i12 = i2 + 4;
                long j12 = ((long) iArr2[i12]) & 4294967295L;
                long j13 = j9 + (j10 * j);
                int i13 = (int) j13;
                iArr2[i8] = (i13 << 1) | i10;
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = ((long) iArr[i + 3]) & 4294967295L;
                int i14 = i2 + 5;
                long j16 = ((long) iArr2[i14]) & 4294967295L;
                int i15 = i2 + 6;
                long j17 = ((long) iArr2[i15]) & 4294967295L;
                long j18 = (j14 & 4294967295L) + (j15 * j);
                int i16 = (int) j18;
                iArr2[i11] = (i16 << 1) | (i13 >>> 31);
                long j19 = j12 + (j14 >>> 32) + (j18 >>> 32) + (j15 * j6);
                long j20 = j16 + (j19 >>> 32) + (j15 * j10);
                long j21 = j17 + (j20 >>> 32);
                long j22 = ((long) iArr[i + 4]) & 4294967295L;
                int i17 = i2 + 7;
                long j23 = ((long) iArr2[i17]) & 4294967295L;
                int i18 = i2 + 8;
                long j24 = ((long) iArr2[i18]) & 4294967295L;
                long j25 = (j19 & 4294967295L) + (j22 * j);
                int i19 = (int) j25;
                iArr2[i12] = (i19 << 1) | (i16 >>> 31);
                int i20 = i19 >>> 31;
                long j26 = (j20 & 4294967295L) + (j25 >>> 32) + (j22 * j6);
                long j27 = j21 + (j26 >>> 32) + (j22 * j10);
                long j28 = j23 + (j27 >>> 32) + (j22 * j15);
                long j29 = j24 + (j28 >>> 32);
                long j30 = ((long) iArr[i + 5]) & 4294967295L;
                int i21 = i2 + 9;
                long j31 = ((long) iArr2[i21]) & 4294967295L;
                int i22 = i2 + 10;
                long j32 = ((long) iArr2[i22]) & 4294967295L;
                long j33 = (j26 & 4294967295L) + (j30 * j);
                int i23 = (int) j33;
                iArr2[i14] = i20 | (i23 << 1);
                int i24 = i23 >>> 31;
                long j34 = (j27 & 4294967295L) + (j33 >>> 32) + (j30 * j6);
                long j35 = (j28 & 4294967295L) + (j34 >>> 32) + (j30 * j10);
                long j36 = j29 + (j35 >>> 32) + (j30 * j15);
                long j37 = j31 + (j36 >>> 32) + (j30 * j22);
                long j38 = j32 + (j37 >>> 32);
                long j39 = ((long) iArr[i + 6]) & 4294967295L;
                int i25 = i2 + 11;
                long j40 = ((long) iArr2[i25]) & 4294967295L;
                int i26 = i2 + 12;
                long j41 = ((long) iArr2[i26]) & 4294967295L;
                long j42 = (j34 & 4294967295L) + (j39 * j);
                int i27 = (int) j42;
                iArr2[i15] = i24 | (i27 << 1);
                int i28 = i27 >>> 31;
                long j43 = (j35 & 4294967295L) + (j42 >>> 32) + (j39 * j6);
                long j44 = (j36 & 4294967295L) + (j43 >>> 32) + (j39 * j10);
                long j45 = (j37 & 4294967295L) + (j44 >>> 32) + (j39 * j15);
                long j46 = j38 + (j45 >>> 32) + (j39 * j22);
                long j47 = j40 + (j46 >>> 32) + (j39 * j30);
                long j48 = j41 + (j47 >>> 32);
                long j49 = ((long) iArr[i + 7]) & 4294967295L;
                int i29 = i2 + 13;
                long j50 = ((long) iArr2[i29]) & 4294967295L;
                int i30 = i2 + 14;
                long j51 = 4294967295L & ((long) iArr2[i30]);
                long j52 = (j43 & 4294967295L) + (j * j49);
                int i31 = (int) j52;
                iArr2[i17] = (i31 << 1) | i28;
                long j53 = (j44 & 4294967295L) + (j52 >>> 32) + (j6 * j49);
                long j54 = (j45 & 4294967295L) + (j53 >>> 32) + (j49 * j10);
                long j55 = (j46 & 4294967295L) + (j54 >>> 32) + (j49 * j15);
                long j56 = (j47 & 4294967295L) + (j55 >>> 32) + (j49 * j22);
                long j57 = j48 + (j56 >>> 32) + (j49 * j30);
                long j58 = j50 + (j57 >>> 32) + (j49 * j39);
                long j59 = j51 + (j58 >>> 32);
                int i32 = (int) j53;
                iArr2[i18] = (i31 >>> 31) | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) j54;
                iArr2[i21] = i33 | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = (int) j55;
                iArr2[i22] = i35 | (i36 << 1);
                int i37 = i36 >>> 31;
                int i38 = (int) j56;
                iArr2[i25] = i37 | (i38 << 1);
                int i39 = i38 >>> 31;
                int i40 = (int) j57;
                iArr2[i26] = i39 | (i40 << 1);
                int i41 = i40 >>> 31;
                int i42 = (int) j58;
                iArr2[i29] = i41 | (i42 << 1);
                int i43 = i42 >>> 31;
                int i44 = (int) j59;
                iArr2[i30] = i43 | (i44 << 1);
                int i45 = i44 >>> 31;
                int i46 = i2 + 15;
                iArr2[i46] = i45 | ((iArr2[i46] + ((int) (j59 >> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static void D(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 16;
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i2 << 31)) & 4294967295L);
                iArr2[0] = (int) j4;
                long j6 = ((long) iArr[1]) & 4294967295L;
                long j7 = ((long) iArr2[2]) & 4294967295L;
                long j8 = j5 + (j6 * j);
                int i5 = (int) j8;
                iArr2[1] = (i5 << 1) | (((int) (j4 >>> 32)) & 1);
                int i6 = i5 >>> 31;
                long j9 = j7 + (j8 >>> 32);
                long j10 = ((long) iArr[2]) & 4294967295L;
                long j11 = ((long) iArr2[3]) & 4294967295L;
                long j12 = ((long) iArr2[4]) & 4294967295L;
                long j13 = j9 + (j10 * j);
                int i7 = (int) j13;
                iArr2[2] = (i7 << 1) | i6;
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = j12 + (j14 >>> 32);
                long j16 = ((long) iArr[3]) & 4294967295L;
                long j17 = ((long) iArr2[5]) & 4294967295L;
                long j18 = ((long) iArr2[6]) & 4294967295L;
                long j19 = (j14 & 4294967295L) + (j16 * j);
                int i8 = (int) j19;
                iArr2[3] = (i8 << 1) | (i7 >>> 31);
                int i9 = i8 >>> 31;
                long j20 = j15 + (j19 >>> 32) + (j16 * j6);
                long j21 = j17 + (j20 >>> 32) + (j16 * j10);
                long j22 = j18 + (j21 >>> 32);
                long j23 = ((long) iArr[4]) & 4294967295L;
                long j24 = ((long) iArr2[7]) & 4294967295L;
                long j25 = ((long) iArr2[8]) & 4294967295L;
                long j26 = (j20 & 4294967295L) + (j23 * j);
                int i10 = (int) j26;
                iArr2[4] = (i10 << 1) | i9;
                int i11 = i10 >>> 31;
                long j27 = (j21 & 4294967295L) + (j26 >>> 32) + (j23 * j6);
                long j28 = j22 + (j27 >>> 32) + (j23 * j10);
                long j29 = j24 + (j28 >>> 32) + (j23 * j16);
                long j30 = j25 + (j29 >>> 32);
                long j31 = ((long) iArr[5]) & 4294967295L;
                long j32 = ((long) iArr2[9]) & 4294967295L;
                long j33 = ((long) iArr2[10]) & 4294967295L;
                long j34 = (j27 & 4294967295L) + (j31 * j);
                int i12 = (int) j34;
                iArr2[5] = (i12 << 1) | i11;
                int i13 = i12 >>> 31;
                long j35 = (j28 & 4294967295L) + (j34 >>> 32) + (j31 * j6);
                long j36 = (j29 & 4294967295L) + (j35 >>> 32) + (j31 * j10);
                long j37 = j30 + (j36 >>> 32) + (j31 * j16);
                long j38 = j32 + (j37 >>> 32) + (j31 * j23);
                long j39 = j33 + (j38 >>> 32);
                long j40 = ((long) iArr[6]) & 4294967295L;
                long j41 = ((long) iArr2[11]) & 4294967295L;
                long j42 = ((long) iArr2[12]) & 4294967295L;
                long j43 = (j35 & 4294967295L) + (j40 * j);
                int i14 = (int) j43;
                iArr2[6] = (i14 << 1) | i13;
                int i15 = i14 >>> 31;
                long j44 = (j36 & 4294967295L) + (j43 >>> 32) + (j40 * j6);
                long j45 = (j37 & 4294967295L) + (j44 >>> 32) + (j40 * j10);
                long j46 = j44 & 4294967295L;
                long j47 = (j38 & 4294967295L) + (j45 >>> 32) + (j40 * j16);
                long j48 = j39 + (j47 >>> 32) + (j40 * j23);
                long j49 = j41 + (j48 >>> 32) + (j40 * j31);
                long j50 = j42 + (j49 >>> 32);
                long j51 = ((long) iArr[7]) & 4294967295L;
                long j52 = ((long) iArr2[13]) & 4294967295L;
                long j53 = 4294967295L & ((long) iArr2[14]);
                long j54 = j46 + (j51 * j);
                int i16 = (int) j54;
                iArr2[7] = (i16 << 1) | i15;
                long j55 = (j45 & 4294967295L) + (j54 >>> 32) + (j51 * j6);
                long j56 = (j47 & 4294967295L) + (j55 >>> 32) + (j10 * j51);
                long j57 = (j48 & 4294967295L) + (j56 >>> 32) + (j51 * j16);
                long j58 = (j49 & 4294967295L) + (j57 >>> 32) + (j51 * j23);
                long j59 = j50 + (j58 >>> 32) + (j51 * j31);
                long j60 = j52 + (j59 >>> 32) + (j51 * j40);
                long j61 = j53 + (j60 >>> 32);
                int i17 = (int) j55;
                iArr2[8] = (i17 << 1) | (i16 >>> 31);
                int i18 = (int) j56;
                iArr2[9] = (i18 << 1) | (i17 >>> 31);
                int i19 = (int) j57;
                iArr2[10] = (i18 >>> 31) | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j58;
                iArr2[11] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) j59;
                iArr2[12] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j60;
                iArr2[13] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j61;
                iArr2[14] = i26 | (i27 << 1);
                iArr2[15] = (i27 >>> 31) | ((iArr2[15] + ((int) (j61 >> 32))) << 1);
                return;
            }
            i3 = i4;
        }
    }

    public static int E(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & 4294967295L) - (((long) iArr2[i2]) & 4294967295L);
        iArr3[i3] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L));
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L));
        iArr3[i3 + 5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L));
        iArr3[i3 + 6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i2 + 7]) & 4294967295L));
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int F(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int G(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L));
        iArr2[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L));
        iArr2[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7])));
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static BigInteger H(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                ahh.a(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger I(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                ahh.b(j, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void J(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int c(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (((long) i3) & 4294967295L) + (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L);
        iArr2[i8] = (int) j6;
        int i9 = i2 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i9]) & 4294967295L);
        iArr2[i9] = (int) j7;
        int i10 = i2 + 7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i10]));
        iArr2[i10] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int d(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr2[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr2[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (4294967295L & ((long) iArr2[7]));
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int e(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i4]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L);
        int i6 = (int) j2;
        iArr[i4] = i6;
        iArr2[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i7]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L);
        int i9 = (int) j3;
        iArr[i7] = i9;
        iArr2[i8] = i9;
        int i10 = i + 3;
        int i11 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i10]) & 4294967295L) + (((long) iArr2[i11]) & 4294967295L);
        int i12 = (int) j4;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        int i13 = i + 4;
        int i14 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i13]) & 4294967295L) + (((long) iArr2[i14]) & 4294967295L);
        int i15 = (int) j5;
        iArr[i13] = i15;
        iArr2[i14] = i15;
        int i16 = i + 5;
        int i17 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i16]) & 4294967295L) + (((long) iArr2[i17]) & 4294967295L);
        int i18 = (int) j6;
        iArr[i16] = i18;
        iArr2[i17] = i18;
        int i19 = i + 6;
        int i20 = i2 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i19]) & 4294967295L) + (((long) iArr2[i20]) & 4294967295L);
        int i21 = (int) j7;
        iArr[i19] = i21;
        iArr2[i20] = i21;
        int i22 = i + 7;
        int i23 = i2 + 7;
        long j8 = (j7 >>> 32) + (((long) iArr[i22]) & 4294967295L) + (4294967295L & ((long) iArr2[i23]));
        int i24 = (int) j8;
        iArr[i22] = i24;
        iArr2[i23] = i24;
        return (int) (j8 >>> 32);
    }

    public static int[] f() {
        return new int[8];
    }

    public static long[] g() {
        return new long[4];
    }

    public static int[] h() {
        return new int[16];
    }

    public static long[] i() {
        return new long[8];
    }

    public static boolean j(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean zP = p(iArr, i, iArr2, i2);
        if (zP) {
            E(iArr, i, iArr2, i2, iArr3, i3);
        } else {
            E(iArr2, i2, iArr, i, iArr3, i3);
        }
        return zP;
    }

    public static boolean k(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] m(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArrF = f();
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArrF[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArrF;
    }

    public static long[] n(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArrG = g();
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArrG[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArrG;
    }

    public static int o(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            if ((i & 255) != i) {
                return 0;
            }
            i2 = iArr[i >>> 5] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean p(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 7; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean q(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean r(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean s(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void v(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & 4294967295L;
        long j2 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j4 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j6 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j7 = ((long) iArr2[i2 + 6]) & 4294967295L;
        long j8 = ((long) iArr2[i2 + 7]) & 4294967295L;
        long j9 = ((long) iArr[i]) & 4294967295L;
        long j10 = j9 * j;
        iArr3[i3] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr3[i3 + 1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j3);
        iArr3[i3 + 2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j4);
        iArr3[i3 + 3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j5);
        iArr3[i3 + 4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr3[i3 + 5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr3[i3 + 6] = (int) j16;
        long j17 = j8;
        long j18 = (j16 >>> 32) + (j9 * j17);
        iArr3[i3 + 7] = (int) j18;
        iArr3[i3 + 8] = (int) (j18 >>> 32);
        int i4 = 1;
        int i5 = i3;
        while (i4 < 8) {
            int i6 = i5 + 1;
            long j19 = ((long) iArr[i + i4]) & 4294967295L;
            long j20 = j17;
            int i7 = i4;
            long j21 = (j19 * j) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j21;
            int i8 = i5 + 2;
            long j22 = (j21 >>> 32) + (j19 * j2) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j22;
            int i9 = i5 + 3;
            long j23 = j3;
            long j24 = (j22 >>> 32) + (j19 * j3) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j24;
            int i10 = i5 + 4;
            int i11 = i5;
            long j25 = (j24 >>> 32) + (j19 * j4) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j25;
            int i12 = i11 + 5;
            long j26 = (j25 >>> 32) + (j19 * j5) + (((long) iArr3[i12]) & 4294967295L);
            iArr3[i12] = (int) j26;
            int i13 = i11 + 6;
            long j27 = (j26 >>> 32) + (j19 * j6) + (((long) iArr3[i13]) & 4294967295L);
            iArr3[i13] = (int) j27;
            int i14 = i11 + 7;
            long j28 = (j27 >>> 32) + (j19 * j7) + (((long) iArr3[i14]) & 4294967295L);
            iArr3[i14] = (int) j28;
            int i15 = i11 + 8;
            long j29 = (j28 >>> 32) + (j19 * j20) + (((long) iArr3[i15]) & 4294967295L);
            iArr3[i15] = (int) j29;
            iArr3[i11 + 9] = (int) (j29 >>> 32);
            i4 = i7 + 1;
            i5 = i6;
            j3 = j23;
            j17 = j20;
        }
    }

    public static void w(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = ((long) iArr[0]) & 4294967295L;
        long j10 = j9 * j;
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j3);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j4);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j5);
        iArr3[4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr3[6] = (int) j16;
        long j17 = (j16 >>> 32) + (j9 * j8);
        iArr3[7] = (int) j17;
        iArr3[8] = (int) (j17 >>> 32);
        int i = 1;
        for (int i2 = 8; i < i2; i2 = 8) {
            long j18 = ((long) iArr[i]) & 4294967295L;
            long j19 = (j18 * j) + (((long) iArr3[i]) & 4294967295L);
            iArr3[i] = (int) j19;
            int i3 = i + 1;
            long j20 = (j19 >>> 32) + (j18 * j2) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j20;
            int i4 = i + 2;
            long j21 = j2;
            long j22 = (j20 >>> 32) + (j18 * j3) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j22;
            int i5 = i + 3;
            long j23 = (j22 >>> 32) + (j18 * j4) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j23;
            int i6 = i + 4;
            long j24 = (j23 >>> 32) + (j18 * j5) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j24;
            int i7 = i + 5;
            long j25 = (j24 >>> 32) + (j18 * j6) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j25;
            int i8 = i + 6;
            long j26 = (j25 >>> 32) + (j18 * j7) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j26;
            int i9 = i + 7;
            long j27 = (j26 >>> 32) + (j18 * j8) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j27;
            iArr3[i + 8] = (int) (j27 >>> 32);
            j4 = j4;
            j = j;
            i = i3;
            j2 = j21;
        }
    }

    public static long x(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((long) iArr[i2]) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr2[i3]) & 4294967295L);
        iArr3[i4] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & 4294967295L;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (((long) iArr2[i3 + 1]) & 4294967295L);
        iArr3[i4 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = ((long) iArr[i2 + 2]) & 4294967295L;
        long j8 = j6 + (j * j7) + j4 + (((long) iArr2[i3 + 2]) & 4294967295L);
        iArr3[i4 + 2] = (int) j8;
        long j9 = ((long) iArr[i2 + 3]) & 4294967295L;
        long j10 = (j8 >>> 32) + (j * j9) + j7 + (((long) iArr2[i3 + 3]) & 4294967295L);
        iArr3[i4 + 3] = (int) j10;
        long j11 = ((long) iArr[i2 + 4]) & 4294967295L;
        long j12 = (j10 >>> 32) + (j * j11) + j9 + (((long) iArr2[i3 + 4]) & 4294967295L);
        iArr3[i4 + 4] = (int) j12;
        long j13 = ((long) iArr[i2 + 5]) & 4294967295L;
        long j14 = (j12 >>> 32) + (j * j13) + j11 + (((long) iArr2[i3 + 5]) & 4294967295L);
        iArr3[i4 + 5] = (int) j14;
        long j15 = ((long) iArr[i2 + 6]) & 4294967295L;
        long j16 = (j14 >>> 32) + (j * j15) + j13 + (((long) iArr2[i3 + 6]) & 4294967295L);
        iArr3[i4 + 6] = (int) j16;
        long j17 = ((long) iArr[i2 + 7]) & 4294967295L;
        long j18 = (j16 >>> 32) + (j * j17) + j15 + (4294967295L & ((long) iArr2[i3 + 7]));
        iArr3[i4 + 7] = (int) j18;
        return (j18 >>> 32) + j17;
    }

    public static int y(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = j & 4294967295L;
        long j4 = (j2 * j3) + (((long) iArr[i2]) & 4294967295L);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        int i3 = i2 + 1;
        long j7 = (j4 >>> 32) + j6 + (((long) iArr[i3]) & 4294967295L);
        iArr[i3] = (int) j7;
        int i4 = i2 + 2;
        long j8 = (j7 >>> 32) + j5 + (((long) iArr[i4]) & 4294967295L);
        iArr[i4] = (int) j8;
        long j9 = j8 >>> 32;
        int i5 = i2 + 3;
        long j10 = j9 + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return xgg.t(8, iArr, i2, 4);
    }

    public static int z(int i, int i2, int[] iArr, int i3) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((long) i2) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr[i3]) & 4294967295L);
        iArr[i3] = (int) j3;
        int i4 = i3 + 1;
        long j4 = (j3 >>> 32) + j2 + (((long) iArr[i4]) & 4294967295L);
        iArr[i4] = (int) j4;
        long j5 = j4 >>> 32;
        int i5 = i3 + 2;
        long j6 = j5 + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return xgg.t(8, iArr, i3, 3);
    }
}
