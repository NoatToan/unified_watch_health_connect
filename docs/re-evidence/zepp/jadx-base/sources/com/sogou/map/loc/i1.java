package com.sogou.map.loc;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* JADX INFO: loaded from: classes18.dex */
final class i1 implements LocationListener {
    private /* synthetic */ f1 a;

    public i1(f1 f1Var) {
        this.a = f1Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            try {
                this.a.g = true;
                if (this.a.h != null) {
                    this.a.h.a(f1.f(this.a, location));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        this.a.g = false;
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
