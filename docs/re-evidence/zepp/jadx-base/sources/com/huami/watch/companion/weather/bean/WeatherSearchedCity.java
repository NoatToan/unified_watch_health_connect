package com.huami.watch.companion.weather.bean;

import com.huami.watch.companion.cloud.bean.CloudWeatherCity;

/* JADX INFO: loaded from: classes16.dex */
public class WeatherSearchedCity extends WeatherCity {
    private String affiliation;
    private CloudWeatherCity city;

    public String getAffiliation() {
        return this.affiliation;
    }

    public CloudWeatherCity getCityInfo() {
        return this.city;
    }

    public void setAffiliation(String str) {
        this.affiliation = str;
    }

    public void setCityInfo(CloudWeatherCity cloudWeatherCity) {
        this.city = cloudWeatherCity;
    }

    @Override // com.huami.watch.companion.weather.bean.WeatherCity
    public String toString() {
        return "<Affiliation : " + this.affiliation + ", City : " + this.city + ">\n";
    }
}
