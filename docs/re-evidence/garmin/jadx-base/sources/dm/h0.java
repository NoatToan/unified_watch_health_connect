package dm;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm/h0;", "Liu1/k;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 implements iu1.k<com.garmin.android.apps.connectmobile.activities.newmodel.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f60350a;

    public h0(o oVar) {
        this.f60350a = oVar;
    }

    @Override // iu1.k
    public final void onSuccess(com.garmin.android.apps.connectmobile.activities.newmodel.f fVar) {
        com.garmin.android.apps.connectmobile.activities.newmodel.f fVar2 = fVar;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.c0> listF = fVar2.f();
        com.garmin.android.apps.connectmobile.activities.newmodel.f fVarB = com.garmin.android.apps.connectmobile.activities.newmodel.f.b(fVar2, listF != null ? p13.h0.N0(listF, new g0()) : null);
        List<com.garmin.android.apps.connectmobile.activities.newmodel.c0> listF2 = fVarB.f();
        if (listF2 == null) {
            listF2 = p13.j0.f134944a;
        }
        for (com.garmin.android.apps.connectmobile.activities.newmodel.c0 c0Var : listF2) {
            List<com.garmin.android.apps.connectmobile.repcounting.model.e> listF3 = c0Var.f();
            if (listF3 == null) {
                listF3 = p13.j0.f134944a;
            }
            ArrayList arrayList = new ArrayList();
            if (listF3.size() > 1) {
                com.garmin.android.apps.connectmobile.repcounting.model.e eVar = null;
                for (com.garmin.android.apps.connectmobile.repcounting.model.e eVar2 : listF3) {
                    if (eVar2.e0()) {
                        if (eVar != null && eVar.f0()) {
                            arrayList.add(eVar);
                        }
                        arrayList.add(eVar2);
                    } else if (eVar == null || !eVar.e0()) {
                        if (eVar != null && eVar.f0()) {
                            Double D = eVar.D();
                            double dDoubleValue = D != null ? D.doubleValue() : 0.0d;
                            Double D2 = eVar2.D();
                            eVar.g0(Double.valueOf(dDoubleValue + (D2 != null ? D2.doubleValue() : 0.0d)));
                        }
                    }
                    eVar = eVar2;
                }
                if (eVar != null && eVar.f0()) {
                    arrayList.add(eVar);
                }
                c0Var.i(arrayList);
            }
        }
        ((aq.d) this.f60350a.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f11882d = fVarB;
    }
}
