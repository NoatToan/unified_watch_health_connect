package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GolfGroupInfo;", "", "time", "", "index", "", "count", "timeUsage", "avgHr", "(JIIII)V", "getAvgHr", "()I", "getCount", "getIndex", "getTime", "()J", "getTimeUsage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class GolfGroupInfo {
    private final int avgHr;
    private final int count;
    private final int index;
    private final long time;
    private final int timeUsage;

    public GolfGroupInfo(long j, int i, int i2, int i3, int i4) {
        this.time = j;
        this.index = i;
        this.count = i2;
        this.timeUsage = i3;
        this.avgHr = i4;
    }

    public static /* synthetic */ GolfGroupInfo copy$default(GolfGroupInfo golfGroupInfo, long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j = golfGroupInfo.time;
        }
        long j2 = j;
        if ((i5 & 2) != 0) {
            i = golfGroupInfo.index;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = golfGroupInfo.count;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = golfGroupInfo.timeUsage;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = golfGroupInfo.avgHr;
        }
        return golfGroupInfo.copy(j2, i6, i7, i8, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTimeUsage() {
        return this.timeUsage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAvgHr() {
        return this.avgHr;
    }

    @NotNull
    public final GolfGroupInfo copy(long time, int index, int count, int timeUsage, int avgHr) {
        return new GolfGroupInfo(time, index, count, timeUsage, avgHr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GolfGroupInfo)) {
            return false;
        }
        GolfGroupInfo golfGroupInfo = (GolfGroupInfo) other;
        return this.time == golfGroupInfo.time && this.index == golfGroupInfo.index && this.count == golfGroupInfo.count && this.timeUsage == golfGroupInfo.timeUsage && this.avgHr == golfGroupInfo.avgHr;
    }

    public final int getAvgHr() {
        return this.avgHr;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getTimeUsage() {
        return this.timeUsage;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.index)) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.timeUsage)) * 31) + Integer.hashCode(this.avgHr);
    }

    @NotNull
    public String toString() {
        return "GolfGroupInfo(time=" + this.time + ", index=" + this.index + ", count=" + this.count + ", timeUsage=" + this.timeUsage + ", avgHr=" + this.avgHr + ')';
    }
}
