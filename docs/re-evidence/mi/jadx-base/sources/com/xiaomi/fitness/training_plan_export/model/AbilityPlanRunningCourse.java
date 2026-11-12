package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003JA\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "Ljava/io/Serializable;", FitnessReportKey.totalDuration, "", "name", "", "courseContent", "", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourseContent;", "planId", "", "courseId", "<init>", "(ILjava/lang/String;Ljava/util/List;JJ)V", "getTotalDuration", "()I", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getCourseContent", "()Ljava/util/List;", "getPlanId", "()J", "setPlanId", "(J)V", "getCourseId", "setCourseId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbilityPlanRunningCourse implements Serializable {

    @SerializedName("course_content")
    @NotNull
    private final List<AbilityPlanRunningCourseContent> courseContent;
    private long courseId;

    @SerializedName("course_name")
    @NotNull
    private String name;
    private long planId;

    @SerializedName("total_duration")
    private final int totalDuration;

    public AbilityPlanRunningCourse(int i, @NotNull String name, @NotNull List<AbilityPlanRunningCourseContent> courseContent, long j, long j2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(courseContent, "courseContent");
        this.totalDuration = i;
        this.name = name;
        this.courseContent = courseContent;
        this.planId = j;
        this.courseId = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbilityPlanRunningCourse copy$default(AbilityPlanRunningCourse abilityPlanRunningCourse, int i, String str, List list, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = abilityPlanRunningCourse.totalDuration;
        }
        if ((i2 & 2) != 0) {
            str = abilityPlanRunningCourse.name;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            list = abilityPlanRunningCourse.courseContent;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            j = abilityPlanRunningCourse.planId;
        }
        long j3 = j;
        if ((i2 & 16) != 0) {
            j2 = abilityPlanRunningCourse.courseId;
        }
        return abilityPlanRunningCourse.copy(i, str2, list2, j3, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalDuration() {
        return this.totalDuration;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<AbilityPlanRunningCourseContent> component3() {
        return this.courseContent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCourseId() {
        return this.courseId;
    }

    @NotNull
    public final AbilityPlanRunningCourse copy(int totalDuration, @NotNull String name, @NotNull List<AbilityPlanRunningCourseContent> courseContent, long planId, long courseId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(courseContent, "courseContent");
        return new AbilityPlanRunningCourse(totalDuration, name, courseContent, planId, courseId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbilityPlanRunningCourse)) {
            return false;
        }
        AbilityPlanRunningCourse abilityPlanRunningCourse = (AbilityPlanRunningCourse) other;
        return this.totalDuration == abilityPlanRunningCourse.totalDuration && Intrinsics.areEqual(this.name, abilityPlanRunningCourse.name) && Intrinsics.areEqual(this.courseContent, abilityPlanRunningCourse.courseContent) && this.planId == abilityPlanRunningCourse.planId && this.courseId == abilityPlanRunningCourse.courseId;
    }

    @NotNull
    public final List<AbilityPlanRunningCourseContent> getCourseContent() {
        return this.courseContent;
    }

    public final long getCourseId() {
        return this.courseId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getPlanId() {
        return this.planId;
    }

    public final int getTotalDuration() {
        return this.totalDuration;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.totalDuration) * 31) + this.name.hashCode()) * 31) + this.courseContent.hashCode()) * 31) + Long.hashCode(this.planId)) * 31) + Long.hashCode(this.courseId);
    }

    public final void setCourseId(long j) {
        this.courseId = j;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPlanId(long j) {
        this.planId = j;
    }

    @NotNull
    public String toString() {
        return "AbilityPlanRunningCourse(totalDuration=" + this.totalDuration + ", name=" + this.name + ", courseContent=" + this.courseContent + ", planId=" + this.planId + ", courseId=" + this.courseId + ")";
    }

    public /* synthetic */ AbilityPlanRunningCourse(int i, String str, List list, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, list, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? 0L : j2);
    }
}
