package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import com.xiaomi.hm.health.bt.profile.page.PageType;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class HighLevelEncoder {
    private static final char a = 129;
    public static final char b = 230;
    public static final char c = 231;
    public static final char d = 235;
    private static final char e = 236;
    private static final char f = 237;
    public static final char g = 238;
    public static final char h = 239;
    public static final char i = 240;
    public static final char j = 254;
    public static final char k = 254;
    private static final String l = "[)>\u001e05\u001d";
    private static final String m = "[)>\u001e06\u001d";
    private static final String n = "\u001e\u0004";
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;
    public static final int s = 4;
    public static final int t = 5;

    private HighLevelEncoder() {
    }

    private static int a(float[] fArr, int[] iArr, int i2, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i3 = 0; i3 < 6; i3++) {
            iArr[i3] = (int) Math.ceil(fArr[i3]);
            int i4 = iArr[i3];
            if (i2 > i4) {
                Arrays.fill(bArr, (byte) 0);
                i2 = i4;
            }
            if (i2 == i4) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    private static int b(byte[] bArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 += bArr[i3];
        }
        return i2;
    }

    public static void c(char c2) {
        String hexString = Integer.toHexString(c2);
        throw new IllegalArgumentException("Illegal character: " + c2 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean d(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static int determineConsecutiveDigitCount(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        if (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            while (d(cCharAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    cCharAt = charSequence.charAt(i2);
                }
            }
        }
        return i3;
    }

    public static boolean e(char c2) {
        return c2 >= 128 && c2 <= 255;
    }

    public static String encodeHighLevel(String str) {
        return encodeHighLevel(str, SymbolShapeHint.FORCE_NONE, null, null);
    }

    private static boolean f(char c2) {
        if (c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    private static boolean g(char c2) {
        return c2 >= ' ' && c2 <= '^';
    }

    private static boolean h(char c2) {
        if (c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    private static boolean i(char c2) {
        if (k(c2) || c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    private static boolean j(char c2) {
        return false;
    }

    private static boolean k(char c2) {
        return c2 == '\r' || c2 == '*' || c2 == '>';
    }

    public static int l(CharSequence charSequence, int i2, int i3) {
        float[] fArr;
        char c2;
        if (i2 >= charSequence.length()) {
            return i3;
        }
        if (i3 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i3] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int iA = a(fArr, iArr, Integer.MAX_VALUE, bArr);
                int iB = b(bArr);
                if (iArr[0] == iA) {
                    return 0;
                }
                if (iB == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (iB == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (iB != 1 || bArr[2] <= 0) {
                    return (iB != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = charSequence.charAt(i5);
            i4++;
            if (d(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (e(cCharAt)) {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (f(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (e(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (h(cCharAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (e(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (i(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (e(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (g(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (e(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (j(cCharAt)) {
                c2 = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c2 = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                a(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int iB2 = b(bArr2);
                if (iArr2[0] < iArr2[c2] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (iB2 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (iB2 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (iB2 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        for (int i6 = i2 + i4 + 1; i6 < charSequence.length(); i6++) {
                            char cCharAt2 = charSequence.charAt(i6);
                            if (k(cCharAt2)) {
                                return 3;
                            }
                            if (!i(cCharAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    private static char m(char c2, int i2) {
        int i3 = c2 + ((i2 * 149) % PageType.PAGE_SHORTCUT) + 1;
        if (i3 > 254) {
            i3 -= 254;
        }
        return (char) i3;
    }

    public static String encodeHighLevel(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
        int iF = 0;
        f[] fVarArr = {new a(), new c(), new h(), new i(), new e(), new b()};
        g gVar = new g(str);
        gVar.o(symbolShapeHint);
        gVar.m(dimension, dimension2);
        if (str.startsWith(l) && str.endsWith(n)) {
            gVar.s(e);
            gVar.n(2);
            gVar.f += 7;
        } else if (str.startsWith(m) && str.endsWith(n)) {
            gVar.s(f);
            gVar.n(2);
            gVar.f += 7;
        }
        while (gVar.j()) {
            fVarArr[iF].b(gVar);
            if (gVar.f() >= 0) {
                iF = gVar.f();
                gVar.k();
            }
        }
        int iA = gVar.a();
        gVar.q();
        int dataCapacity = gVar.h().getDataCapacity();
        if (iA < dataCapacity && iF != 0 && iF != 5 && iF != 4) {
            gVar.s((char) 254);
        }
        StringBuilder sbB = gVar.b();
        if (sbB.length() < dataCapacity) {
            sbB.append(a);
        }
        while (sbB.length() < dataCapacity) {
            sbB.append(m(a, sbB.length() + 1));
        }
        return gVar.b().toString();
    }
}
