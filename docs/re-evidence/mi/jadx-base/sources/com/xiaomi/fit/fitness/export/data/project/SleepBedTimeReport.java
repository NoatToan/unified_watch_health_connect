package com.xiaomi.fit.fitness.export.data.project;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/project/SleepBedTimeReport;", "Ljava/io/Serializable;", "startTime", "", "endTime", "<init>", "(JJ)V", "getStartTime", "()J", "getEndTime", "toString", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepBedTimeReport implements Serializable {
    private final long endTime;
    private final long startTime;

    public SleepBedTimeReport(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }

    public static /* synthetic */ SleepBedTimeReport copy$default(SleepBedTimeReport sleepBedTimeReport, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sleepBedTimeReport.startTime;
        }
        if ((i & 2) != 0) {
            j2 = sleepBedTimeReport.endTime;
        }
        return sleepBedTimeReport.copy(j, j2);
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
    public final SleepBedTimeReport copy(long startTime, long endTime) {
        return new SleepBedTimeReport(startTime, endTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepBedTimeReport)) {
            return false;
        }
        SleepBedTimeReport sleepBedTimeReport = (SleepBedTimeReport) other;
        return this.startTime == sleepBedTimeReport.startTime && this.endTime == sleepBedTimeReport.endTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime);
    }

    @NotNull
    public String toString() {
        return "SleepBedTimeReport{startTime=" + this.startTime + ", endTime=" + this.endTime + "}";
    }
}
