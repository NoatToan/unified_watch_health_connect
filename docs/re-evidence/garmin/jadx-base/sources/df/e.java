package df;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import p13.d0;
import ue.h0;
import ve.t0;
import ve.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public static final void a(String str, t0 t0Var) {
        y0 y0VarB;
        WorkDatabase workDatabase = t0Var.f177606d;
        workDatabase.getClass();
        cf.u uVarJ = workDatabase.j();
        cf.b bVarE = workDatabase.e();
        ArrayList arrayListM = p13.x.m(str);
        while (!arrayListM.isEmpty()) {
            String str2 = (String) d0.F(arrayListM);
            h0.c cVarC = uVarJ.c(str2);
            if (cVarC != h0.c.SUCCEEDED && cVarC != h0.c.FAILED) {
                uVarJ.d(str2);
            }
            arrayListM.addAll(bVarE.a(str2));
        }
        ve.p pVar = t0Var.f177609g;
        pVar.getClass();
        synchronized (pVar.f177591k) {
            ue.u uVarA = ue.u.a();
            int i14 = ve.p.f177580l;
            uVarA.getClass();
            pVar.f177589i.add(str);
            y0VarB = pVar.b(str);
        }
        ve.p.d(str, y0VarB, 1);
        Iterator<ve.r> it = t0Var.f177608f.iterator();
        while (it.hasNext()) {
            it.next().c(str);
        }
    }
}
