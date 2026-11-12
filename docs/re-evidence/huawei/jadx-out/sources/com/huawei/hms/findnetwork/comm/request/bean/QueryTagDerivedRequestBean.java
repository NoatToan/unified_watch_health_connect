package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class QueryTagDerivedRequestBean extends SnRequestBean {
    private long beginTime;
    private long endTime;

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setBeginTime(long j) {
        this.beginTime = j;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getBeginTime() {
        return this.beginTime;
    }
}
