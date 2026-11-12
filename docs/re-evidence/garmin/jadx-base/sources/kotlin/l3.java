package kotlin;

import lc.u0;
import n4.d;
import n4.e;
import o4.b1;
import o4.f1;
import o4.j;
import o4.j1;
import o4.m;

/* JADX INFO: loaded from: classes.dex */
public final class l3 {
    public static final boolean a(b1 b1Var, float f14, float f15) {
        if (b1Var instanceof b1.b) {
            d dVar = ((b1.b) b1Var).f128812a;
            return dVar.f123547a <= f14 && f14 < dVar.f123549c && dVar.f123548b <= f15 && f15 < dVar.f123550d;
        }
        if (!(b1Var instanceof b1.c)) {
            if (b1Var instanceof b1.a) {
                return b(f14, f15, ((b1.a) b1Var).f128811a);
            }
            u0.r();
            return false;
        }
        e eVar = ((b1.c) b1Var).f128813a;
        float f16 = eVar.f123551a;
        long j8 = eVar.f123556f;
        long j14 = eVar.f123558h;
        long j15 = eVar.f123557g;
        float f17 = eVar.f123554d;
        float f18 = eVar.f123552b;
        float f19 = eVar.f123553c;
        long j16 = eVar.f123555e;
        if (f14 < f16 || f14 >= f19 || f15 < f18 || f15 >= f17) {
            return false;
        }
        int i14 = (int) (j16 >> 32);
        int i15 = (int) (j8 >> 32);
        if (Float.intBitsToFloat(i15) + Float.intBitsToFloat(i14) <= eVar.b()) {
            int i16 = (int) (j14 >> 32);
            int i17 = (int) (j15 >> 32);
            if (Float.intBitsToFloat(i17) + Float.intBitsToFloat(i16) <= eVar.b()) {
                int i18 = (int) (j16 & 4294967295L);
                int i19 = (int) (j14 & 4294967295L);
                if (Float.intBitsToFloat(i19) + Float.intBitsToFloat(i18) <= eVar.a()) {
                    int i24 = (int) (j8 & 4294967295L);
                    int i25 = (int) (j15 & 4294967295L);
                    if (Float.intBitsToFloat(i25) + Float.intBitsToFloat(i24) <= eVar.a()) {
                        float fIntBitsToFloat = Float.intBitsToFloat(i14) + f16;
                        float fIntBitsToFloat2 = Float.intBitsToFloat(i18) + f18;
                        float fIntBitsToFloat3 = f19 - Float.intBitsToFloat(i15);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i24) + f18;
                        float fIntBitsToFloat5 = f19 - Float.intBitsToFloat(i17);
                        float fIntBitsToFloat6 = f17 - Float.intBitsToFloat(i25);
                        float fIntBitsToFloat7 = f17 - Float.intBitsToFloat(i19);
                        float fIntBitsToFloat8 = Float.intBitsToFloat(i16) + f16;
                        if (f14 < fIntBitsToFloat && f15 < fIntBitsToFloat2) {
                            return c(f14, f15, fIntBitsToFloat, fIntBitsToFloat2, eVar.f123555e);
                        }
                        if (f14 < fIntBitsToFloat8 && f15 > fIntBitsToFloat7) {
                            return c(f14, f15, fIntBitsToFloat8, fIntBitsToFloat7, eVar.f123558h);
                        }
                        if (f14 > fIntBitsToFloat3 && f15 < fIntBitsToFloat4) {
                            return c(f14, f15, fIntBitsToFloat3, fIntBitsToFloat4, eVar.f123556f);
                        }
                        if (f14 <= fIntBitsToFloat5 || f15 <= fIntBitsToFloat6) {
                            return true;
                        }
                        return c(f14, f15, fIntBitsToFloat5, fIntBitsToFloat6, eVar.f123557g);
                    }
                }
            }
        }
        j jVarA = m.a();
        jVarA.k(eVar, f1.b.CounterClockwise);
        return b(f14, f15, jVarA);
    }

    public static final boolean b(float f14, float f15, f1 f1Var) {
        d dVar = new d(f14 - 0.005f, f15 - 0.005f, f14 + 0.005f, f15 + 0.005f);
        j jVarA = m.a();
        jVarA.q(dVar, f1.b.CounterClockwise);
        j jVarA2 = m.a();
        j1.f128873b.getClass();
        jVarA2.s(f1Var, jVarA, j1.f128874c);
        boolean zIsEmpty = jVarA2.f128869b.isEmpty();
        jVarA2.reset();
        jVarA.reset();
        return !zIsEmpty;
    }

    public static final boolean c(float f14, float f15, float f16, float f17, long j8) {
        float f18 = f14 - f16;
        float f19 = f15 - f17;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        return ((f19 * f19) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f18 * f18) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }
}
