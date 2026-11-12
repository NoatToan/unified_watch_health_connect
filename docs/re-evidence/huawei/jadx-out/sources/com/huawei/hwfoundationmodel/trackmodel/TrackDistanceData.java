package com.huawei.hwfoundationmodel.trackmodel;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class TrackDistanceData implements Serializable {
    private static final long serialVersionUID = 4008868564220804454L;

    @SerializedName("distance")
    private float distance;

    @SerializedName("time")
    private int time;

    public TrackDistanceData(int i, float f) {
        this.time = i;
        this.distance = f;
    }

    public float getDistance() {
        return this.distance;
    }

    public void setDistance(float f) {
        this.distance = f;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int i) {
        this.time = i;
    }

    public String toString() {
        return "TrackDistanceData{time=" + this.time + ", distance=" + this.distance + '}';
    }
}
