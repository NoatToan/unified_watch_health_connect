package s70;

import o72.h3;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 {
    public static final void a(int i14, e23.a aVar, String str, p3.m mVar, u4.d dVar) {
        str.getClass();
        dVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1100353489);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            i3.u.b(z3.f.c(-255772767, new h3(str, 18), o0VarE), aVar, null, z3.f.c(535318308, new b82.k(dVar, 13), o0VarE), null, false, null, null, o0VarE, ((i15 >> 3) & 112) | 3078, 500);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.c0(i14, 3, aVar, str, dVar);
        }
    }

    public static final void b(int i14, e23.a aVar, String str, p3.m mVar, u4.d dVar) {
        p3.o0 o0VarL = vb.h.l(-1796210834, aVar, str, mVar);
        int i15 = (o0VarL.B(str) ? 4 : 2) | i14 | (o0VarL.B(dVar) ? 32 : 16) | (o0VarL.r(aVar) ? 256 : 128);
        if (o0VarL.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            i3.u.b(z3.f.c(-1490052706, new h3(str, 19), o0VarL), aVar, null, null, z3.f.c(-349509094, new b82.k(dVar, 14), o0VarL), false, null, null, o0VarL, ((i15 >> 3) & 112) | 24582, 492);
        } else {
            o0VarL.e();
        }
        p2 p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.c0(i14, 4, aVar, str, dVar);
        }
    }
}
