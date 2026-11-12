package com.google.zxing.pdf417.detector;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Detector {
    private static final float c = 0.42f;
    private static final float d = 0.8f;
    private static final int g = 3;
    private static final int h = 5;
    private static final int i = 25;
    private static final int j = 5;
    private static final int k = 10;
    private static final int[] a = {0, 4, 1, 5};
    private static final int[] b = {6, 2, 7, 3};
    private static final int[] e = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] f = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private Detector() {
    }

    private static void a(ResultPoint[] resultPointArr, ResultPoint[] resultPointArr2, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            resultPointArr[iArr[i2]] = resultPointArr2[i2];
        }
    }

    private static List<ResultPoint[]> b(boolean z, BitMatrix bitMatrix) {
        int x;
        float y;
        ArrayList<ResultPoint[]> arrayList = new ArrayList();
        int iMax = 0;
        loop0: while (true) {
            int i2 = 0;
            boolean z2 = false;
            while (iMax < bitMatrix.getHeight()) {
                ResultPoint[] resultPointArrE = e(bitMatrix, iMax, i2);
                if (resultPointArrE[0] == null && resultPointArrE[3] == null) {
                    if (!z2) {
                        break;
                    }
                    for (ResultPoint[] resultPointArr : arrayList) {
                        if (resultPointArr[1] != null) {
                            iMax = (int) Math.max(iMax, resultPointArr[1].getY());
                        }
                        if (resultPointArr[3] != null) {
                            iMax = Math.max(iMax, (int) resultPointArr[3].getY());
                        }
                    }
                    iMax += 5;
                } else {
                    arrayList.add(resultPointArrE);
                    if (!z) {
                        break loop0;
                    }
                    if (resultPointArrE[2] != null) {
                        x = (int) resultPointArrE[2].getX();
                        y = resultPointArrE[2].getY();
                    } else {
                        x = (int) resultPointArrE[4].getX();
                        y = resultPointArrE[4].getY();
                    }
                    iMax = (int) y;
                    i2 = x;
                    z2 = true;
                }
            }
            break loop0;
        }
        return arrayList;
    }

    private static int[] c(BitMatrix bitMatrix, int i2, int i3, int i4, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i5 = 0;
        while (bitMatrix.get(i2, i3) && i2 > 0) {
            int i6 = i5 + 1;
            if (i5 >= 3) {
                break;
            }
            i2--;
            i5 = i6;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i7 = 0;
        int i8 = i2;
        while (i2 < i4) {
            if (bitMatrix.get(i2, i3) != z2) {
                iArr2[i7] = iArr2[i7] + 1;
            } else {
                if (i7 != length - 1) {
                    i7++;
                } else {
                    if (f(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i8, i2};
                    }
                    i8 += iArr2[0] + iArr2[1];
                    int i9 = i7 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i7] = 0;
                    i7--;
                }
                iArr2[i7] = 1;
                z2 = !z2;
            }
            i2++;
        }
        if (i7 != length - 1 || f(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i8, i2 - 1};
    }

    private static ResultPoint[] d(BitMatrix bitMatrix, int i2, int i3, int i4, int i5, int[] iArr) {
        boolean z;
        int i6;
        int i7;
        int i8;
        ResultPoint[] resultPointArr = new ResultPoint[4];
        int[] iArr2 = new int[iArr.length];
        int i9 = i4;
        while (true) {
            if (i9 >= i2) {
                z = false;
                break;
            }
            int[] iArrC = c(bitMatrix, i5, i9, i3, false, iArr, iArr2);
            if (iArrC != null) {
                int i10 = i9;
                int[] iArr3 = iArrC;
                int i11 = i10;
                while (true) {
                    if (i11 <= 0) {
                        i8 = i11;
                        break;
                    }
                    int i12 = i11 - 1;
                    int[] iArrC2 = c(bitMatrix, i5, i12, i3, false, iArr, iArr2);
                    if (iArrC2 == null) {
                        i8 = i12 + 1;
                        break;
                    }
                    iArr3 = iArrC2;
                    i11 = i12;
                }
                float f2 = i8;
                resultPointArr[0] = new ResultPoint(iArr3[0], f2);
                resultPointArr[1] = new ResultPoint(iArr3[1], f2);
                i9 = i8;
                z = true;
                break;
            }
            i9 += 5;
        }
        int i13 = i9 + 1;
        if (z) {
            int[] iArr4 = {(int) resultPointArr[0].getX(), (int) resultPointArr[1].getX()};
            int i14 = i13;
            int i15 = 0;
            while (true) {
                if (i14 >= i2) {
                    i6 = i15;
                    i7 = i14;
                    break;
                }
                i6 = i15;
                i7 = i14;
                int[] iArrC3 = c(bitMatrix, iArr4[0], i14, i3, false, iArr, iArr2);
                if (iArrC3 != null && Math.abs(iArr4[0] - iArrC3[0]) < 5 && Math.abs(iArr4[1] - iArrC3[1]) < 5) {
                    iArr4 = iArrC3;
                    i15 = 0;
                } else {
                    if (i6 > 25) {
                        break;
                    }
                    i15 = i6 + 1;
                }
                i14 = i7 + 1;
            }
            i13 = i7 - (i6 + 1);
            float f3 = i13;
            resultPointArr[2] = new ResultPoint(iArr4[0], f3);
            resultPointArr[3] = new ResultPoint(iArr4[1], f3);
        }
        if (i13 - i9 < 10) {
            Arrays.fill(resultPointArr, (Object) null);
        }
        return resultPointArr;
    }

    public static PDF417DetectorResult detect(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException {
        BitMatrix blackMatrix = binaryBitmap.getBlackMatrix();
        List<ResultPoint[]> listB = b(z, blackMatrix);
        if (listB.isEmpty()) {
            blackMatrix = blackMatrix.m3323clone();
            blackMatrix.rotate180();
            listB = b(z, blackMatrix);
        }
        return new PDF417DetectorResult(blackMatrix, listB);
    }

    private static ResultPoint[] e(BitMatrix bitMatrix, int i2, int i3) {
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        ResultPoint[] resultPointArr = new ResultPoint[8];
        a(resultPointArr, d(bitMatrix, height, width, i2, i3, e), a);
        if (resultPointArr[4] != null) {
            i3 = (int) resultPointArr[4].getX();
            i2 = (int) resultPointArr[4].getY();
        }
        a(resultPointArr, d(bitMatrix, height, width, i2, i3, f), b);
        return resultPointArr;
    }

    private static float f(int[] iArr, int[] iArr2, float f2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            i2 += iArr[i4];
            i3 += iArr2[i4];
        }
        if (i2 < i3) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = i2;
        float f4 = f3 / i3;
        float f5 = f2 * f4;
        float f6 = 0.0f;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr[i5];
            float f7 = iArr2[i5] * f4;
            float f8 = i6;
            float f9 = f8 > f7 ? f8 - f7 : f7 - f8;
            if (f9 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f9;
        }
        return f6 / f3;
    }
}
