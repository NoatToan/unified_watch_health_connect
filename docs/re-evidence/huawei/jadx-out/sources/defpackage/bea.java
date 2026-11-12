package defpackage;

/* JADX INFO: loaded from: classes23.dex */
public class bea {
    public static bdu b(bdu bduVar, int i) {
        boolean z = i <= 6;
        int i2 = z ? 6 - i : i - 6;
        return new bdu(c(bduVar, i2, z), e(bduVar, i2, z), a(bduVar, i2, z), bduVar.b());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027 A[PHI: r3 r4
      0x0027: PHI (r3v10 float) = (r3v1 float), (r3v12 float) binds: [B:10:0x0025, B:7:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r4v7 float) = (r4v2 float), (r4v9 float) binds: [B:10:0x0025, B:7:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0029 A[PHI: r3 r4
      0x0029: PHI (r3v2 float) = (r3v1 float), (r3v12 float) binds: [B:10:0x0025, B:7:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r4v3 float) = (r4v2 float), (r4v9 float) binds: [B:10:0x0025, B:7:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    private static float c(bdu bduVar, int i, boolean z) {
        float fD;
        float f;
        float f2;
        if (bduVar.d() >= 60.0f && bduVar.d() <= 240.0f) {
            fD = bduVar.d();
            f = i * 2.0f;
            if (z) {
                f2 = fD - f;
            } else {
                f2 = fD + f;
            }
        } else {
            fD = bduVar.d();
            f = i * 2.0f;
            if (z) {
                f2 = fD + f;
            } else {
                f2 = fD - f;
            }
        }
        if (f2 < 0.0f) {
            f2 += 360.0f;
        } else if (f2 >= 360.0f) {
            f2 -= 360.0f;
        }
        return Math.round(f2);
    }

    private static float e(bdu bduVar, int i, boolean z) {
        float fE;
        float fE2;
        float f = 0.16f;
        if (z) {
            fE2 = bduVar.e() - (i * 0.16f);
        } else {
            if (i == 4) {
                fE = bduVar.e();
            } else {
                fE = bduVar.e();
                f = i * 0.05f;
            }
            fE2 = fE + f;
        }
        if (fE2 > 1.0f) {
            fE2 = 1.0f;
        }
        if (z && i == 5 && fE2 > 0.1f) {
            fE2 = 0.1f;
        }
        if (fE2 < 0.06f) {
            return 0.06f;
        }
        return fE2;
    }

    private static float a(bdu bduVar, int i, boolean z) {
        float fC;
        if (z) {
            fC = bduVar.c() + (i * 0.05f);
        } else {
            fC = bduVar.c() - (i * 0.15f);
        }
        if (fC > 1.0f) {
            return 1.0f;
        }
        return fC;
    }
}
