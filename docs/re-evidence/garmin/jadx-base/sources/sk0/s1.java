package sk0;

import c2.n3;
import c2.x2;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import l72.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class s1 {
    public static final void a(int i14, e23.a aVar, String str, p3.m mVar, u4.d dVar, boolean z14) {
        p3.o0 o0VarE = mVar.E(517981516);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            p2 p2Var = p2.f111205a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new r1(0);
                o0VarE.K(objQ);
            }
            p2Var.g(str, j2.b.b(p5.v.c((e23.l) objQ, rVarF, true), z14, false, null, aVar, 14), null, z3.f.c(1150420384, new b82.k(dVar, 15), o0VarE), z3.f.c(446557409, new rw0.g(z14, 5), o0VarE), false, z14, null, o0VarE, (i15 & 14) | 100690944 | ((i15 << 12) & 3670016), 164);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b02.a(str, dVar, z14, aVar, i14);
        }
    }

    public static final void b(GearActivity.w wVar, e23.l lVar, p3.m mVar, int i14) {
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-542716551);
        int i15 = (o0VarE.r(wVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new i0(9);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            z3.e eVarC = z3.f.c(-468478316, new s5.a(wVar, 15), o0VarE);
            g6.f.a aVar = g6.f.f75994b;
            z02.d.a(false, eVarC, null, null, n3.b(0, 0.0f, 0.0f, 0.0f, 14), z3.f.c(672065296, new bt1.k(p1Var, lVar, 12), o0VarE), o0VarE, 196662, 12);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rk0.a1(wVar, lVar, false, i14, 23);
        }
    }
}
