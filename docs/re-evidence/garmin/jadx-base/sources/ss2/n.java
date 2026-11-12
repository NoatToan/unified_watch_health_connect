package ss2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class n {
    public static int[] a(int i14, int i15, byte[] bArr) {
        int[] iArr = new int[(i15 & 3) == 0 ? i15 >>> 2 : (i15 >>> 2) + 1];
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i16 >>> 2;
            iArr[i17] = iArr[i17] | ((bArr[i16 + i14] & 255) << ((i16 & 3) << 3));
        }
        return iArr;
    }

    public static byte[] b(byte[] bArr, int i14, int i15, boolean z14, byte[] bArr2) {
        if (i15 == 0) {
            return new byte[0];
        }
        if (i15 % 4 != 0) {
            return Arrays.copyOfRange(bArr, i14, i15 + i14);
        }
        int[] iArrA = a(i14, i15, bArr);
        int[] iArrA2 = a(0, bArr2.length, bArr2);
        int length = iArrA.length;
        int i16 = length - 1;
        int i17 = iArrA[i16];
        int iE = iArrA[0];
        int i18 = ((52 / length) + 6) * (-1640531527);
        do {
            int i19 = (i18 >>> 2) & 3;
            int i24 = i16;
            int iE2 = iE;
            while (i24 > 0) {
                iE2 = iArrA[i24] - e(i18, iE2, iArrA[i24 - 1], i24, i19, iArrA2);
                iArrA[i24] = iE2;
                i24--;
            }
            iE = iArrA[0] - e(i18, iE2, iArrA[i16], i24, i19, iArrA2);
            iArrA[0] = iE;
            i18 += 1640531527;
        } while (i18 != 0);
        byte[] bArrD = d(iArrA);
        if (!z14) {
            return bArrD;
        }
        int length2 = bArrD.length - (bArrD[0] + 1);
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArrD, 1, bArr3, 0, length2);
        return bArr3;
    }

    public static byte[] c(int i14, boolean z14, byte[] bArr, byte[] bArr2) {
        if (i14 == 0) {
            return new byte[0];
        }
        if (z14) {
            int i15 = 4;
            int i16 = 4 - (i14 % 4);
            if (i16 == 1) {
                i15 = 5;
            } else if (i16 != 0) {
                i15 = i16;
            }
            int i17 = i14 + i15;
            byte[] bArr3 = new byte[i17];
            bArr3[0] = (byte) (i15 - 1);
            System.arraycopy(bArr, 0, bArr3, 1, i14);
            i14 = i17;
            bArr = bArr3;
        }
        int[] iArrA = a(0, i14, bArr);
        int[] iArrA2 = a(0, bArr2.length, bArr2);
        int length = iArrA.length;
        int i18 = (52 / length) + 6;
        int i19 = length - 1;
        int iE = iArrA[i19];
        int i24 = 0;
        while (true) {
            int i25 = i24 - 1640531527;
            int i26 = (i25 >>> 2) & 3;
            int iE2 = iE;
            int i27 = 0;
            while (i27 < i19) {
                int i28 = i27 + 1;
                iE2 = iArrA[i27] + e(i25, iArrA[i28], iE2, i27, i26, iArrA2);
                iArrA[i27] = iE2;
                i27 = i28;
            }
            iE = iArrA[i19] + e(i25, iArrA[0], iE2, i27, i26, iArrA2);
            iArrA[i19] = iE;
            i18--;
            if (i18 <= 0) {
                return d(iArrA);
            }
            i24 = i25;
        }
    }

    public static byte[] d(int[] iArr) {
        int length = iArr.length << 2;
        byte[] bArr = new byte[length];
        for (int i14 = 0; i14 < length; i14++) {
            bArr[i14] = (byte) ((iArr[i14 >>> 2] >>> ((i14 & 3) << 3)) & 255);
        }
        return bArr;
    }

    public static int e(int i14, int i15, int i16, int i17, int i18, int[] iArr) {
        return ((i14 ^ i15) + (iArr[(i17 & 3) ^ i18] ^ i16)) ^ (((i16 >>> 5) ^ (i15 << 2)) + ((i15 >>> 3) ^ (i16 << 4)));
    }
}
