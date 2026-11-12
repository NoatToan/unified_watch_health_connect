package com.xiaomi.hm.health.healthdata.dto;

import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/dto/DataLoadParam;", "", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", "component1", "Ljava/util/Date;", "component2", "component3", SleepAnalysisFragment.TIME_MODE, "startDate", "endDate", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", "getTimeMode", "()Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", "b", "Ljava/util/Date;", "getStartDate", "()Ljava/util/Date;", "c", "getEndDate", "<init>", "(Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;Ljava/util/Date;Ljava/util/Date;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DataLoadParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final TimeMode timeMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date startDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date endDate;

    public DataLoadParam(@NotNull TimeMode timeMode, @NotNull Date date, @NotNull Date date2) {
        this.timeMode = timeMode;
        this.startDate = date;
        this.endDate = date2;
    }

    public static /* synthetic */ DataLoadParam copy$default(DataLoadParam dataLoadParam, TimeMode timeMode, Date date, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            timeMode = dataLoadParam.timeMode;
        }
        if ((i & 2) != 0) {
            date = dataLoadParam.startDate;
        }
        if ((i & 4) != 0) {
            date2 = dataLoadParam.endDate;
        }
        return dataLoadParam.copy(timeMode, date, date2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TimeMode getTimeMode() {
        return this.timeMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getStartDate() {
        return this.startDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final DataLoadParam copy(@NotNull TimeMode timeMode, @NotNull Date startDate, @NotNull Date endDate) {
        return new DataLoadParam(timeMode, startDate, endDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataLoadParam)) {
            return false;
        }
        DataLoadParam dataLoadParam = (DataLoadParam) other;
        return this.timeMode == dataLoadParam.timeMode && Intrinsics.areEqual(this.startDate, dataLoadParam.startDate) && Intrinsics.areEqual(this.endDate, dataLoadParam.endDate);
    }

    @NotNull
    public final Date getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final Date getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final TimeMode getTimeMode() {
        return this.timeMode;
    }

    public int hashCode() {
        return (((this.timeMode.hashCode() * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode();
    }

    @NotNull
    public String toString() {
        return "DataLoadParam(timeMode=" + this.timeMode + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
    }
}
