package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "runningIndicator", "", "runningIndicatorLevel", "", "<init>", "(JFLjava/lang/Integer;)V", "getTime", "()J", "setTime", "(J)V", "getRunningIndicator", "()F", "getRunningIndicatorLevel", "()Ljava/lang/Integer;", "setRunningIndicatorLevel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTimestamp", "setTimestamp", "", "component1", "component2", "component3", "copy", "(JFLjava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;", "equals", "", "other", "", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RunningIndicatorItem extends DailyRecordItem {

    @SerializedName(FitnessPersistKey.RunningIndicator)
    private final float runningIndicator;

    @SerializedName("running_ability_level")
    @Nullable
    private Integer runningIndicatorLevel;

    @SerializedName("time")
    private long time;

    public /* synthetic */ RunningIndicatorItem(long j, float f, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, (i & 4) != 0 ? null : num);
    }

    public static /* synthetic */ RunningIndicatorItem copy$default(RunningIndicatorItem runningIndicatorItem, long j, float f, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = runningIndicatorItem.time;
        }
        if ((i & 2) != 0) {
            f = runningIndicatorItem.runningIndicator;
        }
        if ((i & 4) != 0) {
            num = runningIndicatorItem.runningIndicatorLevel;
        }
        return runningIndicatorItem.copy(j, f, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getRunningIndicator() {
        return this.runningIndicator;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getRunningIndicatorLevel() {
        return this.runningIndicatorLevel;
    }

    @NotNull
    public final RunningIndicatorItem copy(long time, float runningIndicator, @Nullable Integer runningIndicatorLevel) {
        return new RunningIndicatorItem(time, runningIndicator, runningIndicatorLevel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunningIndicatorItem)) {
            return false;
        }
        RunningIndicatorItem runningIndicatorItem = (RunningIndicatorItem) other;
        return this.time == runningIndicatorItem.time && Float.compare(this.runningIndicator, runningIndicatorItem.runningIndicator) == 0 && Intrinsics.areEqual(this.runningIndicatorLevel, runningIndicatorItem.runningIndicatorLevel);
    }

    public final float getRunningIndicator() {
        return this.runningIndicator;
    }

    @Nullable
    public final Integer getRunningIndicatorLevel() {
        return this.runningIndicatorLevel;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.time) * 31) + Float.hashCode(this.runningIndicator)) * 31;
        Integer num = this.runningIndicatorLevel;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setRunningIndicatorLevel(@Nullable Integer num) {
        this.runningIndicatorLevel = num;
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
        return "RunningIndicatorItem(time=" + this.time + ", runningIndicator=" + this.runningIndicator + ", runningIndicatorLevel=" + this.runningIndicatorLevel + ")";
    }

    public RunningIndicatorItem(long j, float f, @Nullable Integer num) {
        super(null);
        this.time = j;
        this.runningIndicator = f;
        this.runningIndicatorLevel = num;
    }
}
