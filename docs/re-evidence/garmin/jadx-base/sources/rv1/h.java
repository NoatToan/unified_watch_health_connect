package rv1;

import c.w;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import q42.v;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(qv1.b bVar, vt1.o oVar, e23.l<? super Long, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        int i16;
        bVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1452165421);
        int i17 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.k(oVar.ordinal()) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            g3 g3Var = (g3) s9.c.c(bVar.f147945l, o0VarE).getF182175a();
            if (g3Var == null) {
                o0VarE.C(1745854180);
                o0VarE.g0(false);
            } else {
                fw.p pVar = g3Var.f35300a;
                o0VarE.C(1745854181);
                fw.p pVar2 = fw.p.LOADING;
                boolean z14 = pVar != pVar2;
                int i18 = i17 & 896;
                boolean zR = o0VarE.r(g3Var) | (i18 == 256) | ((i17 & 57344) == 16384);
                Object objQ = o0VarE.q();
                p3.m.a aVar3 = p3.m.f135153a;
                if (zR) {
                    objQ = new v(g3Var, 18, lVar, aVar2);
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new v(g3Var, 18, lVar, aVar2);
                        o0VarE.K(objQ);
                    }
                }
                w.a(0, 0, (e23.a) objQ, o0VarE, z14);
                tu1.i.f166483a.getClass();
                int i19 = tu1.i.a.C3134a.f166488e[oVar.ordinal()];
                if (i19 == 1) {
                    i15 = 2131232219;
                } else if (i19 == 2) {
                    i15 = 2131231061;
                } else if (i19 != 3) {
                    i15 = (i19 == 4 || i19 == 5) ? 2131232839 : 0;
                } else {
                    i15 = 2131232856;
                }
                boolean z15 = pVar == pVar2;
                boolean z16 = pVar == fw.p.SUCCESS;
                int i24 = vt1.o.b.f180188a[oVar.ordinal()];
                if (i24 == 1) {
                    i16 = R.string.itp_plan_created_title;
                } else if (i24 == 2) {
                    i16 = R.string.get_ready_to_train_exclamation;
                } else if (i24 != 4) {
                    i16 = (i24 == 5 || i24 == 6) ? R.string.get_ready_for_your_workouts : -1;
                } else {
                    i16 = R.string.get_ready_to_run;
                }
                String strQ = y.Q(o0VarE, i16);
                boolean zR2 = o0VarE.r(g3Var) | (i18 == 256);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new rk0.f(11, lVar, g3Var);
                    o0VarE.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new rk0.f(11, lVar, g3Var);
                        o0VarE.K(objQ2);
                    }
                }
                ku1.g.d(i15, z15, z16, strQ, (e23.a) objQ2, aVar, aVar2, o0VarE, (i17 << 6) & 4128768);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ob0.e(bVar, oVar, (e23.l) lVar, (e23.a) aVar, (e23.a) aVar2, i14);
        }
    }
}
