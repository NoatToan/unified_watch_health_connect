package com.xiaomi.hm.health.device.model;

import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.huami.account.HMLoginManager;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HmLocale;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.model.WeatherSettingClient;
import com.xiaomi.hm.health.devicex.manage.api.config.NightModeConfigApi;
import com.xiaomi.hm.health.locweather.ConfigurationHolder;
import com.xiaomi.hm.health.locweather.HMWeatherUpdater;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.utils.WeatherUtils;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
public class WeatherSettingClient implements IWeatherSettingCallback {
    private static final String c = "WeatherSettingClient";
    private static final DeviceManagerApi d = ManagerFunctionsKt.getDeviceManagerApi();
    private static final DeviceUtilsApi e = (DeviceUtilsApi) KoinJavaComponent.get(DeviceUtilsApi.class);
    public Lazy<IZeppOSWeatherHandler> a = KoinJavaComponent.inject(IZeppOSWeatherHandler.class);
    private final Lazy<NightModeConfigApi> b = KoinJavaComponent.inject(NightModeConfigApi.class);

    @NonNull
    private WeatherSetting b() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        if (hMPersonInfo == null) {
            return new WeatherSetting();
        }
        HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
        return miliConfig == null ? new WeatherSetting() : WeatherSetting.fromJsonString(miliConfig.getWeatherSetting());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(LocationManager locationManager) {
        return "all provider: " + locationManager.getAllProviders();
    }

    private void d() {
        boolean zCheckPermission = e.checkPermission("android.permission.ACCESS_FINE_LOCATION");
        final LocationManager locationManager = (LocationManager) ConfigurationHolder.getContext().getSystemService("location");
        boolean z = locationManager != null && locationManager.isProviderEnabled("gps");
        boolean z2 = locationManager != null && locationManager.isProviderEnabled("network");
        boolean z3 = locationManager != null && locationManager.isProviderEnabled("passive");
        if (locationManager != null) {
            HMLog.info(c, new Function0() { // from class: ro8
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return WeatherSettingClient.c(locationManager);
                }
            });
        }
        HMLog.i(c, "locationPermission: " + zCheckPermission + ", gps: " + z + ", network: " + z2 + ", passive: " + z3, new Object[0]);
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean debug() {
        return false;
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public String getAffiliation() {
        return b().getAffiliation();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean getAutoLocate() {
        return b().getAutoLocate();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public int getBoundDeviceSource() {
        return d.getBoundDeviceSource(HMDeviceType.MILI).getValue();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public String getCity() {
        return b().getCity();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public Locale getDeviceLanguageToLocale() {
        HMBaseDevice device = d.getDevice(HMDeviceType.MILI);
        if (device == null) {
            return Locale.getDefault();
        }
        DeviceInfo deviceInfo = device.getDeviceInfo();
        if (deviceInfo == null || !deviceInfo.getLanguageComBination().isSupportDeviceSettings()) {
            return Locale.getDefault();
        }
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        if (otherVersion == null) {
            return Locale.getDefault();
        }
        int language = -1;
        try {
            language = otherVersion.getLanguage().getLanguage();
            return HmLocale.getLocale(language);
        } catch (Throwable th) {
            th.printStackTrace();
            HMLog.i(c, th.getMessage() + " ;currentDeviceLanguage:" + language, new Object[0]);
            return Locale.getDefault();
        }
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public String getLocationKey() {
        return b().getLocationKey();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public int getTemperatureUnit() {
        return b().getTemperatureUnit();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public void handleAutoLocate(WeatherInfos weatherInfos) {
        this.a.getValue().handleAutoLocate(weatherInfos);
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public void handleWeatherSetting() {
        WeatherSetting weatherSettingB = b();
        if ((WeatherUtils.isXiaomiSeries() && !weatherSettingB.a()) || (!WeatherUtils.isXiaomiSeries() && weatherSettingB.a())) {
            HMLog.i(c, "bind: " + WeatherUtils.isXiaomiSeries() + ", weatherSetting: " + weatherSettingB.a() + ", autoLocate: " + weatherSettingB.getAutoLocate(), new Object[0]);
            HMWeatherUpdater.getInstance().getWeatherInfos().setCityInfo(null);
            weatherSettingB.setIsNeedMigrationWeatherWay(WeatherUtils.isXiaomiSeries());
            weatherSettingB.setAutoLocate(true);
            weatherSettingB.setLocationKey("");
            weatherSettingB.setCity("");
            weatherSettingB.setAffiliation("");
        }
        if (HMPersonInfo.getInstance().getUserInfo() == null) {
            return;
        }
        HMPersonInfo.getInstance().getMiliConfig().setWeatherSetting(weatherSettingB.toJsonString());
        HMPersonInfo.getInstance().saveInfo(2);
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isAlertEnable() {
        return b().isAlertEnable();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isConnected() {
        HMBaseDevice miliDevice = d.getMiliDevice();
        return miliDevice != null && miliDevice.isConnected();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isForeground() {
        return DeviceXFunctionsKt.getAppStateApi().isForeground();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isGlobal() {
        return !HMLoginManager.isMainlandUser();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isKoreaUser() {
        return WeatherUtils.isKoreaUser();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isLocationOn() {
        d();
        DeviceUtilsApi deviceUtilsApi = e;
        return deviceUtilsApi.checkPermission("android.permission.ACCESS_FINE_LOCATION") && deviceUtilsApi.isLocationServerOpen();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isPersonInfoReady() {
        if (!HMLoginManager.isUserValid()) {
            HMLog.i(c, "user not valid", new Object[0]);
            return false;
        }
        if (HMDaoManager.getInstance() == null) {
            HMLog.i(c, "HMDaoManager is null", new Object[0]);
            return false;
        }
        if (HMDaoManager.getInstance().getDaoSession().getUserInfosDao().load(String.valueOf(HMLoginManager.getValidUid())) != null) {
            return true;
        }
        HMLog.i(c, "userInfo is null", new Object[0]);
        return false;
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isSupportHuamiWeatherService() {
        return true;
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isUserValid() {
        return HMLoginManager.isUserValid();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean isZepp() {
        return GlobalConfig.get().isBuildMidong();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean needAddress() {
        return !GlobalConfig.get().isBuildPlay() && HMLoginManager.isMainlandUser();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean needAqi() {
        return !e.shouldHideDiscovery();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean needDeviceWeather() {
        return true;
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean needForecast() {
        if (HMDeviceConfig.hasFeatureBackLight()) {
            return this.b.getValue().needForecast();
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public void setAutoLocate(boolean z) {
        WeatherSetting weatherSettingB = b();
        weatherSettingB.setAutoLocate(z);
        HMPersonInfo.getInstance().getMiliConfig().setWeatherSetting(weatherSettingB.toJsonString());
        HMPersonInfo.getInstance().saveInfo(2);
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean shouldRequestLocation() {
        return !GPSDataController.getInstance().isRunning();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean supportDeviceWeather() {
        return HMDeviceConfig.hasFeatureWeatherDevice();
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    @WorkerThread
    public boolean supportHuamiOSWeather() {
        HMBaseDevice miliDevice = d.getMiliDevice();
        if (miliDevice instanceof HMMiLiProDevice) {
            return ((HMMiLiProDevice) miliDevice).supportHuamiOSWeather();
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.locweather.proxy.IWeatherSettingCallback
    public boolean supportWeatherCityOptimize() {
        return true;
    }
}
