package com.amap.api.fence;

import android.app.PendingIntent;
import android.content.Context;
import com.amap.api.col.p0003sl.a;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.autonavi.aps.amapapi.utils.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class GeoFenceClient {
    public static final int GEOFENCE_IN = 1;
    public static final int GEOFENCE_OUT = 2;
    public static final int GEOFENCE_STAYED = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f3330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f3331b;

    public GeoFenceClient(Context context) {
        this.f3330a = null;
        this.f3331b = null;
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            Context applicationContext = context.getApplicationContext();
            this.f3330a = applicationContext;
            this.f3331b = a(applicationContext);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "<init>");
        }
    }

    private static a a(Context context) {
        return new a(context);
    }

    public PendingIntent createPendingIntent(String str) {
        try {
            return this.f3331b.a(str);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "creatPendingIntent");
            return null;
        }
    }

    public void setActivateAction(int i) {
        try {
            this.f3331b.a(i);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "setActivatesAction");
        }
    }

    public void setGeoFenceListener(GeoFenceListener geoFenceListener) {
        try {
            this.f3331b.a(geoFenceListener);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "setGeoFenceListener");
        }
    }

    public void setLocationClientOption(AMapLocationClientOption aMapLocationClientOption) {
        try {
            this.f3331b.a(aMapLocationClientOption);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "setGeoFenceListener");
        }
    }

    public void addGeoFence(DPoint dPoint, float f, String str) {
        try {
            this.f3331b.a(dPoint, f, str);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence round");
        }
    }

    public void addGeoFence(List<DPoint> list, String str) {
        try {
            this.f3331b.a(list, str);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence polygon");
        }
    }

    public void addGeoFence(String str, String str2, DPoint dPoint, float f, int i, String str3) {
        try {
            this.f3331b.a(str, str2, dPoint, f, i, str3);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence searche");
        }
    }

    public void addGeoFence(String str, String str2, String str3, int i, String str4) {
        try {
            this.f3331b.a(str, str2, str3, i, str4);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence searche");
        }
    }

    public void addGeoFence(String str, String str2) {
        try {
            this.f3331b.a(str, str2);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence district");
        }
    }

    public void removeGeoFence() {
        try {
            this.f3331b.a();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "removeGeoFence");
        }
    }

    public boolean removeGeoFence(GeoFence geoFence) {
        try {
            return this.f3331b.a(geoFence);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "removeGeoFence1");
            return false;
        }
    }

    public List<GeoFence> getAllGeoFence() {
        ArrayList arrayList = new ArrayList();
        try {
            return this.f3331b.b();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "getGeoFenceList");
            return arrayList;
        }
    }

    public void setGeoFenceAble(String str, boolean z) {
        try {
            this.f3331b.a(str, z);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "setGeoFenceAble");
        }
    }

    public void pauseGeoFence() {
        try {
            this.f3331b.f();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "pauseGeoFence");
        }
    }

    public void resumeGeoFence() {
        try {
            this.f3331b.h();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "resumeGeoFence");
        }
    }

    public boolean isPause() {
        try {
            return this.f3331b.i();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "isPause");
            return true;
        }
    }
}
