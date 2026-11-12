package com.xiaomi.fitness.training_plan.common;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt;
import com.xiaomi.fitness.training_plan_export.model.TrainingSportReportInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/training_plan/common/TrainReport;", "Ljava/io/Serializable;", "planReportSummary", "Lcom/xiaomi/fitness/training_plan/common/PlanReportSummary;", "sportReportInfo", "Lcom/xiaomi/fitness/training_plan_export/model/TrainingSportReportInfo;", "<init>", "(Lcom/xiaomi/fitness/training_plan/common/PlanReportSummary;Lcom/xiaomi/fitness/training_plan_export/model/TrainingSportReportInfo;)V", "getPlanReportSummary", "()Lcom/xiaomi/fitness/training_plan/common/PlanReportSummary;", "getSportReportInfo", "()Lcom/xiaomi/fitness/training_plan_export/model/TrainingSportReportInfo;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrainReport implements Serializable {

    @SerializedName("summary")
    @NotNull
    private final PlanReportSummary planReportSummary;

    @SerializedName(PersonalDataManagementExtKt.TYPE_KEY_SPORT_RECORD)
    @NotNull
    private final TrainingSportReportInfo sportReportInfo;

    public TrainReport(@NotNull PlanReportSummary planReportSummary, @NotNull TrainingSportReportInfo sportReportInfo) {
        Intrinsics.checkNotNullParameter(planReportSummary, "planReportSummary");
        Intrinsics.checkNotNullParameter(sportReportInfo, "sportReportInfo");
        this.planReportSummary = planReportSummary;
        this.sportReportInfo = sportReportInfo;
    }

    public static /* synthetic */ TrainReport copy$default(TrainReport trainReport, PlanReportSummary planReportSummary, TrainingSportReportInfo trainingSportReportInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            planReportSummary = trainReport.planReportSummary;
        }
        if ((i & 2) != 0) {
            trainingSportReportInfo = trainReport.sportReportInfo;
        }
        return trainReport.copy(planReportSummary, trainingSportReportInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PlanReportSummary getPlanReportSummary() {
        return this.planReportSummary;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TrainingSportReportInfo getSportReportInfo() {
        return this.sportReportInfo;
    }

    @NotNull
    public final TrainReport copy(@NotNull PlanReportSummary planReportSummary, @NotNull TrainingSportReportInfo sportReportInfo) {
        Intrinsics.checkNotNullParameter(planReportSummary, "planReportSummary");
        Intrinsics.checkNotNullParameter(sportReportInfo, "sportReportInfo");
        return new TrainReport(planReportSummary, sportReportInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainReport)) {
            return false;
        }
        TrainReport trainReport = (TrainReport) other;
        return Intrinsics.areEqual(this.planReportSummary, trainReport.planReportSummary) && Intrinsics.areEqual(this.sportReportInfo, trainReport.sportReportInfo);
    }

    @NotNull
    public final PlanReportSummary getPlanReportSummary() {
        return this.planReportSummary;
    }

    @NotNull
    public final TrainingSportReportInfo getSportReportInfo() {
        return this.sportReportInfo;
    }

    public int hashCode() {
        return (this.planReportSummary.hashCode() * 31) + this.sportReportInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrainReport(planReportSummary=" + this.planReportSummary + ", sportReportInfo=" + this.sportReportInfo + ")";
    }
}
