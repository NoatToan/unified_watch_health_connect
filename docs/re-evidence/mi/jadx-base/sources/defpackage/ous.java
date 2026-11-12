package defpackage;

import android.annotation.SuppressLint;
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
import com.autonavi.aps.amapapi.utils.b;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.d;
import com.autonavi.aps.amapapi.utils.e;
import com.autonavi.aps.amapapi.utils.f;
import com.autonavi.aps.amapapi.utils.g;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.j;
import com.autonavi.aps.amapapi.utils.k;
import com.xiaomi.fitness.common.utils.FusionLocationRequest;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ous {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static String f29706r = "CoarseLocation";
    public static long s = 0;
    public static boolean t = false;
    public static boolean u = false;
    public static boolean v = false;
    public static boolean w = false;
    public static volatile AMapLocation x;
    public com.autonavi.aps.amapapi.filters.a d;
    public Handler h;
    public Context i;
    public LocationManager l;
    public AMapLocationClientOption m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f29707a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29708b = false;
    public int c = 0;
    public int e = 240;
    public int f = 80;
    public int g = 0;
    public long j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29709k = 0;
    public Object n = new Object();
    public boolean o = true;
    public AMapLocationClientOption.GeoLanguage p = AMapLocationClientOption.GeoLanguage.DEFAULT;
    public LocationListener q = null;

    public static class a implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ous f29710a;

        public a(ous ousVar) {
            this.f29710a = ousVar;
        }

        public final void a() {
            this.f29710a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                ous ousVar = this.f29710a;
                if (ousVar != null) {
                    ousVar.e(location);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                ous ousVar = this.f29710a;
                if (ousVar != null) {
                    ousVar.A();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
            if ("gps".equalsIgnoreCase(str)) {
                e.a();
            }
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
            try {
                ous ousVar = this.f29710a;
                if (ousVar != null) {
                    ousVar.c(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public ous(Context context, Handler handler) {
        this.d = null;
        this.i = context;
        this.h = handler;
        try {
            this.l = (LocationManager) context.getSystemService("location");
        } catch (Throwable th) {
            c.a(th, f29706r, "<init>");
        }
        this.d = new com.autonavi.aps.amapapi.filters.a();
    }

    public static void B(AMapLocation aMapLocation) {
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

    public static com.autonavi.aps.amapapi.model.a a(int i, String str) {
        com.autonavi.aps.amapapi.model.a aVar = new com.autonavi.aps.amapapi.model.a("");
        aVar.setErrorCode(i);
        aVar.setLocationDetail(str);
        return aVar;
    }

    public static boolean m(LocationManager locationManager) {
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
        } catch (Throwable th) {
            new StringBuilder("CoarseLocation | hasProvider error: ").append(th.getMessage());
            e.a();
            return u;
        }
    }

    public static int o(Location location) {
        Bundle extras = location.getExtras();
        int i = extras != null ? extras.getInt("satellites") : 0;
        e.b();
        return i;
    }

    public static boolean r(LocationManager locationManager) {
        try {
            if (v) {
                return w;
            }
            boolean zIsProviderEnabled = locationManager.isProviderEnabled("network");
            w = zIsProviderEnabled;
            v = true;
            return zIsProviderEnabled;
        } catch (Throwable th) {
            new StringBuilder("CoarseLocation | hasProvider error: ").append(th.getMessage());
            e.a();
            return w;
        }
    }

    public final void A() {
        try {
            e.a();
            this.g = 0;
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        e.a();
        LocationManager locationManager = this.l;
        if (locationManager == null) {
            return;
        }
        try {
            LocationListener locationListener = this.q;
            if (locationListener != null) {
                locationManager.removeUpdates(locationListener);
                ((a) this.q).a();
                this.q = null;
                e.a();
            }
        } catch (Throwable th) {
            new StringBuilder("CoarseLocation | removeUpdates error ").append(th.getMessage());
            e.a();
        }
        try {
            Handler handler = this.h;
            if (handler != null) {
                handler.removeMessages(100);
            }
        } catch (Throwable unused) {
        }
        this.g = 0;
        this.f29707a = 0L;
        this.j = 0L;
        this.c = 0;
        this.f29709k = 0;
        this.d.a();
    }

    public final void c(int i) {
        if (i == 0) {
            try {
                e.a();
                this.g = 0;
            } catch (Throwable unused) {
            }
        }
    }

    public final void d(int i, String str, long j) {
        try {
            if (this.h != null) {
                Message messageObtain = Message.obtain();
                AMapLocation aMapLocation = new AMapLocation("");
                aMapLocation.setErrorCode(20);
                aMapLocation.setLocationDetail(str);
                aMapLocation.setLocationType(11);
                messageObtain.obj = aMapLocation;
                messageObtain.what = i;
                this.h.sendMessageDelayed(messageObtain, j);
            }
        } catch (Throwable unused) {
            e.b();
        }
    }

    public final void e(Location location) {
        Boolean bool;
        Handler handler = this.h;
        if (handler != null) {
            handler.removeMessages(100);
        }
        if (location == null) {
            return;
        }
        try {
            AMapLocation aMapLocation = new AMapLocation(location);
            if (k.a(aMapLocation)) {
                if ("gps".equals(location.getProvider())) {
                    aMapLocation.setProvider("gps_coarse");
                } else {
                    aMapLocation.setProvider("network_coarse");
                }
                aMapLocation.setLocationType(11);
                if (!this.f29708b && k.a(aMapLocation)) {
                    i.b(this.i, k.b() - this.f29707a, c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                    this.f29708b = true;
                }
                Boolean bool2 = Boolean.FALSE;
                try {
                    bool = (Boolean) g.a(location, "isFromMockProvider", new Object[0]);
                    try {
                        "CoarseLocation | isFromMock=".concat(String.valueOf(bool));
                        e.a();
                    } catch (Throwable unused) {
                        bool2 = bool;
                        bool = bool2;
                    }
                } catch (Throwable unused2) {
                }
                if (bool.booleanValue()) {
                    aMapLocation.setMock(true);
                    aMapLocation.setTrustedLevel(4);
                    if (!this.m.isMockEnable()) {
                        int i = this.f29709k;
                        if (i <= 3) {
                            this.f29709k = i + 1;
                            return;
                        }
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
                        s(aMapLocation);
                        return;
                    }
                } else {
                    this.f29709k = 0;
                }
                int iO = o(location);
                this.g = iO;
                aMapLocation.setSatellites(iO);
                x(aMapLocation);
                B(aMapLocation);
                AMapLocation aMapLocationY = y(aMapLocation);
                g(aMapLocationY);
                p(aMapLocationY);
                synchronized (this.n) {
                    h(aMapLocationY, x);
                }
                s(aMapLocationY);
            }
        } catch (Throwable th) {
            c.a(th, "CoarseLocation", "onLocationChanged");
        }
    }

    public final void f(Bundle bundle) {
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                this.e = bundle.getInt("I_MAX_GEO_DIS");
                this.f = bundle.getInt("I_MIN_GEO_DIS");
                AMapLocation aMapLocation = (AMapLocation) bundle.getParcelable("loc");
                if (TextUtils.isEmpty(aMapLocation.getAdCode())) {
                    return;
                }
                synchronized (this.n) {
                    try {
                        x = aMapLocation;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                c.a(th2, "CoarseLocation", "setLastGeoLocation");
            }
        }
    }

    public final void g(AMapLocation aMapLocation) {
        if (k.a(aMapLocation)) {
            this.c++;
        }
    }

    public final void h(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        if (aMapLocation2 == null || !this.m.isNeedAddress() || k.a(aMapLocation, aMapLocation2) >= this.e) {
            return;
        }
        c.a(aMapLocation, aMapLocation2);
    }

    public final void i(AMapLocationClientOption aMapLocationClientOption) {
        this.m = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.m = new AMapLocationClientOption();
        }
        new StringBuilder("option: ").append(this.m.toString());
        e.a();
        if (!this.m.isOnceLocation()) {
            w();
        } else if (!t()) {
            u();
        } else {
            try {
                s = j.a(this.i, "pref", "lagt", s);
            } catch (Throwable unused) {
            }
            z();
        }
    }

    @SuppressLint({"NewApi"})
    public final int n() {
        LocationManager locationManager = this.l;
        if (locationManager == null || !m(locationManager)) {
            return 1;
        }
        int i = Settings.Secure.getInt(this.i.getContentResolver(), "location_mode", 0);
        if (i == 0) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        return !this.o ? 4 : 0;
    }

    public final void p(AMapLocation aMapLocation) {
        if (k.a(aMapLocation) && this.h != null) {
            long jB = k.b();
            if (this.m.getInterval() <= FusionLocationRequest.timeout || jB - this.j > this.m.getInterval() - FusionLocationRequest.timeout) {
                Bundle bundle = new Bundle();
                bundle.putDouble("lat", aMapLocation.getLatitude());
                bundle.putDouble("lon", aMapLocation.getLongitude());
                bundle.putFloat("radius", aMapLocation.getAccuracy());
                bundle.putLong("time", aMapLocation.getTime());
                Message messageObtain = Message.obtain();
                messageObtain.setData(bundle);
                messageObtain.what = 102;
                synchronized (this.n) {
                    try {
                        if (x == null || k.a(aMapLocation, x) > this.f) {
                            this.h.sendMessage(messageObtain);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void q(AMapLocationClientOption aMapLocationClientOption) {
        if (aMapLocationClientOption == null) {
            aMapLocationClientOption = new AMapLocationClientOption();
        }
        this.m = aMapLocationClientOption;
        new StringBuilder("option: ").append(this.m.toString());
        e.a();
        this.h.removeMessages(100);
        if (this.p != this.m.getGeoLanguage()) {
            synchronized (this.n) {
                x = null;
            }
        }
        this.p = this.m.getGeoLanguage();
    }

    public final void s(AMapLocation aMapLocation) {
        if (this.m.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) && this.m.getDeviceModeDistanceFilter() > 0.0f) {
            v(aMapLocation);
        } else if (k.b() - this.j >= this.m.getInterval() - 200) {
            this.j = k.b();
            v(aMapLocation);
        }
    }

    public final boolean t() {
        boolean zBooleanValue = true;
        try {
            if (k.c() >= 28) {
                if (this.l == null) {
                    this.l = (LocationManager) this.i.getApplicationContext().getSystemService("location");
                }
                zBooleanValue = ((Boolean) g.a(this.l, "isLocationEnabled", new Object[0])).booleanValue();
            }
            if (k.c() >= 24 && k.c() < 28 && Settings.Secure.getInt(this.i.getContentResolver(), "location_mode", 0) == 0) {
                return false;
            }
        } catch (Throwable unused) {
            e.a();
        }
        return zBooleanValue;
    }

    public final void u() {
        s(a(12, "定位服务没有开启，请在设置中打开定位服务开关#1206"));
    }

    public final void v(AMapLocation aMapLocation) {
        if (this.h != null) {
            e.a();
            Message messageObtain = Message.obtain();
            messageObtain.obj = aMapLocation;
            messageObtain.what = 101;
            this.h.sendMessage(messageObtain);
        }
    }

    public final void w() {
        s(a(20, "模糊权限下不支持连续定位#2006"));
    }

    public final void x(AMapLocation aMapLocation) {
        try {
            if (!c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()) || !this.m.isOffset()) {
                aMapLocation.setOffset(false);
                aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
                return;
            }
            DPoint dPointA = f.a(this.i, new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
            aMapLocation.setLatitude(dPointA.getLatitude());
            aMapLocation.setLongitude(dPointA.getLongitude());
            aMapLocation.setOffset(this.m.isOffset());
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_GCJ02);
        } catch (Throwable th) {
            aMapLocation.setOffset(false);
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
            new StringBuilder("CoarseLocation | offset error: ").append(th.getMessage());
            e.a();
        }
    }

    public final AMapLocation y(AMapLocation aMapLocation) {
        if (!k.a(aMapLocation) || this.c < 3) {
            return aMapLocation;
        }
        if (aMapLocation.getAccuracy() < 0.0f || aMapLocation.getAccuracy() == Float.MAX_VALUE) {
            aMapLocation.setAccuracy(0.0f);
        }
        if (aMapLocation.getSpeed() < 0.0f || aMapLocation.getSpeed() == Float.MAX_VALUE) {
            aMapLocation.setSpeed(0.0f);
        }
        return this.d.a(aMapLocation);
    }

    public final void z() {
        if (this.l == null) {
            return;
        }
        try {
            this.o = true;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = this.i.getMainLooper();
            }
            this.f29707a = k.b();
            if (r(this.l)) {
                if (this.q == null) {
                    this.q = new a(this);
                }
                this.l.requestLocationUpdates("network", this.m.getInterval(), this.m.getDeviceModeDistanceFilter(), this.q, looperMyLooper);
            }
            if (m(this.l)) {
                try {
                    if (k.a() - s >= 259200000) {
                        if (k.c(this.i, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==")) {
                            this.l.sendExtraCommand("gps", "force_xtra_injection", null);
                            s = k.a();
                            SharedPreferences.Editor editorA = j.a(this.i, "pref");
                            j.a(editorA, "lagt", s);
                            j.a(editorA);
                            e.a();
                        } else {
                            c.a(new Exception("n_alec"), "OPENSDK_CL", "rlu_n_alec");
                        }
                    }
                } catch (Throwable th) {
                    new StringBuilder("CoarseLocation | sendExtraCommand error: ").append(th.getMessage());
                    e.a();
                }
                if (this.q == null) {
                    this.q = new a(this);
                }
                this.l.requestLocationUpdates("gps", this.m.getInterval(), this.m.getDeviceModeDistanceFilter(), this.q, looperMyLooper);
                e.a();
            }
            if (u || w) {
                d(100, "系统返回定位结果超时#2002", this.m.getHttpTimeOut());
            }
            if (u || w) {
                return;
            }
            e.a();
            d(100, "系统定位当前不可用#2003", 0L);
        } catch (SecurityException e) {
            e.a();
            this.o = false;
            i.a((String) null, 2121);
            d(101, e.getMessage() + "#2004", 0L);
        } catch (Throwable th2) {
            new StringBuilder("CoarseLocation | requestLocationUpdates error: ").append(th2.getMessage());
            e.a();
            c.a(th2, "CoarseLocation", "requestLocationUpdates part2");
        }
    }
}
