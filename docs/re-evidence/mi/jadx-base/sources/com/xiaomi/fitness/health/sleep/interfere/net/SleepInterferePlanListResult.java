package com.xiaomi.fitness.health.sleep.interfere.net;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlanListResult;", "", "plans", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "next", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getPlans", "()Ljava/util/List;", "getNext", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepInterferePlanListResult {

    @SerializedName("next")
    @Nullable
    private final String next;

    @SerializedName("items")
    @Nullable
    private final List<SleepInterferePlan> plans;

    public SleepInterferePlanListResult(@Nullable List<SleepInterferePlan> list, @Nullable String str) {
        this.plans = list;
        this.next = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepInterferePlanListResult copy$default(SleepInterferePlanListResult sleepInterferePlanListResult, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sleepInterferePlanListResult.plans;
        }
        if ((i & 2) != 0) {
            str = sleepInterferePlanListResult.next;
        }
        return sleepInterferePlanListResult.copy(list, str);
    }

    @Nullable
    public final List<SleepInterferePlan> component1() {
        return this.plans;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    @NotNull
    public final SleepInterferePlanListResult copy(@Nullable List<SleepInterferePlan> plans, @Nullable String next) {
        return new SleepInterferePlanListResult(plans, next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepInterferePlanListResult)) {
            return false;
        }
        SleepInterferePlanListResult sleepInterferePlanListResult = (SleepInterferePlanListResult) other;
        return Intrinsics.areEqual(this.plans, sleepInterferePlanListResult.plans) && Intrinsics.areEqual(this.next, sleepInterferePlanListResult.next);
    }

    @Nullable
    public final String getNext() {
        return this.next;
    }

    @Nullable
    public final List<SleepInterferePlan> getPlans() {
        return this.plans;
    }

    public int hashCode() {
        List<SleepInterferePlan> list = this.plans;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.next;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SleepInterferePlanListResult(plans=" + this.plans + ", next=" + this.next + ")";
    }
}
