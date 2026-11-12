package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class SensorData {
    private Long a;
    private Long b;
    private Integer c;
    private Long d;
    private Long e;
    private String f;
    private Integer g;
    private String h;

    public SensorData(Long l, Long l2, Integer num, Long l3, Long l4, String str, Integer num2, String str2) {
        this.a = l;
        this.b = l2;
        this.c = num;
        this.d = l3;
        this.e = l4;
        this.f = str;
        this.g = num2;
        this.h = str2;
    }

    public Long getEndTagTime() {
        return this.e;
    }

    public String getFileName() {
        return this.f;
    }

    public Long getId() {
        return this.a;
    }

    public Long getLabActionId() {
        return this.b;
    }

    public String getResolution() {
        return this.h;
    }

    public Integer getSamplingRate() {
        return this.c;
    }

    public Integer getSensorType() {
        return this.g;
    }

    public Long getStartTagTime() {
        return this.d;
    }

    public void setEndTagTime(Long l) {
        this.e = l;
    }

    public void setFileName(String str) {
        this.f = str;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setLabActionId(Long l) {
        this.b = l;
    }

    public void setResolution(String str) {
        this.h = str;
    }

    public void setSamplingRate(Integer num) {
        this.c = num;
    }

    public void setSensorType(Integer num) {
        this.g = num;
    }

    public void setStartTagTime(Long l) {
        this.d = l;
    }

    public SensorData() {
    }
}
