package com.xiaomi.hm.health.locweather.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.market.sdk.Constants;

/* JADX INFO: loaded from: classes21.dex */
public class RealtimeAQInfoBean {

    @SerializedName("aqi")
    public String a;

    @SerializedName(Constants.JSON_COUNTRY)
    public String b;

    @SerializedName("no2")
    public String c;

    @SerializedName("o3")
    public String d;

    @SerializedName("pm10")
    public String e;

    @SerializedName("pm25")
    public String f;

    @SerializedName("primary")
    public String g;

    @SerializedName("pubTime")
    public String h;

    @SerializedName("so2")
    public String i;

    @SerializedName("status")
    public int j;

    public String getAqi() {
        return this.a;
    }

    public String getCo() {
        return this.b;
    }

    public String getNo2() {
        return this.c;
    }

    public String getO3() {
        return this.d;
    }

    public String getPm10() {
        return this.e;
    }

    public String getPm25() {
        return this.f;
    }

    public String getPrimary() {
        return this.g;
    }

    public String getPubTime() {
        return this.h;
    }

    public String getSo2() {
        return this.i;
    }

    public int getStatus() {
        return this.j;
    }

    public void setAqi(String str) {
        this.a = str;
    }

    public void setCo(String str) {
        this.b = str;
    }

    public void setNo2(String str) {
        this.c = str;
    }

    public void setO3(String str) {
        this.d = str;
    }

    public void setPm10(String str) {
        this.e = str;
    }

    public void setPm25(String str) {
        this.f = str;
    }

    public void setPrimary(String str) {
        this.g = str;
    }

    public void setPubTime(String str) {
        this.h = str;
    }

    public void setSo2(String str) {
        this.i = str;
    }

    public void setStatus(int i) {
        this.j = i;
    }

    public String toString() {
        return "RealtimeAQInfoBean{aqi='" + this.a + "', co='" + this.b + "', no2='" + this.c + "', o3='" + this.d + "', pm10='" + this.e + "', pm25='" + this.f + "', primary='" + this.g + "', pubTime='" + this.h + "', so2='" + this.i + "', status=" + this.j + '}';
    }
}
