package com.xiaomi.hm.health.locweather.location;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import com.huami.tools.log.HMLog;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes21.dex */
public class SystemLocationService implements LocationService, android.location.LocationListener {
    private static final String g = "SystemLocationService";
    private Context a;
    private android.location.LocationManager b;
    private LocationListener c;
    private String d;
    private Handler e;
    private Executor f;

    public SystemLocationService(Context context) {
        this.a = context;
        this.b = (android.location.LocationManager) context.getSystemService("location");
        HMLog.d(g, "Provider : " + this.b.getAllProviders(), new Object[0]);
        b();
    }

    private Executor a() {
        if (this.f == null) {
            this.f = Executors.newSingleThreadExecutor();
        }
        return this.f;
    }

    private void b() {
        HandlerThread handlerThread = new HandlerThread(g);
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
    }

    @Override // com.xiaomi.hm.health.locweather.location.LocationService
    public void cancelLocation() {
        HMLog.d(g, "Cancel Location!!", new Object[0]);
        this.b.removeUpdates(this);
    }

    @Override // com.xiaomi.hm.health.locweather.location.LocationService
    public MyLocation getLastLocation() {
        if (ContextCompat.checkSelfPermission(this.a, "android.permission.ACCESS_FINE_LOCATION") != 0 && ContextCompat.checkSelfPermission(this.a, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            return null;
        }
        Location lastKnownLocation = this.b.getLastKnownLocation("network");
        if (lastKnownLocation == null && !"network".equals(this.d)) {
            lastKnownLocation = this.b.getLastKnownLocation(this.d);
        }
        if (lastKnownLocation == null) {
            return null;
        }
        MyLocation myLocation = new MyLocation();
        myLocation.setLatitude(lastKnownLocation.getLatitude());
        myLocation.setLongitude(lastKnownLocation.getLongitude());
        return myLocation;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (location == null) {
            HMLog.i(g, "onLocationChanged return as loc is null", new Object[0]);
            return;
        }
        HMLog.i(g, "onLocationChanged !!", new Object[0]);
        HMLog.d(g, "Time : " + location.getTime(), new Object[0]);
        HMLog.d(g, "Latitude : " + location.getLatitude(), new Object[0]);
        HMLog.d(g, "Longitude : " + location.getLongitude(), new Object[0]);
        if (this.c != null) {
            MyLocation myLocation = new MyLocation();
            MyLocation.Address address = new MyLocation.Address();
            myLocation.setLatitude(location.getLatitude());
            myLocation.setLongitude(location.getLongitude());
            myLocation.setAddress(address);
            this.c.onReceiveLocation(myLocation);
        }
        cancelLocation();
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        HMLog.d(g, "onProviderDisabled : " + str, new Object[0]);
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        HMLog.d(g, "onProviderEnabled : " + str, new Object[0]);
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    @Override // com.xiaomi.hm.health.locweather.location.LocationService
    public void optionLocationService(LocationOption locationOption) {
        if (LocationOption.a.HighAccuracy == locationOption.getMode()) {
            this.d = "gps";
        } else if (LocationOption.a.BatterySave == locationOption.getMode()) {
            this.d = "network";
        } else if (LocationOption.a.GpsOnly == locationOption.getMode()) {
            this.d = "gps";
        }
        HMLog.i(g, "mLocProvider is: " + this.d, new Object[0]);
    }

    @Override // com.xiaomi.hm.health.locweather.location.LocationService
    public void registerLocationListener(LocationListener locationListener) {
        this.c = locationListener;
    }

    @Override // com.xiaomi.hm.health.locweather.location.LocationService
    public void startLocation() {
        HMLog.d(g, "Start Location!!", new Object[0]);
        if (PermissionChecker.checkSelfPermission(this.a, "android.permission.ACCESS_FINE_LOCATION") != 0 && PermissionChecker.checkSelfPermission(this.a, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            HMLog.d(g, "Permisson Deined!!!", new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.b.getCurrentLocation(this.d, null, a(), new Consumer() { // from class: ik7
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.a.onLocationChanged((Location) obj);
                }
            });
        } else {
            this.b.requestSingleUpdate(this.d, this, this.e.getLooper());
        }
        HMLog.d(g, "Last Loc : " + this.b.getLastKnownLocation("network") + "; last loc " + this.b.getLastKnownLocation(this.d) + "; mLocProvider: " + this.d, new Object[0]);
    }

    @Override // com.xiaomi.hm.health.locweather.location.LocationService
    public void stopLocation() {
        HMLog.d(g, "Stop Location!!", new Object[0]);
        this.b.removeUpdates(this);
    }
}
