package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class Trackstatistics {
    private Long a;
    private Integer b;
    private Integer c;
    private String d;
    private String e;
    private Integer f;

    public Trackstatistics(Long l, Integer num, Integer num2, String str, String str2, Integer num3) {
        this.a = l;
        this.b = num;
        this.c = num2;
        this.d = str;
        this.e = str2;
        this.f = num3;
    }

    public Long getId() {
        return this.a;
    }

    public Integer getSporttype() {
        return this.b;
    }

    public String getSubtype() {
        return this.d;
    }

    public String getSummary() {
        return this.e;
    }

    public Integer getSynced() {
        return this.f;
    }

    public Integer getType() {
        return this.c;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setSporttype(Integer num) {
        this.b = num;
    }

    public void setSubtype(String str) {
        this.d = str;
    }

    public void setSummary(String str) {
        this.e = str;
    }

    public void setSynced(Integer num) {
        this.f = num;
    }

    public void setType(Integer num) {
        this.c = num;
    }

    public Trackstatistics() {
    }
}
