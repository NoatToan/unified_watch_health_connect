package com.xiaomi.hm.health.bt.profile.menstruation;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualNotifiedData;", "", "", "component1", "component2", "", "component3", "", "component4", "periodContinueTime", "periodCycle", "smartSwitch", "lastPeriodStartTime", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getPeriodContinueTime", "()I", "b", "getPeriodCycle", "c", "Z", "getSmartSwitch", "()Z", GoogleApiAvailabilityLight.a, "J", "getLastPeriodStartTime", "()J", "<init>", "(IIZJ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MenstrualNotifiedData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int periodContinueTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int periodCycle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean smartSwitch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long lastPeriodStartTime;

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
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        int i = ((this.periodContinueTime * 31) + this.periodCycle) * 31;
        boolean z = this.smartSwitch;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((i + r1) * 31) + b.a(this.lastPeriodStartTime);
    }

    @NotNull
    public String toString() {
        return "MenstrualNotifiedData(periodContinueTime=" + this.periodContinueTime + ", periodCycle=" + this.periodCycle + ", smartSwitch=" + this.smartSwitch + ", lastPeriodStartTime=" + this.lastPeriodStartTime + ')';
    }
}
