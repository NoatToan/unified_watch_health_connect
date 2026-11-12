package com.xiaomi.hm.health.locweather;

import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.locweather.event.WeatherUpdateEvent;
import com.xiaomi.hm.health.locweather.location.MyLocation;
import com.xiaomi.hm.health.locweather.logic.CanUpdate;
import com.xiaomi.hm.health.locweather.logic.CannotUpdate;
import com.xiaomi.hm.health.locweather.logic.UpdateLocationStrategy;
import com.xiaomi.hm.health.locweather.model.AlertInfo;
import com.xiaomi.hm.health.locweather.model.AqiInfo;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.locweather.model.ForecastWeatherInfo;
import com.xiaomi.hm.health.locweather.model.RealtimeWeatherInfo;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import com.xiaomi.hm.health.locweather.proxy.WeatherSettingProxy;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class HMWeatherUpdater {
    public static final String CITY_NAME_KOREA = "CITY_NAME_KOREA";
    private static final String d = "HMWeatherUpdater";
    private static final String e = "CN";
    private static final String f = "cn";
    private static final long g = 3000000;
    private WeatherInfos a;
    private WeatherInfos b;
    private final byte[] c;

    public static class a {
        private static final HMWeatherUpdater a = new HMWeatherUpdater();

        private a() {
        }
    }

    private HMWeatherUpdater() {
        this.c = new byte[0];
    }

    private AqiInfo e(AqiInfo aqiInfo, String str, boolean z, boolean z2) {
        if (aqiInfo != null && !aqiInfo.expired() && !z2) {
            HMLog.i(d, "use cached aqi.", new Object[0]);
            return aqiInfo;
        }
        if (aqiInfo == null) {
            HMLog.d(d, "update aqi for no cache.", new Object[0]);
        } else if (aqiInfo.expired()) {
            HMLog.d(d, "update aqi for timeout.", new Object[0]);
        } else if (z2) {
            HMLog.d(d, "update aqi for location changed.", new Object[0]);
        }
        return WeatherAPI.f(str, z);
    }

    private static CityInfo f(String str, String str2, int i) {
        List<CityInfo> listSearchCities = WeatherAPINewKt.searchCities(str2, i);
        if (listSearchCities == null) {
            return null;
        }
        for (CityInfo cityInfo : listSearchCities) {
            if (str.equals(cityInfo.getLocationKey())) {
                return cityInfo;
            }
        }
        return null;
    }

    private CityInfo g(WeatherSettingProxy weatherSettingProxy) {
        if (weatherSettingProxy.getAutoLocate()) {
            return this.a.getCityInfo();
        }
        if (weatherSettingProxy.supportWeatherCityOptimize()) {
            CityInfo cityInfo = this.b.getCityInfo();
            if ((cityInfo != null && TextUtils.equals(weatherSettingProxy.getLocationKey(), cityInfo.getLocationKey())) || isBlank(weatherSettingProxy.getCity())) {
                return cityInfo;
            }
            CityInfo cityInfoF = f(weatherSettingProxy.getLocationKey(), weatherSettingProxy.getCity(), weatherSettingProxy.getBoundDeviceSource());
            if (cityInfoF != null) {
                return cityInfoF;
            }
        }
        CityInfo cityInfo2 = new CityInfo();
        cityInfo2.setName(weatherSettingProxy.getCity());
        if (weatherSettingProxy.supportWeatherCityOptimize()) {
            cityInfo2.setAffiliation(weatherSettingProxy.getAffiliation());
        }
        cityInfo2.setLocationKey(weatherSettingProxy.getLocationKey());
        return cityInfo2;
    }

    public static HMWeatherUpdater getInstance() {
        return a.a;
    }

    private List<Object> h(RealtimeWeatherInfo realtimeWeatherInfo, AqiInfo aqiInfo, String str, boolean z, int i) {
        if (realtimeWeatherInfo != null && !realtimeWeatherInfo.expired() && !z) {
            HMLog.i(d, "use cached realTime.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            arrayList.add(realtimeWeatherInfo);
            arrayList.add(aqiInfo);
            return arrayList;
        }
        if (realtimeWeatherInfo == null) {
            HMLog.d(d, "update realTime for no cache.", new Object[0]);
        } else if (realtimeWeatherInfo.expired()) {
            HMLog.d(d, "update realTime for timeout.", new Object[0]);
        } else if (z) {
            HMLog.d(d, "update realTime for location changed.", new Object[0]);
        }
        return WeatherAPINewKt.getWeatherRealtime(str, i, realtimeWeatherInfo, aqiInfo);
    }

    private RealtimeWeatherInfo i(RealtimeWeatherInfo realtimeWeatherInfo, String str, boolean z, boolean z2) {
        if (realtimeWeatherInfo != null && !realtimeWeatherInfo.expired() && !z2) {
            HMLog.i(d, "use cached realTime.", new Object[0]);
            return realtimeWeatherInfo;
        }
        if (realtimeWeatherInfo == null) {
            HMLog.d(d, "update realTime for no cache.", new Object[0]);
        } else if (realtimeWeatherInfo.expired()) {
            HMLog.d(d, "update realTime for timeout.", new Object[0]);
        } else if (z2) {
            HMLog.d(d, "update realTime for location changed.", new Object[0]);
        }
        return WeatherAPI.g(str, z);
    }

    public static boolean isBlank(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return TextUtils.isEmpty(str.trim());
    }

    public static boolean k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("CN") || str.contains("cn");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        o();
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        s(true);
    }

    private void o() {
        synchronized (this) {
            WeatherInfos weatherInfosA = LocWeatherKeeper.a();
            this.a = weatherInfosA;
            if (weatherInfosA != null) {
                weatherInfosA.checkValidity();
            } else {
                this.a = new WeatherInfos();
            }
            if (ConfigurationHolder.getWeatherSettingProxy().isUserValid()) {
                EventBus.getDefault().postSticky(this.a);
            }
        }
    }

    private void p() {
        synchronized (this.c) {
            WeatherInfos weatherInfosB = LocWeatherKeeper.b();
            this.b = weatherInfosB;
            if (weatherInfosB != null) {
                weatherInfosB.checkValidity();
            } else {
                this.b = new WeatherInfos();
            }
            EventBus.getDefault().postSticky(new WeatherUpdateEvent(this.b));
        }
    }

    private void q() {
        this.a.setLastUpdateTime(System.currentTimeMillis());
        HMLog.i(d, "updateWeatherInfo success.", new Object[0]);
        LocWeatherKeeper.c(this.a.toJsonString());
        EventBus.getDefault().postSticky(this.a);
    }

    public void c() {
        this.a = new WeatherInfos();
        this.b = new WeatherInfos();
        LocWeatherKeeper.clear();
    }

    public List<AlertInfo> d(List<AlertInfo> list, String str, boolean z, int i) {
        boolean zIsAlertEnable = LocWeatherManager.getInstance().k().isAlertEnable();
        HMLog.i(d, "alertEnable: " + zIsAlertEnable, new Object[0]);
        if (!zIsAlertEnable) {
            return null;
        }
        if (list != null && list.size() != 0 && !list.get(0).expired() && !z) {
            HMLog.i(d, "use cached alert.", new Object[0]);
            return list;
        }
        if (list == null || list.size() == 0) {
            HMLog.d(d, "update alert for no cache.", new Object[0]);
        } else if (list.get(0).expired()) {
            HMLog.d(d, "update alert for timeout.", new Object[0]);
        } else if (z) {
            HMLog.d(d, "update alert for location changed.", new Object[0]);
        }
        return WeatherAPINewKt.getAlert(str, i);
    }

    public WeatherInfos getWeatherInfos() {
        return this.a;
    }

    public WeatherInfos j() {
        return this.b;
    }

    public void n() {
        LocWeatherManager.x(new Runnable() { // from class: zo3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.l();
            }
        });
    }

    public List<ForecastWeatherInfo> r(String str, List<ForecastWeatherInfo> list, boolean z, int i) {
        if (list == null || list.size() == 0 || !list.get(0).isSuccess()) {
            HMLog.d(d, "update forecast for no cache.", new Object[0]);
            return WeatherAPINewKt.getForecastWeather(str, 7, i, list);
        }
        if (!list.get(0).expired() && !z) {
            HMLog.i(d, "use cached forecast.", new Object[0]);
            return list;
        }
        if (z) {
            HMLog.d(d, "update forecast for location changed.", new Object[0]);
        } else {
            HMLog.d(d, "update forecast for timeout.", new Object[0]);
        }
        return WeatherAPINewKt.getForecastWeather(str, 7, i, list);
    }

    public void s(boolean z) {
        boolean z2;
        RealtimeWeatherInfo realtimeWeatherInfoI;
        AqiInfo aqiInfo;
        boolean z3 = System.currentTimeMillis() - this.b.getLastUpdateTime() > g && !z;
        HMLog.i(d, "needRetry: " + z3 + ", isRetry: " + z, new Object[0]);
        if (!NetUtil.isNetworkConnected(ConfigurationHolder.getContext())) {
            HMLog.i(d, "network disable for device.", new Object[0]);
            return;
        }
        WeatherSettingProxy weatherSettingProxyK = LocWeatherManager.getInstance().k();
        if (!weatherSettingProxyK.isConnected()) {
            HMLog.i(d, "device not connected", new Object[0]);
            return;
        }
        if (weatherSettingProxyK.supportHuamiOSWeather()) {
            HMLog.i(d, "HuamiOS no need request", new Object[0]);
            return;
        }
        this.b.setLastUpdateTime(System.currentTimeMillis());
        int boundDeviceSource = weatherSettingProxyK.getBoundDeviceSource();
        boolean zA = ConfigurationHolder.a();
        WeatherSettingProxy weatherSettingProxyK2 = LocWeatherManager.getInstance().k();
        String locationKey = weatherSettingProxyK2.getLocationKey();
        boolean autoLocate = weatherSettingProxyK2.getAutoLocate();
        CityInfo cityInfoG = g(weatherSettingProxyK2);
        if (cityInfoG == null || TextUtils.isEmpty(cityInfoG.getLocationKey())) {
            try {
                LocWeatherKeeper.d(this.b.toJsonString());
            } catch (Exception e2) {
                HMLog.i(d, "keepWeatherInfos: " + e2, new Object[0]);
            }
            HMLog.i(d, "cityInfo null.", new Object[0]);
            return;
        }
        if (autoLocate) {
            locationKey = cityInfoG.getLocationKey();
            if (this.a.getAqiInfo() != null) {
                this.b.setAqiInfo(this.a.getAqiInfo());
            }
            if (weatherSettingProxyK2.needForecast() && this.a.getForecastWeatherInfos() != null) {
                this.b.setForecastWeatherInfos(this.a.getForecastWeatherInfos());
            }
            if (this.a.getRealtimeWeatherInfo() != null) {
                this.b.setRealtimeWeatherInfo(this.a.getRealtimeWeatherInfo());
            }
        }
        String str = locationKey;
        boolean z4 = this.b.getCityInfo() == null || !TextUtils.equals(cityInfoG.getLocationKey(), this.b.getCityInfo().getLocationKey());
        List<ForecastWeatherInfo> listR = r(str, this.b.getForecastWeatherInfos(), z4, boundDeviceSource);
        HMLog.i(d, "forecast for device: " + listR, new Object[0]);
        List<AlertInfo> listD = null;
        if (LocWeatherManager.getInstance().k().isSupportHuamiWeatherService()) {
            boolean z5 = z4;
            List<Object> listH = h(this.b.getRealtimeWeatherInfo(), this.b.getAqiInfo(), str, z4, boundDeviceSource);
            try {
                realtimeWeatherInfoI = (RealtimeWeatherInfo) listH.get(0);
                try {
                    aqiInfo = (AqiInfo) listH.get(1);
                } catch (Exception e3) {
                    e = e3;
                    HMLog.i(d, "device realAqi cast exception: " + e, new Object[0]);
                    aqiInfo = null;
                }
            } catch (Exception e4) {
                e = e4;
                realtimeWeatherInfoI = null;
            }
            z2 = z5;
        } else {
            z2 = z4;
            AqiInfo aqiInfoE = e(this.b.getAqiInfo(), str, zA, z2);
            realtimeWeatherInfoI = i(this.b.getRealtimeWeatherInfo(), str, zA, z2);
            aqiInfo = aqiInfoE;
        }
        HMLog.i(d, "realTime for device: " + realtimeWeatherInfoI, new Object[0]);
        HMLog.i(d, "aqi for device: " + aqiInfo, new Object[0]);
        HMLog.i(d, "hasAlert: " + k(str), new Object[0]);
        if (!z && k(str)) {
            listD = d(this.b.getAlertInfos(), str, z2, boundDeviceSource);
        }
        List<AlertInfo> list = listD;
        HMLog.i(d, "alert for device: " + list, new Object[0]);
        if (this.b == null) {
            this.b = new WeatherInfos();
        }
        this.b.setCityInfo(cityInfoG);
        if (aqiInfo != null) {
            this.b.setAqiInfo(aqiInfo);
        } else {
            AqiInfo aqiInfo2 = this.b.getAqiInfo();
            if (aqiInfo2 != null) {
                aqiInfo2.setSuccess(false);
            }
        }
        if (realtimeWeatherInfoI != null) {
            this.b.setRealtimeWeatherInfo(realtimeWeatherInfoI);
        } else {
            RealtimeWeatherInfo realtimeWeatherInfo = this.b.getRealtimeWeatherInfo();
            if (realtimeWeatherInfo != null) {
                realtimeWeatherInfo.setSuccess(false);
            }
        }
        if (listR == null || listR.size() <= 0) {
            List<ForecastWeatherInfo> forecastWeatherInfos = this.b.getForecastWeatherInfos();
            if (forecastWeatherInfos != null && forecastWeatherInfos.size() > 0) {
                forecastWeatherInfos.get(0).setSuccess(false);
            }
        } else {
            this.b.setForecastWeatherInfos(listR);
        }
        if (list == null || list.size() <= 0) {
            List<AlertInfo> alertInfos = this.b.getAlertInfos();
            if (alertInfos != null && alertInfos.size() > 0) {
                alertInfos.get(0).setSuccess(false);
            }
        } else {
            this.b.setAlertInfos(list);
        }
        this.b.setLastUpdateTime(System.currentTimeMillis());
        HMLog.i(d, "updateWeatherInfoForDevice success.", new Object[0]);
        if (!this.b.isSuccess() && z3) {
            HMLog.i(d, "delay 5min to retry.", new Object[0]);
            LocWeatherManager.getInstance().getHandler().postDelayed(new Runnable() { // from class: yo3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.m();
                }
            }, 300000L);
        }
        LocWeatherKeeper.d(this.b.toJsonString());
        EventBus.getDefault().postSticky(new WeatherUpdateEvent(this.b));
    }

    public void t() {
        WeatherSettingProxy weatherSettingProxyK = LocWeatherManager.getInstance().k();
        boolean autoLocate = weatherSettingProxyK.getAutoLocate();
        String locationKey = weatherSettingProxyK.getLocationKey();
        if (!autoLocate) {
            HMLog.i(d, "manual", new Object[0]);
            s(false);
            return;
        }
        if (!TextUtils.isEmpty(locationKey)) {
            HMLog.i(d, "old user, change to manual", new Object[0]);
            weatherSettingProxyK.setAutoLocate(false);
            s(false);
            return;
        }
        HMLog.i(d, "new user", new Object[0]);
        WeatherSettingProxy weatherSettingProxyK2 = LocWeatherManager.getInstance().k();
        if (!weatherSettingProxyK2.isConnected() || weatherSettingProxyK2.supportHuamiOSWeather()) {
            return;
        }
        this.b.setLastUpdateTime(System.currentTimeMillis());
        CityInfo cityInfo = this.b.getCityInfo();
        if (cityInfo == null) {
            cityInfo = new CityInfo();
        }
        cityInfo.setName(CITY_NAME_KOREA);
        this.b.setCityInfo(cityInfo);
        LocWeatherKeeper.d(this.b.toJsonString());
        EventBus.getDefault().postSticky(new WeatherUpdateEvent(this.b));
    }

    public UpdateLocationStrategy u(MyLocation myLocation, boolean z) {
        List<ForecastWeatherInfo> listR;
        RealtimeWeatherInfo realtimeWeatherInfoI;
        boolean zA = ConfigurationHolder.a();
        if (!NetUtil.isNetworkConnected(ConfigurationHolder.getContext())) {
            HMLog.i(d, "network disable.", new Object[0]);
            return new CannotUpdate("Network disable");
        }
        WeatherSettingProxy weatherSettingProxyK = LocWeatherManager.getInstance().k();
        int boundDeviceSource = weatherSettingProxyK.getBoundDeviceSource();
        HMLog.d("coderJay", "source: " + boundDeviceSource + ", locationKey: " + LocWeatherManager.getInstance().k().getLocationKey(), new Object[0]);
        WeatherInfos weatherInfos = this.a;
        if (weatherInfos == null) {
            return CanUpdate.INSTANCE;
        }
        CityInfo cityInfoUpdateCityInfo = updateCityInfo(myLocation, weatherInfos.getCityInfo(), boundDeviceSource);
        if (cityInfoUpdateCityInfo == null && !NetUtil.isNetworkConnected(ConfigurationHolder.getContext())) {
            return new CannotUpdate("Network disable when update city");
        }
        if (cityInfoUpdateCityInfo == null || TextUtils.isEmpty(cityInfoUpdateCityInfo.getLocationKey())) {
            HMLog.i(d, "cityInfo null.", new Object[0]);
            return CanUpdate.INSTANCE;
        }
        if (z) {
            this.a.setCityInfo(cityInfoUpdateCityInfo);
            HMLog.i(d, "updateLocation success.", new Object[0]);
            LocWeatherKeeper.c(this.a.toJsonString());
            EventBus.getDefault().postSticky(this.a);
            return CanUpdate.INSTANCE;
        }
        if (weatherSettingProxyK.supportHuamiOSWeather()) {
            this.a.setCityInfo(cityInfoUpdateCityInfo);
            weatherSettingProxyK.handleAutoLocate(this.a);
            WeatherTimer.getInstance().releaseWakeLock();
            q();
            return CanUpdate.INSTANCE;
        }
        boolean z2 = this.a.getCityInfo() == null || !TextUtils.equals(cityInfoUpdateCityInfo.getLocationKey(), this.a.getCityInfo().getLocationKey());
        HMLog.i(d, "locationChanged: " + z2, new Object[0]);
        String locationKey = cityInfoUpdateCityInfo.getLocationKey();
        AqiInfo aqiInfoE = null;
        if (weatherSettingProxyK.needForecast()) {
            listR = r(locationKey, this.a.getForecastWeatherInfos(), z2, boundDeviceSource);
            HMLog.i(d, "forecast: " + listR, new Object[0]);
        } else {
            listR = null;
        }
        if (LocWeatherManager.getInstance().k().isSupportHuamiWeatherService()) {
            List<Object> listH = h(this.a.getRealtimeWeatherInfo(), this.a.getAqiInfo(), locationKey, z2, boundDeviceSource);
            try {
                realtimeWeatherInfoI = (RealtimeWeatherInfo) listH.get(0);
                try {
                    aqiInfoE = (AqiInfo) listH.get(1);
                } catch (Exception e2) {
                    e = e2;
                    HMLog.i(d, "realAqi cast exception: " + e, new Object[0]);
                }
            } catch (Exception e3) {
                e = e3;
                realtimeWeatherInfoI = null;
            }
        } else {
            aqiInfoE = weatherSettingProxyK.needAqi() ? e(this.a.getAqiInfo(), locationKey, zA, z2) : null;
            realtimeWeatherInfoI = i(this.a.getRealtimeWeatherInfo(), locationKey, zA, z2);
        }
        HMLog.i(d, "aqi: " + aqiInfoE, new Object[0]);
        HMLog.i(d, "realtime: " + realtimeWeatherInfoI, new Object[0]);
        if (this.a == null) {
            this.a = new WeatherInfos();
        }
        this.a.setCityInfo(cityInfoUpdateCityInfo);
        if (aqiInfoE != null) {
            this.a.setAqiInfo(aqiInfoE);
        } else {
            AqiInfo aqiInfo = this.a.getAqiInfo();
            if (aqiInfo != null) {
                aqiInfo.setSuccess(false);
            }
        }
        if (listR == null || listR.size() <= 0) {
            List<ForecastWeatherInfo> forecastWeatherInfos = this.a.getForecastWeatherInfos();
            if (forecastWeatherInfos != null && forecastWeatherInfos.size() > 0) {
                forecastWeatherInfos.get(0).setSuccess(false);
            }
        } else {
            this.a.setForecastWeatherInfos(listR);
        }
        if (realtimeWeatherInfoI != null) {
            this.a.setRealtimeWeatherInfo(realtimeWeatherInfoI);
        } else {
            RealtimeWeatherInfo realtimeWeatherInfo = this.a.getRealtimeWeatherInfo();
            if (realtimeWeatherInfo != null) {
                realtimeWeatherInfo.setSuccess(false);
            }
        }
        q();
        return CanUpdate.INSTANCE;
    }

    @VisibleForTesting
    public CityInfo updateCityInfo(MyLocation myLocation, CityInfo cityInfo, int i) {
        CityInfo cityInfo2;
        if (TextUtils.equals(LocWeatherKeeper.getCurrLanguage(), LocWeatherKeeper.getLanguage())) {
            cityInfo2 = cityInfo;
        } else {
            cityInfo2 = null;
            LocWeatherKeeper.setLanguage(LocWeatherKeeper.getCurrLanguage());
        }
        if (cityInfo2 == null) {
            HMLog.i(d, "update cityInfo for cache null.", new Object[0]);
            Location location = new Location("hm_location");
            location.setLongitude(myLocation.getLongitude());
            location.setLatitude(myLocation.getLatitude());
            return WeatherAPINewKt.getCityInfo(location, i, cityInfo);
        }
        MyLocation lastLocation = LocWeatherKeeper.getLastLocation();
        boolean z = true;
        if (lastLocation == null) {
            HMLog.i(d, "update cityInfo for last location null.", new Object[0]);
        } else if (!TextUtils.equals(myLocation.getAddress().getSubLocality(), lastLocation.getAddress().getSubLocality())) {
            HMLog.i(d, "update cityInfo for admin changed.", new Object[0]);
        } else if (DistanceUtil.a(lastLocation, myLocation)) {
            HMLog.i(d, "update cityInfo for distance > 10km.", new Object[0]);
        } else {
            z = false;
        }
        if (!z) {
            HMLog.i(d, "use cached cityInfo.", new Object[0]);
            return cityInfo2;
        }
        Location location2 = new Location("hm_location");
        location2.setLongitude(myLocation.getLongitude());
        location2.setLatitude(myLocation.getLatitude());
        return WeatherAPINewKt.getCityInfo(location2, i, cityInfo);
    }
}
