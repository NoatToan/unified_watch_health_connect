package com.xiaomi.hm.health.locweather.proxy;

import androidx.annotation.WorkerThread;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public interface IWeatherSettingCallback {
    boolean debug();

    String getAffiliation();

    boolean getAutoLocate();

    int getBoundDeviceSource();

    String getCity();

    Locale getDeviceLanguageToLocale();

    String getLocationKey();

    int getTemperatureUnit();

    void handleAutoLocate(WeatherInfos weatherInfos);

    void handleWeatherSetting();

    boolean isAlertEnable();

    boolean isConnected();

    boolean isForeground();

    boolean isGlobal();

    boolean isKoreaUser();

    boolean isLocationOn();

    boolean isPersonInfoReady();

    boolean isSupportHuamiWeatherService();

    boolean isUserValid();

    boolean isZepp();

    boolean needAddress();

    boolean needAqi();

    boolean needDeviceWeather();

    boolean needForecast();

    void setAutoLocate(boolean z);

    boolean shouldRequestLocation();

    boolean supportDeviceWeather();

    @WorkerThread
    boolean supportHuamiOSWeather();

    boolean supportWeatherCityOptimize();
}
