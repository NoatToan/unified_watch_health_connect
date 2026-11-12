package com.xiaomi.fitness.sport_eco.bean;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/bean/WeatherRequestData;", "", "<init>", "()V", "longitude", "", "getLongitude", "()D", "setLongitude", "(D)V", "latitude", "getLatitude", "setLatitude", "get_current", "", "getGet_current", "()Z", "setGet_current", "(Z)V", "get_aqi", "getGet_aqi", "setGet_aqi", "get_alerts", "getGet_alerts", "setGet_alerts", "get_indices", "getGet_indices", "setGet_indices", "get_daily_forecast", "getGet_daily_forecast", "setGet_daily_forecast", "get_hourly_forecast", "getGet_hourly_forecast", "setGet_hourly_forecast", "get_city_location", "getGet_city_location", "setGet_city_location", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeatherRequestData {
    private double latitude;
    private double longitude;
    private boolean get_current = true;
    private boolean get_aqi = true;
    private boolean get_alerts = true;
    private boolean get_indices = true;
    private boolean get_daily_forecast = true;
    private boolean get_hourly_forecast = true;
    private boolean get_city_location = true;

    public final boolean getGet_alerts() {
        return this.get_alerts;
    }

    public final boolean getGet_aqi() {
        return this.get_aqi;
    }

    public final boolean getGet_city_location() {
        return this.get_city_location;
    }

    public final boolean getGet_current() {
        return this.get_current;
    }

    public final boolean getGet_daily_forecast() {
        return this.get_daily_forecast;
    }

    public final boolean getGet_hourly_forecast() {
        return this.get_hourly_forecast;
    }

    public final boolean getGet_indices() {
        return this.get_indices;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setGet_alerts(boolean z) {
        this.get_alerts = z;
    }

    public final void setGet_aqi(boolean z) {
        this.get_aqi = z;
    }

    public final void setGet_city_location(boolean z) {
        this.get_city_location = z;
    }

    public final void setGet_current(boolean z) {
        this.get_current = z;
    }

    public final void setGet_daily_forecast(boolean z) {
        this.get_daily_forecast = z;
    }

    public final void setGet_hourly_forecast(boolean z) {
        this.get_hourly_forecast = z;
    }

    public final void setGet_indices(boolean z) {
        this.get_indices = z;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }
}
