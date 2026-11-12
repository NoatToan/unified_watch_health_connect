package com.xiaomi.fitness.repo.healthconnect.biz.daily;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/TimeRange;", "", "startTimeStamp", "", "endTimeStamp", "<init>", "(JJ)V", "getStartTimeStamp", "()J", "getEndTimeStamp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimeRange {
    private final long endTimeStamp;
    private final long startTimeStamp;

    public TimeRange(long j, long j2) {
        this.startTimeStamp = j;
        this.endTimeStamp = j2;
    }

    public static /* synthetic */ TimeRange copy$default(TimeRange timeRange, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = timeRange.startTimeStamp;
        }
        if ((i & 2) != 0) {
            j2 = timeRange.endTimeStamp;
        }
        return timeRange.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    @NotNull
    public final TimeRange copy(long startTimeStamp, long endTimeStamp) {
        return new TimeRange(startTimeStamp, endTimeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeRange)) {
            return false;
        }
        TimeRange timeRange = (TimeRange) other;
        return this.startTimeStamp == timeRange.startTimeStamp && this.endTimeStamp == timeRange.endTimeStamp;
    }

    public final long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public final long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public int hashCode() {
        return (Long.hashCode(this.startTimeStamp) * 31) + Long.hashCode(this.endTimeStamp);
    }

    @NotNull
    public String toString() {
        return "TimeRange(startTimeStamp=" + this.startTimeStamp + ", endTimeStamp=" + this.endTimeStamp + ")";
    }
}
