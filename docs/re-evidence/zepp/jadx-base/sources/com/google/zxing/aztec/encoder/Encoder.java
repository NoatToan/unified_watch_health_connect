package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;

/* JADX INFO: loaded from: classes4.dex */
public final class Encoder {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;
    private static final int a = 32;
    private static final int b = 4;
    private static final int[] c = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private Encoder() {
    }

    private static int[] a(BitArray bitArray, int i, int i2) {
        int[] iArr = new int[i2];
        int size = bitArray.getSize() / i;
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= bitArray.get((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    private static void b(BitMatrix bitMatrix, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    bitMatrix.set(i5, i4);
                    bitMatrix.set(i5, i6);
                    bitMatrix.set(i4, i5);
                    bitMatrix.set(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        bitMatrix.set(i7, i7);
        int i8 = i7 + 1;
        bitMatrix.set(i8, i7);
        bitMatrix.set(i7, i8);
        int i9 = i + i2;
        bitMatrix.set(i9, i7);
        bitMatrix.set(i9, i8);
        bitMatrix.set(i9, i9 - 1);
    }

    private static void c(BitMatrix bitMatrix, boolean z, int i, BitArray bitArray) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (bitArray.get(i3)) {
                    bitMatrix.set(i4, i2 - 5);
                }
                if (bitArray.get(i3 + 7)) {
                    bitMatrix.set(i2 + 5, i4);
                }
                if (bitArray.get(20 - i3)) {
                    bitMatrix.set(i4, i2 + 5);
                }
                if (bitArray.get(27 - i3)) {
                    bitMatrix.set(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (bitArray.get(i3)) {
                bitMatrix.set(i5, i2 - 7);
            }
            if (bitArray.get(i3 + 10)) {
                bitMatrix.set(i2 + 7, i5);
            }
            if (bitArray.get(29 - i3)) {
                bitMatrix.set(i5, i2 + 7);
            }
            if (bitArray.get(39 - i3)) {
                bitMatrix.set(i2 - 7, i5);
            }
            i3++;
        }
    }

    private static BitArray d(BitArray bitArray, int i, int i2) {
        int size = bitArray.getSize() / i2;
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(f(i2));
        int i3 = i / i2;
        int[] iArrA = a(bitArray, i2, i3);
        reedSolomonEncoder.encode(iArrA, i3 - size);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(0, i % i2);
        for (int i4 : iArrA) {
            bitArray2.appendBits(i4, i2);
        }
        return bitArray2;
    }

    public static BitArray e(boolean z, int i, int i2) {
        BitArray bitArray = new BitArray();
        if (z) {
            bitArray.appendBits(i - 1, 2);
            bitArray.appendBits(i2 - 1, 6);
            return d(bitArray, 28, 4);
        }
        bitArray.appendBits(i - 1, 5);
        bitArray.appendBits(i2 - 1, 11);
        return d(bitArray, 40, 4);
    }

    public static AztecCode encode(byte[] bArr) {
        return encode(bArr, 33, 0);
    }

    private static GenericGF f(int i) {
        if (i == 4) {
            return GenericGF.AZTEC_PARAM;
        }
        if (i == 6) {
            return GenericGF.AZTEC_DATA_6;
        }
        if (i == 8) {
            return GenericGF.AZTEC_DATA_8;
        }
        if (i == 10) {
            return GenericGF.AZTEC_DATA_10;
        }
        if (i == 12) {
            return GenericGF.AZTEC_DATA_12;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    public static BitArray g(BitArray bitArray, int i) {
        BitArray bitArray2 = new BitArray();
        int size = bitArray.getSize();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < size) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= size || bitArray.get(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                bitArray2.appendBits(i7, i);
            } else {
                if (i7 == 0) {
                    bitArray2.appendBits(i4 | 1, i);
                } else {
                    bitArray2.appendBits(i4, i);
                }
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return bitArray2;
    }

    private static int h(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    public static AztecCode encode(byte[] bArr, int i, int i2) {
        BitArray bitArrayG;
        int i3;
        boolean z;
        int iAbs;
        int iH;
        int i4;
        BitArray bitArrayEncode = new HighLevelEncoder(bArr).encode();
        int size = ((bitArrayEncode.getSize() * i) / 100) + 11;
        int size2 = bitArrayEncode.getSize() + size;
        int i5 = 0;
        int i6 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            iAbs = Math.abs(i2);
            if (iAbs > (z ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
            }
            iH = h(iAbs, z);
            i3 = c[iAbs];
            int i7 = iH - (iH % i3);
            bitArrayG = g(bitArrayEncode, i3);
            if (bitArrayG.getSize() + size > i7) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z && bitArrayG.getSize() > (i3 << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        } else {
            BitArray bitArrayG2 = null;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i8 > 32) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                boolean z2 = i8 <= 3;
                int i10 = z2 ? i8 + 1 : i8;
                int iH2 = h(i10, z2);
                if (size2 <= iH2) {
                    if (bitArrayG2 == null || i9 != c[i10]) {
                        int i11 = c[i10];
                        i9 = i11;
                        bitArrayG2 = g(bitArrayEncode, i11);
                    }
                    int i12 = iH2 - (iH2 % i9);
                    if ((!z2 || bitArrayG2.getSize() <= (i9 << 6)) && bitArrayG2.getSize() + size <= i12) {
                        bitArrayG = bitArrayG2;
                        i3 = i9;
                        z = z2;
                        iAbs = i10;
                        iH = iH2;
                        break;
                    }
                }
                i8++;
                i5 = 0;
                i6 = 1;
            }
        }
        BitArray bitArrayD = d(bitArrayG, iH, i3);
        int size3 = bitArrayG.getSize() / i3;
        BitArray bitArrayE = e(z, iAbs, size3);
        int i13 = (z ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i13];
        int i14 = 2;
        if (z) {
            for (int i15 = 0; i15 < i13; i15++) {
                iArr[i15] = i15;
            }
            i4 = i13;
        } else {
            int i16 = i13 / 2;
            i4 = i13 + 1 + (((i16 - 1) / 15) * 2);
            int i17 = i4 / 2;
            for (int i18 = 0; i18 < i16; i18++) {
                int i19 = (i18 / 15) + i18;
                iArr[(i16 - i18) - i6] = (i17 - i19) - 1;
                iArr[i16 + i18] = i19 + i17 + i6;
            }
        }
        BitMatrix bitMatrix = new BitMatrix(i4);
        int i20 = 0;
        int i21 = 0;
        while (i20 < iAbs) {
            int i22 = ((iAbs - i20) << i14) + (z ? 9 : 12);
            int i23 = 0;
            while (i23 < i22) {
                int i24 = i23 << 1;
                while (i5 < i14) {
                    if (bitArrayD.get(i21 + i24 + i5)) {
                        int i25 = i20 << 1;
                        bitMatrix.set(iArr[i25 + i5], iArr[i25 + i23]);
                    }
                    if (bitArrayD.get((i22 << 1) + i21 + i24 + i5)) {
                        int i26 = i20 << 1;
                        bitMatrix.set(iArr[i26 + i23], iArr[((i13 - 1) - i26) - i5]);
                    }
                    if (bitArrayD.get((i22 << 2) + i21 + i24 + i5)) {
                        int i27 = (i13 - 1) - (i20 << 1);
                        bitMatrix.set(iArr[i27 - i5], iArr[i27 - i23]);
                    }
                    if (bitArrayD.get((i22 * 6) + i21 + i24 + i5)) {
                        int i28 = i20 << 1;
                        bitMatrix.set(iArr[((i13 - 1) - i28) - i23], iArr[i28 + i5]);
                    }
                    i5++;
                    i14 = 2;
                }
                i23++;
                i5 = 0;
                i14 = 2;
            }
            i21 += i22 << 3;
            i20++;
            i5 = 0;
            i14 = 2;
        }
        c(bitMatrix, z, i4, bitArrayE);
        if (z) {
            b(bitMatrix, i4 / 2, 5);
        } else {
            int i29 = i4 / 2;
            b(bitMatrix, i29, 7);
            int i30 = 0;
            int i31 = 0;
            while (i31 < (i13 / 2) - 1) {
                for (int i32 = i29 & 1; i32 < i4; i32 += 2) {
                    int i33 = i29 - i30;
                    bitMatrix.set(i33, i32);
                    int i34 = i29 + i30;
                    bitMatrix.set(i34, i32);
                    bitMatrix.set(i32, i33);
                    bitMatrix.set(i32, i34);
                }
                i31 += 15;
                i30 += 16;
            }
        }
        AztecCode aztecCode = new AztecCode();
        aztecCode.setCompact(z);
        aztecCode.setSize(i4);
        aztecCode.setLayers(iAbs);
        aztecCode.setCodeWords(size3);
        aztecCode.setMatrix(bitMatrix);
        return aztecCode;
    }
}
