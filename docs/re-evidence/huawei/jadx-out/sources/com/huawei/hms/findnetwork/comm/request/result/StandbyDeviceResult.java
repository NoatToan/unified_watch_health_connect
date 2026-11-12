package com.huawei.hms.findnetwork.comm.request.result;

import com.huawei.hms.findnetwork.comm.util.MaskUtil;

/* JADX INFO: loaded from: classes33.dex */
public class StandbyDeviceResult {
    private String fid;
    private Integer sequence;
    private Integer status;

    public StandbyDeviceResult(Integer num, String str) {
        this.sequence = num;
        this.fid = str;
    }

    public StandbyDeviceResult(Integer num, String str, Integer num2) {
        this.sequence = num;
        this.fid = str;
        this.status = num2;
    }

    public String toString() {
        return "{fid=" + MaskUtil.maskSn(this.fid) + ", sequence=" + this.sequence + ", status=" + this.status + "}";
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setSequence(Integer num) {
        this.sequence = num;
    }

    public void setFid(String str) {
        this.fid = str;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public String getFid() {
        return this.fid;
    }
}
