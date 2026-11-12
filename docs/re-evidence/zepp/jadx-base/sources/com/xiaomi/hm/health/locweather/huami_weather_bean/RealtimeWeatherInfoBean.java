package com.xiaomi.hm.health.locweather.huami_weather_bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/locweather/huami_weather_bean/RealtimeWeatherInfoBean;", "", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/CurrentWeatherModel;", "a", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/CurrentWeatherModel;", "getCurrentWeatherModel", "()Lcom/xiaomi/hm/health/locweather/huami_weather_bean/CurrentWeatherModel;", "setCurrentWeatherModel", "(Lcom/xiaomi/hm/health/locweather/huami_weather_bean/CurrentWeatherModel;)V", "currentWeatherModel", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/AqiModel;", "b", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/AqiModel;", "getAqiModel", "()Lcom/xiaomi/hm/health/locweather/huami_weather_bean/AqiModel;", "setAqiModel", "(Lcom/xiaomi/hm/health/locweather/huami_weather_bean/AqiModel;)V", "aqiModel", "<init>", "()V", "locweather_release"}, k = 1, mv = {1, 5, 1})
public final class RealtimeWeatherInfoBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("currentWeatherModel")
    @Nullable
    private CurrentWeatherModel currentWeatherModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("aqiModel")
    @Nullable
    private AqiModel aqiModel;

    @Nullable
    public final AqiModel getAqiModel() {
        return this.aqiModel;
    }

    @Nullable
    public final CurrentWeatherModel getCurrentWeatherModel() {
        return this.currentWeatherModel;
    }

    public final void setAqiModel(@Nullable AqiModel aqiModel) {
        this.aqiModel = aqiModel;
    }

    public final void setCurrentWeatherModel(@Nullable CurrentWeatherModel currentWeatherModel) {
        this.currentWeatherModel = currentWeatherModel;
    }
}
