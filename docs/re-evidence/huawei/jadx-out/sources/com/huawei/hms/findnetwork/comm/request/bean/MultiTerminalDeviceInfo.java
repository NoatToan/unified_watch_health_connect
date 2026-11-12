package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class MultiTerminalDeviceInfo {
    private String productId;
    private String sn;
    private int synStatus;

    public void setSynStatus(int i) {
        this.synStatus = i;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public int getSynStatus() {
        return this.synStatus;
    }

    public String getSn() {
        return this.sn;
    }

    public String getProductId() {
        return this.productId;
    }

    public MultiTerminalDeviceInfo(String str, int i, String str2) {
        this.sn = str;
        this.synStatus = i;
        this.productId = str2;
    }
}
