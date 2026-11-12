package com.xiaomi.hm.health.locweather.huami_weather_bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR$\u0010%\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0010\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/locweather/huami_weather_bean/CurrentWeatherModel;", "", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/UnitValue;", "a", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/UnitValue;", "getHumidity", "()Lcom/xiaomi/hm/health/locweather/huami_weather_bean/UnitValue;", "setHumidity", "(Lcom/xiaomi/hm/health/locweather/huami_weather_bean/UnitValue;)V", "humidity", "b", "getPressure", "setPressure", "pressure", "", "c", "Ljava/lang/String;", "getPubTime", "()Ljava/lang/String;", "setPubTime", "(Ljava/lang/String;)V", "pubTime", GoogleApiAvailabilityLight.a, "getTemperature", "setTemperature", "temperature", "e", "getUvIndex", "setUvIndex", "uvIndex", "f", "getVisibility", "setVisibility", "visibility", "g", "getWeather", "setWeather", "weather", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Wind;", "h", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Wind;", "getWind", "()Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Wind;", "setWind", "(Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Wind;)V", "wind", "<init>", "()V", "locweather_release"}, k = 1, mv = {1, 5, 1})
public final class CurrentWeatherModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("humidity")
    @Nullable
    private UnitValue humidity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("pressure")
    @Nullable
    private UnitValue pressure;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("pubTime")
    @Nullable
    private String pubTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("temperature")
    @Nullable
    private UnitValue temperature;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("uvIndex")
    @Nullable
    private String uvIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("visibility")
    @Nullable
    private UnitValue visibility;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("weather")
    @Nullable
    private String weather = "0";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("wind")
    @Nullable
    private Wind wind;

    @Nullable
    public final UnitValue getHumidity() {
        return this.humidity;
    }

    @Nullable
    public final UnitValue getPressure() {
        return this.pressure;
    }

    @Nullable
    public final String getPubTime() {
        return this.pubTime;
    }

    @Nullable
    public final UnitValue getTemperature() {
        return this.temperature;
    }

    @Nullable
    public final String getUvIndex() {
        return this.uvIndex;
    }

    @Nullable
    public final UnitValue getVisibility() {
        return this.visibility;
    }

    @Nullable
    public final String getWeather() {
        return this.weather;
    }

    @Nullable
    public final Wind getWind() {
        return this.wind;
    }

    public final void setHumidity(@Nullable UnitValue unitValue) {
        this.humidity = unitValue;
    }

    public final void setPressure(@Nullable UnitValue unitValue) {
        this.pressure = unitValue;
    }

    public final void setPubTime(@Nullable String str) {
        this.pubTime = str;
    }

    public final void setTemperature(@Nullable UnitValue unitValue) {
        this.temperature = unitValue;
    }

    public final void setUvIndex(@Nullable String str) {
        this.uvIndex = str;
    }

    public final void setVisibility(@Nullable UnitValue unitValue) {
        this.visibility = unitValue;
    }

    public final void setWeather(@Nullable String str) {
        this.weather = str;
    }

    public final void setWind(@Nullable Wind wind) {
        this.wind = wind;
    }
}
