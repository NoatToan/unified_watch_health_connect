package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ehg {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        vgg.v(iArr, iArr2, iArr3);
        vgg.u(iArr, 6, iArr2, 6, iArr3, 12);
        int iD = vgg.d(iArr3, 6, iArr3, 12);
        int iC = iD + vgg.c(iArr3, 18, iArr3, 12, vgg.c(iArr3, 0, iArr3, 6, 0) + iD);
        int[] iArrE = vgg.e();
        int[] iArrE2 = vgg.e();
        boolean z = vgg.i(iArr, 6, iArr, 0, iArrE, 0) != vgg.i(iArr2, 6, iArr2, 0, iArrE2, 0);
        int[] iArrG = vgg.g();
        vgg.v(iArrE, iArrE2, iArrG);
        xgg.f(24, iC + (z ? xgg.d(12, iArrG, 0, iArr3, 6) : xgg.L(12, iArrG, 0, iArr3, 6)), iArr3, 18);
    }

    public static void b(int[] iArr, int[] iArr2) {
        vgg.B(iArr, iArr2);
        vgg.A(iArr, 6, iArr2, 12);
        int iD = vgg.d(iArr2, 6, iArr2, 12);
        int iC = iD + vgg.c(iArr2, 18, iArr2, 12, vgg.c(iArr2, 0, iArr2, 6, 0) + iD);
        int[] iArrE = vgg.e();
        vgg.i(iArr, 6, iArr, 0, iArrE, 0);
        int[] iArrG = vgg.g();
        vgg.B(iArrE, iArrG);
        xgg.f(24, iC + xgg.L(12, iArrG, 0, iArr2, 6), iArr2, 18);
    }
}
