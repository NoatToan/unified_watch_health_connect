package com.xiaomi.fitness.health.todayhealth.model;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.DynamicBloodPressureSchedule;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010,\u001a\u00020-H\u0016J2\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u00101\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u00102\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\b\u00103\u001a\u00020\u0006H\u0016J\t\u00104\u001a\u00020\u0004HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\u001d\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u00107\u001a\u00020-2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010&\u001a\b\u0012\u0004\u0012\u00020!0 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R \u0010)\u001a\b\u0012\u0004\u0012\u00020!0 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/DailyDynamicBloodPressureReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "Lcom/xiaomi/fitness/health/todayhealth/model/IBloodPressureData;", "time", "", "tag", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "schedule", "Lcom/xiaomi/fit/fitness/export/data/item/DynamicBloodPressureSchedule;", "getSchedule", "()Lcom/xiaomi/fit/fitness/export/data/item/DynamicBloodPressureSchedule;", "setSchedule", "(Lcom/xiaomi/fit/fitness/export/data/item/DynamicBloodPressureSchedule;)V", "measureCount", "", "getMeasureCount", "()I", "setMeasureCount", "(I)V", "highPressureRecords", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "getHighPressureRecords", "()Ljava/util/List;", "setHighPressureRecords", "(Ljava/util/List;)V", "lowPressureRecords", "getLowPressureRecords", "setLowPressureRecords", "pulseRecords", "getPulseRecords", "setPulseRecords", "isEmpty", "", "updateChartHelpList", "", "highTimesList", "lowTimesList", "pulseTimesList", "toString", "component1", "component2", "copy", "equals", "other", "", "hashCode", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyDynamicBloodPressureReport extends DailyBasicReport implements IBloodPressureData {

    @NotNull
    private List<TimesDataRecordInt> highPressureRecords;

    @NotNull
    private List<TimesDataRecordInt> lowPressureRecords;
    private int measureCount;

    @NotNull
    private List<TimesDataRecordInt> pulseRecords;

    @Nullable
    private DynamicBloodPressureSchedule schedule;

    @Nullable
    private String sid;

    @NotNull
    private final String tag;
    private long time;

    public DailyDynamicBloodPressureReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.time = j;
        this.tag = tag;
        this.sid = "default";
        this.highPressureRecords = new ArrayList();
        this.lowPressureRecords = new ArrayList();
        this.pulseRecords = new ArrayList();
    }

    public static /* synthetic */ DailyDynamicBloodPressureReport copy$default(DailyDynamicBloodPressureReport dailyDynamicBloodPressureReport, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyDynamicBloodPressureReport.time;
        }
        if ((i & 2) != 0) {
            str = dailyDynamicBloodPressureReport.tag;
        }
        return dailyDynamicBloodPressureReport.copy(j, str);
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
    public final DailyDynamicBloodPressureReport copy(long time, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new DailyDynamicBloodPressureReport(time, tag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyDynamicBloodPressureReport)) {
            return false;
        }
        DailyDynamicBloodPressureReport dailyDynamicBloodPressureReport = (DailyDynamicBloodPressureReport) other;
        return this.time == dailyDynamicBloodPressureReport.time && Intrinsics.areEqual(this.tag, dailyDynamicBloodPressureReport.tag);
    }

    @NotNull
    public final List<TimesDataRecordInt> getHighPressureRecords() {
        return this.highPressureRecords;
    }

    @NotNull
    public final List<TimesDataRecordInt> getLowPressureRecords() {
        return this.lowPressureRecords;
    }

    public final int getMeasureCount() {
        return this.measureCount;
    }

    @NotNull
    public final List<TimesDataRecordInt> getPulseRecords() {
        return this.pulseRecords;
    }

    @Nullable
    public final DynamicBloodPressureSchedule getSchedule() {
        return this.schedule;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
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
        return this.schedule == null && this.highPressureRecords.isEmpty() && this.pulseRecords.isEmpty() && this.lowPressureRecords.isEmpty();
    }

    public final void setHighPressureRecords(@NotNull List<TimesDataRecordInt> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.highPressureRecords = list;
    }

    public final void setLowPressureRecords(@NotNull List<TimesDataRecordInt> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.lowPressureRecords = list;
    }

    public final void setMeasureCount(int i) {
        this.measureCount = i;
    }

    public final void setPulseRecords(@NotNull List<TimesDataRecordInt> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.pulseRecords = list;
    }

    public final void setSchedule(@Nullable DynamicBloodPressureSchedule dynamicBloodPressureSchedule) {
        this.schedule = dynamicBloodPressureSchedule;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "DailyDynamicBloodPressureReport(time=" + getTime() + ", tag='" + getTag() + "', sid=" + getSid() + ", schedule=" + this.schedule + ", measureCount=" + this.measureCount + ", highPressureRecords=" + this.highPressureRecords + ", lowPressureRecords=" + this.lowPressureRecords + ", pulseRecords=" + this.pulseRecords + ")";
    }

    @Override // com.xiaomi.fitness.health.todayhealth.model.IBloodPressureData
    public void updateChartHelpList(@NotNull List<TimesDataRecordInt> highTimesList, @NotNull List<TimesDataRecordInt> lowTimesList, @NotNull List<TimesDataRecordInt> pulseTimesList) {
        Intrinsics.checkNotNullParameter(highTimesList, "highTimesList");
        Intrinsics.checkNotNullParameter(lowTimesList, "lowTimesList");
        Intrinsics.checkNotNullParameter(pulseTimesList, "pulseTimesList");
        this.highPressureRecords = highTimesList;
        this.lowPressureRecords = lowTimesList;
        this.pulseRecords = pulseTimesList;
    }

    @Override // com.xiaomi.fitness.health.todayhealth.model.IBloodPressureData
    public void updateMaxMinAvg(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        IBloodPressureData.DefaultImpls.updateMaxMinAvg(this, i, i2, i3, i4, i5, i6, i7, i8, i9);
    }
}
