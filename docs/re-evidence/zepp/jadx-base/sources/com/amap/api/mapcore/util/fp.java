package com.amap.api.mapcore.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import com.amap.api.location.AMapLocationClient;
import com.autonavi.amap.mapcore.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore.Inner_3dMap_locationManagerBase;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption;

/* JADX INFO: loaded from: classes2.dex */
public final class fp {
    public Context a;
    public Inner_3dMap_locationManagerBase b;
    public Object c;
    public boolean d;
    public kk e;
    public gt f;

    public fp(Context context) {
        ServiceInfo serviceInfo = null;
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = null;
        this.f = null;
        try {
            this.f = kt.a();
        } catch (Throwable unused) {
        }
        this.e = new kk();
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            this.a = context.getApplicationContext();
            try {
                try {
                    serviceInfo = this.a.getPackageManager().getServiceInfo(new ComponentName(this.a, "com.amap.api.location.APSService"), 128);
                } catch (Throwable unused2) {
                }
                if (serviceInfo != null) {
                    this.d = true;
                }
            } catch (Throwable unused3) {
                this.d = false;
            }
            if (this.d) {
                this.c = new AMapLocationClient(this.a);
            } else {
                this.b = new km(this.a);
            }
        } catch (Throwable th) {
            ke.a(th, "AMapLocationClient", "AMapLocationClient 1");
        }
    }

    public final void a() {
        try {
            if (this.d) {
                ((AMapLocationClient) this.c).startLocation();
            } else {
                this.b.startLocation();
            }
        } catch (Throwable th) {
            ke.a(th, "AMapLocationClient", "startLocation");
        }
    }

    public final void a(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        try {
            if (this.d) {
                this.e.a(this.c, inner_3dMap_locationListener);
            } else {
                this.b.setLocationListener(inner_3dMap_locationListener);
            }
        } catch (Throwable th) {
            ke.a(th, "AMapLocationClient", "setLocationListener");
        }
    }

    public final void a(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        try {
            if (inner_3dMap_locationOption == null) {
                throw new IllegalArgumentException("LocationManagerOption参数不能为null");
            }
            if (this.d) {
                kk.a(this.c, inner_3dMap_locationOption);
            } else {
                this.b.setLocationOption(inner_3dMap_locationOption);
            }
        } catch (Throwable th) {
            ke.a(th, "AMapLocationClient", "setLocationOption");
        }
    }

    public final void b() {
        try {
            if (this.d) {
                ((AMapLocationClient) this.c).stopLocation();
            } else {
                this.b.stopLocation();
            }
        } catch (Throwable th) {
            ke.a(th, "AMapLocationClient", "stopLocation");
        }
    }

    public final void c() {
        try {
            if (this.d) {
                ((AMapLocationClient) this.c).onDestroy();
            } else {
                this.b.destroy();
            }
            if (this.e != null) {
                this.e = null;
            }
        } catch (Throwable th) {
            ke.a(th, "AMapLocationClient", "onDestroy");
        }
    }
}
