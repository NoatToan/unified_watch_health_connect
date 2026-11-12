package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class HmProperty {
    private String a;
    private String b;
    private Integer c;

    public HmProperty(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public String getKey() {
        return this.a;
    }

    public Integer getStatus() {
        return this.c;
    }

    public String getValue() {
        return this.b;
    }

    public void setKey(String str) {
        this.a = str;
    }

    public void setStatus(Integer num) {
        this.c = num;
    }

    public void setValue(String str) {
        this.b = str;
    }

    public HmProperty() {
    }
}
