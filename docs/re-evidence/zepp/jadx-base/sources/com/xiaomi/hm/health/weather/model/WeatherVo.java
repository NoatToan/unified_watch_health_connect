package com.xiaomi.hm.health.weather.model;

import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.weather.other.WeatherItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\tHÖ\u0001R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/weather/model/WeatherVo;", "", "other", "", "equals", "", "hashCode", "Lcom/xiaomi/hm/health/weather/other/WeatherItemType;", "component1", "", "component2", "component3", "component4", "type", "city", "locationKey", "defaultCity", "copy", "toString", "a", "Lcom/xiaomi/hm/health/weather/other/WeatherItemType;", "getType", "()Lcom/xiaomi/hm/health/weather/other/WeatherItemType;", "setType", "(Lcom/xiaomi/hm/health/weather/other/WeatherItemType;)V", "b", "Ljava/lang/String;", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "c", "getLocationKey", "setLocationKey", GoogleApiAvailabilityLight.a, "Z", "getDefaultCity", "()Z", "setDefaultCity", "(Z)V", "<init>", "(Lcom/xiaomi/hm/health/weather/other/WeatherItemType;Ljava/lang/String;Ljava/lang/String;Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeatherVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private WeatherItemType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String city;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String locationKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean defaultCity;

    public WeatherVo(@NotNull WeatherItemType weatherItemType, @NotNull String str, @NotNull String str2, boolean z) {
        this.type = weatherItemType;
        this.city = str;
        this.locationKey = str2;
        this.defaultCity = z;
    }

    public static /* synthetic */ WeatherVo copy$default(WeatherVo weatherVo, WeatherItemType weatherItemType, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            weatherItemType = weatherVo.type;
        }
        if ((i & 2) != 0) {
            str = weatherVo.city;
        }
        if ((i & 4) != 0) {
            str2 = weatherVo.locationKey;
        }
        if ((i & 8) != 0) {
            z = weatherVo.defaultCity;
        }
        return weatherVo.copy(weatherItemType, str, str2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WeatherItemType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLocationKey() {
        return this.locationKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDefaultCity() {
        return this.defaultCity;
    }

    @NotNull
    public final WeatherVo copy(@NotNull WeatherItemType type, @NotNull String city, @NotNull String locationKey, boolean defaultCity) {
        return new WeatherVo(type, city, locationKey, defaultCity);
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof WeatherVo) {
            return TextUtils.equals(((WeatherVo) other).locationKey, this.locationKey);
        }
        return false;
    }

    @NotNull
    public final String getCity() {
        return this.city;
    }

    public final boolean getDefaultCity() {
        return this.defaultCity;
    }

    @NotNull
    public final String getLocationKey() {
        return this.locationKey;
    }

    @NotNull
    public final WeatherItemType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.city.hashCode()) * 31) + this.locationKey.hashCode();
    }

    public final void setCity(@NotNull String str) {
        this.city = str;
    }

    public final void setDefaultCity(boolean z) {
        this.defaultCity = z;
    }

    public final void setLocationKey(@NotNull String str) {
        this.locationKey = str;
    }

    public final void setType(@NotNull WeatherItemType weatherItemType) {
        this.type = weatherItemType;
    }

    @NotNull
    public String toString() {
        return "WeatherVo(type=" + this.type + ", city=" + this.city + ", locationKey=" + this.locationKey + ", defaultCity=" + this.defaultCity + ")";
    }

    public /* synthetic */ WeatherVo(WeatherItemType weatherItemType, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(weatherItemType, str, str2, (i & 8) != 0 ? false : z);
    }
}
