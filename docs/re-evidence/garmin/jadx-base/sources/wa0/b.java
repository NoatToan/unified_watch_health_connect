package wa0;

import com.garmin.android.apps.connectmobile.R;
import da0.p;
import gl1.y;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import w51.j;
import w51.n0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final void a(e23.a<Unit> aVar, m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-1422289298);
        int i15 = 4;
        int i16 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            b(aVar, o0VarE, i16 & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n0(aVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    public static final void b(e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(776831021);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_plan_activation_in_progress);
            String strQ2 = y.Q(o0VarE, R.string.lbl_common_continue);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new j(aVar, 14);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new j(aVar, 14);
                    o0VarE.K(objQ);
                }
            }
            a.f183760a.getClass();
            o0Var = o0VarE;
            p.b(null, strQ, null, null, null, strQ2, (e23.a) objQ, false, null, null, false, null, null, false, false, null, null, null, null, null, null, a.f183761b, o0Var, 0, 0, 384, 4194205);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar, i14, 18);
        }
    }
}
