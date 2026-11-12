package cq;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p13.j0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class z {
    public static final ArrayList a(List list, x1 x1Var) {
        list.getClass();
        x1Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            x1 x1Var2 = (x1) obj;
            if (qs.x.CLIMB_PRO_CYCLING_CLIMB_SECTION == (x1Var2 != null ? x1Var2.a2() : null) && p005kotlin.jvm.internal.s.g(x1Var2.getParentIndex(), x1Var.getMessageIndex())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList b(List list, ActivityDetailChartDTO activityDetailChartDTO, fz.c cVar) {
        list.getClass();
        activityDetailChartDTO.getClass();
        cVar.getClass();
        List listI = o72.t.I(activityDetailChartDTO, "directTimestamp");
        if (listI == null) {
            listI = j0.f134944a;
        }
        List listI2 = o72.t.I(activityDetailChartDTO, cVar == fz.c.TIME ? "sumDuration" : "SUMDISTANCE");
        if (listI2 == null) {
            listI2 = j0.f134944a;
        }
        if (listI2.isEmpty() || listI.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DateTime startDateTime = ((x1) it.next()).getStartDateTime();
            arrayList.add(Long.valueOf((long) ((Number) listI2.get(c22.u.e(startDateTime != null ? startDateTime.getMillis() : 0L, listI))).doubleValue()));
        }
        return arrayList;
    }

    public static final boolean c(x1 x1Var) {
        return qs.x.CLIMB_PRO_CYCLING_CLIMB == (x1Var != null ? x1Var.a2() : null);
    }
}
