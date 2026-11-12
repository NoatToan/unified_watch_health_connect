package q2;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p3.c2;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.t1;
import p3.x1;
import p40.k0;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final void a(h4.r rVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(2064964257);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            b(rVar, eVar, o0VarE, ((i15 << 3) & 896) | (i15 & 14) | 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lh0.k(rVar, eVar, i14, 1);
        }
    }

    public static final void b(h4.r rVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(771959668);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(null) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                t1 t1Var = t1.f135313a;
                t1Var.getClass();
                c2 c2Var = new c2(null, t1Var);
                o0VarE.K(c2Var);
                objQ = c2Var;
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new k0(p1Var, 19);
                o0VarE.K(objQ2);
            }
            p3.v.a(s2.g.f156003b.c(c((e23.a) objQ2, o0VarE, 0)), z3.f.c(-291176396, new pp.g(rVar, 1, p1Var, eVar), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lh0.k(rVar, eVar, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    public static final d c(e23.a aVar, p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        View view2 = (View) mVar.A(AndroidCompositionLocals_androidKt.f6046f);
        boolean zB = mVar.B(view2);
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zB) {
            objQ = new d(view2, null, aVar);
            mVar.K(objQ);
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new d(view2, null, aVar);
                mVar.K(objQ);
            }
        }
        d dVar = (d) objQ;
        boolean zR = mVar.r(dVar);
        Object objQ2 = mVar.q();
        if (zR) {
            objQ2 = new a(dVar, 3);
            mVar.K(objQ2);
        } else {
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new a(dVar, 3);
                mVar.K(objQ2);
            }
        }
        l0.a(dVar, (e23.l) objQ2, mVar);
        return dVar;
    }
}
