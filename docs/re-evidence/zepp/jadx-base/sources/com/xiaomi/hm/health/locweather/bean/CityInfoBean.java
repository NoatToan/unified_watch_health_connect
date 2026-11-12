package com.xiaomi.hm.health.locweather.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huami.nfc.web.Constant;

/* JADX INFO: loaded from: classes21.dex */
public class CityInfoBean {

    @SerializedName("status")
    public int a = -1;

    @SerializedName(FirebaseAnalytics.Param.AFFILIATION)
    public String b = "";

    @SerializedName("locationKey")
    public String c = "";

    @SerializedName(Constant.KEY_LATITUDE)
    public String d = "";

    @SerializedName(Constant.KEY_LONGITUDE)
    public String e = "";

    @SerializedName("name")
    public String f = "";

    @SerializedName("timeZoneShift")
    public int g = 0;

    public String getAffiliation() {
        return this.b;
    }

    public String getLatitude() {
        return this.d;
    }

    public String getLocationKey() {
        return this.c;
    }

    public String getLongitude() {
        return this.e;
    }

    public String getName() {
        return this.f;
    }

    public int getStatus() {
        return this.a;
    }

    public int getTimeZoneShift() {
        return this.g;
    }

    public void setAffiliation(String str) {
        this.b = str;
    }

    public void setLatitude(String str) {
        this.d = str;
    }

    public void setLocationKey(String str) {
        this.c = str;
    }

    public void setLongitude(String str) {
        this.e = str;
    }

    public void setName(String str) {
        this.f = str;
    }

    public void setStatus(int i) {
        this.a = i;
    }

    public void setTimeZoneShift(int i) {
        this.g = i;
    }

    public String toString() {
        return "CityInfoBean{status=" + this.a + ", affiliation='" + this.b + "', locationKey='" + this.c + "', latitude='" + this.d + "', longitude='" + this.e + "', name='" + this.f + "', timeZoneShift=" + this.g + '}';
    }
}
