package com.huawei.watchface.videoedit.param;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public class TargetTimeRange {

    @SerializedName("duration")
    @Expose
    private int duration;

    @SerializedName("start")
    @Expose
    private int start;

    public TargetTimeRange() {
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetTimeRange)) {
            return false;
        }
        TargetTimeRange targetTimeRange = (TargetTimeRange) obj;
        return getStart() == targetTimeRange.getStart() && getDuration() == targetTimeRange.getDuration();
    }

    public int getDuration() {
        int i = this.duration;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final int getStart() {
        int i = this.start;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.start), Integer.valueOf(this.duration));
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public String toString() {
        return "TargetTimeRange{start=" + this.start + ", duration=" + this.duration + '}';
    }

    public TargetTimeRange withDuration(int i) {
        this.duration = i;
        return this;
    }

    public TargetTimeRange withStart(int i) {
        this.start = i;
        return this;
    }

    public TargetTimeRange(int i, int i2) {
        this.start = i;
        this.duration = i2;
    }
}
