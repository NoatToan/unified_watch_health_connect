package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class g34 extends mah {
    public static final int[] e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, SportSummary.VERSION_103, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, SportReportBaseParser.ReportType.divingOTU, FileUtils.S_IRWXU, 145, 400, 208, 133, 388, SportReportBaseParser.ReportType.oxygenConcentration, 168, 162, 138, 42};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18540b;
    public final StringBuilder c;
    public final int[] d;

    public g34() {
        this(false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public static String g(CharSequence charSequence) throws FormatException {
        int i;
        char c;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt == '+' || cCharAt == '$' || cCharAt == '%' || cCharAt == '/') {
                i2++;
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt != '$') {
                    if (cCharAt != '%') {
                        if (cCharAt != '+') {
                            if (cCharAt != '/') {
                                c = 0;
                            } else if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                i = cCharAt2 - ' ';
                            } else {
                                if (cCharAt2 != 'Z') {
                                    throw FormatException.getFormatInstance();
                                }
                                c = AbstractJsonLexerKt.COLON;
                            }
                        } else {
                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                throw FormatException.getFormatInstance();
                            }
                            i = cCharAt2 + ' ';
                        }
                    } else if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                        i = cCharAt2 - '&';
                    } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                        i = cCharAt2 - 11;
                    } else if (cCharAt2 >= 'K' && cCharAt2 <= 'O') {
                        i = cCharAt2 + 16;
                    } else if (cCharAt2 >= 'P' && cCharAt2 <= 'T') {
                        i = cCharAt2 + '+';
                    } else if (cCharAt2 == 'U') {
                        c = 0;
                    } else if (cCharAt2 == 'V') {
                        c = '@';
                    } else if (cCharAt2 == 'W') {
                        c = '`';
                    } else {
                        if (cCharAt2 != 'X' && cCharAt2 != 'Y' && cCharAt2 != 'Z') {
                            throw FormatException.getFormatInstance();
                        }
                        c = 127;
                    }
                    sb.append(c);
                } else {
                    if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                        throw FormatException.getFormatInstance();
                    }
                    i = cCharAt2 - '@';
                }
                c = (char) i;
                sb.append(c);
            } else {
                sb.append(cCharAt);
            }
            i2++;
        }
        return sb.toString();
    }

    public static int[] h(zo2 zo2Var, int[] iArr) throws NotFoundException {
        int iK = zo2Var.k();
        int i = zo2Var.i(0);
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
                    if (j(iArr) == 148 && zo2Var.n(Math.max(0, i3 - ((i - i3) / 2)), i3, false)) {
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

    public static char i(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = e;
            if (i2 >= iArr.length) {
                if (i == 148) {
                    return '*';
                }
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i2] == i) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i2);
            }
            i2++;
        }
    }

    public static int j(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            }
            if (i4 <= 3) {
                return -1;
            }
            i = i2;
        }
    }

    @Override // defpackage.mah
    public wsk b(int i, zo2 zo2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArr = this.d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.c;
        sb.setLength(0);
        int[] iArrH = h(zo2Var, iArr);
        int i2 = zo2Var.i(iArrH[1]);
        int iK = zo2Var.k();
        while (true) {
            mah.e(zo2Var, i2, iArr);
            int iJ = j(iArr);
            if (iJ < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char cI = i(iJ);
            sb.append(cI);
            int i3 = i2;
            for (int i4 : iArr) {
                i3 += i4;
            }
            int i5 = zo2Var.i(i3);
            if (cI == '*') {
                sb.setLength(sb.length() - 1);
                int i6 = 0;
                for (int i7 : iArr) {
                    i6 += i7;
                }
                int i8 = (i5 - i2) - i6;
                if (i5 != iK && (i8 << 1) < i6) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (this.f18539a) {
                    int length = sb.length() - 1;
                    int iIndexOf = 0;
                    for (int i9 = 0; i9 < length; i9++) {
                        iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.c.charAt(i9));
                    }
                    if (sb.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    sb.setLength(length);
                }
                if (sb.length() == 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                float f = i;
                return new wsk(this.f18540b ? g(sb) : sb.toString(), null, new atk[]{new atk((iArrH[1] + iArrH[0]) / 2.0f, f), new atk(i2 + (i6 / 2.0f), f)}, BarcodeFormat.CODE_39);
            }
            i2 = i5;
        }
    }

    public g34(boolean z) {
        this(z, false);
    }

    public g34(boolean z, boolean z2) {
        this.f18539a = z;
        this.f18540b = z2;
        this.c = new StringBuilder(20);
        this.d = new int[9];
    }
}
