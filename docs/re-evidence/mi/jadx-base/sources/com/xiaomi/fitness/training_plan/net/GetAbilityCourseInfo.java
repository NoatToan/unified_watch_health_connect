package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/GetAbilityCourseInfo;", "", "courseInfo", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;)V", "getCourseInfo", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetAbilityCourseInfo {

    @SerializedName("course_info")
    @NotNull
    private final AbilityDayPlanCourse courseInfo;

    public GetAbilityCourseInfo(@NotNull AbilityDayPlanCourse courseInfo) {
        Intrinsics.checkNotNullParameter(courseInfo, "courseInfo");
        this.courseInfo = courseInfo;
    }

    public static /* synthetic */ GetAbilityCourseInfo copy$default(GetAbilityCourseInfo getAbilityCourseInfo, AbilityDayPlanCourse abilityDayPlanCourse, int i, Object obj) {
        if ((i & 1) != 0) {
            abilityDayPlanCourse = getAbilityCourseInfo.courseInfo;
        }
        return getAbilityCourseInfo.copy(abilityDayPlanCourse);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AbilityDayPlanCourse getCourseInfo() {
        return this.courseInfo;
    }

    @NotNull
    public final GetAbilityCourseInfo copy(@NotNull AbilityDayPlanCourse courseInfo) {
        Intrinsics.checkNotNullParameter(courseInfo, "courseInfo");
        return new GetAbilityCourseInfo(courseInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetAbilityCourseInfo) && Intrinsics.areEqual(this.courseInfo, ((GetAbilityCourseInfo) other).courseInfo);
    }

    @NotNull
    public final AbilityDayPlanCourse getCourseInfo() {
        return this.courseInfo;
    }

    public int hashCode() {
        return this.courseInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetAbilityCourseInfo(courseInfo=" + this.courseInfo + ")";
    }
}
