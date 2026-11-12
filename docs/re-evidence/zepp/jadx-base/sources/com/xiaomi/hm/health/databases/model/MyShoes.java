package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
@Deprecated
public class MyShoes {
    private Long a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;

    public MyShoes(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    public String getBrand() {
        return this.g;
    }

    public String getCached() {
        return this.l;
    }

    public String getDate() {
        return this.b;
    }

    public String getDeviceid() {
        return this.d;
    }

    public Long getId() {
        return this.a;
    }

    public String getMac() {
        return this.c;
    }

    public String getShoesid() {
        return this.f;
    }

    public String getSn() {
        return this.e;
    }

    public String getState() {
        return this.j;
    }

    public String getSummary() {
        return this.k;
    }

    public String getSynced() {
        return this.i;
    }

    public String getType() {
        return this.h;
    }

    public void setBrand(String str) {
        this.g = str;
    }

    public void setCached(String str) {
        this.l = str;
    }

    public void setDate(String str) {
        this.b = str;
    }

    public void setDeviceid(String str) {
        this.d = str;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setMac(String str) {
        this.c = str;
    }

    public void setShoesid(String str) {
        this.f = str;
    }

    public void setSn(String str) {
        this.e = str;
    }

    public void setState(String str) {
        this.j = str;
    }

    public void setSummary(String str) {
        this.k = str;
    }

    public void setSynced(String str) {
        this.i = str;
    }

    public void setType(String str) {
        this.h = str;
    }

    public MyShoes() {
    }
}
