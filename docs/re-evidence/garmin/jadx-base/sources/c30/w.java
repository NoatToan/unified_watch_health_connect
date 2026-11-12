package c30;

import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc30/w;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(com.garmin.android.apps.connectmobile.courses.model.e eVar, List list, v13.c cVar) {
        v vVar;
        List<GeoPointDTO> list2 = list;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f24043d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f24043d = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object objJ = vVar.f24041b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f24043d;
        if (i15 == 0) {
            o13.r.b(objJ);
            ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
            for (GeoPointDTO geoPointDTO : list2) {
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
            vVar.f24040a = list2;
            vVar.f24043d = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVarB, new t20.c(arrayList, bVarB, null), vVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = vVar.f24040a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            return null;
        }
        CourseSegmentDTO courseSegmentDTO = new CourseSegmentDTO((String) null, (String) null, (Double) null, (String) null, (String) null, (Double) null, (Integer) null, (List) null, (Integer) null, 511, (p005kotlin.jvm.internal.j) null);
        courseSegmentDTO.h(new Double(((com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a).q()));
        courseSegmentDTO.j(new Integer(list2.size()));
        return courseSegmentDTO;
    }
}
