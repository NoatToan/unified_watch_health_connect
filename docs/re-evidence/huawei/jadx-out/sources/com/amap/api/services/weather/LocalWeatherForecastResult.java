package com.amap.api.services.weather;

/* JADX INFO: loaded from: classes4.dex */
public class LocalWeatherForecastResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeatherSearchQuery f3885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LocalWeatherForecast f3886b;

    public static LocalWeatherForecastResult createPagedResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherForecast localWeatherForecast) {
        return new LocalWeatherForecastResult(weatherSearchQuery, localWeatherForecast);
    }

    private LocalWeatherForecastResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherForecast localWeatherForecast) {
        this.f3885a = weatherSearchQuery;
        this.f3886b = localWeatherForecast;
    }

    public WeatherSearchQuery getWeatherForecastQuery() {
        return this.f3885a;
    }

    public LocalWeatherForecast getForecastResult() {
        return this.f3886b;
    }
}
