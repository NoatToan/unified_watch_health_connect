package defpackage;

import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/* JADX INFO: loaded from: classes5.dex */
public final class w8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f37720a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f37721b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static void a(zo2 zo2Var, ErrorCorrectionLevel errorCorrectionLevel, bpq bpqVar, int i, k73 k73Var) throws WriterException {
        c(k73Var);
        d(bpqVar, k73Var);
        l(errorCorrectionLevel, i, k73Var);
        s(bpqVar, k73Var);
        f(zo2Var, i, k73Var);
    }

    public static int b(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iN = n(i2);
        int iN2 = i << (iN - 1);
        while (n(iN2) >= iN) {
            iN2 ^= i2 << (n(iN2) - iN);
        }
        return iN2;
    }

    public static void c(k73 k73Var) {
        k73Var.a((byte) -1);
    }

    public static void d(bpq bpqVar, k73 k73Var) throws WriterException {
        j(k73Var);
        e(k73Var);
        r(bpqVar, k73Var);
        k(k73Var);
    }

    public static void e(k73 k73Var) throws WriterException {
        if (k73Var.b(8, k73Var.d() - 8) == 0) {
            throw new WriterException();
        }
        k73Var.f(8, k73Var.d() - 8, 1);
    }

    public static void f(zo2 zo2Var, int i, k73 k73Var) throws WriterException {
        boolean zG;
        int iE = k73Var.e() - 1;
        int iD = k73Var.d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (iE > 0) {
            if (iE == 6) {
                iE--;
            }
            while (iD >= 0 && iD < k73Var.d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = iE - i4;
                    if (o(k73Var.b(i5, iD))) {
                        if (i2 < zo2Var.k()) {
                            zG = zo2Var.g(i2);
                            i2++;
                        } else {
                            zG = false;
                        }
                        if (i != -1 && r5f.f(i, i5, iD)) {
                            zG = !zG;
                        }
                        k73Var.g(i5, iD, zG);
                    }
                }
                iD += i3;
            }
            i3 = -i3;
            iD += i3;
            iE -= 2;
        }
        if (i2 == zo2Var.k()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i2 + '/' + zo2Var.k());
    }

    public static void g(int i, int i2, k73 k73Var) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!o(k73Var.b(i4, i2))) {
                throw new WriterException();
            }
            k73Var.f(i4, i2, 0);
        }
    }

    public static void h(int i, int i2, k73 k73Var) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f37721b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                k73Var.f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static void i(int i, int i2, k73 k73Var) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f37720a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                k73Var.f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static void j(k73 k73Var) throws WriterException {
        int length = f37720a[0].length;
        i(0, 0, k73Var);
        i(k73Var.e() - length, 0, k73Var);
        i(0, k73Var.e() - length, k73Var);
        g(0, 7, k73Var);
        g(k73Var.e() - 8, 7, k73Var);
        g(0, k73Var.e() - 8, k73Var);
        m(7, 0, k73Var);
        m(k73Var.d() - 8, 0, k73Var);
        m(7, k73Var.d() - 7, k73Var);
    }

    public static void k(k73 k73Var) {
        int i = 8;
        while (i < k73Var.e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (o(k73Var.b(i, 6))) {
                k73Var.f(i, 6, i3);
            }
            if (o(k73Var.b(6, i))) {
                k73Var.f(6, i, i3);
            }
            i = i2;
        }
    }

    public static void l(ErrorCorrectionLevel errorCorrectionLevel, int i, k73 k73Var) throws WriterException {
        zo2 zo2Var = new zo2();
        p(errorCorrectionLevel, i, zo2Var);
        for (int i2 = 0; i2 < zo2Var.k(); i2++) {
            boolean zG = zo2Var.g((zo2Var.k() - 1) - i2);
            int[] iArr = d[i2];
            k73Var.g(iArr[0], iArr[1], zG);
            if (i2 < 8) {
                k73Var.g((k73Var.e() - i2) - 1, 8, zG);
            } else {
                k73Var.g(8, (k73Var.d() - 7) + (i2 - 8), zG);
            }
        }
    }

    public static void m(int i, int i2, k73 k73Var) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!o(k73Var.b(i, i4))) {
                throw new WriterException();
            }
            k73Var.f(i, i4, 0);
        }
    }

    public static int n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    public static boolean o(int i) {
        return i == -1;
    }

    public static void p(ErrorCorrectionLevel errorCorrectionLevel, int i, zo2 zo2Var) throws WriterException {
        if (!hfi.b(i)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (errorCorrectionLevel.getBits() << 3) | i;
        zo2Var.c(bits, 5);
        zo2Var.c(b(bits, 1335), 10);
        zo2 zo2Var2 = new zo2();
        zo2Var2.c(21522, 15);
        zo2Var.u(zo2Var2);
        if (zo2Var.k() == 15) {
            return;
        }
        throw new WriterException("should not happen but we got: " + zo2Var.k());
    }

    public static void q(bpq bpqVar, zo2 zo2Var) throws WriterException {
        zo2Var.c(bpqVar.j(), 6);
        zo2Var.c(b(bpqVar.j(), 7973), 12);
        if (zo2Var.k() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + zo2Var.k());
    }

    public static void r(bpq bpqVar, k73 k73Var) {
        if (bpqVar.j() < 2) {
            return;
        }
        int[] iArr = c[bpqVar.j() - 1];
        for (int i : iArr) {
            if (i >= 0) {
                for (int i2 : iArr) {
                    if (i2 >= 0 && o(k73Var.b(i2, i))) {
                        h(i2 - 2, i - 2, k73Var);
                    }
                }
            }
        }
    }

    public static void s(bpq bpqVar, k73 k73Var) throws WriterException {
        if (bpqVar.j() < 7) {
            return;
        }
        zo2 zo2Var = new zo2();
        q(bpqVar, zo2Var);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean zG = zo2Var.g(i);
                i--;
                k73Var.g(i2, (k73Var.d() - 11) + i3, zG);
                k73Var.g((k73Var.d() - 11) + i3, i2, zG);
            }
        }
    }
}
