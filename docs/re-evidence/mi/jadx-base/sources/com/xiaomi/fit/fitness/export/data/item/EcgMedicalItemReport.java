package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.annotation.EcgInterpretStatus;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler;
import com.xiaomi.fitness.health.hrm.StepHrmDetailFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0010J\u0006\u00105\u001a\u00020\u000fJ \u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010:J\b\u0010;\u001a\u00020\u0003H\u0016J\u0010\u0010<\u001a\u00020=2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010>\u001a\u00020?H\u0016J\t\u0010@\u001a\u00020\u0003HÂ\u0003J\t\u0010A\u001a\u00020\u0005HÂ\u0003J\t\u0010B\u001a\u00020\u0005HÂ\u0003J\t\u0010C\u001a\u00020\u0005HÂ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ`\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010N\u001a\u00020\u0005HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R&\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R&\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u0010,\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\"\u0010/\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR\"\u00102\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001e¨\u0006O"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "tzIn15min", "", "fileType", "version", EcgSchemaHandler.PARAM_MEASURE_TIME, "measureDuration", "sampleFrequency", "avgHr", "<init>", "(JIIIJIILjava/lang/Integer;)V", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "(Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;)V", "getMeasureTime", "()J", "setMeasureTime", "(J)V", "getMeasureDuration", "()I", "setMeasureDuration", "(I)V", "getSampleFrequency", "setSampleFrequency", "getAvgHr", "()Ljava/lang/Integer;", "setAvgHr", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "interpretStatus", "getInterpretStatus", "setInterpretStatus", "symptomList", "", "getSymptomList", "()Ljava/util/List;", "setSymptomList", "(Ljava/util/List;)V", "sceneList", "getSceneList", "setSceneList", "occurFrequency", "getOccurFrequency", "setOccurFrequency", "analysisResult", "getAnalysisResult", "setAnalysisResult", EcgReportKey.dataSource, "getDataSource", "setDataSource", "getDataId", "getRecordData", "", "durationInSec", "sparsePoints", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTimestamp", "setTimestamp", "", "toString", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JIIIJIILjava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcgMedicalItemReport extends DailyRecordItem {

    @SerializedName("analysis_result")
    @Nullable
    private Integer analysisResult;

    @SerializedName(StepHrmDetailFragment.KEY_AVG_HR)
    @Nullable
    private Integer avgHr;

    @SerializedName("source")
    @Nullable
    private Integer dataSource;

    @SerializedName("file_type")
    private final int fileType;

    @SerializedName("interpret_status")
    @EcgInterpretStatus
    private int interpretStatus;

    @SerializedName("measurement_duration")
    private int measureDuration;

    @SerializedName("start_measure_time")
    private long measureTime;

    @SerializedName("frequency")
    @Nullable
    private Integer occurFrequency;

    @SerializedName("sample_rate")
    private int sampleFrequency;

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

    public /* synthetic */ EcgMedicalItemReport(long j, int i, int i2, int i3, long j2, int i4, int i5, Integer num, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, i3, (i6 & 16) != 0 ? 0L : j2, (i6 & 32) != 0 ? 30 : i4, (i6 & 64) != 0 ? 500 : i5, (i6 & 128) != 0 ? null : num);
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

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSampleFrequency() {
        return this.sampleFrequency;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @NotNull
    public final EcgMedicalItemReport copy(long time, int tzIn15min, int fileType, int version, long measureTime, int measureDuration, int sampleFrequency, @Nullable Integer avgHr) {
        return new EcgMedicalItemReport(time, tzIn15min, fileType, version, measureTime, measureDuration, sampleFrequency, avgHr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgMedicalItemReport)) {
            return false;
        }
        EcgMedicalItemReport ecgMedicalItemReport = (EcgMedicalItemReport) other;
        return this.time == ecgMedicalItemReport.time && this.tzIn15min == ecgMedicalItemReport.tzIn15min && this.fileType == ecgMedicalItemReport.fileType && this.version == ecgMedicalItemReport.version && this.measureTime == ecgMedicalItemReport.measureTime && this.measureDuration == ecgMedicalItemReport.measureDuration && this.sampleFrequency == ecgMedicalItemReport.sampleFrequency && Intrinsics.areEqual(this.avgHr, ecgMedicalItemReport.avgHr);
    }

    @Nullable
    public final Integer getAnalysisResult() {
        return this.analysisResult;
    }

    @Nullable
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @NotNull
    public final FitnessDataId getDataId() {
        return new FitnessDataId.Builder().timeStampInSec(this.time).timeZoneIn15Min(this.tzIn15min).dailyType(11).fileType(this.fileType).version(this.version).build();
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
    public final Object getRecordData(int i, int i2, @NotNull Continuation<? super float[]> continuation) {
        return FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).getEcgRecordData(this, i, i2, continuation);
    }

    public final int getSampleFrequency() {
        return this.sampleFrequency;
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
        int iHashCode = ((((((((((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.tzIn15min)) * 31) + Integer.hashCode(this.fileType)) * 31) + Integer.hashCode(this.version)) * 31) + Long.hashCode(this.measureTime)) * 31) + Integer.hashCode(this.measureDuration)) * 31) + Integer.hashCode(this.sampleFrequency)) * 31;
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

    public final void setSampleFrequency(int i) {
        this.sampleFrequency = i;
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
        return "{measureTime = " + this.measureTime + ", measureDuration = " + this.measureDuration + ", sampleFrequency = " + this.sampleFrequency + ", avgHr = " + this.avgHr + ", interpretStatus = " + this.interpretStatus + ", occurFrequency = " + this.occurFrequency + ", sid = " + getSid() + "}";
    }

    public EcgMedicalItemReport(long j, int i, int i2, int i3, long j2, int i4, int i5, @Nullable Integer num) {
        super(null);
        this.time = j;
        this.tzIn15min = i;
        this.fileType = i2;
        this.version = i3;
        this.measureTime = j2;
        this.measureDuration = i4;
        this.sampleFrequency = i5;
        this.avgHr = num;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcgMedicalItemReport(@NotNull FitnessDataId dataId) {
        this(dataId.getTimeStamp(), dataId.getTzIn15Min(), dataId.getFileType(), dataId.getVersion(), 0L, 0, 0, null, 240, null);
        Intrinsics.checkNotNullParameter(dataId, "dataId");
    }
}
