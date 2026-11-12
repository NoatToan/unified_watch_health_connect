package com.xiaomi.fitness.sport.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u001d\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/sport/bean/WeatherRequestData;", "", "longitude", "", "latitude", "<init>", "(DD)V", "getLongitude", "()D", "setLongitude", "(D)V", "getLatitude", "setLatitude", "get_current", "", "getGet_current", "()Z", "setGet_current", "(Z)V", "get_aqi", "getGet_aqi", "setGet_aqi", "get_alerts", "getGet_alerts", "setGet_alerts", "get_indices", "getGet_indices", "setGet_indices", "get_daily_forecast", "getGet_daily_forecast", "setGet_daily_forecast", "get_hourly_forecast", "getGet_hourly_forecast", "setGet_hourly_forecast", "get_city_location", "getGet_city_location", "setGet_city_location", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WeatherRequestData {
    private boolean get_alerts;
    private boolean get_aqi;
    private boolean get_city_location;
    private boolean get_current;
    private boolean get_daily_forecast;
    private boolean get_hourly_forecast;
    private boolean get_indices;
    private double latitude;
    private double longitude;

    public WeatherRequestData() {
        this(0.0d, 0.0d, 3, null);
    }

    public static /* synthetic */ WeatherRequestData copy$default(WeatherRequestData weatherRequestData, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = weatherRequestData.longitude;
        }
        if ((i & 2) != 0) {
            d2 = weatherRequestData.latitude;
        }
        return weatherRequestData.copy(d, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final WeatherRequestData copy(double longitude, double latitude) {
        return new WeatherRequestData(longitude, latitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeatherRequestData)) {
            return false;
        }
        WeatherRequestData weatherRequestData = (WeatherRequestData) other;
        return Double.compare(this.longitude, weatherRequestData.longitude) == 0 && Double.compare(this.latitude, weatherRequestData.latitude) == 0;
    }

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

    public int hashCode() {
        return (Double.hashCode(this.longitude) * 31) + Double.hashCode(this.latitude);
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

    @NotNull
    public String toString() {
        return "WeatherRequestData(longitude=" + this.longitude + ", latitude=" + this.latitude + ")";
    }

    public WeatherRequestData(double d, double d2) {
        this.longitude = d;
        this.latitude = d2;
        this.get_current = true;
        this.get_aqi = true;
        this.get_alerts = true;
        this.get_indices = true;
        this.get_daily_forecast = true;
        this.get_hourly_forecast = true;
        this.get_city_location = true;
    }

    public /* synthetic */ WeatherRequestData(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }
}
