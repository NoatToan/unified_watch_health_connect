package com.xiaomi.hm.health.device.weather.model;

import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ4\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\t¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/weather/model/WeatherSettingVo;", "", "", "component1", "()Ljava/lang/Boolean;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "component2", "", "component3", "()Ljava/lang/Integer;", "weatherAlarmSwitch", "currentLocatedCity", "weatherTempUnit", "copy", "(Ljava/lang/Boolean;Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;Ljava/lang/Integer;)Lcom/xiaomi/hm/health/device/weather/model/WeatherSettingVo;", "", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/Boolean;", "getWeatherAlarmSwitch", "b", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "getCurrentLocatedCity", "()Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "c", "Ljava/lang/Integer;", "getWeatherTempUnit", "<init>", "(Ljava/lang/Boolean;Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;Ljava/lang/Integer;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeatherSettingVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean weatherAlarmSwitch;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final City currentLocatedCity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer weatherTempUnit;

    public WeatherSettingVo() {
        this(null, null, null, 7, null);
    }

    public WeatherSettingVo(@Nullable Boolean bool, @Nullable City city, @Nullable Integer num) {
        this.weatherAlarmSwitch = bool;
        this.currentLocatedCity = city;
        this.weatherTempUnit = num;
    }

    public static /* synthetic */ WeatherSettingVo copy$default(WeatherSettingVo weatherSettingVo, Boolean bool, City city, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = weatherSettingVo.weatherAlarmSwitch;
        }
        if ((i & 2) != 0) {
            city = weatherSettingVo.currentLocatedCity;
        }
        if ((i & 4) != 0) {
            num = weatherSettingVo.weatherTempUnit;
        }
        return weatherSettingVo.copy(bool, city, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getWeatherAlarmSwitch() {
        return this.weatherAlarmSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final City getCurrentLocatedCity() {
        return this.currentLocatedCity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getWeatherTempUnit() {
        return this.weatherTempUnit;
    }

    @NotNull
    public final WeatherSettingVo copy(@Nullable Boolean weatherAlarmSwitch, @Nullable City currentLocatedCity, @Nullable Integer weatherTempUnit) {
        return new WeatherSettingVo(weatherAlarmSwitch, currentLocatedCity, weatherTempUnit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeatherSettingVo)) {
            return false;
        }
        WeatherSettingVo weatherSettingVo = (WeatherSettingVo) other;
        return Intrinsics.areEqual(this.weatherAlarmSwitch, weatherSettingVo.weatherAlarmSwitch) && Intrinsics.areEqual(this.currentLocatedCity, weatherSettingVo.currentLocatedCity) && Intrinsics.areEqual(this.weatherTempUnit, weatherSettingVo.weatherTempUnit);
    }

    @Nullable
    public final City getCurrentLocatedCity() {
        return this.currentLocatedCity;
    }

    @Nullable
    public final Boolean getWeatherAlarmSwitch() {
        return this.weatherAlarmSwitch;
    }

    @Nullable
    public final Integer getWeatherTempUnit() {
        return this.weatherTempUnit;
    }

    public int hashCode() {
        Boolean bool = this.weatherAlarmSwitch;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        City city = this.currentLocatedCity;
        int iHashCode2 = (iHashCode + (city == null ? 0 : city.hashCode())) * 31;
        Integer num = this.weatherTempUnit;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WeatherSettingVo(weatherAlarmSwitch=" + this.weatherAlarmSwitch + ", currentLocatedCity=" + this.currentLocatedCity + ", weatherTempUnit=" + this.weatherTempUnit + ")";
    }

    public /* synthetic */ WeatherSettingVo(Boolean bool, City city, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : city, (i & 4) != 0 ? null : num);
    }
}
