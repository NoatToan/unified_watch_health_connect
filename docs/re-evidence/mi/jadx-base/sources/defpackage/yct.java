package defpackage;

import android.location.Location;
import com.amap.api.maps.LocationSource;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;

/* JADX INFO: loaded from: classes4.dex */
public final class yct implements LocationSource.OnLocationChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IAMapDelegate f40058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Location f40059b;

    public yct(IAMapDelegate iAMapDelegate) {
        this.f40058a = iAMapDelegate;
    }

    @Override // com.amap.api.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(Location location) {
        this.f40059b = location;
        try {
            if (this.f40058a.isMyLocationEnabled()) {
                this.f40058a.showMyLocationOverlay(location);
            }
        } catch (Throwable th) {
            m2t.r(th, "AMapOnLocationChangedListener", "onLocationChanged");
            th.printStackTrace();
        }
    }
}
