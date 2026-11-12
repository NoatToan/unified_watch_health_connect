package com.xiaomi.fitness.sync.export.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sync/export/model/CurrentWeatherModel;", "", DialWidgetType.HUMIDITY, "Lcom/xiaomi/fitness/sync/export/model/Unit;", "pressure", "temperature", "visibility", "weather", "", "pubTime", "uvIndex", "wind", "Lcom/xiaomi/fitness/sync/export/model/Wind;", "<init>", "(Lcom/xiaomi/fitness/sync/export/model/Unit;Lcom/xiaomi/fitness/sync/export/model/Unit;Lcom/xiaomi/fitness/sync/export/model/Unit;Lcom/xiaomi/fitness/sync/export/model/Unit;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/sync/export/model/Wind;)V", "getHumidity", "()Lcom/xiaomi/fitness/sync/export/model/Unit;", "getPressure", "getTemperature", "getVisibility", "getWeather", "()Ljava/lang/String;", "getPubTime", "getUvIndex", "getWind", "()Lcom/xiaomi/fitness/sync/export/model/Wind;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CurrentWeatherModel {

    @SerializedName(DialWidgetType.HUMIDITY)
    @NotNull
    private final Unit humidity;

    @SerializedName("pressure")
    @NotNull
    private final Unit pressure;

    @SerializedName("pubTime")
    @NotNull
    private final String pubTime;

    @SerializedName("temperature")
    @NotNull
    private final Unit temperature;

    @SerializedName("uvIndex")
    @NotNull
    private final String uvIndex;

    @SerializedName("visibility")
    @NotNull
    private final Unit visibility;

    @SerializedName("weather")
    @NotNull
    private final String weather;

    @SerializedName("wind")
    @NotNull
    private final Wind wind;

    public CurrentWeatherModel(@NotNull Unit humidity, @NotNull Unit pressure, @NotNull Unit temperature, @NotNull Unit visibility, @NotNull String weather, @NotNull String pubTime, @NotNull String uvIndex, @NotNull Wind wind) {
        Intrinsics.checkNotNullParameter(humidity, "humidity");
        Intrinsics.checkNotNullParameter(pressure, "pressure");
        Intrinsics.checkNotNullParameter(temperature, "temperature");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(weather, "weather");
        Intrinsics.checkNotNullParameter(pubTime, "pubTime");
        Intrinsics.checkNotNullParameter(uvIndex, "uvIndex");
        Intrinsics.checkNotNullParameter(wind, "wind");
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        this.visibility = visibility;
        this.weather = weather;
        this.pubTime = pubTime;
        this.uvIndex = uvIndex;
        this.wind = wind;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Unit getHumidity() {
        return this.humidity;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Unit getPressure() {
        return this.pressure;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Unit getTemperature() {
        return this.temperature;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Unit getVisibility() {
        return this.visibility;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWeather() {
        return this.weather;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPubTime() {
        return this.pubTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUvIndex() {
        return this.uvIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Wind getWind() {
        return this.wind;
    }

    @NotNull
    public final CurrentWeatherModel copy(@NotNull Unit humidity, @NotNull Unit pressure, @NotNull Unit temperature, @NotNull Unit visibility, @NotNull String weather, @NotNull String pubTime, @NotNull String uvIndex, @NotNull Wind wind) {
        Intrinsics.checkNotNullParameter(humidity, "humidity");
        Intrinsics.checkNotNullParameter(pressure, "pressure");
        Intrinsics.checkNotNullParameter(temperature, "temperature");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(weather, "weather");
        Intrinsics.checkNotNullParameter(pubTime, "pubTime");
        Intrinsics.checkNotNullParameter(uvIndex, "uvIndex");
        Intrinsics.checkNotNullParameter(wind, "wind");
        return new CurrentWeatherModel(humidity, pressure, temperature, visibility, weather, pubTime, uvIndex, wind);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentWeatherModel)) {
            return false;
        }
        CurrentWeatherModel currentWeatherModel = (CurrentWeatherModel) other;
        return Intrinsics.areEqual(this.humidity, currentWeatherModel.humidity) && Intrinsics.areEqual(this.pressure, currentWeatherModel.pressure) && Intrinsics.areEqual(this.temperature, currentWeatherModel.temperature) && Intrinsics.areEqual(this.visibility, currentWeatherModel.visibility) && Intrinsics.areEqual(this.weather, currentWeatherModel.weather) && Intrinsics.areEqual(this.pubTime, currentWeatherModel.pubTime) && Intrinsics.areEqual(this.uvIndex, currentWeatherModel.uvIndex) && Intrinsics.areEqual(this.wind, currentWeatherModel.wind);
    }

    @NotNull
    public final Unit getHumidity() {
        return this.humidity;
    }

    @NotNull
    public final Unit getPressure() {
        return this.pressure;
    }

    @NotNull
    public final String getPubTime() {
        return this.pubTime;
    }

    @NotNull
    public final Unit getTemperature() {
        return this.temperature;
    }

    @NotNull
    public final String getUvIndex() {
        return this.uvIndex;
    }

    @NotNull
    public final Unit getVisibility() {
        return this.visibility;
    }

    @NotNull
    public final String getWeather() {
        return this.weather;
    }

    @NotNull
    public final Wind getWind() {
        return this.wind;
    }

    public int hashCode() {
        return (((((((((((((this.humidity.hashCode() * 31) + this.pressure.hashCode()) * 31) + this.temperature.hashCode()) * 31) + this.visibility.hashCode()) * 31) + this.weather.hashCode()) * 31) + this.pubTime.hashCode()) * 31) + this.uvIndex.hashCode()) * 31) + this.wind.hashCode();
    }

    @NotNull
    public String toString() {
        return "CurrentWeatherModel(humidity=" + this.humidity + ", pressure=" + this.pressure + ", temperature=" + this.temperature + ", visibility=" + this.visibility + ", weather=" + this.weather + ", pubTime=" + this.pubTime + ", uvIndex=" + this.uvIndex + ", wind=" + this.wind + ")";
    }
}
