package com.xiaomi.hm.health.locweather.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.locweather.ConfigurationHolder;
import com.xiaomi.hm.health.locweather.location.LocationManager;
import com.xiaomi.hm.health.locweather.location.MyLocation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class LocationManager {
    public static final String ACTION_LOCATION_RECEIVED = "com.huami.watch.companion.action.LocationReceived";
    public static final String KEY_LOCATION = "MyLocation";
    public static final String SERVICE_AMAP = "ServiceAMap";
    public static final String SERVICE_SYSTEM = "ServiceSystem";
    private static final String e = "MyLocation-Manager";
    private static final int f = 3600000;

    @SuppressLint({"StaticFieldLeak"})
    private static LocationManager g;
    private Context a;
    private LocationService b;
    private LocationOption c;
    private LocationListener d;

    private LocationManager(Context context) {
        this.a = context;
        LocationOption locationOption = new LocationOption();
        this.c = locationOption;
        locationOption.setMode(e(context));
        this.c.c(ConfigurationHolder.getWeatherSettingProxy().needAddress());
        this.c.d(3600000);
        this.d = new LocationListener() { // from class: hr4
            @Override // com.xiaomi.hm.health.locweather.location.LocationListener
            public final void onReceiveLocation(MyLocation myLocation) {
                this.a.g(myLocation);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void g(MyLocation myLocation) {
        Intent intent = new Intent("com.huami.watch.companion.action.LocationReceived");
        intent.putExtra(KEY_LOCATION, myLocation);
        LocalBroadcastManager.getInstance(this.a).sendBroadcast(intent);
    }

    private LocationOption.a e(Context context) {
        if (LocationUtils.isProviderEnable(context, "network")) {
            HMLog.i(e, "support network provider", new Object[0]);
            return LocationOption.a.BatterySave;
        }
        if (LocationUtils.isProviderEnable(context, "gps")) {
            HMLog.i(e, "support gps provider", new Object[0]);
            return LocationOption.a.GpsOnly;
        }
        HMLog.i(e, "not support, return default", new Object[0]);
        return LocationOption.a.BatterySave;
    }

    private LocationService f(String str) {
        HMLog.d(e, "Get MyLocation Service : " + str, new Object[0]);
        if ("ServiceSystem".equals(str)) {
            this.b = new SystemLocationService(this.a);
        } else if ("ServiceAMap".equals(str)) {
            this.b = new AMapLocationService(this.a);
        }
        this.b.optionLocationService(this.c);
        LocationListener locationListener = this.d;
        if (locationListener != null) {
            this.b.registerLocationListener(locationListener);
        }
        return this.b;
    }

    public static LocationManager getManager(Context context) {
        if (g == null) {
            g = new LocationManager(context);
        }
        return g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h() {
        return "requestLocation";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i(Exception exc) {
        return "requestLocation exception: " + exc.getMessage();
    }

    private void j() {
        LocationService locationService = this.b;
        if (locationService == null) {
            return;
        }
        locationService.stopLocation();
        this.b.startLocation();
    }

    public void cancelLocation() {
        LocationService locationService = this.b;
        if (locationService == null) {
            return;
        }
        locationService.cancelLocation();
        this.b = null;
    }

    public LocationService getService() {
        return this.b;
    }

    public void requestLocation(boolean z) {
        HMLog.info(e, new Function0() { // from class: jr4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocationManager.h();
            }
        });
        if (this.b == null) {
            this.b = f(z ? "ServiceSystem" : "ServiceAMap");
        }
        try {
            j();
        } catch (Exception e2) {
            HMLog.error(e, new Function0() { // from class: ir4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocationManager.i(e2);
                }
            });
        }
    }

    public static LocationManager getManager() {
        return g;
    }
}
