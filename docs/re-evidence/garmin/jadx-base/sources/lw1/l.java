package lw1;

import a11.a0;
import ak0.o;
import c2.c3;
import c2.j0;
import com.garmin.android.apps.connectmobile.R;
import ew1.f2;
import gl1.y;
import i3.d0;
import i3.fe;
import i3.hb;
import l72.c1;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class l {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(fe feVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        fe feVar2;
        feVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1660425634);
        int i15 = i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-601418689);
                c1 c1Var = c1.f110940a;
                String strQ = y.Q(o0VarE, R.string.lbl_exit_setup_question);
                String strQ2 = y.Q(o0VarE, R.string.lbl_exit_plan_setup_message);
                String strQ3 = y.Q(o0VarE, R.string.lbl_exit);
                String strQ4 = y.Q(o0VarE, R.string.lbl_cancel);
                boolean z14 = (i15 & 7168) == 2048;
                Object objQ2 = o0VarE.q();
                if (z14 || objQ2 == c2565a) {
                    objQ2 = new a0(aVar3, p1Var, 28);
                    o0VarE.K(objQ2);
                }
                e23.a<Unit> aVar4 = (e23.a) objQ2;
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new l51.c(p1Var, 28);
                    o0VarE.K(objQ3);
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar4, strQ4, (e23.a) objQ3, o0VarE, 0, 6, 217);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-600946652);
                o0VarE.g0(false);
            }
            z3.e eVarC = z3.f.c(1558257913, new f2(aVar3, p1Var, 2), o0VarE);
            feVar2 = feVar;
            z3.e eVarC2 = z3.f.c(-1442290536, new o(feVar2, 28), o0VarE);
            hb.f88319a.getClass();
            c3 c3VarA = hb.a(o0VarE);
            d0.f87812a.getClass();
            z02.d.a(false, eVarC, eVarC2, null, new j0(c3VarA, d0.a(o0VarE)), z3.f.c(-1854001291, new at1.f(aVar, aVar2, 29), o0VarE), o0VarE, 197040, 9);
        } else {
            feVar2 = feVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(feVar2, aVar, aVar2, aVar3, i14, 22);
        }
    }
}
