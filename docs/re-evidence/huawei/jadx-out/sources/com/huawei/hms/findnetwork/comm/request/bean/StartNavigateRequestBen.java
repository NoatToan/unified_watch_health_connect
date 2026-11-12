package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class StartNavigateRequestBen extends SnRequestBean {
    private boolean isRestart;
    private long startRecordTime;

    public void setStartRecordTime(long j) {
        this.startRecordTime = j;
    }

    public void setRestart(boolean z) {
        this.isRestart = z;
    }

    public boolean isRestart() {
        return this.isRestart;
    }

    public long getStartRecordTime() {
        return this.startRecordTime;
    }
}
