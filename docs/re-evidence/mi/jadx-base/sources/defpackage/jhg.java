package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jhg {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        bhg.w(iArr, iArr2, iArr3);
        bhg.v(iArr, 8, iArr2, 8, iArr3, 16);
        int iE = bhg.e(iArr3, 8, iArr3, 16);
        int iC = iE + bhg.c(iArr3, 24, iArr3, 16, bhg.c(iArr3, 0, iArr3, 8, 0) + iE);
        int[] iArrF = bhg.f();
        int[] iArrF2 = bhg.f();
        boolean z = bhg.j(iArr, 8, iArr, 0, iArrF, 0) != bhg.j(iArr2, 8, iArr2, 0, iArrF2, 0);
        int[] iArrH = bhg.h();
        bhg.w(iArrF, iArrF2, iArrH);
        mhg.f(32, iC + (z ? mhg.d(16, iArrH, 0, iArr3, 8) : mhg.L(16, iArrH, 0, iArr3, 8)), iArr3, 24);
    }

    public static void b(int[] iArr, int[] iArr2) {
        bhg.D(iArr, iArr2);
        bhg.C(iArr, 8, iArr2, 16);
        int iE = bhg.e(iArr2, 8, iArr2, 16);
        int iC = iE + bhg.c(iArr2, 24, iArr2, 16, bhg.c(iArr2, 0, iArr2, 8, 0) + iE);
        int[] iArrF = bhg.f();
        bhg.j(iArr, 8, iArr, 0, iArrF, 0);
        int[] iArrH = bhg.h();
        bhg.D(iArrF, iArrH);
        mhg.f(32, iC + mhg.L(16, iArrH, 0, iArr2, 8), iArr2, 24);
    }
}
