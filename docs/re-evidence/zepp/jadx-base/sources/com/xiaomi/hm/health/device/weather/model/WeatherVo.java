package com.xiaomi.hm.health.device.weather.model;

import android.text.TextUtils;
import com.xiaomi.hm.health.device.weather.other.WeatherItemType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/weather/model/WeatherVo;", "", "other", "", "equals", "", "hashCode", "Lcom/xiaomi/hm/health/device/weather/other/WeatherItemType;", "component1", "", "component2", "component3", "type", "city", "locationKey", "copy", "toString", "a", "Lcom/xiaomi/hm/health/device/weather/other/WeatherItemType;", "getType", "()Lcom/xiaomi/hm/health/device/weather/other/WeatherItemType;", "b", "Ljava/lang/String;", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "c", "getLocationKey", "<init>", "(Lcom/xiaomi/hm/health/device/weather/other/WeatherItemType;Ljava/lang/String;Ljava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeatherVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final WeatherItemType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String city;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String locationKey;

    public WeatherVo(@NotNull WeatherItemType weatherItemType, @NotNull String str, @NotNull String str2) {
        this.type = weatherItemType;
        this.city = str;
        this.locationKey = str2;
    }

    public static /* synthetic */ WeatherVo copy$default(WeatherVo weatherVo, WeatherItemType weatherItemType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            weatherItemType = weatherVo.type;
        }
        if ((i & 2) != 0) {
            str = weatherVo.city;
        }
        if ((i & 4) != 0) {
            str2 = weatherVo.locationKey;
        }
        return weatherVo.copy(weatherItemType, str, str2);
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

    @NotNull
    public final WeatherVo copy(@NotNull WeatherItemType type, @NotNull String city, @NotNull String locationKey) {
        return new WeatherVo(type, city, locationKey);
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

    @NotNull
    public String toString() {
        return "WeatherVo(type=" + this.type + ", city=" + this.city + ", locationKey=" + this.locationKey + ")";
    }
}
