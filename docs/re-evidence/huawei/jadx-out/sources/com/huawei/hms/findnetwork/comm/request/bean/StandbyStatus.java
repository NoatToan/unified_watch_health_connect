package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class StandbyStatus {
    private int combinationStatus;
    private String fid;
    private int sequence;

    public void setSequence(int i) {
        this.sequence = i;
    }

    public void setFid(String str) {
        this.fid = str;
    }

    public void setCombinationStatus(int i) {
        this.combinationStatus = i;
    }

    public int getSequence() {
        return this.sequence;
    }

    public String getFid() {
        return this.fid;
    }

    public int getCombinationStatus() {
        return this.combinationStatus;
    }

    public StandbyStatus(String str, int i, int i2) {
        this.fid = str;
        this.sequence = i;
        this.combinationStatus = i2;
    }
}
