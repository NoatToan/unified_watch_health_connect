package com.xiaomi.hm.health.running;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/running/TimeRange;", "", "", "component1", "component2", "startTime", "endTime", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getStartTime", "()J", "b", "getEndTime", "<init>", "(JJ)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TimeRange {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long endTime;

    public TimeRange(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }

    public static /* synthetic */ TimeRange copy$default(TimeRange timeRange, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = timeRange.startTime;
        }
        if ((i & 2) != 0) {
            j2 = timeRange.endTime;
        }
        return timeRange.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final TimeRange copy(long startTime, long endTime) {
        return new TimeRange(startTime, endTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeRange)) {
            return false;
        }
        TimeRange timeRange = (TimeRange) other;
        return this.startTime == timeRange.startTime && this.endTime == timeRange.endTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (defpackage.b.a(this.startTime) * 31) + defpackage.b.a(this.endTime);
    }

    @NotNull
    public String toString() {
        return "TimeRange(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }
}
