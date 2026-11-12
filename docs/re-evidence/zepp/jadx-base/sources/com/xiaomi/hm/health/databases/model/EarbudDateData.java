package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class EarbudDateData {
    private Integer a;
    private Integer b;
    private String c;
    private String d;
    private String e;
    private String f;
    private Integer g;
    private Integer h;
    private String i;

    public EarbudDateData(Integer num, Integer num2, String str, String str2, String str3, String str4, Integer num3, Integer num4, String str5) {
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = num3;
        this.h = num4;
        this.i = str5;
    }

    public String getData() {
        return this.f;
    }

    public String getDate() {
        return this.c;
    }

    public String getDeviceId() {
        return this.i;
    }

    public Integer getSource() {
        return this.b;
    }

    public String getSummary() {
        return this.d;
    }

    public Integer getSync() {
        return this.g;
    }

    public Integer getTimeZone() {
        return this.h;
    }

    public Integer getType() {
        return this.a;
    }

    public String getUserSummary() {
        return this.e;
    }

    public void setData(String str) {
        this.f = str;
    }

    public void setDate(String str) {
        this.c = str;
    }

    public void setDeviceId(String str) {
        this.i = str;
    }

    public void setSource(Integer num) {
        this.b = num;
    }

    public void setSummary(String str) {
        this.d = str;
    }

    public void setSync(Integer num) {
        this.g = num;
    }

    public void setTimeZone(Integer num) {
        this.h = num;
    }

    public void setType(Integer num) {
        this.a = num;
    }

    public void setUserSummary(String str) {
        this.e = str;
    }

    public EarbudDateData() {
    }
}
