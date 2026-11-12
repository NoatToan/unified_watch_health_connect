package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourseItem;", "Ljava/io/Serializable;", "type", "", "duration", "paceRange", "Lcom/xiaomi/fitness/training_plan_export/model/RunningPaceRange;", "<init>", "(IILcom/xiaomi/fitness/training_plan_export/model/RunningPaceRange;)V", "getType", "()I", "getDuration", "getPaceRange", "()Lcom/xiaomi/fitness/training_plan_export/model/RunningPaceRange;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbilityPlanRunningCourseItem implements Serializable {

    @SerializedName("duration")
    private final int duration;

    @SerializedName("section")
    @Nullable
    private final RunningPaceRange paceRange;

    @SerializedName("running_type")
    private final int type;

    public AbilityPlanRunningCourseItem(int i, int i2, @Nullable RunningPaceRange runningPaceRange) {
        this.type = i;
        this.duration = i2;
        this.paceRange = runningPaceRange;
    }

    public static /* synthetic */ AbilityPlanRunningCourseItem copy$default(AbilityPlanRunningCourseItem abilityPlanRunningCourseItem, int i, int i2, RunningPaceRange runningPaceRange, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = abilityPlanRunningCourseItem.type;
        }
        if ((i3 & 2) != 0) {
            i2 = abilityPlanRunningCourseItem.duration;
        }
        if ((i3 & 4) != 0) {
            runningPaceRange = abilityPlanRunningCourseItem.paceRange;
        }
        return abilityPlanRunningCourseItem.copy(i, i2, runningPaceRange);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RunningPaceRange getPaceRange() {
        return this.paceRange;
    }

    @NotNull
    public final AbilityPlanRunningCourseItem copy(int type, int duration, @Nullable RunningPaceRange paceRange) {
        return new AbilityPlanRunningCourseItem(type, duration, paceRange);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbilityPlanRunningCourseItem)) {
            return false;
        }
        AbilityPlanRunningCourseItem abilityPlanRunningCourseItem = (AbilityPlanRunningCourseItem) other;
        return this.type == abilityPlanRunningCourseItem.type && this.duration == abilityPlanRunningCourseItem.duration && Intrinsics.areEqual(this.paceRange, abilityPlanRunningCourseItem.paceRange);
    }

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final RunningPaceRange getPaceRange() {
        return this.paceRange;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.duration)) * 31;
        RunningPaceRange runningPaceRange = this.paceRange;
        return iHashCode + (runningPaceRange == null ? 0 : runningPaceRange.hashCode());
    }

    @NotNull
    public String toString() {
        return "AbilityPlanRunningCourseItem(type=" + this.type + ", duration=" + this.duration + ", paceRange=" + this.paceRange + ")";
    }
}
