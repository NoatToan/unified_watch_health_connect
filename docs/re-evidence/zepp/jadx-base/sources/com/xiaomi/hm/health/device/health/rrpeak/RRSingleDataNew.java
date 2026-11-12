package com.xiaomi.hm.health.device.health.rrpeak;

import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class RRSingleDataNew {
    private Long a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private List<Integer> i;
    private List<Integer> j;

    public Integer getAfResult() {
        return this.f;
    }

    public List<Integer> getAmplitudeData() {
        return this.j;
    }

    public Integer getFirstPeakLoc() {
        return this.b;
    }

    public Integer getIntervalCnt() {
        return this.c;
    }

    public List<Integer> getIntervalData() {
        return this.i;
    }

    public Integer getPosPksCnt() {
        return this.d;
    }

    public Integer getReserve() {
        return this.h;
    }

    public Integer getSignalQuality() {
        return this.e;
    }

    public Long getTimestamp() {
        return this.a;
    }

    public Integer getVersion() {
        return this.g;
    }

    public void setAfResult(Integer num) {
        this.f = num;
    }

    public void setAmplitudeData(List<Integer> list) {
        this.j = list;
    }

    public void setFirstPeakLoc(Integer num) {
        this.b = num;
    }

    public void setIntervalCnt(Integer num) {
        this.c = num;
    }

    public void setIntervalData(List<Integer> list) {
        this.i = list;
    }

    public void setPosPksCnt(Integer num) {
        this.d = num;
    }

    public void setReserve(Integer num) {
        this.h = num;
    }

    public void setSignalQuality(Integer num) {
        this.e = num;
    }

    public void setTimestamp(Long l) {
        this.a = l;
    }

    public void setVersion(Integer num) {
        this.g = num;
    }

    public String toString() {
        return "RRSingleDataNew{timestamp=" + this.a + "，firstPeakLoc=" + this.b + ", intervalCnt=" + this.c + ", posPksCnt=" + this.d + ", signalQuality=" + this.e + ", afResult=" + this.f + ", version=" + this.g + ", reserve=" + this.h + '}';
    }
}
