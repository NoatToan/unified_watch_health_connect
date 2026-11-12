package com.xiaomi.fit.fitness.export.data.item;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/RecentAbnormalDataItem;", "", "startTime", "", "endTime", "lowValue", "", "highValue", "multi", "", "<init>", "(JJIIZ)V", "getStartTime", "()J", "setStartTime", "(J)V", "getEndTime", "setEndTime", "getLowValue", "()I", "setLowValue", "(I)V", "getHighValue", "setHighValue", "getMulti", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentAbnormalDataItem {
    private long endTime;
    private int highValue;
    private int lowValue;
    private final boolean multi;
    private long startTime;

    public RecentAbnormalDataItem(long j, long j2, int i, int i2, boolean z) {
        this.startTime = j;
        this.endTime = j2;
        this.lowValue = i;
        this.highValue = i2;
        this.multi = z;
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
    public final int getLowValue() {
        return this.lowValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHighValue() {
        return this.highValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getMulti() {
        return this.multi;
    }

    @NotNull
    public final RecentAbnormalDataItem copy(long startTime, long endTime, int lowValue, int highValue, boolean multi) {
        return new RecentAbnormalDataItem(startTime, endTime, lowValue, highValue, multi);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentAbnormalDataItem)) {
            return false;
        }
        RecentAbnormalDataItem recentAbnormalDataItem = (RecentAbnormalDataItem) other;
        return this.startTime == recentAbnormalDataItem.startTime && this.endTime == recentAbnormalDataItem.endTime && this.lowValue == recentAbnormalDataItem.lowValue && this.highValue == recentAbnormalDataItem.highValue && this.multi == recentAbnormalDataItem.multi;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getHighValue() {
        return this.highValue;
    }

    public final int getLowValue() {
        return this.lowValue;
    }

    public final boolean getMulti() {
        return this.multi;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.lowValue)) * 31) + Integer.hashCode(this.highValue)) * 31) + Boolean.hashCode(this.multi);
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setHighValue(int i) {
        this.highValue = i;
    }

    public final void setLowValue(int i) {
        this.lowValue = i;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    @NotNull
    public String toString() {
        return "RecentAbnormalDataItem(startTime=" + this.startTime + ", endTime=" + this.endTime + ", lowValue=" + this.lowValue + ", highValue=" + this.highValue + ", multi=" + this.multi + ")";
    }
}
