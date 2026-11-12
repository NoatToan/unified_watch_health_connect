package com.xiaomi.hm.health.locweather.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Calendar;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AlertInfo {
    private static final int h = 3900000;
    private Calendar a = null;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;

    public static AlertInfo fromJson(JSONObject jSONObject) {
        try {
            AlertInfo alertInfo = new AlertInfo();
            long j = jSONObject.getLong("pubtime");
            String string = jSONObject.getString("alertId");
            String string2 = jSONObject.getString("title");
            String string3 = jSONObject.getString("type");
            String string4 = jSONObject.getString(FirebaseAnalytics.Param.LEVEL);
            String string5 = jSONObject.getString("detail");
            boolean zOptBoolean = jSONObject.optBoolean("success");
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            alertInfo.setPubTime(calendar);
            alertInfo.setSuccess(zOptBoolean);
            alertInfo.setAlertId(string);
            alertInfo.setTitle(string2);
            alertInfo.setType(string3);
            alertInfo.setLevel(string4);
            alertInfo.setDetail(string5);
            return alertInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean expired() {
        return System.currentTimeMillis() - this.a.getTimeInMillis() >= 3900000;
    }

    public String getAlertId() {
        return this.b;
    }

    public String getDetail() {
        return this.f;
    }

    public String getLevel() {
        return this.e;
    }

    public Calendar getPubTime() {
        return this.a;
    }

    public String getTitle() {
        return this.c;
    }

    public String getType() {
        return this.d;
    }

    public boolean isSuccess() {
        return this.g;
    }

    public void setAlertId(String str) {
        this.b = str;
    }

    public void setDetail(String str) {
        this.f = str;
    }

    public void setLevel(String str) {
        this.e = str;
    }

    public void setPubTime(Calendar calendar) {
        this.a = calendar;
    }

    public void setSuccess(boolean z) {
        this.g = z;
    }

    public void setTitle(String str) {
        this.c = str;
    }

    public void setType(String str) {
        this.d = str;
    }

    public JSONObject toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pubtime", this.a.getTimeInMillis());
            jSONObject.put("alertId", this.b);
            jSONObject.put("title", this.c);
            jSONObject.put("type", this.d);
            jSONObject.put(FirebaseAnalytics.Param.LEVEL, this.e);
            jSONObject.put("detail", this.f);
            jSONObject.put("success", this.g);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        return "AlertInfo{pubTime=" + WeatherLogUtilKt.wrapCalender(this.a) + ", alertId='" + this.b + "', title='" + this.c + "', type='" + this.d + "', level='" + this.e + "', detail='" + this.f + "', success='" + this.g + "'}";
    }
}
