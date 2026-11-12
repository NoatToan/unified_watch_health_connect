package defpackage;

import com.chinaums.pppay.unify.UnifyPayListener;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class b8q extends z7q {
    public static final int[] j = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[][] f3928k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    public final int[] i = new int[4];

    public static String r(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append(UnifyPayListener.ERR_OK);
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append(UnifyPayListener.ERR_OK);
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    public static void s(StringBuilder sb, int i) throws NotFoundException {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f3928k[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // defpackage.z7q
    public boolean g(String str) throws FormatException {
        return super.g(r(str));
    }

    @Override // defpackage.z7q
    public int[] j(zo2 zo2Var, int i) throws NotFoundException {
        return z7q.m(zo2Var, i, true, j);
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
        s(sb, i2);
        return i;
    }

    @Override // defpackage.z7q
    public BarcodeFormat p() {
        return BarcodeFormat.UPC_E;
    }
}
