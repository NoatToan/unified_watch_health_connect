package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.DeductConstants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 JX\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\bHÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;", "Ljava/io/Serializable;", "planId", "", "planCourseList", "", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "runningDay", "", "strengthDay", "remindStatus", "", "remindTime", "<init>", "(JLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getPlanId", "()J", "getPlanCourseList", "()Ljava/util/List;", "getRunningDay", "()Ljava/lang/Integer;", "setRunningDay", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStrengthDay", "setStrengthDay", "getRemindStatus", "()Ljava/lang/Boolean;", "setRemindStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getRemindTime", "()Ljava/lang/Long;", "setRemindTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;", "equals", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbilityPlan implements Serializable {

    @SerializedName("content_list")
    @NotNull
    private final List<AbilityDayPlan> planCourseList;

    @SerializedName(DeductConstants.KEY_WX_PLAN_ID)
    private final long planId;

    @Nullable
    private Boolean remindStatus;

    @Nullable
    private Long remindTime;

    @Nullable
    private Integer runningDay;

    @Nullable
    private Integer strengthDay;

    public AbilityPlan(long j, @NotNull List<AbilityDayPlan> planCourseList, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(planCourseList, "planCourseList");
        this.planId = j;
        this.planCourseList = planCourseList;
        this.runningDay = num;
        this.strengthDay = num2;
        this.remindStatus = bool;
        this.remindTime = l;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    @NotNull
    public final List<AbilityDayPlan> component2() {
        return this.planCourseList;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getRunningDay() {
        return this.runningDay;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getStrengthDay() {
        return this.strengthDay;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getRemindStatus() {
        return this.remindStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getRemindTime() {
        return this.remindTime;
    }

    @NotNull
    public final AbilityPlan copy(long planId, @NotNull List<AbilityDayPlan> planCourseList, @Nullable Integer runningDay, @Nullable Integer strengthDay, @Nullable Boolean remindStatus, @Nullable Long remindTime) {
        Intrinsics.checkNotNullParameter(planCourseList, "planCourseList");
        return new AbilityPlan(planId, planCourseList, runningDay, strengthDay, remindStatus, remindTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbilityPlan)) {
            return false;
        }
        AbilityPlan abilityPlan = (AbilityPlan) other;
        return this.planId == abilityPlan.planId && Intrinsics.areEqual(this.planCourseList, abilityPlan.planCourseList) && Intrinsics.areEqual(this.runningDay, abilityPlan.runningDay) && Intrinsics.areEqual(this.strengthDay, abilityPlan.strengthDay) && Intrinsics.areEqual(this.remindStatus, abilityPlan.remindStatus) && Intrinsics.areEqual(this.remindTime, abilityPlan.remindTime);
    }

    @NotNull
    public final List<AbilityDayPlan> getPlanCourseList() {
        return this.planCourseList;
    }

    public final long getPlanId() {
        return this.planId;
    }

    @Nullable
    public final Boolean getRemindStatus() {
        return this.remindStatus;
    }

    @Nullable
    public final Long getRemindTime() {
        return this.remindTime;
    }

    @Nullable
    public final Integer getRunningDay() {
        return this.runningDay;
    }

    @Nullable
    public final Integer getStrengthDay() {
        return this.strengthDay;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.planId) * 31) + this.planCourseList.hashCode()) * 31;
        Integer num = this.runningDay;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.strengthDay;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.remindStatus;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.remindTime;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final void setRemindStatus(@Nullable Boolean bool) {
        this.remindStatus = bool;
    }

    public final void setRemindTime(@Nullable Long l) {
        this.remindTime = l;
    }

    public final void setRunningDay(@Nullable Integer num) {
        this.runningDay = num;
    }

    public final void setStrengthDay(@Nullable Integer num) {
        this.strengthDay = num;
    }

    @NotNull
    public String toString() {
        return "AbilityPlan(planId=" + this.planId + ", planCourseList=" + this.planCourseList + ", runningDay=" + this.runningDay + ", strengthDay=" + this.strengthDay + ", remindStatus=" + this.remindStatus + ", remindTime=" + this.remindTime + ")";
    }

    public /* synthetic */ AbilityPlan(long j, List list, Integer num, Integer num2, Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l);
    }
}
