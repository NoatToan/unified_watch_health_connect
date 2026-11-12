package zm;

import am.x0;
import am.z0;
import c22.l3;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.math.MathKt;
import p13.j0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [p13.j0] */
    public static final void a(List list, ActivityDetailChartDTO activityDetailChartDTO, ps.p pVar, x0 x0Var) {
        String str;
        List<x1> listI;
        String str2;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p pVar2 = (p) it.next();
            if (x0Var == null || (str = x0Var.f4358a) == null) {
                str = x0.f4346x.f4358a;
            }
            ?? arrayList = 0;
            arrayList = 0;
            ArrayList arrayListI = activityDetailChartDTO != null ? o72.t.I(activityDetailChartDTO, "DIRECTTIMESTAMP") : null;
            if (arrayListI != null && !arrayListI.isEmpty()) {
                pVar2.v2(DateTime.now().withMillis(MathKt.d(((Number) arrayListI.get(0)).doubleValue())));
                pVar2.p1(str);
                if (sm.c.d(pVar2) || (x0Var != null && (str2 = x0Var.f4358a) != null && (z0.P(str2) || z0.b(x0.R0, str2)))) {
                    if ((pVar != null ? pVar.i() : null) != null) {
                        z0 z0Var = z0.f4390a;
                        if (!z0.b(x0.R0, str)) {
                            if (x0Var != null) {
                                cq.y.f55115a.getClass();
                                if (cq.y.a.c(x0Var) && pVar2.getB1() == 2) {
                                    if (pVar != null && (listI = pVar.i()) != null) {
                                        arrayList = new ArrayList();
                                        for (Object obj : listI) {
                                            if (cq.z.c((x1) obj)) {
                                                arrayList.add(obj);
                                            }
                                        }
                                    }
                                    if (arrayList == 0) {
                                        arrayList = j0.f134944a;
                                    }
                                    pVar2.f2(cq.z.b(arrayList, activityDetailChartDTO, pVar2.getF113514x1()));
                                }
                            }
                            if (z0.o(str)) {
                                pVar2.f2(cq.z.b(d(pVar), activityDetailChartDTO, pVar2.getF113514x1()));
                            } else {
                                pVar2.M2(sm.c.c(pVar, str, activityDetailChartDTO, pVar2.getF113514x1()));
                            }
                        } else if (pVar2.getB1() == 2) {
                            pVar2.M2(sm.c.c(pVar, str, activityDetailChartDTO, pVar2.getF113514x1()));
                            if (x0Var != null) {
                                cq.y.f55115a.getClass();
                                if (cq.y.a.c(x0Var)) {
                                    pVar2.f2(cq.z.b(d(pVar), activityDetailChartDTO, pVar2.getF113514x1()));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static final double b(List<ps.x0> list) {
        Double dValueOf;
        if (list == null) {
            return 0.0d;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (p005kotlin.jvm.internal.s.g(qs.x.RUN_ACTIVE.f147220a, ((ps.x0) obj).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            dValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            Double averageSpeed = ((ps.x0) it.next()).getAverageSpeed();
            dValueOf = zf.b.D(averageSpeed) ? averageSpeed : null;
            if (dValueOf != null) {
                arrayList2.add(dValueOf);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            double dDoubleValue = ((Number) it3.next()).doubleValue();
            l3.a aVar = l3.f23124b;
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            aVar.getClass();
            double dP = l3.a.p(dDoubleValue, zY);
            while (it3.hasNext()) {
                double dDoubleValue2 = ((Number) it3.next()).doubleValue();
                l3.a aVar2 = l3.f23124b;
                boolean zY2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                aVar2.getClass();
                dP = Math.min(dP, l3.a.p(dDoubleValue2, zY2));
            }
            dValueOf = Double.valueOf(dP);
        }
        if (dValueOf != null) {
            return dValueOf.doubleValue();
        }
        return 0.0d;
    }

    public static final double c(List<ps.x0> list) {
        list.getClass();
        return e(list) == b(list) ? e(list) * ((double) 2) : e(list) + ((double) 10);
    }

    public static final List<x1> d(ps.p pVar) {
        ArrayList arrayList;
        List<x1> listI;
        if (pVar == null || (listI = pVar.i()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : listI) {
                if (((x1) obj).a2() == qs.x.TRANSITION) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList == null ? j0.f134944a : arrayList;
    }

    public static final double e(List<ps.x0> list) {
        Double dValueOf;
        if (list == null) {
            return 0.0d;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (p005kotlin.jvm.internal.s.g(qs.x.RUN_ACTIVE.f147220a, ((ps.x0) obj).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            dValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            Double averageSpeed = ((ps.x0) it.next()).getAverageSpeed();
            dValueOf = zf.b.D(averageSpeed) ? averageSpeed : null;
            if (dValueOf != null) {
                arrayList2.add(dValueOf);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            double dDoubleValue = ((Number) it3.next()).doubleValue();
            l3.a aVar = l3.f23124b;
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            aVar.getClass();
            double dP = l3.a.p(dDoubleValue, zY);
            while (it3.hasNext()) {
                double dDoubleValue2 = ((Number) it3.next()).doubleValue();
                l3.a aVar2 = l3.f23124b;
                boolean zY2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                aVar2.getClass();
                dP = Math.max(dP, l3.a.p(dDoubleValue2, zY2));
            }
            dValueOf = Double.valueOf(dP);
        }
        if (dValueOf != null) {
            return dValueOf.doubleValue();
        }
        return 0.0d;
    }
}
