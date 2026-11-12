package com.xiaomi.hm.health.locweather.huami_weather_bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/locweather/huami_weather_bean/ForecastWeatherInfoBean;", "", "", "a", "Ljava/lang/String;", "getPubTime", "()Ljava/lang/String;", "setPubTime", "(Ljava/lang/String;)V", "pubTime", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/SunRiseSet;", "b", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/SunRiseSet;", "getSunRiseSet", "()Lcom/xiaomi/hm/health/locweather/huami_weather_bean/SunRiseSet;", "setSunRiseSet", "(Lcom/xiaomi/hm/health/locweather/huami_weather_bean/SunRiseSet;)V", "sunRiseSet", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Weather;", "c", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Weather;", "getWeather", "()Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Weather;", "setWeather", "(Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Weather;)V", "weather", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Temperature;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Temperature;", "getTemperature", "()Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Temperature;", "setTemperature", "(Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Temperature;)V", "temperature", "<init>", "()V", "locweather_release"}, k = 1, mv = {1, 5, 1})
public final class ForecastWeatherInfoBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("pubTime")
    @Nullable
    private String pubTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("sunRiseSet")
    @Nullable
    private SunRiseSet sunRiseSet;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("weather")
    @Nullable
    private Weather weather;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("temperature")
    @Nullable
    private Temperature temperature;

    @Nullable
    public final String getPubTime() {
        return this.pubTime;
    }

    @Nullable
    public final SunRiseSet getSunRiseSet() {
        return this.sunRiseSet;
    }

    @Nullable
    public final Temperature getTemperature() {
        return this.temperature;
    }

    @Nullable
    public final Weather getWeather() {
        return this.weather;
    }

    public final void setPubTime(@Nullable String str) {
        this.pubTime = str;
    }

    public final void setSunRiseSet(@Nullable SunRiseSet sunRiseSet) {
        this.sunRiseSet = sunRiseSet;
    }

    public final void setTemperature(@Nullable Temperature temperature) {
        this.temperature = temperature;
    }

    public final void setWeather(@Nullable Weather weather) {
        this.weather = weather;
    }
}
