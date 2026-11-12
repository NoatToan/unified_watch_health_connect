package ew0;

import com.garmin.android.apps.connectmobile.R;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(m mVar, vc0.v vVar, gk1.b bVar, p3.m mVar2, int i14) {
        c12.e bVar2;
        mVar.getClass();
        o0 o0VarE = mVar2.E(488606469);
        int i15 = (o0VarE.r(mVar) ? 4 : 2) | i14 | (o0VarE.r(vVar) ? 32 : 16) | (o0VarE.r(bVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(mVar.f66248o, o0VarE);
            if (((q) p1VarC.getF182175a()).f66270c) {
                o0VarE.C(431460845);
                bVar2 = new c12.e.c(g22.n.a(gl1.y.Q(o0VarE, R.string.safety_features_wizard_setup_complete)), gl1.y.Q(o0VarE, R.string.msg_lifestyle_logging_setup_completed));
                o0VarE.g0(false);
            } else if (((q) p1VarC.getF182175a()).f66269b) {
                o0VarE.C(431769295);
                bVar2 = new c12.e.a(gl1.y.Q(o0VarE, R.string.lbl_setup_not_completed), gl1.y.Q(o0VarE, R.string.msg_lifestyle_logging_setup_not_completed));
                o0VarE.g0(false);
            } else {
                o0VarE.C(1399410044);
                bVar2 = new c12.e.b(gl1.y.Q(o0VarE, R.string.lbl_creating_your_lifestyle_logging_journal));
                o0VarE.g0(false);
            }
            boolean zR = o0VarE.r(mVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new a(mVar, 0);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(mVar, 0);
                    o0VarE.K(objQ);
                }
            }
            c12.d.i(bVar2, vVar, (e23.a) objQ, bVar, o0VarE, ((i15 << 3) & 896) | ((i15 << 6) & 57344));
            Boolean bool = Boolean.TRUE;
            boolean zR2 = o0VarE.r(mVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new b(mVar, null);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new b(mVar, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((e23.p) objQ2, bool, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.f0(mVar, vVar, bVar, i14, 7);
        }
    }
}
