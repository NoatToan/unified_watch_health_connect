package com.xiaomi.fit.fitness.device.hm.api;

import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/api/ParseResultItem;", "", "isSuccess", "", "timeZone", "", PaiData.LAST_SYNC_TIME, "", "<init>", "(ZIJ)V", "()Z", "getTimeZone", "()I", "getLastSyncTime", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ParseResultItem {
    private final boolean isSuccess;
    private final long lastSyncTime;
    private final int timeZone;

    public ParseResultItem(boolean z, int i, long j) {
        this.isSuccess = z;
        this.timeZone = i;
        this.lastSyncTime = j;
    }

    public static /* synthetic */ ParseResultItem copy$default(ParseResultItem parseResultItem, boolean z, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = parseResultItem.isSuccess;
        }
        if ((i2 & 2) != 0) {
            i = parseResultItem.timeZone;
        }
        if ((i2 & 4) != 0) {
            j = parseResultItem.lastSyncTime;
        }
        return parseResultItem.copy(z, i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLastSyncTime() {
        return this.lastSyncTime;
    }

    @NotNull
    public final ParseResultItem copy(boolean isSuccess, int timeZone, long lastSyncTime) {
        return new ParseResultItem(isSuccess, timeZone, lastSyncTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParseResultItem)) {
            return false;
        }
        ParseResultItem parseResultItem = (ParseResultItem) other;
        return this.isSuccess == parseResultItem.isSuccess && this.timeZone == parseResultItem.timeZone && this.lastSyncTime == parseResultItem.lastSyncTime;
    }

    public final long getLastSyncTime() {
        return this.lastSyncTime;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isSuccess) * 31) + Integer.hashCode(this.timeZone)) * 31) + Long.hashCode(this.lastSyncTime);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "ParseResultItem(isSuccess=" + this.isSuccess + ", timeZone=" + this.timeZone + ", lastSyncTime=" + this.lastSyncTime + ")";
    }

    public /* synthetic */ ParseResultItem(boolean z, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0L : j);
    }
}
