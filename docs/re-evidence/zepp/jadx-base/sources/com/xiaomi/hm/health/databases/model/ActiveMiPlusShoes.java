package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class ActiveMiPlusShoes {
    private Long a;
    private Long b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;

    public ActiveMiPlusShoes(Long l, Long l2, Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = l;
        this.b = l2;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = num4;
    }

    public Integer getFlightTime() {
        return this.d;
    }

    public Long getId() {
        return this.a;
    }

    public Integer getLandingTime() {
        return this.c;
    }

    public Integer getLeftRight() {
        return this.f;
    }

    public Integer getRealSteps() {
        return this.e;
    }

    public Long getTrackid() {
        return this.b;
    }

    public void setFlightTime(Integer num) {
        this.d = num;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setLandingTime(Integer num) {
        this.c = num;
    }

    public void setLeftRight(Integer num) {
        this.f = num;
    }

    public void setRealSteps(Integer num) {
        this.e = num;
    }

    public void setTrackid(Long l) {
        this.b = l;
    }

    public ActiveMiPlusShoes() {
    }
}
