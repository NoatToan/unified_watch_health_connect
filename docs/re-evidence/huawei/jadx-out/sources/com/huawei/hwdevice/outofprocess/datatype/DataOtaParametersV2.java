package com.huawei.hwdevice.outofprocess.datatype;

import com.google.gson.annotations.SerializedName;
import defpackage.lst;

/* JADX INFO: loaded from: classes10.dex */
public class DataOtaParametersV2 {
    private int appWaitTimeout;
    private int deviceRestartTimeout;
    private int otaUnitSize;

    @SerializedName("ackEnable")
    private boolean isAckEnable = false;
    private long otaInterval = 0;

    @SerializedName("offsetEnable")
    private boolean mOffsetEnable = false;

    public long getOtaInterval() {
        return ((Long) lst.d(Long.valueOf(this.otaInterval))).longValue();
    }

    public void setOtaInterval(long j) {
        this.otaInterval = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public void setAckEnable(long j) {
        if (j == 1) {
            this.isAckEnable = ((Boolean) lst.d(true)).booleanValue();
        }
    }

    public boolean getAckEnable() {
        return ((Boolean) lst.d(Boolean.valueOf(this.isAckEnable))).booleanValue();
    }

    public int getDeviceRestartTimeout() {
        return ((Integer) lst.d(Integer.valueOf(this.deviceRestartTimeout))).intValue();
    }

    public void setDeviceRestartTimeout(int i) {
        this.deviceRestartTimeout = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getAppWaitTimeout() {
        return ((Integer) lst.d(Integer.valueOf(this.appWaitTimeout))).intValue();
    }

    public void setAppWaitTimeout(int i) {
        this.appWaitTimeout = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getOtaUnitSize() {
        return ((Integer) lst.d(Integer.valueOf(this.otaUnitSize))).intValue();
    }

    public void setOtaUnitSize(int i) {
        this.otaUnitSize = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public boolean getOffsetEnable() {
        return ((Boolean) lst.d(Boolean.valueOf(this.mOffsetEnable))).booleanValue();
    }

    public void setOffsetEnable(boolean z) {
        this.mOffsetEnable = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }
}
