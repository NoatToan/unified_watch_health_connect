package ep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p13.h0;
import p13.j0;
import p13.m0;
import p13.n0;
import p13.o0;
import ps.i1;
import ps.j1;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<b> a(i1 i1Var) {
        List<j1> listD;
        if (i1Var == null || (listD = i1Var.d()) == null) {
            return j0.f134944a;
        }
        n0 n0VarJ1 = h0.j1(listD);
        ArrayList arrayList = new ArrayList();
        Iterator it = n0VarJ1.iterator();
        while (true) {
            o0 o0Var = (o0) it;
            if (!o0Var.f134956a.hasNext()) {
                return arrayList;
            }
            m0 m0Var = (m0) o0Var.next();
            int i14 = m0Var.f134951a;
            j1 j1Var = (j1) m0Var.f134952b;
            Double power = j1Var.getPower();
            b bVar = null;
            if (power != null) {
                double dDoubleValue = power.doubleValue();
                String activityDate = j1Var.getActivityDate();
                if (activityDate != null) {
                    m92.h0.e.a aVar = new m92.h0.e.a(i14, (float) dDoubleValue);
                    DateTime dateTime = DateTime.parse(activityDate);
                    dateTime.getClass();
                    bVar = new b(aVar, dateTime, j1Var.getDuration(), j1Var.getActivityId(), j1Var.getActivityDate());
                }
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
    }
}
