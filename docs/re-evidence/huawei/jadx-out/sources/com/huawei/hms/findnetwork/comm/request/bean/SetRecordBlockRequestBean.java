package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class SetRecordBlockRequestBean extends SnRequestBean {
    private int bytelength;
    private int serialNumber;

    public void setSerialNumber(int i) {
        this.serialNumber = i;
    }

    public void setBytelength(int i) {
        this.bytelength = i;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public int getBytelength() {
        return this.bytelength;
    }
}
