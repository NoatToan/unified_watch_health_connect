package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class Activetrackhr {
    private Long a;
    private Long b;
    private Long c;
    private Integer d;
    private Integer e;

    public Activetrackhr(Long l, Long l2, Long l3, Integer num, Integer num2) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = num;
        this.e = num2;
    }

    public Integer getHr() {
        return this.d;
    }

    public Long getId() {
        return this.a;
    }

    public Integer getSynced() {
        return this.e;
    }

    public Long getTime() {
        return this.c;
    }

    public Long getTrackid() {
        return this.b;
    }

    public void setHr(Integer num) {
        this.d = num;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setSynced(Integer num) {
        this.e = num;
    }

    public void setTime(Long l) {
        this.c = l;
    }

    public void setTrackid(Long l) {
        this.b = l;
    }

    public Activetrackhr() {
    }
}
