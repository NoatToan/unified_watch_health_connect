package com.xiaomi.fitness.training_plan.util;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.TrainingCourseInfo;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanVideoCourse;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ \u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/training_plan/util/TrainingSportUtils;", "", "<init>", "()V", "startAbilitySport", "", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "abilityPlanCourse", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "launchVideoCourseInfoActivity", "context", "Landroid/content/Context;", "videoCourse", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanVideoCourse;", "from", "", "startHabitTrainingSport", DailyRecordKey.sportType, "habitDayPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainingSportUtils {

    @NotNull
    public static final TrainingSportUtils INSTANCE = new TrainingSportUtils();

    private TrainingSportUtils() {
    }

    public static /* synthetic */ void launchVideoCourseInfoActivity$default(TrainingSportUtils trainingSportUtils, Context context, AbilityPlanVideoCourse abilityPlanVideoCourse, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        trainingSportUtils.launchVideoCourseInfoActivity(context, abilityPlanVideoCourse, i);
    }

    public final void launchVideoCourseInfoActivity(@NotNull Context context, @NotNull AbilityPlanVideoCourse videoCourse, int from) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCourse, "videoCourse");
        CourseApiKt.getCourseApi().goToCourseInfoActivity(context, videoCourse.getCourseId(), new TrainingCourseInfo(videoCourse.getPlanId(), videoCourse.getCourseStatus()), from);
    }

    public final void startAbilitySport(@NotNull FragmentActivity fragmentActivity, @NotNull AbilityDayPlanCourse abilityPlanCourse) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(abilityPlanCourse, "abilityPlanCourse");
        SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).launchAbilityTrainingSport(fragmentActivity, abilityPlanCourse);
    }

    public final void startHabitTrainingSport(@NotNull FragmentActivity fragmentActivity, int sportType, @NotNull HabitDayPlan habitDayPlan) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(habitDayPlan, "habitDayPlan");
        SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).launchHabitTrainingSport(fragmentActivity, sportType, habitDayPlan);
    }
}
