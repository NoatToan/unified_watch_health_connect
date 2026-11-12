package com.xiaomi.ai.android.utils;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import com.xiaomi.ai.log.Logger;

/* JADX INFO: loaded from: classes18.dex */
public final class c {
    public static Location a(Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (locationManager != null) {
                Criteria criteria = new Criteria();
                criteria.setAccuracy(2);
                criteria.setAltitudeRequired(false);
                criteria.setBearingRequired(false);
                criteria.setCostAllowed(true);
                criteria.setPowerRequirement(1);
                String bestProvider = locationManager.getBestProvider(criteria, true);
                if (bestProvider == null) {
                    Logger.d("LocationUtils", "getLocation: getBestProvider failed");
                    return null;
                }
                Logger.c("LocationUtils", "best strLocationProvider " + bestProvider);
                Location lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
                if (lastKnownLocation == null) {
                    Logger.d("LocationUtils", "getLocation: location is null");
                }
                return lastKnownLocation;
            }
        } catch (Exception e) {
            Logger.d("LocationUtils", "getLocation:" + e.toString());
        }
        return null;
    }
}
