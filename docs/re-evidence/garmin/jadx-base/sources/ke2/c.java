package ke2;

import com.garmin.android.library.mapsdkadapter.f;
import com.garmin.android.library.mapsdkadapter.i;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public static final f a(b bVar) {
        bVar.getClass();
        return new f(bVar.f104551a, bVar.f104552b, bVar.f104553c);
    }

    public static b b(LatLng latLng) {
        i.b bVar = i.b.WGS84;
        latLng.getClass();
        bVar.getClass();
        return new b(latLng.latitude, latLng.longitude, bVar);
    }

    public static final LatLng c(b bVar) {
        bVar.getClass();
        return new LatLng(bVar.f104551a, bVar.f104552b);
    }
}
