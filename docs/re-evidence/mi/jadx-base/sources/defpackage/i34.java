package defpackage;

import com.amap.api.maps.utils.SpatialRelationUtil;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class i34 extends mah {
    public static final char[] c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    public static final int[] d;
    public static final int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f20727a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f20728b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, SpatialRelationUtil.A_CIRCLE_DEGREE, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        d = iArr;
        e = iArr[47];
    }

    public static void g(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        h(charSequence, length - 2, 20);
        h(charSequence, length - 1, 15);
    }

    public static void h(CharSequence charSequence, int i, int i2) throws ChecksumException {
        int iIndexOf = 0;
        int i3 = 1;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i4)) * i3;
            i3++;
            if (i3 > i2) {
                i3 = 1;
            }
        }
        if (charSequence.charAt(i) != c[iIndexOf % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    private static String i(CharSequence charSequence) throws FormatException {
        int i;
        char c2;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'd') {
                if (i2 >= length - 1) {
                    throw FormatException.getFormatInstance();
                }
                i2++;
                char cCharAt2 = charSequence.charAt(i2);
                switch (cCharAt) {
                    case 'a':
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            throw FormatException.getFormatInstance();
                        }
                        i = cCharAt2 - '@';
                        c2 = (char) i;
                        sb.append(c2);
                        break;
                    case 'b':
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                            i = cCharAt2 - '&';
                        } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                            i = cCharAt2 - 11;
                        } else if (cCharAt2 < 'K' || cCharAt2 > 'O') {
                            if (cCharAt2 >= 'P' && cCharAt2 <= 'S') {
                                i = cCharAt2 + '+';
                            } else {
                                if (cCharAt2 < 'T' || cCharAt2 > 'Z') {
                                    throw FormatException.getFormatInstance();
                                }
                                c2 = 127;
                            }
                            sb.append(c2);
                        } else {
                            i = cCharAt2 + 16;
                        }
                        c2 = (char) i;
                        sb.append(c2);
                        break;
                    case 'c':
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                            i = cCharAt2 - ' ';
                            c2 = (char) i;
                        } else {
                            if (cCharAt2 != 'Z') {
                                throw FormatException.getFormatInstance();
                            }
                            c2 = AbstractJsonLexerKt.COLON;
                        }
                        sb.append(c2);
                        break;
                    case 'd':
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            throw FormatException.getFormatInstance();
                        }
                        i = cCharAt2 + ' ';
                        c2 = (char) i;
                        sb.append(c2);
                        break;
                    default:
                        c2 = 0;
                        sb.append(c2);
                        break;
                }
            } else {
                sb.append(cCharAt);
            }
            i2++;
        }
        return sb.toString();
    }

    private static char k(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = d;
            if (i2 >= iArr.length) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i2] == i) {
                return c[i2];
            }
            i2++;
        }
    }

    public static int l(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int iRound = Math.round((iArr[i4] * 9.0f) / i);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < iRound; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= iRound;
            }
        }
        return i3;
    }

    @Override // defpackage.mah
    public wsk b(int i, zo2 zo2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArrJ = j(zo2Var);
        int i2 = zo2Var.i(iArrJ[1]);
        int iK = zo2Var.k();
        int[] iArr = this.f20728b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f20727a;
        sb.setLength(0);
        while (true) {
            mah.e(zo2Var, i2, iArr);
            int iL = l(iArr);
            if (iL < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char cK = k(iL);
            sb.append(cK);
            int i3 = i2;
            for (int i4 : iArr) {
                i3 += i4;
            }
            int i5 = zo2Var.i(i3);
            if (cK == '*') {
                sb.deleteCharAt(sb.length() - 1);
                int i6 = 0;
                for (int i7 : iArr) {
                    i6 += i7;
                }
                if (i5 == iK || !zo2Var.g(i5)) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (sb.length() < 2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                g(sb);
                sb.setLength(sb.length() - 2);
                float f = i;
                return new wsk(i(sb), null, new atk[]{new atk((iArrJ[1] + iArrJ[0]) / 2.0f, f), new atk(i2 + (i6 / 2.0f), f)}, BarcodeFormat.CODE_93);
            }
            i2 = i5;
        }
    }

    public final int[] j(zo2 zo2Var) throws NotFoundException {
        int iK = zo2Var.k();
        int i = zo2Var.i(0);
        Arrays.fill(this.f20728b, 0);
        int[] iArr = this.f20728b;
        int length = iArr.length;
        boolean z = false;
        int i2 = 0;
        int i3 = i;
        while (i < iK) {
            if (zo2Var.g(i) != z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else {
                    if (l(iArr) == e) {
                        return new int[]{i3, i};
                    }
                    i3 += iArr[0] + iArr[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i2] = 0;
                    i2--;
                }
                iArr[i2] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
