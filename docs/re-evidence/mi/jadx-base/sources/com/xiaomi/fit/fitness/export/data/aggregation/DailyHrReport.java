package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.distribute.DailyHrDistribute;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0016J\b\u0010e\u001a\u000205H\u0016J\u0006\u0010f\u001a\u00020\u0007J\b\u0010g\u001a\u00020\u0005H\u0016J\b\u0010h\u001a\u00020\u0005H\u0016J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0005HÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010l\u001a\u00020\u0007HÆ\u0003J\t\u0010m\u001a\u00020\u0007HÆ\u0003J\t\u0010n\u001a\u00020\u0007HÆ\u0003J\u000f\u0010o\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u0011\u0010p\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fHÆ\u0003J\u0011\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fHÆ\u0003J\u0092\u0001\u0010s\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010tJ\u0013\u0010u\u001a\u0002052\b\u0010v\u001a\u0004\u0018\u00010wHÖ\u0003J\t\u0010x\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\u001a\u00104\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R\u001c\u0010=\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001c\"\u0004\b?\u0010@R\u001c\u0010A\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010F\u001a\u0004\u0018\u00010GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010L\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010+\"\u0004\bO\u0010-R\"\u0010P\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010+\"\u0004\bR\u0010-R\u001e\u0010S\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\bT\u0010\u001e\"\u0004\bU\u0010 R\"\u0010V\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010+\"\u0004\bX\u0010-R\u001e\u0010Y\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\bZ\u0010\u001e\"\u0004\b[\u0010 R\"\u0010\\\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010+\"\u0004\b^\u0010-R\u001c\u0010_\u001a\u0004\u0018\u00010`X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d¨\u0006y"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "restHr", "", "avgHr", "maxHr", "minHr", "hrRecords", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "singleHrRecords", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "abnormalHrRecords", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalHrItem;", "abnormalFibRecords", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "<init>", "(JLjava/lang/String;Ljava/lang/Integer;IIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "getRestHr", "()Ljava/lang/Integer;", "setRestHr", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAvgHr", "()I", "setAvgHr", "(I)V", "getMaxHr", "setMaxHr", "getMinHr", "setMinHr", "getHrRecords", "()Ljava/util/List;", "setHrRecords", "(Ljava/util/List;)V", "getSingleHrRecords", "setSingleHrRecords", "getAbnormalHrRecords", "setAbnormalHrRecords", "getAbnormalFibRecords", "setAbnormalFibRecords", "hasHistoryAbFib", "", "getHasHistoryAbFib", "()Z", "setHasHistoryAbFib", "(Z)V", "hrReportList", "getHrReportList", "setHrReportList", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "latestHrRecord", "getLatestHrRecord", "()Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "setLatestHrRecord", "(Lcom/xiaomi/fit/fitness/export/data/item/HrItem;)V", "hrDistribute", "Lcom/xiaomi/fit/fitness/export/data/distribute/DailyHrDistribute;", "getHrDistribute", "()Lcom/xiaomi/fit/fitness/export/data/distribute/DailyHrDistribute;", "setHrDistribute", "(Lcom/xiaomi/fit/fitness/export/data/distribute/DailyHrDistribute;)V", "abnormalHrHighRecords", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "getAbnormalHrHighRecords", "setAbnormalHrHighRecords", "abnormalHrLowRecords", "getAbnormalHrLowRecords", "setAbnormalHrLowRecords", "stepAvgHr", "getStepAvgHr", "setStepAvgHr", "stepHrRecords", "getStepHrRecords", "setStepHrRecords", "sleepAvgHr", "getSleepAvgHr", "setSleepAvgHr", "sleepAvgHrRecords", "getSleepAvgHrRecords", "setSleepAvgHrRecords", "sleepReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "getSleepReport", "()Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "setSleepReport", "(Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)V", "isEmpty", "getFibDuration", "simpleInfo", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(JLjava/lang/String;Ljava/lang/Integer;IIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "equals", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDailyHrReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyHrReport.kt\ncom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1863#2,2:110\n*S KotlinDebug\n*F\n+ 1 DailyHrReport.kt\ncom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport\n*L\n73#1:110,2\n*E\n"})
public final /* data */ class DailyHrReport extends DailyBasicReport {

    @Nullable
    private List<AbnormalFibItem> abnormalFibRecords;

    /* JADX INFO: renamed from: abnormalHrHighRecords, reason: from kotlin metadata and from toString */
    @Nullable
    private List<SegmentItem> abnormalHigh;

    /* JADX INFO: renamed from: abnormalHrLowRecords, reason: from kotlin metadata and from toString */
    @Nullable
    private List<SegmentItem> abnormalLow;

    @Nullable
    private List<AbnormalHrItem> abnormalHrRecords;
    private int avgHr;
    private transient boolean hasHistoryAbFib;

    @Nullable
    private DailyHrDistribute hrDistribute;

    @NotNull
    private List<TimesDataRecordInt> hrRecords;

    @Nullable
    private transient List<DailyHrReport> hrReportList;

    @Nullable
    private HrItem latestHrRecord;
    private int maxHr;
    private int minHr;

    @Nullable
    private Integer restHr;

    @Nullable
    private String sid;

    @Nullable
    private transient List<HrItem> singleHrRecords;

    @Nullable
    private transient Integer sleepAvgHr;

    @Nullable
    private transient List<TimesDataRecordInt> sleepAvgHrRecords;

    @Nullable
    private transient SleepSegmentReport sleepReport;

    @Nullable
    private Integer stepAvgHr;

    @Nullable
    private List<TimesDataRecordInt> stepHrRecords;

    @NotNull
    private final String tag;
    private long time;

    public /* synthetic */ DailyHrReport(long j, String str, Integer num, int i, int i2, int i3, List list, List list2, List list3, List list4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, num, i, i2, i3, list, (i4 & 128) != 0 ? null : list2, (i4 & 256) != 0 ? null : list3, (i4 & 512) != 0 ? null : list4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final List<AbnormalFibItem> component10() {
        return this.abnormalFibRecords;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getRestHr() {
        return this.restHr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAvgHr() {
        return this.avgHr;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxHr() {
        return this.maxHr;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMinHr() {
        return this.minHr;
    }

    @NotNull
    public final List<TimesDataRecordInt> component7() {
        return this.hrRecords;
    }

    @Nullable
    public final List<HrItem> component8() {
        return this.singleHrRecords;
    }

    @Nullable
    public final List<AbnormalHrItem> component9() {
        return this.abnormalHrRecords;
    }

    @NotNull
    public final DailyHrReport copy(long time, @NotNull String tag, @Nullable Integer restHr, int avgHr, int maxHr, int minHr, @NotNull List<TimesDataRecordInt> hrRecords, @Nullable List<HrItem> singleHrRecords, @Nullable List<AbnormalHrItem> abnormalHrRecords, @Nullable List<AbnormalFibItem> abnormalFibRecords) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(hrRecords, "hrRecords");
        return new DailyHrReport(time, tag, restHr, avgHr, maxHr, minHr, hrRecords, singleHrRecords, abnormalHrRecords, abnormalFibRecords);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyHrReport)) {
            return false;
        }
        DailyHrReport dailyHrReport = (DailyHrReport) other;
        return this.time == dailyHrReport.time && Intrinsics.areEqual(this.tag, dailyHrReport.tag) && Intrinsics.areEqual(this.restHr, dailyHrReport.restHr) && this.avgHr == dailyHrReport.avgHr && this.maxHr == dailyHrReport.maxHr && this.minHr == dailyHrReport.minHr && Intrinsics.areEqual(this.hrRecords, dailyHrReport.hrRecords) && Intrinsics.areEqual(this.singleHrRecords, dailyHrReport.singleHrRecords) && Intrinsics.areEqual(this.abnormalHrRecords, dailyHrReport.abnormalHrRecords) && Intrinsics.areEqual(this.abnormalFibRecords, dailyHrReport.abnormalFibRecords);
    }

    @Nullable
    public final List<AbnormalFibItem> getAbnormalFibRecords() {
        return this.abnormalFibRecords;
    }

    @Nullable
    public final List<SegmentItem> getAbnormalHrHighRecords() {
        return this.abnormalHigh;
    }

    @Nullable
    public final List<SegmentItem> getAbnormalHrLowRecords() {
        return this.abnormalLow;
    }

    @Nullable
    public final List<AbnormalHrItem> getAbnormalHrRecords() {
        return this.abnormalHrRecords;
    }

    public final int getAvgHr() {
        return this.avgHr;
    }

    public final int getFibDuration() {
        List<AbnormalFibItem> list = this.abnormalFibRecords;
        int duration = 0;
        if (list != null && (!list.isEmpty())) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                duration += ((AbnormalFibItem) it.next()).getDuration();
            }
        }
        return duration;
    }

    public final boolean getHasHistoryAbFib() {
        return this.hasHistoryAbFib;
    }

    @Nullable
    public final DailyHrDistribute getHrDistribute() {
        return this.hrDistribute;
    }

    @NotNull
    public final List<TimesDataRecordInt> getHrRecords() {
        return this.hrRecords;
    }

    @Nullable
    public final List<DailyHrReport> getHrReportList() {
        return this.hrReportList;
    }

    @Nullable
    public final HrItem getLatestHrRecord() {
        return this.latestHrRecord;
    }

    public final int getMaxHr() {
        return this.maxHr;
    }

    public final int getMinHr() {
        return this.minHr;
    }

    @Nullable
    public final Integer getRestHr() {
        return this.restHr;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Nullable
    public final List<HrItem> getSingleHrRecords() {
        return this.singleHrRecords;
    }

    @Nullable
    public final Integer getSleepAvgHr() {
        return this.sleepAvgHr;
    }

    @Nullable
    public final List<TimesDataRecordInt> getSleepAvgHrRecords() {
        return this.sleepAvgHrRecords;
    }

    @Nullable
    public final SleepSegmentReport getSleepReport() {
        return this.sleepReport;
    }

    @Nullable
    public final Integer getStepAvgHr() {
        return this.stepAvgHr;
    }

    @Nullable
    public final List<TimesDataRecordInt> getStepHrRecords() {
        return this.stepHrRecords;
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
        Integer num = this.restHr;
        int iHashCode2 = (((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.avgHr)) * 31) + Integer.hashCode(this.maxHr)) * 31) + Integer.hashCode(this.minHr)) * 31) + this.hrRecords.hashCode()) * 31;
        List<HrItem> list = this.singleHrRecords;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<AbnormalHrItem> list2 = this.abnormalHrRecords;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AbnormalFibItem> list3 = this.abnormalFibRecords;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        List<TimesDataRecordInt> list = this.hrRecords;
        return list == null || list.isEmpty();
    }

    public final void setAbnormalFibRecords(@Nullable List<AbnormalFibItem> list) {
        this.abnormalFibRecords = list;
    }

    public final void setAbnormalHrHighRecords(@Nullable List<SegmentItem> list) {
        this.abnormalHigh = list;
    }

    public final void setAbnormalHrLowRecords(@Nullable List<SegmentItem> list) {
        this.abnormalLow = list;
    }

    public final void setAbnormalHrRecords(@Nullable List<AbnormalHrItem> list) {
        this.abnormalHrRecords = list;
    }

    public final void setAvgHr(int i) {
        this.avgHr = i;
    }

    public final void setHasHistoryAbFib(boolean z) {
        this.hasHistoryAbFib = z;
    }

    public final void setHrDistribute(@Nullable DailyHrDistribute dailyHrDistribute) {
        this.hrDistribute = dailyHrDistribute;
    }

    public final void setHrRecords(@NotNull List<TimesDataRecordInt> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.hrRecords = list;
    }

    public final void setHrReportList(@Nullable List<DailyHrReport> list) {
        this.hrReportList = list;
    }

    public final void setLatestHrRecord(@Nullable HrItem hrItem) {
        this.latestHrRecord = hrItem;
    }

    public final void setMaxHr(int i) {
        this.maxHr = i;
    }

    public final void setMinHr(int i) {
        this.minHr = i;
    }

    public final void setRestHr(@Nullable Integer num) {
        this.restHr = num;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setSingleHrRecords(@Nullable List<HrItem> list) {
        this.singleHrRecords = list;
    }

    public final void setSleepAvgHr(@Nullable Integer num) {
        this.sleepAvgHr = num;
    }

    public final void setSleepAvgHrRecords(@Nullable List<TimesDataRecordInt> list) {
        this.sleepAvgHrRecords = list;
    }

    public final void setSleepReport(@Nullable SleepSegmentReport sleepSegmentReport) {
        this.sleepReport = sleepSegmentReport;
    }

    public final void setStepAvgHr(@Nullable Integer num) {
        this.stepAvgHr = num;
    }

    public final void setStepHrRecords(@Nullable List<TimesDataRecordInt> list) {
        this.stepHrRecords = list;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String simpleInfo() {
        return "DailyHrReport[time=" + getTime() + ", restHr=" + this.restHr + ", avgHr=" + this.avgHr + ", maxHr=" + this.maxHr + ", minHr=" + this.minHr + ", latestHrRecord=" + this.latestHrRecord + ", hrDistribute=" + this.hrDistribute + "]";
    }

    @NotNull
    public String toString() {
        return "DailyHrReport(time=" + getTime() + ", time = " + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(getTime() * ((long) 1000))) + ", tag='" + getTag() + "', restHr=" + this.restHr + ", avgHr=" + this.avgHr + ", maxHr=" + this.maxHr + ", minHr=" + this.minHr + ", latestHrRecord=" + this.latestHrRecord + ", hrDistribute=" + this.hrDistribute + ", hrRecords=" + this.hrRecords + ", singleHrRecords=" + this.singleHrRecords + ", abnormalHrRecords=" + this.abnormalHrRecords + ", abnormalHigh=" + this.abnormalHigh + ", abnormalLow=" + this.abnormalLow + ", abnormalFibRecords=" + this.abnormalFibRecords + ")";
    }

    public DailyHrReport(long j, @NotNull String tag, @Nullable Integer num, int i, int i2, int i3, @NotNull List<TimesDataRecordInt> hrRecords, @Nullable List<HrItem> list, @Nullable List<AbnormalHrItem> list2, @Nullable List<AbnormalFibItem> list3) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(hrRecords, "hrRecords");
        this.time = j;
        this.tag = tag;
        this.restHr = num;
        this.avgHr = i;
        this.maxHr = i2;
        this.minHr = i3;
        this.hrRecords = hrRecords;
        this.singleHrRecords = list;
        this.abnormalHrRecords = list2;
        this.abnormalFibRecords = list3;
        this.hasHistoryAbFib = true;
        this.sid = "default";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DailyHrReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
        this(j, tag, 0, 0, 0, 0, listEmptyList, null, null, null);
    }
}
