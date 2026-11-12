package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ihg {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        ahg.w(iArr, iArr2, iArr3);
        ahg.v(iArr, 8, iArr2, 8, iArr3, 16);
        int iE = ahg.e(iArr3, 8, iArr3, 16);
        int iC = iE + ahg.c(iArr3, 24, iArr3, 16, ahg.c(iArr3, 0, iArr3, 8, 0) + iE);
        int[] iArrF = ahg.f();
        int[] iArrF2 = ahg.f();
        boolean z = ahg.j(iArr, 8, iArr, 0, iArrF, 0) != ahg.j(iArr2, 8, iArr2, 0, iArrF2, 0);
        int[] iArrH = ahg.h();
        ahg.w(iArrF, iArrF2, iArrH);
        xgg.f(32, iC + (z ? xgg.d(16, iArrH, 0, iArr3, 8) : xgg.L(16, iArrH, 0, iArr3, 8)), iArr3, 24);
    }

    public static void b(int[] iArr, int[] iArr2) {
        ahg.D(iArr, iArr2);
        ahg.C(iArr, 8, iArr2, 16);
        int iE = ahg.e(iArr2, 8, iArr2, 16);
        int iC = iE + ahg.c(iArr2, 24, iArr2, 16, ahg.c(iArr2, 0, iArr2, 8, 0) + iE);
        int[] iArrF = ahg.f();
        ahg.j(iArr, 8, iArr, 0, iArrF, 0);
        int[] iArrH = ahg.h();
        ahg.D(iArrF, iArrH);
        xgg.f(32, iC + xgg.L(16, iArrH, 0, iArr2, 8), iArr2, 24);
    }
}
