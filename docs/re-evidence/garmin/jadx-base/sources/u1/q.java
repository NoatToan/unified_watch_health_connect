package u1;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static h4.r a(h4.r rVar, u uVar) {
        return c(uVar.f167683a, rVar, uVar.f167684b, o4.m1.f128891a);
    }

    public static final h4.r b(float f14, long j8, h4.r rVar, o4.r1 r1Var) {
        return c(f14, rVar, new o4.t1(j8, null), r1Var);
    }

    public static final h4.r c(float f14, h4.r rVar, o4.w wVar, o4.r1 r1Var) {
        return rVar.then(new t(f14, wVar, r1Var, null));
    }

    public static final long d(float f14, long j8) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j8 >> 32)) - f14);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j8 & 4294967295L)) - f14);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
        n4.a.C2318a c2318a = n4.a.f123535b;
        return jFloatToRawIntBits;
    }
}
