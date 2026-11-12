package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import defpackage.lst;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class TrackAltitudeData implements Serializable {
    private static final long serialVersionUID = 8239372811980674006L;
    private double altitude;
    private long time;

    public TrackAltitudeData() {
    }

    public TrackAltitudeData(long j, double d) {
        this.time = j;
        this.altitude = d;
    }

    public long getTime() {
        return ((Long) lst.d(Long.valueOf(this.time))).longValue();
    }

    public void setTime(long j) {
        this.time = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public double getAltitude() {
        return ((Double) lst.d(Double.valueOf(this.altitude))).doubleValue();
    }

    public void setAltitude(double d) {
        this.altitude = ((Double) lst.d(Double.valueOf(d))).doubleValue();
    }

    public String toString() {
        return "TrackAltitudeData [time=" + this.time + ", altitude=" + this.altitude + "]";
    }
}
