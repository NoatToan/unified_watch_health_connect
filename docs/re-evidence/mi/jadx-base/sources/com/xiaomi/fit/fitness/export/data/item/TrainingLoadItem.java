package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTrainingLoadReport;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\"\u001a\u00020\u0003H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0006\u0010%\u001a\u00020&J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u001d\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0015\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\"\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014¨\u00061"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/TrainingLoadItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "wtlSum", "", "<init>", "(JI)V", "getTime", "()J", "setTime", "(J)V", "getWtlSum", "()I", "tlLevel", "getTlLevel$annotations", "()V", "getTlLevel", "()Ljava/lang/Integer;", "setTlLevel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "wtlSumOptimalMin", "getWtlSumOptimalMin", "setWtlSumOptimalMin", "wtlSumOptimalMax", "getWtlSumOptimalMax", "setWtlSumOptimalMax", "wtlSumOverreaching", "getWtlSumOverreaching", "setWtlSumOverreaching", "currentDayTL", "getCurrentDayTL", "setCurrentDayTL", "getTimestamp", "setTimestamp", "", "convertToDailyTLReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTrainingLoadReport;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrainingLoadItem extends DailyRecordItem {

    @SerializedName("current_day_train_load")
    @Nullable
    private Integer currentDayTL;

    @SerializedName("date_time")
    private long time;

    @SerializedName("current_train_load_level")
    @Nullable
    private Integer tlLevel;

    @SerializedName("wtl_sum")
    private final int wtlSum;

    @SerializedName("wtl_sum_optimal_max")
    @Nullable
    private Integer wtlSumOptimalMax;

    @SerializedName("wtl_sum_optimal_min")
    @Nullable
    private Integer wtlSumOptimalMin;

    @SerializedName("wtl_sum_overreaching")
    @Nullable
    private Integer wtlSumOverreaching;

    public TrainingLoadItem(long j, int i) {
        super(null);
        this.time = j;
        this.wtlSum = i;
    }

    public static /* synthetic */ TrainingLoadItem copy$default(TrainingLoadItem trainingLoadItem, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = trainingLoadItem.time;
        }
        if ((i2 & 2) != 0) {
            i = trainingLoadItem.wtlSum;
        }
        return trainingLoadItem.copy(j, i);
    }

    public static /* synthetic */ void getTlLevel$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWtlSum() {
        return this.wtlSum;
    }

    @NotNull
    public final DailyTrainingLoadReport convertToDailyTLReport() {
        DailyTrainingLoadReport dailyTrainingLoadReport = new DailyTrainingLoadReport(this.time, getSid());
        dailyTrainingLoadReport.setMoreInfo(this);
        return dailyTrainingLoadReport;
    }

    @NotNull
    public final TrainingLoadItem copy(long time, int wtlSum) {
        return new TrainingLoadItem(time, wtlSum);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingLoadItem)) {
            return false;
        }
        TrainingLoadItem trainingLoadItem = (TrainingLoadItem) other;
        return this.time == trainingLoadItem.time && this.wtlSum == trainingLoadItem.wtlSum;
    }

    @Nullable
    public final Integer getCurrentDayTL() {
        return this.currentDayTL;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    @Nullable
    public final Integer getTlLevel() {
        return this.tlLevel;
    }

    public final int getWtlSum() {
        return this.wtlSum;
    }

    @Nullable
    public final Integer getWtlSumOptimalMax() {
        return this.wtlSumOptimalMax;
    }

    @Nullable
    public final Integer getWtlSumOptimalMin() {
        return this.wtlSumOptimalMin;
    }

    @Nullable
    public final Integer getWtlSumOverreaching() {
        return this.wtlSumOverreaching;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.wtlSum);
    }

    public final void setCurrentDayTL(@Nullable Integer num) {
        this.currentDayTL = num;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    public final void setTlLevel(@Nullable Integer num) {
        this.tlLevel = num;
    }

    public final void setWtlSumOptimalMax(@Nullable Integer num) {
        this.wtlSumOptimalMax = num;
    }

    public final void setWtlSumOptimalMin(@Nullable Integer num) {
        this.wtlSumOptimalMin = num;
    }

    public final void setWtlSumOverreaching(@Nullable Integer num) {
        this.wtlSumOverreaching = num;
    }

    @NotNull
    public String toString() {
        return "TrainingLoadItem(time=" + this.time + ", wtlSum=" + this.wtlSum + ")";
    }
}
