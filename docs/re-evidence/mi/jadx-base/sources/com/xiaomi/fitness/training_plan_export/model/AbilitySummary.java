package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/AbilitySummary;", "Ljava/io/Serializable;", "totalFinishedDays", "", "restDays", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", FitnessReportKey.totalDuration, "totalDistance", "totalCalorie", "finishedTrainingTimes", "todayCount", "<init>", "(IIFIFFII)V", "getTotalFinishedDays", "()I", "getRestDays", "getProgress", "()F", "getTotalDuration", "getTotalDistance", "getTotalCalorie", "getFinishedTrainingTimes", "getTodayCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbilitySummary implements Serializable {

    @SerializedName("finished_training_times")
    private final int finishedTrainingTimes;

    @SerializedName(BroadcastsKt.SILENT_PUSHING_PROGRESS)
    private final float progress;

    @SerializedName("total_rest_days")
    private final int restDays;

    @SerializedName("today_in_total")
    private final int todayCount;

    @SerializedName("total_calorie")
    private final float totalCalorie;

    @SerializedName("total_distance")
    private final float totalDistance;

    @SerializedName("total_duration")
    private final int totalDuration;

    @SerializedName("total_days")
    private final int totalFinishedDays;

    public AbilitySummary(int i, int i2, float f, int i3, float f2, float f3, int i4, int i5) {
        this.totalFinishedDays = i;
        this.restDays = i2;
        this.progress = f;
        this.totalDuration = i3;
        this.totalDistance = f2;
        this.totalCalorie = f3;
        this.finishedTrainingTimes = i4;
        this.todayCount = i5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalFinishedDays() {
        return this.totalFinishedDays;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRestDays() {
        return this.restDays;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalDuration() {
        return this.totalDuration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getTotalDistance() {
        return this.totalDistance;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getTotalCalorie() {
        return this.totalCalorie;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getFinishedTrainingTimes() {
        return this.finishedTrainingTimes;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getTodayCount() {
        return this.todayCount;
    }

    @NotNull
    public final AbilitySummary copy(int totalFinishedDays, int restDays, float progress, int totalDuration, float totalDistance, float totalCalorie, int finishedTrainingTimes, int todayCount) {
        return new AbilitySummary(totalFinishedDays, restDays, progress, totalDuration, totalDistance, totalCalorie, finishedTrainingTimes, todayCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbilitySummary)) {
            return false;
        }
        AbilitySummary abilitySummary = (AbilitySummary) other;
        return this.totalFinishedDays == abilitySummary.totalFinishedDays && this.restDays == abilitySummary.restDays && Float.compare(this.progress, abilitySummary.progress) == 0 && this.totalDuration == abilitySummary.totalDuration && Float.compare(this.totalDistance, abilitySummary.totalDistance) == 0 && Float.compare(this.totalCalorie, abilitySummary.totalCalorie) == 0 && this.finishedTrainingTimes == abilitySummary.finishedTrainingTimes && this.todayCount == abilitySummary.todayCount;
    }

    public final int getFinishedTrainingTimes() {
        return this.finishedTrainingTimes;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getRestDays() {
        return this.restDays;
    }

    public final int getTodayCount() {
        return this.todayCount;
    }

    public final float getTotalCalorie() {
        return this.totalCalorie;
    }

    public final float getTotalDistance() {
        return this.totalDistance;
    }

    public final int getTotalDuration() {
        return this.totalDuration;
    }

    public final int getTotalFinishedDays() {
        return this.totalFinishedDays;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.totalFinishedDays) * 31) + Integer.hashCode(this.restDays)) * 31) + Float.hashCode(this.progress)) * 31) + Integer.hashCode(this.totalDuration)) * 31) + Float.hashCode(this.totalDistance)) * 31) + Float.hashCode(this.totalCalorie)) * 31) + Integer.hashCode(this.finishedTrainingTimes)) * 31) + Integer.hashCode(this.todayCount);
    }

    @NotNull
    public String toString() {
        return "AbilitySummary(totalFinishedDays=" + this.totalFinishedDays + ", restDays=" + this.restDays + ", progress=" + this.progress + ", totalDuration=" + this.totalDuration + ", totalDistance=" + this.totalDistance + ", totalCalorie=" + this.totalCalorie + ", finishedTrainingTimes=" + this.finishedTrainingTimes + ", todayCount=" + this.todayCount + ")";
    }
}
