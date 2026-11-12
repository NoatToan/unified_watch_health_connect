package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class z7q extends mah {
    public static final int[] d = {1, 1, 1};
    public static final int[] e = {1, 1, 1, 1, 1};
    public static final int[] f = {1, 1, 1, 1, 1, 1};
    public static final int[][] g;
    public static final int[][] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f40994a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y7q f40995b = new y7q();
    public final r77 c = new r77();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        g = iArr;
        int[][] iArr2 = new int[20][];
        h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            h[i] = iArr4;
        }
    }

    public static boolean h(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return q(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    public static int i(zo2 zo2Var, int[] iArr, int i, int[][] iArr2) throws NotFoundException {
        mah.e(zo2Var, i, iArr);
        int length = iArr2.length;
        float f2 = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float fD = mah.d(iArr, iArr2[i3], 0.7f);
            if (fD < f2) {
                i2 = i3;
                f2 = fD;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] m(zo2 zo2Var, int i, boolean z, int[] iArr) throws NotFoundException {
        return n(zo2Var, i, z, iArr, new int[iArr.length]);
    }

    public static int[] n(zo2 zo2Var, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int iK = zo2Var.k();
        int iJ = z ? zo2Var.j(i) : zo2Var.i(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = iJ;
        while (iJ < iK) {
            if (zo2Var.g(iJ) != z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else {
                    if (mah.d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i3, iJ};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i2] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            iJ++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] o(zo2 zo2Var) throws NotFoundException {
        int[] iArr = new int[d.length];
        int[] iArrN = null;
        boolean zN = false;
        int i = 0;
        while (!zN) {
            int[] iArr2 = d;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrN = n(zo2Var, i, false, iArr2, iArr);
            int i2 = iArrN[0];
            int i3 = iArrN[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                zN = zo2Var.n(i4, i2, false);
            }
            i = i3;
        }
        return iArrN;
    }

    public static int q(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int iCharAt = charSequence.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i += iCharAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int iCharAt2 = charSequence.charAt(i4) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i3 += iCharAt2;
        }
        return (1000 - i3) % 10;
    }

    @Override // defpackage.mah
    public wsk b(int i, zo2 zo2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return l(i, zo2Var, o(zo2Var), map);
    }

    public boolean g(String str) throws FormatException {
        return h(str);
    }

    public int[] j(zo2 zo2Var, int i) throws NotFoundException {
        return m(zo2Var, i, false, d);
    }

    public abstract int k(zo2 zo2Var, int[] iArr, StringBuilder sb) throws NotFoundException;

    public wsk l(int i, zo2 zo2Var, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int length;
        String strC;
        btk btkVar = map == null ? null : (btk) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        int i2 = 0;
        if (btkVar != null) {
            btkVar.a(new atk((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.f40994a;
        sb.setLength(0);
        int iK = k(zo2Var, iArr, sb);
        if (btkVar != null) {
            btkVar.a(new atk(iK, i));
        }
        int[] iArrJ = j(zo2Var, iK);
        if (btkVar != null) {
            btkVar.a(new atk((iArrJ[0] + iArrJ[1]) / 2.0f, i));
        }
        int i3 = iArrJ[1];
        int i4 = (i3 - iArrJ[0]) + i3;
        if (i4 >= zo2Var.k() || !zo2Var.n(i3, i4, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String string = sb.toString();
        if (string.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if (!g(string)) {
            throw ChecksumException.getChecksumInstance();
        }
        float f2 = (iArr[1] + iArr[0]) / 2.0f;
        float f3 = (iArrJ[1] + iArrJ[0]) / 2.0f;
        BarcodeFormat barcodeFormatP = p();
        float f4 = i;
        wsk wskVar = new wsk(string, null, new atk[]{new atk(f2, f4), new atk(f3, f4)}, barcodeFormatP);
        try {
            wsk wskVarA = this.f40995b.a(i, zo2Var, iArrJ[1]);
            wskVar.h(ResultMetadataType.UPC_EAN_EXTENSION, wskVarA.f());
            wskVar.g(wskVarA.d());
            wskVar.a(wskVarA.e());
            length = wskVarA.f().length();
        } catch (ReaderException unused) {
            length = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length2 = iArr2.length;
            while (true) {
                if (i2 >= length2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (length == iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        if ((barcodeFormatP == BarcodeFormat.EAN_13 || barcodeFormatP == BarcodeFormat.UPC_A) && (strC = this.c.c(string)) != null) {
            wskVar.h(ResultMetadataType.POSSIBLE_COUNTRY, strC);
        }
        return wskVar;
    }

    public abstract BarcodeFormat p();
}
