package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.aggregation.record.TimedValuePair;
import com.xiaomi.fit.fitness.export.data.item.NoiseItem;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u001d\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010-\u001a\u00020'2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R(\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001d\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!¨\u00061"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", FitnessReportKey.totalDuration, "", "getTotalDuration", "()I", "setTotalDuration", "(I)V", "highDuration", "getHighDuration", "setHighDuration", "hearingDurationList", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimedValuePair;", "getHearingDurationList", "()Ljava/util/List;", "setHearingDurationList", "(Ljava/util/List;)V", "noiseList", "Lcom/xiaomi/fit/fitness/export/data/item/NoiseItem;", "getNoiseList", "setNoiseList", "isEmpty", "", "simpleInfo", "toString", "component1", "component2", "copy", "equals", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyHearingReport extends DailyBasicReport {

    @Nullable
    private List<TimedValuePair<Integer>> hearingDurationList;
    private int highDuration;

    @Nullable
    private List<NoiseItem> noiseList;

    @Nullable
    private String sid;

    @NotNull
    private final String tag;
    private long time;
    private int totalDuration;

    public DailyHearingReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.time = j;
        this.tag = tag;
        this.sid = "default";
    }

    public static /* synthetic */ DailyHearingReport copy$default(DailyHearingReport dailyHearingReport, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyHearingReport.time;
        }
        if ((i & 2) != 0) {
            str = dailyHearingReport.tag;
        }
        return dailyHearingReport.copy(j, str);
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
    public final DailyHearingReport copy(long time, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new DailyHearingReport(time, tag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyHearingReport)) {
            return false;
        }
        DailyHearingReport dailyHearingReport = (DailyHearingReport) other;
        return this.time == dailyHearingReport.time && Intrinsics.areEqual(this.tag, dailyHearingReport.tag);
    }

    @Nullable
    public final List<TimedValuePair<Integer>> getHearingDurationList() {
        return this.hearingDurationList;
    }

    public final int getHighDuration() {
        return this.highDuration;
    }

    @Nullable
    public final List<NoiseItem> getNoiseList() {
        return this.noiseList;
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

    public final int getTotalDuration() {
        return this.totalDuration;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + this.tag.hashCode();
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        List<NoiseItem> list;
        return this.totalDuration == 0 && ((list = this.noiseList) == null || list.isEmpty());
    }

    public final void setHearingDurationList(@Nullable List<TimedValuePair<Integer>> list) {
        this.hearingDurationList = list;
    }

    public final void setHighDuration(int i) {
        this.highDuration = i;
    }

    public final void setNoiseList(@Nullable List<NoiseItem> list) {
        this.noiseList = list;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    public final void setTotalDuration(int i) {
        this.totalDuration = i;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String simpleInfo() {
        return "DailyHearingReport[time=" + getTime() + ", totalDuration=" + this.totalDuration + ", highDuration=" + this.highDuration + "]";
    }

    @NotNull
    public String toString() {
        return "DailyHearingReport(time=" + getTime() + ", time=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(getTime() * ((long) 1000))) + ", tag='" + getTag() + "', totalDuration=" + this.totalDuration + ", highDuration=" + this.highDuration + ", hearingDurationList=" + this.hearingDurationList + ", noiseList=" + this.noiseList + ")";
    }
}
