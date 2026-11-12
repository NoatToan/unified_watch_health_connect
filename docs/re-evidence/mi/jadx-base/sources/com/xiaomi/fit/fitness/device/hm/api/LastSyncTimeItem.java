package com.xiaomi.fit.fitness.device.hm.api;

import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/api/LastSyncTimeItem;", "", "timeZone", "", PaiData.LAST_SYNC_TIME, "", "<init>", "(IJ)V", "getTimeZone", "()I", "getLastSyncTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LastSyncTimeItem {
    private final long lastSyncTime;
    private final int timeZone;

    public LastSyncTimeItem(int i, long j) {
        this.timeZone = i;
        this.lastSyncTime = j;
    }

    public static /* synthetic */ LastSyncTimeItem copy$default(LastSyncTimeItem lastSyncTimeItem, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = lastSyncTimeItem.timeZone;
        }
        if ((i2 & 2) != 0) {
            j = lastSyncTimeItem.lastSyncTime;
        }
        return lastSyncTimeItem.copy(i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastSyncTime() {
        return this.lastSyncTime;
    }

    @NotNull
    public final LastSyncTimeItem copy(int timeZone, long lastSyncTime) {
        return new LastSyncTimeItem(timeZone, lastSyncTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastSyncTimeItem)) {
            return false;
        }
        LastSyncTimeItem lastSyncTimeItem = (LastSyncTimeItem) other;
        return this.timeZone == lastSyncTimeItem.timeZone && this.lastSyncTime == lastSyncTimeItem.lastSyncTime;
    }

    public final long getLastSyncTime() {
        return this.lastSyncTime;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return (Integer.hashCode(this.timeZone) * 31) + Long.hashCode(this.lastSyncTime);
    }

    @NotNull
    public String toString() {
        return "LastSyncTimeItem(timeZone=" + this.timeZone + ", lastSyncTime=" + this.lastSyncTime + ")";
    }
}
