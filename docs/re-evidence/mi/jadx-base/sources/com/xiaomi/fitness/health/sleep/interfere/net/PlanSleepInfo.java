package com.xiaomi.fitness.health.sleep.interfere.net;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/PlanSleepInfo;", "", "bedTime", "Lcom/xiaomi/fitness/health/sleep/interfere/net/PlanSleepTimeInfo;", "wakeUpTime", "<init>", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/PlanSleepTimeInfo;Lcom/xiaomi/fitness/health/sleep/interfere/net/PlanSleepTimeInfo;)V", "getBedTime", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/PlanSleepTimeInfo;", "getWakeUpTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlanSleepInfo {

    @SerializedName("bedtime")
    @NotNull
    private final PlanSleepTimeInfo bedTime;

    @SerializedName("wakeUpTime")
    @NotNull
    private final PlanSleepTimeInfo wakeUpTime;

    public PlanSleepInfo(@NotNull PlanSleepTimeInfo bedTime, @NotNull PlanSleepTimeInfo wakeUpTime) {
        Intrinsics.checkNotNullParameter(bedTime, "bedTime");
        Intrinsics.checkNotNullParameter(wakeUpTime, "wakeUpTime");
        this.bedTime = bedTime;
        this.wakeUpTime = wakeUpTime;
    }

    public static /* synthetic */ PlanSleepInfo copy$default(PlanSleepInfo planSleepInfo, PlanSleepTimeInfo planSleepTimeInfo, PlanSleepTimeInfo planSleepTimeInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            planSleepTimeInfo = planSleepInfo.bedTime;
        }
        if ((i & 2) != 0) {
            planSleepTimeInfo2 = planSleepInfo.wakeUpTime;
        }
        return planSleepInfo.copy(planSleepTimeInfo, planSleepTimeInfo2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PlanSleepTimeInfo getBedTime() {
        return this.bedTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PlanSleepTimeInfo getWakeUpTime() {
        return this.wakeUpTime;
    }

    @NotNull
    public final PlanSleepInfo copy(@NotNull PlanSleepTimeInfo bedTime, @NotNull PlanSleepTimeInfo wakeUpTime) {
        Intrinsics.checkNotNullParameter(bedTime, "bedTime");
        Intrinsics.checkNotNullParameter(wakeUpTime, "wakeUpTime");
        return new PlanSleepInfo(bedTime, wakeUpTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanSleepInfo)) {
            return false;
        }
        PlanSleepInfo planSleepInfo = (PlanSleepInfo) other;
        return Intrinsics.areEqual(this.bedTime, planSleepInfo.bedTime) && Intrinsics.areEqual(this.wakeUpTime, planSleepInfo.wakeUpTime);
    }

    @NotNull
    public final PlanSleepTimeInfo getBedTime() {
        return this.bedTime;
    }

    @NotNull
    public final PlanSleepTimeInfo getWakeUpTime() {
        return this.wakeUpTime;
    }

    public int hashCode() {
        return (this.bedTime.hashCode() * 31) + this.wakeUpTime.hashCode();
    }

    @NotNull
    public String toString() {
        return "PlanSleepInfo(bedTime=" + this.bedTime + ", wakeUpTime=" + this.wakeUpTime + ")";
    }
}
