package com.huami.watch.companion.cloud.bean;

import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class CloudWeatherCity {
    private String affiliation;
    private String latitude;
    private String locationKey;
    private String longitude;
    private String name;
    private int status;
    private int timeZoneShift;

    public String getAffiliation() {
        return this.affiliation;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLocationKey() {
        return this.locationKey;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getName() {
        return this.name;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTimeZoneShift() {
        return this.timeZoneShift;
    }

    public void setAffiliation(String str) {
        this.affiliation = str;
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public void setLocationKey(String str) {
        this.locationKey = str;
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTimeZoneShift(int i) {
        this.timeZoneShift = i;
    }

    public String toString() {
        return "<Status : " + this.status + ", Affiliation" + this.affiliation + ", Latitude : " + this.latitude + ", Longitude : " + this.longitude + ", , LocationKey" + this.locationKey + ", Name :" + this.name + ", TimeZoneShift : " + this.timeZoneShift + SearchCriteria.GT;
    }
}
