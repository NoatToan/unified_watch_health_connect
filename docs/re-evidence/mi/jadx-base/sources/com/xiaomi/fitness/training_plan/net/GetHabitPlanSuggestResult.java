package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/GetHabitPlanSuggestResult;", "", "result", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;)V", "getResult", "()Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetHabitPlanSuggestResult {

    @SerializedName("result")
    @NotNull
    private final HabitPlan result;

    public GetHabitPlanSuggestResult(@NotNull HabitPlan result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
    }

    public static /* synthetic */ GetHabitPlanSuggestResult copy$default(GetHabitPlanSuggestResult getHabitPlanSuggestResult, HabitPlan habitPlan, int i, Object obj) {
        if ((i & 1) != 0) {
            habitPlan = getHabitPlanSuggestResult.result;
        }
        return getHabitPlanSuggestResult.copy(habitPlan);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HabitPlan getResult() {
        return this.result;
    }

    @NotNull
    public final GetHabitPlanSuggestResult copy(@NotNull HabitPlan result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new GetHabitPlanSuggestResult(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetHabitPlanSuggestResult) && Intrinsics.areEqual(this.result, ((GetHabitPlanSuggestResult) other).result);
    }

    @NotNull
    public final HabitPlan getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetHabitPlanSuggestResult(result=" + this.result + ")";
    }
}
