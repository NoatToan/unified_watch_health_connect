package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u00100\u001a\u000201J\b\u00102\u001a\u000203H\u0016J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u001d\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u00107\u001a\u0002012\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\u0013R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010\u0013R \u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006:"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/EcgMeasureResult;", "", "time", "", "tzIn15Min", "", "<init>", "(JI)V", "getTime", "()J", "getTzIn15Min", "()I", "startMeasureTime", "getStartMeasureTime", "setStartMeasureTime", "(J)V", "measureDuration", "getMeasureDuration", "setMeasureDuration", "(I)V", "sampleFrequency", "getSampleFrequency", "setSampleFrequency", "avgHr", "getAvgHr", "()Ljava/lang/Integer;", "setAvgHr", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "analysisResult", "getAnalysisResult", "setAnalysisResult", "symptomValue", "getSymptomValue", "()Ljava/lang/Long;", "setSymptomValue", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", EcgReportKey.dataSource, "getDataSource", "setDataSource", "srcData", "", "", "getSrcData", "()Ljava/util/List;", "setSrcData", "(Ljava/util/List;)V", "isInvalid", "", "toString", "", "component1", "component2", "copy", "equals", "other", "hashCode", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcgMeasureResult {

    @Nullable
    private Integer analysisResult;

    @Nullable
    private Integer avgHr;
    private int dataSource;
    private int measureDuration;
    private int sampleFrequency;

    @NotNull
    private List<Float> srcData = CollectionsKt__CollectionsKt.emptyList();
    private long startMeasureTime;

    @Nullable
    private Long symptomValue;
    private final long time;
    private final int tzIn15Min;

    public EcgMeasureResult(long j, int i) {
        this.time = j;
        this.tzIn15Min = i;
    }

    public static /* synthetic */ EcgMeasureResult copy$default(EcgMeasureResult ecgMeasureResult, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = ecgMeasureResult.time;
        }
        if ((i2 & 2) != 0) {
            i = ecgMeasureResult.tzIn15Min;
        }
        return ecgMeasureResult.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTzIn15Min() {
        return this.tzIn15Min;
    }

    @NotNull
    public final EcgMeasureResult copy(long time, int tzIn15Min) {
        return new EcgMeasureResult(time, tzIn15Min);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgMeasureResult)) {
            return false;
        }
        EcgMeasureResult ecgMeasureResult = (EcgMeasureResult) other;
        return this.time == ecgMeasureResult.time && this.tzIn15Min == ecgMeasureResult.tzIn15Min;
    }

    @Nullable
    public final Integer getAnalysisResult() {
        return this.analysisResult;
    }

    @Nullable
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    public final int getDataSource() {
        return this.dataSource;
    }

    public final int getMeasureDuration() {
        return this.measureDuration;
    }

    public final int getSampleFrequency() {
        return this.sampleFrequency;
    }

    @NotNull
    public final List<Float> getSrcData() {
        return this.srcData;
    }

    public final long getStartMeasureTime() {
        return this.startMeasureTime;
    }

    @Nullable
    public final Long getSymptomValue() {
        return this.symptomValue;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getTzIn15Min() {
        return this.tzIn15Min;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.tzIn15Min);
    }

    public final boolean isInvalid() {
        return this.measureDuration < 25 || this.sampleFrequency <= 0 || this.srcData.size() / this.sampleFrequency < 25;
    }

    public final void setAnalysisResult(@Nullable Integer num) {
        this.analysisResult = num;
    }

    public final void setAvgHr(@Nullable Integer num) {
        this.avgHr = num;
    }

    public final void setDataSource(int i) {
        this.dataSource = i;
    }

    public final void setMeasureDuration(int i) {
        this.measureDuration = i;
    }

    public final void setSampleFrequency(int i) {
        this.sampleFrequency = i;
    }

    public final void setSrcData(@NotNull List<Float> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.srcData = list;
    }

    public final void setStartMeasureTime(long j) {
        this.startMeasureTime = j;
    }

    public final void setSymptomValue(@Nullable Long l) {
        this.symptomValue = l;
    }

    @NotNull
    public String toString() {
        return "startMeasureTime=" + this.startMeasureTime + ", measureDuration=" + this.measureDuration + ", sampleFrequency=" + this.sampleFrequency + ", avgHr=" + this.avgHr + ", srcDataSize=" + this.srcData.size() + ", analysisResult = " + this.analysisResult + ", dataSource = " + this.dataSource + ", symptomValue = " + this.symptomValue;
    }
}
