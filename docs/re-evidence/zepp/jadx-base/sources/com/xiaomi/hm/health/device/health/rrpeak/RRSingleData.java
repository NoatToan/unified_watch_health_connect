package com.xiaomi.hm.health.device.health.rrpeak;

import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class RRSingleData {
    private Long a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private List<Integer> h;
    private String i;

    public Integer getAfResult() {
        return this.e;
    }

    public String getData() {
        return this.i;
    }

    public List<Integer> getIntervalData() {
        return this.h;
    }

    public Long getTimestamp() {
        return this.a;
    }

    public Integer getVersion() {
        return this.f;
    }

    public void setAfResult(Integer num) {
        this.e = num;
    }

    public void setIntervalCnt(Integer num) {
        this.b = num;
    }

    public void setIntervalData(List<Integer> list) {
        this.h = list;
    }

    public void setPosPksCnt(Integer num) {
        this.c = num;
    }

    public void setReserve(Integer num) {
        this.g = num;
    }

    public void setSignalQuality(Integer num) {
        this.d = num;
    }

    public void setTimestamp(Long l) {
        this.a = l;
    }

    public void setVersion(Integer num) {
        this.f = num;
    }

    public String toString() {
        return "RRSingleData{timestamp=" + this.a + ", intervalCnt=" + this.b + ", posPksCnt=" + this.c + ", signalQuality=" + this.d + ", afResult=" + this.e + ", version=" + this.f + ", reserve=" + this.g + '}';
    }
}
