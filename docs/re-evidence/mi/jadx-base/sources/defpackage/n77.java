package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class n77 extends z7q {
    public static final int[] j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    public final int[] i = new int[4];

    public static void r(StringBuilder sb, int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == j[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // defpackage.z7q
    public int k(zo2 zo2Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iK = zo2Var.k();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < iK; i3++) {
            int i4 = z7q.i(zo2Var, iArr2, i, z7q.h);
            sb.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        r(sb, i2);
        int i6 = z7q.m(zo2Var, i, true, z7q.e)[1];
        for (int i7 = 0; i7 < 6 && i6 < iK; i7++) {
            sb.append((char) (z7q.i(zo2Var, iArr2, i6, z7q.g) + 48));
            for (int i8 : iArr2) {
                i6 += i8;
            }
        }
        return i6;
    }

    @Override // defpackage.z7q
    public BarcodeFormat p() {
        return BarcodeFormat.EAN_13;
    }
}
