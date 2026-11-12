package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0016J\u0006\u00105\u001a\u00020\bJ\b\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020\u0005H\u0016J\b\u00109\u001a\u00020\u0005H\u0016J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010HÆ\u0003J\u008f\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010HÆ\u0001J\u0013\u0010G\u001a\u0002072\b\u0010H\u001a\u0004\u0018\u00010IHÖ\u0003J\t\u0010J\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001c\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u001c\u0010+\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010)\"\u0004\b3\u00104¨\u0006K"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "sid", "avgStress", "", "maxStress", "minStress", "durationHeavyStress", "durationMediumStress", "durationLightStress", "durationRelaxStress", "stressRecords", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "singleStressRecords", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "<init>", "(JLjava/lang/String;Ljava/lang/String;IIIIIIILjava/util/List;Ljava/util/List;)V", "(JLjava/lang/String;Ljava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "getSid", "setSid", "(Ljava/lang/String;)V", "getAvgStress", "()I", "getMaxStress", "getMinStress", "getDurationHeavyStress", "getDurationMediumStress", "getDurationLightStress", "getDurationRelaxStress", "getStressRecords", "()Ljava/util/List;", "getSingleStressRecords", "latestStressRecord", "getLatestStressRecord", "()Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "setLatestStressRecord", "(Lcom/xiaomi/fit/fitness/export/data/item/StressItem;)V", "abnormalStressRecords", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "getAbnormalStressRecords", "setAbnormalStressRecords", "(Ljava/util/List;)V", "totalStressDuration", "isEmpty", "", "simpleInfo", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyStressReport extends DailyBasicReport {

    /* JADX INFO: renamed from: abnormalStressRecords, reason: from kotlin metadata and from toString */
    @Nullable
    private List<SegmentItem> abnormalRecords;
    private final int avgStress;

    /* JADX INFO: renamed from: durationHeavyStress, reason: from kotlin metadata and from toString */
    private final int heavy;

    /* JADX INFO: renamed from: durationLightStress, reason: from kotlin metadata and from toString */
    private final int light;

    /* JADX INFO: renamed from: durationMediumStress, reason: from kotlin metadata and from toString */
    private final int medium;

    /* JADX INFO: renamed from: durationRelaxStress, reason: from kotlin metadata and from toString */
    private final int relax;

    @Nullable
    private StressItem latestStressRecord;
    private final int maxStress;
    private final int minStress;

    @Nullable
    private String sid;

    /* JADX INFO: renamed from: singleStressRecords, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<StressItem> singleRecords;

    @NotNull
    private final List<TimesDataRecordInt> stressRecords;

    @NotNull
    private final String tag;
    private long time;

    public DailyStressReport(long j, @NotNull String tag, @Nullable String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, @NotNull List<TimesDataRecordInt> stressRecords, @NotNull List<StressItem> singleStressRecords) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stressRecords, "stressRecords");
        Intrinsics.checkNotNullParameter(singleStressRecords, "singleStressRecords");
        this.time = j;
        this.tag = tag;
        this.sid = str;
        this.avgStress = i;
        this.maxStress = i2;
        this.minStress = i3;
        this.heavy = i4;
        this.medium = i5;
        this.light = i6;
        this.relax = i7;
        this.stressRecords = stressRecords;
        this.singleRecords = singleStressRecords;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getRelax() {
        return this.relax;
    }

    @NotNull
    public final List<TimesDataRecordInt> component11() {
        return this.stressRecords;
    }

    @NotNull
    public final List<StressItem> component12() {
        return this.singleRecords;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAvgStress() {
        return this.avgStress;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxStress() {
        return this.maxStress;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMinStress() {
        return this.minStress;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getHeavy() {
        return this.heavy;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMedium() {
        return this.medium;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getLight() {
        return this.light;
    }

    @NotNull
    public final DailyStressReport copy(long time, @NotNull String tag, @Nullable String sid, int avgStress, int maxStress, int minStress, int durationHeavyStress, int durationMediumStress, int durationLightStress, int durationRelaxStress, @NotNull List<TimesDataRecordInt> stressRecords, @NotNull List<StressItem> singleStressRecords) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stressRecords, "stressRecords");
        Intrinsics.checkNotNullParameter(singleStressRecords, "singleStressRecords");
        return new DailyStressReport(time, tag, sid, avgStress, maxStress, minStress, durationHeavyStress, durationMediumStress, durationLightStress, durationRelaxStress, stressRecords, singleStressRecords);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyStressReport)) {
            return false;
        }
        DailyStressReport dailyStressReport = (DailyStressReport) other;
        return this.time == dailyStressReport.time && Intrinsics.areEqual(this.tag, dailyStressReport.tag) && Intrinsics.areEqual(this.sid, dailyStressReport.sid) && this.avgStress == dailyStressReport.avgStress && this.maxStress == dailyStressReport.maxStress && this.minStress == dailyStressReport.minStress && this.heavy == dailyStressReport.heavy && this.medium == dailyStressReport.medium && this.light == dailyStressReport.light && this.relax == dailyStressReport.relax && Intrinsics.areEqual(this.stressRecords, dailyStressReport.stressRecords) && Intrinsics.areEqual(this.singleRecords, dailyStressReport.singleRecords);
    }

    @Nullable
    public final List<SegmentItem> getAbnormalStressRecords() {
        return this.abnormalRecords;
    }

    public final int getAvgStress() {
        return this.avgStress;
    }

    public final int getDurationHeavyStress() {
        return this.heavy;
    }

    public final int getDurationLightStress() {
        return this.light;
    }

    public final int getDurationMediumStress() {
        return this.medium;
    }

    public final int getDurationRelaxStress() {
        return this.relax;
    }

    @Nullable
    public final StressItem getLatestStressRecord() {
        return this.latestStressRecord;
    }

    public final int getMaxStress() {
        return this.maxStress;
    }

    public final int getMinStress() {
        return this.minStress;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @NotNull
    public final List<StressItem> getSingleStressRecords() {
        return this.singleRecords;
    }

    @NotNull
    public final List<TimesDataRecordInt> getStressRecords() {
        return this.stressRecords;
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
        int iHashCode = ((Long.hashCode(this.time) * 31) + this.tag.hashCode()) * 31;
        String str = this.sid;
        return ((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.avgStress)) * 31) + Integer.hashCode(this.maxStress)) * 31) + Integer.hashCode(this.minStress)) * 31) + Integer.hashCode(this.heavy)) * 31) + Integer.hashCode(this.medium)) * 31) + Integer.hashCode(this.light)) * 31) + Integer.hashCode(this.relax)) * 31) + this.stressRecords.hashCode()) * 31) + this.singleRecords.hashCode();
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        List<StressItem> list;
        List<TimesDataRecordInt> list2 = this.stressRecords;
        return (list2 == null || list2.isEmpty()) && ((list = this.singleRecords) == null || list.isEmpty());
    }

    public final void setAbnormalStressRecords(@Nullable List<SegmentItem> list) {
        this.abnormalRecords = list;
    }

    public final void setLatestStressRecord(@Nullable StressItem stressItem) {
        this.latestStressRecord = stressItem;
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
        return "DailyStressReport[time=" + getTime() + ", sid='" + getSid() + "', avgStress=" + this.avgStress + ", maxStress=" + this.maxStress + ", minStress=" + this.minStress + "]";
    }

    @NotNull
    public String toString() {
        return "DailyStressReport(time=" + getTime() + ",time=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(getTime() * ((long) 1000))) + ", tag='" + getTag() + "', sid='" + getSid() + "', avgStress=" + this.avgStress + ", maxStress=" + this.maxStress + ", minStress=" + this.minStress + ", heavy=" + this.heavy + ", medium=" + this.medium + ", light=" + this.light + ", relax=" + this.relax + ", latestStressRecord=" + this.latestStressRecord + ", singleRecords=" + this.singleRecords + ", abnormalRecords=" + this.abnormalRecords + ", stressRecords=" + this.stressRecords + ")";
    }

    public final int totalStressDuration() {
        return this.heavy + this.medium + this.light + this.relax;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DailyStressReport(long j, @NotNull String tag, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
        List listEmptyList2 = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList2, "emptyList(...)");
        this(j, tag, str, 0, 0, 0, 0, 0, 0, 0, listEmptyList, listEmptyList2);
    }
}
