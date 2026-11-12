package com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/data/PauseItem;", "", "startTime", "", "endTime", "type", "", "<init>", "(JJI)V", "getStartTime", "()J", "getEndTime", "getType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PauseItem {
    private final long endTime;
    private final long startTime;
    private final int type;

    public PauseItem(long j, long j2, int i) {
        this.startTime = j;
        this.endTime = j2;
        this.type = i;
    }

    public static /* synthetic */ PauseItem copy$default(PauseItem pauseItem, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = pauseItem.startTime;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = pauseItem.endTime;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = pauseItem.type;
        }
        return pauseItem.copy(j3, j4, i);
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
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final PauseItem copy(long startTime, long endTime, int type) {
        return new PauseItem(startTime, endTime, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PauseItem)) {
            return false;
        }
        PauseItem pauseItem = (PauseItem) other;
        return this.startTime == pauseItem.startTime && this.endTime == pauseItem.endTime && this.type == pauseItem.type;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.type);
    }

    @NotNull
    public String toString() {
        return "PauseItem(startTime=" + this.startTime + ", endTime=" + this.endTime + ", type=" + this.type + ")";
    }
}
