package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettingUpdateResult;", "", "success", "", "plans", "", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "<init>", "(ZLjava/util/List;)V", "getSuccess", "()Z", "getPlans", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SmartRunningRemindSettingUpdateResult {

    @SerializedName("content_list")
    @NotNull
    private final List<AbilityDayPlan> plans;

    @SerializedName("success")
    private final boolean success;

    public SmartRunningRemindSettingUpdateResult(boolean z, @NotNull List<AbilityDayPlan> plans) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.success = z;
        this.plans = plans;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartRunningRemindSettingUpdateResult copy$default(SmartRunningRemindSettingUpdateResult smartRunningRemindSettingUpdateResult, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = smartRunningRemindSettingUpdateResult.success;
        }
        if ((i & 2) != 0) {
            list = smartRunningRemindSettingUpdateResult.plans;
        }
        return smartRunningRemindSettingUpdateResult.copy(z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final List<AbilityDayPlan> component2() {
        return this.plans;
    }

    @NotNull
    public final SmartRunningRemindSettingUpdateResult copy(boolean success, @NotNull List<AbilityDayPlan> plans) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        return new SmartRunningRemindSettingUpdateResult(success, plans);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartRunningRemindSettingUpdateResult)) {
            return false;
        }
        SmartRunningRemindSettingUpdateResult smartRunningRemindSettingUpdateResult = (SmartRunningRemindSettingUpdateResult) other;
        return this.success == smartRunningRemindSettingUpdateResult.success && Intrinsics.areEqual(this.plans, smartRunningRemindSettingUpdateResult.plans);
    }

    @NotNull
    public final List<AbilityDayPlan> getPlans() {
        return this.plans;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.success) * 31) + this.plans.hashCode();
    }

    @NotNull
    public String toString() {
        return "SmartRunningRemindSettingUpdateResult(success=" + this.success + ", plans=" + this.plans + ")";
    }
}
