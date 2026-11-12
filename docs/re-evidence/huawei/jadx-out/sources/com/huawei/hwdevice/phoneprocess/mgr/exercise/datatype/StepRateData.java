package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import defpackage.lst;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class StepRateData implements Serializable {
    private static final long serialVersionUID = -1186336294220451546L;
    private int setpRate;
    private long time;

    public StepRateData() {
    }

    public StepRateData(long j, int i) {
        this.time = j;
        this.setpRate = i;
    }

    public long getTime() {
        return ((Long) lst.d(Long.valueOf(this.time))).longValue();
    }

    public void setTime(long j) {
        this.time = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int getStepRate() {
        return ((Integer) lst.d(Integer.valueOf(this.setpRate))).intValue();
    }

    public void setStepRate(int i) {
        this.setpRate = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String toString() {
        return "StepRateData [time=" + this.time + ", stepRate=" + this.setpRate + "]";
    }
}
