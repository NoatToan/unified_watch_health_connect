package com.amap.api.services.weather;

/* JADX INFO: loaded from: classes4.dex */
public class LocalWeatherLiveResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeatherSearchQuery f3890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LocalWeatherLive f3891b;

    public static LocalWeatherLiveResult createPagedResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherLive localWeatherLive) {
        return new LocalWeatherLiveResult(weatherSearchQuery, localWeatherLive);
    }

    private LocalWeatherLiveResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherLive localWeatherLive) {
        this.f3890a = weatherSearchQuery;
        this.f3891b = localWeatherLive;
    }

    public WeatherSearchQuery getWeatherLiveQuery() {
        return this.f3890a;
    }

    public LocalWeatherLive getLiveResult() {
        return this.f3891b;
    }
}
