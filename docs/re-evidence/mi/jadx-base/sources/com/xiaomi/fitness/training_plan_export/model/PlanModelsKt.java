package com.xiaomi.fitness.training_plan_export.model;

import android.text.TextUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\n\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\f\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\r\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\r\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u000f\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0010\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0011\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0012¨\u0006\u0013"}, d2 = {"isFinished", "", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "finish", "", "isOnGoing", "isExpired", "isNotStarted", "isValid", "Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekHabitPlan;", "Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekAbilityPlan;", "isMade", "Lcom/xiaomi/fitness/training_plan_export/model/PlanType;", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "hasCourse", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanEntranceInfo;", "Lcom/xiaomi/fitness/training_plan_export/model/SportKey;", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDetailSummary;", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanHome;", "training-plan-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PlanModelsKt {
    public static final void finish(@NotNull AbilityDayPlanCourse abilityDayPlanCourse) {
        Intrinsics.checkNotNullParameter(abilityDayPlanCourse, "<this>");
        abilityDayPlanCourse.setStatus(3);
    }

    public static final boolean hasCourse(@NotNull AbilityPlanEntranceInfo abilityPlanEntranceInfo) {
        Intrinsics.checkNotNullParameter(abilityPlanEntranceInfo, "<this>");
        return abilityPlanEntranceInfo.getHasCourse() == 1;
    }

    public static final boolean isExpired(@NotNull AbilityDayPlanCourse abilityDayPlanCourse) {
        Intrinsics.checkNotNullParameter(abilityDayPlanCourse, "<this>");
        return abilityDayPlanCourse.getStatus() == 4;
    }

    public static final boolean isFinished(@NotNull AbilityDayPlanCourse abilityDayPlanCourse) {
        Intrinsics.checkNotNullParameter(abilityDayPlanCourse, "<this>");
        return abilityDayPlanCourse.getStatus() == 3;
    }

    public static final boolean isMade(@NotNull PlanType planType) {
        Intrinsics.checkNotNullParameter(planType, "<this>");
        return planType.getMadeStatus() == 1;
    }

    public static final boolean isNotStarted(@NotNull AbilityDayPlanCourse abilityDayPlanCourse) {
        Intrinsics.checkNotNullParameter(abilityDayPlanCourse, "<this>");
        return abilityDayPlanCourse.getStatus() == 1;
    }

    public static final boolean isOnGoing(@NotNull AbilityDayPlanCourse abilityDayPlanCourse) {
        Intrinsics.checkNotNullParameter(abilityDayPlanCourse, "<this>");
        return abilityDayPlanCourse.getStatus() == 2;
    }

    public static final boolean isValid(@NotNull CurrentWeekHabitPlan currentWeekHabitPlan) {
        List<HabitDayPlan> habitDayPlans;
        Intrinsics.checkNotNullParameter(currentWeekHabitPlan, "<this>");
        return (currentWeekHabitPlan.getPlanId() == 0 || (habitDayPlans = currentWeekHabitPlan.getHabitDayPlans()) == null || habitDayPlans.isEmpty()) ? false : true;
    }

    public static final void finish(@NotNull HabitDayPlan habitDayPlan) {
        Intrinsics.checkNotNullParameter(habitDayPlan, "<this>");
        habitDayPlan.setStatus(3);
    }

    public static final boolean isFinished(@NotNull HabitDayPlan habitDayPlan) {
        Intrinsics.checkNotNullParameter(habitDayPlan, "<this>");
        return habitDayPlan.getStatus() == 3;
    }

    public static final boolean isValid(@NotNull CurrentWeekAbilityPlan currentWeekAbilityPlan) {
        List<AbilityDayPlan> abilityDayPlans;
        Intrinsics.checkNotNullParameter(currentWeekAbilityPlan, "<this>");
        return (currentWeekAbilityPlan.getPlanId() <= 0 || (abilityDayPlans = currentWeekAbilityPlan.getAbilityDayPlans()) == null || abilityDayPlans.isEmpty()) ? false : true;
    }

    public static final boolean isFinished(@NotNull AbilityDetailSummary abilityDetailSummary) {
        Intrinsics.checkNotNullParameter(abilityDetailSummary, "<this>");
        return abilityDetailSummary.getStatus() == 3 || abilityDetailSummary.getStatus() == 2;
    }

    public static final boolean isValid(@NotNull SportKey sportKey) {
        Intrinsics.checkNotNullParameter(sportKey, "<this>");
        return (TextUtils.isEmpty(sportKey.getKey()) || TextUtils.isEmpty(sportKey.getSid()) || sportKey.getTime() <= 0) ? false : true;
    }

    public static final boolean isFinished(@NotNull HabitPlanHome habitPlanHome) {
        Intrinsics.checkNotNullParameter(habitPlanHome, "<this>");
        return habitPlanHome.getStatus() == 3 || habitPlanHome.getStatus() == 2;
    }
}
