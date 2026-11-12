package com.sogou.map.loc;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* JADX INFO: loaded from: classes18.dex */
final class h1 implements LocationListener {
    private /* synthetic */ f1 a;

    public h1(f1 f1Var) {
        this.a = f1Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            try {
                if ("gps".equals(location.getProvider())) {
                    this.a.d = new b1(location.getLongitude(), location.getLatitude(), (int) location.getAccuracy(), j0.b());
                } else if ("network".equals(location.getProvider())) {
                    this.a.e = new b1(location.getLongitude(), location.getLatitude(), (int) location.getAccuracy(), j0.b());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
