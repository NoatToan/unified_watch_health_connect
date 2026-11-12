package f5;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final n4.d a(c0 c0Var) {
        n4.d dVarJ0;
        c0 c0VarY = c0Var.y();
        return (c0VarY == null || (dVarJ0 = c0VarY.j0(c0Var, true)) == null) ? new n4.d(0.0f, 0.0f, (int) (c0Var.a() >> 32), (int) (c0Var.a() & 4294967295L)) : dVarJ0;
    }

    public static final n4.d b(c0 c0Var, boolean z14) {
        float f14;
        float f15;
        c0 c0VarC = c(c0Var);
        float fA = (int) (c0VarC.a() >> 32);
        float fA2 = (int) (c0VarC.a() & 4294967295L);
        n4.d dVarJ0 = c0VarC.j0(c0Var, z14);
        if (z14) {
            f14 = dVarJ0.f123547a;
            if (f14 < 0.0f) {
                f14 = 0.0f;
            }
            if (f14 > fA) {
                f14 = fA;
            }
        } else {
            f14 = dVarJ0.f123547a;
        }
        if (z14) {
            f15 = dVarJ0.f123548b;
            if (f15 < 0.0f) {
                f15 = 0.0f;
            }
            if (f15 > fA2) {
                f15 = fA2;
            }
        } else {
            f15 = dVarJ0.f123548b;
        }
        if (z14) {
            float f16 = dVarJ0.f123549c;
            if (f16 < 0.0f) {
                f16 = 0.0f;
            }
            if (f16 <= fA) {
                fA = f16;
            }
        } else {
            fA = dVarJ0.f123549c;
        }
        if (z14) {
            float f17 = dVarJ0.f123550d;
            float f18 = f17 >= 0.0f ? f17 : 0.0f;
            if (f18 <= fA2) {
                fA2 = f18;
            }
        } else {
            fA2 = dVarJ0.f123550d;
        }
        if (f14 == fA || f15 == fA2) {
            n4.d.f123545e.getClass();
            return n4.d.f123546f;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        long jW = c0VarC.W(jFloatToRawIntBits);
        long jW2 = c0VarC.W((((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L));
        long jW3 = c0VarC.W((((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L));
        long jW4 = c0VarC.W((((long) Float.floatToRawIntBits(fA2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f14)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jW >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jW2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jW4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jW3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jW & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jW2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jW4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jW3 & 4294967295L));
        return new n4.d(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final c0 c(c0 c0Var) {
        c0 c0Var2;
        c0 c0VarY = c0Var.y();
        while (true) {
            c0 c0Var3 = c0VarY;
            c0Var2 = c0Var;
            c0Var = c0Var3;
            if (c0Var == null) {
                break;
            }
            c0VarY = c0Var.y();
        }
        h5.c1 c1Var = c0Var2 instanceof h5.c1 ? (h5.c1) c0Var2 : null;
        if (c1Var == null) {
            return c0Var2;
        }
        h5.c1 c1Var2 = c1Var.f81715v;
        while (true) {
            h5.c1 c1Var3 = c1Var2;
            h5.c1 c1Var4 = c1Var;
            c1Var = c1Var3;
            if (c1Var == null) {
                return c1Var4;
            }
            c1Var2 = c1Var.f81715v;
        }
    }

    public static final long d(c0 c0Var) {
        c0 c0VarY = c0Var.y();
        if (c0VarY != null) {
            n4.c.f123541b.getClass();
            return c0VarY.b0(c0Var, 0L);
        }
        n4.c.f123541b.getClass();
        return 0L;
    }

    public static final long e(c0 c0Var) {
        n4.c.f123541b.getClass();
        return c0Var.B(0L);
    }

    public static final long f(c0 c0Var) {
        n4.c.f123541b.getClass();
        return c0Var.f(0L);
    }
}
