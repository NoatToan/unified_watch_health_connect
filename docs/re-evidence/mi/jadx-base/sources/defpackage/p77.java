package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class p77 extends z7q {
    public final int[] i = new int[4];

    @Override // defpackage.z7q
    public int k(zo2 zo2Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iK = zo2Var.k();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < iK; i2++) {
            sb.append((char) (z7q.i(zo2Var, iArr2, i, z7q.g) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = z7q.m(zo2Var, i, true, z7q.e)[1];
        for (int i5 = 0; i5 < 4 && i4 < iK; i5++) {
            sb.append((char) (z7q.i(zo2Var, iArr2, i4, z7q.g) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // defpackage.z7q
    public BarcodeFormat p() {
        return BarcodeFormat.EAN_8;
    }
}
