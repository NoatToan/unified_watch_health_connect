package com.amap.api.services.core;

/* JADX INFO: loaded from: classes4.dex */
public class SuggestionCity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6546b;
    private String c;
    private int d;

    public SuggestionCity() {
    }

    public String getAdCode() {
        return this.c;
    }

    public String getCityCode() {
        return this.f6546b;
    }

    public String getCityName() {
        return this.f6545a;
    }

    public int getSuggestionNum() {
        return this.d;
    }

    public void setAdCode(String str) {
        this.c = str;
    }

    public void setCityCode(String str) {
        this.f6546b = str;
    }

    public void setCityName(String str) {
        this.f6545a = str;
    }

    public void setSuggestionNum(int i) {
        this.d = i;
    }

    public SuggestionCity(String str, String str2, String str3, int i) {
        this.f6545a = str;
        this.f6546b = str2;
        this.c = str3;
        this.d = i;
    }
}
