package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/LatestSportReport;", "", "sportReport", "Lcom/xiaomi/fit/fitness/persist/server/data/SportReportModel;", "<init>", "(Lcom/xiaomi/fit/fitness/persist/server/data/SportReportModel;)V", "getSportReport", "()Lcom/xiaomi/fit/fitness/persist/server/data/SportReportModel;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LatestSportReport {

    @SerializedName(PersonalDataManagementExtKt.TYPE_KEY_SPORT_RECORD)
    @Nullable
    private final SportReportModel sportReport;

    public LatestSportReport(@Nullable SportReportModel sportReportModel) {
        this.sportReport = sportReportModel;
    }

    public static /* synthetic */ LatestSportReport copy$default(LatestSportReport latestSportReport, SportReportModel sportReportModel, int i, Object obj) {
        if ((i & 1) != 0) {
            sportReportModel = latestSportReport.sportReport;
        }
        return latestSportReport.copy(sportReportModel);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SportReportModel getSportReport() {
        return this.sportReport;
    }

    @NotNull
    public final LatestSportReport copy(@Nullable SportReportModel sportReport) {
        return new LatestSportReport(sportReport);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LatestSportReport) && Intrinsics.areEqual(this.sportReport, ((LatestSportReport) other).sportReport);
    }

    @Nullable
    public final SportReportModel getSportReport() {
        return this.sportReport;
    }

    public int hashCode() {
        SportReportModel sportReportModel = this.sportReport;
        if (sportReportModel == null) {
            return 0;
        }
        return sportReportModel.hashCode();
    }

    @NotNull
    public String toString() {
        return "LatestSportReport(sportReport=" + this.sportReport + ")";
    }
}
