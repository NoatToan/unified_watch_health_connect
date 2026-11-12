package com.huawei.hwfoundationmodel.trackmodel;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class TrackAltPointData implements Serializable {

    @SerializedName("alt")
    private double alt;

    @SerializedName("timestamp")
    private long timestamp;

    public TrackAltPointData(long j, double d) {
        this.timestamp = j;
        this.alt = d;
    }

    public double getAlt() {
        return this.alt;
    }

    public void setAlt(double d) {
        this.alt = d;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }
}
