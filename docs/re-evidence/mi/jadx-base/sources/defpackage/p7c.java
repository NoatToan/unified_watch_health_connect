package defpackage;

import com.chinaums.pppay.unify.UnifyPayListener;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class p7c {
    public static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char cCharAt = charSequence.charAt(i);
            while (f(cCharAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    cCharAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    public static String b(String str, SymbolShapeHint symbolShapeHint, dx6 dx6Var, dx6 dx6Var2) {
        int iE = 0;
        s98[] s98VarArr = {new qb(), new f83(), new x7p(), new kpr(), new v08(), new i12()};
        y98 y98Var = new y98(str);
        y98Var.n(symbolShapeHint);
        y98Var.l(dx6Var, dx6Var2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            y98Var.r((char) 236);
            y98Var.m(2);
            y98Var.f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            y98Var.r((char) 237);
            y98Var.m(2);
            y98Var.f += 7;
        }
        while (y98Var.i()) {
            s98VarArr[iE].a(y98Var);
            if (y98Var.e() >= 0) {
                iE = y98Var.e();
                y98Var.j();
            }
        }
        int iA = y98Var.a();
        y98Var.p();
        int iA2 = y98Var.g().a();
        if (iA < iA2 && iE != 0 && iE != 5 && iE != 4) {
            y98Var.r((char) 254);
        }
        StringBuilder sbB = y98Var.b();
        if (sbB.length() < iA2) {
            sbB.append((char) 129);
        }
        while (sbB.length() < iA2) {
            sbB.append(o((char) 129, sbB.length() + 1));
        }
        return y98Var.b().toString();
    }

    public static int c(float[] fArr, int[] iArr, int i, byte[] bArr) {
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

    public static int d(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    public static void e(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + (UnifyPayListener.ERR_OK.substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean f(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean g(char c) {
        return c >= 128 && c <= 255;
    }

    public static boolean h(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static boolean i(char c) {
        return c >= ' ' && c <= '^';
    }

    public static boolean j(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    public static boolean k(char c) {
        if (m(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static boolean l(char c) {
        return false;
    }

    public static boolean m(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    public static int n(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        char c;
        char cCharAt;
        int i3 = 6;
        float f = 2.0f;
        if (i >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            float[] fArr2 = {1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr2[i2] = 0.0f;
            fArr = fArr2;
        }
        int i4 = 0;
        while (true) {
            int i5 = i + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[i3];
                int[] iArr = new int[i3];
                int iC = c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int iD = d(bArr);
                if (iArr[0] == iC) {
                    return 0;
                }
                if (iD == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (iD == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (iD != 1 || bArr[2] <= 0) {
                    return (iD != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt2 = charSequence.charAt(i5);
            i4++;
            if (f(cCharAt2)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (g(cCharAt2)) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + f;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + 1.0f;
            }
            if (h(cCharAt2)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(cCharAt2)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(cCharAt2)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (g(cCharAt2)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (k(cCharAt2)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (g(cCharAt2)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (i(cCharAt2)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (g(cCharAt2)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (l(cCharAt2)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[i3];
                byte[] bArr2 = new byte[i3];
                c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int iD2 = d(bArr2);
                int i6 = iArr2[0];
                int i7 = iArr2[c];
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
                if (iD2 == 1 && b5 > 0) {
                    return 4;
                }
                if (iD2 == 1 && b3 > 0) {
                    return 2;
                }
                if (iD2 == 1 && b4 > 0) {
                    return 3;
                }
                int i8 = iArr2[1];
                if (i8 + 1 < i6 && i8 + 1 < i7 && i8 + 1 < iArr2[4] && i8 + 1 < iArr2[2]) {
                    int i9 = iArr2[3];
                    if (i8 < i9) {
                        return 1;
                    }
                    if (i8 == i9) {
                        int i10 = i + i4;
                        do {
                            i10++;
                            if (i10 >= charSequence.length()) {
                                break;
                            }
                            cCharAt = charSequence.charAt(i10);
                            if (m(cCharAt)) {
                                return 3;
                            }
                        } while (k(cCharAt));
                        return 1;
                    }
                }
            }
            i3 = 6;
            f = 2.0f;
        }
    }

    public static char o(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
