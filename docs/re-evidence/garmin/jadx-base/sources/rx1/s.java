package rx1;

import ds.g0;
import i3.e9;
import i3.mc;
import o53.b0;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final class s {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(p1 p1Var, mx1.a aVar, boolean z14, e23.l lVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        int i15;
        e23.l lVar2;
        o0 o0Var;
        p1Var.getClass();
        lVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-2014189092);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(p1Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(aVar == null ? -1 : aVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | ((i15 & 458752) == 131072);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new eu.b(b0Var, mcVarF, aVar3, 10);
                o0VarE.K(objQ2);
            }
            e23.a aVar4 = (e23.a) objQ2;
            dy1.d dVar = (dy1.d) p1Var.getF182175a();
            int i16 = ((dVar == null || !dVar.f61541b) ? 0 : 1) ^ 1;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new d4.h(5);
                o0VarE.K(objQ3);
            }
            h2.b bVarB = h2.o0.b(i16, (e23.a) objQ3, o0VarE, 384, 2);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.f(new g0(bVarB, 10));
                o0VarE.K(objQ4);
            }
            x3 x3Var = (x3) objQ4;
            Integer numValueOf = Integer.valueOf(((Number) x3Var.getF182175a()).intValue());
            boolean z15 = (i15 & 14) == 4;
            Object objQ5 = o0VarE.q();
            if (z15 || objQ5 == c2565a) {
                objQ5 = new p(p1Var, x3Var, null);
                o0VarE.K(objQ5);
            }
            l0.e((e23.p) objQ5, numValueOf, o0VarE);
            z3.e eVarC = z3.f.c(1642005906, new gw0.b(aVar, aVar4, p1Var, lVar2, z14, b0Var, bVarB, aVar2, x3Var), o0VarE);
            o0Var = o0VarE;
            l.b(mcVarF, aVar4, null, null, null, eVarC, o0Var, 196608);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(p1Var, aVar, z14, lVar, aVar2, aVar3, i14, 25);
        }
    }
}
