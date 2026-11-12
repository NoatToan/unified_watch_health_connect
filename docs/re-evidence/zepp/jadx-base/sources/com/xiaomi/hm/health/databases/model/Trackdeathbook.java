package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class Trackdeathbook {
    private Long a;
    private Long b;
    private String c;
    private String d;
    private Integer e;

    public Trackdeathbook(Long l, Long l2, String str, String str2, Integer num) {
        this.a = l;
        this.b = l2;
        this.c = str;
        this.d = str2;
        this.e = num;
    }

    public Long getId() {
        return this.a;
    }

    public String getSsummary() {
        return this.d;
    }

    public String getSummary() {
        return this.c;
    }

    public Integer getSynced() {
        return this.e;
    }

    public Long getTrackid() {
        return this.b;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setSsummary(String str) {
        this.d = str;
    }

    public void setSummary(String str) {
        this.c = str;
    }

    public void setSynced(Integer num) {
        this.e = num;
    }

    public void setTrackid(Long l) {
        this.b = l;
    }

    public Trackdeathbook() {
    }
}
