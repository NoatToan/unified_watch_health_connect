package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanCourseContent;", "Ljava/io/Serializable;", "videoCourse", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanVideoCourse;", "runningCourse", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanVideoCourse;Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;)V", "getVideoCourse", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanVideoCourse;", "getRunningCourse", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbilityPlanCourseContent implements Serializable {

    @SerializedName("course_running")
    @Nullable
    private final AbilityPlanRunningCourse runningCourse;

    @SerializedName("course_video")
    @Nullable
    private final AbilityPlanVideoCourse videoCourse;

    public AbilityPlanCourseContent(@Nullable AbilityPlanVideoCourse abilityPlanVideoCourse, @Nullable AbilityPlanRunningCourse abilityPlanRunningCourse) {
        this.videoCourse = abilityPlanVideoCourse;
        this.runningCourse = abilityPlanRunningCourse;
    }

    public static /* synthetic */ AbilityPlanCourseContent copy$default(AbilityPlanCourseContent abilityPlanCourseContent, AbilityPlanVideoCourse abilityPlanVideoCourse, AbilityPlanRunningCourse abilityPlanRunningCourse, int i, Object obj) {
        if ((i & 1) != 0) {
            abilityPlanVideoCourse = abilityPlanCourseContent.videoCourse;
        }
        if ((i & 2) != 0) {
            abilityPlanRunningCourse = abilityPlanCourseContent.runningCourse;
        }
        return abilityPlanCourseContent.copy(abilityPlanVideoCourse, abilityPlanRunningCourse);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AbilityPlanVideoCourse getVideoCourse() {
        return this.videoCourse;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AbilityPlanRunningCourse getRunningCourse() {
        return this.runningCourse;
    }

    @NotNull
    public final AbilityPlanCourseContent copy(@Nullable AbilityPlanVideoCourse videoCourse, @Nullable AbilityPlanRunningCourse runningCourse) {
        return new AbilityPlanCourseContent(videoCourse, runningCourse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbilityPlanCourseContent)) {
            return false;
        }
        AbilityPlanCourseContent abilityPlanCourseContent = (AbilityPlanCourseContent) other;
        return Intrinsics.areEqual(this.videoCourse, abilityPlanCourseContent.videoCourse) && Intrinsics.areEqual(this.runningCourse, abilityPlanCourseContent.runningCourse);
    }

    @Nullable
    public final AbilityPlanRunningCourse getRunningCourse() {
        return this.runningCourse;
    }

    @Nullable
    public final AbilityPlanVideoCourse getVideoCourse() {
        return this.videoCourse;
    }

    public int hashCode() {
        AbilityPlanVideoCourse abilityPlanVideoCourse = this.videoCourse;
        int iHashCode = (abilityPlanVideoCourse == null ? 0 : abilityPlanVideoCourse.hashCode()) * 31;
        AbilityPlanRunningCourse abilityPlanRunningCourse = this.runningCourse;
        return iHashCode + (abilityPlanRunningCourse != null ? abilityPlanRunningCourse.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AbilityPlanCourseContent(videoCourse=" + this.videoCourse + ", runningCourse=" + this.runningCourse + ")";
    }
}
