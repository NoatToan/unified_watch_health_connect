package com.huawei.hms.scankit.p;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class v0 extends g5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f16364c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    public static final int[] d;
    private static final int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f16365a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f16366b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE, OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, OldToNewMotionPath.SPORT_TYPE_BODY_BUILDING, 436, 434, 428, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        d = iArr;
        e = iArr[47];
    }

    private static String b(CharSequence charSequence) throws a {
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 'a' || cCharAt > 'd') {
                sb.append(cCharAt);
            } else if (i < length - 1) {
                i++;
                sb.append(a(cCharAt, charSequence.charAt(i)));
            } else {
                throw a.a();
            }
            i++;
        }
        return sb.toString();
    }

    private static void a(CharSequence charSequence) throws a {
        int length = charSequence.length();
        a(charSequence, length - 2, 20);
        a(charSequence, length - 1, 15);
    }

    private static int b(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int iRound = Math.round((iArr[i4] * 9.0f) / i);
            if (iRound < 1 || iRound > 4) {
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

    private static void a(CharSequence charSequence, int i, int i2) throws a {
        int iIndexOf = 0;
        int i3 = 1;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i4)) * i3;
            i3++;
            if (i3 > i2) {
                i3 = 1;
            }
        }
        if (charSequence.charAt(i) != f16364c[iIndexOf % 47]) {
            throw a.a();
        }
    }

    private static char a(char c2, char c3) throws a {
        int i;
        switch (c2) {
            case 'a':
                if (c3 < 'A' || c3 > 'Z') {
                    throw a.a();
                }
                i = c3 - '@';
                break;
            case Constants.DEFAULT_PRO_BOT_MARGIN_PAD /* 98 */:
                if (c3 >= 'A' && c3 <= 'E') {
                    i = c3 - '&';
                } else if (c3 >= 'F' && c3 <= 'J') {
                    i = c3 - 11;
                } else if (c3 >= 'K' && c3 <= 'O') {
                    i = c3 + 16;
                } else {
                    if (c3 < 'P' || c3 > 'S') {
                        if (c3 < 'T' || c3 > 'Z') {
                            throw a.a();
                        }
                        return Ascii.MAX;
                    }
                    i = c3 + '+';
                }
                break;
            case 'c':
                if (c3 < 'A' || c3 > 'O') {
                    if (c3 == 'Z') {
                        return ':';
                    }
                    throw a.a();
                }
                i = c3 - ' ';
                break;
            case 'd':
                if (c3 < 'A' || c3 > 'Z') {
                    throw a.a();
                }
                i = c3 + ' ';
                break;
            default:
                return (char) 0;
        }
        return (char) i;
    }

    @Override // com.huawei.hms.scankit.p.g5
    public s6 a(int i, r rVar, Map map) throws a {
        int[] iArrA = a(rVar);
        int iC = rVar.c(iArrA[1]);
        int iD = rVar.d();
        int[] iArr = this.f16366b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f16365a;
        sb.setLength(0);
        while (true) {
            g5.a(rVar, iC, iArr);
            int iB = b(iArr);
            if (iB >= 0) {
                char cA = a(iB);
                sb.append(cA);
                int i2 = iC;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int iC2 = rVar.c(i2);
                if (cA == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (iC2 != iD && rVar.b(iC2)) {
                        if (sb.length() >= 2) {
                            a(sb);
                            sb.setLength(sb.length() - 2);
                            float f = i;
                            return new s6(b(sb), null, new u6[]{new u6(iArrA[0], f), new u6(iC + ((i4 * 10) / 9), f)}, BarcodeFormat.CODE_93);
                        }
                        throw a.a();
                    }
                    throw a.a();
                }
                iC = iC2;
            } else {
                throw a.a();
            }
        }
    }

    private int[] a(r rVar) throws a {
        int iD = rVar.d();
        int iC = rVar.c(0);
        Arrays.fill(this.f16366b, 0);
        int[] iArr = this.f16366b;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = iC;
        while (iC < iD) {
            if (rVar.b(iC) != z) {
                if (i >= 0 && i < iArr.length) {
                    iArr[i] = iArr[i] + 1;
                } else {
                    throw a.a();
                }
            } else {
                if (i != length - 1) {
                    i++;
                } else {
                    if (b(iArr) == e) {
                        return new int[]{i2, iC};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                }
                iArr[i] = 1;
                z = !z;
            }
            iC++;
        }
        throw a.a();
    }

    private static char a(int i) throws a {
        int i2 = 0;
        while (true) {
            int[] iArr = d;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return f16364c[i2];
                }
                i2++;
            } else {
                throw a.a();
            }
        }
    }
}
