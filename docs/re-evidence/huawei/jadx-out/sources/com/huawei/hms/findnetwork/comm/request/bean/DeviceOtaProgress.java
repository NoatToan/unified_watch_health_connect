package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class DeviceOtaProgress {
    private int progress;
    private String sn;
    private String version;

    public void setVersion(String str) {
        this.version = str;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setProgress(int i) {
        this.progress = i;
    }

    public String getVersion() {
        return this.version;
    }

    public String getSn() {
        return this.sn;
    }

    public int getProgress() {
        return this.progress;
    }
}
