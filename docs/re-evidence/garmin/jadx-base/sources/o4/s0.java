package o4;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static o1 f128982a;

    public static final h4.r a(h4.r rVar, e23.l<? super t0, Unit> lVar) {
        return rVar.then(new u(lVar));
    }

    public static h4.r b(h4.r rVar, float f14, float f15, float f16, float f17, r1 r1Var, int i14) {
        float f18 = (i14 & 1) != 0 ? 1.0f : f14;
        float f19 = (i14 & 2) != 0 ? 1.0f : f15;
        float f22 = (i14 & 4) != 0 ? 1.0f : f16;
        float f24 = (i14 & 32) != 0 ? 0.0f : f17;
        z1.f129046b.getClass();
        long j8 = z1.f129047c;
        r1 r1Var2 = (i14 & 2048) != 0 ? m1.f128891a : r1Var;
        long j14 = u0.f129009a;
        n0.f128892b.getClass();
        q.f128930b.getClass();
        return rVar.then(new r0(f18, f19, f22, 0.0f, 0.0f, f24, 0.0f, 0.0f, 0.0f, 8.0f, j8, r1Var2, false, null, j14, j14, 0, q.f128933e, null, null));
    }

    public static h4.r c(h4.r rVar, float f14, float f15, float f16, float f17, r1 r1Var, int i14, int i15) {
        int i16;
        float f18 = (i15 & 1) != 0 ? 1.0f : f14;
        float f19 = (i15 & 2) != 0 ? 1.0f : f15;
        float f22 = (i15 & 4) != 0 ? 1.0f : f16;
        float f24 = (i15 & 256) != 0 ? 0.0f : f17;
        z1.f129046b.getClass();
        long j8 = z1.f129047c;
        r1 r1Var2 = (i15 & 2048) != 0 ? m1.f128891a : r1Var;
        boolean z14 = (i15 & 4096) == 0;
        long j14 = u0.f129009a;
        if ((i15 & 65536) != 0) {
            n0.f128892b.getClass();
            i16 = 0;
        } else {
            i16 = i14;
        }
        q.f128930b.getClass();
        return rVar.then(new r0(f18, f19, f22, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f24, 8.0f, j8, r1Var2, z14, null, j14, j14, i16, q.f128933e, null, null));
    }
}
