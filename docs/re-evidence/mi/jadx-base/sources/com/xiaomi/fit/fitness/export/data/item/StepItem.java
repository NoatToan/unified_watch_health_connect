package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0000J\b\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J1\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010\u001f\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006+"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/StepItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "steps", "", "distance", "calories", "", "<init>", "(JIIF)V", "getTime", "()J", "setTime", "(J)V", "getSteps", "()I", "setSteps", "(I)V", "getDistance", "setDistance", "getCalories", "()F", "setCalories", "(F)V", "getPrimaryValue", "()Ljava/lang/Integer;", "getTimestamp", "setTimestamp", "", "add", "other", "toString", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepItem extends DailyRecordItem {

    @SerializedName("calories")
    private float calories;

    @SerializedName("distance")
    private int distance;

    @SerializedName("steps")
    private int steps;

    @SerializedName("time")
    private long time;

    public StepItem(long j, int i, int i2, float f) {
        super(null);
        this.time = j;
        this.steps = i;
        this.distance = i2;
        this.calories = f;
    }

    public static /* synthetic */ StepItem copy$default(StepItem stepItem, long j, int i, int i2, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = stepItem.time;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = stepItem.steps;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = stepItem.distance;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            f = stepItem.calories;
        }
        return stepItem.copy(j2, i4, i5, f);
    }

    public final void add(@NotNull StepItem other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.steps += other.steps;
        this.distance += other.distance;
        this.calories += other.calories;
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
    public final float getCalories() {
        return this.calories;
    }

    @NotNull
    public final StepItem copy(long time, int steps, int distance, float calories) {
        return new StepItem(time, steps, distance, calories);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepItem)) {
            return false;
        }
        StepItem stepItem = (StepItem) other;
        return this.time == stepItem.time && this.steps == stepItem.steps && this.distance == stepItem.distance && Float.compare(this.calories, stepItem.calories) == 0;
    }

    public final float getCalories() {
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

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.steps)) * 31) + Integer.hashCode(this.distance)) * 31) + Float.hashCode(this.calories);
    }

    public final void setCalories(float f) {
        this.calories = f;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setSteps(int i) {
        this.steps = i;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    @NotNull
    public String toString() {
        return "StepItem(sid=" + getSid() + ", time=" + this.time + ", steps=" + this.steps + ", distance=" + this.distance + ", calories=" + this.calories + ")";
    }

    @Override // com.xiaomi.fit.fitness.export.data.item.DailyRecordItem, com.xiaomi.fit.fitness.export.data.item.IPointTimeData
    @NotNull
    public Integer getPrimaryValue() {
        return Integer.valueOf(this.steps);
    }
}
