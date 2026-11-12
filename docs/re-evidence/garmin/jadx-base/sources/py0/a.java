package py0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.library.mapsdkadapter.i;
import com.garmin.android.library.mapsdkadapter.q;
import ie2.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final q a(Context context, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        List<GeoPointDTO> list;
        context.getClass();
        if (eVar == null || (list = eVar.geoPoints) == null) {
            return null;
        }
        q qVar = new q();
        int color = a7.b.getColor(context, R.color.gds_data_viz_violet_secondary);
        p pVar = qVar.f50328a;
        pVar.f93156d = color;
        pVar.f93155c = 8.0f;
        pVar.f93158f = -200.0f;
        pVar.f93161i = true;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            pVar.f93153a.add(e((GeoPointDTO) it.next(), eVar.h()));
        }
        return qVar;
    }

    public static final ArrayList b(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        ArrayList arrayList = new ArrayList();
        com.garmin.android.library.mapsdkadapter.p pVarD = d(eVar);
        if (pVarD != null) {
            arrayList.add(pVarD);
        }
        com.garmin.android.library.mapsdkadapter.p pVarC = c(eVar);
        if (pVarC != null) {
            arrayList.add(pVarC);
        }
        return arrayList;
    }

    public static final com.garmin.android.library.mapsdkadapter.p c(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        List<GeoPointDTO> list = eVar.geoPoints;
        GeoPointDTO geoPointDTO = (list == null || list.isEmpty()) ? null : (GeoPointDTO) com.airbnb.lottie.animation.keyframe.a.c(1, list);
        if (geoPointDTO == null) {
            return null;
        }
        com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
        pVar.b(2131232001);
        pVar.d(e(geoPointDTO, eVar.h()));
        pVar.f50327a.f50311c = -100.0f;
        pVar.a(0.5f, 0.9f);
        return pVar;
    }

    public static final com.garmin.android.library.mapsdkadapter.p d(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        GeoPointDTO geoPointDTOD = eVar.D();
        if (geoPointDTOD == null) {
            return null;
        }
        com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
        pVar.b(2131232000);
        pVar.d(e(geoPointDTOD, eVar.h()));
        pVar.f50327a.f50311c = -100.0f;
        pVar.a(0.5f, 0.9f);
        return pVar;
    }

    public static final com.garmin.android.library.mapsdkadapter.f e(GeoPointDTO geoPointDTO, i.b bVar) {
        geoPointDTO.getClass();
        bVar.getClass();
        Double d14 = geoPointDTO.latitude;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        Double d15 = geoPointDTO.longitude;
        return new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d, bVar);
    }
}
