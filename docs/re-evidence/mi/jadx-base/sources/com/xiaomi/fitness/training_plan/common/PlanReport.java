package com.xiaomi.fitness.training_plan.common;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.DeductConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/training_plan/common/PlanReport;", "Ljava/io/Serializable;", "reportId", "", "planType", "", "planId", "medalId", "startDate", "", "endDate", "finishTimes", "summary", "Lcom/xiaomi/fitness/training_plan/common/PlanReportSummary;", "<init>", "(JIJJLjava/lang/String;Ljava/lang/String;ILcom/xiaomi/fitness/training_plan/common/PlanReportSummary;)V", "getReportId", "()J", "getPlanType", "()I", "getPlanId", "getMedalId", "getStartDate", "()Ljava/lang/String;", "getEndDate", "getFinishTimes", "getSummary", "()Lcom/xiaomi/fitness/training_plan/common/PlanReportSummary;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlanReport implements Serializable {

    @SerializedName("end_date")
    @NotNull
    private final String endDate;

    @SerializedName("finish_times")
    private final int finishTimes;

    @SerializedName("medal_id")
    private final long medalId;

    @SerializedName(DeductConstants.KEY_WX_PLAN_ID)
    private final long planId;

    @SerializedName("plan_type")
    private final int planType;

    @SerializedName("report_id")
    private final long reportId;

    @SerializedName("start_date")
    @NotNull
    private final String startDate;

    @SerializedName("summary")
    @NotNull
    private final PlanReportSummary summary;

    public PlanReport(long j, int i, long j2, long j3, @NotNull String startDate, @NotNull String endDate, int i2, @NotNull PlanReportSummary summary) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.reportId = j;
        this.planType = i;
        this.planId = j2;
        this.medalId = j3;
        this.startDate = startDate;
        this.endDate = endDate;
        this.finishTimes = i2;
        this.summary = summary;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getReportId() {
        return this.reportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPlanType() {
        return this.planType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getMedalId() {
        return this.medalId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getFinishTimes() {
        return this.finishTimes;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PlanReportSummary getSummary() {
        return this.summary;
    }

    @NotNull
    public final PlanReport copy(long reportId, int planType, long planId, long medalId, @NotNull String startDate, @NotNull String endDate, int finishTimes, @NotNull PlanReportSummary summary) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new PlanReport(reportId, planType, planId, medalId, startDate, endDate, finishTimes, summary);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanReport)) {
            return false;
        }
        PlanReport planReport = (PlanReport) other;
        return this.reportId == planReport.reportId && this.planType == planReport.planType && this.planId == planReport.planId && this.medalId == planReport.medalId && Intrinsics.areEqual(this.startDate, planReport.startDate) && Intrinsics.areEqual(this.endDate, planReport.endDate) && this.finishTimes == planReport.finishTimes && Intrinsics.areEqual(this.summary, planReport.summary);
    }

    @NotNull
    public final String getEndDate() {
        return this.endDate;
    }

    public final int getFinishTimes() {
        return this.finishTimes;
    }

    public final long getMedalId() {
        return this.medalId;
    }

    public final long getPlanId() {
        return this.planId;
    }

    public final int getPlanType() {
        return this.planType;
    }

    public final long getReportId() {
        return this.reportId;
    }

    @NotNull
    public final String getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final PlanReportSummary getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.reportId) * 31) + Integer.hashCode(this.planType)) * 31) + Long.hashCode(this.planId)) * 31) + Long.hashCode(this.medalId)) * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode()) * 31) + Integer.hashCode(this.finishTimes)) * 31) + this.summary.hashCode();
    }

    @NotNull
    public String toString() {
        return "PlanReport(reportId=" + this.reportId + ", planType=" + this.planType + ", planId=" + this.planId + ", medalId=" + this.medalId + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", finishTimes=" + this.finishTimes + ", summary=" + this.summary + ")";
    }
}
