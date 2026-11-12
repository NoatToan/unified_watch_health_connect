package com.amap.api.services.weather;

import defpackage.xts;

/* JADX INFO: loaded from: classes4.dex */
public class WeatherSearchQuery implements Cloneable {
    public static final int WEATHER_TYPE_FORECAST = 2;
    public static final int WEATHER_TYPE_LIVE = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6813b;

    public WeatherSearchQuery(String str, int i) {
        this.f6812a = str;
        this.f6813b = i;
    }

    public String getCity() {
        return this.f6812a;
    }

    public int getType() {
        return this.f6813b;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public WeatherSearchQuery m117clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            xts.i(e, "WeatherSearchQuery", "clone");
        }
        return new WeatherSearchQuery(this.f6812a, this.f6813b);
    }

    public WeatherSearchQuery() {
        this.f6813b = 1;
    }
}
