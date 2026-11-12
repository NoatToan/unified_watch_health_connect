package d30;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.g;
import com.garmin.android.library.mapsdkadapter.f;
import com.garmin.android.library.mapsdkadapter.i;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o13.u;
import p13.h0;
import p13.y;
import s20.e;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final void a(g gVar, ArrayList arrayList) {
        Object next;
        double dDoubleValue;
        Double d14;
        gVar.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                GeoPointDTO geoPointDTO = (GeoPointDTO) next;
                Double d15 = geoPointDTO.latitude;
                dDoubleValue = d15 != null ? d15.doubleValue() : 0.0d;
                d14 = geoPointDTO.longitude;
            } while (!gVar.i(new LatLng(dDoubleValue, d14 != null ? d14.doubleValue() : 0.0d)));
            GeoPointDTO geoPointDTO2 = (GeoPointDTO) next;
            if (geoPointDTO2 != null) {
                int iIndexOf = arrayList.indexOf(list);
                ArrayList arrayList2 = new ArrayList(list);
                arrayList2.remove(list.indexOf(geoPointDTO2));
                arrayList.set(iIndexOf, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(g gVar, ArrayList arrayList, i.d dVar) {
        gVar.getClass();
        dVar.getClass();
        Iterator it = arrayList.iterator();
        int iIndexOf = -1;
        int i14 = -1;
        double d14 = -1.0d;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            List<GeoPointDTO> list = (List) it.next();
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            for (GeoPointDTO geoPointDTO : list) {
                Double d15 = geoPointDTO.latitude;
                double dDoubleValue = d15 != null ? d15.doubleValue() : 0.0d;
                Double d16 = geoPointDTO.longitude;
                arrayList2.add(new f(dDoubleValue, d16 != null ? d16.doubleValue() : 0.0d, dVar));
            }
            Double d17 = gVar.lat;
            double dDoubleValue2 = d17 != null ? d17.doubleValue() : 0.0d;
            Double d18 = gVar.lon;
            f fVar = new f(dDoubleValue2, d18 != null ? d18.doubleValue() : 0.0d, dVar);
            e.f156007a.getClass();
            u uVarA = e.a(arrayList2, fVar);
            double dDoubleValue3 = ((Number) uVarA.f128606b).doubleValue();
            int iIntValue = ((Number) uVarA.f128607c).intValue();
            if (d14 == -1.0d || dDoubleValue3 < d14) {
                iIndexOf = arrayList.indexOf(list);
                i14 = iIntValue;
                d14 = dDoubleValue3;
            }
        }
        if (d14 <= -1.0d || iIndexOf <= -1) {
            return;
        }
        ArrayList arrayListD1 = h0.d1((Collection) arrayList.get(iIndexOf));
        Double d19 = gVar.lat;
        double dDoubleValue4 = d19 != null ? d19.doubleValue() : 0.0d;
        Double d24 = gVar.lon;
        arrayListD1.add(i14, new GeoPointDTO(dDoubleValue4, d24 != null ? d24.doubleValue() : 0.0d));
        arrayList.set(iIndexOf, arrayListD1);
    }
}
