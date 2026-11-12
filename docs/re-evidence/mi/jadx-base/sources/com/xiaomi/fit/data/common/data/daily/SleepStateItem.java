package com.xiaomi.fit.data.common.data.daily;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.data.common.data.annotation.SleepState;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.statistics.StatConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/data/common/data/daily/SleepStateItem;", "", "Ljava/io/Serializable;", "startTime", "", "endTime", "sleepState", "", "<init>", "(JJI)V", "getStartTime", "()J", "setStartTime", "(J)V", "getEndTime", "setEndTime", "getSleepState", "()I", "compareTo", "other", "component1", "component2", "component3", "copy", "equals", "", "", "hashCode", "toString", "", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepStateItem implements Comparable<SleepStateItem>, Serializable {

    @SerializedName(alternate = {StatConstants.PARAM_END}, value = SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    private long endTime;

    @SerializedName("state")
    private final int sleepState;

    @SerializedName(alternate = {StatConstants.PARAM_START}, value = SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
    private long startTime;

    public SleepStateItem(long j, long j2, @SleepState int i) {
        this.startTime = j;
        this.endTime = j2;
        this.sleepState = i;
    }

    public static /* synthetic */ SleepStateItem copy$default(SleepStateItem sleepStateItem, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = sleepStateItem.startTime;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = sleepStateItem.endTime;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = sleepStateItem.sleepState;
        }
        return sleepStateItem.copy(j3, j4, i);
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
    public final int getSleepState() {
        return this.sleepState;
    }

    @NotNull
    public final SleepStateItem copy(long startTime, long endTime, @SleepState int sleepState) {
        return new SleepStateItem(startTime, endTime, sleepState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepStateItem)) {
            return false;
        }
        SleepStateItem sleepStateItem = (SleepStateItem) other;
        return this.startTime == sleepStateItem.startTime && this.endTime == sleepStateItem.endTime && this.sleepState == sleepStateItem.sleepState;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getSleepState() {
        return this.sleepState;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.sleepState);
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    @NotNull
    public String toString() {
        return "SleepStateItem(startTime=" + this.startTime + ", endTime=" + this.endTime + ", sleepState=" + this.sleepState + ")";
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull SleepStateItem other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (int) (this.startTime - other.startTime);
    }
}
