package com.amap.api.fence;

import android.app.PendingIntent;
import android.content.Context;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.autonavi.aps.amapapi.utils.c;
import defpackage.p2s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GeoFenceClient {
    public static final int GEOFENCE_IN = 1;
    public static final int GEOFENCE_OUT = 2;
    public static final int GEOFENCE_STAYED = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f6362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    p2s f6363b;

    public GeoFenceClient(Context context) {
        this.f6362a = null;
        this.f6363b = null;
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            Context applicationContext = context.getApplicationContext();
            this.f6362a = applicationContext;
            this.f6363b = a(applicationContext);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "<init>");
        }
    }

    private static p2s a(Context context) {
        return new p2s(context);
    }

    public void addGeoFence(DPoint dPoint, float f, String str) {
        try {
            this.f6363b.o(dPoint, f, str);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence round");
        }
    }

    public PendingIntent createPendingIntent(String str) {
        try {
            return this.f6363b.d(str);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "creatPendingIntent");
            return null;
        }
    }

    public List<GeoFence> getAllGeoFence() {
        ArrayList arrayList = new ArrayList();
        try {
            return this.f6363b.C();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "getGeoFenceList");
            return arrayList;
        }
    }

    public boolean isPause() {
        try {
            return this.f6363b.a0();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "isPause");
            return true;
        }
    }

    public void pauseGeoFence() {
        try {
            this.f6363b.T();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "pauseGeoFence");
        }
    }

    public void removeGeoFence() {
        try {
            this.f6363b.g();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "removeGeoFence");
        }
    }

    public void resumeGeoFence() {
        try {
            this.f6363b.X();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "resumeGeoFence");
        }
    }

    public void setActivateAction(int i) {
        try {
            this.f6363b.h(i);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "setActivatesAction");
        }
    }

    public void setGeoFenceAble(String str, boolean z) {
        try {
            this.f6363b.t(str, z);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "setGeoFenceAble");
        }
    }

    public void setGeoFenceListener(GeoFenceListener geoFenceListener) {
        try {
            this.f6363b.l(geoFenceListener);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "setGeoFenceListener");
        }
    }

    public void setLocationClientOption(AMapLocationClientOption aMapLocationClientOption) {
        try {
            this.f6363b.n(aMapLocationClientOption);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "setGeoFenceListener");
        }
    }

    public void addGeoFence(List<DPoint> list, String str) {
        try {
            this.f6363b.u(list, str);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence polygon");
        }
    }

    public boolean removeGeoFence(GeoFence geoFence) {
        try {
            return this.f6363b.w(geoFence);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "removeGeoFence1");
            return false;
        }
    }

    public void addGeoFence(String str, String str2, DPoint dPoint, float f, int i, String str3) {
        try {
            this.f6363b.r(str, str2, dPoint, f, i, str3);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence searche");
        }
    }

    public void addGeoFence(String str, String str2, String str3, int i, String str4) {
        try {
            this.f6363b.s(str, str2, str3, i, str4);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence searche");
        }
    }

    public void addGeoFence(String str, String str2) {
        try {
            this.f6363b.q(str, str2);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence district");
        }
    }
}
