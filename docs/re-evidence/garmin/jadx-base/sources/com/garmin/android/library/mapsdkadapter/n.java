package com.garmin.android.library.mapsdkadapter;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes11.dex */
public final class n {
    public static final float a(LatLng latLng, LatLng latLng2) {
        latLng.getClass();
        latLng2.getClass();
        Location location = new Location("");
        location.setLatitude(latLng.latitude);
        location.setLongitude(latLng.longitude);
        Location location2 = new Location("");
        location2.setLatitude(latLng2.latitude);
        location2.setLongitude(latLng2.longitude);
        return location.distanceTo(location2);
    }

    public static final float b(double d14) {
        return 16.0f - ((float) (Math.log(d14) / Math.log(2.0d)));
    }

    public static final f c(Location location) {
        location.getClass();
        return new f(location.getLatitude(), location.getLongitude(), i.b.WGS84);
    }
}
