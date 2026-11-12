package com.xiaomi.fit.fitness.export.data.project;

import com.xiaomi.fit.fitness.export.data.ITimeData;
import com.xiaomi.fit.fitness.export.data.item.LightValueItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.body;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010+\u001a\u00020\u0004H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010.\u001a\u00020/H\u0016J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\t\u00104\u001a\u00020\u0004HÆ\u0003J\u0013\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R.\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R.\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R.\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016¨\u00068"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/project/SleepProjectReport;", "Lcom/xiaomi/fit/fitness/export/data/ITimeData;", "Ljava/io/Serializable;", "time", "", "<init>", "(J)V", "getTime", "()J", "dbTime", "getDbTime", "()Ljava/lang/Long;", "setDbTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "lightValueList", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/LightValueItem;", "getLightValueList", "()Ljava/util/Map;", "setLightValueList", "(Ljava/util/Map;)V", "bodyMomentumList", "Lcom/xiaomi/fit/fitness/export/data/item/BodyMomentumItem;", "getBodyMomentumList", "setBodyMomentumList", "sleepDiaryInfoList", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "getSleepDiaryInfoList", "setSleepDiaryInfoList", "sleepReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "getSleepReport", "setSleepReport", "bedTimeReport", "Lcom/xiaomi/fit/fitness/export/data/project/SleepBedTimeReport;", "getBedTimeReport", "setBedTimeReport", "sleepTimeReport", "Lcom/xiaomi/fit/fitness/export/data/project/SleepWakeTimeReport;", "getSleepTimeReport", "setSleepTimeReport", "getTimestamp", "setTimestamp", "", "toString", "", "equals", "", "other", "", "component1", "copy", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepProjectReport implements ITimeData, Serializable {

    @Nullable
    private Map<Long, ? extends List<SleepBedTimeReport>> bedTimeReport;

    @Nullable
    private Map<Long, ? extends List<body>> bodyMomentumList;

    @Nullable
    private Long dbTime;

    @Nullable
    private Map<Long, ? extends List<LightValueItem>> lightValueList;

    @Nullable
    private Map<Long, SleepDiaryReport> sleepDiaryInfoList;

    @Nullable
    private Map<Long, ? extends List<SleepSegmentReport>> sleepReport;

    @Nullable
    private Map<Long, ? extends List<SleepWakeTimeReport>> sleepTimeReport;
    private final long time;

    public SleepProjectReport(long j) {
        this.time = j;
    }

    public static /* synthetic */ SleepProjectReport copy$default(SleepProjectReport sleepProjectReport, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sleepProjectReport.time;
        }
        return sleepProjectReport.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final SleepProjectReport copy(long time) {
        return new SleepProjectReport(time);
    }

    public boolean equals(@Nullable Object other) {
        if (other != null && (other instanceof SleepProjectReport)) {
            return this == other || this.time == ((SleepProjectReport) other).time;
        }
        return false;
    }

    @Nullable
    public final Map<Long, List<SleepBedTimeReport>> getBedTimeReport() {
        return this.bedTimeReport;
    }

    @Nullable
    public final Map<Long, List<body>> getBodyMomentumList() {
        return this.bodyMomentumList;
    }

    @Nullable
    public final Long getDbTime() {
        return this.dbTime;
    }

    @Nullable
    public final Map<Long, List<LightValueItem>> getLightValueList() {
        return this.lightValueList;
    }

    @Nullable
    public final Map<Long, SleepDiaryReport> getSleepDiaryInfoList() {
        return this.sleepDiaryInfoList;
    }

    @Nullable
    public final Map<Long, List<SleepSegmentReport>> getSleepReport() {
        return this.sleepReport;
    }

    @Nullable
    public final Map<Long, List<SleepWakeTimeReport>> getSleepTimeReport() {
        return this.sleepTimeReport;
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

    public final void setBedTimeReport(@Nullable Map<Long, ? extends List<SleepBedTimeReport>> map) {
        this.bedTimeReport = map;
    }

    public final void setBodyMomentumList(@Nullable Map<Long, ? extends List<body>> map) {
        this.bodyMomentumList = map;
    }

    public final void setDbTime(@Nullable Long l) {
        this.dbTime = l;
    }

    public final void setLightValueList(@Nullable Map<Long, ? extends List<LightValueItem>> map) {
        this.lightValueList = map;
    }

    public final void setSleepDiaryInfoList(@Nullable Map<Long, SleepDiaryReport> map) {
        this.sleepDiaryInfoList = map;
    }

    public final void setSleepReport(@Nullable Map<Long, ? extends List<SleepSegmentReport>> map) {
        this.sleepReport = map;
    }

    public final void setSleepTimeReport(@Nullable Map<Long, ? extends List<SleepWakeTimeReport>> map) {
        this.sleepTimeReport = map;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @NotNull
    public String toString() {
        return "SleepProjectReport{time=" + this.time + ", lightValueList=" + this.lightValueList + "}";
    }
}
