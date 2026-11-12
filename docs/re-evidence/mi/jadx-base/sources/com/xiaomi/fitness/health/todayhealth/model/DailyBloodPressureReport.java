package com.xiaomi.fitness.health.todayhealth.model;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.AmbulatoryBloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.DynamicBloodPressureItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010V\u001a\u00020WH\u0016JP\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u00142\u0006\u0010[\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020\u00142\u0006\u0010]\u001a\u00020\u00142\u0006\u0010^\u001a\u00020\u00142\u0006\u0010_\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0014H\u0016J2\u0010`\u001a\u00020Y2\f\u0010a\u001a\b\u0012\u0004\u0012\u000203022\f\u0010b\u001a\b\u0012\u0004\u0012\u000203022\f\u0010c\u001a\b\u0012\u0004\u0012\u00020302H\u0016J\b\u0010d\u001a\u00020\u0006H\u0016J\t\u0010e\u001a\u00020\u0004HÆ\u0003J\t\u0010f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010h\u001a\u00020W2\b\u0010i\u001a\u0004\u0018\u00010jHÖ\u0003J\t\u0010k\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001a\u0010\"\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010%\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\u001a\u0010(\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001a\u0010+\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018R\u001a\u0010.\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R \u00101\u001a\b\u0012\u0004\u0012\u00020302X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u00108\u001a\b\u0012\u0004\u0012\u00020302X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00105\"\u0004\b:\u00107R \u0010;\u001a\b\u0012\u0004\u0012\u00020302X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00105\"\u0004\b=\u00107R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010D\u001a\u0004\u0018\u00010EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010J\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010P\u001a\u0004\u0018\u00010QX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006l"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/DailyBloodPressureReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "Lcom/xiaomi/fitness/health/todayhealth/model/IBloodPressureData;", "time", "", "tag", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "avgHighPressure", "", "getAvgHighPressure", "()I", "setAvgHighPressure", "(I)V", "maxHighPressure", "getMaxHighPressure", "setMaxHighPressure", "minHighPressure", "getMinHighPressure", "setMinHighPressure", "avgLowPressure", "getAvgLowPressure", "setAvgLowPressure", "maxLowPressure", "getMaxLowPressure", "setMaxLowPressure", "minLowPressure", "getMinLowPressure", "setMinLowPressure", "avgPulse", "getAvgPulse", "setAvgPulse", "maxPulse", "getMaxPulse", "setMaxPulse", "minPulse", "getMinPulse", "setMinPulse", "highPressureRecords", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "getHighPressureRecords", "()Ljava/util/List;", "setHighPressureRecords", "(Ljava/util/List;)V", "lowPressureRecords", "getLowPressureRecords", "setLowPressureRecords", "pulseRecords", "getPulseRecords", "setPulseRecords", "latestBloodPressureItem", "Lcom/xiaomi/fitness/health/todayhealth/model/BloodPressureItem;", "getLatestBloodPressureItem", "()Lcom/xiaomi/fitness/health/todayhealth/model/BloodPressureItem;", "setLatestBloodPressureItem", "(Lcom/xiaomi/fitness/health/todayhealth/model/BloodPressureItem;)V", "dailyAmbulatoryBloodPressureReport", "Lcom/xiaomi/fitness/health/todayhealth/model/DailyAmbulatoryBloodPressureReport;", "getDailyAmbulatoryBloodPressureReport", "()Lcom/xiaomi/fitness/health/todayhealth/model/DailyAmbulatoryBloodPressureReport;", "setDailyAmbulatoryBloodPressureReport", "(Lcom/xiaomi/fitness/health/todayhealth/model/DailyAmbulatoryBloodPressureReport;)V", "latestAmbulatoryBloodPressureItem", "Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureItem;", "getLatestAmbulatoryBloodPressureItem", "()Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureItem;", "setLatestAmbulatoryBloodPressureItem", "(Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureItem;)V", "latestDynamicBloodPressureItem", "Lcom/xiaomi/fit/fitness/export/data/item/DynamicBloodPressureItem;", "getLatestDynamicBloodPressureItem", "()Lcom/xiaomi/fit/fitness/export/data/item/DynamicBloodPressureItem;", "setLatestDynamicBloodPressureItem", "(Lcom/xiaomi/fit/fitness/export/data/item/DynamicBloodPressureItem;)V", "isEmpty", "", "updateMaxMinAvg", "", "avgHighBp", "maxHighBp", "minHighBp", "avgLowBp", "maxLowBp", "minLowBp", "updateChartHelpList", "highTimesList", "lowTimesList", "pulseTimesList", "toString", "component1", "component2", "copy", "equals", "other", "", "hashCode", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyBloodPressureReport extends DailyBasicReport implements IBloodPressureData {
    private int avgHighPressure;
    private int avgLowPressure;
    private int avgPulse;

    @Nullable
    private DailyAmbulatoryBloodPressureReport dailyAmbulatoryBloodPressureReport;

    @NotNull
    private List<TimesDataRecordInt> highPressureRecords;

    @Nullable
    private AmbulatoryBloodPressureItem latestAmbulatoryBloodPressureItem;

    @Nullable
    private BloodPressureItem latestBloodPressureItem;

    @Nullable
    private DynamicBloodPressureItem latestDynamicBloodPressureItem;

    @NotNull
    private List<TimesDataRecordInt> lowPressureRecords;
    private int maxHighPressure;
    private int maxLowPressure;
    private int maxPulse;
    private int minHighPressure;
    private int minLowPressure;
    private int minPulse;

    @NotNull
    private List<TimesDataRecordInt> pulseRecords;

    @Nullable
    private String sid;

    @NotNull
    private final String tag;
    private long time;

    public DailyBloodPressureReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.time = j;
        this.tag = tag;
        this.sid = "default";
        this.highPressureRecords = new ArrayList();
        this.lowPressureRecords = new ArrayList();
        this.pulseRecords = new ArrayList();
    }

    public static /* synthetic */ DailyBloodPressureReport copy$default(DailyBloodPressureReport dailyBloodPressureReport, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyBloodPressureReport.time;
        }
        if ((i & 2) != 0) {
            str = dailyBloodPressureReport.tag;
        }
        return dailyBloodPressureReport.copy(j, str);
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
    public final DailyBloodPressureReport copy(long time, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new DailyBloodPressureReport(time, tag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyBloodPressureReport)) {
            return false;
        }
        DailyBloodPressureReport dailyBloodPressureReport = (DailyBloodPressureReport) other;
        return this.time == dailyBloodPressureReport.time && Intrinsics.areEqual(this.tag, dailyBloodPressureReport.tag);
    }

    public final int getAvgHighPressure() {
        return this.avgHighPressure;
    }

    public final int getAvgLowPressure() {
        return this.avgLowPressure;
    }

    public final int getAvgPulse() {
        return this.avgPulse;
    }

    @Nullable
    public final DailyAmbulatoryBloodPressureReport getDailyAmbulatoryBloodPressureReport() {
        return this.dailyAmbulatoryBloodPressureReport;
    }

    @NotNull
    public final List<TimesDataRecordInt> getHighPressureRecords() {
        return this.highPressureRecords;
    }

    @Nullable
    public final AmbulatoryBloodPressureItem getLatestAmbulatoryBloodPressureItem() {
        return this.latestAmbulatoryBloodPressureItem;
    }

    @Nullable
    public final BloodPressureItem getLatestBloodPressureItem() {
        return this.latestBloodPressureItem;
    }

    @Nullable
    public final DynamicBloodPressureItem getLatestDynamicBloodPressureItem() {
        return this.latestDynamicBloodPressureItem;
    }

    @NotNull
    public final List<TimesDataRecordInt> getLowPressureRecords() {
        return this.lowPressureRecords;
    }

    public final int getMaxHighPressure() {
        return this.maxHighPressure;
    }

    public final int getMaxLowPressure() {
        return this.maxLowPressure;
    }

    public final int getMaxPulse() {
        return this.maxPulse;
    }

    public final int getMinHighPressure() {
        return this.minHighPressure;
    }

    public final int getMinLowPressure() {
        return this.minLowPressure;
    }

    public final int getMinPulse() {
        return this.minPulse;
    }

    @NotNull
    public final List<TimesDataRecordInt> getPulseRecords() {
        return this.pulseRecords;
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
        return this.highPressureRecords.isEmpty() && this.lowPressureRecords.isEmpty() && this.pulseRecords.isEmpty() && this.dailyAmbulatoryBloodPressureReport == null;
    }

    public final void setAvgHighPressure(int i) {
        this.avgHighPressure = i;
    }

    public final void setAvgLowPressure(int i) {
        this.avgLowPressure = i;
    }

    public final void setAvgPulse(int i) {
        this.avgPulse = i;
    }

    public final void setDailyAmbulatoryBloodPressureReport(@Nullable DailyAmbulatoryBloodPressureReport dailyAmbulatoryBloodPressureReport) {
        this.dailyAmbulatoryBloodPressureReport = dailyAmbulatoryBloodPressureReport;
    }

    public final void setHighPressureRecords(@NotNull List<TimesDataRecordInt> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.highPressureRecords = list;
    }

    public final void setLatestAmbulatoryBloodPressureItem(@Nullable AmbulatoryBloodPressureItem ambulatoryBloodPressureItem) {
        this.latestAmbulatoryBloodPressureItem = ambulatoryBloodPressureItem;
    }

    public final void setLatestBloodPressureItem(@Nullable BloodPressureItem bloodPressureItem) {
        this.latestBloodPressureItem = bloodPressureItem;
    }

    public final void setLatestDynamicBloodPressureItem(@Nullable DynamicBloodPressureItem dynamicBloodPressureItem) {
        this.latestDynamicBloodPressureItem = dynamicBloodPressureItem;
    }

    public final void setLowPressureRecords(@NotNull List<TimesDataRecordInt> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.lowPressureRecords = list;
    }

    public final void setMaxHighPressure(int i) {
        this.maxHighPressure = i;
    }

    public final void setMaxLowPressure(int i) {
        this.maxLowPressure = i;
    }

    public final void setMaxPulse(int i) {
        this.maxPulse = i;
    }

    public final void setMinHighPressure(int i) {
        this.minHighPressure = i;
    }

    public final void setMinLowPressure(int i) {
        this.minLowPressure = i;
    }

    public final void setMinPulse(int i) {
        this.minPulse = i;
    }

    public final void setPulseRecords(@NotNull List<TimesDataRecordInt> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.pulseRecords = list;
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
        return "DailyBloodPressureReport(time=" + getTime() + ", tag='" + getTag() + "', sid=" + getSid() + ", avgHighPressure=" + this.avgHighPressure + ", maxHighPressure=" + this.maxHighPressure + ", minHighPressure=" + this.minHighPressure + ", avgLowPressure=" + this.avgLowPressure + ", maxLowPressure=" + this.maxLowPressure + ", minLowPressure=" + this.minLowPressure + ", avgPulse=" + this.avgPulse + ", maxPulse=" + this.maxPulse + ", minPulse=" + this.minPulse + ", highPressureRecords=" + this.highPressureRecords + ", lowPressureRecords=" + this.lowPressureRecords + ", pulseRecords=" + this.pulseRecords + ", dailyAmbulatoryBloodPressureReport=" + this.dailyAmbulatoryBloodPressureReport + ", latestBloodPressureItem=" + this.latestBloodPressureItem + "latestAmbulatoryBloodPressureItem=" + this.latestAmbulatoryBloodPressureItem;
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
    public void updateMaxMinAvg(int avgHighBp, int maxHighBp, int minHighBp, int avgLowBp, int maxLowBp, int minLowBp, int avgPulse, int maxPulse, int minPulse) {
        this.avgHighPressure = avgHighBp;
        this.maxHighPressure = maxHighBp;
        this.minHighPressure = minHighBp;
        this.avgLowPressure = avgLowBp;
        this.maxLowPressure = maxLowBp;
        this.minLowPressure = minLowBp;
        this.avgPulse = avgPulse;
        this.maxPulse = maxPulse;
        this.minPulse = minPulse;
    }
}
