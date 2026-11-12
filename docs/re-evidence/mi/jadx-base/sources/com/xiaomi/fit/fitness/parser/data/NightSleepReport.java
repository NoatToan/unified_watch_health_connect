package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b/\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0005R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001e\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001e\u0010'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001e\u0010*\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b+\u0010\u001d\"\u0004\b,\u0010\u001fR\u001e\u0010-\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\u001e\u00100\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR\u001e\u00103\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\u001e\u00106\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b7\u0010\u001d\"\u0004\b8\u0010\u001fR\u001e\u00109\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR\u001e\u0010<\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b=\u0010\u001d\"\u0004\b>\u0010\u001fR\u001e\u0010?\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001fR\u001e\u0010B\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\bC\u0010\u001d\"\u0004\bD\u0010\u001f¨\u0006E"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/NightSleepReport;", "", "tzIn15Min", "", "<init>", "(I)V", "getTzIn15Min", "()I", "bedTime", "", "getBedTime", "()J", "setBedTime", "(J)V", "wakeUpTime", "getWakeUpTime", "setWakeUpTime", "sleepDuration", "getSleepDuration", "setSleepDuration", "sleepItems", "", "Lcom/xiaomi/fit/data/common/data/daily/SleepStateItem;", "getSleepItems", "()Ljava/util/List;", "setSleepItems", "(Ljava/util/List;)V", "deepDuration", "getDeepDuration", "()Ljava/lang/Integer;", "setDeepDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "lightDuration", "getLightDuration", "setLightDuration", "remDuration", "getRemDuration", "setRemDuration", "awakeDuration", "getAwakeDuration", "setAwakeDuration", "awakeCount", "getAwakeCount", "setAwakeCount", "totalScore", "getTotalScore", "setTotalScore", "friendlyTotalScore", "getFriendlyTotalScore", "setFriendlyTotalScore", "qualityScore", "getQualityScore", "setQualityScore", "durationScore", "getDurationScore", "setDurationScore", "sleepSummary", "getSleepSummary", "setSleepSummary", "sleepAdvice", "getSleepAdvice", "setSleepAdvice", "recoveryScore", "getRecoveryScore", "setRecoveryScore", "nervousScore", "getNervousScore", "setNervousScore", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NightSleepReport {

    @Nullable
    private Integer awakeCount;

    @Nullable
    private Integer awakeDuration;
    private long bedTime;

    @Nullable
    private Integer deepDuration;

    @Nullable
    private Integer durationScore;

    @Nullable
    private Integer friendlyTotalScore;

    @Nullable
    private Integer lightDuration;

    @Nullable
    private Integer nervousScore;

    @Nullable
    private Integer qualityScore;

    @Nullable
    private Integer recoveryScore;

    @Nullable
    private Integer remDuration;

    @Nullable
    private Integer sleepAdvice;
    private int sleepDuration;

    @Nullable
    private List<SleepStateItem> sleepItems;

    @Nullable
    private Integer sleepSummary;

    @Nullable
    private Integer totalScore;
    private final int tzIn15Min;
    private long wakeUpTime;

    public NightSleepReport(int i) {
        this.tzIn15Min = i;
    }

    @Nullable
    public final Integer getAwakeCount() {
        return this.awakeCount;
    }

    @Nullable
    public final Integer getAwakeDuration() {
        return this.awakeDuration;
    }

    public final long getBedTime() {
        return this.bedTime;
    }

    @Nullable
    public final Integer getDeepDuration() {
        return this.deepDuration;
    }

    @Nullable
    public final Integer getDurationScore() {
        return this.durationScore;
    }

    @Nullable
    public final Integer getFriendlyTotalScore() {
        return this.friendlyTotalScore;
    }

    @Nullable
    public final Integer getLightDuration() {
        return this.lightDuration;
    }

    @Nullable
    public final Integer getNervousScore() {
        return this.nervousScore;
    }

    @Nullable
    public final Integer getQualityScore() {
        return this.qualityScore;
    }

    @Nullable
    public final Integer getRecoveryScore() {
        return this.recoveryScore;
    }

    @Nullable
    public final Integer getRemDuration() {
        return this.remDuration;
    }

    @Nullable
    public final Integer getSleepAdvice() {
        return this.sleepAdvice;
    }

    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    @Nullable
    public final List<SleepStateItem> getSleepItems() {
        return this.sleepItems;
    }

    @Nullable
    public final Integer getSleepSummary() {
        return this.sleepSummary;
    }

    @Nullable
    public final Integer getTotalScore() {
        return this.totalScore;
    }

    public final int getTzIn15Min() {
        return this.tzIn15Min;
    }

    public final long getWakeUpTime() {
        return this.wakeUpTime;
    }

    public final void setAwakeCount(@Nullable Integer num) {
        this.awakeCount = num;
    }

    public final void setAwakeDuration(@Nullable Integer num) {
        this.awakeDuration = num;
    }

    public final void setBedTime(long j) {
        this.bedTime = j;
    }

    public final void setDeepDuration(@Nullable Integer num) {
        this.deepDuration = num;
    }

    public final void setDurationScore(@Nullable Integer num) {
        this.durationScore = num;
    }

    public final void setFriendlyTotalScore(@Nullable Integer num) {
        this.friendlyTotalScore = num;
    }

    public final void setLightDuration(@Nullable Integer num) {
        this.lightDuration = num;
    }

    public final void setNervousScore(@Nullable Integer num) {
        this.nervousScore = num;
    }

    public final void setQualityScore(@Nullable Integer num) {
        this.qualityScore = num;
    }

    public final void setRecoveryScore(@Nullable Integer num) {
        this.recoveryScore = num;
    }

    public final void setRemDuration(@Nullable Integer num) {
        this.remDuration = num;
    }

    public final void setSleepAdvice(@Nullable Integer num) {
        this.sleepAdvice = num;
    }

    public final void setSleepDuration(int i) {
        this.sleepDuration = i;
    }

    public final void setSleepItems(@Nullable List<SleepStateItem> list) {
        this.sleepItems = list;
    }

    public final void setSleepSummary(@Nullable Integer num) {
        this.sleepSummary = num;
    }

    public final void setTotalScore(@Nullable Integer num) {
        this.totalScore = num;
    }

    public final void setWakeUpTime(long j) {
        this.wakeUpTime = j;
    }
}
