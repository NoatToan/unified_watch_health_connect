package com.xiaomi.fitness.health.todayhealth.model;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.item.AmbulatoryBloodPressureReport;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u001d\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u00101\u001a\u00020,2\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/DailyAmbulatoryBloodPressureReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "sumAbnormalCount", "", "getSumAbnormalCount", "()I", "setSumAbnormalCount", "(I)V", "sumNormalCount", "getSumNormalCount", "setSumNormalCount", "ambulatoryStatItemList", "", "Lcom/xiaomi/fitness/health/todayhealth/model/AmbulatoryStatItem;", "getAmbulatoryStatItemList", "()Ljava/util/List;", "setAmbulatoryStatItemList", "(Ljava/util/List;)V", "ambulatoryBloodPressureReport", "Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureReport;", "getAmbulatoryBloodPressureReport", "()Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureReport;", "setAmbulatoryBloodPressureReport", "(Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureReport;)V", "ambulatoryBloodPressureReportList", "getAmbulatoryBloodPressureReportList", "setAmbulatoryBloodPressureReportList", "isEmpty", "", "toString", "component1", "component2", "copy", "equals", "other", "", "hashCode", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyAmbulatoryBloodPressureReport extends DailyBasicReport {

    @Nullable
    private AmbulatoryBloodPressureReport ambulatoryBloodPressureReport;

    @Nullable
    private transient List<AmbulatoryBloodPressureReport> ambulatoryBloodPressureReportList;

    @Nullable
    private List<AmbulatoryStatItem> ambulatoryStatItemList;

    @Nullable
    private String sid;
    private int sumAbnormalCount;
    private int sumNormalCount;

    @NotNull
    private final String tag;
    private long time;

    public DailyAmbulatoryBloodPressureReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.time = j;
        this.tag = tag;
        this.sid = "default";
    }

    public static /* synthetic */ DailyAmbulatoryBloodPressureReport copy$default(DailyAmbulatoryBloodPressureReport dailyAmbulatoryBloodPressureReport, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyAmbulatoryBloodPressureReport.time;
        }
        if ((i & 2) != 0) {
            str = dailyAmbulatoryBloodPressureReport.tag;
        }
        return dailyAmbulatoryBloodPressureReport.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final DailyAmbulatoryBloodPressureReport copy(long time, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new DailyAmbulatoryBloodPressureReport(time, tag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyAmbulatoryBloodPressureReport)) {
            return false;
        }
        DailyAmbulatoryBloodPressureReport dailyAmbulatoryBloodPressureReport = (DailyAmbulatoryBloodPressureReport) other;
        return this.time == dailyAmbulatoryBloodPressureReport.time && Intrinsics.areEqual(this.tag, dailyAmbulatoryBloodPressureReport.tag);
    }

    @Nullable
    public final AmbulatoryBloodPressureReport getAmbulatoryBloodPressureReport() {
        return this.ambulatoryBloodPressureReport;
    }

    @Nullable
    public final List<AmbulatoryBloodPressureReport> getAmbulatoryBloodPressureReportList() {
        return this.ambulatoryBloodPressureReportList;
    }

    @Nullable
    public final List<AmbulatoryStatItem> getAmbulatoryStatItemList() {
        return this.ambulatoryStatItemList;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    public final int getSumAbnormalCount() {
        return this.sumAbnormalCount;
    }

    public final int getSumNormalCount() {
        return this.sumNormalCount;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + this.tag.hashCode();
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        return this.sumAbnormalCount == 0 && this.sumNormalCount == 0;
    }

    public final void setAmbulatoryBloodPressureReport(@Nullable AmbulatoryBloodPressureReport ambulatoryBloodPressureReport) {
        this.ambulatoryBloodPressureReport = ambulatoryBloodPressureReport;
    }

    public final void setAmbulatoryBloodPressureReportList(@Nullable List<AmbulatoryBloodPressureReport> list) {
        this.ambulatoryBloodPressureReportList = list;
    }

    public final void setAmbulatoryStatItemList(@Nullable List<AmbulatoryStatItem> list) {
        this.ambulatoryStatItemList = list;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setSumAbnormalCount(int i) {
        this.sumAbnormalCount = i;
    }

    public final void setSumNormalCount(int i) {
        this.sumNormalCount = i;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "DailyAmbulatoryBloodPressureReport(time=" + getTime() + ", tag='" + getTag() + "', sid=" + getSid() + ", sumAbnormalCount=" + this.sumAbnormalCount + ", sumNormalCount=" + this.sumNormalCount + ", ambulatoryStatItemList=" + this.ambulatoryStatItemList + ", ambulatoryBloodPressureReport=" + this.ambulatoryBloodPressureReport + ", ambulatoryBloodPressureReportList=" + this.ambulatoryBloodPressureReportList + ")";
    }
}
