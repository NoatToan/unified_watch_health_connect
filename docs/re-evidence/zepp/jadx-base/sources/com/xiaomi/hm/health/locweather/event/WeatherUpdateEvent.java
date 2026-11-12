package com.xiaomi.hm.health.locweather.event;

import com.xiaomi.hm.health.locweather.model.WeatherInfos;

/* JADX INFO: loaded from: classes21.dex */
public class WeatherUpdateEvent {
    public WeatherInfos weatherInfos;

    public WeatherUpdateEvent(WeatherInfos weatherInfos) {
        this.weatherInfos = weatherInfos;
    }
}
