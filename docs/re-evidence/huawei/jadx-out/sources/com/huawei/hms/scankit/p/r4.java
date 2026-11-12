package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes10.dex */
abstract class r4 {
    static int a(c0 c0Var) {
        return a(c0Var, true) + a(c0Var, false);
    }

    static int b(c0 c0Var) {
        byte[][] bArrA = c0Var.a();
        int iC = c0Var.c();
        int iB = c0Var.b();
        int i = 0;
        for (int i2 = 0; i2 < iB - 1; i2++) {
            byte[] bArr = bArrA[i2];
            int i3 = 0;
            while (i3 < iC - 1) {
                byte b2 = bArr[i3];
                int i4 = i3 + 1;
                if (b2 == bArr[i4]) {
                    byte[] bArr2 = bArrA[i2 + 1];
                    if (b2 == bArr2[i3] && b2 == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    static int c(c0 c0Var) {
        byte[][] bArrA = c0Var.a();
        int iC = c0Var.c();
        int iB = c0Var.b();
        int i = 0;
        for (int i2 = 0; i2 < iB; i2++) {
            for (int i3 = 0; i3 < iC; i3++) {
                byte[] bArr = bArrA[i2];
                int i4 = i3 + 6;
                if (i4 < iC && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (a(bArr, i3 - 4, i3) || a(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < iB && bArrA[i2][i3] == 1 && bArrA[i2 + 1][i3] == 0 && bArrA[i2 + 2][i3] == 1 && bArrA[i2 + 3][i3] == 1 && bArrA[i2 + 4][i3] == 1 && bArrA[i2 + 5][i3] == 0 && bArrA[i5][i3] == 1 && (a(bArrA, i3, i2 - 4, i2) || a(bArrA, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    static int d(c0 c0Var) {
        byte[][] bArrA = c0Var.a();
        int iC = c0Var.c();
        int iB = c0Var.b();
        int i = 0;
        for (int i2 = 0; i2 < iB; i2++) {
            byte[] bArr = bArrA[i2];
            for (int i3 = 0; i3 < iC; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int iB2 = c0Var.b() * c0Var.c();
        return ((Math.abs((i * 2) - iB2) * 10) / iB2) * 10;
    }

    private static int a(c0 c0Var, boolean z) {
        int iB = z ? c0Var.b() : c0Var.c();
        int iC = z ? c0Var.c() : c0Var.b();
        byte[][] bArrA = c0Var.a();
        int i = 0;
        for (int i2 = 0; i2 < iB; i2++) {
            byte b2 = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < iC; i4++) {
                byte b3 = z ? bArrA[i2][i4] : bArrA[i4][i2];
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[RETURN] */
    static boolean a(int i, int i2, int i3) {
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
                throw new IllegalArgumentException("Invalid mask pattern: " + i);
        }
    }

    private static boolean a(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, bArr.length);
        for (int iMax = Math.max(i, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(byte[][] bArr, int i, int i2, int i3) {
        int iMin = Math.min(i3, bArr.length);
        for (int iMax = Math.max(i2, 0); iMax < iMin; iMax++) {
            if (iMax < bArr.length && i < bArr[0].length && bArr[iMax][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
