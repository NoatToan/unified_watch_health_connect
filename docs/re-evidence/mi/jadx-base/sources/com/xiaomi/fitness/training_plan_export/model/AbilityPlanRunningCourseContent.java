package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.mi.health.course.export.CourseApiKt;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourseContent;", "Ljava/io/Serializable;", "isLoop", "", "loopCount", "", "courseList", "", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourseItem;", "<init>", "(ZLjava/lang/Integer;Ljava/util/List;)V", "()Z", "getLoopCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCourseList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(ZLjava/lang/Integer;Ljava/util/List;)Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourseContent;", "equals", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbilityPlanRunningCourseContent implements Serializable {

    @SerializedName(CourseApiKt.COURSE_TAG_COURSE_LIST)
    @NotNull
    private final List<AbilityPlanRunningCourseItem> courseList;

    @SerializedName("is_loop")
    private final boolean isLoop;

    @SerializedName("loop_count")
    @Nullable
    private final Integer loopCount;

    public AbilityPlanRunningCourseContent(boolean z, @Nullable Integer num, @NotNull List<AbilityPlanRunningCourseItem> courseList) {
        Intrinsics.checkNotNullParameter(courseList, "courseList");
        this.isLoop = z;
        this.loopCount = num;
        this.courseList = courseList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbilityPlanRunningCourseContent copy$default(AbilityPlanRunningCourseContent abilityPlanRunningCourseContent, boolean z, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = abilityPlanRunningCourseContent.isLoop;
        }
        if ((i & 2) != 0) {
            num = abilityPlanRunningCourseContent.loopCount;
        }
        if ((i & 4) != 0) {
            list = abilityPlanRunningCourseContent.courseList;
        }
        return abilityPlanRunningCourseContent.copy(z, num, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoop() {
        return this.isLoop;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getLoopCount() {
        return this.loopCount;
    }

    @NotNull
    public final List<AbilityPlanRunningCourseItem> component3() {
        return this.courseList;
    }

    @NotNull
    public final AbilityPlanRunningCourseContent copy(boolean isLoop, @Nullable Integer loopCount, @NotNull List<AbilityPlanRunningCourseItem> courseList) {
        Intrinsics.checkNotNullParameter(courseList, "courseList");
        return new AbilityPlanRunningCourseContent(isLoop, loopCount, courseList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbilityPlanRunningCourseContent)) {
            return false;
        }
        AbilityPlanRunningCourseContent abilityPlanRunningCourseContent = (AbilityPlanRunningCourseContent) other;
        return this.isLoop == abilityPlanRunningCourseContent.isLoop && Intrinsics.areEqual(this.loopCount, abilityPlanRunningCourseContent.loopCount) && Intrinsics.areEqual(this.courseList, abilityPlanRunningCourseContent.courseList);
    }

    @NotNull
    public final List<AbilityPlanRunningCourseItem> getCourseList() {
        return this.courseList;
    }

    @Nullable
    public final Integer getLoopCount() {
        return this.loopCount;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoop) * 31;
        Integer num = this.loopCount;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.courseList.hashCode();
    }

    public final boolean isLoop() {
        return this.isLoop;
    }

    @NotNull
    public String toString() {
        return "AbilityPlanRunningCourseContent(isLoop=" + this.isLoop + ", loopCount=" + this.loopCount + ", courseList=" + this.courseList + ")";
    }
}
