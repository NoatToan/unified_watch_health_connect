package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes10.dex */
public class RegisterDetailsBean extends BaseRequestBean {
    private int businessType;
    private String deviceId;
    private String mac;
    private String productId;
    private String udid;

    public void setUdid(String str) {
        this.udid = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setBusinessType(int i) {
        this.businessType = i;
    }

    public String getUdid() {
        return this.udid;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getMac() {
        return this.mac;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public int getBusinessType() {
        return this.businessType;
    }
}
