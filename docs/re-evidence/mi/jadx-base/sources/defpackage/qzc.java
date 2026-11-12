package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class qzc extends mah {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f32021b = {6, 8, 10, 12, 14};
    public static final int[] c = {1, 1, 1, 1};
    public static final int[][] d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    public static final int[][] e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32022a = -1;

    public static int g(int[] iArr) throws NotFoundException {
        int length = e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float fD = mah.d(iArr, e[i2], 0.5f);
            if (fD < f) {
                i = i2;
                f = fD;
            } else if (fD == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static void i(zo2 zo2Var, int i, int i2, StringBuilder sb) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            mah.e(zo2Var, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (g(iArr2) + 48));
            sb.append((char) (g(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    public static int[] k(zo2 zo2Var, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int iK = zo2Var.k();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < iK) {
            if (zo2Var.g(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else {
                    if (mah.d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i2, i};
                    }
                    i2 += iArr2[0] + iArr2[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int l(zo2 zo2Var) throws NotFoundException {
        int iK = zo2Var.k();
        int i = zo2Var.i(0);
        if (i != iK) {
            return i;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // defpackage.mah
    public wsk b(int i, zo2 zo2Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        boolean z;
        int[] iArrJ = j(zo2Var);
        int[] iArrH = h(zo2Var);
        StringBuilder sb = new StringBuilder(20);
        i(zo2Var, iArrJ[1], iArrH[0], sb);
        String string = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f32021b;
        }
        int length = string.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if ((z || length <= i3) && !z) {
            throw FormatException.getFormatInstance();
        }
        float f = i;
        return new wsk(string, null, new atk[]{new atk(iArrJ[1], f), new atk(iArrH[0], f)}, BarcodeFormat.ITF);
    }

    public final int[] h(zo2 zo2Var) throws NotFoundException {
        int[] iArrK;
        zo2Var.q();
        try {
            int iL = l(zo2Var);
            try {
                iArrK = k(zo2Var, iL, d[0]);
            } catch (NotFoundException unused) {
                iArrK = k(zo2Var, iL, d[1]);
            }
            m(zo2Var, iArrK[0]);
            int i = iArrK[0];
            iArrK[0] = zo2Var.k() - iArrK[1];
            iArrK[1] = zo2Var.k() - i;
            zo2Var.q();
            return iArrK;
        } catch (Throwable th) {
            zo2Var.q();
            throw th;
        }
    }

    public final int[] j(zo2 zo2Var) throws NotFoundException {
        int[] iArrK = k(zo2Var, l(zo2Var), c);
        int i = iArrK[1];
        int i2 = iArrK[0];
        this.f32022a = (i - i2) / 4;
        m(zo2Var, i2);
        return iArrK;
    }

    public final void m(zo2 zo2Var, int i) throws NotFoundException {
        int i2 = this.f32022a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        for (int i3 = i - 1; i2 > 0 && i3 >= 0 && !zo2Var.g(i3); i3--) {
            i2--;
        }
        if (i2 != 0) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
