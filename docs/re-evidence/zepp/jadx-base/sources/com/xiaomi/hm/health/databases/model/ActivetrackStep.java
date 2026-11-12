package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class ActivetrackStep {
    private Long a;
    private Long b;
    private Long c;
    private Integer d;
    private Float e;
    private Float f;

    public ActivetrackStep(Long l, Long l2, Long l3, Integer num, Float f, Float f2) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = num;
        this.e = f;
        this.f = f2;
    }

    public Long getId() {
        return this.a;
    }

    public Float getStepFreq() {
        return this.f;
    }

    public Float getStepl() {
        return this.e;
    }

    public Integer getSteps() {
        return this.d;
    }

    public Long getTime() {
        return this.c;
    }

    public Long getTrackid() {
        return this.b;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setStepFreq(Float f) {
        this.f = f;
    }

    public void setStepl(Float f) {
        this.e = f;
    }

    public void setSteps(Integer num) {
        this.d = num;
    }

    public void setTime(Long l) {
        this.c = l;
    }

    public void setTrackid(Long l) {
        this.b = l;
    }

    public ActivetrackStep() {
    }
}
