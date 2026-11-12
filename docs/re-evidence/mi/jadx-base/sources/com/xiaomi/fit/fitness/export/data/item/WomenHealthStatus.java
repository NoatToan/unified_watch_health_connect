package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.annotation.MenstruationStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthStatus;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "status", "", "updateTime", "<init>", "(JIJ)V", "getTime", "()J", "setTime", "(J)V", "getStatus", "()I", "getUpdateTime", "getTimestamp", "setTimestamp", "", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WomenHealthStatus extends DailyRecordItem {

    @SerializedName("status")
    private final int status;

    @SerializedName("date_time")
    private long time;

    @SerializedName("update_time")
    private final long updateTime;

    public WomenHealthStatus(long j, @MenstruationStatus int i, long j2) {
        super(null);
        this.time = j;
        this.status = i;
        this.updateTime = j2;
    }

    public static /* synthetic */ WomenHealthStatus copy$default(WomenHealthStatus womenHealthStatus, long j, int i, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = womenHealthStatus.time;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            i = womenHealthStatus.status;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j2 = womenHealthStatus.updateTime;
        }
        return womenHealthStatus.copy(j3, i3, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final WomenHealthStatus copy(long time, @MenstruationStatus int status, long updateTime) {
        return new WomenHealthStatus(time, status, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WomenHealthStatus)) {
            return false;
        }
        WomenHealthStatus womenHealthStatus = (WomenHealthStatus) other;
        return this.time == womenHealthStatus.time && this.status == womenHealthStatus.status && this.updateTime == womenHealthStatus.updateTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (((Long.hashCode(this.time) * 31) + Integer.hashCode(this.status)) * 31) + Long.hashCode(this.updateTime);
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
        return "WomenHealthStatus(time=" + this.time + ", status=" + this.status + ", updateTime=" + this.updateTime + ")";
    }
}
