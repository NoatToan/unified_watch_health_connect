package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class StartFindConfigRequestBean extends BaseRequestBean {
    private String deviceName;
    private String electricity;
    private int goodsType;
    private String mac;

    public void setMac(String str) {
        this.mac = str;
    }

    public void setGoodsType(int i) {
        this.goodsType = i;
    }

    public void setElectricity(String str) {
        this.electricity = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public String getMac() {
        return this.mac;
    }

    public int getGoodsType() {
        return this.goodsType;
    }

    public String getElectricity() {
        return this.electricity;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public StartFindConfigRequestBean(String str) {
        this.mac = str;
    }
}
