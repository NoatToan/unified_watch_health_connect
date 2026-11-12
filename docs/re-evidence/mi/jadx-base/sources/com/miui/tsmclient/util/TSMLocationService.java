package com.miui.tsmclient.util;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class TSMLocationService {
    private static final long DEFAULT_DURATION_TIME = 20000;
    private static volatile TSMLocationService INSTANCE;
    private static final Location sDefaultLocation = new Location("network");
    private Location mLocation;
    private LocationManager mLocationManager;
    private boolean mOnGoing = false;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private List<WeakReference<LocationChangedListener>> mLocationChangedListeners = new ArrayList();
    private LocationListener mLocationListener = new LocationListener() { // from class: com.miui.tsmclient.util.TSMLocationService.1
        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null) {
                LogUtils.d("onLocationChanged() called. location is null");
                return;
            }
            TSMLocationService.this.mLocation = location;
            LogUtils.t("onLocationChanged() called. longitude is " + TSMLocationService.this.mLocation.getLongitude() + ", latitude is " + TSMLocationService.this.mLocation.getLatitude() + ", accuracy is " + TSMLocationService.this.mLocation.getAccuracy());
            Iterator it = TSMLocationService.this.mLocationChangedListeners.iterator();
            while (it.hasNext()) {
                LocationChangedListener locationChangedListener = (LocationChangedListener) ((WeakReference) it.next()).get();
                if (locationChangedListener != null) {
                    locationChangedListener.onLocationChanged(TSMLocationService.this.mLocation, true);
                }
            }
            TSMLocationService.this.mHandler.removeCallbacks(TSMLocationService.this.mCancelUpdatesTask);
            TSMLocationService.this.cancelUpdates(false);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };
    private Runnable mCancelUpdatesTask = new Runnable() { // from class: com.miui.tsmclient.util.TSMLocationService.2
        @Override // java.lang.Runnable
        public void run() {
            TSMLocationService.this.cancelUpdates(true);
        }
    };

    public interface LocationChangedListener {
        void onLocationChanged(Location location, boolean z);

        void onLocationChangedTimeOut();
    }

    public class RequestLocationUpdateTask implements Runnable {
        private WeakReference<LocationChangedListener> mLocationChangedListenerRef;

        public RequestLocationUpdateTask(WeakReference<LocationChangedListener> weakReference) {
            this.mLocationChangedListenerRef = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationChangedListener locationChangedListener = this.mLocationChangedListenerRef.get();
            if (locationChangedListener == null) {
                return;
            }
            if (TSMLocationService.this.mLocation != null) {
                locationChangedListener.onLocationChanged(TSMLocationService.this.mLocation, true);
                return;
            }
            locationChangedListener.onLocationChanged(TSMLocationService.this.getLastLocation(), false);
            TSMLocationService.this.mLocationChangedListeners.add(this.mLocationChangedListenerRef);
            String bestProvider = TSMLocationService.this.getBestProvider();
            if (bestProvider == null || TSMLocationService.this.mOnGoing) {
                return;
            }
            try {
                TSMLocationService.this.mLocationManager.requestSingleUpdate(bestProvider, TSMLocationService.this.mLocationListener, (Looper) null);
            } catch (SecurityException e) {
                LogUtils.e("location failed with an security exception.", e);
            }
            TSMLocationService.this.mOnGoing = true;
            LogUtils.d("RequestLocationUpdateTask requestSingleUpdate called");
        }
    }

    private TSMLocationService(Context context) {
        this.mLocationManager = (LocationManager) context.getApplicationContext().getSystemService("location");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelUpdates(boolean z) {
        if (this.mOnGoing) {
            this.mOnGoing = false;
            List<WeakReference<LocationChangedListener>> list = this.mLocationChangedListeners;
            if (list != null) {
                if (z) {
                    Iterator<WeakReference<LocationChangedListener>> it = list.iterator();
                    while (it.hasNext()) {
                        LocationChangedListener locationChangedListener = it.next().get();
                        if (locationChangedListener != null) {
                            locationChangedListener.onLocationChangedTimeOut();
                        }
                    }
                }
                this.mLocationChangedListeners.clear();
            }
            LocationManager locationManager = this.mLocationManager;
            if (locationManager != null) {
                locationManager.removeUpdates(this.mLocationListener);
                LogUtils.d("cancelUpdates called!");
            }
            this.mLocation = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getBestProvider() {
        if (this.mLocationManager.isProviderEnabled("network")) {
            return "network";
        }
        Criteria criteria = new Criteria();
        criteria.setAccuracy(2);
        return this.mLocationManager.getBestProvider(criteria, true);
    }

    public static TSMLocationService getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (TSMLocationService.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new TSMLocationService(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return INSTANCE;
    }

    public Location getLastLocation() {
        Location lastKnownLocation;
        Location location = this.mLocation;
        if (location != null) {
            return location;
        }
        String bestProvider = getBestProvider();
        if (bestProvider == null) {
            return sDefaultLocation;
        }
        try {
            lastKnownLocation = this.mLocationManager.getLastKnownLocation(bestProvider);
        } catch (SecurityException e) {
            LogUtils.e("location failed with an security exception.", e);
            lastKnownLocation = null;
        }
        return lastKnownLocation != null ? lastKnownLocation : sDefaultLocation;
    }

    public boolean isLocationServiceEnabled(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            LogUtils.e("get location mode fail.", e);
            return false;
        }
    }

    public void requestLocationUpdate(LocationChangedListener locationChangedListener, long j) {
        if (locationChangedListener == null) {
            return;
        }
        this.mHandler.post(new RequestLocationUpdateTask(new WeakReference(locationChangedListener)));
        this.mHandler.removeCallbacks(this.mCancelUpdatesTask);
        Handler handler = this.mHandler;
        Runnable runnable = this.mCancelUpdatesTask;
        if (j <= 0) {
            j = DEFAULT_DURATION_TIME;
        }
        handler.postDelayed(runnable, j);
    }
}
