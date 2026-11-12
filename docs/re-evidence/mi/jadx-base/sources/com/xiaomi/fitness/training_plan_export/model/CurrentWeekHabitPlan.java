package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.DeductConstants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekHabitPlan;", "Ljava/io/Serializable;", "planId", "", "habitDayPlans", "", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "type", "", "<init>", "(JLjava/util/List;I)V", "getPlanId", "()J", "getHabitDayPlans", "()Ljava/util/List;", "getType", "()I", "setType", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CurrentWeekHabitPlan implements Serializable {

    @SerializedName(MiuiCursorConstants.CONTENT)
    @NotNull
    private final List<HabitDayPlan> habitDayPlans;

    @SerializedName(DeductConstants.KEY_WX_PLAN_ID)
    private final long planId;
    private int type;

    public CurrentWeekHabitPlan(long j, @NotNull List<HabitDayPlan> habitDayPlans, int i) {
        Intrinsics.checkNotNullParameter(habitDayPlans, "habitDayPlans");
        this.planId = j;
        this.habitDayPlans = habitDayPlans;
        this.type = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrentWeekHabitPlan copy$default(CurrentWeekHabitPlan currentWeekHabitPlan, long j, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = currentWeekHabitPlan.planId;
        }
        if ((i2 & 2) != 0) {
            list = currentWeekHabitPlan.habitDayPlans;
        }
        if ((i2 & 4) != 0) {
            i = currentWeekHabitPlan.type;
        }
        return currentWeekHabitPlan.copy(j, list, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    @NotNull
    public final List<HabitDayPlan> component2() {
        return this.habitDayPlans;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final CurrentWeekHabitPlan copy(long planId, @NotNull List<HabitDayPlan> habitDayPlans, int type) {
        Intrinsics.checkNotNullParameter(habitDayPlans, "habitDayPlans");
        return new CurrentWeekHabitPlan(planId, habitDayPlans, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentWeekHabitPlan)) {
            return false;
        }
        CurrentWeekHabitPlan currentWeekHabitPlan = (CurrentWeekHabitPlan) other;
        return this.planId == currentWeekHabitPlan.planId && Intrinsics.areEqual(this.habitDayPlans, currentWeekHabitPlan.habitDayPlans) && this.type == currentWeekHabitPlan.type;
    }

    @NotNull
    public final List<HabitDayPlan> getHabitDayPlans() {
        return this.habitDayPlans;
    }

    public final long getPlanId() {
        return this.planId;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((Long.hashCode(this.planId) * 31) + this.habitDayPlans.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "CurrentWeekHabitPlan(planId=" + this.planId + ", habitDayPlans=" + this.habitDayPlans + ", type=" + this.type + ")";
    }

    public /* synthetic */ CurrentWeekHabitPlan(long j, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i2 & 4) != 0 ? 1 : i);
    }
}
