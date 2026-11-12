package com.huawei.hwbtsdk.btdatatype.datatype;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import defpackage.cpu;

/* JADX INFO: loaded from: classes10.dex */
public class OperationDeviceInfo extends DeviceInfo {
    private long mEndConnectTime;
    private int mErrorCode;
    private String mErrorMeathod;
    private long mStartConnectTime;

    public long getStartConnectTime() {
        return ((Long) cpu.a(Long.valueOf(this.mStartConnectTime))).longValue();
    }

    public void setStartConnectTime(long j) {
        this.mStartConnectTime = ((Long) cpu.a(Long.valueOf(j))).longValue();
    }

    public long getEndConnectTime() {
        return ((Long) cpu.a(Long.valueOf(this.mEndConnectTime))).longValue();
    }

    public void setEndConnectTime(long j) {
        this.mEndConnectTime = ((Long) cpu.a(Long.valueOf(j))).longValue();
    }

    public int getErrorCode() {
        return ((Integer) cpu.a(Integer.valueOf(this.mErrorCode))).intValue();
    }

    public void setErrorCode(int i) {
        this.mErrorCode = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public String getErrorMeathod() {
        return (String) cpu.a(this.mErrorMeathod);
    }

    public void setErrorMeathod(String str) {
        this.mErrorMeathod = (String) cpu.a(str);
    }
}
