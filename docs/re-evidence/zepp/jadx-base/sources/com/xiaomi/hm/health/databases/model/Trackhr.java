package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class Trackhr {
    private Long a;
    private Integer b;
    private Integer c;
    private Long d;
    private Integer e;
    private Integer f;
    private Integer g;
    private String h;
    private String i;
    private Integer j;

    public Trackhr(Long l, Integer num, Integer num2, Long l2, Integer num3, Integer num4, Integer num5, String str, String str2, Integer num6) {
        this.a = l;
        this.b = num;
        this.c = num2;
        this.d = l2;
        this.e = num3;
        this.f = num4;
        this.g = num5;
        this.h = str;
        this.i = str2;
        this.j = num6;
    }

    public String getBulkhr() {
        return this.i;
    }

    public Integer getCompressed() {
        return this.g;
    }

    public Long getId() {
        return this.a;
    }

    public Integer getSegment() {
        return this.e;
    }

    public Integer getSize() {
        return this.f;
    }

    public Integer getSource() {
        return this.b;
    }

    public String getSummary() {
        return this.h;
    }

    public Integer getSynced() {
        return this.j;
    }

    public Long getTrackid() {
        return this.d;
    }

    public Integer getType() {
        return this.c;
    }

    public void setBulkhr(String str) {
        this.i = str;
    }

    public void setCompressed(Integer num) {
        this.g = num;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setSegment(Integer num) {
        this.e = num;
    }

    public void setSize(Integer num) {
        this.f = num;
    }

    public void setSource(Integer num) {
        this.b = num;
    }

    public void setSummary(String str) {
        this.h = str;
    }

    public void setSynced(Integer num) {
        this.j = num;
    }

    public void setTrackid(Long l) {
        this.d = l;
    }

    public void setType(Integer num) {
        this.c = num;
    }

    public Trackhr() {
    }
}
