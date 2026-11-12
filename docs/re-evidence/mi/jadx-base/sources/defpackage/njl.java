package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class njl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f27986a = {-4553, -2, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f27987b = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
    public static final int[] c = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (vgg.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && vgg.p(iArr3, f27986a))) {
            xgg.b(6, 4553, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (xgg.r(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && vgg.p(iArr2, f27986a))) {
            xgg.b(6, 4553, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrL = vgg.l(bigInteger);
        if (iArrL[5] == -1) {
            int[] iArr = f27986a;
            if (vgg.p(iArrL, iArr)) {
                vgg.E(iArr, iArrL);
            }
        }
        return iArrL;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrG = vgg.g();
        vgg.v(iArr, iArr2, iArrG);
        g(iArrG, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (vgg.z(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && xgg.p(12, iArr3, f27987b))) {
            int[] iArr4 = c;
            if (xgg.e(iArr4.length, iArr4, iArr3) != 0) {
                xgg.s(12, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (vgg.s(iArr)) {
            vgg.H(iArr2);
        } else {
            vgg.D(f27986a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (vgg.x(4553, vgg.w(4553, iArr, 6, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[5] == -1 && vgg.p(iArr2, f27986a))) {
            xgg.b(6, 4553, iArr2);
        }
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || vgg.y(4553, i, iArr, 0) == 0) && !(iArr[5] == -1 && vgg.p(iArr, f27986a))) {
            return;
        }
        xgg.b(6, 4553, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArrG = vgg.g();
        vgg.B(iArr, iArrG);
        g(iArrG, iArr2);
    }

    public static void j(int[] iArr, int i, int[] iArr2) {
        int[] iArrG = vgg.g();
        vgg.B(iArr, iArrG);
        g(iArrG, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            vgg.B(iArr2, iArrG);
            g(iArrG, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (vgg.D(iArr, iArr2, iArr3) != 0) {
            xgg.K(6, 4553, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (xgg.D(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && vgg.p(iArr2, f27986a))) {
            xgg.b(6, 4553, iArr2);
        }
    }
}
