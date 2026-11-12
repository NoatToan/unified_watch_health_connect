package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt;
import com.xiaomi.fitness.training_plan_export.model.TrainingSportReportInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/GetPlanSportReportListResult;", "", "sportReportInfo", "Lcom/xiaomi/fitness/training_plan_export/model/TrainingSportReportInfo;", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/model/TrainingSportReportInfo;)V", "getSportReportInfo", "()Lcom/xiaomi/fitness/training_plan_export/model/TrainingSportReportInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetPlanSportReportListResult {

    @SerializedName(PersonalDataManagementExtKt.TYPE_KEY_SPORT_RECORD)
    @NotNull
    private final TrainingSportReportInfo sportReportInfo;

    public GetPlanSportReportListResult(@NotNull TrainingSportReportInfo sportReportInfo) {
        Intrinsics.checkNotNullParameter(sportReportInfo, "sportReportInfo");
        this.sportReportInfo = sportReportInfo;
    }

    public static /* synthetic */ GetPlanSportReportListResult copy$default(GetPlanSportReportListResult getPlanSportReportListResult, TrainingSportReportInfo trainingSportReportInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            trainingSportReportInfo = getPlanSportReportListResult.sportReportInfo;
        }
        return getPlanSportReportListResult.copy(trainingSportReportInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TrainingSportReportInfo getSportReportInfo() {
        return this.sportReportInfo;
    }

    @NotNull
    public final GetPlanSportReportListResult copy(@NotNull TrainingSportReportInfo sportReportInfo) {
        Intrinsics.checkNotNullParameter(sportReportInfo, "sportReportInfo");
        return new GetPlanSportReportListResult(sportReportInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetPlanSportReportListResult) && Intrinsics.areEqual(this.sportReportInfo, ((GetPlanSportReportListResult) other).sportReportInfo);
    }

    @NotNull
    public final TrainingSportReportInfo getSportReportInfo() {
        return this.sportReportInfo;
    }

    public int hashCode() {
        return this.sportReportInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetPlanSportReportListResult(sportReportInfo=" + this.sportReportInfo + ")";
    }
}
