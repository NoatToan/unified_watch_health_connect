package com.xiaomi.fitness.training_plan_export.utils;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.model.PlanModelsKt;
import com.xiaomi.fitness.training_plan_export.model.SportKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/FuseUtils;", "", "<init>", "()V", "fuseAbilityPlanInfo", "", "localAbilityDayPlan", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "serverAbilityDayPlan", "tag", "", "fuseHabitPlanInfo", "localHabitDayPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "serverHabitDayPlan", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFuseUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuseUtils.kt\ncom/xiaomi/fitness/training_plan_export/utils/FuseUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1863#2:78\n774#2:79\n865#2,2:80\n1864#2:82\n*S KotlinDebug\n*F\n+ 1 FuseUtils.kt\ncom/xiaomi/fitness/training_plan_export/utils/FuseUtils\n*L\n19#1:78\n21#1:79\n21#1:80,2\n19#1:82\n*E\n"})
public final class FuseUtils {

    @NotNull
    public static final FuseUtils INSTANCE = new FuseUtils();

    private FuseUtils() {
    }

    public final void fuseAbilityPlanInfo(@NotNull AbilityDayPlan localAbilityDayPlan, @NotNull AbilityDayPlan serverAbilityDayPlan, @NotNull String tag) {
        AbilityDayPlanCourse abilityDayPlanCourse;
        Intrinsics.checkNotNullParameter(localAbilityDayPlan, "localAbilityDayPlan");
        Intrinsics.checkNotNullParameter(serverAbilityDayPlan, "serverAbilityDayPlan");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (localAbilityDayPlan.getPlanId() != serverAbilityDayPlan.getPlanId()) {
            Logger.i(tag, "local and server has different planId!!");
            return;
        }
        List<AbilityDayPlanCourse> courseList = serverAbilityDayPlan.getCourseList();
        if (courseList != null) {
            for (AbilityDayPlanCourse abilityDayPlanCourse2 : courseList) {
                long courseId = abilityDayPlanCourse2.getCourseId();
                List<AbilityDayPlanCourse> courseList2 = localAbilityDayPlan.getCourseList();
                if (courseList2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : courseList2) {
                        if (((AbilityDayPlanCourse) obj).getCourseId() == courseId) {
                            arrayList.add(obj);
                        }
                    }
                    abilityDayPlanCourse = (AbilityDayPlanCourse) arrayList.get(0);
                } else {
                    abilityDayPlanCourse = null;
                }
                if (PlanModelsKt.isFinished(abilityDayPlanCourse2)) {
                    SportKey sportKey = abilityDayPlanCourse2.getSportKey();
                    SportKey sportKey2 = abilityDayPlanCourse != null ? abilityDayPlanCourse.getSportKey() : null;
                    if (sportKey == null || sportKey2 == null) {
                        Logger.i(tag, "local and server finished but one of theme has empty sportKey!!");
                    } else if (sportKey.getTime() > sportKey2.getTime()) {
                        abilityDayPlanCourse2.setSportKey(sportKey2);
                    } else {
                        Logger.i(tag, "server finished before local!!");
                    }
                } else if (abilityDayPlanCourse == null || !PlanModelsKt.isFinished(abilityDayPlanCourse)) {
                    Logger.i(tag, "local course is not finished!!  " + courseId);
                } else {
                    PlanModelsKt.finish(abilityDayPlanCourse2);
                    abilityDayPlanCourse2.setSportKey(abilityDayPlanCourse.getSportKey());
                }
            }
        }
    }

    public final void fuseHabitPlanInfo(@NotNull HabitDayPlan localHabitDayPlan, @NotNull HabitDayPlan serverHabitDayPlan, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(localHabitDayPlan, "localHabitDayPlan");
        Intrinsics.checkNotNullParameter(serverHabitDayPlan, "serverHabitDayPlan");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (localHabitDayPlan.getPlanId() != serverHabitDayPlan.getPlanId()) {
            Logger.i(tag, "local and server has different planId!!");
            return;
        }
        if (localHabitDayPlan.isRestDay()) {
            return;
        }
        if (!PlanModelsKt.isFinished(localHabitDayPlan)) {
            Logger.i(tag, "fuse local habit but local is not finished!!");
            return;
        }
        if (!PlanModelsKt.isFinished(serverHabitDayPlan)) {
            PlanModelsKt.finish(serverHabitDayPlan);
            serverHabitDayPlan.setSportKey(localHabitDayPlan.getSportKey());
            return;
        }
        if (localHabitDayPlan.getSportKey() == null || serverHabitDayPlan.getSportKey() == null) {
            Logger.i(tag, "fuse habitPlanInfo with case all finished but one of them has empty sportKey!!'");
            return;
        }
        SportKey sportKey = serverHabitDayPlan.getSportKey();
        Intrinsics.checkNotNull(sportKey);
        long time = sportKey.getTime();
        SportKey sportKey2 = localHabitDayPlan.getSportKey();
        Intrinsics.checkNotNull(sportKey2);
        if (time > sportKey2.getTime()) {
            serverHabitDayPlan.setSportKey(localHabitDayPlan.getSportKey());
        } else {
            Logger.i(tag, "server finished dayPlan is before local!!");
        }
    }
}
