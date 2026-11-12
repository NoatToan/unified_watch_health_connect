package com.huawei.hms.findnetwork.comm.request.bean;

import com.huawei.hms.findnetwork.comm.util.MaskUtil;

/* JADX INFO: loaded from: classes33.dex */
public class TagStatus {
    private int exceptionStatus;
    private String sn;
    private String standbyStatus;
    private int status;

    public String toString() {
        return "DeviceStatus{fid='" + MaskUtil.maskSn(this.sn) + "', status=" + this.status + ", exceptionStatus=" + this.exceptionStatus + ", standbyStatus='" + MaskUtil.maskCommon(this.standbyStatus) + "'}";
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStandbyStatus(String str) {
        this.standbyStatus = str;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setExceptionStatus(int i) {
        this.exceptionStatus = i;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStandbyStatus() {
        return this.standbyStatus;
    }

    public String getSn() {
        return this.sn;
    }

    public int getExceptionStatus() {
        return this.exceptionStatus;
    }

    public TagStatus(String str, int i, int i2, String str2) {
        this.sn = str;
        this.status = i;
        this.exceptionStatus = i2;
        this.standbyStatus = str2;
    }
}
