package com.huawei.hms.findnetwork.comm.request.bean.wear;

/* JADX INFO: loaded from: classes33.dex */
public class DeviceBindStatusResponse implements WearResponse {
    private boolean bindStatus;
    private String fid;
    private int syncCode;

    public void setSyncCode(int i) {
        this.syncCode = i;
    }

    public void setFid(String str) {
        this.fid = str;
    }

    public void setBindStatus(boolean z) {
        this.bindStatus = z;
    }

    public boolean isBindStatus() {
        return this.bindStatus;
    }

    public int getSyncCode() {
        return this.syncCode;
    }

    public String getFid() {
        return this.fid;
    }
}
