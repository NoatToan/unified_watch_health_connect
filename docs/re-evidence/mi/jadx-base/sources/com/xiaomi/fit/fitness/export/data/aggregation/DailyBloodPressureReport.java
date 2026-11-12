package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0019J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u0005H\u0016J\b\u0010;\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u001c\u0010/\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u00102R\u001e\u00103\u001a\u0004\u0018\u00010\u00168FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "avgHighPressure", "", "maxHighPressure", "minHighPressure", "avgLowPressure", "maxLowPressure", "minLowPressure", "avgPulse", "maxPulse", "minPulse", "highPressureRecords", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "lowPressureRecords", "pulseRecords", "singlePressureRecords", "Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;", "<init>", "(JLjava/lang/String;IIIIIIIIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "getAvgHighPressure", "()I", "getMaxHighPressure", "getMinHighPressure", "getAvgLowPressure", "getMaxLowPressure", "getMinLowPressure", "getAvgPulse", "getMaxPulse", "getMinPulse", "getHighPressureRecords", "()Ljava/util/List;", "getLowPressureRecords", "getPulseRecords", "getSinglePressureRecords", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "latestRecord", "getLatestRecord", "()Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;", "setLatestRecord", "(Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;)V", "isEmpty", "", "simpleInfo", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDailyBloodPressureReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyBloodPressureReport.kt\ncom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1863#2,2:95\n*S KotlinDebug\n*F\n+ 1 DailyBloodPressureReport.kt\ncom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport\n*L\n44#1:95,2\n*E\n"})
public final class DailyBloodPressureReport extends DailyBasicReport {

    /* JADX INFO: renamed from: avgHighPressure, reason: from kotlin metadata and from toString */
    private final int avgHigh;

    /* JADX INFO: renamed from: avgLowPressure, reason: from kotlin metadata and from toString */
    private final int avgLow;
    private final int avgPulse;

    /* JADX INFO: renamed from: highPressureRecords, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<TimesDataRecordInt> highRecords;

    @Nullable
    private BloodPressureItem latestRecord;

    /* JADX INFO: renamed from: lowPressureRecords, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<TimesDataRecordInt> lowRecords;

    /* JADX INFO: renamed from: maxHighPressure, reason: from kotlin metadata and from toString */
    private final int maxHigh;

    /* JADX INFO: renamed from: maxLowPressure, reason: from kotlin metadata and from toString */
    private final int maxLow;
    private final int maxPulse;

    /* JADX INFO: renamed from: minHighPressure, reason: from kotlin metadata and from toString */
    private final int minHigh;

    /* JADX INFO: renamed from: minLowPressure, reason: from kotlin metadata and from toString */
    private final int minLow;
    private final int minPulse;

    /* JADX INFO: renamed from: pulseRecords, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<TimesDataRecordInt> pulesRecords;

    @Nullable
    private String sid;

    @Nullable
    private final List<BloodPressureItem> singlePressureRecords;

    @NotNull
    private final String tag;
    private long time;

    public DailyBloodPressureReport(long j, @NotNull String tag, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @NotNull List<TimesDataRecordInt> highPressureRecords, @NotNull List<TimesDataRecordInt> lowPressureRecords, @NotNull List<TimesDataRecordInt> pulseRecords, @Nullable List<BloodPressureItem> list) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(highPressureRecords, "highPressureRecords");
        Intrinsics.checkNotNullParameter(lowPressureRecords, "lowPressureRecords");
        Intrinsics.checkNotNullParameter(pulseRecords, "pulseRecords");
        this.time = j;
        this.tag = tag;
        this.avgHigh = i;
        this.maxHigh = i2;
        this.minHigh = i3;
        this.avgLow = i4;
        this.maxLow = i5;
        this.minLow = i6;
        this.avgPulse = i7;
        this.maxPulse = i8;
        this.minPulse = i9;
        this.highRecords = highPressureRecords;
        this.lowRecords = lowPressureRecords;
        this.pulesRecords = pulseRecords;
        this.singlePressureRecords = list;
        this.sid = "default";
    }

    /* JADX INFO: renamed from: getAvgHighPressure, reason: from getter */
    public final int getAvgHigh() {
        return this.avgHigh;
    }

