package y01;

import c2.x2;
import f72.ea;
import i3.i7;
import o4.e0;
import o4.m1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.q2;
import xd2.m0;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, float f14, float f15, p3.m mVar, int i14) {
        int i15;
        float f16;
        float f17;
        o4.r rVarA;
        o0 o0VarE = mVar.E(-397715597);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.i(f15) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p3.m.a aVar = p3.m.f135153a;
            if (str != null) {
                Object objH = q2.h(o0VarE, 1469558846, aVar);
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objH == c2565a) {
                    objH = p0.n(Boolean.FALSE);
                    o0VarE.K(objH);
                }
                p1 p1Var = (p1) objH;
                h4.r rVarQ = x2.q(h4.r.S, f14);
                g6.f.a aVar2 = g6.f.f75994b;
                d92.b.f58623a.getClass();
                h4.r rVarY = c2.l.y(u1.q.b(1, d92.b.a(o0VarE).j().b(), rVarQ, m1.f128891a), ((Boolean) p1Var.getF182175a()).booleanValue() ? 0 : f15);
                Object objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = new m0(19);
                    o0VarE.K(objQ);
                }
                h4.r rVarC = p5.v.c((e23.l) objQ, rVarY, false);
                s62.a.f157643a.getClass();
                t62.c cVar = t62.c.f162799a;
                u4.o oVarB = u4.p.b(ea.a(cVar), o0VarE);
                u4.o oVarB2 = u4.p.b(ea.a(cVar), o0VarE);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(1470292522);
                    o0VarE.g0(false);
                    rVarA = null;
                } else {
                    o0VarE.C(47427696);
                    rVarA = e0.a.a(e0.f128843b, d92.b.a(o0VarE).f().b());
                    o0VarE.g0(false);
                }
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new xq1.c(p1Var, i16);
                    o0VarE.K(objQ2);
                }
                jf.r.b(str, null, rVarC, oVarB, oVarB2, null, null, (e23.l) objQ2, null, null, null, rVarA, o0VarE, (i15 & 14) | 12619824, 0, 28512);
                o0VarE.g0(false);
                f17 = f14;
                f16 = f15;
            } else {
                o0VarE.C(1470342619);
                s62.a.f157643a.getClass();
                u4.d dVarA = ea.a(t62.c.f162799a);
                f17 = f14;
                h4.r rVarQ2 = x2.q(h4.r.S, f17);
                g6.f.a aVar3 = g6.f.f75994b;
                d92.b.f58623a.getClass();
                f16 = f15;
                h4.r rVarY2 = c2.l.y(u1.q.b(1, d92.b.a(o0VarE).j().b(), rVarQ2, m1.f128891a), f16);
                Object objQ3 = o0VarE.q();
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new m0(20);
                    o0VarE.K(objQ3);
                }
                i7.b(dVarA, null, p5.v.c((e23.l) objQ3, rVarY2, false), am.j.d(o0VarE), o0VarE, 48, 0);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
        } else {
            f16 = f15;
            f17 = f14;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(str, f17, f16, i14, 0);
        }
    }
}
