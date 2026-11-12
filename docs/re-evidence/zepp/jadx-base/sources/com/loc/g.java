package com.loc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.huami.mifit.sportlib.gpx.data.GPXBasePoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class g {
    public static AMapLocation j = null;
    public static long k = 0;
    public static Object l = new Object();
    public static long q = 0;
    public static boolean t = false;
    public static boolean u = false;
    public Handler a;
    public LocationManager b;
    public AMapLocationClientOption c;
    public dq f;
    private Context z;
    private long A = 0;
    public long d = 0;
    public boolean e = false;
    private int B = 0;
    public int g = 240;
    public int h = 80;
    public AMapLocation i = null;
    public long m = 0;
    public float n = 0.0f;
    public Object o = new Object();
    public Object p = new Object();
    public AMapLocationClientOption.GeoLanguage r = AMapLocationClientOption.GeoLanguage.DEFAULT;
    public boolean s = true;
    public long v = 0;
    public int w = 0;
    public LocationListener x = null;
    private int C = 0;
    private GpsStatus D = null;
    private GpsStatus.Listener E = new GpsStatus.Listener() { // from class: com.loc.g.1
        @Override // android.location.GpsStatus.Listener
        public final void onGpsStatusChanged(int i) {
            Iterable<GpsSatellite> satellites;
            try {
                g gVar = g.this;
                LocationManager locationManager = gVar.b;
                if (locationManager == null) {
                    return;
                }
                gVar.D = locationManager.getGpsStatus(gVar.D);
                int i2 = 0;
                if (i == 2) {
                    g.this.C = 0;
                    return;
                }
                if (i != 4) {
                    return;
                }
                try {
                    if (g.this.D != null && (satellites = g.this.D.getSatellites()) != null) {
                        Iterator<GpsSatellite> it2 = satellites.iterator();
                        int maxSatellites = g.this.D.getMaxSatellites();
                        while (it2.hasNext() && i2 < maxSatellites) {
                            if (it2.next().usedInFix()) {
                                i2++;
                            }
                        }
                    }
                } catch (Throwable th) {
                    ei.a(th, "GpsLocation", "GPS_EVENT_SATELLITE_STATUS");
                }
                g.this.C = i2;
            } catch (Throwable th2) {
                ei.a(th2, "GpsLocation", "onGpsStatusChanged");
            }
        }
    };
    public AMapLocation y = null;
    private String F = null;
    private boolean G = false;
    private int H = 0;
    private boolean I = false;

    public static class a implements LocationListener {
        private g a;

        public a(g gVar) {
            this.a = gVar;
        }

        public final void a() {
            this.a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                g gVar = this.a;
                if (gVar != null) {
                    g.a(gVar, location);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                g gVar = this.a;
                if (gVar != null) {
                    g.a(gVar, str);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
            try {
                g gVar = this.a;
                if (gVar != null) {
                    g.a(gVar, i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public g(Context context, Handler handler) {
        this.f = null;
        this.z = context;
        this.a = handler;
        try {
            this.b = (LocationManager) context.getSystemService("location");
        } catch (Throwable th) {
            ei.a(th, "GpsLocation", "<init>");
        }
        this.f = new dq();
    }

    private void a(int i, int i2, String str, long j2) {
        try {
            if (this.a == null || this.c.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
                return;
            }
            Message messageObtain = Message.obtain();
            AMapLocation aMapLocation = new AMapLocation("");
            aMapLocation.setProvider("gps");
            aMapLocation.setErrorCode(i2);
            aMapLocation.setLocationDetail(str);
            aMapLocation.setLocationType(1);
            messageObtain.obj = aMapLocation;
            messageObtain.what = i;
            this.a.sendMessageDelayed(messageObtain, j2);
        } catch (Throwable unused) {
        }
    }

    private void a(AMapLocation aMapLocation) {
        if (aMapLocation.getErrorCode() != 15 || AMapLocationClientOption.AMapLocationMode.Device_Sensors.equals(this.c.getLocationMode())) {
            if (this.c.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) && this.c.getDeviceModeDistanceFilter() > 0.0f) {
                b(aMapLocation);
            } else if (eo.b() - this.v >= this.c.getInterval() - 200) {
                this.v = eo.b();
                b(aMapLocation);
            }
        }
    }

    public static /* synthetic */ void a(g gVar, int i) {
        if (i == 0) {
            try {
                gVar.d = 0L;
                gVar.C = 0;
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ void a(g gVar, Location location) {
        String str;
        Handler handler = gVar.a;
        if (handler != null) {
            handler.removeMessages(8);
        }
        if (location == null) {
            return;
        }
        try {
            AMapLocation aMapLocation = new AMapLocation(location);
            if (eo.a(aMapLocation)) {
                aMapLocation.setProvider("gps");
                aMapLocation.setLocationType(1);
                if (!gVar.e && eo.a(aMapLocation)) {
                    em.a(gVar.z, eo.b() - gVar.A, ei.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                    gVar.e = true;
                }
                if (eo.a(location, gVar.C)) {
                    aMapLocation.setMock(true);
                    aMapLocation.setTrustedLevel(4);
                    if (!gVar.c.isMockEnable()) {
                        int i = gVar.w;
                        if (i <= 3) {
                            gVar.w = i + 1;
                            return;
                        }
                        em.a((String) null, 2152);
                        aMapLocation.setErrorCode(15);
                        aMapLocation.setLocationDetail("GpsLocation has been mocked!#1501");
                        aMapLocation.setLatitude(0.0d);
                        aMapLocation.setLongitude(0.0d);
                        aMapLocation.setAltitude(0.0d);
                        aMapLocation.setSpeed(0.0f);
                        aMapLocation.setAccuracy(0.0f);
                        aMapLocation.setBearing(0.0f);
                        aMapLocation.setExtras(null);
                        gVar.a(aMapLocation);
                        return;
                    }
                } else {
                    gVar.w = 0;
                }
                aMapLocation.setSatellites(gVar.C);
                try {
                    if (ei.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()) && gVar.c.isOffset()) {
                        DPoint dPointA = ek.a(gVar.z, new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                        aMapLocation.setLatitude(dPointA.getLatitude());
                        aMapLocation.setLongitude(dPointA.getLongitude());
                        aMapLocation.setOffset(gVar.c.isOffset());
                        str = AMapLocation.COORD_TYPE_GCJ02;
                    } else {
                        aMapLocation.setOffset(false);
                        str = AMapLocation.COORD_TYPE_WGS84;
                    }
                    aMapLocation.setCoordType(str);
                } catch (Throwable unused) {
                    aMapLocation.setOffset(false);
                    aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
                }
                try {
                    int i2 = gVar.C;
                    if (i2 >= 4) {
                        aMapLocation.setGpsAccuracyStatus(1);
                    } else if (i2 == 0) {
                        aMapLocation.setGpsAccuracyStatus(-1);
                    } else {
                        aMapLocation.setGpsAccuracyStatus(0);
                    }
                } catch (Throwable unused2) {
                }
                if (eo.a(aMapLocation) && eh.z()) {
                    long time = aMapLocation.getTime();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jA = ej.a(time, jCurrentTimeMillis, eh.A());
                    if (jA != time) {
                        aMapLocation.setTime(jA);
                        em.a(time, jCurrentTimeMillis);
                    }
                }
                if (eo.a(aMapLocation) && gVar.B >= 3) {
                    if (aMapLocation.getAccuracy() < 0.0f || aMapLocation.getAccuracy() == Float.MAX_VALUE) {
                        aMapLocation.setAccuracy(0.0f);
                    }
                    if (aMapLocation.getSpeed() < 0.0f || aMapLocation.getSpeed() == Float.MAX_VALUE) {
                        aMapLocation.setSpeed(0.0f);
                    }
                    aMapLocation = gVar.f.a(aMapLocation);
                }
                if (eo.a(aMapLocation)) {
                    gVar.d = eo.b();
                    synchronized (l) {
                        k = eo.b();
                        j = aMapLocation.m3277clone();
                    }
                    gVar.B++;
                }
                if (eo.a(aMapLocation) && gVar.a != null && gVar.c.isNeedAddress()) {
                    long jB = eo.b();
                    if (gVar.c.getInterval() <= 8000 || jB - gVar.v > gVar.c.getInterval() - 8000) {
                        Bundle bundle = new Bundle();
                        bundle.putDouble(GPXBasePoint.XML.ATTR_LAT, aMapLocation.getLatitude());
                        bundle.putDouble(GPXBasePoint.XML.ATTR_LON, aMapLocation.getLongitude());
                        Message messageObtain = Message.obtain();
                        messageObtain.setData(bundle);
                        messageObtain.what = 5;
                        synchronized (gVar.o) {
                            AMapLocation aMapLocation2 = gVar.y;
                            if (aMapLocation2 == null || eo.a(aMapLocation, aMapLocation2) > gVar.h) {
                                Handler handler2 = gVar.a;
                                handler2.sendMessage(messageObtain);
                            }
                            ei.a(th, "GpsLocation", "onLocationChanged");
                        }
                    }
                }
                synchronized (gVar.o) {
                    AMapLocation aMapLocation3 = gVar.y;
                    if (aMapLocation3 != null && gVar.c.isNeedAddress() && eo.a(aMapLocation, aMapLocation3) < gVar.g) {
                        ei.a(aMapLocation, aMapLocation3);
                    }
                }
                try {
                    if (eo.a(aMapLocation)) {
                        if (gVar.i != null) {
                            gVar.m = location.getTime() - gVar.i.getTime();
                            gVar.n = eo.a(gVar.i, aMapLocation);
                        }
                        synchronized (gVar.p) {
                            gVar.i = aMapLocation.m3277clone();
                        }
                        gVar.F = null;
                        gVar.G = false;
                        gVar.H = 0;
                    }
                } catch (Throwable th) {
                    ei.a(th, "GpsLocation", "onLocationChangedLast");
                }
                gVar.a(aMapLocation);
            }
        } catch (Throwable th2) {
            ei.a(th2, "GpsLocation", "onLocationChanged");
        }
    }

    public static /* synthetic */ void a(g gVar, String str) {
        try {
            if ("gps".equalsIgnoreCase(str)) {
                gVar.d = 0L;
                gVar.C = 0;
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean a(LocationManager locationManager) {
        try {
            if (t) {
                return u;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders == null || allProviders.size() <= 0) {
                u = false;
            } else {
                u = allProviders.contains("gps");
            }
            t = true;
            return u;
        } catch (Throwable unused) {
            return u;
        }
    }

    private boolean a(String str) {
        try {
            ArrayList<String> arrayListD = eo.d(str);
            ArrayList<String> arrayListD2 = eo.d(this.F);
            if (arrayListD.size() < 8 || arrayListD2.size() < 8) {
                return false;
            }
            return eo.a(this.F, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    private void b(AMapLocation aMapLocation) {
        if (this.a != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = aMapLocation;
            messageObtain.what = 2;
            this.a.sendMessage(messageObtain);
        }
    }

    private static boolean e() {
        try {
            return ((Boolean) el.a(u.c("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), u.c("UaXNOYXZpU3RhcnRlZA=="), (Object[]) null, (Class<?>[]) null)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private AMapLocation f() {
        float f;
        float f2;
        try {
            if (eo.a(this.i) && eh.p() && e()) {
                JSONObject jSONObject = new JSONObject((String) el.a(u.c("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), u.c("UZ2V0TmF2aUxvY2F0aW9u"), (Object[]) null, (Class<?>[]) null));
                long jOptLong = jSONObject.optLong("time");
                if (!this.I) {
                    this.I = true;
                    em.a("useNaviLoc", "use NaviLoc");
                }
                if (eo.a() - jOptLong <= 5500) {
                    double dOptDouble = jSONObject.optDouble(GPXBasePoint.XML.ATTR_LAT, 0.0d);
                    double dOptDouble2 = jSONObject.optDouble("lng", 0.0d);
                    float f3 = 0.0f;
                    try {
                        f = Float.parseFloat(jSONObject.optString("accuracy", "0"));
                    } catch (NumberFormatException unused) {
                        f = 0.0f;
                    }
                    double dOptDouble3 = jSONObject.optDouble("altitude", 0.0d);
                    try {
                        f2 = Float.parseFloat(jSONObject.optString("bearing", "0"));
                    } catch (NumberFormatException unused2) {
                        f2 = 0.0f;
                    }
                    try {
                        f3 = (Float.parseFloat(jSONObject.optString("speed", "0")) * 10.0f) / 36.0f;
                    } catch (NumberFormatException unused3) {
                    }
                    AMapLocation aMapLocation = new AMapLocation("lbs");
                    aMapLocation.setLocationType(9);
                    aMapLocation.setLatitude(dOptDouble);
                    aMapLocation.setLongitude(dOptDouble2);
                    aMapLocation.setAccuracy(f);
                    aMapLocation.setAltitude(dOptDouble3);
                    aMapLocation.setBearing(f2);
                    aMapLocation.setSpeed(f3);
                    aMapLocation.setTime(jOptLong);
                    aMapLocation.setCoordType(AMapLocation.COORD_TYPE_GCJ02);
                    if (eo.a(aMapLocation, this.i) <= 300.0f) {
                        synchronized (this.p) {
                            this.i.setLongitude(dOptDouble2);
                            this.i.setLatitude(dOptDouble);
                            this.i.setAccuracy(f);
                            this.i.setBearing(f2);
                            this.i.setSpeed(f3);
                            this.i.setTime(jOptLong);
                            this.i.setCoordType(AMapLocation.COORD_TYPE_GCJ02);
                        }
                        return aMapLocation;
                    }
                }
            }
        } catch (Throwable unused4) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    public final AMapLocation a(AMapLocation aMapLocation, String str) {
        long j2;
        if (this.i == null) {
            return aMapLocation;
        }
        if ((!this.c.isMockEnable() && this.i.isMock()) || !eo.a(this.i)) {
            return aMapLocation;
        }
        AMapLocation aMapLocationF = f();
        if (aMapLocationF != null && eo.a(aMapLocationF)) {
            aMapLocationF.setTrustedLevel(2);
            return aMapLocationF;
        }
        float speed = this.i.getSpeed();
        if (speed == 0.0f) {
            long j3 = this.m;
            if (j3 > 0 && j3 < 8) {
                float f = this.n;
                if (f > 0.0f) {
                    speed = f / j3;
                }
            }
        }
        if (aMapLocation == null || !eo.a(aMapLocation)) {
            j2 = 30000;
        } else if (aMapLocation.getAccuracy() < 200.0f) {
            int i = this.H + 1;
            this.H = i;
            if (this.F == null && i >= 2) {
                this.G = true;
            }
            j2 = speed > 5.0f ? 10000L : 15000L;
        } else {
            if (!TextUtils.isEmpty(this.F)) {
                this.G = false;
                this.H = 0;
            }
            if (speed > 5.0f) {
                j2 = 20000;
            } else {
                j2 = 30000;
            }
        }
        long jB = eo.b() - this.d;
        if (jB > 30000) {
            return aMapLocation;
        }
        if (jB < j2) {
            if (this.F == null && this.H >= 2) {
                this.F = str;
            }
            AMapLocation aMapLocationM3277clone = this.i.m3277clone();
            aMapLocationM3277clone.setTrustedLevel(2);
            return aMapLocationM3277clone;
        }
        if (this.G && a(str)) {
            AMapLocation aMapLocationM3277clone2 = this.i.m3277clone();
            aMapLocationM3277clone2.setTrustedLevel(3);
            return aMapLocationM3277clone2;
        }
        this.F = null;
        this.H = 0;
        synchronized (this.p) {
            this.i = null;
        }
        this.m = 0L;
        this.n = 0.0f;
        return aMapLocation;
    }

    public final void a() {
        LocationManager locationManager = this.b;
        if (locationManager == null) {
            return;
        }
        try {
            LocationListener locationListener = this.x;
            if (locationListener != null) {
                locationManager.removeUpdates(locationListener);
                ((a) this.x).a();
                this.x = null;
            }
        } catch (Throwable unused) {
        }
        try {
            GpsStatus.Listener listener = this.E;
            if (listener != null) {
                this.b.removeGpsStatusListener(listener);
            }
        } catch (Throwable unused2) {
        }
        try {
            Handler handler = this.a;
            if (handler != null) {
                handler.removeMessages(8);
            }
        } catch (Throwable unused3) {
        }
        this.C = 0;
        this.A = 0L;
        this.v = 0L;
        this.d = 0L;
        this.B = 0;
        this.w = 0;
        this.f.a();
        this.i = null;
        this.m = 0L;
        this.n = 0.0f;
        this.F = null;
        this.I = false;
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        LocationManager locationManager;
        String str;
        long interval;
        float deviceModeDistanceFilter;
        LocationListener locationListener;
        this.c = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.c = new AMapLocationClientOption();
        }
        try {
            q = en.a(this.z, "pref", "lagt", q);
        } catch (Throwable unused) {
        }
        if (this.b == null) {
            return;
        }
        try {
            if (eo.b() - k <= 5000 && eo.a(j) && (this.c.isMockEnable() || !j.isMock())) {
                this.d = eo.b();
                a(j);
            }
            this.s = true;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = this.z.getMainLooper();
            }
            Looper looper = looperMyLooper;
            this.A = eo.b();
            if (!a(this.b)) {
                a(8, 14, "no gps provider#1402", 0L);
                return;
            }
            try {
                if (eo.a() - q >= 259200000) {
                    this.b.sendExtraCommand("gps", "force_xtra_injection", null);
                    q = eo.a();
                    SharedPreferences.Editor editorA = en.a(this.z, "pref");
                    en.a(editorA, "lagt", q);
                    en.a(editorA);
                }
            } catch (Throwable unused2) {
            }
            if (this.x == null) {
                this.x = new a(this);
            }
            if (!this.c.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) || this.c.getDeviceModeDistanceFilter() <= 0.0f) {
                locationManager = this.b;
                str = "gps";
                interval = 900;
                deviceModeDistanceFilter = 0.0f;
                locationListener = this.x;
            } else {
                locationManager = this.b;
                str = "gps";
                interval = this.c.getInterval();
                deviceModeDistanceFilter = this.c.getDeviceModeDistanceFilter();
                locationListener = this.x;
            }
            locationManager.requestLocationUpdates(str, interval, deviceModeDistanceFilter, locationListener, looper);
            this.b.addGpsStatusListener(this.E);
            a(8, 14, "no enough satellites#1401", this.c.getHttpTimeOut());
        } catch (SecurityException e) {
            this.s = false;
            em.a((String) null, 2121);
            a(2, 12, e.getMessage() + "#1201", 0L);
        } catch (Throwable th) {
            ei.a(th, "GpsLocation", "requestLocationUpdates part2");
        }
    }

    public final boolean b() {
        return eo.b() - this.d <= 2800;
    }

    @SuppressLint({"NewApi"})
    public final int c() {
        LocationManager locationManager = this.b;
        if (locationManager == null || !a(locationManager)) {
            return 1;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            int i = Settings.Secure.getInt(this.z.getContentResolver(), "location_mode", 0);
            if (i == 0) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
        } else if (!this.b.isProviderEnabled("gps")) {
            return 2;
        }
        return !this.s ? 4 : 0;
    }

    public final int d() {
        return this.C;
    }
}
