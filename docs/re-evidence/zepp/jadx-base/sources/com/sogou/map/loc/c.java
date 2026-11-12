package com.sogou.map.loc;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* JADX INFO: loaded from: classes18.dex */
final class c implements LocationListener {
    private /* synthetic */ b a;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            try {
                this.a.f.removeUpdates(this.a.g);
                SGLocation sGLocation = new SGLocation((byte) 4);
                sGLocation.l = location.getAccuracy();
                sGLocation.h(location.getLongitude(), location.getLatitude(), this.a.h.i);
                sGLocation.o = (byte) 3;
                sGLocation.k = location.getAltitude();
                if (location.hasAltitude()) {
                    sGLocation.w = true;
                }
                sGLocation.m = location.getSpeed();
                sGLocation.n = location.getBearing();
                this.a.h.j = j0.q();
                this.a.a.c(sGLocation);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        r0.b("GPS关闭中,GPS定位失败");
        this.a.a.f(new SGLocation(2, "GPS_OFF"));
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
