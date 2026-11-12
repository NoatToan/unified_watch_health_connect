package l4;

import o4.r1;
import o4.s0;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final h4.r a(h4.r rVar, float f14) {
        return f14 == 1.0f ? rVar : s0.c(rVar, 0.0f, 0.0f, f14, 0.0f, null, 0, 520187);
    }

    public static final h4.r b(h4.r rVar, r1 r1Var) {
        return s0.c(rVar, 0.0f, 0.0f, 0.0f, 0.0f, r1Var, 0, 518143);
    }

    public static final h4.r c(h4.r rVar) {
        return s0.c(rVar, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, 520191);
    }

    public static final h4.r d(h4.r rVar, e23.l lVar) {
        return rVar.then(new h(lVar));
    }

    public static final h4.r e(h4.r rVar, e23.l lVar) {
        return rVar.then(new m(lVar));
    }

    public static final h4.r f(h4.r rVar, e23.l lVar) {
        return rVar.then(new n(lVar));
    }

    public static final h4.r g(h4.r rVar, float f14) {
        return f14 == 0.0f ? rVar : s0.c(rVar, 0.0f, 0.0f, 0.0f, f14, null, 0, 524031);
    }

    public static final h4.r h(h4.r rVar, float f14, float f15) {
        return (f14 == 1.0f && f15 == 1.0f) ? rVar : s0.c(rVar, f14, f15, 0.0f, 0.0f, null, 0, 524284);
    }
}
