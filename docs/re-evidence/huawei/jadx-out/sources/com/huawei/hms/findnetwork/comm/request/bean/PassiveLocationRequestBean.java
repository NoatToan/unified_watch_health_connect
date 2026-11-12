package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class PassiveLocationRequestBean extends SnRequestBean {
    private long endTime;
    private int locationSourceType;
    private long startTime;

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setLocationSourceType(int i) {
        this.locationSourceType = i;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getLocationSourceType() {
        return this.locationSourceType;
    }

    public long getEndTime() {
        return this.endTime;
    }
}
