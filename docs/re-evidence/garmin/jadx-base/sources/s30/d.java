package s30;

import com.garmin.android.library.mapsdkadapter.i;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls30/d;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f156424a = new d();

    private d() {
    }

    public static float a(com.garmin.android.library.mapsdkadapter.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2) {
        LatLng latLng = fVar.f50283a;
        double radians = Math.toRadians(latLng.latitude);
        LatLng latLng2 = fVar2.f50283a;
        double radians2 = Math.toRadians(latLng2.latitude);
        double radians3 = Math.toRadians(latLng2.longitude - latLng.longitude);
        return (float) ((Math.toDegrees(Math.atan2(Math.cos(radians2) * Math.sin(radians3), (Math.sin(radians2) * Math.cos(radians)) - (Math.cos(radians3) * (Math.cos(radians2) * Math.sin(radians))))) + 360.0d) % 360.0d);
    }

    public static List b(List list) {
        list.getClass();
        i.b bVar = ((com.garmin.android.library.mapsdkadapter.f) h0.b0(list)).f50284b;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((com.garmin.android.library.mapsdkadapter.f) it.next()).f50284b != bVar) {
                    ArrayList arrayList = new ArrayList(y.r(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((com.garmin.android.library.mapsdkadapter.f) it3.next()).f());
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }
}
