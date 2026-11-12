package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0000J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/CaloriesItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "calories", "", "<init>", "(JF)V", "getTime", "()J", "setTime", "(J)V", "getCalories", "()F", "setCalories", "(F)V", "getTimestamp", "setTimestamp", "", "add", "other", "toString", "", "component1", "component2", "copy", "equals", "", "", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CaloriesItem extends DailyRecordItem {

    @SerializedName("calories")
    private float calories;

    @SerializedName("time")
    private long time;

    public CaloriesItem(long j, float f) {
        super(null);
        this.time = j;
        this.calories = f;
    }

    public static /* synthetic */ CaloriesItem copy$default(CaloriesItem caloriesItem, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = caloriesItem.time;
        }
        if ((i & 2) != 0) {
            f = caloriesItem.calories;
        }
        return caloriesItem.copy(j, f);
    }

    public final void add(@NotNull CaloriesItem other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.calories += other.calories;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getCalories() {
        return this.calories;
    }

    @NotNull
    public final CaloriesItem copy(long time, float calories) {
        return new CaloriesItem(time, calories);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaloriesItem)) {
            return false;
        }
        CaloriesItem caloriesItem = (CaloriesItem) other;
        return this.time == caloriesItem.time && Float.compare(this.calories, caloriesItem.calories) == 0;
    }

    public final float getCalories() {
        return this.calories;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Float.hashCode(this.calories);
    }

    public final void setCalories(float f) {
        this.calories = f;
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
        return "CaloriesItem(time=" + this.time + ", calories = " + this.calories + ", sid=" + getSid() + ")";
    }
}
