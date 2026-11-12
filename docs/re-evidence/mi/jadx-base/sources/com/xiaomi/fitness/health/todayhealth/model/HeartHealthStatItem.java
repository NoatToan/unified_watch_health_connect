package com.xiaomi.fitness.health.todayhealth.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/HeartHealthStatItem;", "", "time", "", "abnormalCount", "", "normalCount", "otherCount", "<init>", "(JIII)V", "getTime", "()J", "setTime", "(J)V", "getAbnormalCount", "()I", "getNormalCount", "getOtherCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HeartHealthStatItem {
    private final int abnormalCount;
    private final int normalCount;
    private final int otherCount;
    private long time;

    public HeartHealthStatItem(long j, int i, int i2, int i3) {
        this.time = j;
        this.abnormalCount = i;
        this.normalCount = i2;
        this.otherCount = i3;
    }

    public static /* synthetic */ HeartHealthStatItem copy$default(HeartHealthStatItem heartHealthStatItem, long j, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = heartHealthStatItem.time;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            i = heartHealthStatItem.abnormalCount;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = heartHealthStatItem.normalCount;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = heartHealthStatItem.otherCount;
        }
        return heartHealthStatItem.copy(j2, i5, i6, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAbnormalCount() {
        return this.abnormalCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNormalCount() {
        return this.normalCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOtherCount() {
        return this.otherCount;
    }

    @NotNull
    public final HeartHealthStatItem copy(long time, int abnormalCount, int normalCount, int otherCount) {
        return new HeartHealthStatItem(time, abnormalCount, normalCount, otherCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartHealthStatItem)) {
            return false;
        }
        HeartHealthStatItem heartHealthStatItem = (HeartHealthStatItem) other;
        return this.time == heartHealthStatItem.time && this.abnormalCount == heartHealthStatItem.abnormalCount && this.normalCount == heartHealthStatItem.normalCount && this.otherCount == heartHealthStatItem.otherCount;
    }

    public final int getAbnormalCount() {
        return this.abnormalCount;
    }

    public final int getNormalCount() {
        return this.normalCount;
    }

    public final int getOtherCount() {
        return this.otherCount;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.abnormalCount)) * 31) + Integer.hashCode(this.normalCount)) * 31) + Integer.hashCode(this.otherCount);
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "HeartHealthStatItem(time=" + this.time + ", abnormalCount=" + this.abnormalCount + ", normalCount=" + this.normalCount + ", otherCount=" + this.otherCount + ")";
    }
}
