package com.huami.mifit.sportlib.locate;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.GnssStatus;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.utils.FunctionSwitcher;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class GPSLocationMonitor implements ILocationMonitor {
    private static final String q = "GPSLocationMonitor";
    private static volatile GPSLocationMonitor r = null;
    private static final float s = 0.0f;
    private static final int t = 2000;
    private static final float u = 30.0f;
    private static final int v = 3;
    private static final int w = 4;
    private static final int x = 5;
    private Context a;
    private LocationManager b;
    private long e;
    private boolean f;
    private String g;
    private SimpleDateFormat h;
    private c k;
    private c l;
    private GpsStatus.Listener m;
    private GnssStatus.Callback n;
    private PendingIntent o;
    private String c = "gps";
    private String d = "network";
    private Map<String, ILocationInfoListener> j = new ConcurrentHashMap();
    private AtomicInteger p = new AtomicInteger(0);
    private Map<String, ILocationInfoListener> i = new HashMap();

    public class a extends GnssStatus.Callback {
        public a() {
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
            super.onFirstFix(i);
        }

        @Override // android.location.GnssStatus.Callback
        @RequiresApi(api = 24)
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            super.onSatelliteStatusChanged(gnssStatus);
            int satelliteCount = gnssStatus.getSatelliteCount();
            for (int i = 0; i < satelliteCount; i++) {
                if (gnssStatus.usedInFix(i)) {
                    gnssStatus.getCn0DbHz(i);
                }
            }
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            super.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            super.onStopped();
        }
    }

    public class b implements GpsStatus.Listener {
        public b() {
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i) {
            if (i != 4) {
                return;
            }
            GpsStatus gpsStatus = GPSLocationMonitor.this.b.getGpsStatus(null);
            int maxSatellites = gpsStatus.getMaxSatellites();
            Iterator<GpsSatellite> it2 = gpsStatus.getSatellites().iterator();
            int i2 = 0;
            while (it2.hasNext() && i2 <= maxSatellites) {
                GpsSatellite next = it2.next();
                if (next.usedInFix()) {
                    i2++;
                    next.getSnr();
                }
            }
        }
    }

    public class c implements LocationListener {
        private long a;

        private c() {
            this.a = 0L;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null) {
                LogKit.w2f(GPSLocationMonitor.q, "onLocationChanged Location is null!!");
                return;
            }
            if (location.getAccuracy() >= 80.0f) {
                LogKit.w2f(GPSLocationMonitor.q, "location Accuracy:" + location.getAccuracy() + ", LOW by:" + location.getProvider());
            }
            if (location.getTime() - this.a <= 500) {
                LogKit.w2f(GPSLocationMonitor.q, "AMapLocationListener location time interval is too short curr:" + location.getTime() + ",last:" + this.a);
                return;
            }
            long time = location.getTime();
            this.a = time;
            if ((time / 1000) % 10 == 0) {
                LogKit.w2f(GPSLocationMonitor.q, "onLocationChanged location acc:" + location.getAccuracy() + ", speed:" + location.getSpeed());
            }
            if (GPSLocationMonitor.this.f) {
                String str = GPSLocationMonitor.this.h.format(new Date()) + "," + location.getProvider() + "," + location.getLatitude() + "," + location.getLongitude() + "," + location.getAltitude() + "," + location.getSpeed() + "," + location.getBearing() + "," + (location.getTime() / 1000) + "," + location.getAccuracy();
                if (Build.VERSION.SDK_INT >= 26) {
                    str = str + "," + location.getVerticalAccuracyMeters() + "," + location.getSpeedAccuracyMetersPerSecond() + "," + location.getBearingAccuracyDegrees();
                }
                LogKit.privacyLog(GPSLocationMonitor.this.g, str);
                if (!GPSLocationMonitor.this.c.equals(location.getProvider())) {
                    return;
                }
                GPSLocationMonitor.this.e++;
            }
            if (GPSLocationMonitor.this.j != null) {
                for (String str2 : GPSLocationMonitor.this.j.keySet()) {
                    ILocationInfoListener iLocationInfoListener = (ILocationInfoListener) GPSLocationMonitor.this.j.get(str2);
                    if ((location.getTime() / 1000) % 10 == 0) {
                        LogKit.w2f(GPSLocationMonitor.q, "onLocationChanged entry key:" + str2);
                    }
                    if (iLocationInfoListener != null) {
                        iLocationInfoListener.onLocationChanged(location);
                    }
                }
            }
            if (GPSLocationMonitor.this.i.get(GPSLocationMonitor.this.d) != null && GPSLocationMonitor.this.d.equals(location.getProvider())) {
                ((ILocationInfoListener) GPSLocationMonitor.this.i.get(GPSLocationMonitor.this.d)).onLocationChanged(location);
            }
            if (GPSLocationMonitor.this.i.get(GPSLocationMonitor.this.c) != null && GPSLocationMonitor.this.c.equals(location.getProvider()) && GPSLocationMonitor.this.e % 2 == 0) {
                ((ILocationInfoListener) GPSLocationMonitor.this.i.get(GPSLocationMonitor.this.c)).onLocationChanged(location);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            if (i == 0) {
                LogKit.w2f(GPSLocationMonitor.q, str + " OUT_OF_SERVICE");
                return;
            }
            if (i == 1) {
                LogKit.w2f(GPSLocationMonitor.q, str + " TEMPORARILY_UNAVAILABLE");
                return;
            }
            if (i != 2) {
                return;
            }
            LogKit.w2f(GPSLocationMonitor.q, str + " AVAILABLE");
        }
    }

    private GPSLocationMonitor(Context context) {
        this.e = 0L;
        this.f = false;
        this.a = context;
        this.f = FunctionSwitcher.isSupportRecordKeyData;
        this.e = 0L;
        this.b = (LocationManager) this.a.getSystemService("location");
        Bundle bundle = new Bundle();
        if (ContextCompat.checkSelfPermission(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            this.b.sendExtraCommand("gps", "force_xtra_injection", bundle);
            this.b.sendExtraCommand("gps", "force_time_injection", bundle);
        } else {
            LogKit.w2f(q, "NO ACCESS_FINE_LOCATION Permission to send cmd");
        }
        this.k = new c();
        this.l = new c();
        this.o = PendingIntent.getBroadcast(this.a, 0, new Intent("com.android.internal.location.ALARM_WAKEUP"), Build.VERSION.SDK_INT >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH);
    }

    public static void deinit() {
        r = null;
    }

    public static GPSLocationMonitor getDefInstance() {
        return r;
    }

    public static GPSLocationMonitor getInstance(Context context) {
        if (r == null) {
            synchronized (GPSLocationMonitor.class) {
                if (r == null) {
                    r = new GPSLocationMonitor(context);
                }
            }
        }
        return r;
    }

    public String getGPSProvider() {
        return this.c;
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public boolean hasRegisterLocationListener(@Nullable String str) {
        return this.j.containsKey(str);
    }

    public boolean isGPSProviderEnabled() {
        try {
            LocationManager locationManager = this.b;
            if (locationManager != null) {
                return locationManager.isProviderEnabled(this.c);
            }
            return false;
        } catch (Exception e) {
            LogKit.w2f(q, "isGPSProviderEnabled exception:" + e.getMessage());
            return false;
        }
    }

    public boolean isNetworkProviderEnabled() {
        LocationManager locationManager = this.b;
        if (locationManager != null) {
            return locationManager.isProviderEnabled(this.d);
        }
        return false;
    }

    @Deprecated
    public void registerGPSStatusListener() {
        if (ContextCompat.checkSelfPermission(this.a, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.n == null) {
                this.n = new a();
            }
            this.b.registerGnssStatusCallback(this.n);
        } else {
            if (this.m == null) {
                this.m = new b();
            }
            this.b.addGpsStatusListener(this.m);
        }
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public void registerLocationListener(String str, ILocationInfoListener iLocationInfoListener) {
        if (this.j.containsKey(str)) {
            throw new IllegalArgumentException("duplicate key");
        }
        this.j.put(str, iLocationInfoListener);
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public void releaseLocation() {
        int iDecrementAndGet = this.p.decrementAndGet();
        LocationManager locationManager = this.b;
        if (locationManager != null && iDecrementAndGet == 0) {
            locationManager.removeUpdates(this.k);
        }
        if (iDecrementAndGet == 0) {
            deinit();
            LogKit.w2f(q, "finally release client");
        } else {
            LogKit.w2f(q, "refcount -- not release Client,ret=" + iDecrementAndGet);
        }
    }

    public void removeGPSStatusListener() {
        if (Build.VERSION.SDK_INT >= 24) {
            GnssStatus.Callback callback = this.n;
            if (callback != null) {
                this.b.unregisterGnssStatusCallback(callback);
                return;
            }
            return;
        }
        GpsStatus.Listener listener = this.m;
        if (listener != null) {
            this.b.removeGpsStatusListener(listener);
        }
    }

    @Deprecated
    public void requestGPSLocation(ILocationInfoListener iLocationInfoListener) {
        if (ContextCompat.checkSelfPermission(this.a, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            LogKit.w2f(q, "NO ACCESS_FINE_LOCATION Permission");
            return;
        }
        LogKit.w2f(q, "try to requestGPSLocation");
        if (this.i.containsKey(this.c)) {
            throw new IllegalArgumentException("duplicate key gps");
        }
        this.i.put(this.c, iLocationInfoListener);
        int i = 2000;
        if (this.f) {
            i = 1000;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TrainingDateUtils.PATTERN_YMD_HMSS, Locale.ENGLISH);
            this.h = simpleDateFormat;
            String str = simpleDateFormat.format(new Date());
            this.g = str;
            LogKit.privacyLog(str, "phoneTime,provider,latitude,longitude,altitude,speed,course,timestamp,horizontalAccuracy,verticalAccuracy,speedAccuracy,courseAccuracy");
        }
        this.b.requestLocationUpdates(this.c, i, 0.0f, this.k);
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public void requestLocation() {
        if (ContextCompat.checkSelfPermission(this.a, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            LogKit.w2f(q, "NO ACCESS_FINE_LOCATION Permission");
            return;
        }
        LogKit.w2f(q, "try to requestGPSLocation");
        if (this.f) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TrainingDateUtils.PATTERN_YMD_HMSS, Locale.ENGLISH);
            this.h = simpleDateFormat;
            String str = simpleDateFormat.format(new Date());
            this.g = str;
            LogKit.privacyLog(str, "phoneTime,provider,latitude,longitude,altitude,speed,course,timestamp,horizontalAccuracy,verticalAccuracy,speedAccuracy,courseAccuracy");
        }
        if (this.p.incrementAndGet() <= 1) {
            this.b.requestLocationUpdates(this.c, 1000, 0.0f, this.k, Looper.getMainLooper());
            return;
        }
        LogKit.w2f(q, "needn't request again refcount:" + this.p.intValue());
    }

    public void requestNetworkLocation(ILocationInfoListener iLocationInfoListener) {
        if (ContextCompat.checkSelfPermission(this.a, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            return;
        }
        LogKit.w2f(q, "try to requestNetworkLocation");
        if (this.i.containsKey(this.d)) {
            throw new IllegalArgumentException("duplicate key network");
        }
        this.i.put(this.d, iLocationInfoListener);
        this.b.requestLocationUpdates(this.d, this.f ? 1000 : 2000, 0.0f, this.l);
    }

    public void sendWakeupIntent() {
        if (this.o != null) {
            try {
                LogKit.w2f(q, "try to sendWakeupIntent");
                this.o.send();
            } catch (PendingIntent.CanceledException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.huami.mifit.sportlib.locate.ILocationMonitor
    public void unregisterLocationListener(String str) {
        if (!this.j.containsKey(str)) {
            throw new IllegalArgumentException("no existed key");
        }
        this.j.remove(str);
    }
}
