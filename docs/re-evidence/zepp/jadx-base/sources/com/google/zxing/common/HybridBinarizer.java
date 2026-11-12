package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
public final class HybridBinarizer extends GlobalHistogramBinarizer {
    private static final int i = 3;
    private static final int j = 8;
    private static final int k = 7;
    private static final int l = 40;
    private static final int m = 24;
    private BitMatrix h;

    public HybridBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009e A[PHI: r5
      0x009e: PHI (r5v3 int) = (r5v2 int), (r5v6 int), (r5v6 int) binds: [B:31:0x007b, B:33:0x007f, B:34:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    private static int[][] c(byte[] bArr, int i2, int i3, int i4, int i5) {
        int i6 = 8;
        int i7 = i5 - 8;
        int i8 = i4 - 8;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, i3, i2);
        int i9 = 0;
        while (i9 < i3) {
            int i10 = i9 << 3;
            if (i10 > i7) {
                i10 = i7;
            }
            int i11 = 0;
            while (i11 < i2) {
                int i12 = i11 << 3;
                if (i12 > i8) {
                    i12 = i8;
                }
                int i13 = (i10 * i4) + i12;
                int i14 = 255;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (i15 < i6) {
                    int i18 = i17;
                    int i19 = 0;
                    while (i19 < i6) {
                        int i20 = bArr[i13 + i19] & 255;
                        i16 += i20;
                        if (i20 < i14) {
                            i14 = i20;
                        }
                        if (i20 > i18) {
                            i18 = i20;
                        }
                        i19++;
                        i6 = 8;
                    }
                    if (i18 - i14 > 24) {
                        while (true) {
                            i15++;
                            i13 += i4;
                            if (i15 < 8) {
                                int i21 = 0;
                                for (int i22 = 8; i21 < i22; i22 = 8) {
                                    i16 += bArr[i13 + i21] & 255;
                                    i21++;
                                }
                            }
                        }
                    }
                    i15++;
                    i13 += i4;
                    i17 = i18;
                    i6 = 8;
                }
                int i23 = i16 >> 6;
                if (i17 - i14 <= 24) {
                    i23 = i14 / 2;
                    if (i9 > 0 && i11 > 0) {
                        int i24 = i9 - 1;
                        int i25 = i11 - 1;
                        int i26 = ((iArr[i24][i11] + (iArr[i9][i25] * 2)) + iArr[i24][i25]) / 4;
                        if (i14 < i26) {
                            i23 = i26;
                        }
                    }
                }
                iArr[i9][i11] = i23;
                i11++;
                i6 = 8;
            }
            i9++;
            i6 = 8;
        }
        return iArr;
    }

    private static void d(byte[] bArr, int i2, int i3, int i4, int i5, int[][] iArr, BitMatrix bitMatrix) {
        int i6 = i5 - 8;
        int i7 = i4 - 8;
        for (int i8 = 0; i8 < i3; i8++) {
            int i9 = i8 << 3;
            int i10 = i9 > i6 ? i6 : i9;
            int iE = e(i8, 2, i3 - 3);
            for (int i11 = 0; i11 < i2; i11++) {
                int i12 = i11 << 3;
                int i13 = i12 > i7 ? i7 : i12;
                int iE2 = e(i11, 2, i2 - 3);
                int i14 = 0;
                for (int i15 = -2; i15 <= 2; i15++) {
                    int[] iArr2 = iArr[iE + i15];
                    i14 += iArr2[iE2 - 2] + iArr2[iE2 - 1] + iArr2[iE2] + iArr2[iE2 + 1] + iArr2[iE2 + 2];
                }
                f(bArr, i13, i10, i14 / 25, i4, bitMatrix);
            }
        }
    }

    private static int e(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        return i2 > i4 ? i4 : i2;
    }

    private static void f(byte[] bArr, int i2, int i3, int i4, int i5, BitMatrix bitMatrix) {
        int i6 = (i3 * i5) + i2;
        int i7 = 0;
        while (i7 < 8) {
            for (int i8 = 0; i8 < 8; i8++) {
                if ((bArr[i6 + i8] & 255) <= i4) {
                    bitMatrix.set(i2 + i8, i3 + i7);
                }
            }
            i7++;
            i6 += i5;
        }
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new HybridBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public BitMatrix getBlackMatrix() throws NotFoundException {
        BitMatrix bitMatrix = this.h;
        if (bitMatrix != null) {
            return bitMatrix;
        }
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        if (width < 40 || height < 40) {
            this.h = super.getBlackMatrix();
        } else {
            byte[] matrix = luminanceSource.getMatrix();
            int i2 = width >> 3;
            if ((width & 7) != 0) {
                i2++;
            }
            int i3 = i2;
            int i4 = height >> 3;
            if ((height & 7) != 0) {
                i4++;
            }
            int i5 = i4;
            int[][] iArrC = c(matrix, i3, i5, width, height);
            BitMatrix bitMatrix2 = new BitMatrix(width, height);
            d(matrix, i3, i5, width, height, iArrC, bitMatrix2);
            this.h = bitMatrix2;
        }
        return this.h;
    }
}
