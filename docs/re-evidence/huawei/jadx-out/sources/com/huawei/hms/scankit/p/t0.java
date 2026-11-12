package com.huawei.hms.scankit.p;

import com.google.common.base.Ascii;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class t0 extends g5 {
    public static final int[] e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE, 73, 328, 25, OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE, 88, 13, 268, 76, 28, 259, 67, 322, 19, OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, com.huawei.hms.kit.awareness.barrier.internal.e.a.z, OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL, 388, 196, 168, MachineControlPointResponse.OP_CODE_EXTENSION_SET_DYNAMIC_ENERGY, 138, 42};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StringBuilder f16325c;
    private final int[] d;

    public t0() {
        this(false);
    }

    private s6 a(StringBuilder sb, int[] iArr, int i, int i2, int i3) throws a {
        String string;
        if (this.f16323a) {
            int length = sb.length() - 1;
            int iIndexOf = 0;
            for (int i4 = 0; i4 < length; i4++) {
                iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f16325c.charAt(i4));
            }
            if (sb.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                sb.setLength(length);
            } else {
                throw a.a();
            }
        }
        if (sb.length() != 0) {
            if (this.f16324b) {
                string = a(sb);
            } else {
                string = sb.toString();
            }
            float f = i + i2;
            float f2 = i3;
            return new s6(string, null, new u6[]{new u6(iArr[0], f2), new u6(f, f2)}, BarcodeFormat.CODE_39);
        }
        throw a.a();
    }

    public t0(boolean z) {
        this(z, false);
    }

    private static int c(int[] iArr) {
        int length = iArr.length;
        if (b(iArr)) {
            return -1;
        }
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
                    i6 |= 1 << ((length - 1) - i7);
                    i4++;
                    i5 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if (i10 * 2 >= i5) {
                            return -1;
                        }
                    }
                }
                return i6;
            }
            if (i4 <= 3) {
                return -1;
            }
            i = i2;
        }
    }

    public t0(boolean z, boolean z2) {
        this.f16323a = z;
        this.f16324b = z2;
        this.f16325c = new StringBuilder(20);
        this.d = new int[9];
    }

    private static boolean b(int[] iArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 < i) {
                i = i3;
            }
            if (i3 > i2) {
                i2 = i3;
            }
        }
        return i2 / i > 6;
    }

    private static String a(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '+' && cCharAt != '$' && cCharAt != '%' && cCharAt != '/') {
                sb.append(cCharAt);
            } else {
                i++;
                sb.append(a(cCharAt, charSequence.charAt(i)));
            }
            i++;
        }
        return sb.toString();
    }

    @Override // com.huawei.hms.scankit.p.g5
    public s6 a(int i, r rVar, Map map) throws a {
        int[] iArr = this.d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f16325c;
        sb.setLength(0);
        int[] iArrA = a(rVar, iArr);
        int iC = rVar.c(iArrA[1]);
        int iD = rVar.d();
        while (true) {
            g5.a(rVar, iC, iArr);
            int iC2 = c(iArr);
            if (iC2 >= 0) {
                char cA = a(iC2);
                sb.append(cA);
                int i2 = iC;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int iC3 = rVar.c(i2);
                if (cA == '*') {
                    sb.setLength(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (iC3 != iD && ((iC3 - iC) - i4) * 5 < i4) {
                        throw a.a();
                    }
                    return a(sb, iArrA, iC, i4, i);
                }
                iC = iC3;
            } else {
                throw a.a();
            }
        }
    }

    private static int[] a(r rVar, int[] iArr) throws a {
        int iD = rVar.d();
        int iC = rVar.c(0);
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
                    if (c(iArr) == 148 && rVar.a(Math.max(0, i2 - ((iC - i2) / 5)), i2, false, true)) {
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
            int[] iArr = e;
            if (i2 >= iArr.length) {
                if (i == 148) {
                    return '*';
                }
                throw a.a();
            }
            if (iArr[i2] == i) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i2);
            }
            i2++;
        }
    }

    private static char a(char c2, char c3) throws a {
        int i;
        if (c2 != '$') {
            if (c2 != '%') {
                if (c2 != '+') {
                    if (c2 != '/') {
                        return (char) 0;
                    }
                    if (c3 < 'A' || c3 > 'O') {
                        if (c3 == 'Z') {
                            return ':';
                        }
                        throw a.a();
                    }
                    i = c3 - ' ';
                } else {
                    if (c3 < 'A' || c3 > 'Z') {
                        throw a.a();
                    }
                    i = c3 + ' ';
                }
            } else if (c3 >= 'A' && c3 <= 'E') {
                i = c3 - '&';
            } else if (c3 >= 'F' && c3 <= 'J') {
                i = c3 - 11;
            } else if (c3 >= 'K' && c3 <= 'O') {
                i = c3 + 16;
            } else {
                if (c3 < 'P' || c3 > 'T') {
                    if (c3 == 'U') {
                        return (char) 0;
                    }
                    if (c3 == 'V') {
                        return '@';
                    }
                    if (c3 == 'W') {
                        return '`';
                    }
                    if (c3 == 'X' || c3 == 'Y' || c3 == 'Z') {
                        return Ascii.MAX;
                    }
                    throw a.a();
                }
                i = c3 + '+';
            }
        } else {
            if (c3 < 'A' || c3 > 'Z') {
                throw a.a();
            }
            i = c3 - '@';
        }
        return (char) i;
    }
}
