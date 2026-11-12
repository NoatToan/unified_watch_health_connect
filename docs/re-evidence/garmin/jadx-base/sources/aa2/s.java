package aa2;

import gl1.y;
import i3.kb;
import lc.m0;
import lc.v0;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class s {
    public static final void a(u uVar, e23.l<? super Integer, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1161441464);
        int i15 = (o0VarE.r(uVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c.b(y.Q(o0VarE, uVar.f2389a.f26603c), lVar, o0VarE, i15 & 112);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(uVar, lVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00ce  */
    public static final void b(u uVar, e23.a aVar, e23.l lVar, e23.r rVar, e23.r rVar2, p3.m mVar, int i14) {
        int i15;
        Object obj;
        Object obj2;
        o0 o0Var;
        e23.r rVar3;
        Object pVar;
        z3.e eVar;
        m0 m0Var;
        uVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1104715695);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(uVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            obj = aVar;
            i15 |= o0VarE.r(obj) ? 32 : 16;
        } else {
            obj = aVar;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        int i16 = i15 | 3072;
        if ((i14 & 24576) == 0) {
            obj2 = rVar2;
            i16 |= o0VarE.r(obj2) ? 16384 : 8192;
        } else {
            obj2 = rVar2;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            z3.e eVarC = z3.f.c(2006743657, new j(lVar, 0), o0VarE);
            x1 x1Var = p3.n.f135158a;
            m0 m0VarI = y.I(new v0[0], o0VarE);
            boolean zR = ((i16 & 112) == 32) | ((57344 & i16) == 16384) | o0VarE.r(uVar) | ((i16 & 7168) == 2048) | o0VarE.r(m0VarI) | ((i16 & 896) == 256);
            Object objQ = o0VarE.q();
            if (zR) {
                eVar = eVarC;
                m0Var = m0VarI;
                pVar = new p(uVar, obj2, eVar, m0Var, obj, lVar, 0);
                o0VarE.K(pVar);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    eVar = eVarC;
                    m0Var = m0VarI;
                    pVar = new p(uVar, obj2, eVar, m0Var, obj, lVar, 0);
                    o0VarE.K(pVar);
                } else {
                    pVar = objQ;
                    eVar = eVarC;
                    m0Var = m0VarI;
                }
            }
            o0Var = o0VarE;
            nc.y.b(m0Var, "PASSCODE_INPUT_ROUTE", null, null, null, null, null, null, (e23.l) pVar, o0Var, 48, 1020);
            rVar3 = eVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(uVar, aVar, lVar, rVar3, rVar2, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    public static final void c(u uVar, m0 m0Var, e23.a<Unit> aVar, e23.l<? super Integer, Unit> lVar, p3.m mVar, int i14) {
        u uVar2;
        e23.l<? super Integer, Unit> lVar2;
        e23.a<Unit> aVar2;
        o0 o0VarE = mVar.E(-724434972);
        int i15 = (o0VarE.r(uVar) ? 4 : 2) | i14 | (o0VarE.r(m0Var) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            boolean zR = o0VarE.r(m0Var);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new m(m0Var, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new m(m0Var, 0);
                    o0VarE.K(objQ);
                }
            }
            uVar2 = uVar;
            i.c(uVar2, (e23.a) objQ, aVar, lVar, o0VarE, i15 & 8078);
            aVar2 = aVar;
            lVar2 = lVar;
        } else {
            uVar2 = uVar;
            lVar2 = lVar;
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(uVar2, m0Var, aVar2, lVar2, i14);
        }
    }

    public static final void d(String str, u4.d dVar, e23.r rVar, z3.e eVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1989299351);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.r(rVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            kb.a(null, z3.f.c(-646187475, new a3.e(rVar, 5, dVar, str), o0VarE), null, null, null, 0, 0L, 0L, null, z3.f.c(8686456, new k(eVar, 0), o0VarE), o0Var, 805306416, 509);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(str, dVar, rVar, eVar, i14, 4);
        }
    }
}
