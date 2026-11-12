package com.xiaomi.fit.fitness.export.data.aggregation.record;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/record/CalorieRecord;", "", "time", "", "calories", "", "<init>", "(JI)V", "getTime", "()J", "setTime", "(J)V", "getCalories", "()I", "setCalories", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CalorieRecord {

    @SerializedName("calories")
    private int calories;

    @SerializedName("time")
    private long time;

    public CalorieRecord(long j, int i) {
        this.time = j;
        this.calories = i;
    }

    public static /* synthetic */ CalorieRecord copy$default(CalorieRecord calorieRecord, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = calorieRecord.time;
        }
        if ((i2 & 2) != 0) {
            i = calorieRecord.calories;
        }
        return calorieRecord.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    @NotNull
    public final CalorieRecord copy(long time, int calories) {
        return new CalorieRecord(time, calories);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalorieRecord)) {
            return false;
        }
        CalorieRecord calorieRecord = (CalorieRecord) other;
        return this.time == calorieRecord.time && this.calories == calorieRecord.calories;
    }

    public final int getCalories() {
        return this.calories;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.calories);
    }

    public final void setCalories(int i) {
        this.calories = i;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "CalorieRecord(time=" + this.time + ", calories=" + this.calories + ")";
    }
}
