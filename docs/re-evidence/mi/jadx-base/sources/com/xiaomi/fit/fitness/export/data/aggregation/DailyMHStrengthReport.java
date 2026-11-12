package com.xiaomi.fit.fitness.export.data.aggregation;

import android.text.TextUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.record.MHStrengthRecord;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000eJ\u0006\u0010&\u001a\u00020\u000bJ\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u000bH\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u0006H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\t\u0010-\u001a\u00020\u0004HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J7\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u00102\u001a\u00020(2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!¨\u00066"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/IRainbowSourceData;", "time", "", "tag", "", "recordList", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/MHStrengthRecord;", "duration", "", "<init>", "(JLjava/lang/String;Ljava/util/List;I)V", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "getRecordList", "()Ljava/util/List;", "getDuration", "()I", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "minStartTime", "getMinStartTime", "()Ljava/lang/Long;", "setMinStartTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "maxEndTime", "getMaxEndTime", "setMaxEndTime", "getAvgStrengthPerDay", "isEmpty", "", "getSourceData", "isValidate", "simpleInfo", "toString", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyMHStrengthReport extends DailyBasicReport implements IRainbowSourceData {
    private final int duration;

    @Nullable
    private Long maxEndTime;

    @Nullable
    private Long minStartTime;

    @NotNull
    private final List<MHStrengthRecord> recordList;

    @Nullable
    private String sid;

    @NotNull
    private final String tag;
    private long time;

    public DailyMHStrengthReport(long j, @NotNull String tag, @NotNull List<MHStrengthRecord> recordList, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        this.time = j;
        this.tag = tag;
        this.recordList = recordList;
        this.duration = i;
        this.sid = "default";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DailyMHStrengthReport copy$default(DailyMHStrengthReport dailyMHStrengthReport, long j, String str, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = dailyMHStrengthReport.time;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = dailyMHStrengthReport.tag;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            list = dailyMHStrengthReport.recordList;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            i = dailyMHStrengthReport.duration;
        }
        return dailyMHStrengthReport.copy(j2, str2, list2, i);
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
    public final List<MHStrengthRecord> component3() {
        return this.recordList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final DailyMHStrengthReport copy(long time, @NotNull String tag, @NotNull List<MHStrengthRecord> recordList, int duration) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        return new DailyMHStrengthReport(time, tag, recordList, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyMHStrengthReport)) {
            return false;
        }
        DailyMHStrengthReport dailyMHStrengthReport = (DailyMHStrengthReport) other;
        return this.time == dailyMHStrengthReport.time && Intrinsics.areEqual(this.tag, dailyMHStrengthReport.tag) && Intrinsics.areEqual(this.recordList, dailyMHStrengthReport.recordList) && this.duration == dailyMHStrengthReport.duration;
    }

    public final int getAvgStrengthPerDay() {
        List<MHStrengthRecord> list;
        return (TextUtils.equals(getTag(), "days") || (list = this.recordList) == null || list.isEmpty()) ? this.duration : MathKt__MathJVMKt.roundToInt((this.duration * 1.0f) / this.recordList.size());
    }

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final Long getMaxEndTime() {
        return this.maxEndTime;
    }

    @Nullable
    public final Long getMinStartTime() {
        return this.minStartTime;
    }

    @NotNull
    public final List<MHStrengthRecord> getRecordList() {
        return this.recordList;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.IRainbowSourceData
    public int getSourceData() {
        return this.duration;
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
        return (((((Long.hashCode(this.time) * 31) + this.tag.hashCode()) * 31) + this.recordList.hashCode()) * 31) + Integer.hashCode(this.duration);
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        List<MHStrengthRecord> list = this.recordList;
        return list == null || list.isEmpty();
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.IRainbowSourceData
    public boolean isValidate() {
        return !isEmpty();
    }

    public final void setMaxEndTime(@Nullable Long l) {
        this.maxEndTime = l;
    }

    public final void setMinStartTime(@Nullable Long l) {
        this.minStartTime = l;
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
        return "DailyMHStrengthReport[time=" + getTime() + ", duration=" + this.duration + "]";
    }

    @NotNull
    public String toString() {
        return "DailyMHStrengthReport(time=" + getTime() + ", time=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(getTime() * ((long) 1000))) + ", tag='" + getTag() + "', duration=" + this.duration + ", avg=" + getAvgStrengthPerDay() + ", minStartTime=" + this.minStartTime + ", maxEndTime=" + this.maxEndTime + ", recordList=" + this.recordList + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DailyMHStrengthReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
        this(j, tag, listEmptyList, 0);
    }
}
