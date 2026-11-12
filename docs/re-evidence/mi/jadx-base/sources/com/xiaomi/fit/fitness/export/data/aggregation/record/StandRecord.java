package com.xiaomi.fit.fitness.export.data.aggregation.record;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/record/StandRecord;", "", "time", "", "standCount", "", "<init>", "(JI)V", "getTime", "()J", "setTime", "(J)V", "getStandCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StandRecord {
    private final int standCount;
    private long time;

    public StandRecord(long j, int i) {
        this.time = j;
        this.standCount = i;
    }

    public static /* synthetic */ StandRecord copy$default(StandRecord standRecord, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = standRecord.time;
        }
        if ((i2 & 2) != 0) {
            i = standRecord.standCount;
        }
        return standRecord.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStandCount() {
        return this.standCount;
    }

    @NotNull
    public final StandRecord copy(long time, int standCount) {
        return new StandRecord(time, standCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandRecord)) {
            return false;
        }
        StandRecord standRecord = (StandRecord) other;
        return this.time == standRecord.time && this.standCount == standRecord.standCount;
    }

    public final int getStandCount() {
        return this.standCount;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.standCount);
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "StandRecord(time=" + this.time + ", standCount=" + this.standCount + ")";
    }
}
