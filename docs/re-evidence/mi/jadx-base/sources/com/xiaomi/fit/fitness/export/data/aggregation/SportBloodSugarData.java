package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/SportBloodSugarData;", "", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "analyzeData", "Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarAnalyzeData;", "<init>", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarAnalyzeData;)V", "getSportReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getAnalyzeData", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarAnalyzeData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportBloodSugarData {

    @NotNull
    private final BloodSugarAnalyzeData analyzeData;

    @NotNull
    private final SportBasicReport sportReport;

    public SportBloodSugarData(@NotNull SportBasicReport sportReport, @NotNull BloodSugarAnalyzeData analyzeData) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        Intrinsics.checkNotNullParameter(analyzeData, "analyzeData");
        this.sportReport = sportReport;
        this.analyzeData = analyzeData;
    }

    public static /* synthetic */ SportBloodSugarData copy$default(SportBloodSugarData sportBloodSugarData, SportBasicReport sportBasicReport, BloodSugarAnalyzeData bloodSugarAnalyzeData, int i, Object obj) {
        if ((i & 1) != 0) {
            sportBasicReport = sportBloodSugarData.sportReport;
        }
        if ((i & 2) != 0) {
            bloodSugarAnalyzeData = sportBloodSugarData.analyzeData;
        }
        return sportBloodSugarData.copy(sportBasicReport, bloodSugarAnalyzeData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SportBasicReport getSportReport() {
        return this.sportReport;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BloodSugarAnalyzeData getAnalyzeData() {
        return this.analyzeData;
    }

    @NotNull
    public final SportBloodSugarData copy(@NotNull SportBasicReport sportReport, @NotNull BloodSugarAnalyzeData analyzeData) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        Intrinsics.checkNotNullParameter(analyzeData, "analyzeData");
        return new SportBloodSugarData(sportReport, analyzeData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportBloodSugarData)) {
            return false;
        }
        SportBloodSugarData sportBloodSugarData = (SportBloodSugarData) other;
        return Intrinsics.areEqual(this.sportReport, sportBloodSugarData.sportReport) && Intrinsics.areEqual(this.analyzeData, sportBloodSugarData.analyzeData);
    }

    @NotNull
    public final BloodSugarAnalyzeData getAnalyzeData() {
        return this.analyzeData;
    }

    @NotNull
    public final SportBasicReport getSportReport() {
        return this.sportReport;
    }

    public int hashCode() {
        return (this.sportReport.hashCode() * 31) + this.analyzeData.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportBloodSugarData(sportReport=" + this.sportReport + ", analyzeData=" + this.analyzeData + ")";
    }
}
