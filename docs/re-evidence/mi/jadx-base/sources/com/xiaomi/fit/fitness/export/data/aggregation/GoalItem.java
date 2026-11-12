package com.xiaomi.fit.fitness.export.data.aggregation;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/GoalItem;", "", "type", "", "goalValue", "achievedValue", "<init>", "(III)V", "getType", "()I", "setType", "(I)V", "getGoalValue", "setGoalValue", "getAchievedValue", "setAchievedValue", "isReachGoal", "", "getTypeName", "", "toString", "equals", "obj", "component1", "component2", "component3", "copy", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GoalItem {

    /* JADX INFO: renamed from: achievedValue, reason: from kotlin metadata and from toString */
    @SerializedName("achieved_value")
    private int achieved;

    /* JADX INFO: renamed from: goalValue, reason: from kotlin metadata and from toString */
    @SerializedName("target_value")
    private int goal;

    @SerializedName("field")
    private int type;

    public GoalItem(int i, int i2, int i3) {
        this.type = i;
        this.goal = i2;
        this.achieved = i3;
    }

    public static /* synthetic */ GoalItem copy$default(GoalItem goalItem, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = goalItem.type;
        }
        if ((i4 & 2) != 0) {
            i2 = goalItem.goal;
        }
        if ((i4 & 4) != 0) {
            i3 = goalItem.achieved;
        }
        return goalItem.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAchieved() {
        return this.achieved;
    }

    @NotNull
    public final GoalItem copy(int type, int goalValue, int achievedValue) {
        return new GoalItem(type, goalValue, achievedValue);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoalItem)) {
            return false;
        }
        GoalItem goalItem = (GoalItem) obj;
        return Integer.valueOf(this.type).equals(Integer.valueOf(goalItem.type)) && Integer.valueOf(this.goal).equals(Integer.valueOf(goalItem.goal)) && Integer.valueOf(this.achieved).equals(Integer.valueOf(goalItem.achieved));
    }

    public final int getAchievedValue() {
        return this.achieved;
    }

    public final int getGoalValue() {
        return this.goal;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getTypeName() {
        int i = this.type;
        if (i == 1) {
            return "step";
        }
        if (i == 2) {
            return "calorie";
        }
        if (i != 3) {
            return i != 4 ? "Unknown" : "mh_strength";
        }
        return "stand";
    }

    public int hashCode() {
        return (((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.goal)) * 31) + Integer.hashCode(this.achieved);
    }

    public final boolean isReachGoal() {
        return this.achieved >= this.goal;
    }

    public final void setAchievedValue(int i) {
        this.achieved = i;
    }

    public final void setGoalValue(int i) {
        this.goal = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "GoalItem(type=" + this.type + ", type=" + getTypeName() + ", goal=" + this.goal + ", achieved=" + this.achieved + ")";
    }

    public /* synthetic */ GoalItem(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
