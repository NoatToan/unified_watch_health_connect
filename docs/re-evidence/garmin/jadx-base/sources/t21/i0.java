package t21;

import c2.n3;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 {
    public static final void a(u21.m mVar, fe feVar, e23.p pVar, e23.a aVar, e23.a aVar2, e23.a aVar3, p3.m mVar2, int i14) {
        mVar.getClass();
        feVar.getClass();
        p3.o0 o0VarE = mVar2.E(-529011449);
        int i15 = i14 | (o0VarE.r(mVar) ? 4 : 2) | (o0VarE.r(pVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(aVar3) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(223239714, new nw0.l(aVar2, aVar, 11), o0VarE);
            z3.e eVarC2 = z3.f.c(668777025, new p21.b(feVar, 13), o0VarE);
            c2.n0 n0Var = n3.f22788a;
            z02.d.a(false, eVarC, eVarC2, null, new c2.n0(0, 0, 0, 0), z3.f.c(2005388958, new l(2, mVar, pVar), o0VarE), o0VarE, 197040, 9);
            if (mVar.f168039b) {
                o0VarE.C(-1543024830);
                l72.c1 c1Var = l72.c1.f110940a;
                c22.x0.f23314a.getClass();
                c1Var.a(false, gl1.d.W(c22.x0.f23464ie), gl1.d.W(c22.x0.Ef), null, null, gl1.y.Q(o0VarE, R.string.lbl_ok), false, false, aVar3, null, aVar3, o0VarE, (i15 << 9) & 234881024, (i15 >> 15) & 14, 729);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1542693285);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(mVar, feVar, pVar, aVar, aVar2, aVar3, i14, 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    public static final void b(h4.r rVar, boolean z14, String str, e23.l lVar, p3.m mVar, int i14) {
        h4.r rVar2;
        p3.o0 o0VarE = mVar.E(1956839102);
        int i15 = i14 | 6 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            rVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            l72.p2 p2Var = l72.p2.f111205a;
            z3.e eVarC = z3.f.c(-1960918701, new rw0.g(z14, 6), o0VarE);
            boolean z15 = ((i15 & 7168) == 2048) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new ad0.e(lVar, z14, 16);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ad0.e(lVar, z14, 16);
                    o0VarE.K(objQ);
                }
            }
            p2Var.g(str, rVar2, null, null, eVarC, false, false, (e23.a) objQ, o0VarE, ((i15 >> 6) & 14) | 24624, 236);
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(rVar2, z14, str, lVar, i14, 9);
        }
    }
}
