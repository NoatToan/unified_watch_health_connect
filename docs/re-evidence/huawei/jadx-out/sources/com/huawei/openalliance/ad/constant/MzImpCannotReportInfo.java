package com.huawei.openalliance.ad.constant;

/* JADX INFO: loaded from: classes41.dex */
public class MzImpCannotReportInfo {
    private Long duration;
    private Integer exposeType;
    private Integer maxShowAreaPer;
    private Integer minShowRatio;
    private Long minShowTime;
    private Integer percent;
    private Integer playPercentage;
    private Integer reason;

    public void setReason(Integer num) {
        this.reason = num;
    }

    public void setPlayPercentage(Integer num) {
        this.playPercentage = num;
    }

    public void setPercent(Integer num) {
        this.percent = num;
    }

    public void setMinShowTime(Long l) {
        this.minShowTime = l;
    }

    public void setMinShowRatio(Integer num) {
        this.minShowRatio = num;
    }

    public void setMaxShowAreaPer(Integer num) {
        this.maxShowAreaPer = num;
    }

    public void setExposeType(Integer num) {
        this.exposeType = num;
    }

    public void setDuration(Long l) {
        this.duration = l;
    }

    public Integer getReason() {
        return this.reason;
    }

    public Integer getPlayPercentage() {
        return this.playPercentage;
    }

    public Integer getPercent() {
        return this.percent;
    }

    public Long getMinShowTime() {
        return this.minShowTime;
    }

    public Integer getMinShowRatio() {
        return this.minShowRatio;
    }

    public Integer getMaxShowAreaPer() {
        return this.maxShowAreaPer;
    }

    public Integer getExposeType() {
        return this.exposeType;
    }

    public Long getDuration() {
        return this.duration;
    }
}
