package com.xiaomi.fitness.health.sleep.interfere.net;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereUpdateResult;", "", "plan", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "<init>", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;)V", "getPlan", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepInterfereUpdateResult {

    @SerializedName("success")
    @NotNull
    private final SleepInterferePlan plan;

    public SleepInterfereUpdateResult(@NotNull SleepInterferePlan plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.plan = plan;
    }

    public static /* synthetic */ SleepInterfereUpdateResult copy$default(SleepInterfereUpdateResult sleepInterfereUpdateResult, SleepInterferePlan sleepInterferePlan, int i, Object obj) {
        if ((i & 1) != 0) {
            sleepInterferePlan = sleepInterfereUpdateResult.plan;
        }
        return sleepInterfereUpdateResult.copy(sleepInterferePlan);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SleepInterferePlan getPlan() {
        return this.plan;
    }

    @NotNull
    public final SleepInterfereUpdateResult copy(@NotNull SleepInterferePlan plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        return new SleepInterfereUpdateResult(plan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SleepInterfereUpdateResult) && Intrinsics.areEqual(this.plan, ((SleepInterfereUpdateResult) other).plan);
    }

    @NotNull
    public final SleepInterferePlan getPlan() {
        return this.plan;
    }

    public int hashCode() {
        return this.plan.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepInterfereUpdateResult(plan=" + this.plan + ")";
    }
}
