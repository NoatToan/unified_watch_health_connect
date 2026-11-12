package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.mi.health.course.export.CourseApiKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JM\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\nHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000f¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "Ljava/io/Serializable;", "isRestDay", "", "courseList", "", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", DialWidgetType.DATE, "", "dayOfWeek", "", "planId", "outOfDate", "<init>", "(ZLjava/util/List;JIJZ)V", "()Z", "getCourseList", "()Ljava/util/List;", "getDate", "()J", "getDayOfWeek", "()I", "getPlanId", "setPlanId", "(J)V", "getOutOfDate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbilityDayPlan implements Serializable {

    @SerializedName(CourseApiKt.COURSE_TAG_COURSE_LIST)
    @Nullable
    private final List<AbilityDayPlanCourse> courseList;

    @SerializedName(DialWidgetType.DATE)
    private final long date;

    @SerializedName("day_of_week")
    private final int dayOfWeek;

    @SerializedName("is_rest_day")
    private final boolean isRestDay;
    private final boolean outOfDate;
    private long planId;

    public AbilityDayPlan(boolean z, @Nullable List<AbilityDayPlanCourse> list, long j, int i, long j2, boolean z2) {
        this.isRestDay = z;
        this.courseList = list;
        this.date = j;
        this.dayOfWeek = i;
        this.planId = j2;
        this.outOfDate = z2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsRestDay() {
        return this.isRestDay;
    }

    @Nullable
    public final List<AbilityDayPlanCourse> component2() {
        return this.courseList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getOutOfDate() {
        return this.outOfDate;
    }

    @NotNull
    public final AbilityDayPlan copy(boolean isRestDay, @Nullable List<AbilityDayPlanCourse> courseList, long date, int dayOfWeek, long planId, boolean outOfDate) {
        return new AbilityDayPlan(isRestDay, courseList, date, dayOfWeek, planId, outOfDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbilityDayPlan)) {
            return false;
        }
        AbilityDayPlan abilityDayPlan = (AbilityDayPlan) other;
        return this.isRestDay == abilityDayPlan.isRestDay && Intrinsics.areEqual(this.courseList, abilityDayPlan.courseList) && this.date == abilityDayPlan.date && this.dayOfWeek == abilityDayPlan.dayOfWeek && this.planId == abilityDayPlan.planId && this.outOfDate == abilityDayPlan.outOfDate;
    }

    @Nullable
    public final List<AbilityDayPlanCourse> getCourseList() {
        return this.courseList;
    }

    public final long getDate() {
        return this.date;
    }

    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final boolean getOutOfDate() {
        return this.outOfDate;
    }

    public final long getPlanId() {
        return this.planId;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isRestDay) * 31;
        List<AbilityDayPlanCourse> list = this.courseList;
        return ((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Long.hashCode(this.date)) * 31) + Integer.hashCode(this.dayOfWeek)) * 31) + Long.hashCode(this.planId)) * 31) + Boolean.hashCode(this.outOfDate);
    }

    public final boolean isRestDay() {
        return this.isRestDay;
    }

    public final void setPlanId(long j) {
        this.planId = j;
    }

    @NotNull
    public String toString() {
        return "AbilityDayPlan(isRestDay=" + this.isRestDay + ", courseList=" + this.courseList + ", date=" + this.date + ", dayOfWeek=" + this.dayOfWeek + ", planId=" + this.planId + ", outOfDate=" + this.outOfDate + ")";
    }

    public /* synthetic */ AbilityDayPlan(boolean z, List list, long j, int i, long j2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, list, j, i, (i2 & 16) != 0 ? 0L : j2, (i2 & 32) != 0 ? false : z2);
    }
}
