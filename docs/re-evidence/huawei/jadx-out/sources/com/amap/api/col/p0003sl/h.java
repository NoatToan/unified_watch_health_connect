package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.GnssStatus;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.autonavi.aps.amapapi.utils.b;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.d;
import com.autonavi.aps.amapapi.utils.e;
import com.autonavi.aps.amapapi.utils.f;
import com.autonavi.aps.amapapi.utils.g;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.j;
import com.autonavi.aps.amapapi.utils.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class h {
    static AMapLocation j = null;
    static long k = 0;
    static Object l = new Object();
    static long q = 0;
    static boolean t = false;
    static boolean u = false;
    public static volatile AMapLocation y;
    private GnssStatus.Callback F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Handler f2609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LocationManager f2610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    AMapLocationClientOption f2611c;
    com.autonavi.aps.amapapi.filters.a f;
    private Context z;
    private long A = 0;
    long d = 0;
    boolean e = false;
    private int B = 0;
    int g = 240;
    int h = 80;
    AMapLocation i = null;
    long m = 0;
    float n = 0.0f;
    Object o = new Object();
    Object p = new Object();
    private int C = 0;
    private GpsStatus D = null;
    private GpsStatus.Listener E = null;
    AMapLocationClientOption.GeoLanguage r = AMapLocationClientOption.GeoLanguage.DEFAULT;
    boolean s = true;
    long v = 0;
    int w = 0;
    LocationListener x = null;
    private String G = null;
    private boolean H = false;
    private int I = 0;
    private boolean J = false;

    public h(Context context, Handler handler) {
        this.f = null;
        this.z = context;
        this.f2609a = handler;
        try {
            this.f2610b = (LocationManager) context.getSystemService("location");
        } catch (Throwable th) {
            c.a(th, "GpsLocation", "<init>");
        }
        this.f = new com.autonavi.aps.amapapi.filters.a();
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        this.f2611c = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.f2611c = new AMapLocationClientOption();
        }
        try {
            q = j.a(this.z, "pref", "lagt", q);
        } catch (Throwable unused) {
        }
        i();
    }

    public final void b(AMapLocationClientOption aMapLocationClientOption) {
        Handler handler;
        if (aMapLocationClientOption == null) {
            aMapLocationClientOption = new AMapLocationClientOption();
        }
        this.f2611c = aMapLocationClientOption;
        if (aMapLocationClientOption.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors && (handler = this.f2609a) != null) {
            handler.removeMessages(8);
        }
        if (this.r != this.f2611c.getGeoLanguage()) {
            synchronized (this.o) {
                y = null;
            }
        }
        this.r = this.f2611c.getGeoLanguage();
    }

    public final void a() {
        LocationManager locationManager = this.f2610b;
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
                this.f2610b.removeGpsStatusListener(listener);
            }
        } catch (Throwable unused2) {
        }
        try {
            GnssStatus.Callback callback = this.F;
            if (callback != null) {
                this.f2610b.unregisterGnssStatusCallback(callback);
            }
        } catch (Throwable unused3) {
        }
        try {
            Handler handler = this.f2609a;
            if (handler != null) {
                handler.removeMessages(8);
            }
        } catch (Throwable unused4) {
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
        this.G = null;
        this.J = false;
    }

    private void i() {
        if (this.f2610b == null) {
            return;
        }
        try {
            this.s = true;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = this.z.getMainLooper();
            }
            Looper looper = looperMyLooper;
            this.A = k.b();
            if (a(this.f2610b)) {
                try {
                    if (k.a() - q >= 259200000) {
                        if (k.c(this.z, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==")) {
                            this.f2610b.sendExtraCommand(GeocodeSearch.GPS, "force_xtra_injection", null);
                            q = k.a();
                            SharedPreferences.Editor editorA = j.a(this.z, "pref");
                            j.a(editorA, "lagt", q);
                            j.a(editorA);
                            e.a();
                        } else {
                            c.a(new Exception("n_alec"), "OPENSDK_GL", "rlu_n_alec");
                        }
                    }
                } catch (Throwable th) {
                    new Object[]{"GpsLocation | sendExtraCommand error: " + th.getMessage()};
                    e.a();
                }
                if (this.x == null) {
                    this.x = new a(this);
                }
                if (this.f2611c.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) && this.f2611c.getDeviceModeDistanceFilter() > 0.0f) {
                    this.f2610b.requestLocationUpdates(GeocodeSearch.GPS, this.f2611c.getInterval(), this.f2611c.getDeviceModeDistanceFilter(), this.x, looper);
                } else {
                    this.f2610b.requestLocationUpdates(GeocodeSearch.GPS, 900L, 0.0f, this.x, looper);
                }
                GnssStatus.Callback callback = new GnssStatus.Callback() { // from class: com.amap.api.col.3sl.h.1
                    @Override // android.location.GnssStatus.Callback
                    public final void onStarted() {
                        h.j();
                    }

                    @Override // android.location.GnssStatus.Callback
                    public final void onStopped() {
                        h.this.k();
                    }

                    @Override // android.location.GnssStatus.Callback
                    public final void onFirstFix(int i) {
                        h.l();
                    }

                    @Override // android.location.GnssStatus.Callback
                    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
                        h.this.a(gnssStatus);
                    }
                };
                this.F = callback;
                this.f2610b.registerGnssStatusCallback(callback);
                a(8, 14, "no enough satellites#1401", this.f2611c.getHttpTimeOut());
                return;
            }
            e.a();
            a(8, 14, "no gps provider#1402", 0L);
        } catch (SecurityException e) {
            new Object[]{"GpsLocation | no location permission"};
            e.a();
            this.s = false;
            i.a((String) null, 2121);
            a(2, 12, e.getMessage() + "#1201", 0L);
        } catch (Throwable th2) {
            new Object[]{"GpsLocation | requestLocationUpdates error: " + th2.getMessage()};
            e.a();
            c.a(th2, "GpsLocation", "requestLocationUpdates part2");
        }
    }

    /* JADX INFO: renamed from: com.amap.api.col.3sl.h$2, reason: invalid class name */
    final class AnonymousClass2 implements GpsStatus.Listener {
        AnonymousClass2() {
        }

        @Override // android.location.GpsStatus.Listener
        public final void onGpsStatusChanged(int i) {
            try {
                if (h.this.f2610b == null) {
                    return;
                }
                h hVar = h.this;
                hVar.D = hVar.f2610b.getGpsStatus(h.this.D);
                if (i == 1) {
                    h.j();
                    return;
                }
                if (i == 2) {
                    h.this.k();
                } else if (i == 3) {
                    h.l();
                } else {
                    if (i != 4) {
                        return;
                    }
                    h.this.m();
                }
            } catch (Throwable th) {
                new Object[]{"GpsLocation | onGpsStatusChanged error: " + th.getMessage()};
                e.a();
                c.a(th, "GpsLocation", "onGpsStatusChanged");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j() {
        new Object[]{"GpsLocation | status stopped "};
        e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        new Object[]{"GpsLocation | status stopped "};
        e.a();
        this.C = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l() {
        new Object[]{"GpsLocation | first fix "};
        e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Iterable<GpsSatellite> satellites;
        int i = 0;
        try {
            GpsStatus gpsStatus = this.D;
            if (gpsStatus != null && (satellites = gpsStatus.getSatellites()) != null) {
                Iterator<GpsSatellite> it = satellites.iterator();
                int maxSatellites = this.D.getMaxSatellites();
                while (it.hasNext() && i < maxSatellites) {
                    if (it.next().usedInFix()) {
                        i++;
                    }
                }
            }
        } catch (Throwable th) {
            c.a(th, "GpsLocation", "GPS_EVENT_SATELLITE_STATUS");
        }
        this.C = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(GnssStatus gnssStatus) {
        int i = 0;
        if (gnssStatus != null) {
            try {
                int satelliteCount = gnssStatus.getSatelliteCount();
                int i2 = 0;
                while (i < satelliteCount) {
                    try {
                        if (gnssStatus.usedInFix(i)) {
                            i2++;
                        }
                        i++;
                    } catch (Throwable th) {
                        th = th;
                        i = i2;
                        c.a(th, "GpsLocation_Gnss", "GPS_EVENT_SATELLITE_STATUS");
                        this.C = i;
                    }
                }
                i = i2;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        this.C = i;
    }

    private static boolean a(LocationManager locationManager) {
        try {
            if (t) {
                return u;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders != null && allProviders.size() > 0) {
                u = allProviders.contains(GeocodeSearch.GPS);
            } else {
                u = false;
            }
            t = true;
            return u;
        } catch (Throwable th) {
            new Object[]{"GpsLocation | hasProvider error: " + th.getMessage()};
            e.a();
            return u;
        }
    }

    private void a(int i, int i2, String str, long j2) {
        try {
            if (this.f2609a == null || this.f2611c.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
                return;
            }
            Message messageObtain = Message.obtain();
            AMapLocation aMapLocation = new AMapLocation("");
            aMapLocation.setProvider(GeocodeSearch.GPS);
            aMapLocation.setErrorCode(i2);
            aMapLocation.setLocationDetail(str);
            aMapLocation.setLocationType(1);
            messageObtain.obj = aMapLocation;
            messageObtain.what = i;
            this.f2609a.sendMessageDelayed(messageObtain, j2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Location location) {
        Handler handler = this.f2609a;
        if (handler != null) {
            handler.removeMessages(8);
        }
        if (location == null) {
            return;
        }
        try {
            AMapLocation aMapLocation = new AMapLocation(location);
            if (k.a(aMapLocation)) {
                aMapLocation.setProvider(GeocodeSearch.GPS);
                aMapLocation.setLocationType(1);
                if (!this.e && k.a(aMapLocation)) {
                    i.a(this.z, k.b() - this.A, c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                    this.e = true;
                }
                if (k.a(aMapLocation, this.C)) {
                    aMapLocation.setMock(true);
                    aMapLocation.setTrustedLevel(4);
                    if (!this.f2611c.isMockEnable()) {
                        int i = this.w;
                        if (i > 3) {
                            i.a((String) null, 2152);
                            aMapLocation.setErrorCode(15);
                            aMapLocation.setLocationDetail("GpsLocation has been mocked!#1501");
                            aMapLocation.setLatitude(0.0d);
                            aMapLocation.setLongitude(0.0d);
                            aMapLocation.setAltitude(0.0d);
                            aMapLocation.setSpeed(0.0f);
                            aMapLocation.setAccuracy(0.0f);
                            aMapLocation.setBearing(0.0f);
                            aMapLocation.setExtras(null);
                            c(aMapLocation);
                            return;
                        }
                        this.w = i + 1;
                        return;
                    }
                } else {
                    this.w = 0;
                }
                aMapLocation.setSatellites(this.C);
                e(aMapLocation);
                f(aMapLocation);
                h(aMapLocation);
                AMapLocation aMapLocationG = g(aMapLocation);
                a(aMapLocationG);
                b(aMapLocationG);
                synchronized (this.o) {
                    a(aMapLocationG, y);
                }
                try {
                    if (k.a(aMapLocationG)) {
                        if (this.i != null) {
                            this.m = location.getTime() - this.i.getTime();
                            this.n = k.a(this.i, aMapLocationG);
                        }
                        synchronized (this.p) {
                            this.i = aMapLocationG.m749clone();
                        }
                        this.G = null;
                        this.H = false;
                        this.I = 0;
                    }
                } catch (Throwable th) {
                    c.a(th, "GpsLocation", "onLocationChangedLast");
                }
                c(aMapLocationG);
            }
        } catch (Throwable th2) {
            c.a(th2, "GpsLocation", "onLocationChanged");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            if (GeocodeSearch.GPS.equalsIgnoreCase(str)) {
                this.d = 0L;
                this.C = 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i == 0) {
            try {
                this.d = 0L;
                this.C = 0;
            } catch (Throwable unused) {
            }
        }
    }

    static final class a implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private h f2614a;

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        a(h hVar) {
            this.f2614a = hVar;
        }

        final void a() {
            this.f2614a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                new StringBuilder("tid=").append(Thread.currentThread().getId());
                e.a();
                h hVar = this.f2614a;
                if (hVar != null) {
                    hVar.a(location);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                h hVar = this.f2614a;
                if (hVar != null) {
                    hVar.a(str);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
            try {
                h hVar = this.f2614a;
                if (hVar != null) {
                    hVar.a(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(AMapLocation aMapLocation) {
        if (k.a(aMapLocation)) {
            this.d = k.b();
            synchronized (l) {
                k = k.b();
                j = aMapLocation.m749clone();
            }
            this.B++;
        }
    }

    private void b(AMapLocation aMapLocation) {
        if (k.a(aMapLocation) && this.f2609a != null) {
            long jB = k.b();
            if (this.f2611c.getInterval() <= 8000 || jB - this.v > this.f2611c.getInterval() - 8000) {
                Bundle bundle = new Bundle();
                bundle.putDouble("lat", aMapLocation.getLatitude());
                bundle.putDouble("lon", aMapLocation.getLongitude());
                bundle.putFloat("radius", aMapLocation.getAccuracy());
                bundle.putLong("time", aMapLocation.getTime());
                Message messageObtain = Message.obtain();
                messageObtain.setData(bundle);
                messageObtain.what = 5;
                synchronized (this.o) {
                    if (y == null || k.a(aMapLocation, y) > this.h) {
                        this.f2609a.sendMessage(messageObtain);
                    }
                }
            }
        }
    }

    private void c(AMapLocation aMapLocation) {
        if (aMapLocation.getErrorCode() != 15 || AMapLocationClientOption.AMapLocationMode.Device_Sensors.equals(this.f2611c.getLocationMode())) {
            if (this.f2611c.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) && this.f2611c.getDeviceModeDistanceFilter() > 0.0f) {
                d(aMapLocation);
            } else if (k.b() - this.v >= this.f2611c.getInterval() - 200) {
                this.v = k.b();
                d(aMapLocation);
            }
        }
    }

    private void d(AMapLocation aMapLocation) {
        if (this.f2609a != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = aMapLocation;
            messageObtain.what = 2;
            this.f2609a.sendMessage(messageObtain);
        }
    }

    public final boolean b() {
        return k.b() - this.d <= 2800;
    }

    private void e(AMapLocation aMapLocation) {
        try {
            if (c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()) && this.f2611c.isOffset()) {
                DPoint dPointA = f.a(this.z, new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                aMapLocation.setLatitude(dPointA.getLatitude());
                aMapLocation.setLongitude(dPointA.getLongitude());
                aMapLocation.setOffset(this.f2611c.isOffset());
                aMapLocation.setCoordType(AMapLocation.COORD_TYPE_GCJ02);
                return;
            }
            aMapLocation.setOffset(false);
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
        } catch (Throwable unused) {
            aMapLocation.setOffset(false);
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
        }
    }

    private void f(AMapLocation aMapLocation) {
        try {
            int i = this.C;
            if (i >= 4) {
                aMapLocation.setGpsAccuracyStatus(1);
            } else if (i == 0) {
                aMapLocation.setGpsAccuracyStatus(-1);
            } else {
                aMapLocation.setGpsAccuracyStatus(0);
            }
        } catch (Throwable unused) {
        }
    }

    private AMapLocation g(AMapLocation aMapLocation) {
        if (!k.a(aMapLocation) || this.B < 3) {
            return aMapLocation;
        }
        if (aMapLocation.getAccuracy() < 0.0f || aMapLocation.getAccuracy() == Float.MAX_VALUE) {
            aMapLocation.setAccuracy(0.0f);
        }
        if (aMapLocation.getSpeed() < 0.0f || aMapLocation.getSpeed() == Float.MAX_VALUE) {
            aMapLocation.setSpeed(0.0f);
        }
        return this.f.a(aMapLocation);
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                this.g = bundle.getInt("I_MAX_GEO_DIS");
                this.h = bundle.getInt("I_MIN_GEO_DIS");
                AMapLocation aMapLocation = (AMapLocation) bundle.getParcelable("loc");
                if (TextUtils.isEmpty(aMapLocation.getAdCode())) {
                    return;
                }
                synchronized (this.o) {
                    try {
                        y = aMapLocation;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                c.a(th2, "GpsLocation", "setLastGeoLocation");
            }
        }
    }

    private void a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        if (aMapLocation2 == null || !this.f2611c.isNeedAddress() || k.a(aMapLocation, aMapLocation2) >= this.g) {
            return;
        }
        c.a(aMapLocation, aMapLocation2);
    }

    public final void c() {
        this.w = 0;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    public final AMapLocation a(AMapLocation aMapLocation, String str) {
        long j2;
        if (this.i != null && ((this.f2611c.isMockEnable() || !this.i.isMock()) && k.a(this.i))) {
            AMapLocation aMapLocationO = o();
            if (aMapLocationO != null && k.a(aMapLocationO)) {
                aMapLocationO.setTrustedLevel(2);
                return aMapLocationO;
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
            if (aMapLocation == null || !k.a(aMapLocation)) {
                j2 = 30000;
            } else if (aMapLocation.getAccuracy() < 200.0f) {
                int i = this.I + 1;
                this.I = i;
                if (this.G == null && i >= 2) {
                    this.H = true;
                }
                j2 = speed > 5.0f ? 10000L : C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
            } else {
                if (!TextUtils.isEmpty(this.G)) {
                    this.H = false;
                    this.I = 0;
                }
                if (speed > 5.0f) {
                    j2 = 20000;
                } else {
                    j2 = 30000;
                }
            }
            long jB = k.b() - this.d;
            if (jB <= 30000) {
                if (jB >= j2) {
                    if (this.H && b(str)) {
                        AMapLocation aMapLocationM749clone = this.i.m749clone();
                        aMapLocationM749clone.setTrustedLevel(3);
                        return aMapLocationM749clone;
                    }
                    this.G = null;
                    this.I = 0;
                    synchronized (this.p) {
                        this.i = null;
                    }
                    this.m = 0L;
                    this.n = 0.0f;
                    return aMapLocation;
                }
                if (this.G == null && this.I >= 2) {
                    this.G = str;
                }
                AMapLocation aMapLocationM749clone2 = this.i.m749clone();
                aMapLocationM749clone2.setTrustedLevel(2);
                return aMapLocationM749clone2;
            }
        }
        return aMapLocation;
    }

    private boolean b(String str) {
        try {
            ArrayList<String> arrayListB = k.b(str);
            ArrayList<String> arrayListB2 = k.b(this.G);
            if (arrayListB.size() < 8 || arrayListB2.size() < 8) {
                return false;
            }
            return k.a(this.G, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final int d() {
        LocationManager locationManager = this.f2610b;
        if (locationManager == null || !a(locationManager)) {
            return 1;
        }
        int i = Settings.Secure.getInt(this.z.getContentResolver(), "location_mode", 0);
        if (i == 0) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        return !this.s ? 4 : 0;
    }

    public final int e() {
        return this.C;
    }

    private static boolean n() {
        try {
            return ((Boolean) g.a(iy.c("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), iy.c("UaXNOYXZpU3RhcnRlZA=="), (Object[]) null, (Class<?>[]) null)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private AMapLocation o() {
        float f;
        float f2;
        try {
            if (k.a(this.i) && b.k() && n()) {
                JSONObject jSONObject = new JSONObject((String) g.a(iy.c("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), iy.c("UZ2V0TmF2aUxvY2F0aW9u"), (Object[]) null, (Class<?>[]) null));
                long jOptLong = jSONObject.optLong("time");
                if (!this.J) {
                    this.J = true;
                    i.a("useNaviLoc", "use NaviLoc");
                }
                if (k.a() - jOptLong <= 5500) {
                    double dOptDouble = jSONObject.optDouble("lat", 0.0d);
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
                    if (k.a(aMapLocation, this.i) <= 300.0f) {
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

    public final boolean f() {
        AMapLocationClientOption aMapLocationClientOption = this.f2611c;
        return (aMapLocationClientOption == null || aMapLocationClientOption.isOnceLocation() || k.b() - this.d <= 300000) ? false : true;
    }

    private static void h(AMapLocation aMapLocation) {
        if (k.a(aMapLocation) && b.s()) {
            long time = aMapLocation.getTime();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jA = d.a(time, jCurrentTimeMillis, b.t());
            if (jA != time) {
                aMapLocation.setTime(jA);
                i.a(time, jCurrentTimeMillis);
            }
        }
    }
}
