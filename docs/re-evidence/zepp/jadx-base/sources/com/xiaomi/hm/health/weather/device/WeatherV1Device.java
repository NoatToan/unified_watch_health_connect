package com.xiaomi.hm.health.weather.device;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherModule;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/weather/device/WeatherV1Device;", "Lcom/xiaomi/hm/health/weather/device/WeatherDevice;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "city", "", "updateLocateCity", "addCity", "setDefaultCity", "supportDefaultCity", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "module", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingModule", "", "version", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WeatherV1Device extends WeatherDevice {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "add city return as duplicated";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "not support default city";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "update located city failed as city is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "supper.update city failed";
        }
    }

    public WeatherV1Device(@NotNull WeatherModule weatherModule, @NotNull SettingsModule settingsModule, int i) {
        super(weatherModule, settingsModule, i);
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean addCity(@NotNull City city) {
        if (!(!getCityList$devicex_zeppRelease().isEmpty()) && getLocatedCity() == null) {
            return updateLocateCity(city);
        }
        List<City> cityList$devicex_zeppRelease = getCityList$devicex_zeppRelease();
        boolean z = false;
        if (!(cityList$devicex_zeppRelease instanceof Collection) || !cityList$devicex_zeppRelease.isEmpty()) {
            Iterator<T> it2 = cityList$devicex_zeppRelease.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual((City) it2.next(), city)) {
                    z = true;
                    break;
                }
            }
        }
        if (z || Intrinsics.areEqual(getLocatedCity(), city)) {
            HMLog.info(WeatherDevice.TAG, a.a);
            return true;
        }
        boolean zModifyCity = getModule().modifyCity(city, true);
        if (zModifyCity) {
            getCityList$devicex_zeppRelease().add(city);
        }
        return zModifyCity;
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean setDefaultCity(@NotNull City city) {
        HMLog.info(WeatherDevice.TAG, b.a);
        return true;
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean supportDefaultCity() {
        return false;
    }

    @Override // com.xiaomi.hm.health.weather.device.WeatherDevice, com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean updateLocateCity(@Nullable City city) {
        boolean z = false;
        if (city == null) {
            HMLog.info(WeatherDevice.TAG, c.a);
            return false;
        }
        boolean zUpdateLocateCity = super.updateLocateCity(city);
        if (!zUpdateLocateCity) {
            HMLog.info(WeatherDevice.TAG, d.a);
            return zUpdateLocateCity;
        }
        if (!getCityList$devicex_zeppRelease().contains(city)) {
            return zUpdateLocateCity;
        }
        if (zUpdateLocateCity && deleteCity(city)) {
            z = true;
        }
        return z;
    }
}
