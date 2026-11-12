package dm;

import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldm/p;", "Ljw/k$a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements jw.k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f60402a;

    public p(o oVar) {
        this.f60402a = oVar;
    }

    @Override // jw.k.a
    public final void a(String str) {
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        o oVar = this.f60402a;
        ConcurrentHashMap concurrentHashMap = oVar.f50097g;
        ConcurrentHashMap concurrentHashMap2 = oVar.f50097g;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = ((aq.d) concurrentHashMap.get(eVar)).f11881c;
        if (str == null || cVar == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF = cVar.F();
        bVar.getClass();
        com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(dVarArrF, str);
        if (dVarArrF != null) {
            cVar.I(dVarArrF);
            ((aq.d) concurrentHashMap2.get(eVar)).f11881c = cVar;
            ExerciseSetsDTO exerciseSetsDTO = ((aq.d) concurrentHashMap2.get(eVar)).f11880b;
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = ((aq.d) concurrentHashMap2.get(eVar)).f11881c;
            if (exerciseSetsDTO != null && cVar2 != null) {
                com.garmin.android.apps.connectmobile.repcounting.model.e[] eVarArr = exerciseSetsDTO.f41089a;
                eVarArr.getClass();
                for (com.garmin.android.apps.connectmobile.repcounting.model.e eVar2 : eVarArr) {
                    String str2 = eVar2.f41115e;
                    String str3 = eVar2.f41116f;
                    Long lZ = eVar2.Z();
                    if (g22.n.d(str2) && g22.n.d(str3) && !p005kotlin.jvm.internal.s.g(str3, "UNKNOWN")) {
                        eVar2.f41117g = cVar2.G(str2, str3);
                        com.garmin.android.apps.connectmobile.repcounting.model.d dVarD = cVar2.D(str2, str3);
                        if (dVarD != null) {
                            if (dVarD.f41105d) {
                                eVar2.n0(-1L);
                            } else if (lZ == null || lZ.longValue() < 0) {
                                eVar2.n0(-2L);
                            }
                            eVar2.f41124n = dVarD.f41108g;
                            eVar2.f41125o = dVarD.f41109h;
                        }
                    } else if ((str2 == null || str2.length() == 0) && ((str3 == null || str3.length() == 0) && (lZ == null || lZ.longValue() < 0))) {
                        eVar2.n0(-2L);
                    }
                }
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = ((aq.d) concurrentHashMap2.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f11879a;
                if (hVar != null) {
                    hVar.f29462o = exerciseSetsDTO;
                }
            }
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar3 = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
            com.garmin.android.apps.connectmobile.activities.newmodel.f fVar = ((aq.d) concurrentHashMap2.get(eVar3)).f11882d;
            if (fVar != null) {
                jg.b.M(fVar, ((aq.d) concurrentHashMap2.get(eVar3)).f11881c);
            }
        }
    }
}
