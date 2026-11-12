package wb1;

import c2.x2;
import c80.y0;
import h4.r;
import i3.ve;
import o4.d0;
import o4.m1;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import w52.k0;

/* JADX INFO: loaded from: classes9.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    public static final void a(r rVar, y0 y0Var, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        e23.a<Unit> aVar2;
        int i16;
        e23.a<Unit> aVar3;
        r rVar2;
        y0Var.getClass();
        o0 o0VarE = mVar.E(893406681);
        int i17 = i14 | 6 | (o0VarE.r(y0Var) ? 32 : 16);
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 = i17 | 384;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i16 = i17 | (o0VarE.r(aVar2) ? 256 : 128);
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            r.a aVar4 = r.S;
            e23.a<Unit> aVar5 = i18 != 0 ? null : aVar2;
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            r rVarB = l4.k.b(aVar4, k2.i.a(j92.b.f97900c.f97911c));
            boolean z14 = aVar5 != null;
            boolean z15 = (i16 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new rx1.m(aVar5, 19);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rx1.m(aVar5, 19);
                    o0VarE.K(objQ);
                }
            }
            r rVarF = x2.f(u1.n.e(wz1.i.a((e23.l) objQ, rVarB, z14), v.h.t(o0VarE), m1.f128891a), 1.0f);
            bVar.getClass();
            r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
            d0.f128823b.getClass();
            ve.a(rVarY, null, d0.f128831j, 0L, 0.0f, 0.0f, null, z3.f.c(-208745122, new vy0.e(y0Var, 9), o0VarE), o0VarE, 12583296, 122);
            rVar2 = aVar4;
            aVar3 = aVar5;
        } else {
            o0VarE.e();
            aVar3 = aVar2;
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(i14, i15, rVar2, y0Var, aVar3, 4);
        }
    }
}
