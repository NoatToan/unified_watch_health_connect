package ew0;

import c2.n3;
import p005kotlin.Unit;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(m mVar, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar2, int i14) {
        mVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar2.E(-266533407);
        int i15 = i14 | (o0VarE.r(mVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(mVar.f66242i, o0VarE);
            boolean z15 = ((l) p1VarC.getF182175a()).f66230a;
            z3.e eVarC = z3.f.c(1782156838, new a42.e(z14, aVar, 2), o0VarE);
            g6.f.a aVar4 = g6.f.f75994b;
            z02.d.a(z15, eVarC, null, null, n3.b(0.0f, 0.0f, 0.0f, 0, 7), z3.f.c(-1565022934, new d50.i(18, aVar3, mVar, p1VarC, aVar2), o0VarE), o0VarE, 196656, 12);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(mVar, z14, aVar, aVar2, aVar3, i14);
        }
    }
}
