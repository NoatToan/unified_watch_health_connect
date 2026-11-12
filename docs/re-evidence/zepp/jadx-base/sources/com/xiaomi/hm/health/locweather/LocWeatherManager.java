package com.xiaomi.hm.health.locweather;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Address;
import android.location.Geocoder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.locweather.encrypt.EncryptImpl;
import com.xiaomi.hm.health.locweather.event.LocationEvent;
import com.xiaomi.hm.health.locweather.event.WeatherUpdateEvent;
import com.xiaomi.hm.health.locweather.location.LocationManager;
import com.xiaomi.hm.health.locweather.location.MyLocation;
import com.xiaomi.hm.health.locweather.logic.CanUpdate;
import com.xiaomi.hm.health.locweather.logic.CannotUpdate;
import com.xiaomi.hm.health.locweather.logic.UpdateLocationStrategy;
import com.xiaomi.hm.health.locweather.model.AlertInfo;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.locweather.model.ForecastWeatherInfo;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback;
import com.xiaomi.hm.health.locweather.proxy.WeatherSettingProxy;
import de.greenrobot.event.EventBus;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class LocWeatherManager {
    private static final String d = "LocWeatherManager";
    private static final long e = 3600000;

    @SuppressLint({"StaticFieldLeak"})
    private static LocWeatherManager f;
    private static Handler g;
    private static Handler h;
    private volatile boolean a = false;
    private WeatherSettingProxy b;
    private HMWeatherUpdater c;

    public class a extends BroadcastReceiver {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Intent intent) {
            LocWeatherManager.this.l(intent);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            LocWeatherManager.x(new Runnable() { // from class: com.xiaomi.hm.health.locweather.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(intent);
                }
            });
        }
    }

    private LocWeatherManager() {
        HandlerThread handlerThread = new HandlerThread(d);
        handlerThread.start();
        g = new Handler(handlerThread.getLooper());
        h = new Handler(Looper.getMainLooper());
        this.b = ConfigurationHolder.getWeatherSettingProxy();
        WeatherTimer.getInstance().d();
        WeatherTimer.getInstance().e(this.b);
        try {
            WeatherTimer.getInstance().c();
        } catch (Exception e2) {
            HMLog.i(d, "initAlarm exception: " + e2.toString(), new Object[0]);
        }
        HMWeatherUpdater hMWeatherUpdater = HMWeatherUpdater.getInstance();
        this.c = hMWeatherUpdater;
        hMWeatherUpdater.n();
        w();
    }

    public static LocWeatherManager getInstance() {
        return f;
    }

    public static void init(Context context, IWeatherSettingCallback iWeatherSettingCallback, boolean z) {
        ConfigurationHolder.setContext(context);
        ConfigurationHolder.setGlobal(z);
        ConfigurationHolder.setWeatherSettingProxy(iWeatherSettingCallback);
        if (f == null) {
            f = new LocWeatherManager();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String m(String str) {
        return "debug: " + this.a + ", " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n() {
        return "flag";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(CannotUpdate cannotUpdate) {
        return "cannotUpdate: " + cannotUpdate.getReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(boolean z) {
        LocationManager.getManager(ConfigurationHolder.getContext()).requestLocation(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q() {
        return "get weather with cached city info";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r() {
        return "not connect";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        if (!NetUtil.isNetworkConnected(ConfigurationHolder.getContext())) {
            HMLog.i(d, "no network.", new Object[0]);
            return;
        }
        if (!this.b.isPersonInfoReady()) {
            HMLog.i(d, "requestLocation personInfo not ready.", new Object[0]);
            return;
        }
        if (this.b.isSupportHuamiWeatherService()) {
            this.b.handleWeatherSetting();
        }
        if (this.b.isKoreaUser()) {
            if (this.b.supportDeviceWeather()) {
                this.c.t();
                return;
            }
            return;
        }
        if (!this.b.getAutoLocate() && this.b.supportDeviceWeather()) {
            this.c.s(false);
        }
        boolean zSupportDeviceWeather = k().supportDeviceWeather();
        boolean zIsConnected = k().isConnected();
        if (!zSupportDeviceWeather || !zIsConnected) {
            HMLog.info(d, new Function0() { // from class: qq4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocWeatherManager.r();
                }
            });
            return;
        }
        if (this.b.isLocationOn()) {
            this.a = false;
            final boolean zIsGlobal = ConfigurationHolder.getWeatherSettingProxy().isGlobal();
            y(new Runnable() { // from class: nq4
                @Override // java.lang.Runnable
                public final void run() {
                    LocWeatherManager.p(zIsGlobal);
                }
            });
        } else if (this.b.isZepp() && this.b.getAutoLocate()) {
            HMLog.info(d, new Function0() { // from class: sq4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocWeatherManager.q();
                }
            });
            this.c.s(false);
        }
    }

    public static List<CityInfo> searchCities(String str, int i) {
        return WeatherAPINewKt.searchCities(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t() {
        return "korea";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        WeatherInfos weatherInfosJ = this.c.j();
        if (weatherInfosJ == null || weatherInfosJ.getCityInfo() == null || TextUtils.isEmpty(weatherInfosJ.getCityInfo().getLocationKey())) {
            HMLog.i(d, "return for cityInfo invalid", new Object[0]);
            return;
        }
        if (!HMWeatherUpdater.k(weatherInfosJ.getCityInfo().getLocationKey())) {
            HMLog.i(d, "return for current city not support alert", new Object[0]);
            return;
        }
        List<AlertInfo> listD = this.c.d(weatherInfosJ.getAlertInfos(), weatherInfosJ.getCityInfo().getLocationKey(), false, getInstance().k().getBoundDeviceSource());
        if (listD == null || listD.size() <= 0) {
            return;
        }
        weatherInfosJ.setAlertInfos(listD);
        HMLog.i(d, "updateAlert success.", new Object[0]);
        LocWeatherKeeper.d(weatherInfosJ.toJsonString());
        EventBus.getDefault().postSticky(new WeatherUpdateEvent(weatherInfosJ));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        WeatherInfos weatherInfos = this.c.getWeatherInfos();
        if (weatherInfos == null || weatherInfos.getCityInfo() == null || TextUtils.isEmpty(weatherInfos.getCityInfo().getLocationKey())) {
            HMLog.i(d, "return for cityInfo invalid", new Object[0]);
            return;
        }
        List<ForecastWeatherInfo> listR = this.c.r(weatherInfos.getCityInfo().getLocationKey(), weatherInfos.getForecastWeatherInfos(), false, getInstance().k().getBoundDeviceSource());
        if (listR == null || listR.size() <= 0) {
            return;
        }
        weatherInfos.setForecastWeatherInfos(listR);
        HMLog.i(d, "updateForecastForNightMode success.", new Object[0]);
        LocWeatherKeeper.c(weatherInfos.toJsonString());
        EventBus.getDefault().postSticky(weatherInfos);
    }

    private void w() {
        LocalBroadcastManager.getInstance(ConfigurationHolder.getContext()).registerReceiver(new a(), new IntentFilter("com.huami.watch.companion.action.LocationReceived"));
    }

    public static void x(Runnable runnable) {
        g.post(runnable);
    }

    public static void y(Runnable runnable) {
        h.post(runnable);
    }

    private void z(MyLocation myLocation) {
        Address address;
        if (myLocation == null) {
            HMLog.i(d, "loc null", new Object[0]);
            return;
        }
        Geocoder geocoder = new Geocoder(ConfigurationHolder.getContext(), Locale.getDefault());
        try {
            if (!Geocoder.isPresent()) {
                HMLog.i(d, "Geocoder not present", new Object[0]);
                return;
            }
            List<Address> fromLocation = geocoder.getFromLocation(myLocation.getLatitude(), myLocation.getLongitude(), 1);
            if (fromLocation != null && fromLocation.size() > 0 && (address = fromLocation.get(0)) != null) {
                myLocation.getAddress().setAdmin(address.getAdminArea());
                myLocation.getAddress().setSubLocality(address.getSubLocality());
                myLocation.getAddress().setCountry(address.getCountryName());
                myLocation.getAddress().setCountryCode(address.getCountryCode());
                myLocation.getAddress().setLocality(address.getLocality());
                myLocation.getAddress().setSubAdmin(address.getSubAdminArea());
                myLocation.getAddress().setThoroughfare(address.getThoroughfare());
            }
            HMLog.v(d, "GeoCoder Address:" + myLocation.getAddress().toString(), new Object[0]);
        } catch (Exception e2) {
            HMLog.i(d, "geo exception: " + e2, new Object[0]);
        }
    }

    public void cancelLocation() {
        LocationManager.getManager(ConfigurationHolder.getContext()).cancelLocation();
    }

    public void clearData() {
        this.c.c();
    }

    public Handler getHandler() {
        return g;
    }

    public String getLocationAddressCode() {
        String lastLocationStr = LocWeatherKeeper.getLastLocationStr();
        if (!TextUtils.isEmpty(lastLocationStr)) {
            String[] strArrSplit = lastLocationStr.split(",");
            if (strArrSplit.length > 2) {
                return strArrSplit[2];
            }
        }
        return "";
    }

    public String getLocationCity() {
        String lastLocationStr = LocWeatherKeeper.getLastLocationStr();
        if (!TextUtils.isEmpty(lastLocationStr)) {
            String[] strArrSplit = lastLocationStr.split(",");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return "";
    }

    public String getLocationProvince() {
        String lastLocationStr = LocWeatherKeeper.getLastLocationStr();
        if (!TextUtils.isEmpty(lastLocationStr)) {
            String[] strArrSplit = lastLocationStr.split(",");
            if (strArrSplit.length > 1) {
                return strArrSplit[0];
            }
        }
        return "";
    }

    public WeatherInfos getWeatherInfos() {
        return this.c.getWeatherInfos();
    }

    public WeatherInfos getWeatherInfosForDevice() {
        return this.c.j();
    }

    public WeatherSettingProxy k() {
        return this.b;
    }

    @VisibleForTesting
    public void l(Intent intent) {
        MyLocation myLocation = (MyLocation) intent.getParcelableExtra(LocationManager.KEY_LOCATION);
        if (!ConfigurationHolder.getWeatherSettingProxy().needAddress()) {
            z(myLocation);
        }
        EventBus.getDefault().post(new LocationEvent(myLocation));
        if (myLocation == null) {
            return;
        }
        MyLocation.Address address = myLocation.getAddress();
        if (address != null && TextUtils.isEmpty(address.getSubLocality())) {
            address.setSubLocality("");
        }
        if (!this.b.isPersonInfoReady()) {
            HMLog.i(d, "personInfo not ready.", new Object[0]);
            return;
        }
        final String string = this.b.debug() ? myLocation.toString() : new EncryptImpl().encrypt(myLocation.toShortString());
        HMLog.info(d, new Function0() { // from class: oq4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.m(string);
            }
        });
        boolean z = this.b.supportDeviceWeather() && this.b.needDeviceWeather();
        UpdateLocationStrategy updateLocationStrategyU = this.c.u(myLocation, this.a);
        boolean zSupportHuamiOSWeather = this.b.supportHuamiOSWeather();
        if (z && !this.a && this.b.getAutoLocate() && !zSupportHuamiOSWeather) {
            this.c.s(false);
        }
        WeatherInfos weatherInfosJ = this.c.j();
        if (zSupportHuamiOSWeather && weatherInfosJ != null) {
            weatherInfosJ.setLastUpdateTime(System.currentTimeMillis());
        }
        this.a = false;
        HMLog.i(d, "supportDeviceWeather: " + this.b.supportDeviceWeather() + ", needDeviceWeather: " + this.b.needDeviceWeather() + ", needAqi: " + this.b.needAqi() + ", needForecast: " + this.b.needForecast(), new Object[0]);
        HMLog.info("coderJay", new Function0() { // from class: rq4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocWeatherManager.n();
            }
        });
        if (updateLocationStrategyU instanceof CanUpdate) {
            LocWeatherKeeper.setLastLocation(myLocation.toJsonString());
        } else {
            final CannotUpdate cannotUpdate = (CannotUpdate) updateLocationStrategyU;
            HMLog.info(d, new Function0() { // from class: pq4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocWeatherManager.o(cannotUpdate);
                }
            });
        }
        LocWeatherKeeper.updateLocationInfo(myLocation);
    }

    public void requestLocation() {
        x(new Runnable() { // from class: kq4
            @Override // java.lang.Runnable
            public final void run() {
                this.a.s();
            }
        });
    }

    @MainThread
    public void requestLocationLimited() {
        WeatherInfos weatherInfosJ = this.c.j();
        boolean z = weatherInfosJ == null || System.currentTimeMillis() - weatherInfosJ.getLastUpdateTime() >= 3600000;
        HMLog.i(d, "timeMatch: " + z, new Object[0]);
        if (z) {
            requestLocation();
        }
    }

    @MainThread
    public void requestLocationOnly() {
        if (!NetUtil.isNetworkConnected(ConfigurationHolder.getContext())) {
            HMLog.i(d, "no network.", new Object[0]);
            return;
        }
        if (!this.b.isPersonInfoReady()) {
            HMLog.i(d, "requestLocation personInfo not ready.", new Object[0]);
            return;
        }
        if (this.b.isKoreaUser()) {
            HMLog.info(d, new Function0() { // from class: tq4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocWeatherManager.t();
                }
            });
            return;
        }
        boolean zSupportDeviceWeather = k().supportDeviceWeather();
        boolean zIsConnected = k().isConnected();
        if (this.b.isLocationOn() && zSupportDeviceWeather && zIsConnected) {
            this.a = true;
            LocationManager.getManager(ConfigurationHolder.getContext()).requestLocation(ConfigurationHolder.getWeatherSettingProxy().isGlobal());
        }
    }

    public void updateAlert() {
        x(new Runnable() { // from class: mq4
            @Override // java.lang.Runnable
            public final void run() {
                this.a.u();
            }
        });
    }

    public void updateForecastForNightMode() {
        x(new Runnable() { // from class: lq4
            @Override // java.lang.Runnable
            public final void run() {
                this.a.v();
            }
        });
    }

    @VisibleForTesting
    public LocWeatherManager(WeatherSettingProxy weatherSettingProxy, HMWeatherUpdater hMWeatherUpdater) {
        this.b = weatherSettingProxy;
        this.c = hMWeatherUpdater;
    }
}
