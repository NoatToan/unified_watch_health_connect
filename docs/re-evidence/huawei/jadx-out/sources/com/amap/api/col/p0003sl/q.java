package com.amap.api.col.p0003sl;

import android.location.Location;
import com.amap.api.maps.LocationSource;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;

/* JADX INFO: loaded from: classes4.dex */
final class q implements LocationSource.OnLocationChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Location f3263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAMapDelegate f3264b;

    q(IAMapDelegate iAMapDelegate) {
        this.f3264b = iAMapDelegate;
    }

    @Override // com.amap.api.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(Location location) {
        this.f3263a = location;
        try {
            if (this.f3264b.isMyLocationEnabled()) {
                this.f3264b.showMyLocationOverlay(location);
            }
        } catch (Throwable th) {
            jv.c(th, "AMapOnLocationChangedListener", "onLocationChanged");
            th.printStackTrace();
        }
    }
}
