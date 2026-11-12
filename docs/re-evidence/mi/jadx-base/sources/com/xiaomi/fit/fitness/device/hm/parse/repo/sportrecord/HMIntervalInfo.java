package com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord;

import com.xiaomi.fit.data.common.data.sport.ITSportTrainingState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0013¨\u0006%"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/HMIntervalInfo;", "", "startTime", "", "endTime", "duration", "", "state", "<init>", "(JJII)V", "getStartTime", "()J", "getEndTime", "getDuration", "()I", "getState", "totalSkipCount", "getTotalSkipCount", "setTotalSkipCount", "(I)V", "totalRowCount", "getTotalRowCount", "setTotalRowCount", "totalDistance", "getTotalDistance", "setTotalDistance", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HMIntervalInfo {
    private final int duration;
    private final long endTime;
    private final long startTime;
    private final int state;
    private int totalDistance;
    private int totalRowCount;
    private int totalSkipCount;

    public HMIntervalInfo(long j, long j2, int i, @ITSportTrainingState int i2) {
        this.startTime = j;
        this.endTime = j2;
        this.duration = i;
        this.state = i2;
    }

    public static /* synthetic */ HMIntervalInfo copy$default(HMIntervalInfo hMIntervalInfo, long j, long j2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = hMIntervalInfo.startTime;
        }
        long j3 = j;
        if ((i3 & 2) != 0) {
            j2 = hMIntervalInfo.endTime;
        }
        long j4 = j2;
        if ((i3 & 4) != 0) {
            i = hMIntervalInfo.duration;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = hMIntervalInfo.state;
        }
        return hMIntervalInfo.copy(j3, j4, i4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @NotNull
    public final HMIntervalInfo copy(long startTime, long endTime, int duration, @ITSportTrainingState int state) {
        return new HMIntervalInfo(startTime, endTime, duration, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMIntervalInfo)) {
            return false;
        }
        HMIntervalInfo hMIntervalInfo = (HMIntervalInfo) other;
        return this.startTime == hMIntervalInfo.startTime && this.endTime == hMIntervalInfo.endTime && this.duration == hMIntervalInfo.duration && this.state == hMIntervalInfo.state;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getState() {
        return this.state;
    }

    public final int getTotalDistance() {
        return this.totalDistance;
    }

    public final int getTotalRowCount() {
        return this.totalRowCount;
    }

    public final int getTotalSkipCount() {
        return this.totalSkipCount;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.state);
    }

    public final void setTotalDistance(int i) {
        this.totalDistance = i;
    }

    public final void setTotalRowCount(int i) {
        this.totalRowCount = i;
    }

    public final void setTotalSkipCount(int i) {
        this.totalSkipCount = i;
    }

    @NotNull
    public String toString() {
        return "HMIntervalInfo(startTime=" + this.startTime + ", endTime=" + this.endTime + ", duration=" + this.duration + ", state=" + this.state + ")";
    }
}
