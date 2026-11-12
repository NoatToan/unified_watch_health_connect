package com.xiaomi.fit.fitness.export.data.aggregation.cloud;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.health.hrm.StepHrmDetailFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bL\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\"\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\"\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\"\u0010%\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R\"\u0010(\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\"\u0010+\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R\"\u0010.\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0011R\"\u00101\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b2\u0010\u000f\"\u0004\b3\u0010\u0011R\"\u00104\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b5\u0010\u000f\"\u0004\b6\u0010\u0011R\"\u00107\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b8\u0010\u000f\"\u0004\b9\u0010\u0011R\"\u0010:\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b;\u0010\u000f\"\u0004\b<\u0010\u0011R\"\u0010=\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b>\u0010\u000f\"\u0004\b?\u0010\u0011R\"\u0010@\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bA\u0010\u000f\"\u0004\bB\u0010\u0011R\"\u0010C\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bD\u0010\u000f\"\u0004\bE\u0010\u0011R\"\u0010F\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bG\u0010\u000f\"\u0004\bH\u0010\u0011R\"\u0010I\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bJ\u0010\u000f\"\u0004\bK\u0010\u0011R\"\u0010L\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bM\u0010\u000f\"\u0004\bN\u0010\u0011R\"\u0010O\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bP\u0010\u000f\"\u0004\bQ\u0010\u0011¨\u0006R"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/cloud/CloudSleepReport;", "", FitnessReportKey.totalDuration, "", "details", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/cloud/CloudSleepSegment;", "<init>", "(ILjava/util/List;)V", "getTotalDuration", "()I", "getDetails", "()Ljava/util/List;", "sleepDeepDuration", "getSleepDeepDuration", "()Ljava/lang/Integer;", "setSleepDeepDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "sleepLightDuration", "getSleepLightDuration", "setSleepLightDuration", "sleepRemDuration", "getSleepRemDuration", "setSleepRemDuration", "sleepAwakeDuration", "getSleepAwakeDuration", "setSleepAwakeDuration", "sleepTraceDuration", "getSleepTraceDuration", "setSleepTraceDuration", "awakeCount", "getAwakeCount", "setAwakeCount", "breathQuality", "getBreathQuality", "setBreathQuality", "sleepStage", "getSleepStage", "setSleepStage", "sleepScore", "getSleepScore", "setSleepScore", "longSleepEvaluation", "getLongSleepEvaluation", "setLongSleepEvaluation", "daySleepEvaluation", "getDaySleepEvaluation", "setDaySleepEvaluation", "avgHr", "getAvgHr", "setAvgHr", "maxHr", "getMaxHr", "setMaxHr", "minHr", "getMinHr", "setMinHr", FitnessReportKey.avgSpo2, "getAvgSpo2", "setAvgSpo2", FitnessReportKey.maxSpo2, "getMaxSpo2", "setMaxSpo2", FitnessReportKey.minSpo2, "getMinSpo2", "setMinSpo2", "avgBreath", "getAvgBreath", "setAvgBreath", "totalSnore", "getTotalSnore", "setTotalSnore", "totalSnoreDisturb", "getTotalSnoreDisturb", "setTotalSnoreDisturb", "totalTurnOver", "getTotalTurnOver", "setTotalTurnOver", "totalBodyMove", "getTotalBodyMove", "setTotalBodyMove", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CloudSleepReport {

    @SerializedName("avg_breath")
    @Nullable
    private Integer avgBreath;

    @SerializedName(StepHrmDetailFragment.KEY_AVG_HR)
    @Nullable
    private Integer avgHr;

    @SerializedName("avg_spo2")
    @Nullable
    private Integer avgSpo2;

    @SerializedName("awake_count")
    @Nullable
    private Integer awakeCount;

    @SerializedName("breath_quality")
    @Nullable
    private Integer breathQuality;

    @SerializedName("day_sleep_evaluation")
    @Nullable
    private Integer daySleepEvaluation;

    @SerializedName("segment_details")
    @NotNull
    private final List<CloudSleepSegment> details;

    @SerializedName("long_sleep_evaluation")
    @Nullable
    private Integer longSleepEvaluation;

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

    @SerializedName("sleep_awake_duration")
    @Nullable
    private Integer sleepAwakeDuration;

    @SerializedName("sleep_deep_duration")
    @Nullable
    private Integer sleepDeepDuration;

    @SerializedName("sleep_light_duration")
    @Nullable
    private Integer sleepLightDuration;

    @SerializedName("sleep_rem_duration")
    @Nullable
    private Integer sleepRemDuration;

    @SerializedName("sleep_score")
    @Nullable
    private Integer sleepScore;

    @SerializedName("sleep_stage")
    @Nullable
    private Integer sleepStage;

    @SerializedName("sleep_trace_duration")
    @Nullable
    private Integer sleepTraceDuration;

    @SerializedName("total_body_move")
    @Nullable
    private Integer totalBodyMove;

    @SerializedName("total_duration")
    private final int totalDuration;

    @SerializedName("total_snore")
    @Nullable
    private Integer totalSnore;

    @SerializedName("total_snore_disturb")
    @Nullable
    private Integer totalSnoreDisturb;

    @SerializedName("total_turn_over")
    @Nullable
    private Integer totalTurnOver;

    public CloudSleepReport(int i, @NotNull List<CloudSleepSegment> details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.totalDuration = i;
        this.details = details;
    }

    @Nullable
    public final Integer getAvgBreath() {
        return this.avgBreath;
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
    public final Integer getAwakeCount() {
        return this.awakeCount;
    }

    @Nullable
    public final Integer getBreathQuality() {
        return this.breathQuality;
    }

    @Nullable
    public final Integer getDaySleepEvaluation() {
        return this.daySleepEvaluation;
    }

    @NotNull
    public final List<CloudSleepSegment> getDetails() {
        return this.details;
    }

    @Nullable
    public final Integer getLongSleepEvaluation() {
        return this.longSleepEvaluation;
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
    public final Integer getSleepAwakeDuration() {
        return this.sleepAwakeDuration;
    }

    @Nullable
    public final Integer getSleepDeepDuration() {
        return this.sleepDeepDuration;
    }

    @Nullable
    public final Integer getSleepLightDuration() {
        return this.sleepLightDuration;
    }

    @Nullable
    public final Integer getSleepRemDuration() {
        return this.sleepRemDuration;
    }

    @Nullable
    public final Integer getSleepScore() {
        return this.sleepScore;
    }

    @Nullable
    public final Integer getSleepStage() {
        return this.sleepStage;
    }

    @Nullable
    public final Integer getSleepTraceDuration() {
        return this.sleepTraceDuration;
    }

    @Nullable
    public final Integer getTotalBodyMove() {
        return this.totalBodyMove;
    }

    public final int getTotalDuration() {
        return this.totalDuration;
    }

    @Nullable
    public final Integer getTotalSnore() {
        return this.totalSnore;
    }

    @Nullable
    public final Integer getTotalSnoreDisturb() {
        return this.totalSnoreDisturb;
    }

    @Nullable
    public final Integer getTotalTurnOver() {
        return this.totalTurnOver;
    }

    public final void setAvgBreath(@Nullable Integer num) {
        this.avgBreath = num;
    }

    public final void setAvgHr(@Nullable Integer num) {
        this.avgHr = num;
    }

    public final void setAvgSpo2(@Nullable Integer num) {
        this.avgSpo2 = num;
    }

    public final void setAwakeCount(@Nullable Integer num) {
        this.awakeCount = num;
    }

    public final void setBreathQuality(@Nullable Integer num) {
        this.breathQuality = num;
    }

    public final void setDaySleepEvaluation(@Nullable Integer num) {
        this.daySleepEvaluation = num;
    }

    public final void setLongSleepEvaluation(@Nullable Integer num) {
        this.longSleepEvaluation = num;
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

    public final void setSleepAwakeDuration(@Nullable Integer num) {
        this.sleepAwakeDuration = num;
    }

    public final void setSleepDeepDuration(@Nullable Integer num) {
        this.sleepDeepDuration = num;
    }

    public final void setSleepLightDuration(@Nullable Integer num) {
        this.sleepLightDuration = num;
    }

    public final void setSleepRemDuration(@Nullable Integer num) {
        this.sleepRemDuration = num;
    }

    public final void setSleepScore(@Nullable Integer num) {
        this.sleepScore = num;
    }

    public final void setSleepStage(@Nullable Integer num) {
        this.sleepStage = num;
    }

    public final void setSleepTraceDuration(@Nullable Integer num) {
        this.sleepTraceDuration = num;
    }

    public final void setTotalBodyMove(@Nullable Integer num) {
        this.totalBodyMove = num;
    }

    public final void setTotalSnore(@Nullable Integer num) {
        this.totalSnore = num;
    }

    public final void setTotalSnoreDisturb(@Nullable Integer num) {
        this.totalSnoreDisturb = num;
    }

    public final void setTotalTurnOver(@Nullable Integer num) {
        this.totalTurnOver = num;
    }
}
