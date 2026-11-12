package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.DeductConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanEntranceInfo;", "", "planId", "", "title", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "Lcom/xiaomi/fitness/training_plan_export/model/PlanProgress;", "habitDayPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "<init>", "(JLjava/lang/String;Lcom/xiaomi/fitness/training_plan_export/model/PlanProgress;Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;)V", "getPlanId", "()J", "getTitle", "()Ljava/lang/String;", "getProgress", "()Lcom/xiaomi/fitness/training_plan_export/model/PlanProgress;", "getHabitDayPlan", "()Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "setHabitDayPlan", "(Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HabitPlanEntranceInfo {

    @SerializedName("plan_content")
    @NotNull
    private HabitDayPlan habitDayPlan;

    @SerializedName(DeductConstants.KEY_WX_PLAN_ID)
    private final long planId;

    @SerializedName(BroadcastsKt.SILENT_PUSHING_PROGRESS)
    @NotNull
    private final PlanProgress progress;

    @SerializedName("title")
    @NotNull
    private final String title;

    public HabitPlanEntranceInfo(long j, @NotNull String title, @NotNull PlanProgress progress, @NotNull HabitDayPlan habitDayPlan) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(habitDayPlan, "habitDayPlan");
        this.planId = j;
        this.title = title;
        this.progress = progress;
        this.habitDayPlan = habitDayPlan;
    }

    public static /* synthetic */ HabitPlanEntranceInfo copy$default(HabitPlanEntranceInfo habitPlanEntranceInfo, long j, String str, PlanProgress planProgress, HabitDayPlan habitDayPlan, int i, Object obj) {
        if ((i & 1) != 0) {
            j = habitPlanEntranceInfo.planId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = habitPlanEntranceInfo.title;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            planProgress = habitPlanEntranceInfo.progress;
        }
        PlanProgress planProgress2 = planProgress;
        if ((i & 8) != 0) {
            habitDayPlan = habitPlanEntranceInfo.habitDayPlan;
        }
        return habitPlanEntranceInfo.copy(j2, str2, planProgress2, habitDayPlan);
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
    public final HabitDayPlan getHabitDayPlan() {
        return this.habitDayPlan;
    }

    @NotNull
    public final HabitPlanEntranceInfo copy(long planId, @NotNull String title, @NotNull PlanProgress progress, @NotNull HabitDayPlan habitDayPlan) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(habitDayPlan, "habitDayPlan");
        return new HabitPlanEntranceInfo(planId, title, progress, habitDayPlan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HabitPlanEntranceInfo)) {
            return false;
        }
        HabitPlanEntranceInfo habitPlanEntranceInfo = (HabitPlanEntranceInfo) other;
        return this.planId == habitPlanEntranceInfo.planId && Intrinsics.areEqual(this.title, habitPlanEntranceInfo.title) && Intrinsics.areEqual(this.progress, habitPlanEntranceInfo.progress) && Intrinsics.areEqual(this.habitDayPlan, habitPlanEntranceInfo.habitDayPlan);
    }

    @NotNull
    public final HabitDayPlan getHabitDayPlan() {
        return this.habitDayPlan;
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
        return (((((Long.hashCode(this.planId) * 31) + this.title.hashCode()) * 31) + this.progress.hashCode()) * 31) + this.habitDayPlan.hashCode();
    }

    public final void setHabitDayPlan(@NotNull HabitDayPlan habitDayPlan) {
        Intrinsics.checkNotNullParameter(habitDayPlan, "<set-?>");
        this.habitDayPlan = habitDayPlan;
    }

    @NotNull
    public String toString() {
        return "HabitPlanEntranceInfo(planId=" + this.planId + ", title=" + this.title + ", progress=" + this.progress + ", habitDayPlan=" + this.habitDayPlan + ")";
    }
}
