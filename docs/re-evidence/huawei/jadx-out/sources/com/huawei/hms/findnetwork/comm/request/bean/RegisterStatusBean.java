package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes10.dex */
public class RegisterStatusBean extends BaseRequestBean {
    private String deviceId;
    private String displayName;
    private int status;

    public void setStatus(int i) {
        this.status = i;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public int getStatus() {
        return this.status;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getDeviceId() {
        return this.deviceId;
    }
}
