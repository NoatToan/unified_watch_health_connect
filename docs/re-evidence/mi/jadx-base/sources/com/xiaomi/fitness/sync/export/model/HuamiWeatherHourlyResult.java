package com.xiaomi.fitness.sync.export.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003Js\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/sync/export/model/HuamiWeatherHourlyResult;", "", "pubTime", "", "weather", "", "temperature", "fxTime", "windDirection", "windSpeed", "windScale", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getPubTime", "()Ljava/lang/String;", "getWeather", "()Ljava/util/List;", "getTemperature", "getFxTime", "getWindDirection", "getWindSpeed", "getWindScale", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HuamiWeatherHourlyResult {

    @SerializedName("fxTime")
    @NotNull
    private final List<String> fxTime;

    @SerializedName("pubTime")
    @NotNull
    private final String pubTime;

    @SerializedName("temperature")
    @NotNull
    private final List<String> temperature;

    @SerializedName("weather")
    @NotNull
    private final List<String> weather;

    @SerializedName("windDirection")
    @NotNull
    private final List<String> windDirection;

    @SerializedName("windScale")
    @NotNull
    private final List<String> windScale;

    @SerializedName("windSpeed")
    @NotNull
    private final List<String> windSpeed;

    public HuamiWeatherHourlyResult(@NotNull String pubTime, @NotNull List<String> weather, @NotNull List<String> temperature, @NotNull List<String> fxTime, @NotNull List<String> windDirection, @NotNull List<String> windSpeed, @NotNull List<String> windScale) {
        Intrinsics.checkNotNullParameter(pubTime, "pubTime");
        Intrinsics.checkNotNullParameter(weather, "weather");
        Intrinsics.checkNotNullParameter(temperature, "temperature");
        Intrinsics.checkNotNullParameter(fxTime, "fxTime");
        Intrinsics.checkNotNullParameter(windDirection, "windDirection");
        Intrinsics.checkNotNullParameter(windSpeed, "windSpeed");
        Intrinsics.checkNotNullParameter(windScale, "windScale");
        this.pubTime = pubTime;
        this.weather = weather;
        this.temperature = temperature;
        this.fxTime = fxTime;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.windScale = windScale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HuamiWeatherHourlyResult copy$default(HuamiWeatherHourlyResult huamiWeatherHourlyResult, String str, List list, List list2, List list3, List list4, List list5, List list6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = huamiWeatherHourlyResult.pubTime;
        }
        if ((i & 2) != 0) {
            list = huamiWeatherHourlyResult.weather;
        }
        List list7 = list;
        if ((i & 4) != 0) {
            list2 = huamiWeatherHourlyResult.temperature;
        }
        List list8 = list2;
        if ((i & 8) != 0) {
            list3 = huamiWeatherHourlyResult.fxTime;
        }
        List list9 = list3;
        if ((i & 16) != 0) {
            list4 = huamiWeatherHourlyResult.windDirection;
        }
        List list10 = list4;
        if ((i & 32) != 0) {
            list5 = huamiWeatherHourlyResult.windSpeed;
        }
        List list11 = list5;
        if ((i & 64) != 0) {
            list6 = huamiWeatherHourlyResult.windScale;
        }
        return huamiWeatherHourlyResult.copy(str, list7, list8, list9, list10, list11, list6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPubTime() {
        return this.pubTime;
    }

    @NotNull
    public final List<String> component2() {
        return this.weather;
    }

    @NotNull
    public final List<String> component3() {
        return this.temperature;
    }

    @NotNull
    public final List<String> component4() {
        return this.fxTime;
    }

    @NotNull
    public final List<String> component5() {
        return this.windDirection;
    }

    @NotNull
    public final List<String> component6() {
        return this.windSpeed;
    }

    @NotNull
    public final List<String> component7() {
        return this.windScale;
    }

    @NotNull
    public final HuamiWeatherHourlyResult copy(@NotNull String pubTime, @NotNull List<String> weather, @NotNull List<String> temperature, @NotNull List<String> fxTime, @NotNull List<String> windDirection, @NotNull List<String> windSpeed, @NotNull List<String> windScale) {
        Intrinsics.checkNotNullParameter(pubTime, "pubTime");
        Intrinsics.checkNotNullParameter(weather, "weather");
        Intrinsics.checkNotNullParameter(temperature, "temperature");
        Intrinsics.checkNotNullParameter(fxTime, "fxTime");
        Intrinsics.checkNotNullParameter(windDirection, "windDirection");
        Intrinsics.checkNotNullParameter(windSpeed, "windSpeed");
        Intrinsics.checkNotNullParameter(windScale, "windScale");
        return new HuamiWeatherHourlyResult(pubTime, weather, temperature, fxTime, windDirection, windSpeed, windScale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HuamiWeatherHourlyResult)) {
            return false;
        }
        HuamiWeatherHourlyResult huamiWeatherHourlyResult = (HuamiWeatherHourlyResult) other;
        return Intrinsics.areEqual(this.pubTime, huamiWeatherHourlyResult.pubTime) && Intrinsics.areEqual(this.weather, huamiWeatherHourlyResult.weather) && Intrinsics.areEqual(this.temperature, huamiWeatherHourlyResult.temperature) && Intrinsics.areEqual(this.fxTime, huamiWeatherHourlyResult.fxTime) && Intrinsics.areEqual(this.windDirection, huamiWeatherHourlyResult.windDirection) && Intrinsics.areEqual(this.windSpeed, huamiWeatherHourlyResult.windSpeed) && Intrinsics.areEqual(this.windScale, huamiWeatherHourlyResult.windScale);
    }

    @NotNull
    public final List<String> getFxTime() {
        return this.fxTime;
    }

    @NotNull
    public final String getPubTime() {
        return this.pubTime;
    }

    @NotNull
    public final List<String> getTemperature() {
        return this.temperature;
    }

    @NotNull
    public final List<String> getWeather() {
        return this.weather;
    }

    @NotNull
    public final List<String> getWindDirection() {
        return this.windDirection;
    }

    @NotNull
    public final List<String> getWindScale() {
        return this.windScale;
    }

    @NotNull
    public final List<String> getWindSpeed() {
        return this.windSpeed;
    }

    public int hashCode() {
        return (((((((((((this.pubTime.hashCode() * 31) + this.weather.hashCode()) * 31) + this.temperature.hashCode()) * 31) + this.fxTime.hashCode()) * 31) + this.windDirection.hashCode()) * 31) + this.windSpeed.hashCode()) * 31) + this.windScale.hashCode();
    }

    @NotNull
    public String toString() {
        return "HuamiWeatherHourlyResult(pubTime=" + this.pubTime + ", weather=" + this.weather + ", temperature=" + this.temperature + ", fxTime=" + this.fxTime + ", windDirection=" + this.windDirection + ", windSpeed=" + this.windSpeed + ", windScale=" + this.windScale + ")";
    }
}
