package w51;

/* JADX INFO: loaded from: classes9.dex */
public final class c1 {
    public static final double a(z51.h hVar) {
        hVar.getClass();
        Double d14 = hVar.f202509e;
        if (!zf.b.D(d14)) {
            return b(d14, hVar.b(), hVar.d());
        }
        if (d14 != null) {
            return d14.doubleValue();
        }
        return Double.NaN;
    }

    public static final double b(Double d14, b63.u uVar, b63.u uVar2) {
        if (uVar == null) {
            uVar = g22.l.e(b63.u.INSTANCE);
        }
        if (uVar2 == null) {
            uVar2 = g22.l.e(b63.u.INSTANCE);
        }
        if (uVar2.compareTo(uVar) >= 0) {
            if (d14 != null) {
                return d14.doubleValue();
            }
            return Double.NaN;
        }
        b63.z.INSTANCE.getClass();
        b63.k kVar = b63.z.f16226b;
        e53.j jVarC = b63.b.c(uVar, kVar);
        e53.j jVarC2 = b63.b.c(uVar2, kVar);
        jVarC.getClass();
        jVarC2.getClass();
        e53.c.a aVar = e53.c.f63094b;
        long j8 = jVarC.f63115a - jVarC2.f63115a;
        e53.f fVar = e53.f.SECONDS;
        return e53.c.i(e53.c.h(e53.e.f(j8, fVar), e53.e.e(jVarC.f63116b - jVarC2.f63116b, e53.f.NANOSECONDS)), fVar);
    }
}