    /* JADX INFO: renamed from: getAvgLowPressure, reason: from getter */
    public final int getAvgLow() {
        return this.avgLow;
    }

    public final int getAvgPulse() {
        return this.avgPulse;
    }

    @NotNull
    public final List<TimesDataRecordInt> getHighPressureRecords() {
        return this.highRecords;
    }

    @Nullable
    public final BloodPressureItem getLatestRecord() {
        BloodPressureItem bloodPressureItem = this.latestRecord;
        if (bloodPressureItem != null) {
            return bloodPressureItem;
        }
        List<BloodPressureItem> list = this.singlePressureRecords;
        BloodPressureItem bloodPressureItem2 = null;
        if (list != null) {
            long time = Long.MIN_VALUE;
            for (BloodPressureItem bloodPressureItem3 : list) {
                if (time < bloodPressureItem3.getTime()) {
                    time = bloodPressureItem3.getTime();
                    bloodPressureItem2 = bloodPressureItem3;
                }
            }
        }
        return bloodPressureItem2;
    }

    @NotNull
    public final List<TimesDataRecordInt> getLowPressureRecords() {
        return this.lowRecords;
    }

    /* JADX INFO: renamed from: getMaxHighPressure, reason: from getter */
    public final int getMaxHigh() {
        return this.maxHigh;
    }

    /* JADX INFO: renamed from: getMaxLowPressure, reason: from getter */
    public final int getMaxLow() {
        return this.maxLow;
    }

    public final int getMaxPulse() {
        return this.maxPulse;
    }

    /* JADX INFO: renamed from: getMinHighPressure, reason: from getter */
    public final int getMinHigh() {
        return this.minHigh;
    }

    /* JADX INFO: renamed from: getMinLowPressure, reason: from getter */
    public final int getMinLow() {
        return this.minLow;
    }

    public final int getMinPulse() {
        return this.minPulse;
    }

    @NotNull
    public final List<TimesDataRecordInt> getPulseRecords() {
        return this.pulesRecords;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Nullable
    public final List<BloodPressureItem> getSinglePressureRecords() {
        return this.singlePressureRecords;
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

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        List<TimesDataRecordInt> list;
        List<BloodPressureItem> list2;
        List<TimesDataRecordInt> list3 = this.highRecords;
        return list3 == null || list3.isEmpty() || (list = this.lowRecords) == null || list.isEmpty() || (list2 = this.singlePressureRecords) == null || list2.isEmpty();
    }

    public final void setLatestRecord(@Nullable BloodPressureItem bloodPressureItem) {
        this.latestRecord = bloodPressureItem;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String simpleInfo() {
        return "DailyBloodPressureReport[time=" + getTime() + ", avgHigh=" + this.avgHigh + ", maxHigh=" + this.maxHigh + ", minHigh=" + this.minHigh + ", avgLow=" + this.avgLow + ", maxLow=" + this.maxLow + ", minLow=" + this.minLow + "]";
    }

    @NotNull
    public String toString() {
        return "DailyBloodPressureReport(time=" + getTime() + ", time = " + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(getTime() * ((long) 1000))) + ", tag='" + getTag() + "', avgHigh=" + this.avgHigh + ", maxHigh=" + this.maxHigh + ", minHigh=" + this.minHigh + ", avgLow=" + this.avgLow + ", maxLow=" + this.maxLow + ", minLow=" + this.minLow + ", highRecords=" + this.highRecords + ", lowRecords=" + this.lowRecords + ", pulesRecords=" + this.pulesRecords + ",singleRecords=" + this.singlePressureRecords + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DailyBloodPressureReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
        List listEmptyList2 = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList2, "emptyList(...)");
        List listEmptyList3 = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList3, "emptyList(...)");
        this(j, tag, 0, 0, 0, 0, 0, 0, 0, 0, 0, listEmptyList, listEmptyList2, listEmptyList3, null);
    }
}
