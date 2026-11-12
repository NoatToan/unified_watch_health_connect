package com.amap.api.services.weather;

/* JADX INFO: loaded from: classes4.dex */
public class LocalWeatherLiveResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeatherSearchQuery f6809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LocalWeatherLive f6810b;

    private LocalWeatherLiveResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherLive localWeatherLive) {
        this.f6809a = weatherSearchQuery;
        this.f6810b = localWeatherLive;
    }

    public static LocalWeatherLiveResult createPagedResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherLive localWeatherLive) {
        return new LocalWeatherLiveResult(weatherSearchQuery, localWeatherLive);
    }

    public LocalWeatherLive getLiveResult() {
        return this.f6810b;
    }

    public WeatherSearchQuery getWeatherLiveQuery() {
        return this.f6809a;
    }
}
