package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fhg {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        wgg.v(iArr, iArr2, iArr3);
        wgg.u(iArr, 6, iArr2, 6, iArr3, 12);
        int iD = wgg.d(iArr3, 6, iArr3, 12);
        int iC = iD + wgg.c(iArr3, 18, iArr3, 12, wgg.c(iArr3, 0, iArr3, 6, 0) + iD);
        int[] iArrE = wgg.e();
        int[] iArrE2 = wgg.e();
        boolean z = wgg.i(iArr, 6, iArr, 0, iArrE, 0) != wgg.i(iArr2, 6, iArr2, 0, iArrE2, 0);
        int[] iArrG = wgg.g();
        wgg.v(iArrE, iArrE2, iArrG);
        mhg.f(24, iC + (z ? mhg.d(12, iArrG, 0, iArr3, 6) : mhg.L(12, iArrG, 0, iArr3, 6)), iArr3, 18);
    }

    public static void b(int[] iArr, int[] iArr2) {
        wgg.B(iArr, iArr2);
        wgg.A(iArr, 6, iArr2, 12);
        int iD = wgg.d(iArr2, 6, iArr2, 12);
        int iC = iD + wgg.c(iArr2, 18, iArr2, 12, wgg.c(iArr2, 0, iArr2, 6, 0) + iD);
        int[] iArrE = wgg.e();
        wgg.i(iArr, 6, iArr, 0, iArrE, 0);
        int[] iArrG = wgg.g();
        wgg.B(iArrE, iArrG);
        mhg.f(24, iC + mhg.L(12, iArrG, 0, iArr2, 6), iArr2, 18);
    }
}
