package z2;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4.d f201741a = new n4.d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201742a;

        static {
            int[] iArr = new int[p006l2.l1.values().length];
            try {
                iArr[p006l2.l1.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p006l2.l1.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p006l2.l1.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f201742a = iArr;
        }
    }

    public static final boolean a(long j8, n4.d dVar) {
        float f14 = dVar.f123547a;
        float f15 = dVar.f123549c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        if (f14 > fIntBitsToFloat || fIntBitsToFloat > f15) {
            return false;
        }
        float f16 = dVar.f123548b;
        float f17 = dVar.f123550d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        return f16 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long b(o1 o1Var, long j8, b0.a aVar) {
        float fD;
        y yVarC = o1Var.c(aVar);
        if (yVarC == null) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        f5.c0 c0Var = o1Var.f201722m;
        if (c0Var == null) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        f5.c0 c0VarE = yVarC.e();
        if (c0VarE == null) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        int i14 = aVar.f201527b;
        if (i14 > yVarC.g()) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        n4.c cVar = (n4.c) o1Var.f201729t.getF182175a();
        cVar.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0VarE.b0(c0Var, cVar.f123544a) >> 32));
        long j14 = yVarC.j(i14);
        if (s5.w0.e(j14)) {
            fD = yVarC.c(i14);
        } else {
            float fC = yVarC.c((int) (j14 >> 32));
            float fD2 = yVarC.d(((int) (j14 & 4294967295L)) - 1);
            fD = j23.t.d(fIntBitsToFloat, Math.min(fC, fD2), Math.max(fC, fD2));
        }
        if (fD == -1.0f) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        g6.m.f76012b.getClass();
        if (!g6.m.c(j8, 0L) && Math.abs(fIntBitsToFloat - fD) > ((int) (j8 >> 32)) / 2) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        float fH = yVarC.h(i14);
        if (fH == -1.0f) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        return c0Var.b0(c0VarE, (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L));
    }

    public static final n4.d c(f5.c0 c0Var) {
        n4.d dVarB = f5.d0.b(c0Var, true);
        return g8.i.f(c0Var.F(dVarB.i()), c0Var.F(dVarB.e()));
    }
}
