package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/AbilityDetailSummary;", "Ljava/io/Serializable;", "summary", "Lcom/xiaomi/fitness/training_plan_export/model/AbilitySummary;", "medalInfo", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityMedalInfo;", "plans", "", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "status", "", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilitySummary;Lcom/xiaomi/fitness/training_plan_export/model/AbilityMedalInfo;Ljava/util/List;I)V", "getSummary", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilitySummary;", "getMedalInfo", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilityMedalInfo;", "getPlans", "()Ljava/util/List;", "getStatus", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbilityDetailSummary implements Serializable {

    @SerializedName("medal_info")
    @NotNull
    private final AbilityMedalInfo medalInfo;

    @SerializedName("plan")
    @NotNull
    private final List<AbilityDayPlan> plans;

    @SerializedName("plan_status")
    private final int status;

    @SerializedName("summary")
    @NotNull
    private final AbilitySummary summary;

    public AbilityDetailSummary(@NotNull AbilitySummary summary, @NotNull AbilityMedalInfo medalInfo, @NotNull List<AbilityDayPlan> plans, int i) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(medalInfo, "medalInfo");
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.summary = summary;
        this.medalInfo = medalInfo;
        this.plans = plans;
        this.status = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbilityDetailSummary copy$default(AbilityDetailSummary abilityDetailSummary, AbilitySummary abilitySummary, AbilityMedalInfo abilityMedalInfo, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abilitySummary = abilityDetailSummary.summary;
        }
        if ((i2 & 2) != 0) {
            abilityMedalInfo = abilityDetailSummary.medalInfo;
        }
        if ((i2 & 4) != 0) {
            list = abilityDetailSummary.plans;
        }
        if ((i2 & 8) != 0) {
            i = abilityDetailSummary.status;
        }
        return abilityDetailSummary.copy(abilitySummary, abilityMedalInfo, list, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AbilitySummary getSummary() {
        return this.summary;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AbilityMedalInfo getMedalInfo() {
        return this.medalInfo;
    }

    @NotNull
    public final List<AbilityDayPlan> component3() {
        return this.plans;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final AbilityDetailSummary copy(@NotNull AbilitySummary summary, @NotNull AbilityMedalInfo medalInfo, @NotNull List<AbilityDayPlan> plans, int status) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(medalInfo, "medalInfo");
        Intrinsics.checkNotNullParameter(plans, "plans");
        return new AbilityDetailSummary(summary, medalInfo, plans, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbilityDetailSummary)) {
            return false;
        }
        AbilityDetailSummary abilityDetailSummary = (AbilityDetailSummary) other;
        return Intrinsics.areEqual(this.summary, abilityDetailSummary.summary) && Intrinsics.areEqual(this.medalInfo, abilityDetailSummary.medalInfo) && Intrinsics.areEqual(this.plans, abilityDetailSummary.plans) && this.status == abilityDetailSummary.status;
    }

    @NotNull
    public final AbilityMedalInfo getMedalInfo() {
        return this.medalInfo;
    }

    @NotNull
    public final List<AbilityDayPlan> getPlans() {
        return this.plans;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final AbilitySummary getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return (((((this.summary.hashCode() * 31) + this.medalInfo.hashCode()) * 31) + this.plans.hashCode()) * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "AbilityDetailSummary(summary=" + this.summary + ", medalInfo=" + this.medalInfo + ", plans=" + this.plans + ", status=" + this.status + ")";
    }
}
