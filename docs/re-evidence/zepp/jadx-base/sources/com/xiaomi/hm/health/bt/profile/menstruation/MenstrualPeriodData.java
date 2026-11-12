package com.xiaomi.hm.health.bt.profile.menstruation;

import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualPeriodData;", "", "", "component1", "component2", "", "component3", "startTime", "stopTime", "stopped", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "J", "getStartTime", "()J", "b", "getStopTime", "c", "Z", "getStopped", "()Z", "<init>", "(JJZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MenstrualPeriodData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long stopTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean stopped;

    public MenstrualPeriodData(long j, long j2, boolean z) {
        this.startTime = j;
        this.stopTime = j2;
        this.stopped = z;
    }

    public static /* synthetic */ MenstrualPeriodData copy$default(MenstrualPeriodData menstrualPeriodData, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = menstrualPeriodData.startTime;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = menstrualPeriodData.stopTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            z = menstrualPeriodData.stopped;
        }
        return menstrualPeriodData.copy(j3, j4, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStopTime() {
        return this.stopTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getStopped() {
        return this.stopped;
    }

    @NotNull
    public final MenstrualPeriodData copy(long startTime, long stopTime, boolean stopped) {
        return new MenstrualPeriodData(startTime, stopTime, stopped);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualPeriodData)) {
            return false;
        }
        MenstrualPeriodData menstrualPeriodData = (MenstrualPeriodData) other;
        return this.startTime == menstrualPeriodData.startTime && this.stopTime == menstrualPeriodData.stopTime && this.stopped == menstrualPeriodData.stopped;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getStopTime() {
        return this.stopTime;
    }

    public final boolean getStopped() {
        return this.stopped;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iA = ((b.a(this.startTime) * 31) + b.a(this.stopTime)) * 31;
        boolean z = this.stopped;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iA + r1;
    }

    @NotNull
    public String toString() {
        return "MenstrualPeriodData(startTime=" + this.startTime + ", stopTime=" + this.stopTime + ", stopped=" + this.stopped + ')';
    }
}
