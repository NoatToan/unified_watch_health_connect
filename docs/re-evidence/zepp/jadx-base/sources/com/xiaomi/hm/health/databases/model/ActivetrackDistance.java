package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class ActivetrackDistance {
    private Long a;
    private Long b;
    private Long c;
    private Float d;

    public ActivetrackDistance(Long l, Long l2, Long l3, Float f) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = f;
    }

    public Float getDistance() {
        return this.d;
    }

    public Long getId() {
        return this.a;
    }

    public Long getTime() {
        return this.c;
    }

    public Long getTrackid() {
        return this.b;
    }

    public void setDistance(Float f) {
        this.d = f;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setTime(Long l) {
        this.c = l;
    }

    public void setTrackid(Long l) {
        this.b = l;
    }

    public ActivetrackDistance() {
    }
}
