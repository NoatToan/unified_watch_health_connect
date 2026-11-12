package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JK\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\rHÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanHome;", "Ljava/io/Serializable;", "summary", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanSummary;", "medalInfo", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanMedalInfo;", "planToday", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "planFuture", "", "habitPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "status", "", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanSummary;Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanMedalInfo;Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;Ljava/util/List;Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;I)V", "getSummary", "()Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanSummary;", "getMedalInfo", "()Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanMedalInfo;", "getPlanToday", "()Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "getPlanFuture", "()Ljava/util/List;", "getHabitPlan", "()Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "getStatus", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HabitPlanHome implements Serializable {

    @SerializedName("plan_info")
    @NotNull
    private final HabitPlan habitPlan;

    @SerializedName("medal_info")
    @NotNull
    private final HabitPlanMedalInfo medalInfo;

    @SerializedName("plan_future")
    @NotNull
    private final List<HabitDayPlan> planFuture;

    @SerializedName("plan_today")
    @NotNull
    private final HabitDayPlan planToday;

    @SerializedName("plan_status")
    private final int status;

    @SerializedName("summary")
    @NotNull
    private final HabitPlanSummary summary;

    public HabitPlanHome(@NotNull HabitPlanSummary summary, @NotNull HabitPlanMedalInfo medalInfo, @NotNull HabitDayPlan planToday, @NotNull List<HabitDayPlan> planFuture, @NotNull HabitPlan habitPlan, int i) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(medalInfo, "medalInfo");
        Intrinsics.checkNotNullParameter(planToday, "planToday");
        Intrinsics.checkNotNullParameter(planFuture, "planFuture");
        Intrinsics.checkNotNullParameter(habitPlan, "habitPlan");
        this.summary = summary;
        this.medalInfo = medalInfo;
        this.planToday = planToday;
        this.planFuture = planFuture;
        this.habitPlan = habitPlan;
        this.status = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HabitPlanHome copy$default(HabitPlanHome habitPlanHome, HabitPlanSummary habitPlanSummary, HabitPlanMedalInfo habitPlanMedalInfo, HabitDayPlan habitDayPlan, List list, HabitPlan habitPlan, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            habitPlanSummary = habitPlanHome.summary;
        }
        if ((i2 & 2) != 0) {
            habitPlanMedalInfo = habitPlanHome.medalInfo;
        }
        HabitPlanMedalInfo habitPlanMedalInfo2 = habitPlanMedalInfo;
        if ((i2 & 4) != 0) {
            habitDayPlan = habitPlanHome.planToday;
        }
        HabitDayPlan habitDayPlan2 = habitDayPlan;
        if ((i2 & 8) != 0) {
            list = habitPlanHome.planFuture;
        }
        List list2 = list;
        if ((i2 & 16) != 0) {
            habitPlan = habitPlanHome.habitPlan;
        }
        HabitPlan habitPlan2 = habitPlan;
        if ((i2 & 32) != 0) {
            i = habitPlanHome.status;
        }
        return habitPlanHome.copy(habitPlanSummary, habitPlanMedalInfo2, habitDayPlan2, list2, habitPlan2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HabitPlanSummary getSummary() {
        return this.summary;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HabitPlanMedalInfo getMedalInfo() {
        return this.medalInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HabitDayPlan getPlanToday() {
        return this.planToday;
    }

    @NotNull
    public final List<HabitDayPlan> component4() {
        return this.planFuture;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HabitPlan getHabitPlan() {
        return this.habitPlan;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final HabitPlanHome copy(@NotNull HabitPlanSummary summary, @NotNull HabitPlanMedalInfo medalInfo, @NotNull HabitDayPlan planToday, @NotNull List<HabitDayPlan> planFuture, @NotNull HabitPlan habitPlan, int status) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(medalInfo, "medalInfo");
        Intrinsics.checkNotNullParameter(planToday, "planToday");
        Intrinsics.checkNotNullParameter(planFuture, "planFuture");
        Intrinsics.checkNotNullParameter(habitPlan, "habitPlan");
        return new HabitPlanHome(summary, medalInfo, planToday, planFuture, habitPlan, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HabitPlanHome)) {
            return false;
        }
        HabitPlanHome habitPlanHome = (HabitPlanHome) other;
        return Intrinsics.areEqual(this.summary, habitPlanHome.summary) && Intrinsics.areEqual(this.medalInfo, habitPlanHome.medalInfo) && Intrinsics.areEqual(this.planToday, habitPlanHome.planToday) && Intrinsics.areEqual(this.planFuture, habitPlanHome.planFuture) && Intrinsics.areEqual(this.habitPlan, habitPlanHome.habitPlan) && this.status == habitPlanHome.status;
    }

    @NotNull
    public final HabitPlan getHabitPlan() {
        return this.habitPlan;
    }

    @NotNull
    public final HabitPlanMedalInfo getMedalInfo() {
        return this.medalInfo;
    }

    @NotNull
    public final List<HabitDayPlan> getPlanFuture() {
        return this.planFuture;
    }

    @NotNull
    public final HabitDayPlan getPlanToday() {
        return this.planToday;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final HabitPlanSummary getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return (((((((((this.summary.hashCode() * 31) + this.medalInfo.hashCode()) * 31) + this.planToday.hashCode()) * 31) + this.planFuture.hashCode()) * 31) + this.habitPlan.hashCode()) * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "HabitPlanHome(summary=" + this.summary + ", medalInfo=" + this.medalInfo + ", planToday=" + this.planToday + ", planFuture=" + this.planFuture + ", habitPlan=" + this.habitPlan + ", status=" + this.status + ")";
    }
}
