package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanVideoCourse;", "Ljava/io/Serializable;", "courseId", "", "planId", "courseStatus", "", "<init>", "(JJI)V", "getCourseId", "()J", "getPlanId", "setPlanId", "(J)V", "getCourseStatus", "()I", "setCourseStatus", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbilityPlanVideoCourse implements Serializable {

    @SerializedName("video_course_id")
    private final long courseId;
    private int courseStatus;
    private long planId;

    public AbilityPlanVideoCourse(long j, long j2, int i) {
        this.courseId = j;
        this.planId = j2;
        this.courseStatus = i;
    }

    public static /* synthetic */ AbilityPlanVideoCourse copy$default(AbilityPlanVideoCourse abilityPlanVideoCourse, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = abilityPlanVideoCourse.courseId;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = abilityPlanVideoCourse.planId;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = abilityPlanVideoCourse.courseStatus;
        }
        return abilityPlanVideoCourse.copy(j3, j4, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCourseStatus() {
        return this.courseStatus;
    }

    @NotNull
    public final AbilityPlanVideoCourse copy(long courseId, long planId, int courseStatus) {
        return new AbilityPlanVideoCourse(courseId, planId, courseStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbilityPlanVideoCourse)) {
            return false;
        }
        AbilityPlanVideoCourse abilityPlanVideoCourse = (AbilityPlanVideoCourse) other;
        return this.courseId == abilityPlanVideoCourse.courseId && this.planId == abilityPlanVideoCourse.planId && this.courseStatus == abilityPlanVideoCourse.courseStatus;
    }

    public final long getCourseId() {
        return this.courseId;
    }

    public final int getCourseStatus() {
        return this.courseStatus;
    }

    public final long getPlanId() {
        return this.planId;
    }

    public int hashCode() {
        return (((Long.hashCode(this.courseId) * 31) + Long.hashCode(this.planId)) * 31) + Integer.hashCode(this.courseStatus);
    }

    public final void setCourseStatus(int i) {
        this.courseStatus = i;
    }

    public final void setPlanId(long j) {
        this.planId = j;
    }

    @NotNull
    public String toString() {
        return "AbilityPlanVideoCourse(courseId=" + this.courseId + ", planId=" + this.planId + ", courseStatus=" + this.courseStatus + ")";
    }

    public /* synthetic */ AbilityPlanVideoCourse(long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? -1 : i);
    }
}
