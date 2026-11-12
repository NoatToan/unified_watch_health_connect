package com.amap.api.services.weather;

/* JADX INFO: loaded from: classes4.dex */
public class LocalWeatherForecastResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeatherSearchQuery f6805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LocalWeatherForecast f6806b;

    private LocalWeatherForecastResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherForecast localWeatherForecast) {
        this.f6805a = weatherSearchQuery;
        this.f6806b = localWeatherForecast;
    }

    public static LocalWeatherForecastResult createPagedResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherForecast localWeatherForecast) {
        return new LocalWeatherForecastResult(weatherSearchQuery, localWeatherForecast);
    }

    public LocalWeatherForecast getForecastResult() {
        return this.f6806b;
    }

    public WeatherSearchQuery getWeatherForecastQuery() {
        return this.f6805a;
    }
}
