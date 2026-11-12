package nw0;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ky0.y1;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g gVar, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14) {
        boolean z14;
        gVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(966653961);
        int i15 = (o0VarE.r(gVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(gVar.f128030e, o0VarE);
            p1 p1VarC2 = s9.c.c(gVar.f128032g, o0VarE);
            p1 p1VarC3 = s9.c.c(gVar.f128034i, o0VarE);
            ArrayList arrayListG = pv0.f.g(pv0.f.b((List) p1VarC2.getF182175a()));
            if (!arrayListG.isEmpty() && !arrayListG.isEmpty()) {
                Iterator it = arrayListG.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    } else {
                        if (((List) p1VarC3.getF182175a()).contains((pv0.w) it.next())) {
                            z14 = true;
                            break;
                        }
                    }
                }
            } else {
                z14 = false;
                break;
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            z02.d.a(((a) p1VarC.getF182175a()).f127982a, z3.f.c(79910926, new y1(gl1.y.Q(o0VarE, R.string.lbl_auto_log_behaviors), lVar, ((Boolean) p1Var.z()).booleanValue()), o0VarE), null, null, null, z3.f.c(-1622146542, new bt1.m(z14, gVar, p1Var.y(), p1VarC3, p1VarC, 22), o0VarE), o0VarE, 196656, 28);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(gVar, lVar, i14, 9);
        }
    }
}
