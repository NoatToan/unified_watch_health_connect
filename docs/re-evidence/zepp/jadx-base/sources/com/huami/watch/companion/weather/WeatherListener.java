package com.huami.watch.companion.weather;

import com.huami.watch.companion.weather.bean.WeatherInfo;

/* JADX INFO: loaded from: classes16.dex */
public interface WeatherListener {
    void onReceiveWeather(WeatherInfo weatherInfo);

    void onReceiveWeatherError();
}
