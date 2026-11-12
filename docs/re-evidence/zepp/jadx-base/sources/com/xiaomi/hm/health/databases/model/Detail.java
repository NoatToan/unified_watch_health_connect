package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class Detail {
    public Integer calorie;
    public Long createTime;
    public Integer deepSleep;
    public Integer distance;
    public Long dt;
    public Long fallSleepTime;
    public Long id;
    public Integer shallowSleep;
    public Integer step;
    public Long totalSleeptime;
    public Integer tz;
    public String uid;
    public Long wakeTime;

    public Detail(Long l, String str, Integer num, Integer num2, Integer num3, Long l2, Integer num4, Integer num5, Long l3, Long l4, Integer num6, Long l5, Long l6) {
        this.id = l;
        this.uid = str;
        this.step = num;
        this.deepSleep = num2;
        this.shallowSleep = num3;
        this.createTime = l2;
        this.distance = num4;
        this.calorie = num5;
        this.fallSleepTime = l3;
        this.wakeTime = l4;
        this.tz = num6;
        this.dt = l5;
        this.totalSleeptime = l6;
    }

    public Integer getCalorie() {
        return this.calorie;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public Integer getDeepSleep() {
        return this.deepSleep;
    }

    public Integer getDistance() {
        return this.distance;
    }

    public Long getDt() {
        return this.dt;
    }

    public Long getFallSleepTime() {
        return this.fallSleepTime;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getShallowSleep() {
        return this.shallowSleep;
    }

    public Integer getStep() {
        return this.step;
    }

    public Long getTotalSleeptime() {
        return this.totalSleeptime;
    }

    public Integer getTz() {
        return this.tz;
    }

    public String getUid() {
        return this.uid;
    }

    public Long getWakeTime() {
        return this.wakeTime;
    }

    public void setCalorie(Integer num) {
        this.calorie = num;
    }

    public void setCreateTime(Long l) {
        this.createTime = l;
    }

    public void setDeepSleep(Integer num) {
        this.deepSleep = num;
    }

    public void setDistance(Integer num) {
        this.distance = num;
    }

    public void setDt(Long l) {
        this.dt = l;
    }

    public void setFallSleepTime(Long l) {
        this.fallSleepTime = l;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void setShallowSleep(Integer num) {
        this.shallowSleep = num;
    }

    public void setStep(Integer num) {
        this.step = num;
    }

    public void setTotalSleeptime(Long l) {
        this.totalSleeptime = l;
    }

    public void setTz(Integer num) {
        this.tz = num;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setWakeTime(Long l) {
        this.wakeTime = l;
    }

    public Detail() {
    }
}
