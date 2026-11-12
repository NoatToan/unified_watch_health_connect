package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.autonavi.aps.amapapi.utils.b;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.d;
import com.autonavi.aps.amapapi.utils.e;
import com.autonavi.aps.amapapi.utils.f;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.j;
import com.autonavi.aps.amapapi.utils.k;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile AMapLocation f2536a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f2537b = "CoarseLocation";
    private static long q = 0;
    private static boolean r = false;
    private static boolean s = false;
    private static boolean t = false;
    private static boolean u = false;
    private com.autonavi.aps.amapapi.filters.a f;
    private Handler j;
    private Context k;
    private LocationManager n;
    private AMapLocationClientOption o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f2538c = 0;
    private boolean d = false;
    private int e = 0;
    private int g = 240;
    private int h = 80;
    private int i = 0;
    private long l = 0;
    private int m = 0;
    private Object p = new Object();
    private boolean v = true;
    private AMapLocationClientOption.GeoLanguage w = AMapLocationClientOption.GeoLanguage.DEFAULT;
    private LocationListener x = null;

    public g(Context context, Handler handler) {
        this.f = null;
        this.k = context;
        this.j = handler;
        try {
            this.n = (LocationManager) context.getSystemService("location");
        } catch (Throwable th) {
            c.a(th, f2537b, "<init>");
        }
        this.f = new com.autonavi.aps.amapapi.filters.a();
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        this.o = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.o = new AMapLocationClientOption();
        }
        new Object[]{"CoarseLocation | startLocation ", "option: " + this.o.toString()};
        e.a();
        if (!this.o.isOnceLocation()) {
            e();
        } else if (!c()) {
            d();
        } else {
            try {
                q = j.a(this.k, "pref", "lagt", q);
            } catch (Throwable unused) {
            }
            f();
        }
    }

    private boolean c() {
        boolean zBooleanValue = true;
        try {
            if (k.c() >= 28) {
                if (this.n == null) {
                    this.n = (LocationManager) this.k.getApplicationContext().getSystemService("location");
                }
                zBooleanValue = ((Boolean) com.autonavi.aps.amapapi.utils.g.a(this.n, "isLocationEnabled", new Object[0])).booleanValue();
            }
            if (k.c() < 24 || k.c() >= 28 || Settings.Secure.getInt(this.k.getContentResolver(), "location_mode", 0) != 0) {
                return zBooleanValue;
            }
            return false;
        } catch (Throwable unused) {
            new Object[]{"CoarseLocation | isLocationSwitchOpen error"};
            e.a();
            return zBooleanValue;
        }
    }

    private void d() {
        c(a(12, "定位服务没有开启，请在设置中打开定位服务开关#1206"));
    }

    private void e() {
        c(a(20, "模糊权限下不支持连续定位#2006"));
    }

    private static com.autonavi.aps.amapapi.model.a a(int i, String str) {
        com.autonavi.aps.amapapi.model.a aVar = new com.autonavi.aps.amapapi.model.a("");
        aVar.setErrorCode(i);
        aVar.setLocationDetail(str);
        return aVar;
    }

    public final void b(AMapLocationClientOption aMapLocationClientOption) {
        if (aMapLocationClientOption == null) {
            aMapLocationClientOption = new AMapLocationClientOption();
        }
        this.o = aMapLocationClientOption;
        new Object[]{"CoarseLocation | setLocationOption ", "option: " + this.o.toString()};
        e.a();
        this.j.removeMessages(100);
        if (this.w != this.o.getGeoLanguage()) {
            synchronized (this.p) {
                f2536a = null;
            }
        }
        this.w = this.o.getGeoLanguage();
    }

    public final void a() {
        new Object[]{"CoarseLocation | stopLocation "};
        e.a();
        LocationManager locationManager = this.n;
        if (locationManager == null) {
            return;
        }
        try {
            LocationListener locationListener = this.x;
            if (locationListener != null) {
                locationManager.removeUpdates(locationListener);
                ((a) this.x).a();
                this.x = null;
                e.a();
            }
        } catch (Throwable th) {
            new Object[]{"CoarseLocation | removeUpdates error " + th.getMessage()};
            e.a();
        }
        try {
            Handler handler = this.j;
            if (handler != null) {
                handler.removeMessages(100);
            }
        } catch (Throwable unused) {
        }
        this.i = 0;
        this.f2538c = 0L;
        this.l = 0L;
        this.e = 0;
        this.m = 0;
        this.f.a();
    }

    private void f() {
        if (this.n == null) {
            return;
        }
        try {
            this.v = true;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = this.k.getMainLooper();
            }
            this.f2538c = k.b();
            if (b(this.n)) {
                if (this.x == null) {
                    this.x = new a(this);
                }
                this.n.requestLocationUpdates("network", this.o.getInterval(), this.o.getDeviceModeDistanceFilter(), this.x, looperMyLooper);
            }
            if (a(this.n)) {
                try {
                    if (k.a() - q >= 259200000) {
                        if (k.c(this.k, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==")) {
                            this.n.sendExtraCommand(GeocodeSearch.GPS, "force_xtra_injection", null);
                            q = k.a();
                            SharedPreferences.Editor editorA = j.a(this.k, "pref");
                            j.a(editorA, "lagt", q);
                            j.a(editorA);
                            e.a();
                        } else {
                            c.a(new Exception("n_alec"), "OPENSDK_CL", "rlu_n_alec");
                        }
                    }
                } catch (Throwable th) {
                    new Object[]{"CoarseLocation | sendExtraCommand error: " + th.getMessage()};
                    e.a();
                }
                if (this.x == null) {
                    this.x = new a(this);
                }
                this.n.requestLocationUpdates(GeocodeSearch.GPS, this.o.getInterval(), this.o.getDeviceModeDistanceFilter(), this.x, looperMyLooper);
                e.a();
            }
            if (s || u) {
                a(100, "系统返回定位结果超时#2002", this.o.getHttpTimeOut());
            }
            if (s || u) {
                return;
            }
            e.a();
            a(100, "系统定位当前不可用#2003", 0L);
        } catch (SecurityException e) {
            new Object[]{"CoarseLocation | no location permission"};
            e.a();
            this.v = false;
            i.a((String) null, 2121);
            a(101, e.getMessage() + "#2004", 0L);
        } catch (Throwable th2) {
            new Object[]{"CoarseLocation | requestLocationUpdates error: " + th2.getMessage()};
            e.a();
            c.a(th2, "CoarseLocation", "requestLocationUpdates part2");
        }
    }

    private static boolean a(LocationManager locationManager) {
        try {
            if (r) {
                return s;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders != null && allProviders.size() > 0) {
                s = allProviders.contains(GeocodeSearch.GPS);
            } else {
                s = false;
            }
            r = true;
            return s;
        } catch (Throwable th) {
            new Object[]{"CoarseLocation | hasProvider error: " + th.getMessage()};
            e.a();
            return s;
        }
    }

    private static boolean b(LocationManager locationManager) {
        try {
            if (t) {
                return u;
            }
            boolean zIsProviderEnabled = locationManager.isProviderEnabled("network");
            u = zIsProviderEnabled;
            t = true;
            return zIsProviderEnabled;
        } catch (Throwable th) {
            new Object[]{"CoarseLocation | hasProvider error: " + th.getMessage()};
            e.a();
            return u;
        }
    }

    private void a(int i, String str, long j) {
        try {
            if (this.j != null) {
                Message messageObtain = Message.obtain();
                AMapLocation aMapLocation = new AMapLocation("");
                aMapLocation.setErrorCode(20);
                aMapLocation.setLocationDetail(str);
                aMapLocation.setLocationType(11);
                messageObtain.obj = aMapLocation;
                messageObtain.what = i;
                this.j.sendMessageDelayed(messageObtain, j);
            }
        } catch (Throwable unused) {
            e.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Location location) {
        Handler handler = this.j;
        if (handler != null) {
            handler.removeMessages(100);
        }
        if (location == null) {
            return;
        }
        try {
            AMapLocation aMapLocation = new AMapLocation(location);
            if (k.a(aMapLocation)) {
                if (GeocodeSearch.GPS.equals(location.getProvider())) {
                    aMapLocation.setProvider("gps_coarse");
                } else {
                    aMapLocation.setProvider("network_coarse");
                }
                aMapLocation.setLocationType(11);
                if (!this.d && k.a(aMapLocation)) {
                    i.b(this.k, k.b() - this.f2538c, c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                    this.d = true;
                }
                Boolean bool = Boolean.FALSE;
                try {
                    Boolean bool2 = (Boolean) com.autonavi.aps.amapapi.utils.g.a(location, "isFromMockProvider", new Object[0]);
                    try {
                        new Object[]{"CoarseLocation | isFromMock=".concat(String.valueOf(bool2))};
                        e.a();
                    } catch (Throwable unused) {
                    }
                    bool = bool2;
                } catch (Throwable unused2) {
                }
                if (bool.booleanValue()) {
                    aMapLocation.setMock(true);
                    aMapLocation.setTrustedLevel(4);
                    if (!this.o.isMockEnable()) {
                        int i = this.m;
                        if (i > 3) {
                            i.a((String) null, 2152);
                            aMapLocation.setErrorCode(15);
                            aMapLocation.setLocationDetail("CoarseLocation has been mocked!#2007");
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
                        this.m = i + 1;
                        return;
                    }
                } else {
                    this.m = 0;
                }
                int iB = b(location);
                this.i = iB;
                aMapLocation.setSatellites(iB);
                e(aMapLocation);
                g(aMapLocation);
                AMapLocation aMapLocationF = f(aMapLocation);
                a(aMapLocationF);
                b(aMapLocationF);
                synchronized (this.p) {
                    a(aMapLocationF, f2536a);
                }
                c(aMapLocationF);
            }
        } catch (Throwable th) {
            c.a(th, "CoarseLocation", "onLocationChanged");
        }
    }

    private static int b(Location location) {
        Bundle extras = location.getExtras();
        int i = extras != null ? extras.getInt("satellites") : 0;
        e.b();
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            e.a();
            this.i = 0;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i == 0) {
            try {
                e.a();
                this.i = 0;
            } catch (Throwable unused) {
            }
        }
    }

    static final class a implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f2539a;

        a(g gVar) {
            this.f2539a = gVar;
        }

        final void a() {
            this.f2539a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                g gVar = this.f2539a;
                if (gVar != null) {
                    gVar.a(location);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                g gVar = this.f2539a;
                if (gVar != null) {
                    gVar.g();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
            if (GeocodeSearch.GPS.equalsIgnoreCase(str)) {
                new Object[]{"CoarseLocation | onProviderEnabled  "};
                e.a();
            }
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
            try {
                g gVar = this.f2539a;
                if (gVar != null) {
                    gVar.a(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(AMapLocation aMapLocation) {
        if (k.a(aMapLocation)) {
            this.e++;
        }
    }

    private void b(AMapLocation aMapLocation) {
        if (k.a(aMapLocation) && this.j != null) {
            long jB = k.b();
            if (this.o.getInterval() <= 8000 || jB - this.l > this.o.getInterval() - 8000) {
                Bundle bundle = new Bundle();
                bundle.putDouble("lat", aMapLocation.getLatitude());
                bundle.putDouble("lon", aMapLocation.getLongitude());
                bundle.putFloat("radius", aMapLocation.getAccuracy());
                bundle.putLong("time", aMapLocation.getTime());
                Message messageObtain = Message.obtain();
                messageObtain.setData(bundle);
                messageObtain.what = 102;
                synchronized (this.p) {
                    if (f2536a == null || k.a(aMapLocation, f2536a) > this.h) {
                        this.j.sendMessage(messageObtain);
                    }
                }
            }
        }
    }

    private void c(AMapLocation aMapLocation) {
        if (this.o.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) && this.o.getDeviceModeDistanceFilter() > 0.0f) {
            d(aMapLocation);
        } else if (k.b() - this.l >= this.o.getInterval() - 200) {
            this.l = k.b();
            d(aMapLocation);
        }
    }

    private void d(AMapLocation aMapLocation) {
        if (this.j != null) {
            new Object[]{"CoarseLocation | callBackGpsResult"};
            e.a();
            Message messageObtain = Message.obtain();
            messageObtain.obj = aMapLocation;
            messageObtain.what = 101;
            this.j.sendMessage(messageObtain);
        }
    }

    private void e(AMapLocation aMapLocation) {
        try {
            if (c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()) && this.o.isOffset()) {
                DPoint dPointA = f.a(this.k, new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                aMapLocation.setLatitude(dPointA.getLatitude());
                aMapLocation.setLongitude(dPointA.getLongitude());
                aMapLocation.setOffset(this.o.isOffset());
                aMapLocation.setCoordType(AMapLocation.COORD_TYPE_GCJ02);
                return;
            }
            aMapLocation.setOffset(false);
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
        } catch (Throwable th) {
            aMapLocation.setOffset(false);
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
            new Object[]{"CoarseLocation | offset error: " + th.getMessage()};
            e.a();
        }
    }

    private AMapLocation f(AMapLocation aMapLocation) {
        if (!k.a(aMapLocation) || this.e < 3) {
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
                synchronized (this.p) {
                    try {
                        f2536a = aMapLocation;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                c.a(th2, "CoarseLocation", "setLastGeoLocation");
            }
        }
    }

    private void a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        if (aMapLocation2 == null || !this.o.isNeedAddress() || k.a(aMapLocation, aMapLocation2) >= this.g) {
            return;
        }
        c.a(aMapLocation, aMapLocation2);
    }

    public final int b() {
        LocationManager locationManager = this.n;
        if (locationManager == null || !a(locationManager)) {
            return 1;
        }
        int i = Settings.Secure.getInt(this.k.getContentResolver(), "location_mode", 0);
        if (i == 0) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        return !this.v ? 4 : 0;
    }

    private static void g(AMapLocation aMapLocation) {
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
