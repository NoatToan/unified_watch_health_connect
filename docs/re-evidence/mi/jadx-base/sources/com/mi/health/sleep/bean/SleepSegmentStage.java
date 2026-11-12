package com.mi.health.sleep.bean;

import com.xiaomi.hm.health.dataprocess.StepsInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/mi/health/sleep/bean/SleepSegmentStage;", "", "beginTime", "", "endTime", StepsInfo.KEY_STAGE, "", "<init>", "(JJI)V", "getBeginTime", "()J", "getEndTime", "getStage", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepSegmentStage {
    private final long beginTime;
    private final long endTime;
    private final int stage;

    public SleepSegmentStage(long j, long j2, int i) {
        this.beginTime = j;
        this.endTime = j2;
        this.stage = i;
    }

    public static /* synthetic */ SleepSegmentStage copy$default(SleepSegmentStage sleepSegmentStage, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = sleepSegmentStage.beginTime;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = sleepSegmentStage.endTime;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = sleepSegmentStage.stage;
        }
        return sleepSegmentStage.copy(j3, j4, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBeginTime() {
        return this.beginTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStage() {
        return this.stage;
    }

    @NotNull
    public final SleepSegmentStage copy(long beginTime, long endTime, int stage) {
        return new SleepSegmentStage(beginTime, endTime, stage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepSegmentStage)) {
            return false;
        }
        SleepSegmentStage sleepSegmentStage = (SleepSegmentStage) other;
        return this.beginTime == sleepSegmentStage.beginTime && this.endTime == sleepSegmentStage.endTime && this.stage == sleepSegmentStage.stage;
    }

    public final long getBeginTime() {
        return this.beginTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getStage() {
        return this.stage;
    }

    public int hashCode() {
        return (((Long.hashCode(this.beginTime) * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.stage);
    }

    @NotNull
    public String toString() {
        return "SleepSegmentStage(beginTime=" + this.beginTime + ", endTime=" + this.endTime + ", stage=" + this.stage + ")";
    }
}
