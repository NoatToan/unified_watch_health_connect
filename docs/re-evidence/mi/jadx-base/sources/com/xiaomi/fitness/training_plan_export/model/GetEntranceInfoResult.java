package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/GetEntranceInfoResult;", "", "hasHabitHistory", "", "initInfo", "", "Lcom/xiaomi/fitness/training_plan_export/model/PlanInitInfo;", "habitInfo", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanEntranceInfo;", "abilityInfo", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanEntranceInfo;", "<init>", "(ZLjava/util/List;Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanEntranceInfo;Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanEntranceInfo;)V", "getHasHabitHistory", "()Z", "getInitInfo", "()Ljava/util/List;", "getHabitInfo", "()Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanEntranceInfo;", "getAbilityInfo", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanEntranceInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetEntranceInfoResult {

    @SerializedName("plan_improve")
    @Nullable
    private final AbilityPlanEntranceInfo abilityInfo;

    @SerializedName("plan_build")
    @Nullable
    private final HabitPlanEntranceInfo habitInfo;

    @SerializedName("has_build_history")
    private final boolean hasHabitHistory;

    @SerializedName("init_plan_list")
    @Nullable
    private final List<PlanInitInfo> initInfo;

    public GetEntranceInfoResult(boolean z, @Nullable List<PlanInitInfo> list, @Nullable HabitPlanEntranceInfo habitPlanEntranceInfo, @Nullable AbilityPlanEntranceInfo abilityPlanEntranceInfo) {
        this.hasHabitHistory = z;
        this.initInfo = list;
        this.habitInfo = habitPlanEntranceInfo;
        this.abilityInfo = abilityPlanEntranceInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetEntranceInfoResult copy$default(GetEntranceInfoResult getEntranceInfoResult, boolean z, List list, HabitPlanEntranceInfo habitPlanEntranceInfo, AbilityPlanEntranceInfo abilityPlanEntranceInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getEntranceInfoResult.hasHabitHistory;
        }
        if ((i & 2) != 0) {
            list = getEntranceInfoResult.initInfo;
        }
        if ((i & 4) != 0) {
            habitPlanEntranceInfo = getEntranceInfoResult.habitInfo;
        }
        if ((i & 8) != 0) {
            abilityPlanEntranceInfo = getEntranceInfoResult.abilityInfo;
        }
        return getEntranceInfoResult.copy(z, list, habitPlanEntranceInfo, abilityPlanEntranceInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasHabitHistory() {
        return this.hasHabitHistory;
    }

    @Nullable
    public final List<PlanInitInfo> component2() {
        return this.initInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HabitPlanEntranceInfo getHabitInfo() {
        return this.habitInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AbilityPlanEntranceInfo getAbilityInfo() {
        return this.abilityInfo;
    }

    @NotNull
    public final GetEntranceInfoResult copy(boolean hasHabitHistory, @Nullable List<PlanInitInfo> initInfo, @Nullable HabitPlanEntranceInfo habitInfo, @Nullable AbilityPlanEntranceInfo abilityInfo) {
        return new GetEntranceInfoResult(hasHabitHistory, initInfo, habitInfo, abilityInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetEntranceInfoResult)) {
            return false;
        }
        GetEntranceInfoResult getEntranceInfoResult = (GetEntranceInfoResult) other;
        return this.hasHabitHistory == getEntranceInfoResult.hasHabitHistory && Intrinsics.areEqual(this.initInfo, getEntranceInfoResult.initInfo) && Intrinsics.areEqual(this.habitInfo, getEntranceInfoResult.habitInfo) && Intrinsics.areEqual(this.abilityInfo, getEntranceInfoResult.abilityInfo);
    }

    @Nullable
    public final AbilityPlanEntranceInfo getAbilityInfo() {
        return this.abilityInfo;
    }

    @Nullable
    public final HabitPlanEntranceInfo getHabitInfo() {
        return this.habitInfo;
    }

    public final boolean getHasHabitHistory() {
        return this.hasHabitHistory;
    }

    @Nullable
    public final List<PlanInitInfo> getInitInfo() {
        return this.initInfo;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasHabitHistory) * 31;
        List<PlanInitInfo> list = this.initInfo;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        HabitPlanEntranceInfo habitPlanEntranceInfo = this.habitInfo;
        int iHashCode3 = (iHashCode2 + (habitPlanEntranceInfo == null ? 0 : habitPlanEntranceInfo.hashCode())) * 31;
        AbilityPlanEntranceInfo abilityPlanEntranceInfo = this.abilityInfo;
        return iHashCode3 + (abilityPlanEntranceInfo != null ? abilityPlanEntranceInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetEntranceInfoResult(hasHabitHistory=" + this.hasHabitHistory + ", initInfo=" + this.initInfo + ", habitInfo=" + this.habitInfo + ", abilityInfo=" + this.abilityInfo + ")";
    }
}
