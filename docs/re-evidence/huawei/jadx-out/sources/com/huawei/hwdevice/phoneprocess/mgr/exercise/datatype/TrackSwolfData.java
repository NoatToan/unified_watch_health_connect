package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import defpackage.lst;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class TrackSwolfData implements Serializable {
    private static final long serialVersionUID = 1765216509700286047L;
    private int mSwolf;
    private long mTime;

    public TrackSwolfData() {
    }

    public TrackSwolfData(long j, int i) {
        this.mTime = ((Long) lst.d(Long.valueOf(j))).longValue();
        this.mSwolf = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long getTime() {
        return ((Long) lst.d(Long.valueOf(this.mTime))).longValue();
    }

    public void setTime(long j) {
        this.mTime = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int getSwolf() {
        return ((Integer) lst.d(Integer.valueOf(this.mSwolf))).intValue();
    }

    public void setSwolf(int i) {
        this.mSwolf = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String toString() {
        return "TrackSwolfData{mTime=" + this.mTime + ", mSwolf=" + this.mSwolf + '}';
    }
}
