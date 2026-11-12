package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class GetFidRequestBean extends BaseRequestBean {
    private String macAddress;

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public GetFidRequestBean(String str) {
        this.macAddress = str;
    }
}
