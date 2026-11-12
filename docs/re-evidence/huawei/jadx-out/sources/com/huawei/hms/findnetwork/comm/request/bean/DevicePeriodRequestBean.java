package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class DevicePeriodRequestBean extends BaseRequestBean {
    private String fid;
    private String mac;
    private int years;

    public DevicePeriodRequestBean() {
    }

    public DevicePeriodRequestBean(String str, String str2) {
        this.fid = str;
        this.mac = str2;
    }

    public DevicePeriodRequestBean(String str, String str2, int i) {
        this.fid = str;
        this.mac = str2;
        this.years = i;
    }

    public void setYears(int i) {
        this.years = i;
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public void setFid(String str) {
        this.fid = str;
    }

    public int getYears() {
        return this.years;
    }

    public String getMac() {
        return this.mac;
    }

    public String getFid() {
        return this.fid;
    }
}
