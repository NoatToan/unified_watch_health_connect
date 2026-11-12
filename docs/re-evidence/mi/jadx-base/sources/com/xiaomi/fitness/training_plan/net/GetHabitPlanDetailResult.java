package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/GetHabitPlanDetailResult;", "", "habitPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;)V", "getHabitPlan", "()Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetHabitPlanDetailResult {

    @SerializedName(MiuiCursorConstants.CONTENT)
    @NotNull
    private final HabitPlan habitPlan;

    public GetHabitPlanDetailResult(@NotNull HabitPlan habitPlan) {
        Intrinsics.checkNotNullParameter(habitPlan, "habitPlan");
        this.habitPlan = habitPlan;
    }

    public static /* synthetic */ GetHabitPlanDetailResult copy$default(GetHabitPlanDetailResult getHabitPlanDetailResult, HabitPlan habitPlan, int i, Object obj) {
        if ((i & 1) != 0) {
            habitPlan = getHabitPlanDetailResult.habitPlan;
        }
        return getHabitPlanDetailResult.copy(habitPlan);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HabitPlan getHabitPlan() {
        return this.habitPlan;
    }

    @NotNull
    public final GetHabitPlanDetailResult copy(@NotNull HabitPlan habitPlan) {
        Intrinsics.checkNotNullParameter(habitPlan, "habitPlan");
        return new GetHabitPlanDetailResult(habitPlan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetHabitPlanDetailResult) && Intrinsics.areEqual(this.habitPlan, ((GetHabitPlanDetailResult) other).habitPlan);
    }

    @NotNull
    public final HabitPlan getHabitPlan() {
        return this.habitPlan;
    }

    public int hashCode() {
        return this.habitPlan.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetHabitPlanDetailResult(habitPlan=" + this.habitPlan + ")";
    }
}
