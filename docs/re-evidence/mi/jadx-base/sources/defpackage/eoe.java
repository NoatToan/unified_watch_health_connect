package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.utils.GnssStatusCompat;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class eoe implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yyc f16876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f16877b;
    public final long c;
    public boolean d;
    public int e;
    public Handler f;
    public long g;
    public int h;
    public int i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LocationListener f16878k;
    public GpsStatus.Listener l;

    public class a implements LocationListener {
        public a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            int i = com.xiaomi.fit.data.common.data.sport.Location.LOCATION_TYPE_WIFI;
            int accuracyStatus = TextUtils.equals(location.getProvider(), "gps") ? GnssStatusCompat.INSTANCE.getAccuracyStatus() : 0;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            com.xiaomi.fit.data.common.data.sport.Location location2 = new com.xiaomi.fit.data.common.data.sport.Location();
            location2.latitude = location.getLatitude();
            location2.longitude = location.getLongitude();
            location2.timeStamp = seconds;
            location2.altitude = location.getAltitude();
            location2.speed = location.getSpeed();
            location2.time = location.getTime();
            location2.bearing = location.getBearing();
            location2.horizontalAccuracy = location.getAccuracy();
            location2.locationType = i;
            location2.verticalAccuracy = location.getVerticalAccuracyMeters();
            eoe.this.h(new SportLocationResult.a(seconds).i(accuracyStatus).j(location2).k(0).g());
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            FitnessLogUtils.i("LocationSignalManager", "onProviderDisabled " + str);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            FitnessLogUtils.i("LocationSignalManager", "onProviderEnabled " + str);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            eoe eoeVar = eoe.this;
            int iG = eoeVar.g(eoeVar.f16877b);
            FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
            FitnessLogUtils.i("LocationSignalManager", "provider = " + str + ", status = " + eoe.this.f(i) + ", gpsSatelliteCount = " + iG);
            if (i != 2) {
                String str2 = str + ", status = " + eoe.this.f(i);
                long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                new com.xiaomi.fit.data.common.data.sport.Location();
                eoe.this.h(new SportLocationResult.a(seconds).i(e3b.c(iG)).h(i, str2).k(iG).g());
            }
        }
    }

    public class b implements GpsStatus.Listener {
        public b() {
        }

        @Override // android.location.GpsStatus.Listener
        @SuppressLint({"MissingPermission"})
        public void onGpsStatusChanged(int i) {
            if (eoe.this.f16877b == null) {
                return;
            }
            if (i == 1) {
                FitnessLogUtils.i("LocationSignalManager", "GpsLocation | status started ");
            } else if (i == 2) {
                FitnessLogUtils.i("LocationSignalManager", "GpsLocation | status stopped ");
            } else {
                if (i != 3) {
                    return;
                }
                FitnessLogUtils.i("LocationSignalManager", "GpsLocation | first fix");
            }
        }
    }

    public eoe(Context context, long j, yyc yycVar) {
        this.e = (int) TimeUnit.SECONDS.toMillis(15L);
        this.f = new Handler(Looper.getMainLooper(), this);
        this.g = 0L;
        this.h = 4000;
        this.i = 1;
        this.j = false;
        this.f16878k = new a();
        this.l = new b();
        this.f16876a = yycVar;
        this.c = j;
        this.f16877b = (LocationManager) context.getSystemService("location");
    }

    public void e() {
        k();
        this.f16876a = null;
    }

    public final String f(int i) {
        if (i == 0) {
            return "out of service";
        }
        if (i != 1) {
            return i != 2 ? "unknown" : "available";
        }
        return "temporarily unavailable";
    }

    @SuppressLint({"MissingPermission"})
    public final int g(LocationManager locationManager) {
        int i = 0;
        if (locationManager == null) {
            FitnessLogUtils.w("LocationSignalManager", "locationManager is null");
            return 0;
        }
        GpsStatus gpsStatus = locationManager.getGpsStatus(null);
        int maxSatellites = gpsStatus.getMaxSatellites();
        Iterator<GpsSatellite> it = gpsStatus.getSatellites().iterator();
        while (it.hasNext() && i <= maxSatellites) {
            if (it.next().usedInFix()) {
                i++;
            }
        }
        return i;
    }

    public final void h(SportLocationResult sportLocationResult) {
        this.j = true;
        FitnessLogUtils.d("LocationSignalManager", "notifyLocationChanged , result:" + sportLocationResult);
        yyc yycVar = this.f16876a;
        if (yycVar != null) {
            yycVar.onLocationChanged(sportLocationResult);
        }
        this.g = System.currentTimeMillis();
        this.f.sendEmptyMessageDelayed(this.i, this.h);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != this.i) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.g;
        FitnessLogUtils.d("LocationSignalManager", "locationChangedTime:" + jCurrentTimeMillis);
        if (jCurrentTimeMillis < 3000) {
            return false;
        }
        i();
        this.f.removeMessages(this.i);
        return false;
    }

    public final void i() {
        FitnessLogUtils.d("LocationSignalManager", "mListener:" + this.f16876a);
        if (this.f16876a != null) {
            Logger.i("LocationSignalManager", "notifyNoGpsMsg");
            this.f16876a.onLocationChanged(new SportLocationResult.a(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).i(0).k(0).g());
        }
    }

    public void j() {
        if (this.d) {
            return;
        }
        FitnessLogUtils.i("LocationSignalManager", "startLocation");
        if (!this.f16877b.isProviderEnabled("gps")) {
            FitnessLogUtils.i("LocationSignalManager", "gps provider is not enabled");
            return;
        }
        try {
            if (this.f16877b.isProviderEnabled("gps")) {
                this.f16877b.requestLocationUpdates("gps", this.c, 0.0f, this.f16878k, Looper.getMainLooper());
                GnssStatusCompat.INSTANCE.registerGnssStatusCallback(this.f16877b);
                this.d = true;
                this.f.postDelayed(new Runnable() { // from class: doe
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15740a.k();
                    }
                }, this.e);
            }
        } catch (SecurityException e) {
            FitnessLogUtils.INSTANCE.w("LocationSignalManager", "location", e);
        }
    }

    public void k() {
        this.d = false;
        FitnessLogUtils.i("LocationSignalManager", "stopLocation");
        LocationManager locationManager = this.f16877b;
        if (locationManager != null) {
            locationManager.removeUpdates(this.f16878k);
            GnssStatusCompat.INSTANCE.unregisterGnssStatusCallback(this.f16877b);
        }
        if (!this.j) {
            i();
        }
        this.f.removeCallbacksAndMessages(null);
    }

    public eoe(Context context, long j, yyc yycVar, int i) {
        this.e = (int) TimeUnit.SECONDS.toMillis(15L);
        this.f = new Handler(Looper.getMainLooper(), this);
        this.g = 0L;
        this.h = 4000;
        this.i = 1;
        this.j = false;
        this.f16878k = new a();
        this.l = new b();
        Logger.i("LocationSignalManager", "listener:" + yycVar);
        this.f16876a = yycVar;
        this.c = j;
        this.f16877b = (LocationManager) context.getSystemService("location");
        this.e = i;
    }
}
