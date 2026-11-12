package com.huami.watch.companion.location;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class LocationManager {
    public static final String ACTION_LOCATION_RECEIVED = "com.huami.watch.companion.action.LocationReceived";
    public static final String KEY_LOCATION = "Location";
    public static final String SERVICE_AMAP = "ServiceAMap";
    public static final String SERVICE_SYSTEM = "ServiceSystem";
    public static final String SINGLE_SERVICE_SYSTEM = "SingleServiceSystem";
    private static final String f = "Location-Manager";
    private static final long g = 86400000;
    private static LocationManager h;
    private Context a;
    private LocationService b;
    private LocationOption c;
    private LocationListener d;
    private final List<LocationListener> e = new ArrayList();

    public class a implements LocationListener {
        public a() {
        }

        @Override // com.huami.watch.companion.location.LocationListener
        public void onLocationError(int i) {
            Log.d(LocationManager.f, "Location Error : " + i, new Object[0]);
            synchronized (LocationManager.this.e) {
                if (LocationManager.this.e.size() > 0) {
                    Iterator it2 = LocationManager.this.e.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((LocationListener) it2.next()).onLocationError(i);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        @Override // com.huami.watch.companion.location.LocationListener
        public void onLocationReceived(@NonNull Location location) {
            Log.d(LocationManager.f, "Location Received : " + location, new Object[0]);
            Box.putGPSInfo(location.getLongitude() + "," + location.getLatitude());
            LocationManager.this.d(location);
            synchronized (LocationManager.this.e) {
                if (LocationManager.this.e.size() > 0) {
                    Iterator it2 = LocationManager.this.e.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((LocationListener) it2.next()).onLocationReceived(location);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ LocationService a;

        public b(LocationService locationService) {
            this.a = locationService;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(LocationManager.f, "Request Location : " + this.a, new Object[0]);
            this.a.startLocation();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(LocationManager.f, "Request Location : " + LocationManager.this.b, new Object[0]);
            LocationManager.this.b.startLocation();
        }
    }

    private LocationManager(Context context) {
        this.a = context;
        LocationOption locationOption = new LocationOption();
        this.c = locationOption;
        locationOption.setMode(LocationOption.LocationMode.BatterySave);
        this.c.setNeedAddress(true);
        this.c.setUpdateInterval(86400000L);
        this.d = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Location location) {
        Intent intent = new Intent("com.huami.watch.companion.action.LocationReceived");
        intent.putExtra("Location", location);
        LocalBroadcastManager.getInstance(this.a).sendBroadcast(intent);
    }

    @Nullable
    private LocationService e(String str) {
        if ("ServiceSystem".equals(str)) {
            return new SystemLocationService(this.a);
        }
        if ("ServiceAMap".equals(str)) {
            return new AMapLocationService(this.a);
        }
        if (SINGLE_SERVICE_SYSTEM.equals(str)) {
            return new SystemSingleLocationService(this.a);
        }
        return null;
    }

    private LocationService f() {
        return this.b;
    }

    private LocationService g(String str) {
        Log.d(f, "Get Location Service : " + str, new Object[0]);
        LocationService locationServiceE = e(str);
        this.b = locationServiceE;
        if (locationServiceE == null) {
            return null;
        }
        try {
            locationServiceE.optionLocationService(this.c);
        } catch (Exception e) {
            Log.w(f, "OptionLocationServiceErr", e, new Object[0]);
        }
        LocationListener locationListener = this.d;
        if (locationListener != null) {
            this.b.registerLocationListener(locationListener);
        }
        return this.b;
    }

    public static LocationManager getManager(Context context) {
        if (h == null) {
            h = new LocationManager(context);
        }
        return h;
    }

    public void addLocationListener(LocationListener locationListener) {
        synchronized (this.e) {
            if (!this.e.contains(locationListener)) {
                this.e.add(locationListener);
            }
        }
    }

    public void broadcastLastLocation() {
        Location lastLocation = getLastLocation();
        if (lastLocation != null) {
            d(lastLocation);
        }
    }

    public void cancelLocation() {
        Log.d(f, "Cancel Location : " + this.b, new Object[0]);
        LocationService locationService = this.b;
        if (locationService == null) {
            return;
        }
        locationService.cancelLocation();
        this.b = null;
    }

    public Location getLastLocation() {
        LocationService locationService = this.b;
        if (locationService == null) {
            return null;
        }
        return locationService.getLastLocation();
    }

    public void removeLocationListener(LocationListener locationListener) {
        synchronized (this.e) {
            if (this.e.contains(locationListener)) {
                this.e.remove(locationListener);
            }
        }
    }

    public void requestLocation() {
        Log.d(f, "Request Location : ServiceAMap", new Object[0]);
        requestLocation("ServiceAMap");
    }

    public void stopLocation() {
        Log.d(f, "Stop Location : " + this.b, new Object[0]);
        LocationService locationService = this.b;
        if (locationService == null) {
            return;
        }
        locationService.stopLocation();
    }

    @Nullable
    public Location getLastLocation(String str) {
        LocationService locationServiceE = e(str);
        if (locationServiceE == null) {
            return null;
        }
        return locationServiceE.getLastLocation();
    }

    public void requestLocation(String str, LocationListener locationListener) {
        LocationService locationServiceE = e(str);
        if (locationServiceE == null) {
            return;
        }
        locationServiceE.registerLocationListener(locationListener);
        Rx.io(new b(locationServiceE)).safeSubscribe();
    }

    public static LocationManager getManager() {
        return h;
    }

    public void requestLocation(String str) {
        if (this.b == null) {
            this.b = g(str);
        }
        Rx.io(new c()).safeSubscribe();
    }
}
