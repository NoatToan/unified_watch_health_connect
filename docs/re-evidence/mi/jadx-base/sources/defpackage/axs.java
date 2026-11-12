package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.GnssStatus;
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
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.d;
import com.autonavi.aps.amapapi.utils.e;
import com.autonavi.aps.amapapi.utils.f;
import com.autonavi.aps.amapapi.utils.g;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.j;
import com.autonavi.aps.amapapi.utils.k;
import com.xiaomi.fitness.common.utils.FusionLocationRequest;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class axs {
    public static AMapLocation D = null;
    public static long E = 0;
    public static Object F = new Object();
    public static long G = 0;
    public static boolean H = false;
    public static boolean I = false;
    public static volatile AMapLocation J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f3547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f3548b;
    public LocationManager c;
    public AMapLocationClientOption d;
    public com.autonavi.aps.amapapi.filters.a i;
    public GnssStatus.Callback t;
    public long e = 0;
    public long f = 0;
    public boolean g = false;
    public int h = 0;
    public int j = 240;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3549k = 80;
    public AMapLocation l = null;
    public long m = 0;
    public float n = 0.0f;
    public Object o = new Object();
    public Object p = new Object();
    public int q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public GpsStatus f3550r = null;
    public GpsStatus.Listener s = null;
    public AMapLocationClientOption.GeoLanguage u = AMapLocationClientOption.GeoLanguage.DEFAULT;
    public boolean v = true;
    public long w = 0;
    public int x = 0;
    public LocationListener y = null;
    public String z = null;
    public boolean A = false;
    public int B = 0;
    public boolean C = false;

    public class a extends GnssStatus.Callback {
        public a() {
        }

        @Override // android.location.GnssStatus.Callback
        public final void onFirstFix(int i) {
            axs.K();
        }

        @Override // android.location.GnssStatus.Callback
        public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            axs.this.e(gnssStatus);
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStarted() {
            axs.I();
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStopped() {
            axs.this.J();
        }
    }

    public static class b implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public axs f3552a;

        public b(axs axsVar) {
            this.f3552a = axsVar;
        }

        public final void a() {
            this.f3552a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                new StringBuilder("tid=").append(Thread.currentThread().getId());
                e.a();
                axs axsVar = this.f3552a;
                if (axsVar != null) {
                    axsVar.f(location);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                axs axsVar = this.f3552a;
                if (axsVar != null) {
                    axsVar.p(str);
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
                axs axsVar = this.f3552a;
                if (axsVar != null) {
                    axsVar.c(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public axs(Context context, Handler handler) {
        this.i = null;
        this.f3548b = context;
        this.f3547a = handler;
        try {
            this.c = (LocationManager) context.getSystemService("location");
        } catch (Throwable th) {
            c.a(th, "GpsLocation", "<init>");
        }
        this.i = new com.autonavi.aps.amapapi.filters.a();
    }

    public static void G(AMapLocation aMapLocation) {
        if (k.a(aMapLocation) && com.autonavi.aps.amapapi.utils.b.s()) {
            long time = aMapLocation.getTime();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jA = d.a(time, jCurrentTimeMillis, com.autonavi.aps.amapapi.utils.b.t());
            if (jA != time) {
                aMapLocation.setTime(jA);
                i.a(time, jCurrentTimeMillis);
            }
        }
    }

    public static void I() {
        e.a();
    }

    public static void K() {
        e.a();
    }

    public static boolean L() {
        try {
            return ((Boolean) g.a(p0t.t("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), p0t.t("UaXNOYXZpU3RhcnRlZA=="), (Object[]) null, (Class<?>[]) null)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean q(LocationManager locationManager) {
        try {
            if (H) {
                return I;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders == null || allProviders.size() <= 0) {
                I = false;
            } else {
                I = allProviders.contains("gps");
            }
            H = true;
            return I;
        } catch (Throwable th) {
            new StringBuilder("GpsLocation | hasProvider error: ").append(th.getMessage());
            e.a();
            return I;
        }
    }

    public final void A(AMapLocation aMapLocation) {
        try {
            if (!c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()) || !this.d.isOffset()) {
                aMapLocation.setOffset(false);
                aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
                return;
            }
            DPoint dPointA = f.a(this.f3548b, new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
            aMapLocation.setLatitude(dPointA.getLatitude());
            aMapLocation.setLongitude(dPointA.getLongitude());
            aMapLocation.setOffset(this.d.isOffset());
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_GCJ02);
        } catch (Throwable unused) {
            aMapLocation.setOffset(false);
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
        }
    }

    public final void B(AMapLocation aMapLocation) {
        try {
            int i = this.q;
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

    public final boolean C() {
        AMapLocationClientOption aMapLocationClientOption = this.d;
        return (aMapLocationClientOption == null || aMapLocationClientOption.isOnceLocation() || k.b() - this.f <= 300000) ? false : true;
    }

    public final AMapLocation D(AMapLocation aMapLocation) {
        if (!k.a(aMapLocation) || this.h < 3) {
            return aMapLocation;
        }
        if (aMapLocation.getAccuracy() < 0.0f || aMapLocation.getAccuracy() == Float.MAX_VALUE) {
            aMapLocation.setAccuracy(0.0f);
        }
        if (aMapLocation.getSpeed() < 0.0f || aMapLocation.getSpeed() == Float.MAX_VALUE) {
            aMapLocation.setSpeed(0.0f);
        }
        return this.i.a(aMapLocation);
    }

    public final void H() {
        if (this.c == null) {
            return;
        }
        try {
            this.v = true;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = this.f3548b.getMainLooper();
            }
            Looper looper = looperMyLooper;
            this.e = k.b();
            if (!q(this.c)) {
                e.a();
                d(8, 14, "no gps provider#1402", 0L);
                return;
            }
            try {
                if (k.a() - G >= 259200000) {
                    if (k.c(this.f3548b, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==")) {
                        this.c.sendExtraCommand("gps", "force_xtra_injection", null);
                        G = k.a();
                        SharedPreferences.Editor editorA = j.a(this.f3548b, "pref");
                        j.a(editorA, "lagt", G);
                        j.a(editorA);
                        e.a();
                    } else {
                        c.a(new Exception("n_alec"), "OPENSDK_GL", "rlu_n_alec");
                    }
                }
            } catch (Throwable th) {
                new StringBuilder("GpsLocation | sendExtraCommand error: ").append(th.getMessage());
                e.a();
            }
            if (this.y == null) {
                this.y = new b(this);
            }
            if (!this.d.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) || this.d.getDeviceModeDistanceFilter() <= 0.0f) {
                this.c.requestLocationUpdates("gps", 900L, 0.0f, this.y, looper);
            } else {
                this.c.requestLocationUpdates("gps", this.d.getInterval(), this.d.getDeviceModeDistanceFilter(), this.y, looper);
            }
            a aVar = new a();
            this.t = aVar;
            this.c.registerGnssStatusCallback(aVar);
            d(8, 14, "no enough satellites#1401", this.d.getHttpTimeOut());
        } catch (SecurityException e) {
            e.a();
            this.v = false;
            i.a((String) null, 2121);
            d(2, 12, e.getMessage() + "#1201", 0L);
        } catch (Throwable th2) {
            new StringBuilder("GpsLocation | requestLocationUpdates error: ").append(th2.getMessage());
            e.a();
            c.a(th2, "GpsLocation", "requestLocationUpdates part2");
        }
    }

    public final void J() {
        e.a();
        this.q = 0;
    }

    public final AMapLocation M() {
        float f;
        float f2;
        try {
            if (k.a(this.l) && com.autonavi.aps.amapapi.utils.b.k() && L()) {
                JSONObject jSONObject = new JSONObject((String) g.a(p0t.t("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), p0t.t("UZ2V0TmF2aUxvY2F0aW9u"), (Object[]) null, (Class<?>[]) null));
                long jOptLong = jSONObject.optLong("time");
                if (!this.C) {
                    this.C = true;
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
                    if (k.a(aMapLocation, this.l) <= 300.0f) {
                        synchronized (this.p) {
                            this.l.setLongitude(dOptDouble2);
                            this.l.setLatitude(dOptDouble);
                            this.l.setAccuracy(f);
                            this.l.setBearing(f2);
                            this.l.setSpeed(f3);
                            this.l.setTime(jOptLong);
                            this.l.setCoordType(AMapLocation.COORD_TYPE_GCJ02);
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
        long j;
        if (this.l == null) {
            return aMapLocation;
        }
        if ((!this.d.isMockEnable() && this.l.isMock()) || !k.a(this.l)) {
            return aMapLocation;
        }
        AMapLocation aMapLocationM = M();
        if (aMapLocationM != null && k.a(aMapLocationM)) {
            aMapLocationM.setTrustedLevel(2);
            return aMapLocationM;
        }
        float speed = this.l.getSpeed();
        if (speed == 0.0f) {
            long j2 = this.m;
            if (j2 > 0 && j2 < 8) {
                float f = this.n;
                if (f > 0.0f) {
                    speed = f / j2;
                }
            }
        }
        if (aMapLocation == null || !k.a(aMapLocation)) {
            j = 30000;
        } else if (aMapLocation.getAccuracy() < 200.0f) {
            int i = this.B + 1;
            this.B = i;
            if (this.z == null && i >= 2) {
                this.A = true;
            }
            j = speed > 5.0f ? 10000L : 15000L;
        } else {
            if (!TextUtils.isEmpty(this.z)) {
                this.A = false;
                this.B = 0;
            }
            if (speed > 5.0f) {
                j = 20000;
            } else {
                j = 30000;
            }
        }
        long jB = k.b() - this.f;
        if (jB > 30000) {
            return aMapLocation;
        }
        if (jB < j) {
            if (this.z == null && this.B >= 2) {
                this.z = str;
            }
            AMapLocation aMapLocationM78clone = this.l.m78clone();
            aMapLocationM78clone.setTrustedLevel(2);
            return aMapLocationM78clone;
        }
        if (this.A && u(str)) {
            AMapLocation aMapLocationM78clone2 = this.l.m78clone();
            aMapLocationM78clone2.setTrustedLevel(3);
            return aMapLocationM78clone2;
        }
        this.z = null;
        this.B = 0;
        synchronized (this.p) {
            this.l = null;
        }
        this.m = 0L;
        this.n = 0.0f;
        return aMapLocation;
    }

    public final void b() {
        LocationManager locationManager = this.c;
        if (locationManager == null) {
            return;
        }
        try {
            LocationListener locationListener = this.y;
            if (locationListener != null) {
                locationManager.removeUpdates(locationListener);
                ((b) this.y).a();
                this.y = null;
            }
        } catch (Throwable unused) {
        }
        try {
            GpsStatus.Listener listener = this.s;
            if (listener != null) {
                this.c.removeGpsStatusListener(listener);
            }
        } catch (Throwable unused2) {
        }
        try {
            GnssStatus.Callback callback = this.t;
            if (callback != null) {
                this.c.unregisterGnssStatusCallback(callback);
            }
        } catch (Throwable unused3) {
        }
        try {
            Handler handler = this.f3547a;
            if (handler != null) {
                handler.removeMessages(8);
            }
        } catch (Throwable unused4) {
        }
        this.q = 0;
        this.e = 0L;
        this.w = 0L;
        this.f = 0L;
        this.h = 0;
        this.x = 0;
        this.i.a();
        this.l = null;
        this.m = 0L;
        this.n = 0.0f;
        this.z = null;
        this.C = false;
    }

    public final void c(int i) {
        if (i == 0) {
            try {
                this.f = 0L;
                this.q = 0;
            } catch (Throwable unused) {
            }
        }
    }

    public final void d(int i, int i2, String str, long j) {
        try {
            if (this.f3547a == null || this.d.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
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
            this.f3547a.sendMessageDelayed(messageObtain, j);
        } catch (Throwable unused) {
        }
    }

    public final void e(GnssStatus gnssStatus) {
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
                        this.q = i;
                    }
                }
                i = i2;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        this.q = i;
    }

    public final void f(Location location) {
        Handler handler = this.f3547a;
        if (handler != null) {
            handler.removeMessages(8);
        }
        if (location == null) {
            return;
        }
        try {
            AMapLocation aMapLocation = new AMapLocation(location);
            if (k.a(aMapLocation)) {
                aMapLocation.setProvider("gps");
                aMapLocation.setLocationType(1);
                if (!this.g && k.a(aMapLocation)) {
                    i.a(this.f3548b, k.b() - this.e, c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                    this.g = true;
                }
                if (k.a(aMapLocation, this.q)) {
                    aMapLocation.setMock(true);
                    aMapLocation.setTrustedLevel(4);
                    if (!this.d.isMockEnable()) {
                        int i = this.x;
                        if (i <= 3) {
                            this.x = i + 1;
                            return;
                        }
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
                        w(aMapLocation);
                        return;
                    }
                } else {
                    this.x = 0;
                }
                aMapLocation.setSatellites(this.q);
                A(aMapLocation);
                B(aMapLocation);
                G(aMapLocation);
                AMapLocation aMapLocationD = D(aMapLocation);
                h(aMapLocationD);
                r(aMapLocationD);
                synchronized (this.o) {
                    i(aMapLocationD, J);
                }
                try {
                    if (k.a(aMapLocationD)) {
                        if (this.l != null) {
                            this.m = location.getTime() - this.l.getTime();
                            this.n = k.a(this.l, aMapLocationD);
                        }
                        synchronized (this.p) {
                            this.l = aMapLocationD.m78clone();
                        }
                        this.z = null;
                        this.A = false;
                        this.B = 0;
                    }
                } catch (Throwable th) {
                    c.a(th, "GpsLocation", "onLocationChangedLast");
                }
                w(aMapLocationD);
            }
        } catch (Throwable th2) {
            c.a(th2, "GpsLocation", "onLocationChanged");
        }
    }

    public final void g(Bundle bundle) {
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                this.j = bundle.getInt("I_MAX_GEO_DIS");
                this.f3549k = bundle.getInt("I_MIN_GEO_DIS");
                AMapLocation aMapLocation = (AMapLocation) bundle.getParcelable("loc");
                if (TextUtils.isEmpty(aMapLocation.getAdCode())) {
                    return;
                }
                synchronized (this.o) {
                    try {
                        J = aMapLocation;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                c.a(th2, "GpsLocation", "setLastGeoLocation");
            }
        }
    }

    public final void h(AMapLocation aMapLocation) {
        if (k.a(aMapLocation)) {
            this.f = k.b();
            synchronized (F) {
                E = k.b();
                D = aMapLocation.m78clone();
            }
            this.h++;
        }
    }

    public final void i(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        if (aMapLocation2 == null || !this.d.isNeedAddress() || k.a(aMapLocation, aMapLocation2) >= this.j) {
            return;
        }
        c.a(aMapLocation, aMapLocation2);
    }

    public final void j(AMapLocationClientOption aMapLocationClientOption) {
        this.d = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.d = new AMapLocationClientOption();
        }
        try {
            G = j.a(this.f3548b, "pref", "lagt", G);
        } catch (Throwable unused) {
        }
        H();
    }

    public final void p(String str) {
        try {
            if ("gps".equalsIgnoreCase(str)) {
                this.f = 0L;
                this.q = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public final void r(AMapLocation aMapLocation) {
        if (k.a(aMapLocation) && this.f3547a != null) {
            long jB = k.b();
            if (this.d.getInterval() <= FusionLocationRequest.timeout || jB - this.w > this.d.getInterval() - FusionLocationRequest.timeout) {
                Bundle bundle = new Bundle();
                bundle.putDouble("lat", aMapLocation.getLatitude());
                bundle.putDouble("lon", aMapLocation.getLongitude());
                bundle.putFloat("radius", aMapLocation.getAccuracy());
                bundle.putLong("time", aMapLocation.getTime());
                Message messageObtain = Message.obtain();
                messageObtain.setData(bundle);
                messageObtain.what = 5;
                synchronized (this.o) {
                    try {
                        if (J == null || k.a(aMapLocation, J) > this.f3549k) {
                            this.f3547a.sendMessage(messageObtain);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void s(AMapLocationClientOption aMapLocationClientOption) {
        Handler handler;
        if (aMapLocationClientOption == null) {
            aMapLocationClientOption = new AMapLocationClientOption();
        }
        this.d = aMapLocationClientOption;
        if (aMapLocationClientOption.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors && (handler = this.f3547a) != null) {
            handler.removeMessages(8);
        }
        if (this.u != this.d.getGeoLanguage()) {
            synchronized (this.o) {
                J = null;
            }
        }
        this.u = this.d.getGeoLanguage();
    }

    public final boolean t() {
        return k.b() - this.f <= 2800;
    }

    public final boolean u(String str) {
        try {
            ArrayList<String> arrayListB = k.b(str);
            ArrayList<String> arrayListB2 = k.b(this.z);
            if (arrayListB.size() < 8 || arrayListB2.size() < 8) {
                return false;
            }
            return k.a(this.z, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void v() {
        this.x = 0;
    }

    public final void w(AMapLocation aMapLocation) {
        if (aMapLocation.getErrorCode() != 15 || AMapLocationClientOption.AMapLocationMode.Device_Sensors.equals(this.d.getLocationMode())) {
            if (this.d.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) && this.d.getDeviceModeDistanceFilter() > 0.0f) {
                y(aMapLocation);
            } else if (k.b() - this.w >= this.d.getInterval() - 200) {
                this.w = k.b();
                y(aMapLocation);
            }
        }
    }

    @SuppressLint({"NewApi"})
    public final int x() {
        LocationManager locationManager = this.c;
        if (locationManager == null || !q(locationManager)) {
            return 1;
        }
        int i = Settings.Secure.getInt(this.f3548b.getContentResolver(), "location_mode", 0);
        if (i == 0) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        return !this.v ? 4 : 0;
    }

    public final void y(AMapLocation aMapLocation) {
        if (this.f3547a != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = aMapLocation;
            messageObtain.what = 2;
            this.f3547a.sendMessage(messageObtain);
        }
    }

    public final int z() {
        return this.q;
    }
}
