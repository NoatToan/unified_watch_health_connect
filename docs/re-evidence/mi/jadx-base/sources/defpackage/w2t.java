package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.e;
import com.autonavi.aps.amapapi.utils.f;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.j;
import com.autonavi.aps.amapapi.utils.k;
import com.xiaomi.fitness.common.utils.FusionLocationRequest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w2t {
    public static Object A = new Object();
    public static long B = 0;
    public static boolean C = false;
    public static boolean D = false;
    public static volatile AMapLocation E;
    public static AMapLocation y;
    public static long z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f37492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f37493b;
    public LocationManager c;
    public AMapLocationClientOption d;
    public com.autonavi.aps.amapapi.filters.a l;
    public String e = null;
    public int f = 0;
    public boolean g = false;
    public long h = 0;
    public long i = 0;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37494k = 0;
    public int m = 240;
    public int n = 80;
    public AMapLocation o = null;
    public long p = 0;
    public float q = 0.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f37495r = new Object();
    public Object s = new Object();
    public AMapLocationClientOption.GeoLanguage t = AMapLocationClientOption.GeoLanguage.DEFAULT;
    public boolean u = true;
    public long v = 0;
    public int w = 0;
    public LocationListener x = null;

    public static class a implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w2t f37496a;

        public a(w2t w2tVar) {
            this.f37496a = w2tVar;
        }

        public final void a() {
            this.f37496a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                new StringBuilder("tid=").append(Thread.currentThread().getId());
                e.a();
                w2t w2tVar = this.f37496a;
                if (w2tVar != null) {
                    w2tVar.e(location);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                w2t w2tVar = this.f37496a;
                if (w2tVar != null) {
                    w2tVar.j(str);
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
                w2t w2tVar = this.f37496a;
                if (w2tVar != null) {
                    w2tVar.c(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public w2t(Context context, Handler handler) {
        this.l = null;
        this.f37493b = context;
        this.f37492a = handler;
        try {
            this.c = (LocationManager) context.getSystemService("location");
        } catch (Throwable th) {
            c.a(th, "NetworkLocation", "<init>");
        }
        this.l = new com.autonavi.aps.amapapi.filters.a();
    }

    public static boolean n(LocationManager locationManager) {
        try {
            if (C) {
                return D;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders == null || allProviders.size() <= 0) {
                D = false;
            } else {
                D = allProviders.contains("network");
            }
            C = true;
            return D;
        } catch (Throwable th) {
            new StringBuilder("NetworkLocation | hasProvider error: ").append(th.getMessage());
            e.a();
            return D;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    public final AMapLocation a(AMapLocation aMapLocation, String str) {
        long j;
        if (this.o == null) {
            return aMapLocation;
        }
        if ((!this.d.isMockEnable() && this.o.isMock()) || !k.a(this.o)) {
            return aMapLocation;
        }
        float speed = this.o.getSpeed();
        if (speed == 0.0f) {
            long j2 = this.p;
            if (j2 > 0 && j2 < 8) {
                float f = this.q;
                if (f > 0.0f) {
                    speed = f / j2;
                }
            }
        }
        if (aMapLocation == null || !k.a(aMapLocation)) {
            j = 30000;
        } else if (aMapLocation.getAccuracy() < 200.0f) {
            int i = this.f + 1;
            this.f = i;
            if (this.e == null && i >= 2) {
                this.g = true;
            }
            j = speed > 5.0f ? 10000L : 15000L;
        } else {
            if (!TextUtils.isEmpty(this.e)) {
                this.g = false;
                this.f = 0;
            }
            if (speed > 5.0f) {
                j = 20000;
            } else {
                j = 30000;
            }
        }
        long jB = k.b() - this.i;
        if (jB > 30000) {
            return aMapLocation;
        }
        if (jB < j) {
            if (this.e == null && this.f >= 2) {
                this.e = str;
            }
            AMapLocation aMapLocationM78clone = this.o.m78clone();
            aMapLocationM78clone.setTrustedLevel(2);
            return aMapLocationM78clone;
        }
        if (this.g && q(str)) {
            AMapLocation aMapLocationM78clone2 = this.o.m78clone();
            aMapLocationM78clone2.setTrustedLevel(3);
            return aMapLocationM78clone2;
        }
        this.e = null;
        this.f = 0;
        synchronized (this.s) {
            this.o = null;
        }
        this.p = 0L;
        this.q = 0.0f;
        return aMapLocation;
    }

    public final void b() {
        LocationManager locationManager = this.c;
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
            Handler handler = this.f37492a;
            if (handler != null) {
                handler.removeMessages(17);
            }
        } catch (Throwable unused2) {
        }
        this.h = 0L;
        this.v = 0L;
        this.i = 0L;
        this.f37494k = 0;
        this.w = 0;
        this.l.a();
        this.o = null;
        this.p = 0L;
        this.q = 0.0f;
        this.e = null;
    }

    public final void c(int i) {
        if (i == 0) {
            try {
                this.i = 0L;
            } catch (Throwable unused) {
            }
        }
    }

    public final void d(int i, int i2, String str, long j) {
        try {
            if (this.f37492a == null || this.d.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Battery_Saving) {
                return;
            }
            Message messageObtain = Message.obtain();
            AMapLocation aMapLocation = new AMapLocation("");
            aMapLocation.setProvider("network");
            aMapLocation.setErrorCode(i2);
            aMapLocation.setLocationDetail(str);
            aMapLocation.setLocationType(12);
            messageObtain.obj = aMapLocation;
            messageObtain.what = i;
            this.f37492a.sendMessageDelayed(messageObtain, j);
        } catch (Throwable unused) {
        }
    }

    public final void e(Location location) {
        Handler handler = this.f37492a;
        if (handler != null) {
            handler.removeMessages(17);
        }
        if (location == null) {
            return;
        }
        try {
            AMapLocation aMapLocation = new AMapLocation(location);
            if (k.a(aMapLocation)) {
                aMapLocation.setProvider("network");
                aMapLocation.setLocationType(12);
                if (!this.j && k.a(aMapLocation)) {
                    i.a(this.f37493b, k.b() - this.h, c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                    this.j = true;
                }
                v(aMapLocation);
                AMapLocation aMapLocationW = w(aMapLocation);
                g(aMapLocationW);
                o(aMapLocationW);
                synchronized (this.f37495r) {
                    h(aMapLocationW, E);
                }
                try {
                    if (k.a(aMapLocationW)) {
                        if (this.o != null) {
                            this.p = location.getTime() - this.o.getTime();
                            this.q = k.a(this.o, aMapLocationW);
                        }
                        synchronized (this.s) {
                            this.o = aMapLocationW.m78clone();
                        }
                        this.e = null;
                        this.g = false;
                        this.f = 0;
                    }
                } catch (Throwable th) {
                    c.a(th, "NetworkLocation", "onLocationChangedLast");
                }
                r(aMapLocationW);
            }
        } catch (Throwable th2) {
            c.a(th2, "NetworkLocation", "onLocationChanged");
        }
    }

    public final void f(Bundle bundle) {
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                this.m = bundle.getInt("I_MAX_GEO_DIS");
                this.n = bundle.getInt("I_MIN_GEO_DIS");
                AMapLocation aMapLocation = (AMapLocation) bundle.getParcelable("loc");
                if (TextUtils.isEmpty(aMapLocation.getAdCode())) {
                    return;
                }
                synchronized (this.f37495r) {
                    try {
                        E = aMapLocation;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                c.a(th2, "NetworkLocation", "setLastGeoLocation");
            }
        }
    }

    public final void g(AMapLocation aMapLocation) {
        if (k.a(aMapLocation)) {
            this.i = k.b();
            synchronized (A) {
                z = k.b();
                y = aMapLocation.m78clone();
            }
            this.f37494k++;
        }
    }

    public final void h(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        if (aMapLocation2 == null || !this.d.isNeedAddress() || k.a(aMapLocation, aMapLocation2) >= this.m) {
            return;
        }
        c.a(aMapLocation, aMapLocation2);
    }

    public final void i(AMapLocationClientOption aMapLocationClientOption) {
        this.d = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.d = new AMapLocationClientOption();
        }
        try {
            B = j.a(this.f37493b, "pref", "lagt", B);
        } catch (Throwable unused) {
        }
        t();
    }

    public final void j(String str) {
        try {
            if ("network".equalsIgnoreCase(str)) {
                this.i = 0L;
            }
        } catch (Throwable unused) {
        }
    }

    public final void o(AMapLocation aMapLocation) {
        if (k.a(aMapLocation) && this.f37492a != null) {
            long jB = k.b();
            if (this.d.getInterval() <= FusionLocationRequest.timeout || jB - this.v > this.d.getInterval() - FusionLocationRequest.timeout) {
                Bundle bundle = new Bundle();
                bundle.putDouble("lat", aMapLocation.getLatitude());
                bundle.putDouble("lon", aMapLocation.getLongitude());
                bundle.putFloat("radius", aMapLocation.getAccuracy());
                bundle.putLong("time", aMapLocation.getTime());
                Message messageObtain = Message.obtain();
                messageObtain.setData(bundle);
                messageObtain.what = 14;
                synchronized (this.f37495r) {
                    try {
                        if (E == null || k.a(aMapLocation, E) > this.n) {
                            this.f37492a.sendMessage(messageObtain);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final boolean p() {
        AMapLocationClientOption aMapLocationClientOption = this.d;
        return (aMapLocationClientOption == null || aMapLocationClientOption.isOnceLocation() || k.b() - this.i <= 300000) ? false : true;
    }

    public final boolean q(String str) {
        try {
            ArrayList<String> arrayListB = k.b(str);
            ArrayList<String> arrayListB2 = k.b(this.e);
            if (arrayListB.size() < 8 || arrayListB2.size() < 8) {
                return false;
            }
            return k.a(this.e, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void r(AMapLocation aMapLocation) {
        if (aMapLocation.getErrorCode() != 15 || AMapLocationClientOption.AMapLocationMode.Battery_Saving.equals(this.d.getLocationMode())) {
            if (this.d.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Battery_Saving) && this.d.getDeviceModeDistanceFilter() > 0.0f) {
                u(aMapLocation);
            } else if (k.b() - this.v >= this.d.getInterval() - 200) {
                this.v = k.b();
                u(aMapLocation);
            }
        }
    }

    public final boolean s() {
        return k.b() - this.i <= 2800;
    }

    public final void t() {
        if (this.c == null) {
            return;
        }
        try {
            this.u = true;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = this.f37493b.getMainLooper();
            }
            Looper looper = looperMyLooper;
            this.h = k.b();
            if (!n(this.c)) {
                e.a();
                d(17, 13, "no network provider#1402", 0L);
                return;
            }
            try {
                if (k.a() - B >= 259200000) {
                    if (k.c(this.f37493b, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==")) {
                        this.c.sendExtraCommand("gps", "force_xtra_injection", null);
                        B = k.a();
                        SharedPreferences.Editor editorA = j.a(this.f37493b, "pref");
                        j.a(editorA, "lagt", B);
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
            if (this.x == null) {
                this.x = new a(this);
            }
            if (!this.d.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Battery_Saving) || this.d.getDeviceModeDistanceFilter() <= 0.0f) {
                this.c.requestLocationUpdates("network", 900L, 0.0f, this.x, looper);
            } else {
                this.c.requestLocationUpdates("network", this.d.getInterval(), this.d.getDeviceModeDistanceFilter(), this.x, looper);
            }
            d(17, 13, "no enough satellites#1401", this.d.getHttpTimeOut());
        } catch (SecurityException e) {
            e.a();
            this.u = false;
            i.a((String) null, 2121);
            d(15, 12, e.getMessage() + "#1201", 0L);
        } catch (Throwable th2) {
            new StringBuilder("NetworkLocation | requestLocationUpdates error: ").append(th2.getMessage());
            e.a();
            c.a(th2, "NetworkLocation", "requestLocationUpdates part2");
        }
    }

    public final void u(AMapLocation aMapLocation) {
        if (this.f37492a != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = aMapLocation;
            messageObtain.what = 15;
            this.f37492a.sendMessage(messageObtain);
        }
    }

    public final void v(AMapLocation aMapLocation) {
        try {
            if (!c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()) || !this.d.isOffset()) {
                aMapLocation.setOffset(false);
                aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
                return;
            }
            DPoint dPointA = f.a(this.f37493b, new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
            aMapLocation.setLatitude(dPointA.getLatitude());
            aMapLocation.setLongitude(dPointA.getLongitude());
            aMapLocation.setOffset(this.d.isOffset());
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_GCJ02);
        } catch (Throwable unused) {
            aMapLocation.setOffset(false);
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
        }
    }

    public final AMapLocation w(AMapLocation aMapLocation) {
        if (!k.a(aMapLocation) || this.f37494k < 3) {
            return aMapLocation;
        }
        if (aMapLocation.getAccuracy() < 0.0f || aMapLocation.getAccuracy() == Float.MAX_VALUE) {
            aMapLocation.setAccuracy(0.0f);
        }
        if (aMapLocation.getSpeed() < 0.0f || aMapLocation.getSpeed() == Float.MAX_VALUE) {
            aMapLocation.setSpeed(0.0f);
        }
        return this.l.a(aMapLocation);
    }
}
