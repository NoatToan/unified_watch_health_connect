package com.amap.api.mapcore.util;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.amap.api.maps.CoordinateConverter;
import com.autonavi.amap.mapcore.Inner_3dMap_location;
import com.huami.nfc.web.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class kj {
    public Context a;
    public LocationManager b;
    public Object g;
    public boolean h;
    public volatile long c = 0;
    public volatile boolean d = false;
    public boolean e = false;
    public volatile Inner_3dMap_location f = null;
    public boolean i = false;
    public LocationListener j = new LocationListener() { // from class: com.amap.api.mapcore.util.kj.1
        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            try {
                Inner_3dMap_location inner_3dMap_location = new Inner_3dMap_location(location);
                inner_3dMap_location.setProvider("gps");
                inner_3dMap_location.setLocationType(1);
                Bundle extras = location.getExtras();
                inner_3dMap_location.setSatellites(extras != null ? extras.getInt("satellites") : 0);
                inner_3dMap_location.setTime(kf.a(inner_3dMap_location.getTime(), System.currentTimeMillis()));
                kj.this.f = inner_3dMap_location;
                kj.this.c = ki.b();
                kj.this.d = true;
            } catch (Throwable th) {
                ke.a(th, "MAPGPSLocation", "onLocationChanged");
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                if ("gps".equals(str)) {
                    kj.this.d = false;
                }
            } catch (Throwable th) {
                ke.a(th, "MAPGPSLocation", "onProviderDisabled");
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };

    public kj(Context context) {
        this.g = null;
        this.h = false;
        if (context == null) {
            return;
        }
        this.a = context;
        try {
            this.h = true;
        } catch (Throwable unused) {
        }
        try {
            if (this.g == null && !this.i) {
                this.g = this.h ? CoordinateConverter.class.getConstructor(Context.class).newInstance(context) : Class.forName("com.amap.api.maps2d.CoordinateConverter").getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused2) {
        }
        if (this.b == null) {
            this.b = (LocationManager) this.a.getSystemService("location");
        }
    }

    public final void a() {
        LocationListener locationListener;
        this.e = false;
        this.d = false;
        this.c = 0L;
        this.f = null;
        LocationManager locationManager = this.b;
        if (locationManager == null || (locationListener = this.j) == null) {
            return;
        }
        locationManager.removeUpdates(locationListener);
    }

    public final Inner_3dMap_location b() {
        Object objA;
        Object objNewInstance;
        if (this.f == null) {
            return null;
        }
        Inner_3dMap_location inner_3dMap_locationM3292clone = this.f.m3292clone();
        if (inner_3dMap_locationM3292clone != null && inner_3dMap_locationM3292clone.getErrorCode() == 0) {
            try {
                if (this.g != null) {
                    if (ke.a(inner_3dMap_locationM3292clone.getLatitude(), inner_3dMap_locationM3292clone.getLongitude())) {
                        Object[] objArr = {"GPS"};
                        Class[] clsArr = {String.class};
                        if (this.h) {
                            objA = kg.a("com.amap.api.maps.CoordinateConverter$CoordType", "valueOf", objArr, (Class<?>[]) clsArr);
                            Class<?> cls = Class.forName("com.amap.api.maps.model.LatLng");
                            Class<?> cls2 = Double.TYPE;
                            objNewInstance = cls.getConstructor(cls2, cls2).newInstance(Double.valueOf(inner_3dMap_locationM3292clone.getLatitude()), Double.valueOf(inner_3dMap_locationM3292clone.getLongitude()));
                        } else {
                            objA = kg.a("com.amap.api.maps2d.CoordinateConverter$CoordType", "valueOf", objArr, (Class<?>[]) clsArr);
                            Class<?> cls3 = Class.forName("com.amap.api.maps2d.model.LatLng");
                            Class<?> cls4 = Double.TYPE;
                            objNewInstance = cls3.getConstructor(cls4, cls4).newInstance(Double.valueOf(inner_3dMap_locationM3292clone.getLatitude()), Double.valueOf(inner_3dMap_locationM3292clone.getLongitude()));
                        }
                        kg.a(this.g, "coord", objNewInstance);
                        kg.a(this.g, "from", objA);
                        Object objA2 = kg.a(this.g, "convert", new Object[0]);
                        double dDoubleValue = ((Double) objA2.getClass().getDeclaredField(Constant.KEY_LATITUDE).get(objA2)).doubleValue();
                        double dDoubleValue2 = ((Double) objA2.getClass().getDeclaredField(Constant.KEY_LONGITUDE).get(objA2)).doubleValue();
                        inner_3dMap_locationM3292clone.setLatitude(dDoubleValue);
                        inner_3dMap_locationM3292clone.setLongitude(dDoubleValue2);
                    }
                } else if (this.i && ke.a(inner_3dMap_locationM3292clone.getLatitude(), inner_3dMap_locationM3292clone.getLongitude())) {
                    double[] dArrA = jw.a(inner_3dMap_locationM3292clone.getLongitude(), inner_3dMap_locationM3292clone.getLatitude());
                    inner_3dMap_locationM3292clone.setLatitude(dArrA[1]);
                    inner_3dMap_locationM3292clone.setLongitude(dArrA[0]);
                }
            } catch (Throwable unused) {
            }
        }
        return inner_3dMap_locationM3292clone;
    }
}
