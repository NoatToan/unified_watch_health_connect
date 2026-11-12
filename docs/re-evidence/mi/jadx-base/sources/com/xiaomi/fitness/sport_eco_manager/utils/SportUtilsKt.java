package com.xiaomi.fitness.sport_eco_manager.utils;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportCourse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"TAG", "", "courseCal", "", "sportCourse", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportCourse;", FitnessReportKey.totalDuration, "sport-eco-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportUtilsKt {

    @NotNull
    public static final String TAG = "SportEco";

    public static final int courseCal(@NotNull SportCourse sportCourse, int i) {
        Intrinsics.checkNotNullParameter(sportCourse, "sportCourse");
        FitnessLogUtils.i(TAG, "courseCal : " + sportCourse.getCloudCourseReferenceCal() + " , sportDuration:" + i + " , courseCourse:" + sportCourse.getCourseDuration());
        return (int) (sportCourse.getCloudCourseReferenceCal() * 1000 * (i / sportCourse.getCourseDuration()));
    }
}
