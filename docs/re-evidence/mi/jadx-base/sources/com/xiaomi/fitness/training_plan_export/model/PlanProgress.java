package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/PlanProgress;", "", "finishedDays", "", "totalDays", "percent", "", "finishedTime", "todayCount", "<init>", "(IIFII)V", "getFinishedDays", "()I", "getTotalDays", "getPercent", "()F", "getFinishedTime", "getTodayCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlanProgress {

    @SerializedName("complete_days")
    private final int finishedDays;

    @SerializedName("complete_times")
    private final int finishedTime;

    @SerializedName("progress_percent")
    private final float percent;

    @SerializedName("today_in_total")
    private final int todayCount;

    @SerializedName("total_days")
    private final int totalDays;

    public PlanProgress(int i, int i2, float f, int i3, int i4) {
        this.finishedDays = i;
        this.totalDays = i2;
        this.percent = f;
        this.finishedTime = i3;
        this.todayCount = i4;
    }

    public static /* synthetic */ PlanProgress copy$default(PlanProgress planProgress, int i, int i2, float f, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = planProgress.finishedDays;
        }
        if ((i5 & 2) != 0) {
            i2 = planProgress.totalDays;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            f = planProgress.percent;
        }
        float f2 = f;
        if ((i5 & 8) != 0) {
            i3 = planProgress.finishedTime;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = planProgress.todayCount;
        }
        return planProgress.copy(i, i6, f2, i7, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFinishedDays() {
        return this.finishedDays;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalDays() {
        return this.totalDays;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getPercent() {
        return this.percent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFinishedTime() {
        return this.finishedTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTodayCount() {
        return this.todayCount;
    }

    @NotNull
    public final PlanProgress copy(int finishedDays, int totalDays, float percent, int finishedTime, int todayCount) {
        return new PlanProgress(finishedDays, totalDays, percent, finishedTime, todayCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanProgress)) {
            return false;
        }
        PlanProgress planProgress = (PlanProgress) other;
        return this.finishedDays == planProgress.finishedDays && this.totalDays == planProgress.totalDays && Float.compare(this.percent, planProgress.percent) == 0 && this.finishedTime == planProgress.finishedTime && this.todayCount == planProgress.todayCount;
    }

    public final int getFinishedDays() {
        return this.finishedDays;
    }

    public final int getFinishedTime() {
        return this.finishedTime;
    }

    public final float getPercent() {
        return this.percent;
    }

    public final int getTodayCount() {
        return this.todayCount;
    }

    public final int getTotalDays() {
        return this.totalDays;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.finishedDays) * 31) + Integer.hashCode(this.totalDays)) * 31) + Float.hashCode(this.percent)) * 31) + Integer.hashCode(this.finishedTime)) * 31) + Integer.hashCode(this.todayCount);
    }

    @NotNull
    public String toString() {
        return "PlanProgress(finishedDays=" + this.finishedDays + ", totalDays=" + this.totalDays + ", percent=" + this.percent + ", finishedTime=" + this.finishedTime + ", todayCount=" + this.todayCount + ")";
    }
}
