package b5;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final boolean a(a0 a0Var) {
        return (a0Var.b() || a0Var.f15755h || !a0Var.f15751d) ? false : true;
    }

    public static final boolean b(a0 a0Var) {
        return !a0Var.f15755h && a0Var.f15751d;
    }

    public static final boolean c(a0 a0Var) {
        return (a0Var.b() || !a0Var.f15755h || a0Var.f15751d) ? false : true;
    }

    public static final boolean d(a0 a0Var) {
        return a0Var.f15755h && !a0Var.f15751d;
    }

    public static final boolean e(a0 a0Var, long j8, long j14) {
        int i14 = a0Var.f15756i;
        m0.f15849b.getClass();
        int i15 = i14 == m0.f15850c ? 1 : 0;
        long j15 = a0Var.f15750c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & 4294967295L));
        float f14 = i15;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j14 >> 32)) * f14;
        float f15 = ((int) (j8 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j14 & 4294967295L)) * f14;
        return (fIntBitsToFloat > f15) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j8 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long f(a0 a0Var, boolean z14) {
        long jI = n4.c.i(a0Var.f15750c, a0Var.f15754g);
        if (z14 || !a0Var.b()) {
            return jI;
        }
        n4.c.f123541b.getClass();
        return 0L;
    }
}
