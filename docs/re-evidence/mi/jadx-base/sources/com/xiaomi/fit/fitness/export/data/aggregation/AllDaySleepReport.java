package com.xiaomi.fit.fitness.export.data.aggregation;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.health.hrm.StepHrmDetailFragment;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b;\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010X\u001a\u00020YJ\b\u0010Z\u001a\u00020YH\u0016J\b\u0010[\u001a\u00020\u0005H\u0016J\b\u0010\\\u001a\u00020\u0005H\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001e\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001e\u0010!\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\"\u0010$\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001e\u0010-\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u001e\u00100\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R\"\u00103\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b4\u0010&\"\u0004\b5\u0010(R\u001e\u00106\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R\u001e\u00109\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017R\"\u0010<\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b=\u0010&\"\u0004\b>\u0010(R\"\u0010?\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b@\u0010&\"\u0004\bA\u0010(R\"\u0010B\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\bC\u0010&\"\u0004\bD\u0010(R\"\u0010E\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\bF\u0010&\"\u0004\bG\u0010(R\"\u0010H\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\bI\u0010&\"\u0004\bJ\u0010(R\"\u0010K\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\bL\u0010&\"\u0004\bM\u0010(R&\u0010N\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010O8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010OX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010R\"\u0004\bW\u0010T¨\u0006]"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "tzInSec", "", "getTzInSec", "()I", "setTzInSec", "(I)V", FitnessReportKey.totalDuration, "getTotalDuration", "setTotalDuration", "avgDuration", "getAvgDuration", "setAvgDuration", "deepDuration", "getDeepDuration", "setDeepDuration", "lightDuration", "getLightDuration", "setLightDuration", "remDuration", "getRemDuration", "()Ljava/lang/Integer;", "setRemDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "awakeDuration", "getAwakeDuration", "setAwakeDuration", StepsInfo.KEY_STAGE, "getStage", "setStage", "score", "getScore", "setScore", "scoreOutperformedPercent", "getScoreOutperformedPercent", "setScoreOutperformedPercent", "commentCode", "getCommentCode", "setCommentCode", "longSleepCommentCode", "getLongSleepCommentCode", "setLongSleepCommentCode", "avgHr", "getAvgHr", "setAvgHr", "maxHr", "getMaxHr", "setMaxHr", "minHr", "getMinHr", "setMinHr", FitnessReportKey.avgSpo2, "getAvgSpo2", "setAvgSpo2", FitnessReportKey.maxSpo2, "getMaxSpo2", "setMaxSpo2", FitnessReportKey.minSpo2, "getMinSpo2", "setMinSpo2", "sleepSegments", "", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "getSleepSegments", "()Ljava/util/List;", "setSleepSegments", "(Ljava/util/List;)V", "dayReportList", "getDayReportList", "setDayReportList", "isValidate", "", "isEmpty", "simpleInfo", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AllDaySleepReport extends DailyBasicReport {
    private transient int avgDuration;

    @SerializedName(StepHrmDetailFragment.KEY_AVG_HR)
    @Nullable
    private Integer avgHr;

    @SerializedName("avg_spo2")
    @Nullable
    private Integer avgSpo2;

    @SerializedName("sleep_awake_duration")
    @Nullable
    private Integer awakeDuration;

    @SerializedName("day_sleep_evaluation")
    private int commentCode;

    @Nullable
    private transient List<AllDaySleepReport> dayReportList;

    @SerializedName("sleep_deep_duration")
    private int deepDuration;

    @SerializedName("sleep_light_duration")
    private int lightDuration;

    @SerializedName("long_sleep_evaluation")
    private int longSleepCommentCode;

    @SerializedName("max_hr")
    @Nullable
    private Integer maxHr;

    @SerializedName(FitnessPersistKey.ReportMaxSpo2)
    @Nullable
    private Integer maxSpo2;

    @SerializedName("min_hr")
    @Nullable
    private Integer minHr;

    @SerializedName(FitnessPersistKey.ReportMinSpo2)
    @Nullable
    private Integer minSpo2;

    @SerializedName("sleep_rem_duration")
    @Nullable
    private Integer remDuration;

    @SerializedName("sleep_score")
    private int score;

    @SerializedName("sleep_score_outperformed_percent")
    @Nullable
    private Integer scoreOutperformedPercent;

    @SerializedName("did")
    @Nullable
    private String sid;

    @SerializedName("segment_details")
    @Nullable
    private List<SleepSegmentReport> sleepSegments;

    @SerializedName("sleep_stage")
    private int stage;

    @NotNull
    private final transient String tag;

    @SerializedName("time")
    private long time;

    @SerializedName("total_duration")
    private int totalDuration;

    @SerializedName("zone_offset")
    private int tzInSec;

    public AllDaySleepReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.time = j;
        this.tag = tag;
        this.sid = "default";
    }

    public final int getAvgDuration() {
        return this.avgDuration;
    }

    @Nullable
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    public final Integer getAvgSpo2() {
        return this.avgSpo2;
    }

    @Nullable
    public final Integer getAwakeDuration() {
        return this.awakeDuration;
    }

    public final int getCommentCode() {
        return this.commentCode;
    }

    @Nullable
    public final List<AllDaySleepReport> getDayReportList() {
        return this.dayReportList;
    }

    public final int getDeepDuration() {
        return this.deepDuration;
    }

    public final int getLightDuration() {
        return this.lightDuration;
    }

    public final int getLongSleepCommentCode() {
        return this.longSleepCommentCode;
    }

    @Nullable
    public final Integer getMaxHr() {
        return this.maxHr;
    }

    @Nullable
    public final Integer getMaxSpo2() {
        return this.maxSpo2;
    }

    @Nullable
    public final Integer getMinHr() {
        return this.minHr;
    }

    @Nullable
    public final Integer getMinSpo2() {
        return this.minSpo2;
    }

    @Nullable
    public final Integer getRemDuration() {
        return this.remDuration;
    }

    public final int getScore() {
        return this.score;
    }

    @Nullable
    public final Integer getScoreOutperformedPercent() {
        return this.scoreOutperformedPercent;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Nullable
    public final List<SleepSegmentReport> getSleepSegments() {
        return this.sleepSegments;
    }

    public final int getStage() {
        return this.stage;
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

    public final int getTzInSec() {
        return this.tzInSec;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        return this.totalDuration <= 0;
    }

    public final boolean isValidate() {
        return !isEmpty();
    }

    public final void setAvgDuration(int i) {
        this.avgDuration = i;
    }

    public final void setAvgHr(@Nullable Integer num) {
        this.avgHr = num;
    }

    public final void setAvgSpo2(@Nullable Integer num) {
        this.avgSpo2 = num;
    }

    public final void setAwakeDuration(@Nullable Integer num) {
        this.awakeDuration = num;
    }

    public final void setCommentCode(int i) {
        this.commentCode = i;
    }

    public final void setDayReportList(@Nullable List<AllDaySleepReport> list) {
        this.dayReportList = list;
    }

    public final void setDeepDuration(int i) {
        this.deepDuration = i;
    }

    public final void setLightDuration(int i) {
        this.lightDuration = i;
    }

    public final void setLongSleepCommentCode(int i) {
        this.longSleepCommentCode = i;
    }

    public final void setMaxHr(@Nullable Integer num) {
        this.maxHr = num;
    }

    public final void setMaxSpo2(@Nullable Integer num) {
        this.maxSpo2 = num;
    }

    public final void setMinHr(@Nullable Integer num) {
        this.minHr = num;
    }

    public final void setMinSpo2(@Nullable Integer num) {
        this.minSpo2 = num;
    }

    public final void setRemDuration(@Nullable Integer num) {
        this.remDuration = num;
    }

    public final void setScore(int i) {
        this.score = i;
    }

    public final void setScoreOutperformedPercent(@Nullable Integer num) {
        this.scoreOutperformedPercent = num;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setSleepSegments(@Nullable List<SleepSegmentReport> list) {
        this.sleepSegments = list;
    }

    public final void setStage(int i) {
        this.stage = i;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    public final void setTotalDuration(int i) {
        this.totalDuration = i;
    }

    public final void setTzInSec(int i) {
        this.tzInSec = i;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String simpleInfo() {
        return toString();
    }

    @NotNull
    public String toString() {
        long time = getTime();
        int i = this.totalDuration;
        int i2 = this.avgDuration;
        int i3 = this.deepDuration;
        int i4 = this.lightDuration;
        Integer num = this.remDuration;
        Integer num2 = this.awakeDuration;
        Integer num3 = this.avgHr;
        Integer num4 = this.avgSpo2;
        int i5 = this.stage;
        int i6 = this.longSleepCommentCode;
        int i7 = this.commentCode;
        int i8 = this.score;
        Integer num5 = this.scoreOutperformedPercent;
        String dateStr = FitnessDateUtils.getDateStr(getTime());
        List<SleepSegmentReport> list = this.sleepSegments;
        Integer numValueOf = list != null ? Integer.valueOf(list.size()) : null;
        List<AllDaySleepReport> list2 = this.dayReportList;
        return "AllDaySleepReport{time= " + time + ", totalDuration= " + i + ", avgDuration= " + i2 + ", deepDuration= " + i3 + ", lightDuration= " + i4 + ", remDuration= " + num + ", awakeDuration= " + num2 + ", avgHr= " + num3 + ", avgSpo2= " + num4 + ", stage = " + i5 + ", longSleepCommentCode = " + i6 + ", commentCode = " + i7 + ", score = " + i8 + ", scoreOutperformedPercent = " + num5 + ", timestamp = " + dateStr + "，segmentList.size = " + numValueOf + ", dayReportList.size =" + (list2 != null ? Integer.valueOf(list2.size()) : null) + "}";
    }
}
