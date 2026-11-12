package com.xiaomi.hm.health.device.service;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HmLocale;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertApp;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.weather.ExtensionInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMForecastWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMRealtimeAqi;
import com.xiaomi.hm.health.bt.profile.weather.HMRealtimeWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMSunriseSunsetInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMWindAndHumidityInfo;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.device.service.UpdateWeatherWrapper;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.locweather.HMWeatherUpdater;
import com.xiaomi.hm.health.locweather.WeatherTimer;
import com.xiaomi.hm.health.locweather.model.AlertInfo;
import com.xiaomi.hm.health.locweather.model.AqiInfo;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.locweather.model.ForecastWeatherInfo;
import com.xiaomi.hm.health.locweather.model.RealtimeWeatherInfo;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import com.xiaomi.hm.health.model.account.HMNightModeConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.utils.WeatherUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class UpdateWeatherWrapper {
    private static final String a = "UpdateWeatherWrapper";
    private static final int b = 30;
    private static final int c = 34;

    public class a extends HMCallback {
        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            HMLog.i(UpdateWeatherWrapper.a, "setWeatherInfo:" + result, new Object[0]);
            WeatherTimer.getInstance().releaseWakeLock();
        }
    }

    public class b extends HMCallback {
        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            HMLog.i(UpdateWeatherWrapper.a, "setSunriseSunset: " + result, new Object[0]);
        }
    }

    private static boolean g(WeatherInfos weatherInfos) {
        return !TextUtils.equals(HMWeatherUpdater.CITY_NAME_KOREA, (weatherInfos == null || weatherInfos.getCityInfo() == null) ? null : weatherInfos.getCityInfo().getName()) || WeatherUtils.isKoreaUser();
    }

    public static Locale getLocale(HMMiLiProDevice device) {
        final HMLanguage hMLanguageFromSystemLanguage = HMDeviceUtils.fromSystemLanguage();
        DeviceInfo deviceInfo = device.getDeviceInfo();
        if (deviceInfo != null) {
            HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
            if (otherVersion != null) {
                hMLanguageFromSystemLanguage = otherVersion.getLanguage();
            } else {
                HMLog.i(a, "getLocale otherVersion is null!!!", new Object[0]);
            }
        } else {
            HMLog.i(a, "getLocale device info is null!!!", new Object[0]);
        }
        HMLog.info(a, new Function0() { // from class: k38
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return UpdateWeatherWrapper.m(hMLanguageFromSystemLanguage);
            }
        });
        return j(hMLanguageFromSystemLanguage);
    }

    private static int h(int xiaomiWeather) {
        if (xiaomiWeather == 301) {
            return 34;
        }
        return xiaomiWeather;
    }

    private static ExtensionInfo i(RealtimeWeatherInfo realtimeWeatherInfo) {
        int uvi = realtimeWeatherInfo.getUvi();
        int humidity = (int) realtimeWeatherInfo.getHumidity();
        int windGrade = WeatherUtils.getWindGrade(realtimeWeatherInfo.getWindSpeed());
        Feature feature = Feature.SUPPORT_PM;
        ExtensionInfo extensionInfo = new ExtensionInfo(uvi, humidity, windGrade, -1.0f, ConfigHelperKt.hasMiliFeature(feature) ? realtimeWeatherInfo.getPm25() : -1, ConfigHelperKt.hasMiliFeature(feature) ? realtimeWeatherInfo.getPm10() : -1);
        HMLog.i(a, "extensionInfo: " + extensionInfo, new Object[0]);
        return extensionInfo;
    }

    private static Locale j(@Nullable HMLanguage hmLanguage) {
        if (hmLanguage == null) {
            return Locale.SIMPLIFIED_CHINESE;
        }
        if (hmLanguage.getLanguage() == 24) {
            HMLog.info(new Function0() { // from class: o38
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return UpdateWeatherWrapper.n();
                }
            });
            HmLocale hmLocale = HmLocale.Serbian;
            return new Locale(hmLocale.getLang(), hmLocale.getCountry());
        }
        try {
            return HmLocale.getLocale(hmLanguage.getLanguage());
        } catch (Throwable th) {
            HMLog.i(a, "getLocaleFromLanguage: " + th.toString(), new Object[0]);
            return Locale.ENGLISH;
        }
    }

    private static HMSunriseSunsetInfo k(WeatherInfos infos) {
        ForecastWeatherInfo next;
        List<ForecastWeatherInfo> forecastWeatherInfos = infos.getForecastWeatherInfos();
        if (forecastWeatherInfos != null && forecastWeatherInfos.size() != 0) {
            Iterator<ForecastWeatherInfo> it2 = forecastWeatherInfos.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!TimeUtils.isToday(next.getDate()));
            if (next == null) {
                return null;
            }
            Calendar sunriseTime = next.getSunriseTime();
            Calendar sunsetTime = next.getSunsetTime();
            if (sunriseTime != null && sunsetTime != null) {
                HMSunriseSunsetInfo hMSunriseSunsetInfo = new HMSunriseSunsetInfo();
                hMSunriseSunsetInfo.setPubTime(next.getPubTime());
                hMSunriseSunsetInfo.setSunRiseHour(next.getSunriseTime().get(11));
                hMSunriseSunsetInfo.setSunRiseMinute(next.getSunriseTime().get(12));
                hMSunriseSunsetInfo.setSunSetHour(next.getSunsetTime().get(11));
                hMSunriseSunsetInfo.setSunSetMinute(next.getSunsetTime().get(12));
                return hMSunriseSunsetInfo;
            }
        }
        return null;
    }

    private static boolean l(HMMiLiProDevice device) {
        DeviceInfo deviceInfo = device.getDeviceInfo();
        boolean z = true;
        if (deviceInfo != null && deviceInfo.isMiLiPeyto() && deviceInfo.getFirmwareVersion() <= 2080) {
            z = false;
        }
        HMLog.d(a, "isUseDescription:" + z + "; device info: " + deviceInfo, new Object[0]);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m(HMLanguage hMLanguage) {
        return "language: " + hMLanguage.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n() {
        return "getLocale for SR";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(HMMiLiProDevice hMMiLiProDevice) {
        return "device info: " + hMMiLiProDevice.getDeviceInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p(Locale locale) {
        return "locale: " + locale + " language: " + locale.getLanguage();
    }

    private static int s(int tempC) {
        return (int) ((((double) tempC) * 1.8d) + 32.0d);
    }

    public static void syncSunriseSunsetInfo2Device(WeatherInfos infos) {
        HMMiLiProDevice hMMiLiProDevice;
        HMSunriseSunsetInfo hMSunriseSunsetInfoX = x(infos);
        if (hMSunriseSunsetInfoX == null || (hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI)) == null || !hMMiLiProDevice.isConnected()) {
            return;
        }
        hMMiLiProDevice.setSunriseSunset(hMSunriseSunsetInfoX, new b());
    }

    public static boolean syncSunriseSunsetInfo2DeviceBlock(HMMiLiProDevice device, WeatherInfos infos) {
        HMSunriseSunsetInfo hMSunriseSunsetInfoX = x(infos);
        return hMSunriseSunsetInfoX != null && device.setSunriseSunsetSync(hMSunriseSunsetInfoX);
    }

    private static HMRealtimeAqi t(AqiInfo info, boolean useDescription, Locale locale) {
        HMRealtimeAqi hMRealtimeAqi = new HMRealtimeAqi();
        hMRealtimeAqi.setPubTime(info.getPubTime());
        hMRealtimeAqi.setAqi(info.getAqi());
        if (useDescription) {
            hMRealtimeAqi.setAqiDescription(WeatherUtils.getAqiDescription(locale, info));
        }
        return hMRealtimeAqi;
    }

    private static ArrayList<HMForecastWeatherInfo> u(List<ForecastWeatherInfo> infoList, boolean useDescription, Locale locale) {
        ArrayList<HMForecastWeatherInfo> arrayList = new ArrayList<>();
        for (ForecastWeatherInfo forecastWeatherInfo : infoList) {
            HMForecastWeatherInfo hMForecastWeatherInfo = new HMForecastWeatherInfo(forecastWeatherInfo.getDate());
            int temperatureFrom = forecastWeatherInfo.getTemperatureFrom();
            int temperatureTo = forecastWeatherInfo.getTemperatureTo();
            if (WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting()).getTemperatureUnit() == 1) {
                temperatureFrom = s(temperatureFrom);
                temperatureTo = s(temperatureTo);
            }
            hMForecastWeatherInfo.setMinTemperature(temperatureFrom < temperatureTo ? temperatureFrom : temperatureTo);
            if (temperatureFrom <= temperatureTo) {
                temperatureFrom = temperatureTo;
            }
            hMForecastWeatherInfo.setMaxTemperature(temperatureFrom);
            hMForecastWeatherInfo.setPubTime(forecastWeatherInfo.getPubTime());
            hMForecastWeatherInfo.setWeatherFrom(h(forecastWeatherInfo.getWeatherFrom()));
            hMForecastWeatherInfo.setWeatherTo(h(forecastWeatherInfo.getWeatherTo()));
            if (useDescription) {
                hMForecastWeatherInfo.setWeatherDescription(WeatherUtils.getForecastWeatherDescription(locale, forecastWeatherInfo));
            }
            arrayList.add(hMForecastWeatherInfo);
        }
        return arrayList;
    }

    public static boolean updateWeatherToDevice(final WeatherInfos infos) {
        DeviceInfo deviceInfo;
        if (!g(infos)) {
            HMLog.i(a, "unSupport city name", new Object[0]);
            return false;
        }
        if (infos == null) {
            HMLog.i(a, "weatherInfos null", new Object[0]);
        }
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected() || (deviceInfo = hMMiLiDevice.getDeviceInfo()) == null || !HMDeviceConfig.hasFeatureWeather(deviceInfo.getDeviceSource())) {
            return false;
        }
        HMLog.d(a, "update weather for show weather device", new Object[0]);
        final HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) hMMiLiDevice;
        final boolean zL = l(hMMiLiProDevice);
        HMLog.info(a, new Function0() { // from class: j38
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return UpdateWeatherWrapper.o(hMMiLiProDevice);
            }
        });
        final Locale locale = getLocale(hMMiLiProDevice);
        HMLog.info(a, new Function0() { // from class: n38
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return UpdateWeatherWrapper.p(locale);
            }
        });
        hMMiLiProDevice.setWeatherInfo(new Function0() { // from class: l38
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return UpdateWeatherWrapper.y(infos, zL, locale);
            }
        }, new a());
        weatherAlert(hMMiLiProDevice, infos.getAlertInfos());
        return true;
    }

    public static boolean updateWeatherToDeviceBlock(HMMiLiProDevice device, final WeatherInfos infos) {
        if (!g(infos)) {
            HMLog.i(a, "unSupport city name", new Object[0]);
            return false;
        }
        final boolean zL = l(device);
        final Locale locale = getLocale(device);
        boolean weatherInfoSync = device.setWeatherInfoSync(new Function0() { // from class: m38
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return UpdateWeatherWrapper.y(infos, zL, locale);
            }
        });
        HMLog.i(a, "setWeatherInfoSync:" + weatherInfoSync, new Object[0]);
        return weatherInfoSync;
    }

    private static HMRealtimeWeatherInfo v(RealtimeWeatherInfo info, boolean useDescription, Locale locale) {
        HMRealtimeWeatherInfo hMRealtimeWeatherInfo = new HMRealtimeWeatherInfo();
        hMRealtimeWeatherInfo.setPubTime(info.getPubTime());
        int currentTemperature = info.getCurrentTemperature();
        if (WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting()).getTemperatureUnit() == 1) {
            currentTemperature = s(currentTemperature);
        }
        hMRealtimeWeatherInfo.setTemprature(currentTemperature);
        hMRealtimeWeatherInfo.setWeather(h(info.getCurrentWeather()));
        if (useDescription) {
            hMRealtimeWeatherInfo.setWeatherDescription(WeatherUtils.getRealtimeWeatherDescription(locale, info.getCurrentWeather()));
        }
        if (ConfigHelperKt.hasFeature(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI), Feature.SUPPORT_UVI)) {
            hMRealtimeWeatherInfo.setUvi(info.getUvi());
        }
        return hMRealtimeWeatherInfo;
    }

    private static HMWindAndHumidityInfo w(RealtimeWeatherInfo info, Locale locale) {
        int windGrade = WeatherUtils.getWindGrade(info.getWindSpeed());
        HMWindAndHumidityInfo hMWindAndHumidityInfo = new HMWindAndHumidityInfo(WeatherUtils.getWindDescription(locale, windGrade, info.getWindDirection()), WeatherUtils.getHumidity(locale, info.getHumidity()));
        hMWindAndHumidityInfo.setHumidity((int) info.getHumidity());
        hMWindAndHumidityInfo.setWindLevel(windGrade);
        hMWindAndHumidityInfo.setPubTime(info.getPubTime());
        return hMWindAndHumidityInfo;
    }

    public static void weatherAlert(HMMiLiProDevice device, List<AlertInfo> alertInfos) {
        if (!WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting()).isAlertEnable() || alertInfos == null || alertInfos.size() == 0) {
            return;
        }
        Set<String> alertIds = HMKeeper.getAlertIds();
        HashSet hashSet = new HashSet();
        for (AlertInfo alertInfo : alertInfos) {
            String strValueOf = String.valueOf(alertInfo.getAlertId());
            if (alertIds == null || !alertIds.contains(strValueOf)) {
                HMAlertModeExt hMAlertModeExt = new HMAlertModeExt(HMAlertApp.WEATHER_ALERT, alertInfo.getTitle(), alertInfo.getDetail());
                hMAlertModeExt.setAppName(DeviceXFunctionsKt.getContext().getString(R.string.weather_alert_app_name));
                device.alert(hMAlertModeExt, new HMCallback(false));
                hashSet.add(strValueOf);
            }
        }
        if (alertIds != null && alertIds.size() > 0 && alertIds.size() < 30) {
            hashSet.addAll(alertIds);
        }
        HMKeeper.saveAlertIds(hashSet);
    }

    private static HMSunriseSunsetInfo x(WeatherInfos infos) {
        List<ForecastWeatherInfo> forecastWeatherInfos;
        ForecastWeatherInfo next;
        if (infos == null) {
            return null;
        }
        HMNightModeConfig hMNightModeConfigFromJsonString = HMNightModeConfig.fromJsonString();
        HMLog.d(a, "config: " + hMNightModeConfigFromJsonString, new Object[0]);
        if (hMNightModeConfigFromJsonString.getNightMode() == 1 && HMDeviceConfig.hasFeatureBackLight() && (forecastWeatherInfos = infos.getForecastWeatherInfos()) != null && forecastWeatherInfos.size() != 0) {
            Iterator<ForecastWeatherInfo> it2 = forecastWeatherInfos.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!TimeUtils.isToday(next.getDate()));
            if (next == null) {
                return null;
            }
            Calendar sunriseTime = next.getSunriseTime();
            Calendar sunsetTime = next.getSunsetTime();
            if (sunriseTime != null && sunsetTime != null) {
                HMSunriseSunsetInfo hMSunriseSunsetInfo = new HMSunriseSunsetInfo();
                hMSunriseSunsetInfo.setPubTime(next.getPubTime());
                hMSunriseSunsetInfo.setSunRiseHour(next.getSunriseTime().get(11));
                hMSunriseSunsetInfo.setSunRiseMinute(next.getSunriseTime().get(12));
                hMSunriseSunsetInfo.setSunSetHour(next.getSunsetTime().get(11));
                hMSunriseSunsetInfo.setSunSetMinute(next.getSunsetTime().get(12));
                return hMSunriseSunsetInfo;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HMWeatherInfo y(WeatherInfos infos, boolean useDescription, Locale locale) {
        HMWeatherInfo hMWeatherInfo = new HMWeatherInfo();
        CityInfo cityInfo = infos.getCityInfo();
        if (cityInfo != null) {
            hMWeatherInfo.setCityInfo(cityInfo.getName());
        }
        hMWeatherInfo.setTempUnit((byte) (WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting()).getTemperatureUnit() != 1 ? 0 : 1));
        List<ForecastWeatherInfo> forecastWeatherInfos = infos.getForecastWeatherInfos();
        StringBuilder sb = new StringBuilder();
        sb.append("ForecastWeatherInfo size:");
        sb.append(forecastWeatherInfos != null ? forecastWeatherInfos.size() : 0);
        HMLog.i(a, sb.toString(), new Object[0]);
        if (forecastWeatherInfos != null && forecastWeatherInfos.size() > 0) {
            hMWeatherInfo.setForecastInfo(u(forecastWeatherInfos, useDescription, locale));
        }
        AqiInfo aqiInfo = infos.getAqiInfo();
        HMLog.i(a, "aqiInfo:" + aqiInfo, new Object[0]);
        if (aqiInfo != null) {
            hMWeatherInfo.setAqiInfo(t(aqiInfo, useDescription, locale));
        }
        RealtimeWeatherInfo realtimeWeatherInfo = infos.getRealtimeWeatherInfo();
        HMLog.i(a, "realtimeWeatherInfo:" + realtimeWeatherInfo, new Object[0]);
        if (realtimeWeatherInfo != null) {
            hMWeatherInfo.setRealtimeInfo(v(realtimeWeatherInfo, useDescription, locale));
            if (HMDeviceConfig.hasFeatureHumidityWind()) {
                hMWeatherInfo.setWindAndHumidityInfo(w(realtimeWeatherInfo, locale));
            }
            hMWeatherInfo.setExtensionInfo(i(realtimeWeatherInfo));
        }
        if (HMDeviceConfig.hasFeatureWeatherSunSetSunRise()) {
            hMWeatherInfo.setSunriseSunsetInfo(k(infos));
        }
        return hMWeatherInfo;
    }
}
