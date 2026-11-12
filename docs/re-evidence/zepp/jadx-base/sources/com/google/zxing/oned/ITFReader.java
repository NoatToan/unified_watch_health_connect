package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ITFReader extends OneDReader {
    private static final float b = 0.38f;
    private static final float c = 0.5f;
    private static final int d = 3;
    private static final int e = 2;
    private static final int f = 1;
    private static final int[] g = {6, 8, 10, 12, 14};
    private static final int[] h = {1, 1, 1, 1};
    private static final int[][] i = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    private static final int[][] j = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    private int a = -1;

    private static int b(int[] iArr) throws NotFoundException {
        int length = j.length;
        float f2 = 0.38f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, j[i3], 0.5f);
            if (fPatternMatchVariance < f2) {
                i2 = i3;
                f2 = fPatternMatchVariance;
            } else if (fPatternMatchVariance == f2) {
                i2 = -1;
            }
        }
        if (i2 >= 0) {
            return i2 % 10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private int[] c(BitArray bitArray) throws NotFoundException {
        int[] iArrF;
        bitArray.reverse();
        try {
            int iG = g(bitArray);
            try {
                iArrF = f(bitArray, iG, i[0]);
            } catch (NotFoundException unused) {
                iArrF = f(bitArray, iG, i[1]);
            }
            h(bitArray, iArrF[0]);
            int i2 = iArrF[0];
            iArrF[0] = bitArray.getSize() - iArrF[1];
            iArrF[1] = bitArray.getSize() - i2;
            bitArray.reverse();
            return iArrF;
        } catch (Throwable th) {
            bitArray.reverse();
            throw th;
        }
    }

    private static void d(BitArray bitArray, int i2, int i3, StringBuilder sb) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i2 < i3) {
            OneDReader.recordPattern(bitArray, i2, iArr);
            for (int i4 = 0; i4 < 5; i4++) {
                int i5 = i4 * 2;
                iArr2[i4] = iArr[i5];
                iArr3[i4] = iArr[i5 + 1];
            }
            sb.append((char) (b(iArr2) + 48));
            sb.append((char) (b(iArr3) + 48));
            for (int i6 = 0; i6 < 10; i6++) {
                i2 += iArr[i6];
            }
        }
    }

    private int[] e(BitArray bitArray) throws NotFoundException {
        int[] iArrF = f(bitArray, g(bitArray), h);
        this.a = (iArrF[1] - iArrF[0]) / 4;
        h(bitArray, iArrF[0]);
        return iArrF;
    }

    private static int[] f(BitArray bitArray, int i2, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int size = bitArray.getSize();
        int i3 = i2;
        boolean z = false;
        int i4 = 0;
        while (i2 < size) {
            if (bitArray.get(i2) != z) {
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else {
                    if (OneDReader.patternMatchVariance(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i3, i2};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = i4 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i4--;
                }
                iArr2[i4] = 1;
                z = !z;
            }
            i2++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int g(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        if (nextSet != size) {
            return nextSet;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private void h(BitArray bitArray, int i2) throws NotFoundException {
        int i3 = this.a * 10;
        if (i3 >= i2) {
            i3 = i2;
        }
        for (int i4 = i2 - 1; i3 > 0 && i4 >= 0 && !bitArray.get(i4); i4--) {
            i3--;
        }
        if (i3 != 0) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i2, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        boolean z;
        int[] iArrE = e(bitArray);
        int[] iArrC = c(bitArray);
        StringBuilder sb = new StringBuilder(20);
        d(bitArray, iArrE[1], iArrC[0], sb);
        String string = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = g;
        }
        int length = string.length();
        int length2 = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length2) {
                z = false;
                break;
            }
            int i5 = iArr[i3];
            if (length == i5) {
                z = true;
                break;
            }
            if (i5 > i4) {
                i4 = i5;
            }
            i3++;
        }
        if (!z && length > i4) {
            z = true;
        }
        if (!z) {
            throw FormatException.getFormatInstance();
        }
        float f2 = i2;
        return new Result(string, null, new ResultPoint[]{new ResultPoint(iArrE[1], f2), new ResultPoint(iArrC[0], f2)}, BarcodeFormat.ITF);
    }
}
