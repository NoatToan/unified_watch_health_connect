package com.xiaomi.hm.health.bt.sdk.data;

/* JADX INFO: loaded from: classes11.dex */
public class FatBurningData {
    private long endTime;
    private long startTime;

    public FatBurningData(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }
}
