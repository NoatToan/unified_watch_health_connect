package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.training_plan_export.model.PlanType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/GetPlanTypeListResult;", "", "hasHabitHistory", "", "planExist", "planList", "", "Lcom/xiaomi/fitness/training_plan_export/model/PlanType;", "<init>", "(ZZLjava/util/List;)V", "getHasHabitHistory", "()Z", "getPlanExist", "getPlanList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetPlanTypeListResult {

    @SerializedName("has_build_history")
    private final boolean hasHabitHistory;

    @SerializedName("plan_exist")
    private final boolean planExist;

    @SerializedName("plan_list")
    @NotNull
    private final List<PlanType> planList;

    public GetPlanTypeListResult(boolean z, boolean z2, @NotNull List<PlanType> planList) {
        Intrinsics.checkNotNullParameter(planList, "planList");
        this.hasHabitHistory = z;
        this.planExist = z2;
        this.planList = planList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetPlanTypeListResult copy$default(GetPlanTypeListResult getPlanTypeListResult, boolean z, boolean z2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getPlanTypeListResult.hasHabitHistory;
        }
        if ((i & 2) != 0) {
            z2 = getPlanTypeListResult.planExist;
        }
        if ((i & 4) != 0) {
            list = getPlanTypeListResult.planList;
        }
        return getPlanTypeListResult.copy(z, z2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasHabitHistory() {
        return this.hasHabitHistory;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPlanExist() {
        return this.planExist;
    }

    @NotNull
    public final List<PlanType> component3() {
        return this.planList;
    }

    @NotNull
    public final GetPlanTypeListResult copy(boolean hasHabitHistory, boolean planExist, @NotNull List<PlanType> planList) {
        Intrinsics.checkNotNullParameter(planList, "planList");
        return new GetPlanTypeListResult(hasHabitHistory, planExist, planList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPlanTypeListResult)) {
            return false;
        }
        GetPlanTypeListResult getPlanTypeListResult = (GetPlanTypeListResult) other;
        return this.hasHabitHistory == getPlanTypeListResult.hasHabitHistory && this.planExist == getPlanTypeListResult.planExist && Intrinsics.areEqual(this.planList, getPlanTypeListResult.planList);
    }

    public final boolean getHasHabitHistory() {
        return this.hasHabitHistory;
    }

    public final boolean getPlanExist() {
        return this.planExist;
    }

    @NotNull
    public final List<PlanType> getPlanList() {
        return this.planList;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.hasHabitHistory) * 31) + Boolean.hashCode(this.planExist)) * 31) + this.planList.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetPlanTypeListResult(hasHabitHistory=" + this.hasHabitHistory + ", planExist=" + this.planExist + ", planList=" + this.planList + ")";
    }
}
