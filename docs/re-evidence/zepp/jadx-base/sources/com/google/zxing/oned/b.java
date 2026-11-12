package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class b {
    private final int[] a = new int[4];
    private final StringBuilder b = new StringBuilder();

    private int a(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int nextUnset = iArr[1];
        int i = 0;
        for (int i2 = 0; i2 < 2 && nextUnset < size; i2++) {
            int iC = UPCEANReader.c(bitArray, iArr2, nextUnset, UPCEANReader.j);
            sb.append((char) ((iC % 10) + 48));
            for (int i3 : iArr2) {
                nextUnset += i3;
            }
            if (iC >= 10) {
                i |= 1 << (1 - i2);
            }
            if (i2 != 1) {
                nextUnset = bitArray.getNextUnset(bitArray.getNextSet(nextUnset));
            }
        }
        if (sb.length() != 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (Integer.parseInt(sb.toString()) % 4 == i) {
            return nextUnset;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static Map<ResultMetadataType, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    public Result b(int i, BitArray bitArray, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.b;
        sb.setLength(0);
        int iA = a(bitArray, iArr, sb);
        String string = sb.toString();
        Map<ResultMetadataType, Object> mapC = c(string);
        float f = i;
        Result result = new Result(string, null, new ResultPoint[]{new ResultPoint((iArr[0] + iArr[1]) / 2.0f, f), new ResultPoint(iA, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (mapC != null) {
            result.putAllMetadata(mapC);
        }
        return result;
    }
}
