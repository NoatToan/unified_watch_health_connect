package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GolfGroupInfo;", "", "", "component1", "", "component2", "component3", "component4", "component5", "time", "index", "count", "timeUsage", "avgHr", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "b", LogUtil.I, "getIndex", "()I", "c", "getCount", GoogleApiAvailabilityLight.a, "getTimeUsage", "e", "getAvgHr", "<init>", "(JIIII)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GolfGroupInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int count;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int timeUsage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int avgHr;

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
        return (((((((defpackage.b.a(this.time) * 31) + this.index) * 31) + this.count) * 31) + this.timeUsage) * 31) + this.avgHr;
    }

    @NotNull
    public String toString() {
        return "GolfGroupInfo(time=" + this.time + ", index=" + this.index + ", count=" + this.count + ", timeUsage=" + this.timeUsage + ", avgHr=" + this.avgHr + ')';
    }
}
