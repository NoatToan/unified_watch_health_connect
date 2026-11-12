package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanSummary;", "Ljava/io/Serializable;", "totalDays", "", FitnessReportKey.totalDuration, "totalDistance", "", "totalCalorie", "finishedTrainingTimes", "<init>", "(IIFFI)V", "getTotalDays", "()I", "getTotalDuration", "getTotalDistance", "()F", "getTotalCalorie", "getFinishedTrainingTimes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HabitPlanSummary implements Serializable {

    @SerializedName("finish_times")
    private final int finishedTrainingTimes;

    @SerializedName("total_calorie")
    private final float totalCalorie;

    @SerializedName("total_days")
    private final int totalDays;

    @SerializedName("total_distance")
    private final float totalDistance;

    @SerializedName("total_duration")
    private final int totalDuration;

    public HabitPlanSummary(int i, int i2, float f, float f2, int i3) {
        this.totalDays = i;
        this.totalDuration = i2;
        this.totalDistance = f;
        this.totalCalorie = f2;
        this.finishedTrainingTimes = i3;
    }

    public static /* synthetic */ HabitPlanSummary copy$default(HabitPlanSummary habitPlanSummary, int i, int i2, float f, float f2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = habitPlanSummary.totalDays;
        }
        if ((i4 & 2) != 0) {
            i2 = habitPlanSummary.totalDuration;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            f = habitPlanSummary.totalDistance;
        }
        float f3 = f;
        if ((i4 & 8) != 0) {
            f2 = habitPlanSummary.totalCalorie;
        }
        float f4 = f2;
        if ((i4 & 16) != 0) {
            i3 = habitPlanSummary.finishedTrainingTimes;
        }
        return habitPlanSummary.copy(i, i5, f3, f4, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalDays() {
        return this.totalDays;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalDuration() {
        return this.totalDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getTotalDistance() {
        return this.totalDistance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getTotalCalorie() {
        return this.totalCalorie;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFinishedTrainingTimes() {
        return this.finishedTrainingTimes;
    }

    @NotNull
    public final HabitPlanSummary copy(int totalDays, int totalDuration, float totalDistance, float totalCalorie, int finishedTrainingTimes) {
        return new HabitPlanSummary(totalDays, totalDuration, totalDistance, totalCalorie, finishedTrainingTimes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HabitPlanSummary)) {
            return false;
        }
        HabitPlanSummary habitPlanSummary = (HabitPlanSummary) other;
        return this.totalDays == habitPlanSummary.totalDays && this.totalDuration == habitPlanSummary.totalDuration && Float.compare(this.totalDistance, habitPlanSummary.totalDistance) == 0 && Float.compare(this.totalCalorie, habitPlanSummary.totalCalorie) == 0 && this.finishedTrainingTimes == habitPlanSummary.finishedTrainingTimes;
    }

    public final int getFinishedTrainingTimes() {
        return this.finishedTrainingTimes;
    }

    public final float getTotalCalorie() {
        return this.totalCalorie;
    }

    public final int getTotalDays() {
        return this.totalDays;
    }

    public final float getTotalDistance() {
        return this.totalDistance;
    }

    public final int getTotalDuration() {
        return this.totalDuration;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.totalDays) * 31) + Integer.hashCode(this.totalDuration)) * 31) + Float.hashCode(this.totalDistance)) * 31) + Float.hashCode(this.totalCalorie)) * 31) + Integer.hashCode(this.finishedTrainingTimes);
    }

    @NotNull
    public String toString() {
        return "HabitPlanSummary(totalDays=" + this.totalDays + ", totalDuration=" + this.totalDuration + ", totalDistance=" + this.totalDistance + ", totalCalorie=" + this.totalCalorie + ", finishedTrainingTimes=" + this.finishedTrainingTimes + ")";
    }
}
