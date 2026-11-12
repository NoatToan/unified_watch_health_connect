package et;

import e11.f0;
import p005kotlin.Unit;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class q {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(zs.c cVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, p3.m mVar, int i14) {
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(1138362767);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024) | (o0VarE.r(aVar4) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(cVar.f206792h, o0VarE);
            vs.d dVar = (vs.d) s9.c.c(cVar.f206795k, o0VarE).getF182175a();
            boolean z14 = (dVar != null ? dVar.f179705c : null) instanceof xs.c.b;
            vs.a aVar5 = ((ys.b) p1VarC.getF182175a()).f199162d;
            at.c.a(z14, (aVar5 != null ? aVar5.f179693b : null) == null, aVar2, z3.f.c(953016101, new o(aVar, aVar4, p1VarC, 0), o0VarE), null, z3.f.c(-1702773272, new f0(aVar3, 4, cVar, p1VarC), o0VarE), o0VarE, (i15 & 896) | 1575936, 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p((Object) cVar, (Object) aVar, (Object) aVar2, (Object) aVar3, (o13.h) aVar4, i14, 0);
        }
    }
}
