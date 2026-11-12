package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UPCEANReader extends OneDReader {
    private static final float d = 0.48f;
    private static final float e = 0.7f;
    public static final int[] f = {1, 1, 1};
    public static final int[] g = {1, 1, 1, 1, 1};
    public static final int[] h = {1, 1, 1, 1, 1, 1};
    public static final int[][] i;
    public static final int[][] j;
    private final StringBuilder a = new StringBuilder(20);
    private final d b = new d();
    private final a c = new a();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        i = iArr;
        int[][] iArr2 = new int[20][];
        j = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i2 = 10; i2 < 20; i2++) {
            int[] iArr3 = i[i2 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                iArr4[i3] = iArr3[(iArr3.length - i3) - 1];
            }
            j[i2] = iArr4;
        }
    }

    public static boolean b(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i2 = length - 1;
        return h(charSequence.subSequence(0, i2)) == Character.digit(charSequence.charAt(i2), 10);
    }

    public static int c(BitArray bitArray, int[] iArr, int i2, int[][] iArr2) throws NotFoundException {
        OneDReader.recordPattern(bitArray, i2, iArr);
        int length = iArr2.length;
        float f2 = d;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, iArr2[i4], 0.7f);
            if (fPatternMatchVariance < f2) {
                i3 = i4;
                f2 = fPatternMatchVariance;
            }
        }
        if (i3 >= 0) {
            return i3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] d(BitArray bitArray, int i2, boolean z, int[] iArr) throws NotFoundException {
        return e(bitArray, i2, z, iArr, new int[iArr.length]);
    }

    private static int[] e(BitArray bitArray, int i2, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int size = bitArray.getSize();
        int nextUnset = z ? bitArray.getNextUnset(i2) : bitArray.getNextSet(i2);
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = nextUnset;
        while (nextUnset < size) {
            if (bitArray.get(nextUnset) != z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else {
                    if (OneDReader.patternMatchVariance(iArr2, iArr, 0.7f) < d) {
                        return new int[]{i4, nextUnset};
                    }
                    i4 += iArr2[0] + iArr2[1];
                    int i5 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            nextUnset++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] f(BitArray bitArray) throws NotFoundException {
        int[] iArr = new int[f.length];
        int[] iArrE = null;
        boolean zIsRange = false;
        int i2 = 0;
        while (!zIsRange) {
            int[] iArr2 = f;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrE = e(bitArray, i2, false, iArr2, iArr);
            int i3 = iArrE[0];
            int i4 = iArrE[1];
            int i5 = i3 - (i4 - i3);
            if (i5 >= 0) {
                zIsRange = bitArray.isRange(i5, i3, false);
            }
            i2 = i4;
        }
        return iArrE;
    }

    public static int h(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0; i3 -= 2) {
            int iCharAt = charSequence.charAt(i3) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i2 += iCharAt;
        }
        int i4 = i2 * 3;
        for (int i5 = length - 2; i5 >= 0; i5 -= 2) {
            int iCharAt2 = charSequence.charAt(i5) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i4 += iCharAt2;
        }
        return (1000 - i4) % 10;
    }

    public boolean checkChecksum(String str) throws FormatException {
        return b(str);
    }

    public int[] decodeEnd(BitArray bitArray, int i2) throws NotFoundException {
        return d(bitArray, i2, false, f);
    }

    public abstract int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException;

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i2, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return decodeRow(i2, bitArray, f(bitArray), map);
    }

    public abstract BarcodeFormat g();

    public Result decodeRow(int i2, BitArray bitArray, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int length;
        String strC;
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((iArr[0] + iArr[1]) / 2.0f, i2));
        }
        StringBuilder sb = this.a;
        sb.setLength(0);
        int iDecodeMiddle = decodeMiddle(bitArray, iArr, sb);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint(iDecodeMiddle, i2));
        }
        int[] iArrDecodeEnd = decodeEnd(bitArray, iDecodeMiddle);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((iArrDecodeEnd[0] + iArrDecodeEnd[1]) / 2.0f, i2));
        }
        int i3 = iArrDecodeEnd[1];
        int i4 = (i3 - iArrDecodeEnd[0]) + i3;
        if (i4 >= bitArray.getSize() || !bitArray.isRange(i3, i4, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String string = sb.toString();
        if (string.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if (!checkChecksum(string)) {
            throw ChecksumException.getChecksumInstance();
        }
        float f2 = (iArr[1] + iArr[0]) / 2.0f;
        float f3 = (iArrDecodeEnd[1] + iArrDecodeEnd[0]) / 2.0f;
        BarcodeFormat barcodeFormatG = g();
        float f4 = i2;
        Result result = new Result(string, null, new ResultPoint[]{new ResultPoint(f2, f4), new ResultPoint(f3, f4)}, barcodeFormatG);
        try {
            Result resultA = this.b.a(i2, bitArray, iArrDecodeEnd[1]);
            result.putMetadata(ResultMetadataType.UPC_EAN_EXTENSION, resultA.getText());
            result.putAllMetadata(resultA.getResultMetadata());
            result.addResultPoints(resultA.getResultPoints());
            length = resultA.getText().length();
        } catch (ReaderException unused) {
            length = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length2 = iArr2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length2) {
                    z = false;
                    break;
                }
                if (length == iArr2[i5]) {
                    break;
                }
                i5++;
            }
            if (!z) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if ((barcodeFormatG == BarcodeFormat.EAN_13 || barcodeFormatG == BarcodeFormat.UPC_A) && (strC = this.c.c(string)) != null) {
            result.putMetadata(ResultMetadataType.POSSIBLE_COUNTRY, strC);
        }
        return result;
    }
}
