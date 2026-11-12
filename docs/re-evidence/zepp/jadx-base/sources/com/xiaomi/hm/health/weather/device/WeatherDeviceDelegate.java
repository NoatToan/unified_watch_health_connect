package com.xiaomi.hm.health.weather.device;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherModule;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u001b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b$\u0010%J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/weather/device/WeatherDeviceDelegate;", "Lcom/xiaomi/hm/health/weather/device/IWeatherDevice;", "", PointCategory.INIT, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "city", "", "updateLocateCity", "", "loadProtocolVersion", "addCity", "", "loadCityList", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", "loadWeatherSetting", "getTempUnit", "alert", "setAlert", "tempUnit", "setTempUnit", "deleteCity", "setDefaultCity", "supportDefaultCity", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "a", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "weatherModule", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "b", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingModule", "Lcom/xiaomi/hm/health/weather/device/WeatherDevice;", "c", "Lcom/xiaomi/hm/health/weather/device/WeatherDevice;", "weatherDevice", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WeatherDeviceDelegate implements IWeatherDevice {

    @NotNull
    private static final String d = "WeatherDeviceDelegate";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final WeatherModule weatherModule;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final SettingsModule settingModule;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private WeatherDevice weatherDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "weather module is: " + WeatherDeviceDelegate.this.weatherModule + ", setting module is: " + WeatherDeviceDelegate.this.settingModule;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "weather version: " + this.a;
        }
    }

    public WeatherDeviceDelegate(@Nullable WeatherModule weatherModule, @Nullable SettingsModule settingsModule) {
        this.weatherModule = weatherModule;
        this.settingModule = settingsModule;
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean addCity(@NotNull City city) {
        WeatherDevice weatherDevice = this.weatherDevice;
        if (weatherDevice == null) {
            return false;
        }
        return weatherDevice.addCity(city);
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean deleteCity(@NotNull City city) {
        WeatherDevice weatherDevice = this.weatherDevice;
        if (weatherDevice == null) {
            return false;
        }
        return weatherDevice.deleteCity(city);
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public int getTempUnit() {
        WeatherDevice weatherDevice = this.weatherDevice;
        if (weatherDevice == null) {
            return 0;
        }
        return weatherDevice.getTempUnit();
    }

    @Nullable
    public final Object init(@NotNull Continuation<? super Unit> continuation) {
        Integer numQueryVersion;
        WeatherModule weatherModule = this.weatherModule;
        int iIntValue = (weatherModule == null || (numQueryVersion = weatherModule.queryVersion()) == null) ? 1 : numQueryVersion.intValue();
        if (this.weatherModule == null || this.settingModule == null) {
            HMLog.info(d, new a());
            return Unit.INSTANCE;
        }
        HMLog.info(d, new b(iIntValue));
        WeatherDevice weatherV1Device = iIntValue == 1 ? new WeatherV1Device(this.weatherModule, this.settingModule, iIntValue) : new WeatherV2Device(this.weatherModule, this.settingModule, iIntValue);
        this.weatherDevice = weatherV1Device;
        Object objInit = weatherV1Device.init(continuation);
        return objInit == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objInit : Unit.INSTANCE;
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    @NotNull
    public List<City> loadCityList() {
        WeatherDevice weatherDevice = this.weatherDevice;
        List<City> listLoadCityList = weatherDevice == null ? null : weatherDevice.loadCityList();
        return listLoadCityList == null ? CollectionsKt__CollectionsKt.emptyList() : listLoadCityList;
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public int loadProtocolVersion() {
        WeatherDevice weatherDevice = this.weatherDevice;
        if (weatherDevice == null) {
            return 1;
        }
        return weatherDevice.loadProtocolVersion();
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    @NotNull
    public WeatherSetting loadWeatherSetting() {
        WeatherDevice weatherDevice = this.weatherDevice;
        WeatherSetting weatherSettingLoadWeatherSetting = weatherDevice == null ? null : weatherDevice.loadWeatherSetting();
        return weatherSettingLoadWeatherSetting == null ? new WeatherSetting(null, null, null, 7, null) : weatherSettingLoadWeatherSetting;
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean setAlert(boolean alert) {
        WeatherDevice weatherDevice = this.weatherDevice;
        if (weatherDevice == null) {
            return false;
        }
        return weatherDevice.setAlert(alert);
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean setDefaultCity(@NotNull City city) {
        WeatherDevice weatherDevice = this.weatherDevice;
        if (weatherDevice == null) {
            return false;
        }
        return weatherDevice.setDefaultCity(city);
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean setTempUnit(int tempUnit) {
        WeatherDevice weatherDevice = this.weatherDevice;
        if (weatherDevice == null) {
            return false;
        }
        return weatherDevice.setTempUnit(tempUnit);
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean supportDefaultCity() {
        WeatherDevice weatherDevice = this.weatherDevice;
        if (weatherDevice == null) {
            return false;
        }
        return weatherDevice.supportDefaultCity();
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean updateLocateCity(@Nullable City city) {
        WeatherDevice weatherDevice = this.weatherDevice;
        if (weatherDevice == null) {
            return false;
        }
        return weatherDevice.updateLocateCity(city);
    }
}
