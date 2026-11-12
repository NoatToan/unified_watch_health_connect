package k40;

import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes8.dex */
public final class k {
    public static final LatLng a(PointOfInterestDTO pointOfInterestDTO) {
        return new LatLng(pointOfInterestDTO.getLatitude(), pointOfInterestDTO.getLongitude());
    }
}
