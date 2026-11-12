package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class ManualData {
    private Long a;
    private String b;
    private String c;
    private String d;
    private Integer e;

    public ManualData(Long l, String str, String str2, String str3, Integer num) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
    }

    public String getDate() {
        return this.c;
    }

    public Long getId() {
        return this.a;
    }

    public String getSummary() {
        return this.d;
    }

    public Integer getSynced() {
        return this.e;
    }

    public String getType() {
        return this.b;
    }

    public void setDate(String str) {
        this.c = str;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setSummary(String str) {
        this.d = str;
    }

    public void setSynced(Integer num) {
        this.e = num;
    }

    public void setType(String str) {
        this.b = str;
    }

    public ManualData() {
    }
}
