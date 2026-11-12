package defpackage;

import android.content.Context;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlocationmgr.model.IGpsStatusCallback;
import com.huawei.hwlocationmgr.model.ILoactionCallback;
import com.huawei.hwlocationmgr.model.IOriginalGpsStatusListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes11.dex */
public class npq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f43413a = new Object();
    private static npq e;
    private Object aa;
    private String ab;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f43414b;
    private HandlerThread g;
    private boolean i;
    private d o;
    private LocationManager t;
    private Runnable v;
    private StorageParams z;
    private long y = 2000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f43415c = 1000;
    private float u = 0.0f;
    private long x = 0;
    private float w = 0.0f;
    private boolean j = true;
    private boolean k = false;
    private LocationListener d = null;
    private LocationListener r = null;
    private LocationListener q = null;
    private ConcurrentHashMap<String, e> p = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, c> f = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, a> s = new ConcurrentHashMap<>();
    private boolean m = false;
    private int h = 3;
    private Location l = null;
    private long n = 0;
    private List<npm> ac = new ArrayList(10);

    private npq(Context context) {
        this.g = null;
        this.o = null;
        this.f43414b = context;
        if (this.g == null) {
            HandlerThread handlerThread = new HandlerThread("Track_LocationManagerUtils");
            this.g = handlerThread;
            handlerThread.start();
        }
        if (this.o == null) {
            this.o = new d(this.g.getLooper());
        }
        j();
        g();
        h();
    }

    public static npq e(Context context) {
        npq npqVar;
        synchronized (f43413a) {
            npq npqVar2 = e;
            if (npqVar2 == null) {
                e = new npq(context);
            } else {
                npqVar2.e();
            }
            npqVar = e;
        }
        return npqVar;
    }

    public void e() {
        if (this.m) {
            return;
        }
        j();
        f();
    }

    /* JADX INFO: renamed from: npq$2, reason: invalid class name */
    class AnonymousClass2 implements GpsStatus.Listener {
        final /* synthetic */ npq d;

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i) {
            this.d.b(i);
        }
    }

    private void h() {
        this.aa = new GnssStatus.Callback() { // from class: npq.1
            @Override // android.location.GnssStatus.Callback
            public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
                super.onSatelliteStatusChanged(gnssStatus);
                if (npq.this.t != null) {
                    npf npfVarD = npn.d(gnssStatus);
                    npq.this.a(gnssStatus);
                    if (npfVarD != null) {
                        npq.this.d(npn.c(npfVarD));
                        LogUtil.d("Track_LocationManagerUtils", "test GPS Signal GPS_EVENT_SATELLITE_STATUS ", npfVarD.toString());
                    } else {
                        npq.this.d(1);
                        LogUtil.d("Track_LocationManagerUtils", "test GPS Signal GPS_EVENT_SATELLITE_STATUS GPS_STATE_OUT_OF_SERVICE");
                    }
                }
            }

            @Override // android.location.GnssStatus.Callback
            public void onStarted() {
                LogUtil.d("Track_LocationManagerUtils", "test GPS Signal GPS_EVENT_STARTED");
                npq.this.d(2);
                npq.this.e(3);
            }

            @Override // android.location.GnssStatus.Callback
            public void onStopped() {
                LogUtil.d("Track_LocationManagerUtils", "test GPS Signal GPS_EVENT_STOPPED");
                if (npq.this.f43414b == null || npn.c(npq.this.f43414b)) {
                    return;
                }
                npq.this.d(0);
                npq.this.e(0);
            }

            @Override // android.location.GnssStatus.Callback
            public void onFirstFix(int i) {
                LogUtil.d("Track_LocationManagerUtils", "test GPS Signal GPS_EVENT_FIRST_FIX");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        LocationManager locationManager;
        if (i == 1) {
            LogUtil.d("Track_LocationManagerUtils", "test GPS Signal GPS_EVENT_STARTED");
            d(2);
            e(3);
            return;
        }
        if (i == 2) {
            LogUtil.d("Track_LocationManagerUtils", "test GPS Signal GPS_EVENT_STOPPED");
            Context context = this.f43414b;
            if (context == null || npn.c(context)) {
                return;
            }
            d(0);
            e(0);
            return;
        }
        if (i == 3) {
            LogUtil.d("Track_LocationManagerUtils", "test GPS Signal GPS_EVENT_FIRST_FIX");
            return;
        }
        if (i == 4 && (locationManager = this.t) != null) {
            GpsStatus gpsStatus = locationManager.getGpsStatus(null);
            npf npfVarB = npn.b(gpsStatus);
            a(gpsStatus);
            if (npfVarB != null) {
                d(npn.c(npfVarB));
                LogUtil.d("Track_LocationManagerUtils", "test GPS Signal GPS_EVENT_SATELLITE_STATUS ", npfVarB.toString());
            } else {
                d(1);
                LogUtil.d("Track_LocationManagerUtils", "test GPS Signal GPS_EVENT_SATELLITE_STATUS GPS_STATE_OUT_OF_SERVICE");
            }
        }
    }

    private void g() {
        this.ab = Integer.toString(20002);
        StorageParams storageParams = new StorageParams();
        this.z = storageParams;
        storageParams.e(0);
        f();
    }

    private void f() {
        String strE = SharedPreferenceManager.e(this.f43414b, this.ab, "min_location_request_interval_time");
        this.y = 2000L;
        if (strE != null && !strE.isEmpty()) {
            this.y = CommonUtil.i(strE);
        }
        this.u = 0.0f;
        String strE2 = SharedPreferenceManager.e(this.f43414b, this.ab, "min_location_request_interval_distance");
        if (strE2 != null && !strE2.isEmpty()) {
            this.u = CommonUtil.f(strE2);
        }
        ReleaseLogUtil.d("Track_LocationManagerUtils", "mRequestMinTime :", Long.valueOf(this.y), " -- mRequestMinDistance :", Float.valueOf(this.u));
    }

    public boolean b() {
        return this.m;
    }

    public void d() {
        d dVar = this.o;
        if (dVar != null) {
            dVar.sendEmptyMessage(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        Context context;
        if (this.i) {
            return;
        }
        if (this.t == null && (context = this.f43414b) != null) {
            if (context.getSystemService("location") instanceof LocationManager) {
                this.t = (LocationManager) this.f43414b.getSystemService("location");
            } else {
                ReleaseLogUtil.e("Track_LocationManagerUtils", "get LocationService failed");
                return;
            }
        }
        if (ActivityCompat.checkSelfPermission(BaseApplication.b(), "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(BaseApplication.b(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            ReleaseLogUtil.d("Track_LocationManagerUtils", "changeLocationRequestTime ,mTime:", Long.valueOf(j));
            if (this.m && this.d != null) {
                ReleaseLogUtil.d("Track_LocationManagerUtils", "changeLocationRequestTime mIsRequestLocation is true");
                LocationManager locationManager = this.t;
                if (locationManager != null) {
                    locationManager.requestLocationUpdates(GeocodeSearch.GPS, j, this.u, this.d);
                }
            }
            this.y = j;
            this.j = false;
        }
    }

    public void c(ILoactionCallback iLoactionCallback, String str) {
        ReleaseLogUtil.d("R_Track_LocationManagerUtils", "regLocationListener keyName: ", str);
        if (!i()) {
            ReleaseLogUtil.e("R_Track_LocationManagerUtils", "regLocationListener checkSelfPermission is false");
            return;
        }
        if (this.o != null && !this.p.containsKey(str)) {
            this.p.putIfAbsent(str, new e(System.currentTimeMillis(), iLoactionCallback));
            if (!this.m) {
                this.o.sendEmptyMessage(1);
                this.m = true;
                ReleaseLogUtil.d("R_Track_LocationManagerUtils", "regLocationListener REQUEST_LOCATION.");
                return;
            } else {
                if (this.l != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = this.n;
                    if (jCurrentTimeMillis - j < 60000) {
                        ReleaseLogUtil.d("R_Track_LocationManagerUtils", "regLocationListener mLastLocationTimeL: ", Long.valueOf(j));
                        d(this.l);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        ReleaseLogUtil.e("R_Track_LocationManagerUtils", "regLocationListener not containsKey.");
    }

    public void c(String str) {
        ReleaseLogUtil.d("Track_LocationManagerUtils", "unregLocationListener, keyName: ", str);
        if (this.p.containsKey(str)) {
            this.p.remove(str);
            if (m()) {
                this.o.sendEmptyMessage(2);
                return;
            }
            return;
        }
        ReleaseLogUtil.e("Track_LocationManagerUtils", str, " is not exist, cannot Deregister");
    }

    public void c(IGpsStatusCallback iGpsStatusCallback, String str) {
        ReleaseLogUtil.d("Track_LocationManagerUtils", "regGpsStatusListener, keyName: ", str);
        if (!i() || this.o == null || this.f.containsKey(str)) {
            return;
        }
        this.f.putIfAbsent(str, new c(System.currentTimeMillis(), iGpsStatusCallback));
        if (this.m) {
            return;
        }
        this.o.sendEmptyMessage(1);
        this.m = true;
    }

    public void b(String str) {
        ReleaseLogUtil.d("Track_LocationManagerUtils", "unRegGpsStatusListener, keyName: ", str);
        if (this.f.containsKey(str)) {
            this.f.remove(str);
            if (m()) {
                this.o.sendEmptyMessage(2);
            }
        }
    }

    public void d(IOriginalGpsStatusListener iOriginalGpsStatusListener, String str) {
        ReleaseLogUtil.d("Track_LocationManagerUtils", "regOriginalGpsStatusListener, keyName: ", str);
        if (!i() || this.o == null || this.s.containsKey(str)) {
            return;
        }
        this.s.putIfAbsent(str, new a(System.currentTimeMillis(), iOriginalGpsStatusListener));
        if (this.m) {
            return;
        }
        this.o.sendEmptyMessage(1);
        this.m = true;
    }

    public void a(String str) {
        ReleaseLogUtil.d("Track_LocationManagerUtils", "unRegOriginalGpsStatusListener, keyName: ", str);
        if (this.s.containsKey(str)) {
            this.s.remove(str);
            if (m()) {
                this.o.sendEmptyMessage(2);
            }
        }
    }

    public void b(boolean z) {
        this.k = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Location location) {
        if (location == null) {
            ReleaseLogUtil.e("R_Track_LocationManagerUtils", "updateLocation location null");
            return;
        }
        ConcurrentHashMap<String, e> concurrentHashMap = this.p;
        if (concurrentHashMap == null) {
            ReleaseLogUtil.e("R_Track_LocationManagerUtils", "updateLocation mLocationsCallbackMapList null");
            return;
        }
        for (e eVar : concurrentHashMap.values()) {
            if (eVar == null) {
                ReleaseLogUtil.e("R_Track_LocationManagerUtils", "partLocation is null");
            } else {
                ILoactionCallback iLoactionCallbackA = eVar.a();
                if (iLoactionCallbackA != null) {
                    ReleaseLogUtil.e("R_Track_LocationManagerUtils", "updateLocation dispatchLocationChanged.");
                    iLoactionCallbackA.dispatchLocationChanged(location);
                } else {
                    ReleaseLogUtil.e("R_Track_LocationManagerUtils", "locationCallback is null");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ReleaseLogUtil.d("R_Track_LocationManagerUtils", "regMyLocationListener.");
        Context context = this.f43414b;
        if (context == null) {
            return;
        }
        if (context.getSystemService("location") instanceof LocationManager) {
            this.t = (LocationManager) this.f43414b.getSystemService("location");
            o();
            if (this.k) {
                return;
            }
            p();
            return;
        }
        ReleaseLogUtil.e("R_Track_LocationManagerUtils", "regMyLocationListener get PartLocation Service");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Context context;
        LogUtil.a("Track_LocationManagerUtils", " requestMockLocation.");
        if (this.t == null && (context = this.f43414b) != null) {
            if (context.getSystemService("location") instanceof LocationManager) {
                this.t = (LocationManager) this.f43414b.getSystemService("location");
            } else {
                LogUtil.a("Track_LocationManagerUtils", "requestMockLocation get PartLocation Service failed");
                return;
            }
        }
        if (this.t == null) {
            return;
        }
        this.q = new b(this, null);
        if (this.t.isProviderEnabled("GpsMockProvider")) {
            this.t.requestLocationUpdates("GpsMockProvider", this.x, this.w, this.q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.t == null) {
            ReleaseLogUtil.e("Track_LocationManagerUtils", "mMyLocationManager is null");
            return;
        }
        t();
        r();
        this.t = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.t == null) {
            return;
        }
        q();
        this.t = null;
    }

    private void o() {
        try {
            this.d = new b(this, null);
            if (this.j) {
                ReleaseLogUtil.d("R_Track_LocationManagerUtils", "startGpsLocation FirstRequest");
                this.t.requestLocationUpdates(GeocodeSearch.GPS, this.f43415c, this.u, this.d);
            } else {
                ReleaseLogUtil.d("R_Track_LocationManagerUtils", "startGpsLocation requestLocationUpdates");
                this.t.requestLocationUpdates(GeocodeSearch.GPS, this.y, this.u, this.d);
            }
            Object obj = this.aa;
            if (obj instanceof GnssStatus.Callback) {
                this.t.registerGnssStatusCallback((GnssStatus.Callback) obj);
            }
        } catch (Exception unused) {
            ReleaseLogUtil.a("R_Track_LocationManagerUtils", "Exception: provider doesn't exist: GPS");
        }
    }

    private void p() {
        ReleaseLogUtil.d("R_Track_LocationManagerUtils", "startNetworkLocation");
        try {
            b bVar = new b(this, null);
            this.r = bVar;
            this.t.requestLocationUpdates("network", this.y, this.u, bVar);
        } catch (Exception unused) {
            ReleaseLogUtil.a("R_Track_LocationManagerUtils", "Exception: provider doesn't exist: network");
        }
    }

    private void t() {
        if (this.d == null) {
            ReleaseLogUtil.e("Track_LocationManagerUtils", " stopGpsLocation mGpsListener is null");
            return;
        }
        ReleaseLogUtil.d("Track_LocationManagerUtils", " stopGpsLocation removeUpdates");
        this.t.removeUpdates(this.d);
        Object obj = this.aa;
        if (obj instanceof GnssStatus.Callback) {
            this.t.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
        this.d = null;
    }

    private void q() {
        if (this.q == null) {
            return;
        }
        LogUtil.a("Track_LocationManagerUtils", " stopMockLocation removeUpdates");
        this.t.removeUpdates(this.q);
        this.q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.r == null) {
            ReleaseLogUtil.e("Track_LocationManagerUtils", "mNetworkListener is null");
            return;
        }
        ReleaseLogUtil.d("Track_LocationManagerUtils", " stopNetworkLocation removeUpdates");
        this.t.removeUpdates(this.r);
        this.r = null;
    }

    public Location c(List<String> list) {
        Location lastKnownLocation = null;
        if (this.t == null && this.f43414b != null) {
            ReleaseLogUtil.e("Track_LocationManagerUtils", "mMyLocationManager is null");
            if (this.f43414b.getSystemService("location") instanceof LocationManager) {
                this.t = (LocationManager) this.f43414b.getSystemService("location");
            } else {
                ReleaseLogUtil.e("Track_LocationManagerUtils", "getLastKnownLocation get PartLocation Service failed");
                return null;
            }
        }
        if (!i()) {
            ReleaseLogUtil.e("Track_LocationManagerUtils", "don't have location permission");
            return null;
        }
        try {
            if (njy.e(list)) {
                LocationManager locationManager = this.t;
                if (locationManager != null) {
                    for (String str : locationManager.getProviders(true)) {
                        lastKnownLocation = this.t.getLastKnownLocation(str);
                        if (lastKnownLocation != null) {
                            ReleaseLogUtil.d("Track_LocationManagerUtils", "The provider is ", str);
                            return lastKnownLocation;
                        }
                    }
                }
            } else {
                for (String str2 : list) {
                    LocationManager locationManager2 = this.t;
                    if (locationManager2 != null) {
                        lastKnownLocation = locationManager2.getLastKnownLocation(str2);
                    }
                    if (lastKnownLocation != null) {
                        ReleaseLogUtil.d("Track_LocationManagerUtils", "The provider is ", str2);
                        return lastKnownLocation;
                    }
                }
            }
        } catch (IllegalArgumentException unused) {
            ReleaseLogUtil.e("Track_LocationManagerUtils", "IllegalArgumentException happen : provider is null or not exist");
        } catch (NullPointerException unused2) {
            ReleaseLogUtil.e("Track_LocationManagerUtils", "NullPointerException happen");
        }
        ReleaseLogUtil.e("Track_LocationManagerUtils", "lastKnownLocation is null");
        return lastKnownLocation;
    }

    public Location c() {
        return this.l;
    }

    private boolean i() {
        Context context = this.f43414b;
        if (context == null) {
            ReleaseLogUtil.e("Track_LocationManagerUtils", "checkSelfPermission(), mContext is null");
            return false;
        }
        if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 && ActivityCompat.checkSelfPermission(this.f43414b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return true;
        }
        ReleaseLogUtil.e("Track_LocationManagerUtils", "checkSelfPermission is false");
        return false;
    }

    private void j() {
        Context context;
        if (this.t == null && (context = this.f43414b) != null) {
            if (!(context.getSystemService("location") instanceof LocationManager)) {
                return;
            } else {
                this.t = (LocationManager) this.f43414b.getSystemService("location");
            }
        }
        LocationManager locationManager = this.t;
        if (locationManager == null) {
            return;
        }
        boolean zIsProviderEnabled = locationManager.isProviderEnabled("GpsMockProvider");
        this.i = zIsProviderEnabled;
        LogUtil.a("Track_LocationManagerUtils", " checkMockProvider mIsMocking:", Boolean.valueOf(zIsProviderEnabled));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        IGpsStatusCallback iGpsStatusCallbackB;
        this.h = i;
        ConcurrentHashMap<String, c> concurrentHashMap = this.f;
        if (concurrentHashMap == null) {
            return;
        }
        for (c cVar : concurrentHashMap.values()) {
            if (cVar != null && (iGpsStatusCallbackB = cVar.b()) != null) {
                iGpsStatusCallbackB.updateGpsStatus(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(GnssStatus gnssStatus) {
        IOriginalGpsStatusListener iOriginalGpsStatusListenerB;
        ConcurrentHashMap<String, a> concurrentHashMap = this.s;
        if (concurrentHashMap == null) {
            return;
        }
        for (a aVar : concurrentHashMap.values()) {
            if (aVar != null && (iOriginalGpsStatusListenerB = aVar.b()) != null) {
                iOriginalGpsStatusListenerB.updateGnssStatus(gnssStatus);
            }
        }
    }

    private void a(GpsStatus gpsStatus) {
        IOriginalGpsStatusListener iOriginalGpsStatusListenerB;
        ConcurrentHashMap<String, a> concurrentHashMap = this.s;
        if (concurrentHashMap == null) {
            return;
        }
        for (a aVar : concurrentHashMap.values()) {
            if (aVar != null && (iOriginalGpsStatusListenerB = aVar.b()) != null) {
                iOriginalGpsStatusListenerB.updateGpsStatus(gpsStatus);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        IOriginalGpsStatusListener iOriginalGpsStatusListenerB;
        ConcurrentHashMap<String, a> concurrentHashMap = this.s;
        if (concurrentHashMap == null) {
            return;
        }
        for (a aVar : concurrentHashMap.values()) {
            if (aVar != null && (iOriginalGpsStatusListenerB = aVar.b()) != null) {
                iOriginalGpsStatusListenerB.updateGpsStatus(i);
            }
        }
    }

    private boolean m() {
        boolean z = this.o == null;
        ReleaseLogUtil.d("Track_LocationManagerUtils", "mLocationHandler is ", !z ? "not null" : Constants.NULL);
        b(this.p, this.f, this.s);
        if (!z) {
            if (this.p.size() + this.f.size() + this.s.size() == 0) {
                return true;
            }
        }
        return false;
    }

    private void b(ConcurrentHashMap<String, e> concurrentHashMap, ConcurrentHashMap<String, c> concurrentHashMap2, ConcurrentHashMap<String, a> concurrentHashMap3) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<String, e> entry : concurrentHashMap.entrySet()) {
            sb.append("{ keyName = ");
            sb.append(entry.getKey());
            sb.append(", ");
            sb.append(entry.getValue().toString());
            sb.append(" }");
        }
        ReleaseLogUtil.d("Track_LocationManagerUtils", "mLocationsCallbackMapList = {", sb.toString(), "}");
        for (Map.Entry<String, c> entry2 : concurrentHashMap2.entrySet()) {
            sb2.append("{ keyName = ");
            sb2.append(entry2.getKey());
            sb2.append(", ");
            sb2.append(entry2.getValue().toString());
            sb2.append(" }");
        }
        ReleaseLogUtil.d("Track_LocationManagerUtils", "mGpsStatusCallbackMapList = {", sb2.toString(), "}");
        for (Map.Entry<String, a> entry3 : concurrentHashMap3.entrySet()) {
            sb3.append("{ keyName = ");
            sb3.append(entry3.getKey());
            sb3.append(", ");
            sb3.append(entry3.getValue().toString());
            sb3.append("}");
        }
        ReleaseLogUtil.d("Track_LocationManagerUtils", "mOriginalGpsStatusListenerMapList = {", sb3.toString(), " }");
    }

    public int a() {
        if (b()) {
            return this.h;
        }
        return 3;
    }

    public boolean c(String str, String str2, Bundle bundle) {
        if (!i()) {
            ReleaseLogUtil.d("Track_LocationManagerUtils", "checkSelfPermission false");
            return false;
        }
        if (this.t == null && this.f43414b != null) {
            ReleaseLogUtil.e("Track_LocationManagerUtils", "mMyLocationManager is null");
            if (this.f43414b.getSystemService("location") instanceof LocationManager) {
                this.t = (LocationManager) this.f43414b.getSystemService("location");
            } else {
                ReleaseLogUtil.e("Track_LocationManagerUtils", "sendExtraCommand  get PartLocation Service failed");
                return false;
            }
        }
        LocationManager locationManager = this.t;
        if (locationManager == null) {
            ReleaseLogUtil.e("Track_LocationManagerUtils", "sendExtraCommand  get PartLocation Service failed");
            return false;
        }
        return locationManager.sendExtraCommand(str, str2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        ReleaseLogUtil.d("Track_LocationManagerUtils", "startPrintKeyName");
        if (this.v == null) {
            this.v = new Runnable() { // from class: npq.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        npq.this.l();
                    } catch (Exception e2) {
                        ReleaseLogUtil.a("Track_LocationManagerUtils", "startPrintKeyName exception is  ", ExceptionUtils.c(e2));
                    }
                    if (npq.this.o != null) {
                        npq.this.o.postDelayed(this, 1800000L);
                    }
                }
            };
        }
        d dVar = this.o;
        if (dVar != null) {
            dVar.postDelayed(this.v, 1800000L);
            ReleaseLogUtil.d("Track_LocationManagerUtils", "startPrintKeyName success");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        LogUtil.a("Track_LocationManagerUtils", "mLocationsCallbackMapList.size() is ", Integer.valueOf(this.p.size()), ", mGpsStatusCallbackMapList.size() is ", Integer.valueOf(this.f.size()), ", mOriginalGpsStatusListenerMapList.size() is  ", Integer.valueOf(this.s.size()));
        if (this.p.size() > 0) {
            this.p.forEach(1L, new BiConsumer<String, e>() { // from class: npq.5
                @Override // java.util.function.BiConsumer
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void accept(String str, e eVar) {
                    LogUtil.a("Track_LocationManagerUtils", "mLocationsCallbackMapList key is ", str, ", and mTime is ", Long.valueOf(eVar != null ? eVar.b() : 0L));
                }
            });
        }
        if (this.f.size() > 0) {
            this.f.forEach(1L, new BiConsumer<String, c>() { // from class: npq.3
                @Override // java.util.function.BiConsumer
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void accept(String str, c cVar) {
                    LogUtil.a("Track_LocationManagerUtils", "mGpsStatusCallbackMapList key is ", str, ", and mTime is ", Long.valueOf(cVar != null ? cVar.c() : 0L));
                }
            });
        }
        if (this.s.size() > 0) {
            this.s.forEach(1L, new BiConsumer<String, a>() { // from class: npq.6
                @Override // java.util.function.BiConsumer
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void accept(String str, a aVar) {
                    LogUtil.a("Track_LocationManagerUtils", "mOriginalGpsStatusListenerMapList key is ", str, ",mTime is ", Long.valueOf(aVar != null ? aVar.a() : 0L));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        d dVar;
        ReleaseLogUtil.d("Track_LocationManagerUtils", "stopPrintKey");
        Runnable runnable = this.v;
        if (runnable == null || (dVar = this.o) == null) {
            return;
        }
        dVar.removeCallbacks(runnable);
        ReleaseLogUtil.d("Track_LocationManagerUtils", "stopPrintKey success");
    }

    static class e {
        private long d;
        private ILoactionCallback e;

        e(long j, ILoactionCallback iLoactionCallback) {
            this.d = j;
            this.e = iLoactionCallback;
        }

        public long b() {
            return this.d;
        }

        public ILoactionCallback a() {
            return this.e;
        }

        public String toString() {
            return "registerTime = " + this.d;
        }
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IGpsStatusCallback f43423b;
        private long d;

        c(long j, IGpsStatusCallback iGpsStatusCallback) {
            this.d = j;
            this.f43423b = iGpsStatusCallback;
        }

        public long c() {
            return this.d;
        }

        public IGpsStatusCallback b() {
            return this.f43423b;
        }

        public String toString() {
            return "registerTime = " + this.d;
        }
    }

    static class a {
        private IOriginalGpsStatusListener d;
        private long e;

        a(long j, IOriginalGpsStatusListener iOriginalGpsStatusListener) {
            this.e = j;
            this.d = iOriginalGpsStatusListener;
        }

        public long a() {
            return this.e;
        }

        public IOriginalGpsStatusListener b() {
            return this.d;
        }

        public String toString() {
            return "registerTime = " + this.e;
        }
    }

    class d extends Handler {
        d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                String strB = SharedPreferenceManager.b("privacy_center", "geo_location", "");
                if (!TextUtils.isEmpty(strB)) {
                    npq.this.ac.clear();
                    for (String str : strB.split("_")[0].split(";")) {
                        String[] strArrSplit = str.split(",");
                        npm npmVar = new npm(Double.parseDouble(strArrSplit[0]), Double.parseDouble(strArrSplit[1]), Double.parseDouble(strArrSplit[2]));
                        if (npq.this.ac.size() >= 10) {
                            npq.this.ac.remove(0);
                        }
                        npq.this.ac.add(npmVar);
                    }
                }
                ReleaseLogUtil.d("R_Track_LocationManagerUtils", "begin to request location mIsMocking=", Boolean.valueOf(npq.this.i));
                if (npq.this.i) {
                    npq.this.k();
                } else {
                    npq.this.n();
                }
                npq.this.s();
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ReleaseLogUtil.d("Track_LocationManagerUtils", "change location request time");
                npq npqVar = npq.this;
                npqVar.b(npqVar.y);
                return;
            }
            ReleaseLogUtil.d("Track_LocationManagerUtils", "cancel requesting location");
            StringBuilder sb = new StringBuilder(16);
            if (!npq.this.ac.isEmpty()) {
                for (npm npmVar2 : npq.this.ac) {
                    sb.append(npmVar2.b());
                    sb.append(",");
                    sb.append(npmVar2.e());
                    sb.append(",");
                    sb.append(npmVar2.d());
                    sb.append(";");
                }
                SharedPreferenceManager.c("privacy_center", "geo_location", sb.substring(0, sb.length() - 1) + "_" + System.currentTimeMillis());
            }
            if (npq.this.i) {
                npq.this.u();
            } else {
                npq.this.w();
            }
            npq.this.j = true;
            npq.this.k = false;
            npq.this.y = 2000L;
            npq.this.m = false;
            npq.this.y();
        }
    }

    class b implements LocationListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f43421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f43422c;
        private int d;

        private b() {
            this.f43422c = false;
            this.f43421b = 0L;
            this.d = 0;
        }

        /* synthetic */ b(npq npqVar, AnonymousClass2 anonymousClass2) {
            this();
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            npm npmVar = new npm(location.getLongitude(), location.getLatitude(), location.getAltitude());
            ReleaseLogUtil.d("R_Track_LocationManagerUtils", "MyLocationListener simpleLocation size=", Integer.valueOf(npq.this.ac.size()));
            if (npq.this.ac.size() >= 10) {
                npq.this.ac.remove(0);
            }
            npq.this.ac.add(npmVar);
            npq.this.d(location);
            npq.this.l = location;
            npq.this.n = System.currentTimeMillis();
            if (location != null && !this.f43422c && location.getProvider().equals(GeocodeSearch.GPS) && location.getAccuracy() <= 35.0f) {
                ReleaseLogUtil.d("R_Track_LocationManagerUtils", " stop network location!");
                npq.this.r();
                this.f43422c = true;
                npq.this.k = true;
            }
            if (location == null) {
                ReleaseLogUtil.e("Track_LocationManagerUtils", "MyLocationListener onLocationChanged location null");
            } else {
                c();
            }
        }

        private void c() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = this.d;
            if (i == 0) {
                this.f43421b = jCurrentTimeMillis;
            }
            int i2 = i + 1;
            this.d = i2;
            if (jCurrentTimeMillis - this.f43421b >= 60000) {
                ReleaseLogUtil.d("Track_LocationManagerUtils", "gpsLocationSizePrint onLocationChanged ", Integer.valueOf(i2));
                this.d = 0;
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            LogUtil.a("Track_LocationManagerUtils", "MyLocationListener onProviderDisabled provider=", str);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            LogUtil.a("Track_LocationManagerUtils", "MyLocationListener onProviderEnabled provider=", str);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            ReleaseLogUtil.d("Track_LocationManagerUtils", "MyLocationListener onStatusChanged ", Integer.valueOf(i));
        }
    }
}
