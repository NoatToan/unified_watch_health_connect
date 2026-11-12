package com.xiaomi.fitness.health.todayhealth.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/AmbulatoryStatItem;", "", "time", "", "abnormalBPCount", "", "normalBPCount", "<init>", "(JII)V", "getTime", "()J", "setTime", "(J)V", "getAbnormalBPCount", "()I", "getNormalBPCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AmbulatoryStatItem {
    private final int abnormalBPCount;
    private final int normalBPCount;
    private long time;

    public AmbulatoryStatItem(long j, int i, int i2) {
        this.time = j;
        this.abnormalBPCount = i;
        this.normalBPCount = i2;
    }

    public static /* synthetic */ AmbulatoryStatItem copy$default(AmbulatoryStatItem ambulatoryStatItem, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = ambulatoryStatItem.time;
        }
        if ((i3 & 2) != 0) {
            i = ambulatoryStatItem.abnormalBPCount;
        }
        if ((i3 & 4) != 0) {
            i2 = ambulatoryStatItem.normalBPCount;
        }
        return ambulatoryStatItem.copy(j, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAbnormalBPCount() {
        return this.abnormalBPCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNormalBPCount() {
        return this.normalBPCount;
    }

    @NotNull
    public final AmbulatoryStatItem copy(long time, int abnormalBPCount, int normalBPCount) {
        return new AmbulatoryStatItem(time, abnormalBPCount, normalBPCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmbulatoryStatItem)) {
            return false;
        }
        AmbulatoryStatItem ambulatoryStatItem = (AmbulatoryStatItem) other;
        return this.time == ambulatoryStatItem.time && this.abnormalBPCount == ambulatoryStatItem.abnormalBPCount && this.normalBPCount == ambulatoryStatItem.normalBPCount;
    }

    public final int getAbnormalBPCount() {
        return this.abnormalBPCount;
    }

    public final int getNormalBPCount() {
        return this.normalBPCount;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((Long.hashCode(this.time) * 31) + Integer.hashCode(this.abnormalBPCount)) * 31) + Integer.hashCode(this.normalBPCount);
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "AmbulatoryStatItem(time=" + this.time + ", abnormalBPCount=" + this.abnormalBPCount + ", normalBPCount=" + this.normalBPCount + ")";
    }
}
