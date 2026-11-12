package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes4.dex */
public final class EAN13Reader extends UPCEANReader {
    public static final int[] l = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    private final int[] k = new int[4];

    private static void i(StringBuilder sb, int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == l[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < size; i3++) {
            int iC = UPCEANReader.c(bitArray, iArr2, i, UPCEANReader.j);
            sb.append((char) ((iC % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (iC >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        i(sb, i2);
        int i5 = UPCEANReader.d(bitArray, i, true, UPCEANReader.g)[1];
        for (int i6 = 0; i6 < 6 && i5 < size; i6++) {
            sb.append((char) (UPCEANReader.c(bitArray, iArr2, i5, UPCEANReader.i) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public BarcodeFormat g() {
        return BarcodeFormat.EAN_13;
    }
}
