package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan;
import com.xiaomi.fitness.training_plan_export.model.AbilityMedalInfo;
import com.xiaomi.fitness.training_plan_export.model.AbilitySummary;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/GetAbilityDetailSummaryResult;", "", "summary", "Lcom/xiaomi/fitness/training_plan_export/model/AbilitySummary;", "medalInfo", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityMedalInfo;", "plans", "", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilitySummary;Lcom/xiaomi/fitness/training_plan_export/model/AbilityMedalInfo;Ljava/util/List;)V", "getSummary", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilitySummary;", "getMedalInfo", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilityMedalInfo;", "getPlans", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetAbilityDetailSummaryResult {

    @SerializedName("medal_info")
    @NotNull
    private final AbilityMedalInfo medalInfo;

    @SerializedName("plan")
    @NotNull
    private final List<AbilityDayPlan> plans;

    @SerializedName("summary")
    @NotNull
    private final AbilitySummary summary;

    public GetAbilityDetailSummaryResult(@NotNull AbilitySummary summary, @NotNull AbilityMedalInfo medalInfo, @NotNull List<AbilityDayPlan> plans) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(medalInfo, "medalInfo");
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.summary = summary;
        this.medalInfo = medalInfo;
        this.plans = plans;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAbilityDetailSummaryResult copy$default(GetAbilityDetailSummaryResult getAbilityDetailSummaryResult, AbilitySummary abilitySummary, AbilityMedalInfo abilityMedalInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            abilitySummary = getAbilityDetailSummaryResult.summary;
        }
        if ((i & 2) != 0) {
            abilityMedalInfo = getAbilityDetailSummaryResult.medalInfo;
        }
        if ((i & 4) != 0) {
            list = getAbilityDetailSummaryResult.plans;
        }
        return getAbilityDetailSummaryResult.copy(abilitySummary, abilityMedalInfo, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AbilitySummary getSummary() {
        return this.summary;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AbilityMedalInfo getMedalInfo() {
        return this.medalInfo;
    }

    @NotNull
    public final List<AbilityDayPlan> component3() {
        return this.plans;
    }

    @NotNull
    public final GetAbilityDetailSummaryResult copy(@NotNull AbilitySummary summary, @NotNull AbilityMedalInfo medalInfo, @NotNull List<AbilityDayPlan> plans) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(medalInfo, "medalInfo");
        Intrinsics.checkNotNullParameter(plans, "plans");
        return new GetAbilityDetailSummaryResult(summary, medalInfo, plans);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAbilityDetailSummaryResult)) {
            return false;
        }
        GetAbilityDetailSummaryResult getAbilityDetailSummaryResult = (GetAbilityDetailSummaryResult) other;
        return Intrinsics.areEqual(this.summary, getAbilityDetailSummaryResult.summary) && Intrinsics.areEqual(this.medalInfo, getAbilityDetailSummaryResult.medalInfo) && Intrinsics.areEqual(this.plans, getAbilityDetailSummaryResult.plans);
    }

    @NotNull
    public final AbilityMedalInfo getMedalInfo() {
        return this.medalInfo;
    }

    @NotNull
    public final List<AbilityDayPlan> getPlans() {
        return this.plans;
    }

    @NotNull
    public final AbilitySummary getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return (((this.summary.hashCode() * 31) + this.medalInfo.hashCode()) * 31) + this.plans.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetAbilityDetailSummaryResult(summary=" + this.summary + ", medalInfo=" + this.medalInfo + ", plans=" + this.plans + ")";
    }
}
