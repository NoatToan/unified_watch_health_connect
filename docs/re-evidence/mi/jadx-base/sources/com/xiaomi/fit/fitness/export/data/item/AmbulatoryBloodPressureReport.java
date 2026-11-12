package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010*\u001a\u00020\u0004H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010-\u001a\u00020.H\u0016J\t\u0010/\u001a\u00020\u0004HÆ\u0003J\u0013\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R&\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R&\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#¨\u00066"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureReport;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/item/IPointTimeData;", "time", "", "<init>", "(J)V", "getTime", "()J", "setTime", "bpRhythmStartTime", "getBpRhythmStartTime", "()Ljava/lang/Long;", "setBpRhythmStartTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "bpRhythmEndTime", "getBpRhythmEndTime", "setBpRhythmEndTime", "bpRhythmStatus", "", "getBpRhythmStatus", "()Ljava/lang/Integer;", "setBpRhythmStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "morningCalibrationCount", "getMorningCalibrationCount", "setMorningCalibrationCount", "morningAdjustBPList", "", "Lcom/xiaomi/fit/fitness/export/data/item/AdjustBloodPressureItem;", "getMorningAdjustBPList", "()Ljava/util/List;", "setMorningAdjustBPList", "(Ljava/util/List;)V", "eveningCalibrationCount", "getEveningCalibrationCount", "setEveningCalibrationCount", "eveningAdjustBPList", "getEveningAdjustBPList", "setEveningAdjustBPList", "getTimestamp", "setTimestamp", "", "toString", "", "component1", "copy", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AmbulatoryBloodPressureReport extends DailyRecordItem implements IPointTimeData {

    /* JADX INFO: renamed from: bpRhythmEndTime, reason: from kotlin metadata and from toString */
    @SerializedName("circadian_rhythm_calculation_end_time")
    @Nullable
    private Long bPRhythmEndTime;

    /* JADX INFO: renamed from: bpRhythmStartTime, reason: from kotlin metadata and from toString */
    @SerializedName("circadian_rhythm_calculation_start_time")
    @Nullable
    private Long bPRhythmStartTime;

    @SerializedName("circadian_rhythm")
    @Nullable
    private Integer bpRhythmStatus;

    @SerializedName("evening_calibration_list")
    @Nullable
    private List<AdjustBloodPressureItem> eveningAdjustBPList;

    @SerializedName("evening_calibration_times")
    @Nullable
    private Integer eveningCalibrationCount;

    @SerializedName("morning_calibration_list")
    @Nullable
    private List<AdjustBloodPressureItem> morningAdjustBPList;

    @SerializedName("morning_calibration_times")
    @Nullable
    private Integer morningCalibrationCount;
    private long time;

    public AmbulatoryBloodPressureReport(long j) {
        super(null);
        this.time = j;
    }

    public static /* synthetic */ AmbulatoryBloodPressureReport copy$default(AmbulatoryBloodPressureReport ambulatoryBloodPressureReport, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ambulatoryBloodPressureReport.time;
        }
        return ambulatoryBloodPressureReport.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final AmbulatoryBloodPressureReport copy(long time) {
        return new AmbulatoryBloodPressureReport(time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AmbulatoryBloodPressureReport) && this.time == ((AmbulatoryBloodPressureReport) other).time;
    }

    @Nullable
    /* JADX INFO: renamed from: getBpRhythmEndTime, reason: from getter */
    public final Long getBPRhythmEndTime() {
        return this.bPRhythmEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: getBpRhythmStartTime, reason: from getter */
    public final Long getBPRhythmStartTime() {
        return this.bPRhythmStartTime;
    }

    @Nullable
    public final Integer getBpRhythmStatus() {
        return this.bpRhythmStatus;
    }

    @Nullable
    public final List<AdjustBloodPressureItem> getEveningAdjustBPList() {
        return this.eveningAdjustBPList;
    }

    @Nullable
    public final Integer getEveningCalibrationCount() {
        return this.eveningCalibrationCount;
    }

    @Nullable
    public final List<AdjustBloodPressureItem> getMorningAdjustBPList() {
        return this.morningAdjustBPList;
    }

    @Nullable
    public final Integer getMorningCalibrationCount() {
        return this.morningCalibrationCount;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        return Long.hashCode(this.time);
    }

    public final void setBpRhythmEndTime(@Nullable Long l) {
        this.bPRhythmEndTime = l;
    }

    public final void setBpRhythmStartTime(@Nullable Long l) {
        this.bPRhythmStartTime = l;
    }

    public final void setBpRhythmStatus(@Nullable Integer num) {
        this.bpRhythmStatus = num;
    }

    public final void setEveningAdjustBPList(@Nullable List<AdjustBloodPressureItem> list) {
        this.eveningAdjustBPList = list;
    }

    public final void setEveningCalibrationCount(@Nullable Integer num) {
        this.eveningCalibrationCount = num;
    }

    public final void setMorningAdjustBPList(@Nullable List<AdjustBloodPressureItem> list) {
        this.morningAdjustBPList = list;
    }

    public final void setMorningCalibrationCount(@Nullable Integer num) {
        this.morningCalibrationCount = num;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    @NotNull
    public String toString() {
        return "AmbulatoryBloodPressureReport(time=" + this.time + ", sid=" + getSid() + ", bPRhythmStartTime=" + this.bPRhythmStartTime + ", bPRhythmEndTime=" + this.bPRhythmEndTime + ", bpRhythmStatus=" + this.bpRhythmStatus + ", morningAdjustBPList=" + this.morningAdjustBPList + ", eveningAdjustBPList=" + this.eveningAdjustBPList + ")";
    }
}
