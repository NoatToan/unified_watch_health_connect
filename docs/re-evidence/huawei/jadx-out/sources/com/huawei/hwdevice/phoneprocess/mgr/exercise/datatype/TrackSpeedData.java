package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import defpackage.lst;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class TrackSpeedData implements Serializable {
    private static final long serialVersionUID = -6754616340266058150L;
    private int mRealTimeSpeed;
    private long mTime;

    public TrackSpeedData() {
    }

    public TrackSpeedData(long j, int i) {
        this.mTime = ((Long) lst.d(Long.valueOf(j))).longValue();
        this.mRealTimeSpeed = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long getTime() {
        return ((Long) lst.d(Long.valueOf(this.mTime))).longValue();
    }

    public void setTime(long j) {
        this.mTime = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int getRealTimeSpeed() {
        return ((Integer) lst.d(Integer.valueOf(this.mRealTimeSpeed))).intValue();
    }

    public void setRealTimeSpeed(int i) {
        this.mRealTimeSpeed = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("TrackPullFreqData{mTime=");
        sb.append(this.mTime);
        sb.append("mRealTimeSpeed=");
        sb.append(this.mRealTimeSpeed);
        return sb.toString();
    }
}
