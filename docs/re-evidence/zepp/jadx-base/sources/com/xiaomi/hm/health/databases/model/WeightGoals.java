package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class WeightGoals {
    private Long a;
    private String b;
    private Long c;
    private Integer d;
    private Float e;
    private Float f;
    private Long g;
    private Integer h;
    private Integer i;

    public WeightGoals(Long l, String str, Long l2, Integer num, Float f, Float f2, Long l3, Integer num2, Integer num3) {
        this.a = l;
        this.b = str;
        this.c = l2;
        this.d = num;
        this.e = f;
        this.f = f2;
        this.g = l3;
        this.h = num2;
        this.i = num3;
    }

    public Float getCurrentVal() {
        return this.e;
    }

    public Long getDateTime() {
        return this.g;
    }

    public Long getFUID() {
        return this.c;
    }

    public Float getGoal() {
        return this.f;
    }

    public Integer getGoalType() {
        return this.d;
    }

    public Integer getHeight() {
        return this.h;
    }

    public Long getId() {
        return this.a;
    }

    public Integer getSynced() {
        return this.i;
    }

    public String getUID() {
        return this.b;
    }

    public void setCurrentVal(Float f) {
        this.e = f;
    }

    public void setDateTime(Long l) {
        this.g = l;
    }

    public void setFUID(Long l) {
        this.c = l;
    }

    public void setGoal(Float f) {
        this.f = f;
    }

    public void setGoalType(Integer num) {
        this.d = num;
    }

    public void setHeight(Integer num) {
        this.h = num;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setSynced(Integer num) {
        this.i = num;
    }

    public void setUID(String str) {
        this.b = str;
    }

    public WeightGoals() {
    }
}
