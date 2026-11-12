package com.xiaomi.fitness.common.calendar;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/common/calendar/MonthReportModel;", "", "timeFirstDay", "", "reportMap", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "<init>", "(JLjava/util/Map;)V", "getTimeFirstDay", "()J", "getReportMap", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MonthReportModel {

    @NotNull
    private final Map<Long, DailyGoalReport> reportMap;
    private final long timeFirstDay;

    public MonthReportModel(long j, @NotNull Map<Long, DailyGoalReport> reportMap) {
        Intrinsics.checkNotNullParameter(reportMap, "reportMap");
        this.timeFirstDay = j;
        this.reportMap = reportMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MonthReportModel copy$default(MonthReportModel monthReportModel, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            j = monthReportModel.timeFirstDay;
        }
        if ((i & 2) != 0) {
            map = monthReportModel.reportMap;
        }
        return monthReportModel.copy(j, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeFirstDay() {
        return this.timeFirstDay;
    }

    @NotNull
    public final Map<Long, DailyGoalReport> component2() {
        return this.reportMap;
    }

    @NotNull
    public final MonthReportModel copy(long timeFirstDay, @NotNull Map<Long, DailyGoalReport> reportMap) {
        Intrinsics.checkNotNullParameter(reportMap, "reportMap");
        return new MonthReportModel(timeFirstDay, reportMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthReportModel)) {
            return false;
        }
        MonthReportModel monthReportModel = (MonthReportModel) other;
        return this.timeFirstDay == monthReportModel.timeFirstDay && Intrinsics.areEqual(this.reportMap, monthReportModel.reportMap);
    }

    @NotNull
    public final Map<Long, DailyGoalReport> getReportMap() {
        return this.reportMap;
    }

    public final long getTimeFirstDay() {
        return this.timeFirstDay;
    }

    public int hashCode() {
        return (Long.hashCode(this.timeFirstDay) * 31) + this.reportMap.hashCode();
    }

    @NotNull
    public String toString() {
        return "MonthReportModel(timeFirstDay=" + this.timeFirstDay + ", reportMap=" + this.reportMap + ")";
    }
}
