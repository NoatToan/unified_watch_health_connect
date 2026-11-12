package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.item.TrainingLoadItem;
import com.xiaomi.fit.fitness.export.utils.SportLevelComputeUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010)\u001a\u00020$J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020$J\u000e\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0000J\u0006\u0010/\u001a\u00020\u0015J\b\u00100\u001a\u00020\u0005H\u0016J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00104\u001a\u00020\u00132\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\n\n\u0002\u0010\u001d\u0012\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u0012\u0010 \u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u0012\u0010!\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00068"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTrainingLoadReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "sid", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getSid", "()Ljava/lang/String;", "setSid", "(Ljava/lang/String;)V", "tag", "getTag", "isEmpty", "", "wtlSum", "", "getWtlSum", "()I", "setWtlSum", "(I)V", "tlLevel", "getTlLevel$annotations", "()V", "Ljava/lang/Integer;", "wtlSumOptimalMin", "wtlSumOptimalMax", "wtlSumOverreaching", "currentDayTL", "dayTLList", "", "Lcom/xiaomi/fit/fitness/export/data/item/TrainingLoadItem;", "getDayTLList", "()Ljava/util/List;", "setDayTLList", "(Ljava/util/List;)V", "toTLItem", "setMoreInfo", "", "item", "copyFrom", "report", "getTrainingLoadLevel", "toString", "component1", "component2", "copy", "equals", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyTrainingLoadReport extends DailyBasicReport {

    @Nullable
    private Integer currentDayTL;

    @Nullable
    private transient List<TrainingLoadItem> dayTLList;

    @Nullable
    private String sid;
    private long time;

    @Nullable
    private Integer tlLevel;
    private int wtlSum;

    @Nullable
    private Integer wtlSumOptimalMax;

    @Nullable
    private Integer wtlSumOptimalMin;

    @Nullable
    private Integer wtlSumOverreaching;

    public DailyTrainingLoadReport(long j, @Nullable String str) {
        this.time = j;
        this.sid = str;
    }

    public static /* synthetic */ DailyTrainingLoadReport copy$default(DailyTrainingLoadReport dailyTrainingLoadReport, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyTrainingLoadReport.time;
        }
        if ((i & 2) != 0) {
            str = dailyTrainingLoadReport.sid;
        }
        return dailyTrainingLoadReport.copy(j, str);
    }

    private static /* synthetic */ void getTlLevel$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    public final DailyTrainingLoadReport copy(long time, @Nullable String sid) {
        return new DailyTrainingLoadReport(time, sid);
    }

    public final void copyFrom(@NotNull DailyTrainingLoadReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        setTime(report.getTime());
        this.wtlSum = report.wtlSum;
        this.wtlSumOptimalMax = report.wtlSumOptimalMax;
        this.wtlSumOptimalMin = report.wtlSumOptimalMin;
        this.wtlSumOverreaching = report.wtlSumOverreaching;
        this.currentDayTL = report.currentDayTL;
        this.tlLevel = report.tlLevel;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyTrainingLoadReport)) {
            return false;
        }
        DailyTrainingLoadReport dailyTrainingLoadReport = (DailyTrainingLoadReport) other;
        return this.time == dailyTrainingLoadReport.time && Intrinsics.areEqual(this.sid, dailyTrainingLoadReport.sid);
    }

    @Nullable
    public final List<TrainingLoadItem> getDayTLList() {
        return this.dayTLList;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String getTag() {
        return "days";
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public long getTime() {
        return this.time;
    }

    public final int getTrainingLoadLevel() {
        Integer num = this.tlLevel;
        return num != null ? num.intValue() : SportLevelComputeUtils.INSTANCE.computeTrainingLoadLevel(this.wtlSum, this.wtlSumOptimalMin, this.wtlSumOptimalMax, this.wtlSumOverreaching);
    }

    public final int getWtlSum() {
        return this.wtlSum;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) * 31;
        String str = this.sid;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        return this.wtlSum == 0;
    }

    public final void setDayTLList(@Nullable List<TrainingLoadItem> list) {
        this.dayTLList = list;
    }

    public final void setMoreInfo(@NotNull TrainingLoadItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.wtlSum = item.getWtlSum();
        this.wtlSumOptimalMax = item.getWtlSumOptimalMax();
        this.wtlSumOptimalMin = item.getWtlSumOptimalMin();
        this.wtlSumOverreaching = item.getWtlSumOverreaching();
        this.currentDayTL = item.getCurrentDayTL();
        this.tlLevel = item.getTlLevel();
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    public final void setWtlSum(int i) {
        this.wtlSum = i;
    }

    @NotNull
    public String toString() {
        return "DailyTrainingLoadReport(time=" + getTime() + ", sid=" + getSid() + ", wtlSum=" + this.wtlSum + ", wtlSumOptimalMin=" + this.wtlSumOptimalMin + ", wtlSumOptimalMax=" + this.wtlSumOptimalMax + ", wtlSumOverreaching=" + this.wtlSumOverreaching + ", currentDayTL=" + this.currentDayTL + "), dayTLList=" + this.dayTLList;
    }

    @NotNull
    public final TrainingLoadItem toTLItem() {
        TrainingLoadItem trainingLoadItem = new TrainingLoadItem(getTime(), this.wtlSum);
        trainingLoadItem.setWtlSumOptimalMin(this.wtlSumOptimalMin);
        trainingLoadItem.setWtlSumOptimalMax(this.wtlSumOptimalMax);
        trainingLoadItem.setWtlSumOverreaching(this.wtlSumOverreaching);
        trainingLoadItem.setCurrentDayTL(this.currentDayTL);
        trainingLoadItem.setTlLevel(this.tlLevel);
        trainingLoadItem.setSid(getSid());
        return trainingLoadItem;
    }
}
