package com.huawei.hms.scankit.p;

import com.huawei.appgallery.agd.api.AgdConstant;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d4 {
    static boolean b(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    static boolean c(char c2) {
        return c2 >= 128 && c2 <= 255;
    }

    private static boolean d(char c2) {
        if (c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    private static boolean e(char c2) {
        return c2 >= ' ' && c2 <= '^';
    }

    private static boolean f(char c2) {
        if (c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    private static boolean h(char c2) {
        return false;
    }

    private static boolean i(char c2) {
        return c2 == '\r' || c2 == '*' || c2 == '>';
    }

    private static boolean g(char c2) {
        if (i(c2) || c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    public static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char cCharAt = charSequence.charAt(i);
            while (b(cCharAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    cCharAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    public static String a(String str, e7 e7Var, m2 m2Var, m2 m2Var2) {
        int iE = 0;
        v2[] v2VarArr = {new b(), new d0(), new g7(), new n8(), new s2(), new n()};
        y2 y2Var = new y2(str);
        y2Var.a(e7Var);
        y2Var.a(m2Var, m2Var2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            y2Var.a((char) 236);
            y2Var.a(2);
            y2Var.d += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            y2Var.a((char) 237);
            y2Var.a(2);
            y2Var.d += 7;
        }
        while (y2Var.i()) {
            if (iE >= 0 && iE < 6) {
                v2VarArr[iE].a(y2Var);
            }
            if (y2Var.e() >= 0) {
                iE = y2Var.e();
                y2Var.j();
            }
        }
        int iA = y2Var.a();
        y2Var.l();
        int iA2 = y2Var.g().a();
        if (iA < iA2 && iE != 0 && iE != 5 && iE != 4) {
            y2Var.a((char) 254);
        }
        StringBuilder sbB = y2Var.b();
        if (sbB.length() < iA2) {
            sbB.append((char) 129);
        }
        while (sbB.length() < iA2) {
            sbB.append(a((char) 129, sbB.length() + 1));
        }
        return y2Var.b().toString();
    }

    private static int a(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            int iCeil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = iCeil;
            if (i > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i = iCeil;
            }
            if (i == iCeil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    private static int a(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    static void a(char c2) {
        String hexString = Integer.toHexString(c2);
        throw new IllegalArgumentException("Illegal character: " + c2 + " (0x" + (AgdConstant.INSTALL_TYPE_DEFAULT.substring(0, 4 - hexString.length()) + hexString) + com.huawei.hms.network.embedded.g4.l);
    }

    static int a(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        if (i >= charSequence.length()) {
            return i2;
        }
        int i3 = 6;
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[i3];
                int[] iArr = new int[i3];
                int iA = a(fArr, iArr, Integer.MAX_VALUE, bArr);
                int iA2 = a(bArr);
                if (w7.a(iArr, 0) && iArr[0] == iA) {
                    return 0;
                }
                if (iA2 == 1 && w7.a(bArr, 5) && bArr[5] > 0) {
                    return 5;
                }
                if (iA2 == 1 && w7.a(bArr, 4) && bArr[4] > 0) {
                    return 4;
                }
                if (iA2 == 1 && w7.a(bArr, 2) && bArr[2] > 0) {
                    return 2;
                }
                return (iA2 == 1 && w7.a(bArr, 3) && bArr[3] > 0) ? 3 : 1;
            }
            char cCharAt = charSequence.charAt(i5);
            i4++;
            if (b(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (c(cCharAt)) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + 2.0f;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + 1.0f;
            }
            if (1 < fArr.length) {
                if (d(cCharAt)) {
                    fArr[1] = fArr[1] + 0.6666667f;
                } else if (c(cCharAt)) {
                    fArr[1] = fArr[1] + 2.6666667f;
                } else {
                    fArr[1] = fArr[1] + 1.3333334f;
                }
            }
            if (2 < fArr.length) {
                if (f(cCharAt)) {
                    fArr[2] = fArr[2] + 0.6666667f;
                } else if (c(cCharAt)) {
                    fArr[2] = fArr[2] + 2.6666667f;
                } else {
                    fArr[2] = fArr[2] + 1.3333334f;
                }
            }
            if (3 < fArr.length) {
                if (g(cCharAt)) {
                    fArr[3] = fArr[3] + 0.6666667f;
                } else if (c(cCharAt)) {
                    fArr[3] = fArr[3] + 4.3333335f;
                } else {
                    fArr[3] = fArr[3] + 3.3333333f;
                }
            }
            if (4 < fArr.length) {
                if (e(cCharAt)) {
                    fArr[4] = fArr[4] + 0.75f;
                } else if (c(cCharAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            }
            if (5 < fArr.length) {
                if (h(cCharAt)) {
                    fArr[5] = fArr[5] + 4.0f;
                } else {
                    fArr[5] = fArr[5] + 1.0f;
                }
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[i3];
                byte[] bArr2 = new byte[i3];
                a(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int iA3 = a(bArr2);
                int i6 = iArr2[0];
                int i7 = iArr2[5];
                if (i6 < i7 && i6 < iArr2[1] && i6 < iArr2[2] && i6 < iArr2[3] && i6 < iArr2[4]) {
                    return 0;
                }
                if (i7 < i6) {
                    return 5;
                }
                byte b2 = bArr2[1];
                byte b3 = bArr2[2];
                byte b4 = bArr2[3];
                byte b5 = bArr2[4];
                if (b2 + b3 + b4 + b5 == 0) {
                    return 5;
                }
                if (iA3 == 1 && b5 > 0) {
                    return 4;
                }
                if (iA3 == 1 && b3 > 0) {
                    return 2;
                }
                if (iA3 == 1 && b4 > 0) {
                    return 3;
                }
                int i8 = iArr2[1];
                int i9 = i8 + 1;
                if (i9 < i6 && i9 < i7 && i9 < iArr2[4] && i9 < iArr2[2]) {
                    int i10 = iArr2[3];
                    if (i8 < i10) {
                        return 1;
                    }
                    if (i8 == i10) {
                        for (int i11 = i + i4 + 1; i11 < charSequence.length(); i11++) {
                            char cCharAt2 = charSequence.charAt(i11);
                            if (i(cCharAt2)) {
                                return 3;
                            }
                            if (!g(cCharAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
            i3 = 6;
        }
    }

    private static char a(char c2, int i) {
        int i2 = c2 + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
