package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
@Deprecated
public class ShoesPartners {
    private Long a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;

    public ShoesPartners(Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public String getBiguri() {
        return this.f;
    }

    public String getBrand() {
        return this.b;
    }

    public Long getId() {
        return this.a;
    }

    public String getSummary() {
        return this.e;
    }

    public String getSynctime() {
        return this.d;
    }

    public String getType() {
        return this.c;
    }

    public String getUri() {
        return this.g;
    }

    public void setBiguri(String str) {
        this.f = str;
    }

    public void setBrand(String str) {
        this.b = str;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setSummary(String str) {
        this.e = str;
    }

    public void setSynctime(String str) {
        this.d = str;
    }

    public void setType(String str) {
        this.c = str;
    }

    public void setUri(String str) {
        this.g = str;
    }

    public ShoesPartners() {
    }
}
