package dm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;
import ps.x0;
import ps.x1;
import ps.y1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm/m0;", "Liu1/k;", "Lps/y1;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 implements iu1.k<y1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f60396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f60397b;

    public m0(boolean z14, o oVar) {
        this.f60396a = z14;
        this.f60397b = oVar;
    }

    @Override // iu1.k
    public final void onSuccess(y1 y1Var) {
        x1 x1Var;
        Object next;
        String str;
        y1 y1Var2 = y1Var;
        List<x1> listD = y1Var2.d();
        ArrayList arrayList = null;
        List listN0 = listD != null ? p13.h0.N0(listD, new a61.c(new d50.b(10), 7)) : null;
        boolean z14 = this.f60396a;
        o oVar = this.f60397b;
        if (!z14) {
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
            aq.d dVar = (aq.d) oVar.f50097g.get(eVar);
            ps.p pVar = ((aq.d) oVar.f50097g.get(eVar)).f11891m;
            long activityId = y1Var2.getActivityId();
            if (listN0 != null) {
                ArrayList arrayList2 = new ArrayList(p13.y.r(listN0, 10));
                Iterator it = listN0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(ss.m.a((x1) it.next()));
                }
                arrayList = new ArrayList(arrayList2);
            }
            ps.p pVarB = ps.p.b(pVar, activityId, null, arrayList, listN0, 10);
            dVar.getClass();
            dVar.f11891m = pVarB;
            return;
        }
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar2 = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        ConcurrentHashMap concurrentHashMap = oVar.f50097g;
        ConcurrentHashMap concurrentHashMap2 = oVar.f50097g;
        aq.d dVar2 = (aq.d) concurrentHashMap.get(eVar2);
        ps.p pVarB2 = ps.p.b(((aq.d) concurrentHashMap2.get(eVar2)).f11891m, y1Var2.getActivityId(), null, null, listN0, 14);
        dVar2.getClass();
        dVar2.f11891m = pVarB2;
        List<x0> listG = ((aq.d) concurrentHashMap2.get(eVar2)).f11891m.g();
        ArrayList arrayList3 = listG != null ? new ArrayList(listG) : null;
        List<x0> listG2 = ((aq.d) concurrentHashMap2.get(eVar2)).f11891m.g();
        if (listG2 != null) {
            for (x0 x0Var : listG2) {
                if (x0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == null || ((str = x0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String()) != null && d53.w.J(str))) {
                    List<x1> listD2 = y1Var2.d();
                    if (listD2 != null) {
                        Iterator<T> it3 = listD2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            List<Integer> listP0 = ((x1) next).p0();
                            if (listP0 != null && listP0.contains(Integer.valueOf(x0Var.getLapIndex() - 1))) {
                                break;
                            }
                        }
                        x1Var = (x1) next;
                    } else {
                        x1Var = null;
                    }
                    if (x1Var != null && arrayList3 != null) {
                    }
                }
            }
        }
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar3 = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        aq.d dVar3 = (aq.d) concurrentHashMap2.get(eVar3);
        ps.p pVarB3 = ps.p.b(((aq.d) concurrentHashMap2.get(eVar3)).f11891m, 0L, null, arrayList3, null, 27);
        dVar3.getClass();
        dVar3.f11891m = pVarB3;
    }
}
