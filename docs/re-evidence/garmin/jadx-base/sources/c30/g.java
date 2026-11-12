package c30;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc30/g;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {
    public final a50.g a(a50.g gVar) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        w20.a aVar = gVar.f1393d;
        if (aVar != null && (eVar = aVar.f181476a) != null) {
            a50.a aVarE = gVar.e();
            ArrayList arrayList = aVarE != null ? new ArrayList(aVarE.f1241b) : new ArrayList();
            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
            a50.a aVarE2 = gVar.e();
            gl1.d.j(aVarE2 != null ? aVarE2.f1245f : false, eVar, new b30.b(eVar2, 2), new bp.h(this, arrayList, eVar2));
            a50.a aVarE3 = gVar.e();
            a50.a aVarA = aVarE3 != null ? a50.a.a(aVarE3, arrayList, eVar2.j(), false, 109) : null;
            if (aVarA != null) {
                return a50.g.a(gVar, false, null, false, w20.a.b(gVar.f1393d, eVar2, null, null, null, null, 62), false, p13.h0.D0(p13.h0.V(1, gVar.f1396g), aVarA), null, null, 0, false, false, false, false, null, null, 65463);
            }
        }
        return gVar;
    }
}
