package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepDiaryData;", "", "type", "", "sleepDiaryReport", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "<init>", "(ILcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;)V", "getType", "()I", "getSleepDiaryReport", "()Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepDiaryData {

    @Nullable
    private final SleepDiaryReport sleepDiaryReport;
    private final int type;

    public SleepDiaryData(int i, @Nullable SleepDiaryReport sleepDiaryReport) {
        this.type = i;
        this.sleepDiaryReport = sleepDiaryReport;
    }

    public static /* synthetic */ SleepDiaryData copy$default(SleepDiaryData sleepDiaryData, int i, SleepDiaryReport sleepDiaryReport, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sleepDiaryData.type;
        }
        if ((i2 & 2) != 0) {
            sleepDiaryReport = sleepDiaryData.sleepDiaryReport;
        }
        return sleepDiaryData.copy(i, sleepDiaryReport);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SleepDiaryReport getSleepDiaryReport() {
        return this.sleepDiaryReport;
    }

    @NotNull
    public final SleepDiaryData copy(int type, @Nullable SleepDiaryReport sleepDiaryReport) {
        return new SleepDiaryData(type, sleepDiaryReport);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepDiaryData)) {
            return false;
        }
        SleepDiaryData sleepDiaryData = (SleepDiaryData) other;
        return this.type == sleepDiaryData.type && Intrinsics.areEqual(this.sleepDiaryReport, sleepDiaryData.sleepDiaryReport);
    }

    @Nullable
    public final SleepDiaryReport getSleepDiaryReport() {
        return this.sleepDiaryReport;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type) * 31;
        SleepDiaryReport sleepDiaryReport = this.sleepDiaryReport;
        return iHashCode + (sleepDiaryReport == null ? 0 : sleepDiaryReport.hashCode());
    }

    @NotNull
    public String toString() {
        return "SleepDiaryData(type=" + this.type + ", sleepDiaryReport=" + this.sleepDiaryReport + ")";
    }
}
