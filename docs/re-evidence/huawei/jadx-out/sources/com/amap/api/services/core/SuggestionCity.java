package com.amap.api.services.core;

/* JADX INFO: loaded from: classes21.dex */
public class SuggestionCity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3552c;
    private int d;

    protected SuggestionCity() {
    }

    public SuggestionCity(String str, String str2, String str3, int i) {
        this.f3550a = str;
        this.f3551b = str2;
        this.f3552c = str3;
        this.d = i;
    }

    public String getCityName() {
        return this.f3550a;
    }

    public void setCityName(String str) {
        this.f3550a = str;
    }

    public String getCityCode() {
        return this.f3551b;
    }

    public void setCityCode(String str) {
        this.f3551b = str;
    }

    public String getAdCode() {
        return this.f3552c;
    }

    public void setAdCode(String str) {
        this.f3552c = str;
    }

    public int getSuggestionNum() {
        return this.d;
    }

    public void setSuggestionNum(int i) {
        this.d = i;
    }
}
