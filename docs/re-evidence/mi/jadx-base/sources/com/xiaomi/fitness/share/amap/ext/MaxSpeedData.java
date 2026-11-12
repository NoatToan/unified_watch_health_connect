package com.xiaomi.fitness.share.amap.ext;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/share/amap/ext/MaxSpeedData;", "", "maxSpeed", "", "startTime", "", "<init>", "(FJ)V", "getMaxSpeed", "()F", "setMaxSpeed", "(F)V", "getStartTime", "()J", "setStartTime", "(J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MaxSpeedData {
    private float maxSpeed;
    private long startTime;

    public MaxSpeedData(float f, long j) {
        this.maxSpeed = f;
        this.startTime = j;
    }

    public static /* synthetic */ MaxSpeedData copy$default(MaxSpeedData maxSpeedData, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            f = maxSpeedData.maxSpeed;
        }
        if ((i & 2) != 0) {
            j = maxSpeedData.startTime;
        }
        return maxSpeedData.copy(f, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getMaxSpeed() {
        return this.maxSpeed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final MaxSpeedData copy(float maxSpeed, long startTime) {
        return new MaxSpeedData(maxSpeed, startTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaxSpeedData)) {
            return false;
        }
        MaxSpeedData maxSpeedData = (MaxSpeedData) other;
        return Float.compare(this.maxSpeed, maxSpeedData.maxSpeed) == 0 && this.startTime == maxSpeedData.startTime;
    }

    public final float getMaxSpeed() {
        return this.maxSpeed;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (Float.hashCode(this.maxSpeed) * 31) + Long.hashCode(this.startTime);
    }

    public final void setMaxSpeed(float f) {
        this.maxSpeed = f;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    @NotNull
    public String toString() {
        return "MaxSpeedData(maxSpeed=" + this.maxSpeed + ", startTime=" + this.startTime + ")";
    }
}
