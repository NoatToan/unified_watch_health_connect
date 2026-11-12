package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0010J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\u0005H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JU\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010?\u001a\u0002042\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010(R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006C"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", FitnessReportKey.avgSpo2, "", FitnessReportKey.maxSpo2, FitnessReportKey.minSpo2, "lackTimes", "spo2Records", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "<init>", "(JLjava/lang/String;IIIILjava/util/List;)V", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "getAvgSpo2", "()I", "setAvgSpo2", "(I)V", "getMaxSpo2", "setMaxSpo2", "getMinSpo2", "setMinSpo2", "getLackTimes", "setLackTimes", "getSpo2Records", "()Ljava/util/List;", "setSpo2Records", "(Ljava/util/List;)V", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "abnormalSpo2Records", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "getAbnormalSpo2Records", "setAbnormalSpo2Records", "latestSpoRecord", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "getLatestSpoRecord", "()Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "setLatestSpoRecord", "(Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;)V", "isEmpty", "", "simpleInfo", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailySpo2Report extends DailyBasicReport {

    /* JADX INFO: renamed from: abnormalSpo2Records, reason: from kotlin metadata and from toString */
    @Nullable
    private List<SegmentItem> abnormalRecords;
    private int avgSpo2;
    private int lackTimes;

    @Nullable
    private Spo2Item latestSpoRecord;
    private int maxSpo2;
    private int minSpo2;

    @Nullable
    private String sid;

    @NotNull
    private List<TimesDataRecordInt> spo2Records;

    @NotNull
    private final String tag;
    private long time;

    public DailySpo2Report(long j, @NotNull String tag, int i, int i2, int i3, int i4, @NotNull List<TimesDataRecordInt> spo2Records) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(spo2Records, "spo2Records");
        this.time = j;
        this.tag = tag;
        this.avgSpo2 = i;
        this.maxSpo2 = i2;
        this.minSpo2 = i3;
        this.lackTimes = i4;
        this.spo2Records = spo2Records;
        this.sid = "default";
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

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAvgSpo2() {
        return this.avgSpo2;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxSpo2() {
        return this.maxSpo2;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMinSpo2() {
        return this.minSpo2;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getLackTimes() {
        return this.lackTimes;
    }

    @NotNull
    public final List<TimesDataRecordInt> component7() {
        return this.spo2Records;
    }

    @NotNull
    public final DailySpo2Report copy(long time, @NotNull String tag, int avgSpo2, int maxSpo2, int minSpo2, int lackTimes, @NotNull List<TimesDataRecordInt> spo2Records) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(spo2Records, "spo2Records");
        return new DailySpo2Report(time, tag, avgSpo2, maxSpo2, minSpo2, lackTimes, spo2Records);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailySpo2Report)) {
            return false;
        }
        DailySpo2Report dailySpo2Report = (DailySpo2Report) other;
        return this.time == dailySpo2Report.time && Intrinsics.areEqual(this.tag, dailySpo2Report.tag) && this.avgSpo2 == dailySpo2Report.avgSpo2 && this.maxSpo2 == dailySpo2Report.maxSpo2 && this.minSpo2 == dailySpo2Report.minSpo2 && this.lackTimes == dailySpo2Report.lackTimes && Intrinsics.areEqual(this.spo2Records, dailySpo2Report.spo2Records);
    }

    @Nullable
    public final List<SegmentItem> getAbnormalSpo2Records() {
        return this.abnormalRecords;
    }

    public final int getAvgSpo2() {
        return this.avgSpo2;
    }

    public final int getLackTimes() {
        return this.lackTimes;
    }

    @Nullable
    public final Spo2Item getLatestSpoRecord() {
        return this.latestSpoRecord;
    }

    public final int getMaxSpo2() {
        return this.maxSpo2;
    }

    public final int getMinSpo2() {
        return this.minSpo2;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @NotNull
    public final List<TimesDataRecordInt> getSpo2Records() {
        return this.spo2Records;
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
        return (((((((((((Long.hashCode(this.time) * 31) + this.tag.hashCode()) * 31) + Integer.hashCode(this.avgSpo2)) * 31) + Integer.hashCode(this.maxSpo2)) * 31) + Integer.hashCode(this.minSpo2)) * 31) + Integer.hashCode(this.lackTimes)) * 31) + this.spo2Records.hashCode();
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        List<TimesDataRecordInt> list = this.spo2Records;
        return list == null || list.isEmpty();
    }

    public final void setAbnormalSpo2Records(@Nullable List<SegmentItem> list) {
        this.abnormalRecords = list;
    }

    public final void setAvgSpo2(int i) {
        this.avgSpo2 = i;
    }

    public final void setLackTimes(int i) {
        this.lackTimes = i;
    }

    public final void setLatestSpoRecord(@Nullable Spo2Item spo2Item) {
        this.latestSpoRecord = spo2Item;
    }

    public final void setMaxSpo2(int i) {
        this.maxSpo2 = i;
    }

    public final void setMinSpo2(int i) {
        this.minSpo2 = i;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setSpo2Records(@NotNull List<TimesDataRecordInt> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.spo2Records = list;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String simpleInfo() {
        return "DailySpo2Report[time=" + getTime() + ", avgSpo2=" + this.avgSpo2 + ", maxSpo2=" + this.maxSpo2 + ", minSpo2=" + this.minSpo2 + ", lackTimes=" + this.lackTimes + "]";
    }

    @NotNull
    public String toString() {
        return "DailySpo2Report(time=" + getTime() + ", time=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(getTime() * ((long) 1000))) + ", tag='" + getTag() + "', avgSpo2=" + this.avgSpo2 + ", maxSpo2=" + this.maxSpo2 + ", minSpo2=" + this.minSpo2 + ", lackTimes=" + this.lackTimes + ", spo2Records=" + this.spo2Records + ", abnormalRecords=" + this.abnormalRecords + ", latestSpoRecord=" + this.latestSpoRecord + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DailySpo2Report(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
        this(j, tag, 0, 0, 0, 0, listEmptyList);
    }
}
