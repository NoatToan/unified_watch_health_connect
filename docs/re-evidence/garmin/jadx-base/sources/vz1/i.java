package vz1;

import a42.a0;
import gl1.y;
import i3.mc;
import l72.w;
import o53.b0;
import p3.o0;
import p3.p2;
import p3.x1;
import vd0.s0;

/* JADX INFO: loaded from: classes10.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    public static final void a(int i14, mc mcVar, b0 b0Var, String str, String str2, z3.e eVar, p3.m mVar, int i15) {
        int i16;
        mcVar.getClass();
        b0Var.getClass();
        o0 o0VarE = mVar.E(-398641193);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(mcVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(b0Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.B(str) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.B(str2) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarE.r(eVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            w wVar = w.f111301a;
            String strQ = y.Q(o0VarE, i14);
            int i17 = 5;
            z3.e eVarC = z3.f.c(412549912, new fn1.n(b0Var, mcVar, i17), o0VarE);
            boolean zR = o0VarE.r(b0Var) | ((i16 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new nw0.n(b0Var, mcVar, 19);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new nw0.n(b0Var, mcVar, 19);
                    o0VarE.K(objQ);
                }
            }
            wVar.f(strQ, null, null, eVarC, (e23.a) objQ, mcVar, true, null, z3.f.c(-882138706, new s0(str2, str, i17, eVar), o0VarE), o0VarE, 806882304 | ((i16 << 12) & 458752), 390);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(i14, mcVar, b0Var, str, str2, eVar, i15);
        }
    }
}
