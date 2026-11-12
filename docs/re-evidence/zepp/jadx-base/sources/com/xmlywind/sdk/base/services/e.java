package com.xmlywind.sdk.base.services;

import android.annotation.SuppressLint;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.xmlywind.logger.SigmobLog;

/* JADX INFO: loaded from: classes22.dex */
public class e implements j.a {
    private static LocationManager b;
    private k d = k.STOP;
    private static final LocationListener a = new LocationListener() { // from class: com.xmlywind.sdk.base.services.e.1
        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (com.xmlywind.sdk.common.a.n() == null) {
                return;
            }
            com.xmlywind.sdk.common.a.n().a(location);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };
    private static String c = "network";

    public e() {
        LocationManager locationManagerA;
        if (com.xmlywind.sdk.common.a.n() == null || (locationManagerA = a()) == null) {
            return;
        }
        Criteria criteria = new Criteria();
        criteria.setAccuracy(2);
        criteria.setAltitudeRequired(false);
        criteria.setBearingRequired(false);
        criteria.setCostAllowed(false);
        criteria.setPowerRequirement(1);
        c = locationManagerA.getBestProvider(criteria, false);
    }

    public static LocationManager a() {
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = com.xmlywind.sdk.common.a.n().am();
                }
            }
        }
        return b;
    }

    @SuppressLint({"MissingPermission"})
    private void d() {
        try {
            LocationManager locationManager = b;
            if (locationManager != null) {
                locationManager.removeUpdates(a);
            }
            b = null;
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    @SuppressLint({"MissingPermission"})
    private void e() {
        String str;
        try {
            LocationManager locationManagerA = a();
            if (locationManagerA == null || (str = c) == null || !locationManagerA.isProviderEnabled(str)) {
                return;
            }
            SigmobLog.d("private :use_location ");
            locationManagerA.requestLocationUpdates(c, 10000L, 10.0f, a);
            this.d = k.RUNNING;
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    @Override // com.xmlywind.sdk.base.services.j.a
    public boolean b() {
        if (this.d == k.RUNNING) {
            return false;
        }
        e();
        return true;
    }

    @Override // com.xmlywind.sdk.base.services.j.a
    public void c() {
        if (this.d == k.RUNNING) {
            d();
            this.d = k.STOP;
        }
    }
}
