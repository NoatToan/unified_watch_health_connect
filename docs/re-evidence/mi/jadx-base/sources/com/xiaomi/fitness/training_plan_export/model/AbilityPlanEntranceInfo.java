package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.DeductConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JG\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\rHÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanEntranceInfo;", "", "planId", "", "title", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "Lcom/xiaomi/fitness/training_plan_export/model/PlanProgress;", "medalInfo", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityMedalInfo;", "abilityDayPlan", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "hasCourse", "", "<init>", "(JLjava/lang/String;Lcom/xiaomi/fitness/training_plan_export/model/PlanProgress;Lcom/xiaomi/fitness/training_plan_export/model/AbilityMedalInfo;Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;I)V", "getPlanId", "()J", "getTitle", "()Ljava/lang/String;", "getProgress", "()Lcom/xiaomi/fitness/training_plan_export/model/PlanProgress;", "getMedalInfo", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilityMedalInfo;", "getAbilityDayPlan", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "setAbilityDayPlan", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;)V", "getHasCourse", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbilityPlanEntranceInfo {

    @SerializedName("plan_content")
    @Nullable
    private AbilityDayPlan abilityDayPlan;

    @SerializedName("has_course")
    private final int hasCourse;

    @SerializedName("medal_info")
    @NotNull
    private final AbilityMedalInfo medalInfo;

    @SerializedName(DeductConstants.KEY_WX_PLAN_ID)
    private final long planId;

    @SerializedName(BroadcastsKt.SILENT_PUSHING_PROGRESS)
    @NotNull
    private final PlanProgress progress;

    @SerializedName("title")
    @NotNull
    private final String title;

    public AbilityPlanEntranceInfo(long j, @NotNull String title, @NotNull PlanProgress progress, @NotNull AbilityMedalInfo medalInfo, @Nullable AbilityDayPlan abilityDayPlan, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(medalInfo, "medalInfo");
        this.planId = j;
        this.title = title;
        this.progress = progress;
        this.medalInfo = medalInfo;
        this.abilityDayPlan = abilityDayPlan;
        this.hasCourse = i;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PlanProgress getProgress() {
        return this.progress;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AbilityMedalInfo getMedalInfo() {
        return this.medalInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AbilityDayPlan getAbilityDayPlan() {
        return this.abilityDayPlan;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getHasCourse() {
        return this.hasCourse;
    }

    @NotNull
    public final AbilityPlanEntranceInfo copy(long planId, @NotNull String title, @NotNull PlanProgress progress, @NotNull AbilityMedalInfo medalInfo, @Nullable AbilityDayPlan abilityDayPlan, int hasCourse) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(medalInfo, "medalInfo");
        return new AbilityPlanEntranceInfo(planId, title, progress, medalInfo, abilityDayPlan, hasCourse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbilityPlanEntranceInfo)) {
            return false;
        }
        AbilityPlanEntranceInfo abilityPlanEntranceInfo = (AbilityPlanEntranceInfo) other;
        return this.planId == abilityPlanEntranceInfo.planId && Intrinsics.areEqual(this.title, abilityPlanEntranceInfo.title) && Intrinsics.areEqual(this.progress, abilityPlanEntranceInfo.progress) && Intrinsics.areEqual(this.medalInfo, abilityPlanEntranceInfo.medalInfo) && Intrinsics.areEqual(this.abilityDayPlan, abilityPlanEntranceInfo.abilityDayPlan) && this.hasCourse == abilityPlanEntranceInfo.hasCourse;
    }

    @Nullable
    public final AbilityDayPlan getAbilityDayPlan() {
        return this.abilityDayPlan;
    }

    public final int getHasCourse() {
        return this.hasCourse;
    }

    @NotNull
    public final AbilityMedalInfo getMedalInfo() {
        return this.medalInfo;
    }

    public final long getPlanId() {
        return this.planId;
    }

    @NotNull
    public final PlanProgress getProgress() {
        return this.progress;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.planId) * 31) + this.title.hashCode()) * 31) + this.progress.hashCode()) * 31) + this.medalInfo.hashCode()) * 31;
        AbilityDayPlan abilityDayPlan = this.abilityDayPlan;
        return ((iHashCode + (abilityDayPlan == null ? 0 : abilityDayPlan.hashCode())) * 31) + Integer.hashCode(this.hasCourse);
    }

    public final void setAbilityDayPlan(@Nullable AbilityDayPlan abilityDayPlan) {
        this.abilityDayPlan = abilityDayPlan;
    }

    @NotNull
    public String toString() {
        return "AbilityPlanEntranceInfo(planId=" + this.planId + ", title=" + this.title + ", progress=" + this.progress + ", medalInfo=" + this.medalInfo + ", abilityDayPlan=" + this.abilityDayPlan + ", hasCourse=" + this.hasCourse + ")";
    }
}
