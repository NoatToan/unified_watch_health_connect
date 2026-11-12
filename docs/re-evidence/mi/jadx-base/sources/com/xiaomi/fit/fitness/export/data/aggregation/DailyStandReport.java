package com.xiaomi.fit.fitness.export.data.aggregation;

import android.text.TextUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StandRecord;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000eJ\u0006\u0010&\u001a\u00020\u000bJ\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u000bH\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u0006H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\t\u0010-\u001a\u00020\u0004HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J7\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u00102\u001a\u00020(2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!¨\u00066"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/IRainbowSourceData;", "time", "", "tag", "", "standDetail", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/StandRecord;", "standCount", "", "<init>", "(JLjava/lang/String;Ljava/util/List;I)V", "(Ljava/lang/String;J)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "getStandDetail", "()Ljava/util/List;", "getStandCount", "()I", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "minStartTime", "getMinStartTime", "()Ljava/lang/Long;", "setMinStartTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "maxEndTime", "getMaxEndTime", "setMaxEndTime", "getAvgStandPerDay", "isEmpty", "", "getSourceData", "isValidate", "simpleInfo", "toString", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyStandReport extends DailyBasicReport implements IRainbowSourceData {

    @Nullable
    private Long maxEndTime;

    @Nullable
    private Long minStartTime;

    @Nullable
    private String sid;
    private final int standCount;

    @NotNull
    private final List<StandRecord> standDetail;

    @NotNull
    private final String tag;
    private long time;

    public DailyStandReport(long j, @NotNull String tag, @NotNull List<StandRecord> standDetail, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(standDetail, "standDetail");
        this.time = j;
        this.tag = tag;
        this.standDetail = standDetail;
        this.standCount = i;
        this.sid = "default";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DailyStandReport copy$default(DailyStandReport dailyStandReport, long j, String str, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = dailyStandReport.time;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = dailyStandReport.tag;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            list = dailyStandReport.standDetail;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            i = dailyStandReport.standCount;
        }
        return dailyStandReport.copy(j2, str2, list2, i);
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
    public final List<StandRecord> component3() {
        return this.standDetail;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStandCount() {
        return this.standCount;
    }

    @NotNull
    public final DailyStandReport copy(long time, @NotNull String tag, @NotNull List<StandRecord> standDetail, int standCount) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(standDetail, "standDetail");
        return new DailyStandReport(time, tag, standDetail, standCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyStandReport)) {
            return false;
        }
        DailyStandReport dailyStandReport = (DailyStandReport) other;
        return this.time == dailyStandReport.time && Intrinsics.areEqual(this.tag, dailyStandReport.tag) && Intrinsics.areEqual(this.standDetail, dailyStandReport.standDetail) && this.standCount == dailyStandReport.standCount;
    }

    public final int getAvgStandPerDay() {
        List<StandRecord> list;
        return (TextUtils.equals(getTag(), "days") || (list = this.standDetail) == null || list.isEmpty()) ? this.standCount : this.standCount / this.standDetail.size();
    }

    @Nullable
    public final Long getMaxEndTime() {
        return this.maxEndTime;
    }

    @Nullable
    public final Long getMinStartTime() {
        return this.minStartTime;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.IRainbowSourceData
    public int getSourceData() {
        return this.standCount;
    }

    public final int getStandCount() {
        return this.standCount;
    }

    @NotNull
    public final List<StandRecord> getStandDetail() {
        return this.standDetail;
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
        return (((((Long.hashCode(this.time) * 31) + this.tag.hashCode()) * 31) + this.standDetail.hashCode()) * 31) + Integer.hashCode(this.standCount);
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        List<StandRecord> list = this.standDetail;
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
        return "DailyStandReport[time=" + getTime() + ", standCount=" + this.standCount + "]";
    }

    @NotNull
    public String toString() {
        return "DailyStandReport(time=" + getTime() + ", time=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(getTime() * ((long) 1000))) + ", tag='" + getTag() + "', standCount=" + this.standCount + ", minStartTime=" + this.minStartTime + ", maxEndTime=" + this.maxEndTime + ", standDetail=" + this.standDetail + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DailyStandReport(@NotNull String tag, long j) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
        this(j, tag, listEmptyList, 0);
    }
}
