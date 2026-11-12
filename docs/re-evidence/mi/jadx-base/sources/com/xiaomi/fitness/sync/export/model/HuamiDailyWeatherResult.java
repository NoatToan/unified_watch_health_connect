package com.xiaomi.fitness.sync.export.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003Jc\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\nHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/sync/export/model/HuamiDailyWeatherResult;", "", "sunRiseSet", "", "Lcom/xiaomi/fitness/sync/export/model/Direction;", "temperature", "weather", "windDirection", "windSpeed", "pubTime", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getSunRiseSet", "()Ljava/util/List;", "getTemperature", "getWeather", "getWindDirection", "getWindSpeed", "getPubTime", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HuamiDailyWeatherResult {

    @SerializedName("pubTime")
    @NotNull
    private final String pubTime;

    @SerializedName("sunRiseSet")
    @NotNull
    private final List<Direction> sunRiseSet;

    @SerializedName("temperature")
    @NotNull
    private final List<Direction> temperature;

    @SerializedName("weather")
    @NotNull
    private final List<Direction> weather;

    @SerializedName("windDirection")
    @NotNull
    private final List<Direction> windDirection;

    @SerializedName("windSpeed")
    @NotNull
    private final List<Direction> windSpeed;

    public HuamiDailyWeatherResult(@NotNull List<Direction> sunRiseSet, @NotNull List<Direction> temperature, @NotNull List<Direction> weather, @NotNull List<Direction> windDirection, @NotNull List<Direction> windSpeed, @NotNull String pubTime) {
        Intrinsics.checkNotNullParameter(sunRiseSet, "sunRiseSet");
        Intrinsics.checkNotNullParameter(temperature, "temperature");
        Intrinsics.checkNotNullParameter(weather, "weather");
        Intrinsics.checkNotNullParameter(windDirection, "windDirection");
        Intrinsics.checkNotNullParameter(windSpeed, "windSpeed");
        Intrinsics.checkNotNullParameter(pubTime, "pubTime");
        this.sunRiseSet = sunRiseSet;
        this.temperature = temperature;
        this.weather = weather;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.pubTime = pubTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HuamiDailyWeatherResult copy$default(HuamiDailyWeatherResult huamiDailyWeatherResult, List list, List list2, List list3, List list4, List list5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = huamiDailyWeatherResult.sunRiseSet;
        }
        if ((i & 2) != 0) {
            list2 = huamiDailyWeatherResult.temperature;
        }
        List list6 = list2;
        if ((i & 4) != 0) {
            list3 = huamiDailyWeatherResult.weather;
        }
        List list7 = list3;
        if ((i & 8) != 0) {
            list4 = huamiDailyWeatherResult.windDirection;
        }
        List list8 = list4;
        if ((i & 16) != 0) {
            list5 = huamiDailyWeatherResult.windSpeed;
        }
        List list9 = list5;
        if ((i & 32) != 0) {
            str = huamiDailyWeatherResult.pubTime;
        }
        return huamiDailyWeatherResult.copy(list, list6, list7, list8, list9, str);
    }

    @NotNull
    public final List<Direction> component1() {
        return this.sunRiseSet;
    }

    @NotNull
    public final List<Direction> component2() {
        return this.temperature;
    }

    @NotNull
    public final List<Direction> component3() {
        return this.weather;
    }

    @NotNull
    public final List<Direction> component4() {
        return this.windDirection;
    }

    @NotNull
    public final List<Direction> component5() {
        return this.windSpeed;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPubTime() {
        return this.pubTime;
    }

    @NotNull
    public final HuamiDailyWeatherResult copy(@NotNull List<Direction> sunRiseSet, @NotNull List<Direction> temperature, @NotNull List<Direction> weather, @NotNull List<Direction> windDirection, @NotNull List<Direction> windSpeed, @NotNull String pubTime) {
        Intrinsics.checkNotNullParameter(sunRiseSet, "sunRiseSet");
        Intrinsics.checkNotNullParameter(temperature, "temperature");
        Intrinsics.checkNotNullParameter(weather, "weather");
        Intrinsics.checkNotNullParameter(windDirection, "windDirection");
        Intrinsics.checkNotNullParameter(windSpeed, "windSpeed");
        Intrinsics.checkNotNullParameter(pubTime, "pubTime");
        return new HuamiDailyWeatherResult(sunRiseSet, temperature, weather, windDirection, windSpeed, pubTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HuamiDailyWeatherResult)) {
            return false;
        }
        HuamiDailyWeatherResult huamiDailyWeatherResult = (HuamiDailyWeatherResult) other;
        return Intrinsics.areEqual(this.sunRiseSet, huamiDailyWeatherResult.sunRiseSet) && Intrinsics.areEqual(this.temperature, huamiDailyWeatherResult.temperature) && Intrinsics.areEqual(this.weather, huamiDailyWeatherResult.weather) && Intrinsics.areEqual(this.windDirection, huamiDailyWeatherResult.windDirection) && Intrinsics.areEqual(this.windSpeed, huamiDailyWeatherResult.windSpeed) && Intrinsics.areEqual(this.pubTime, huamiDailyWeatherResult.pubTime);
    }

    @NotNull
    public final String getPubTime() {
        return this.pubTime;
    }

    @NotNull
    public final List<Direction> getSunRiseSet() {
        return this.sunRiseSet;
    }

    @NotNull
    public final List<Direction> getTemperature() {
        return this.temperature;
    }

    @NotNull
    public final List<Direction> getWeather() {
        return this.weather;
    }

    @NotNull
    public final List<Direction> getWindDirection() {
        return this.windDirection;
    }

    @NotNull
    public final List<Direction> getWindSpeed() {
        return this.windSpeed;
    }

    public int hashCode() {
        return (((((((((this.sunRiseSet.hashCode() * 31) + this.temperature.hashCode()) * 31) + this.weather.hashCode()) * 31) + this.windDirection.hashCode()) * 31) + this.windSpeed.hashCode()) * 31) + this.pubTime.hashCode();
    }

    @NotNull
    public String toString() {
        return "HuamiDailyWeatherResult(sunRiseSet=" + this.sunRiseSet + ", temperature=" + this.temperature + ", weather=" + this.weather + ", windDirection=" + this.windDirection + ", windSpeed=" + this.windSpeed + ", pubTime=" + this.pubTime + ")";
    }
}
