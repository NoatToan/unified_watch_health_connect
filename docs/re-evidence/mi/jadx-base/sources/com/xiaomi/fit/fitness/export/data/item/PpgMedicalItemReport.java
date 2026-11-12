package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010/\u001a\u00020\u0003H\u0016J\u0010\u00100\u001a\u0002012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u00102\u001a\u000203H\u0016J\t\u00104\u001a\u00020\u0003HÂ\u0003J\t\u00105\u001a\u00020\u0005HÂ\u0003J\t\u00106\u001a\u00020\u0005HÂ\u0003J\t\u00107\u001a\u00020\u0005HÂ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016JV\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0005HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R&\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010&\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\"\u0010)\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R\"\u0010,\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018¨\u0006B"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/PpgMedicalItemReport;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "tzIn15min", "", "fileType", "version", EcgSchemaHandler.PARAM_MEASURE_TIME, "measureDuration", "avgHr", "<init>", "(JIIIJILjava/lang/Integer;)V", "getMeasureTime", "()J", "setMeasureTime", "(J)V", "getMeasureDuration", "()I", "setMeasureDuration", "(I)V", "getAvgHr", "()Ljava/lang/Integer;", "setAvgHr", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "interpretStatus", "getInterpretStatus", "setInterpretStatus", "symptomList", "", "getSymptomList", "()Ljava/util/List;", "setSymptomList", "(Ljava/util/List;)V", "sceneList", "getSceneList", "setSceneList", "occurFrequency", "getOccurFrequency", "setOccurFrequency", "analysisResult", "getAnalysisResult", "setAnalysisResult", EcgReportKey.dataSource, "getDataSource", "setDataSource", "getTimestamp", "setTimestamp", "", "toString", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JIIIJILjava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/PpgMedicalItemReport;", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PpgMedicalItemReport extends DailyRecordItem {

    @SerializedName("risk_assessment_result")
    @HrPpgStatus
    @Nullable
    private Integer analysisResult;

    @SerializedName("avg_heart_rate")
    @Nullable
    private Integer avgHr;

    @SerializedName("source")
    @Nullable
    private Integer dataSource;

    @SerializedName("file_type")
    private final int fileType;

    @SerializedName("interpret_status")
    private int interpretStatus;

    @SerializedName("measurement_duration")
    private int measureDuration;

    @SerializedName("start_measure_time")
    private long measureTime;

    @SerializedName("frequency")
    @Nullable
    private Integer occurFrequency;

    @SerializedName("scene_list")
    @Nullable
    private List<Integer> sceneList;

    @SerializedName("symptom_list")
    @Nullable
    private List<Integer> symptomList;

    @SerializedName("time")
    private final long time;

    @SerializedName("timezone")
    private final int tzIn15min;

    @SerializedName("version")
    private final int version;

    public /* synthetic */ PpgMedicalItemReport(long j, int i, int i2, int i3, long j2, int i4, Integer num, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, i3, (i5 & 16) != 0 ? 0L : j2, (i5 & 32) != 0 ? 30 : i4, (i5 & 64) != 0 ? null : num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final int getTzIn15min() {
        return this.tzIn15min;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final int getFileType() {
        return this.fileType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getMeasureTime() {
        return this.measureTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMeasureDuration() {
        return this.measureDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @NotNull
    public final PpgMedicalItemReport copy(long time, int tzIn15min, int fileType, int version, long measureTime, int measureDuration, @Nullable Integer avgHr) {
        return new PpgMedicalItemReport(time, tzIn15min, fileType, version, measureTime, measureDuration, avgHr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PpgMedicalItemReport)) {
            return false;
        }
        PpgMedicalItemReport ppgMedicalItemReport = (PpgMedicalItemReport) other;
        return this.time == ppgMedicalItemReport.time && this.tzIn15min == ppgMedicalItemReport.tzIn15min && this.fileType == ppgMedicalItemReport.fileType && this.version == ppgMedicalItemReport.version && this.measureTime == ppgMedicalItemReport.measureTime && this.measureDuration == ppgMedicalItemReport.measureDuration && Intrinsics.areEqual(this.avgHr, ppgMedicalItemReport.avgHr);
    }

    @Nullable
    public final Integer getAnalysisResult() {
        return this.analysisResult;
    }

    @Nullable
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    public final Integer getDataSource() {
        return this.dataSource;
    }

    public final int getInterpretStatus() {
        return this.interpretStatus;
    }

    public final int getMeasureDuration() {
        return this.measureDuration;
    }

    public final long getMeasureTime() {
        return this.measureTime;
    }

    @Nullable
    public final Integer getOccurFrequency() {
        return this.occurFrequency;
    }

    @Nullable
    public final List<Integer> getSceneList() {
        return this.sceneList;
    }

    @Nullable
    public final List<Integer> getSymptomList() {
        return this.symptomList;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.measureTime;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.tzIn15min)) * 31) + Integer.hashCode(this.fileType)) * 31) + Integer.hashCode(this.version)) * 31) + Long.hashCode(this.measureTime)) * 31) + Integer.hashCode(this.measureDuration)) * 31;
        Integer num = this.avgHr;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setAnalysisResult(@Nullable Integer num) {
        this.analysisResult = num;
    }

    public final void setAvgHr(@Nullable Integer num) {
        this.avgHr = num;
    }

    public final void setDataSource(@Nullable Integer num) {
        this.dataSource = num;
    }

    public final void setInterpretStatus(int i) {
        this.interpretStatus = i;
    }

    public final void setMeasureDuration(int i) {
        this.measureDuration = i;
    }

    public final void setMeasureTime(long j) {
        this.measureTime = j;
    }

    public final void setOccurFrequency(@Nullable Integer num) {
        this.occurFrequency = num;
    }

    public final void setSceneList(@Nullable List<Integer> list) {
        this.sceneList = list;
    }

    public final void setSymptomList(@Nullable List<Integer> list) {
        this.symptomList = list;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.measureTime = time;
    }

    @NotNull
    public String toString() {
        return "{measureTime = " + this.measureTime + ", measureDuration = " + this.measureDuration + " avgHr = " + this.avgHr + ", dataSource = " + this.dataSource + ", interpretStatus = " + this.interpretStatus + ", occurFrequency = " + this.occurFrequency + ", sid = " + getSid() + "}";
    }

    public PpgMedicalItemReport(long j, int i, int i2, int i3, long j2, int i4, @Nullable Integer num) {
        super(null);
        this.time = j;
        this.tzIn15min = i;
        this.fileType = i2;
        this.version = i3;
        this.measureTime = j2;
        this.measureDuration = i4;
        this.avgHr = num;
    }
}
