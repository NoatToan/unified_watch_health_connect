package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/StopAbilityPlanResult;", "", "success", "", "withReport", "<init>", "(ZZ)V", "getSuccess", "()Z", "getWithReport", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopAbilityPlanResult {

    @SerializedName("success")
    private final boolean success;

    @SerializedName("with_report")
    private final boolean withReport;

    public StopAbilityPlanResult(boolean z, boolean z2) {
        this.success = z;
        this.withReport = z2;
    }

    public static /* synthetic */ StopAbilityPlanResult copy$default(StopAbilityPlanResult stopAbilityPlanResult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = stopAbilityPlanResult.success;
        }
        if ((i & 2) != 0) {
            z2 = stopAbilityPlanResult.withReport;
        }
        return stopAbilityPlanResult.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getWithReport() {
        return this.withReport;
    }

    @NotNull
    public final StopAbilityPlanResult copy(boolean success, boolean withReport) {
        return new StopAbilityPlanResult(success, withReport);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StopAbilityPlanResult)) {
            return false;
        }
        StopAbilityPlanResult stopAbilityPlanResult = (StopAbilityPlanResult) other;
        return this.success == stopAbilityPlanResult.success && this.withReport == stopAbilityPlanResult.withReport;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final boolean getWithReport() {
        return this.withReport;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.success) * 31) + Boolean.hashCode(this.withReport);
    }

    @NotNull
    public String toString() {
        return "StopAbilityPlanResult(success=" + this.success + ", withReport=" + this.withReport + ")";
    }
}
