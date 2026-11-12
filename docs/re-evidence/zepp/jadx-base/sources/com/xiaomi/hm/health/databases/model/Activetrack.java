package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class Activetrack {
    private Long a;
    private Long b;
    private Float c;
    private Float d;
    private Long e;
    private Float f;
    private Integer g;
    private Integer h;
    private Float i;
    private Float j;
    private Integer k;
    private String l;
    private Integer m;
    private Float n;
    private Float o;
    private Integer p;
    private Float q;

    public Activetrack(Long l, Long l2, Float f, Float f2, Long l3, Float f3, Integer num, Integer num2, Float f4, Float f5, Integer num3, String str, Integer num4, Float f6, Float f7, Integer num5, Float f8) {
        this.a = l;
        this.b = l2;
        this.c = f;
        this.d = f2;
        this.e = l3;
        this.f = f3;
        this.g = num;
        this.h = num2;
        this.i = f4;
        this.j = f5;
        this.k = num3;
        this.l = str;
        this.m = num4;
        this.n = f6;
        this.o = f7;
        this.p = num5;
        this.q = f8;
    }

    public Integer getAccuracy() {
        return this.g;
    }

    public Float getAltitude() {
        return this.f;
    }

    public Float getBarometerAltitude() {
        return this.o;
    }

    public Float getDistance() {
        return this.n;
    }

    public String getExtra() {
        return this.l;
    }

    public Integer getHr() {
        return this.p;
    }

    public Long getId() {
        return this.a;
    }

    public Float getLatitude() {
        return this.c;
    }

    public Float getLongitude() {
        return this.d;
    }

    public Float getPace() {
        return this.j;
    }

    public Float getSpeed() {
        return this.q;
    }

    public Integer getState() {
        return this.k;
    }

    public Float getStepl() {
        return this.i;
    }

    public Integer getSteps() {
        return this.h;
    }

    public Integer getSynced() {
        return this.m;
    }

    public Long getTime() {
        return this.e;
    }

    public Long getTrackid() {
        return this.b;
    }

    public void setAccuracy(Integer num) {
        this.g = num;
    }

    public void setAltitude(Float f) {
        this.f = f;
    }

    public void setBarometerAltitude(Float f) {
        this.o = f;
    }

    public void setDistance(Float f) {
        this.n = f;
    }

    public void setExtra(String str) {
        this.l = str;
    }

    public void setHr(Integer num) {
        this.p = num;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setLatitude(Float f) {
        this.c = f;
    }

    public void setLongitude(Float f) {
        this.d = f;
    }

    public void setPace(Float f) {
        this.j = f;
    }

    public void setSpeed(Float f) {
        this.q = f;
    }

    public void setState(Integer num) {
        this.k = num;
    }

    public void setStepl(Float f) {
        this.i = f;
    }

    public void setSteps(Integer num) {
        this.h = num;
    }

    public void setSynced(Integer num) {
        this.m = num;
    }

    public void setTime(Long l) {
        this.e = l;
    }

    public void setTrackid(Long l) {
        this.b = l;
    }

    public Activetrack() {
    }
}
