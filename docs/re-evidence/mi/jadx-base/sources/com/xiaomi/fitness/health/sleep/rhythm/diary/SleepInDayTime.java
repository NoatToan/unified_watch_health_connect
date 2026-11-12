package com.xiaomi.fitness.health.sleep.rhythm.diary;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepInDayTime;", "", "sleepInDayStartTime", "", "sleepInDayEndTime", "<init>", "(JJ)V", "getSleepInDayStartTime", "()J", "getSleepInDayEndTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepInDayTime {
    private final long sleepInDayEndTime;
    private final long sleepInDayStartTime;

    public SleepInDayTime(long j, long j2) {
        this.sleepInDayStartTime = j;
        this.sleepInDayEndTime = j2;
    }

    public static /* synthetic */ SleepInDayTime copy$default(SleepInDayTime sleepInDayTime, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sleepInDayTime.sleepInDayStartTime;
        }
        if ((i & 2) != 0) {
            j2 = sleepInDayTime.sleepInDayEndTime;
        }
        return sleepInDayTime.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getSleepInDayStartTime() {
        return this.sleepInDayStartTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSleepInDayEndTime() {
        return this.sleepInDayEndTime;
    }

    @NotNull
    public final SleepInDayTime copy(long sleepInDayStartTime, long sleepInDayEndTime) {
        return new SleepInDayTime(sleepInDayStartTime, sleepInDayEndTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepInDayTime)) {
            return false;
        }
        SleepInDayTime sleepInDayTime = (SleepInDayTime) other;
        return this.sleepInDayStartTime == sleepInDayTime.sleepInDayStartTime && this.sleepInDayEndTime == sleepInDayTime.sleepInDayEndTime;
    }

    public final long getSleepInDayEndTime() {
        return this.sleepInDayEndTime;
    }

    public final long getSleepInDayStartTime() {
        return this.sleepInDayStartTime;
    }

    public int hashCode() {
        return (Long.hashCode(this.sleepInDayStartTime) * 31) + Long.hashCode(this.sleepInDayEndTime);
    }

    @NotNull
    public String toString() {
        return "SleepInDayTime(sleepInDayStartTime=" + this.sleepInDayStartTime + ", sleepInDayEndTime=" + this.sleepInDayEndTime + ")";
    }
}
