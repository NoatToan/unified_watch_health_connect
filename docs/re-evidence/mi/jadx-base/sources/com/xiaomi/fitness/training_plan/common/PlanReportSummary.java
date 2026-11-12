package com.xiaomi.fitness.training_plan.common;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.DeductConstants;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0016\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001e¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/training_plan/common/PlanReportSummary;", "Ljava/io/Serializable;", "totalCourseCount", "", "finishCourseCount", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", FitnessReportKey.totalDuration, "totalDistance", "totalCalorie", "totalDays", "finishTimes", "startTime", "", "endTime", "planType", "planId", "<init>", "(IIFIFFIIJJIJ)V", "getTotalCourseCount", "()I", "getFinishCourseCount", "getProgress", "()F", "getTotalDuration", "getTotalDistance", "getTotalCalorie", "getTotalDays", "getFinishTimes", "getStartTime", "()J", "getEndTime", "getPlanType", "getPlanId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "", "hashCode", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlanReportSummary implements Serializable {

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    private final long endTime;

    @SerializedName("finished_course")
    private final int finishCourseCount;

    @SerializedName("finish_times")
    private final int finishTimes;

    @SerializedName(DeductConstants.KEY_WX_PLAN_ID)
    private final long planId;

    @SerializedName("plan_type")
    private final int planType;

    @SerializedName(BroadcastsKt.SILENT_PUSHING_PROGRESS)
    private final float progress;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
    private final long startTime;

    @SerializedName("total_calorie")
    private final float totalCalorie;

    @SerializedName("total_course")
    private final int totalCourseCount;

    @SerializedName("total_days")
    private final int totalDays;

    @SerializedName("total_distance")
    private final float totalDistance;

    @SerializedName("total_duration")
    private final int totalDuration;

    public PlanReportSummary(int i, int i2, float f, int i3, float f2, float f3, int i4, int i5, long j, long j2, int i6, long j3) {
        this.totalCourseCount = i;
        this.finishCourseCount = i2;
        this.progress = f;
        this.totalDuration = i3;
        this.totalDistance = f2;
        this.totalCalorie = f3;
        this.totalDays = i4;
        this.finishTimes = i5;
        this.startTime = j;
        this.endTime = j2;
        this.planType = i6;
        this.planId = j3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalCourseCount() {
        return this.totalCourseCount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getPlanType() {
        return this.planType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFinishCourseCount() {
        return this.finishCourseCount;
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
    public final int getTotalDays() {
        return this.totalDays;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFinishTimes() {
        return this.finishTimes;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final PlanReportSummary copy(int totalCourseCount, int finishCourseCount, float progress, int totalDuration, float totalDistance, float totalCalorie, int totalDays, int finishTimes, long startTime, long endTime, int planType, long planId) {
        return new PlanReportSummary(totalCourseCount, finishCourseCount, progress, totalDuration, totalDistance, totalCalorie, totalDays, finishTimes, startTime, endTime, planType, planId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanReportSummary)) {
            return false;
        }
        PlanReportSummary planReportSummary = (PlanReportSummary) other;
        return this.totalCourseCount == planReportSummary.totalCourseCount && this.finishCourseCount == planReportSummary.finishCourseCount && Float.compare(this.progress, planReportSummary.progress) == 0 && this.totalDuration == planReportSummary.totalDuration && Float.compare(this.totalDistance, planReportSummary.totalDistance) == 0 && Float.compare(this.totalCalorie, planReportSummary.totalCalorie) == 0 && this.totalDays == planReportSummary.totalDays && this.finishTimes == planReportSummary.finishTimes && this.startTime == planReportSummary.startTime && this.endTime == planReportSummary.endTime && this.planType == planReportSummary.planType && this.planId == planReportSummary.planId;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getFinishCourseCount() {
        return this.finishCourseCount;
    }

    public final int getFinishTimes() {
        return this.finishTimes;
    }

    public final long getPlanId() {
        return this.planId;
    }

    public final int getPlanType() {
        return this.planType;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final float getTotalCalorie() {
        return this.totalCalorie;
    }

    public final int getTotalCourseCount() {
        return this.totalCourseCount;
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
        return (((((((((((((((((((((Integer.hashCode(this.totalCourseCount) * 31) + Integer.hashCode(this.finishCourseCount)) * 31) + Float.hashCode(this.progress)) * 31) + Integer.hashCode(this.totalDuration)) * 31) + Float.hashCode(this.totalDistance)) * 31) + Float.hashCode(this.totalCalorie)) * 31) + Integer.hashCode(this.totalDays)) * 31) + Integer.hashCode(this.finishTimes)) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.planType)) * 31) + Long.hashCode(this.planId);
    }

    @NotNull
    public String toString() {
        return "PlanReportSummary(totalCourseCount=" + this.totalCourseCount + ", finishCourseCount=" + this.finishCourseCount + ", progress=" + this.progress + ", totalDuration=" + this.totalDuration + ", totalDistance=" + this.totalDistance + ", totalCalorie=" + this.totalCalorie + ", totalDays=" + this.totalDays + ", finishTimes=" + this.finishTimes + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", planType=" + this.planType + ", planId=" + this.planId + ")";
    }
}
