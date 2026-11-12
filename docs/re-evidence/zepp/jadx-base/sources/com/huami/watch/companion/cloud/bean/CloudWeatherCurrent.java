package com.huami.watch.companion.cloud.bean;

/* JADX INFO: loaded from: classes16.dex */
public class CloudWeatherCurrent {
    private CloudWeatherAQIRealtime aqiModel;
    private CloudWeatherRealtime currentWeatherModel;

    public CloudWeatherAQIRealtime getAqiModel() {
        return this.aqiModel;
    }

    public CloudWeatherRealtime getCurrentWeatherModel() {
        return this.currentWeatherModel;
    }

    public void setAqiModel(CloudWeatherAQIRealtime cloudWeatherAQIRealtime) {
        this.aqiModel = cloudWeatherAQIRealtime;
    }

    public void setCurrentWeatherModel(CloudWeatherRealtime cloudWeatherRealtime) {
        this.currentWeatherModel = cloudWeatherRealtime;
    }
}
