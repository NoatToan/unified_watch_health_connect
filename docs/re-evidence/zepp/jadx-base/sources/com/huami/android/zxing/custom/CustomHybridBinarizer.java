package com.huami.android.zxing.custom;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GlobalHistogramBinarizer;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomHybridBinarizer extends GlobalHistogramBinarizer {
    private static final int i = 3;
    private static final int j = 5;
    private static int k = 3;
    private static int l = 0;
    private static int m = 0;
    private static int n = 0;
    private static final int o = 24;
    private BitMatrix h;

    static {
        int i2 = 1 << 3;
        l = i2;
        m = i2 - 1;
        n = i2 * 5;
    }

    public CustomHybridBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a0 A[PHI: r2
      0x00a0: PHI (r2v5 int) = (r2v4 int), (r2v8 int), (r2v8 int) binds: [B:34:0x007d, B:36:0x0081, B:37:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    private static int[][] c(byte[] bArr, int i2, int i3, int i4, int i5) {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, i3, i2);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = i6 << k;
            int i8 = i5 - l;
            if (i7 > i8) {
                i7 = i8;
            }
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = i9 << k;
                int i11 = i4 - l;
                if (i10 > i11) {
                    i10 = i11;
                }
                int i12 = (i7 * i4) + i10;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 255;
                while (i13 < l) {
                    for (int i17 = 0; i17 < l; i17++) {
                        int i18 = bArr[i12 + i17] & 255;
                        i14 += i18;
                        if (i18 < i16) {
                            i16 = i18;
                        }
                        if (i18 > i15) {
                            i15 = i18;
                        }
                    }
                    if (i15 - i16 > 24) {
                        while (true) {
                            i13++;
                            i12 += i4;
                            if (i13 < l) {
                                for (int i19 = 0; i19 < l; i19++) {
                                    i14 += bArr[i12 + i19] & 255;
                                }
                            }
                        }
                    }
                    i13++;
                    i12 += i4;
                }
                int i20 = i14 >> (k * 2);
                if (i15 - i16 <= 24) {
                    i20 = i16 / 2;
                    if (i6 > 0 && i9 > 0) {
                        int i21 = i6 - 1;
                        int i22 = i9 - 1;
                        int i23 = ((iArr[i21][i9] + (iArr[i6][i22] * 2)) + iArr[i21][i22]) / 4;
                        if (i16 < i23) {
                            i20 = i23;
                        }
                    }
                }
                iArr[i6][i9] = i20;
            }
        }
        return iArr;
    }

    private static void d() {
        int i2 = 1 << k;
        l = i2;
        m = i2 - 1;
        n = i2 * 5;
    }

    private static void e(byte[] bArr, int i2, int i3, int i4, int i5, int[][] iArr, BitMatrix bitMatrix) {
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = i6 << k;
            int i8 = i5 - l;
            if (i7 > i8) {
                i7 = i8;
            }
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = i9 << k;
                int i11 = i4 - l;
                if (i10 <= i11) {
                    i11 = i10;
                }
                int iF = f(i9, 2, i2 - 3);
                int iF2 = f(i6, 2, i3 - 3);
                int i12 = 0;
                for (int i13 = -2; i13 <= 2; i13++) {
                    int[] iArr2 = iArr[iF2 + i13];
                    i12 += iArr2[iF - 2] + iArr2[iF - 1] + iArr2[iF] + iArr2[iF + 1] + iArr2[iF + 2];
                }
                g(bArr, i11, i7, i12 / 25, i4, bitMatrix);
            }
        }
    }

    private static int f(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        return i2 > i4 ? i4 : i2;
    }

    private static void g(byte[] bArr, int i2, int i3, int i4, int i5, BitMatrix bitMatrix) {
        int i6 = (i3 * i5) + i2;
        int i7 = 0;
        while (i7 < l) {
            for (int i8 = 0; i8 < l; i8++) {
                if ((bArr[i6 + i8] & 255) <= i4) {
                    bitMatrix.set(i2 + i8, i3 + i7);
                }
            }
            i7++;
            i6 += i5;
        }
    }

    public static void setBlockSizePower(int i2) {
        k = i2;
        d();
    }

    public static void setBlockSizePowerDefault() {
        k = 3;
        d();
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new CustomHybridBinarizer(luminanceSource);
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
        int i2 = n;
        if (width < i2 || height < i2) {
            this.h = super.getBlackMatrix();
        } else {
            byte[] matrix = luminanceSource.getMatrix();
            int i3 = k;
            int i4 = width >> i3;
            int i5 = m;
            if ((width & i5) != 0) {
                i4++;
            }
            int i6 = height >> i3;
            if ((i5 & height) != 0) {
                i6++;
            }
            int i7 = i6;
            int[][] iArrC = c(matrix, i4, i7, width, height);
            BitMatrix bitMatrix2 = new BitMatrix(width, height);
            e(matrix, i4, i7, width, height, iArrC, bitMatrix2);
            this.h = bitMatrix2;
        }
        return this.h;
    }
}
