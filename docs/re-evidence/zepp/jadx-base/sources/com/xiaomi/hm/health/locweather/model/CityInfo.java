package com.xiaomi.hm.health.locweather.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.nfc.web.Constant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class CityInfo {
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private int f = 0;

    public static CityInfo fromJsonString(String str) {
        try {
            CityInfo cityInfo = new CityInfo();
            JSONObject jSONObject = new JSONObject(str);
            cityInfo.setAffiliation(jSONObject.getString(FirebaseAnalytics.Param.AFFILIATION));
            cityInfo.setLocationKey(jSONObject.getString("locationKey"));
            cityInfo.setLatitude(jSONObject.getString(Constant.KEY_LATITUDE));
            cityInfo.setLongitude(jSONObject.getString(Constant.KEY_LONGITUDE));
            cityInfo.setTimeZoneShift(jSONObject.getInt("timeZoneShift"));
            cityInfo.setName(jSONObject.optString("name"));
            return cityInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getAffiliation() {
        return this.a;
    }

    public String getLatitude() {
        return this.c;
    }

    public String getLocationKey() {
        return this.b;
    }

    public String getLongitude() {
        return this.d;
    }

    public String getName() {
        return this.e;
    }

    public int getTimeZoneShift() {
        return this.f;
    }

    public void setAffiliation(String str) {
        this.a = str;
    }

    public void setLatitude(String str) {
        this.c = str;
    }

    public void setLocationKey(String str) {
        this.b = str;
    }

    public void setLongitude(String str) {
        this.d = str;
    }

    public void setName(String str) {
        this.e = str;
    }

    public void setTimeZoneShift(int i) {
        this.f = i;
    }

    public String toJsonString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FirebaseAnalytics.Param.AFFILIATION, this.a);
            jSONObject.put("locationKey", this.b);
            jSONObject.put(Constant.KEY_LATITUDE, this.c);
            jSONObject.put(Constant.KEY_LONGITUDE, this.d);
            jSONObject.put("timeZoneShift", this.f);
            jSONObject.put("name", this.e);
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        return "CityInfo{affiliation='" + this.a + "', locationKey='" + this.b + "', latitude='" + this.c + "', longitude='" + this.d + "', name='" + this.e + "', timeZoneShift=" + this.f + '}';
    }
}
