package o4;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public static void a(q4.f fVar, b1 b1Var, long j8) {
        q4.j jVar = q4.j.f142560a;
        q4.f.f142555o0.getClass();
        int i14 = q4.f.a.f142557b;
        if (b1Var instanceof b1.b) {
            n4.d dVar = ((b1.b) b1Var).f128812a;
            float f14 = dVar.f123547a;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(dVar.f123548b)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
            n4.c.a aVar = n4.c.f123541b;
            fVar.r1(j8, jFloatToRawIntBits, b(dVar), 1.0f, jVar, null, i14);
            return;
        }
        if (!(b1Var instanceof b1.c)) {
            if (b1Var instanceof b1.a) {
                fVar.I(((b1.a) b1Var).f128811a, j8, 1.0f, jVar, i14);
                return;
            } else {
                lc.u0.r();
                return;
            }
        }
        b1.c cVar = (b1.c) b1Var;
        j jVar2 = cVar.f128814b;
        if (jVar2 != null) {
            fVar.I(jVar2, j8, 1.0f, jVar, i14);
            return;
        }
        n4.e eVar = cVar.f128813a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.f123558h >> 32));
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(eVar.f123551a)) << 32) | (((long) Float.floatToRawIntBits(eVar.f123552b)) & 4294967295L);
        n4.c.a aVar2 = n4.c.f123541b;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(eVar.b())) << 32) | (((long) Float.floatToRawIntBits(eVar.a())) & 4294967295L);
        n4.g.a aVar3 = n4.g.f123559b;
        fVar.U(j8, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), jVar, i14);
    }

    public static final long b(n4.d dVar) {
        float f14 = dVar.f123549c - dVar.f123547a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(dVar.f123550d - dVar.f123548b)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
        n4.g.a aVar = n4.g.f123559b;
        return jFloatToRawIntBits;
    }
}
