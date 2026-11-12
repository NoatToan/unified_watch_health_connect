package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class r5f {
    public static int a(k73 k73Var) {
        return b(k73Var, true) + b(k73Var, false);
    }

    public static int b(k73 k73Var, boolean z) {
        int iD = z ? k73Var.d() : k73Var.e();
        int iE = z ? k73Var.e() : k73Var.d();
        byte[][] bArrC = k73Var.c();
        int i = 0;
        for (int i2 = 0; i2 < iD; i2++) {
            byte b2 = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < iE; i4++) {
                byte b3 = z ? bArrC[i2][i4] : bArrC[i4][i2];
                if (b3 == b2) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += i3 - 2;
                    }
                    i3 = 1;
                    b2 = b3;
                }
            }
            if (i3 >= 5) {
                i += i3 - 2;
            }
        }
        return i;
    }

    public static int c(k73 k73Var) {
        byte[][] bArrC = k73Var.c();
        int iE = k73Var.e();
        int iD = k73Var.d();
        int i = 0;
        for (int i2 = 0; i2 < iD - 1; i2++) {
            byte[] bArr = bArrC[i2];
            int i3 = 0;
            while (i3 < iE - 1) {
                byte b2 = bArr[i3];
                int i4 = i3 + 1;
                if (b2 == bArr[i4]) {
                    byte[] bArr2 = bArrC[i2 + 1];
                    if (b2 == bArr2[i3] && b2 == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    public static int d(k73 k73Var) {
        byte[][] bArrC = k73Var.c();
        int iE = k73Var.e();
        int iD = k73Var.d();
        int i = 0;
        for (int i2 = 0; i2 < iD; i2++) {
            for (int i3 = 0; i3 < iE; i3++) {
                byte[] bArr = bArrC[i2];
                int i4 = i3 + 6;
                if (i4 < iE && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (g(bArr, i3 - 4, i3) || g(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < iD && bArrC[i2][i3] == 1 && bArrC[i2 + 1][i3] == 0 && bArrC[i2 + 2][i3] == 1 && bArrC[i2 + 3][i3] == 1 && bArrC[i2 + 4][i3] == 1 && bArrC[i2 + 5][i3] == 0 && bArrC[i5][i3] == 1 && (h(bArrC, i3, i2 - 4, i2) || h(bArrC, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    public static int e(k73 k73Var) {
        byte[][] bArrC = k73Var.c();
        int iE = k73Var.e();
        int iD = k73Var.d();
        int i = 0;
        for (int i2 = 0; i2 < iD; i2++) {
            byte[] bArr = bArrC[i2];
            for (int i3 = 0; i3 < iE; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int iD2 = k73Var.d() * k73Var.e();
        return ((Math.abs((i << 1) - iD2) * 10) / iD2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x003d A[RETURN] */
    public static boolean f(int i, int i2, int i3) {
        int i4;
        int i5;
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 1:
                i4 = i3 & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 2:
                i4 = i2 % 3;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 3:
                i4 = (i3 + i2) % 3;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 4:
                i3 /= 2;
                i2 /= 3;
                i3 += i2;
                i4 = i3 & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 5:
                int i6 = i3 * i2;
                i4 = (i6 & 1) + (i6 % 3);
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 6:
                int i7 = i3 * i2;
                i5 = (i7 & 1) + (i7 % 3);
                i4 = i5 & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 7:
                i5 = ((i3 * i2) % 3) + ((i3 + i2) & 1);
                i4 = i5 & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
        }
    }

    public static boolean g(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, bArr.length);
        for (int iMax = Math.max(i, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(byte[][] bArr, int i, int i2, int i3) {
        int iMin = Math.min(i3, bArr.length);
        for (int iMax = Math.max(i2, 0); iMax < iMin; iMax++) {
            if (bArr[iMax][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
