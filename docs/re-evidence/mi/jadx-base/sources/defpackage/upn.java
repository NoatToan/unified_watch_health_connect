package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.utils.GnssStatusCompat;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class upn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yyc f36001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f36002b;
    public final long c;
    public LocationListener d = new a();
    public GpsStatus.Listener e = new b();

    public class a implements LocationListener {
        public a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            int accuracyStatus;
            int i = com.xiaomi.fit.data.common.data.sport.Location.LOCATION_TYPE_GPS;
            int i2 = 2;
            if (TextUtils.equals(location.getProvider(), "gps") && (accuracyStatus = GnssStatusCompat.INSTANCE.getAccuracyStatus()) > 2) {
                i2 = accuracyStatus;
            }
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
            FitnessLogUtils.i("SportLocationManager", "gps status : " + i2 + ",timeStamp:" + seconds + ",longitude:" + location.getLongitude() + ", latitude:" + location.getLatitude() + ", altitude:" + location.getAltitude() + ",horizontalAccuracy:" + location.getAccuracy());
            upn.this.g(new SportLocationResult.a(seconds).i(i2).j(location2).g());
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            FitnessLogUtils.i("SportLocationManager", "onProviderDisabled " + str);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            FitnessLogUtils.i("SportLocationManager", "onProviderEnabled " + str);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            upn upnVar = upn.this;
            FitnessLogUtils.i("SportLocationManager", "provider = " + str + ", status = " + upn.this.e(i) + ", gpsSatelliteCount = " + upnVar.f(upnVar.f36002b));
            if (i != 2) {
                String str2 = str + ", status = " + upn.this.e(i);
                TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                new com.xiaomi.fit.data.common.data.sport.Location();
                Logger.i("SportLocationManager", "code:" + i + ",errMsg:" + str2);
            }
        }
    }

    public class b implements GpsStatus.Listener {
        public b() {
        }

        @Override // android.location.GpsStatus.Listener
        @SuppressLint({"MissingPermission"})
        public void onGpsStatusChanged(int i) {
            if (upn.this.f36002b == null) {
                return;
            }
            if (i == 1) {
                FitnessLogUtils.i("SportLocationManager", "GpsLocation | status started ");
                return;
            }
            if (i == 2) {
                FitnessLogUtils.i("SportLocationManager", "GpsLocation | status stopped ");
            } else if (i == 3) {
                FitnessLogUtils.i("SportLocationManager", "GpsLocation | first fix");
            } else {
                if (i != 4) {
                    return;
                }
                FitnessLogUtils.d("SportLocationManager", "GPS_EVENT_SATELLITE_STATUS");
            }
        }
    }

    public upn(Context context, long j, yyc yycVar) {
        this.f36001a = yycVar;
        this.c = j;
        this.f36002b = (LocationManager) context.getSystemService("location");
    }

    public final String e(int i) {
        if (i == 0) {
            return "out of service";
        }
        if (i != 1) {
            return i != 2 ? "unknown" : "available";
        }
        return "temporarily unavailable";
    }

    @SuppressLint({"MissingPermission"})
    public final int f(LocationManager locationManager) {
        int i = 0;
        if (locationManager == null) {
            FitnessLogUtils.w("SportLocationManager", "locationManager is null");
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

    public final void g(SportLocationResult sportLocationResult) {
        yyc yycVar = this.f36001a;
        if (yycVar != null) {
            yycVar.onLocationChanged(sportLocationResult);
        }
    }

    @SuppressLint({"MissingPermission"})
    public void h() {
        FitnessLogUtils.i("SportLocationManager", "startLocation");
        if (!this.f36002b.isProviderEnabled("gps")) {
            FitnessLogUtils.i("SportLocationManager", "gps provider is not enabled");
            return;
        }
        try {
            if (this.f36002b.isProviderEnabled("gps")) {
                this.f36002b.requestLocationUpdates("gps", this.c, 0.0f, this.d, Looper.getMainLooper());
                GnssStatusCompat.INSTANCE.registerGnssStatusCallback(this.f36002b);
            }
        } catch (SecurityException e) {
            FitnessLogUtils.INSTANCE.w("SportLocationManager", "location", e);
        }
    }

    public void i() {
        FitnessLogUtils.i("SportLocationManager", "stopLocation");
        LocationManager locationManager = this.f36002b;
        if (locationManager != null) {
            locationManager.removeUpdates(this.d);
            GnssStatusCompat.INSTANCE.unregisterGnssStatusCallback(this.f36002b);
        }
    }
}
