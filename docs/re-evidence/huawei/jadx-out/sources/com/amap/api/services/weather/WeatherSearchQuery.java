package com.amap.api.services.weather;

import com.amap.api.col.p0003sl.fu;

/* JADX INFO: loaded from: classes21.dex */
public class WeatherSearchQuery implements Cloneable {
    public static final int WEATHER_TYPE_FORECAST = 2;
    public static final int WEATHER_TYPE_LIVE = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3894b;

    public WeatherSearchQuery(String str, int i) {
        this.f3893a = str;
        this.f3894b = i;
    }

    public WeatherSearchQuery() {
        this.f3894b = 1;
    }

    public String getCity() {
        return this.f3893a;
    }

    public int getType() {
        return this.f3894b;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public WeatherSearchQuery m788clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            fu.a(e, "WeatherSearchQuery", "clone");
        }
        return new WeatherSearchQuery(this.f3893a, this.f3894b);
    }
}
