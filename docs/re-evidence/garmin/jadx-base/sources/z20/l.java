package z20;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz20/l;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(com.garmin.android.apps.connectmobile.courses.model.e eVar, List list, v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f201924c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f201924c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objJ = kVar.f201922a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f201924c;
        if (i15 == 0) {
            o13.r.b(objJ);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GeoPointDTO geoPointDTO = (GeoPointDTO) it.next();
                Double d14 = geoPointDTO.latitude;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = d14 != null ? d14.doubleValue() : 0.0d;
                Double d15 = geoPointDTO.longitude;
                if (d15 != null) {
                    dDoubleValue = d15.doubleValue();
                }
                arrayList.add(new LatLng(dDoubleValue2, dDoubleValue));
            }
            t20.b bVarB = t20.b.a.b(t20.b.f161764c, d30.b.c(arrayList, eVar));
            kVar.f201924c = 1;
            objJ = f0.J(bVarB, new t20.c(arrayList, bVarB, null), kVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return ((com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a).geoPoints;
        }
        return null;
    }
}
