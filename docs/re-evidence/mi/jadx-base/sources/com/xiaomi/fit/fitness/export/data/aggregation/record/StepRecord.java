package com.xiaomi.fit.fitness.export.data.aggregation.record;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.common.utils.TimeUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/record/StepRecord;", "", "time", "", "steps", "", "distance", "calories", "<init>", "(JIII)V", "getTime", "()J", "setTime", "(J)V", "getSteps", "()I", "getDistance", "getCalories", "toString", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepRecord {

    @SerializedName("calories")
    private final int calories;

    @SerializedName("distance")
    private final int distance;

    @SerializedName("steps")
    private final int steps;

    @SerializedName("time")
    private long time;

    public StepRecord(long j, int i, int i2, int i3) {
        this.time = j;
        this.steps = i;
        this.distance = i2;
        this.calories = i3;
    }

    public static /* synthetic */ StepRecord copy$default(StepRecord stepRecord, long j, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = stepRecord.time;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            i = stepRecord.steps;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = stepRecord.distance;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = stepRecord.calories;
        }
        return stepRecord.copy(j2, i5, i6, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    @NotNull
    public final StepRecord copy(long time, int steps, int distance, int calories) {
        return new StepRecord(time, steps, distance, calories);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepRecord)) {
            return false;
        }
        StepRecord stepRecord = (StepRecord) other;
        return this.time == stepRecord.time && this.steps == stepRecord.steps && this.distance == stepRecord.distance && this.calories == stepRecord.calories;
    }

    public final int getCalories() {
        return this.calories;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.steps)) * 31) + Integer.hashCode(this.distance)) * 31) + Integer.hashCode(this.calories);
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "StepRecord{time = " + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(this.time * ((long) 1000))) + ", steps = " + this.steps + ", distance = " + this.distance + ", calories = " + this.calories + "}";
    }
}
