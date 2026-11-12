package com.xiaomi.hm.health.locweather.proxy;

import androidx.annotation.WorkerThread;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class WeatherSettingProxy implements IWeatherSettingCallback {
    private IWeatherSettingCallback a;

    public WeatherSettingProxy(IWeatherSettingCallback iWeatherSettingCallback) {
        this.a = iWeatherSettingCallback;
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean debug() {
        return this.a.debug();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public String getAffiliation() {
        return this.a.getAffiliation();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean getAutoLocate() {
        return this.a.getAutoLocate();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public int getBoundDeviceSource() {
        return this.a.getBoundDeviceSource();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public String getCity() {
        return this.a.getCity();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public Locale getDeviceLanguageToLocale() {
        return this.a.getDeviceLanguageToLocale();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public String getLocationKey() {
        return this.a.getLocationKey();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public int getTemperatureUnit() {
        return this.a.getTemperatureUnit();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public void handleAutoLocate(WeatherInfos weatherInfos) {
        this.a.handleAutoLocate(weatherInfos);
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public void handleWeatherSetting() {
        this.a.handleWeatherSetting();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isAlertEnable() {
        return this.a.isAlertEnable();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isConnected() {
        return this.a.isConnected();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isForeground() {
        return this.a.isForeground();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isGlobal() {
        return this.a.isGlobal();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isKoreaUser() {
        return this.a.isKoreaUser();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isLocationOn() {
        return this.a.isLocationOn();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isPersonInfoReady() {
        return this.a.isPersonInfoReady();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isSupportHuamiWeatherService() {
        return this.a.isSupportHuamiWeatherService();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isUserValid() {
        return this.a.isUserValid();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isZepp() {
        return this.a.isZepp();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean needAddress() {
        return this.a.needAddress();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean needAqi() {
        return this.a.needAqi();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean needDeviceWeather() {
        return this.a.needDeviceWeather();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean needForecast() {
        return this.a.needForecast();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public void setAutoLocate(boolean z) {
        this.a.setAutoLocate(z);
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean shouldRequestLocation() {
        return this.a.shouldRequestLocation();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean supportDeviceWeather() {
        return this.a.supportDeviceWeather();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    @WorkerThread
    public boolean supportHuamiOSWeather() {
        return this.a.supportHuamiOSWeather();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean supportWeatherCityOptimize() {
        return this.a.supportWeatherCityOptimize();
    }
}
