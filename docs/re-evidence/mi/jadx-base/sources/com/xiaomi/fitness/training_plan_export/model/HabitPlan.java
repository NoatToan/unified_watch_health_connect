package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.DeductConstants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "Ljava/io/Serializable;", "id", "", "dayOfWeek", "", "", "distance", "", "<init>", "(JLjava/util/List;F)V", "getId", "()J", "getDayOfWeek", "()Ljava/util/List;", "getDistance", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HabitPlan implements Serializable {

    @SerializedName("days_of_week")
    @NotNull
    private final List<Integer> dayOfWeek;

    @SerializedName("running_distance")
    private final float distance;

    @SerializedName(DeductConstants.KEY_WX_PLAN_ID)
    private final long id;

    public HabitPlan(long j, @NotNull List<Integer> dayOfWeek, float f) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        this.id = j;
        this.dayOfWeek = dayOfWeek;
        this.distance = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HabitPlan copy$default(HabitPlan habitPlan, long j, List list, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = habitPlan.id;
        }
        if ((i & 2) != 0) {
            list = habitPlan.dayOfWeek;
        }
        if ((i & 4) != 0) {
            f = habitPlan.distance;
        }
        return habitPlan.copy(j, list, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.dayOfWeek;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    @NotNull
    public final HabitPlan copy(long id, @NotNull List<Integer> dayOfWeek, float distance) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        return new HabitPlan(id, dayOfWeek, distance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HabitPlan)) {
            return false;
        }
        HabitPlan habitPlan = (HabitPlan) other;
        return this.id == habitPlan.id && Intrinsics.areEqual(this.dayOfWeek, habitPlan.dayOfWeek) && Float.compare(this.distance, habitPlan.distance) == 0;
    }

    @NotNull
    public final List<Integer> getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.dayOfWeek.hashCode()) * 31) + Float.hashCode(this.distance);
    }

    @NotNull
    public String toString() {
        return "HabitPlan(id=" + this.id + ", dayOfWeek=" + this.dayOfWeek + ", distance=" + this.distance + ")";
    }
}
