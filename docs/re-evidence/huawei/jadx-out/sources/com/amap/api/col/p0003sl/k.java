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
import android.text.TextUtils;
import androidx.media3.common.C;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.e;
import com.autonavi.aps.amapapi.utils.f;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k {
    static AMapLocation j = null;
    static long k = 0;
    static Object l = new Object();
    static long q = 0;
    static boolean t = false;
    static boolean u = false;
    public static volatile AMapLocation y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Handler f2943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LocationManager f2944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    AMapLocationClientOption f2945c;
    com.autonavi.aps.amapapi.filters.a f;
    private Context z;
    private String A = null;
    private int B = 0;
    private boolean C = false;
    private long D = 0;
    long d = 0;
    boolean e = false;
    private int E = 0;
    int g = 240;
    int h = 80;
    AMapLocation i = null;
    long m = 0;
    float n = 0.0f;
    Object o = new Object();
    Object p = new Object();
    AMapLocationClientOption.GeoLanguage r = AMapLocationClientOption.GeoLanguage.DEFAULT;
    boolean s = true;
    long v = 0;
    int w = 0;
    LocationListener x = null;

    public k(Context context, Handler handler) {
        this.f = null;
        this.z = context;
        this.f2943a = handler;
        try {
            this.f2944b = (LocationManager) context.getSystemService("location");
        } catch (Throwable th) {
            c.a(th, "NetworkLocation", "<init>");
        }
        this.f = new com.autonavi.aps.amapapi.filters.a();
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        this.f2945c = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.f2945c = new AMapLocationClientOption();
        }
        try {
            q = j.a(this.z, "pref", "lagt", q);
        } catch (Throwable unused) {
        }
        d();
    }

    public final void a() {
        LocationManager locationManager = this.f2944b;
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
            Handler handler = this.f2943a;
            if (handler != null) {
                handler.removeMessages(17);
            }
        } catch (Throwable unused2) {
        }
        this.D = 0L;
        this.v = 0L;
        this.d = 0L;
        this.E = 0;
        this.w = 0;
        this.f.a();
        this.i = null;
        this.m = 0L;
        this.n = 0.0f;
        this.A = null;
    }

    private void d() {
        if (this.f2944b == null) {
            return;
        }
        try {
            this.s = true;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = this.z.getMainLooper();
            }
            Looper looper = looperMyLooper;
            this.D = com.autonavi.aps.amapapi.utils.k.b();
            if (a(this.f2944b)) {
                try {
                    if (com.autonavi.aps.amapapi.utils.k.a() - q >= 259200000) {
                        if (com.autonavi.aps.amapapi.utils.k.c(this.z, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==")) {
                            this.f2944b.sendExtraCommand(GeocodeSearch.GPS, "force_xtra_injection", null);
                            q = com.autonavi.aps.amapapi.utils.k.a();
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
                if (this.f2945c.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Battery_Saving) && this.f2945c.getDeviceModeDistanceFilter() > 0.0f) {
                    this.f2944b.requestLocationUpdates("network", this.f2945c.getInterval(), this.f2945c.getDeviceModeDistanceFilter(), this.x, looper);
                } else {
                    this.f2944b.requestLocationUpdates("network", 900L, 0.0f, this.x, looper);
                }
                a(17, 13, "no enough satellites#1401", this.f2945c.getHttpTimeOut());
                return;
            }
            e.a();
            a(17, 13, "no network provider#1402", 0L);
        } catch (SecurityException e) {
            new Object[]{"NetworkLocation | no location permission"};
            e.a();
            this.s = false;
            i.a((String) null, 2121);
            a(15, 12, e.getMessage() + "#1201", 0L);
        } catch (Throwable th2) {
            new Object[]{"NetworkLocation | requestLocationUpdates error: " + th2.getMessage()};
            e.a();
            c.a(th2, "NetworkLocation", "requestLocationUpdates part2");
        }
    }

    private static boolean a(LocationManager locationManager) {
        try {
            if (t) {
                return u;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders != null && allProviders.size() > 0) {
                u = allProviders.contains("network");
            } else {
                u = false;
            }
            t = true;
            return u;
        } catch (Throwable th) {
            new Object[]{"NetworkLocation | hasProvider error: " + th.getMessage()};
            e.a();
            return u;
        }
    }

    private void a(int i, int i2, String str, long j2) {
        try {
            if (this.f2943a == null || this.f2945c.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Battery_Saving) {
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
            this.f2943a.sendMessageDelayed(messageObtain, j2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Location location) {
        Handler handler = this.f2943a;
        if (handler != null) {
            handler.removeMessages(17);
        }
        if (location == null) {
            return;
        }
        try {
            AMapLocation aMapLocation = new AMapLocation(location);
            if (com.autonavi.aps.amapapi.utils.k.a(aMapLocation)) {
                aMapLocation.setProvider("network");
                aMapLocation.setLocationType(12);
                if (!this.e && com.autonavi.aps.amapapi.utils.k.a(aMapLocation)) {
                    i.a(this.z, com.autonavi.aps.amapapi.utils.k.b() - this.D, c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                    this.e = true;
                }
                e(aMapLocation);
                AMapLocation aMapLocationF = f(aMapLocation);
                a(aMapLocationF);
                b(aMapLocationF);
                synchronized (this.o) {
                    a(aMapLocationF, y);
                }
                try {
                    if (com.autonavi.aps.amapapi.utils.k.a(aMapLocationF)) {
                        if (this.i != null) {
                            this.m = location.getTime() - this.i.getTime();
                            this.n = com.autonavi.aps.amapapi.utils.k.a(this.i, aMapLocationF);
                        }
                        synchronized (this.p) {
                            this.i = aMapLocationF.m749clone();
                        }
                        this.A = null;
                        this.C = false;
                        this.B = 0;
                    }
                } catch (Throwable th) {
                    c.a(th, "NetworkLocation", "onLocationChangedLast");
                }
                c(aMapLocationF);
            }
        } catch (Throwable th2) {
            c.a(th2, "NetworkLocation", "onLocationChanged");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            if ("network".equalsIgnoreCase(str)) {
                this.d = 0L;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i == 0) {
            try {
                this.d = 0L;
            } catch (Throwable unused) {
            }
        }
    }

    static final class a implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k f2946a;

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        a(k kVar) {
            this.f2946a = kVar;
        }

        final void a() {
            this.f2946a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                new StringBuilder("tid=").append(Thread.currentThread().getId());
                e.a();
                k kVar = this.f2946a;
                if (kVar != null) {
                    kVar.a(location);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                k kVar = this.f2946a;
                if (kVar != null) {
                    kVar.a(str);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
            try {
                k kVar = this.f2946a;
                if (kVar != null) {
                    kVar.a(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(AMapLocation aMapLocation) {
        if (com.autonavi.aps.amapapi.utils.k.a(aMapLocation)) {
            this.d = com.autonavi.aps.amapapi.utils.k.b();
            synchronized (l) {
                k = com.autonavi.aps.amapapi.utils.k.b();
                j = aMapLocation.m749clone();
            }
            this.E++;
        }
    }

    private void b(AMapLocation aMapLocation) {
        if (com.autonavi.aps.amapapi.utils.k.a(aMapLocation) && this.f2943a != null) {
            long jB = com.autonavi.aps.amapapi.utils.k.b();
            if (this.f2945c.getInterval() <= 8000 || jB - this.v > this.f2945c.getInterval() - 8000) {
                Bundle bundle = new Bundle();
                bundle.putDouble("lat", aMapLocation.getLatitude());
                bundle.putDouble("lon", aMapLocation.getLongitude());
                bundle.putFloat("radius", aMapLocation.getAccuracy());
                bundle.putLong("time", aMapLocation.getTime());
                Message messageObtain = Message.obtain();
                messageObtain.setData(bundle);
                messageObtain.what = 14;
                synchronized (this.o) {
                    if (y == null || com.autonavi.aps.amapapi.utils.k.a(aMapLocation, y) > this.h) {
                        this.f2943a.sendMessage(messageObtain);
                    }
                }
            }
        }
    }

    private void c(AMapLocation aMapLocation) {
        if (aMapLocation.getErrorCode() != 15 || AMapLocationClientOption.AMapLocationMode.Battery_Saving.equals(this.f2945c.getLocationMode())) {
            if (this.f2945c.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Battery_Saving) && this.f2945c.getDeviceModeDistanceFilter() > 0.0f) {
                d(aMapLocation);
            } else if (com.autonavi.aps.amapapi.utils.k.b() - this.v >= this.f2945c.getInterval() - 200) {
                this.v = com.autonavi.aps.amapapi.utils.k.b();
                d(aMapLocation);
            }
        }
    }

    private void d(AMapLocation aMapLocation) {
        if (this.f2943a != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = aMapLocation;
            messageObtain.what = 15;
            this.f2943a.sendMessage(messageObtain);
        }
    }

    private void e(AMapLocation aMapLocation) {
        try {
            if (c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()) && this.f2945c.isOffset()) {
                DPoint dPointA = f.a(this.z, new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                aMapLocation.setLatitude(dPointA.getLatitude());
                aMapLocation.setLongitude(dPointA.getLongitude());
                aMapLocation.setOffset(this.f2945c.isOffset());
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

    private AMapLocation f(AMapLocation aMapLocation) {
        if (!com.autonavi.aps.amapapi.utils.k.a(aMapLocation) || this.E < 3) {
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
                c.a(th2, "NetworkLocation", "setLastGeoLocation");
            }
        }
    }

    private void a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        if (aMapLocation2 == null || !this.f2945c.isNeedAddress() || com.autonavi.aps.amapapi.utils.k.a(aMapLocation, aMapLocation2) >= this.g) {
            return;
        }
        c.a(aMapLocation, aMapLocation2);
    }

    public final boolean b() {
        AMapLocationClientOption aMapLocationClientOption = this.f2945c;
        return (aMapLocationClientOption == null || aMapLocationClientOption.isOnceLocation() || com.autonavi.aps.amapapi.utils.k.b() - this.d <= 300000) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    public final AMapLocation a(AMapLocation aMapLocation, String str) {
        long j2;
        if (this.i != null && ((this.f2945c.isMockEnable() || !this.i.isMock()) && com.autonavi.aps.amapapi.utils.k.a(this.i))) {
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
            if (aMapLocation == null || !com.autonavi.aps.amapapi.utils.k.a(aMapLocation)) {
                j2 = 30000;
            } else if (aMapLocation.getAccuracy() < 200.0f) {
                int i = this.B + 1;
                this.B = i;
                if (this.A == null && i >= 2) {
                    this.C = true;
                }
                j2 = speed > 5.0f ? 10000L : C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
            } else {
                if (!TextUtils.isEmpty(this.A)) {
                    this.C = false;
                    this.B = 0;
                }
                if (speed > 5.0f) {
                    j2 = 20000;
                } else {
                    j2 = 30000;
                }
            }
            long jB = com.autonavi.aps.amapapi.utils.k.b() - this.d;
            if (jB <= 30000) {
                if (jB >= j2) {
                    if (this.C && b(str)) {
                        AMapLocation aMapLocationM749clone = this.i.m749clone();
                        aMapLocationM749clone.setTrustedLevel(3);
                        return aMapLocationM749clone;
                    }
                    this.A = null;
                    this.B = 0;
                    synchronized (this.p) {
                        this.i = null;
                    }
                    this.m = 0L;
                    this.n = 0.0f;
                    return aMapLocation;
                }
                if (this.A == null && this.B >= 2) {
                    this.A = str;
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
            ArrayList<String> arrayListB = com.autonavi.aps.amapapi.utils.k.b(str);
            ArrayList<String> arrayListB2 = com.autonavi.aps.amapapi.utils.k.b(this.A);
            if (arrayListB.size() < 8 || arrayListB2.size() < 8) {
                return false;
            }
            return com.autonavi.aps.amapapi.utils.k.a(this.A, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean c() {
        return com.autonavi.aps.amapapi.utils.k.b() - this.d <= 2800;
    }
}
