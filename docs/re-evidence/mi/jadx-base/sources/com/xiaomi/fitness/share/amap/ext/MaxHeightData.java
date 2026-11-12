package com.xiaomi.fitness.share.amap.ext;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/share/amap/ext/MaxHeightData;", "", "maxHeight", "", "startTime", "", "<init>", "(IJ)V", "getMaxHeight", "()I", "setMaxHeight", "(I)V", "getStartTime", "()J", "setStartTime", "(J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MaxHeightData {
    private int maxHeight;
    private long startTime;

    public MaxHeightData(int i, long j) {
        this.maxHeight = i;
        this.startTime = j;
    }

    public static /* synthetic */ MaxHeightData copy$default(MaxHeightData maxHeightData, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = maxHeightData.maxHeight;
        }
        if ((i2 & 2) != 0) {
            j = maxHeightData.startTime;
        }
        return maxHeightData.copy(i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxHeight() {
        return this.maxHeight;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final MaxHeightData copy(int maxHeight, long startTime) {
        return new MaxHeightData(maxHeight, startTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaxHeightData)) {
            return false;
        }
        MaxHeightData maxHeightData = (MaxHeightData) other;
        return this.maxHeight == maxHeightData.maxHeight && this.startTime == maxHeightData.startTime;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (Integer.hashCode(this.maxHeight) * 31) + Long.hashCode(this.startTime);
    }

    public final void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    @NotNull
    public String toString() {
        return "MaxHeightData(maxHeight=" + this.maxHeight + ", startTime=" + this.startTime + ")";
    }
}
