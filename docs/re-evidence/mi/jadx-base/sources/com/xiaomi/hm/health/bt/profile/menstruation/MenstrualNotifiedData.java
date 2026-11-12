package com.xiaomi.hm.health.bt.profile.menstruation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualNotifiedData;", "", "periodContinueTime", "", "periodCycle", "smartSwitch", "", "lastPeriodStartTime", "", "(IIZJ)V", "getLastPeriodStartTime", "()J", "getPeriodContinueTime", "()I", "getPeriodCycle", "getSmartSwitch", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class MenstrualNotifiedData {
    private final long lastPeriodStartTime;
    private final int periodContinueTime;
    private final int periodCycle;
    private final boolean smartSwitch;

    public MenstrualNotifiedData(int i, int i2, boolean z, long j) {
        this.periodContinueTime = i;
        this.periodCycle = i2;
        this.smartSwitch = z;
        this.lastPeriodStartTime = j;
    }

    public static /* synthetic */ MenstrualNotifiedData copy$default(MenstrualNotifiedData menstrualNotifiedData, int i, int i2, boolean z, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = menstrualNotifiedData.periodContinueTime;
        }
        if ((i3 & 2) != 0) {
            i2 = menstrualNotifiedData.periodCycle;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            z = menstrualNotifiedData.smartSwitch;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            j = menstrualNotifiedData.lastPeriodStartTime;
        }
        return menstrualNotifiedData.copy(i, i4, z2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPeriodContinueTime() {
        return this.periodContinueTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPeriodCycle() {
        return this.periodCycle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSmartSwitch() {
        return this.smartSwitch;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastPeriodStartTime() {
        return this.lastPeriodStartTime;
    }

    @NotNull
    public final MenstrualNotifiedData copy(int periodContinueTime, int periodCycle, boolean smartSwitch, long lastPeriodStartTime) {
        return new MenstrualNotifiedData(periodContinueTime, periodCycle, smartSwitch, lastPeriodStartTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualNotifiedData)) {
            return false;
        }
        MenstrualNotifiedData menstrualNotifiedData = (MenstrualNotifiedData) other;
        return this.periodContinueTime == menstrualNotifiedData.periodContinueTime && this.periodCycle == menstrualNotifiedData.periodCycle && this.smartSwitch == menstrualNotifiedData.smartSwitch && this.lastPeriodStartTime == menstrualNotifiedData.lastPeriodStartTime;
    }

    public final long getLastPeriodStartTime() {
        return this.lastPeriodStartTime;
    }

    public final int getPeriodContinueTime() {
        return this.periodContinueTime;
    }

    public final int getPeriodCycle() {
        return this.periodCycle;
    }

    public final boolean getSmartSwitch() {
        return this.smartSwitch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.periodContinueTime) * 31) + Integer.hashCode(this.periodCycle)) * 31;
        boolean z = this.smartSwitch;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + Long.hashCode(this.lastPeriodStartTime);
    }

    @NotNull
    public String toString() {
        return "MenstrualNotifiedData(periodContinueTime=" + this.periodContinueTime + ", periodCycle=" + this.periodCycle + ", smartSwitch=" + this.smartSwitch + ", lastPeriodStartTime=" + this.lastPeriodStartTime + ')';
    }
}
