package w32;

import b.u;
import b.w;
import c.p;
import c.q;
import gl1.y;
import lc.m0;
import lc.v0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(q71.e eVar, c42.b bVar, boolean z14, boolean z15, boolean z16, e23.a aVar, m mVar, int i14) {
        o0 o0Var;
        e23.a aVar2;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1049630969);
        int i15 = i14 | (o0VarE.k(eVar == null ? -1 : eVar.ordinal()) ? 4 : 2) | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.h(z16) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            p.f22335a.getClass();
            w wVarA = p.a(o0VarE);
            u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            m0 m0VarI = y.I(new v0[0], o0VarE);
            int i16 = i15 & 896;
            int i17 = i15 & 458752;
            boolean zR = (i16 == 256) | (i17 == 131072) | o0VarE.r(m0VarI) | o0VarE.r(onBackPressedDispatcher);
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (zR) {
                objQ = new vv0.g(z14, aVar, m0VarI, onBackPressedDispatcher);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new vv0.g(z14, aVar, m0VarI, onBackPressedDispatcher);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar4 = (e23.a) objQ;
            p1 p1VarQ = p0.q(Boolean.valueOf(z15), o0VarE);
            p1 p1VarQ2 = p0.q(Boolean.valueOf(z16), o0VarE);
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            g.h hVar = new g.h();
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new vd0.d(p1Var, 17);
                o0VarE.K(objQ4);
            }
            q qVarC = c.w.c(hVar, (e23.l) objQ4, o0VarE, 48);
            boolean zR2 = (i16 == 256) | (i17 == 131072) | o0VarE.r(m0VarI);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new c.e(z14, aVar, m0VarI);
                o0VarE.K(objQ5);
            }
            e23.a aVar5 = (e23.a) objQ5;
            Boolean bool = (Boolean) p1VarQ.getF182175a();
            bool.getClass();
            Boolean bool2 = (Boolean) p1Var.getF182175a();
            bool2.getClass();
            boolean zB = o0VarE.B(p1VarQ) | o0VarE.B(p1VarQ2) | o0VarE.B(aVar5);
            Object objQ6 = o0VarE.q();
            if (zB || objQ6 == c2565a) {
                aVar2 = aVar5;
                objQ6 = new a(aVar2, p1VarQ, p1Var, p1VarQ2, p1Var2, null);
                o0VarE.K(objQ6);
            } else {
                aVar2 = aVar5;
            }
            l0.f(bool, bool2, (e23.p) objQ6, o0VarE);
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, z3.f.c(1307180561, new e11.n(aVar2, z14, bVar, m0VarI, eVar, aVar4, qVarC, p1Var2, 22), o0VarE), o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.i(eVar, bVar, z14, z15, z16, aVar, i14);
        }
    }
}
