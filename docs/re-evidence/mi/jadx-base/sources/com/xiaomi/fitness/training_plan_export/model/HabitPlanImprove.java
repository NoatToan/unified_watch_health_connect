package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanImprove;", "", "needImprove", "", "improvePlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "<init>", "(ZLcom/xiaomi/fitness/training_plan_export/model/HabitPlan;)V", "getNeedImprove", "()Z", "getImprovePlan", "()Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HabitPlanImprove {

    @SerializedName("plan")
    @NotNull
    private final HabitPlan improvePlan;

    @SerializedName("need_improve")
    private final boolean needImprove;

    public HabitPlanImprove(boolean z, @NotNull HabitPlan improvePlan) {
        Intrinsics.checkNotNullParameter(improvePlan, "improvePlan");
        this.needImprove = z;
        this.improvePlan = improvePlan;
    }

    public static /* synthetic */ HabitPlanImprove copy$default(HabitPlanImprove habitPlanImprove, boolean z, HabitPlan habitPlan, int i, Object obj) {
        if ((i & 1) != 0) {
            z = habitPlanImprove.needImprove;
        }
        if ((i & 2) != 0) {
            habitPlan = habitPlanImprove.improvePlan;
        }
        return habitPlanImprove.copy(z, habitPlan);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getNeedImprove() {
        return this.needImprove;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HabitPlan getImprovePlan() {
        return this.improvePlan;
    }

    @NotNull
    public final HabitPlanImprove copy(boolean needImprove, @NotNull HabitPlan improvePlan) {
        Intrinsics.checkNotNullParameter(improvePlan, "improvePlan");
        return new HabitPlanImprove(needImprove, improvePlan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HabitPlanImprove)) {
            return false;
        }
        HabitPlanImprove habitPlanImprove = (HabitPlanImprove) other;
        return this.needImprove == habitPlanImprove.needImprove && Intrinsics.areEqual(this.improvePlan, habitPlanImprove.improvePlan);
    }

    @NotNull
    public final HabitPlan getImprovePlan() {
        return this.improvePlan;
    }

    public final boolean getNeedImprove() {
        return this.needImprove;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.needImprove) * 31) + this.improvePlan.hashCode();
    }

    @NotNull
    public String toString() {
        return "HabitPlanImprove(needImprove=" + this.needImprove + ", improvePlan=" + this.improvePlan + ")";
    }

    public /* synthetic */ HabitPlanImprove(boolean z, HabitPlan habitPlan, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, habitPlan);
    }
}
