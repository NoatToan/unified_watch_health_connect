package com.xiaomi.hm.health.device;

import android.location.Location;
import com.xiaomi.hm.health.locweather.location.MyLocation;

/* JADX INFO: loaded from: classes20.dex */
public class GpsUtils {
    public static float distance(MyLocation myLocation, MyLocation myLocation2) {
        if (myLocation2 == null) {
            return Float.MAX_VALUE;
        }
        float[] fArr = new float[1];
        Location.distanceBetween(myLocation.getLatitude(), myLocation.getLongitude(), myLocation2.getLatitude(), myLocation2.getLongitude(), fArr);
        return fArr[0];
    }
}
