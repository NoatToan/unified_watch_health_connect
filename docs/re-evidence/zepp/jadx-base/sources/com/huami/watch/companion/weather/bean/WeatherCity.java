package com.huami.watch.companion.weather.bean;

import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class WeatherCity {
    private String cityName;
    private String locationKey;

    public String getCityName() {
        return this.cityName;
    }

    public String getLocationKey() {
        return this.locationKey;
    }

    public void setCityName(String str) {
        this.cityName = str;
    }

    public void setLocationKey(String str) {
        this.locationKey = str;
    }

    public String toString() {
        return "<Name : " + this.cityName + ", LocKey : " + this.locationKey + SearchCriteria.GT;
    }
}
