package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekPlan;", "Ljava/io/Serializable;", "habitWeekPlan", "Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekHabitPlan;", "abilityWeekPlan", "Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekAbilityPlan;", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekHabitPlan;Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekAbilityPlan;)V", "getHabitWeekPlan", "()Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekHabitPlan;", "getAbilityWeekPlan", "()Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekAbilityPlan;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CurrentWeekPlan implements Serializable {

    @SerializedName("plan_improve")
    @Nullable
    private final CurrentWeekAbilityPlan abilityWeekPlan;

    @SerializedName("plan_build")
    @Nullable
    private final CurrentWeekHabitPlan habitWeekPlan;

    public CurrentWeekPlan(@Nullable CurrentWeekHabitPlan currentWeekHabitPlan, @Nullable CurrentWeekAbilityPlan currentWeekAbilityPlan) {
        this.habitWeekPlan = currentWeekHabitPlan;
        this.abilityWeekPlan = currentWeekAbilityPlan;
    }

    public static /* synthetic */ CurrentWeekPlan copy$default(CurrentWeekPlan currentWeekPlan, CurrentWeekHabitPlan currentWeekHabitPlan, CurrentWeekAbilityPlan currentWeekAbilityPlan, int i, Object obj) {
        if ((i & 1) != 0) {
            currentWeekHabitPlan = currentWeekPlan.habitWeekPlan;
        }
        if ((i & 2) != 0) {
            currentWeekAbilityPlan = currentWeekPlan.abilityWeekPlan;
        }
        return currentWeekPlan.copy(currentWeekHabitPlan, currentWeekAbilityPlan);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CurrentWeekHabitPlan getHabitWeekPlan() {
        return this.habitWeekPlan;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CurrentWeekAbilityPlan getAbilityWeekPlan() {
        return this.abilityWeekPlan;
    }

    @NotNull
    public final CurrentWeekPlan copy(@Nullable CurrentWeekHabitPlan habitWeekPlan, @Nullable CurrentWeekAbilityPlan abilityWeekPlan) {
        return new CurrentWeekPlan(habitWeekPlan, abilityWeekPlan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentWeekPlan)) {
            return false;
        }
        CurrentWeekPlan currentWeekPlan = (CurrentWeekPlan) other;
        return Intrinsics.areEqual(this.habitWeekPlan, currentWeekPlan.habitWeekPlan) && Intrinsics.areEqual(this.abilityWeekPlan, currentWeekPlan.abilityWeekPlan);
    }

    @Nullable
    public final CurrentWeekAbilityPlan getAbilityWeekPlan() {
        return this.abilityWeekPlan;
    }

    @Nullable
    public final CurrentWeekHabitPlan getHabitWeekPlan() {
        return this.habitWeekPlan;
    }

    public int hashCode() {
        CurrentWeekHabitPlan currentWeekHabitPlan = this.habitWeekPlan;
        int iHashCode = (currentWeekHabitPlan == null ? 0 : currentWeekHabitPlan.hashCode()) * 31;
        CurrentWeekAbilityPlan currentWeekAbilityPlan = this.abilityWeekPlan;
        return iHashCode + (currentWeekAbilityPlan != null ? currentWeekAbilityPlan.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CurrentWeekPlan(habitWeekPlan=" + this.habitWeekPlan + ", abilityWeekPlan=" + this.abilityWeekPlan + ")";
    }
}
