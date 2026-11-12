package com.amap.api.mapcore.util;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationListener;
import com.autonavi.amap.mapcore.Inner_3dMap_location;
import com.autonavi.amap.mapcore.Inner_3dMap_locationListener;

/* JADX INFO: loaded from: classes2.dex */
public final class jx implements AMapLocationListener {
    public Inner_3dMap_locationListener a = null;

    @Override // com.amap.api.location.AMapLocationListener
    public final void onLocationChanged(AMapLocation aMapLocation) {
        try {
            Inner_3dMap_location inner_3dMap_locationA = kk.a(aMapLocation);
            if (kt.a(inner_3dMap_locationA)) {
                kk.a = inner_3dMap_locationA;
            }
            Inner_3dMap_locationListener inner_3dMap_locationListener = this.a;
            if (inner_3dMap_locationListener != null) {
                inner_3dMap_locationListener.onLocationChanged(inner_3dMap_locationA);
            }
        } catch (Throwable th) {
            ke.a(th, "LocationListener", "onLocationChanged");
        }
    }
}
