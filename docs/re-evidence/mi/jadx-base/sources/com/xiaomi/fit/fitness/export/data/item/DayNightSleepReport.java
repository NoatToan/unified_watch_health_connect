package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010L\u001a\u00020\u0003H\u0016J\b\u0010M\u001a\u00020\u0003H\u0002J\u0010\u0010N\u001a\u00020O2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0006\u0010P\u001a\u00020QJ\b\u0010R\u001a\u00020SH\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\u001e\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R\"\u0010+\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\"\u0010.\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b/\u0010!\"\u0004\b0\u0010#R\"\u00101\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\"\u00104\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b5\u0010!\"\u0004\b6\u0010#R\"\u00107\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#R\"\u0010:\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b;\u0010!\"\u0004\b<\u0010#R\"\u0010=\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b>\u0010!\"\u0004\b?\u0010#R\"\u0010@\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\bA\u0010!\"\u0004\bB\u0010#R\"\u0010C\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\bD\u0010!\"\u0004\bE\u0010#R\"\u0010F\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\bG\u0010!\"\u0004\bH\u0010#R\"\u0010I\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010#¨\u0006T"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/DayNightSleepReport;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "tzIn15Min", "", "<init>", "(JI)V", "getTime", "()J", "setTime", "(J)V", "getTzIn15Min", "()I", "bedTime", "getBedTime", "setBedTime", "wakeUpTime", "getWakeUpTime", "setWakeUpTime", "sleepDuration", "getSleepDuration", "setSleepDuration", "(I)V", "sleepItems", "", "Lcom/xiaomi/fit/data/common/data/daily/SleepStateItem;", "getSleepItems", "()Ljava/util/List;", "setSleepItems", "(Ljava/util/List;)V", "deepDuration", "getDeepDuration", "()Ljava/lang/Integer;", "setDeepDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "lightDuration", "getLightDuration", "setLightDuration", "remDuration", "getRemDuration", "setRemDuration", "awakeDuration", "getAwakeDuration", "setAwakeDuration", "awakeCount", "getAwakeCount", "setAwakeCount", "breathQuality", "getBreathQuality", "setBreathQuality", "totalScore", "getTotalScore", "setTotalScore", "friendlyTotalScore", "getFriendlyTotalScore", "setFriendlyTotalScore", "qualityScore", "getQualityScore", "setQualityScore", "durationScore", "getDurationScore", "setDurationScore", "sleepSummary", "getSleepSummary", "setSleepSummary", "sleepAdvice", "getSleepAdvice", "setSleepAdvice", "recoveryScore", "getRecoveryScore", "setRecoveryScore", "nervousScore", "getNervousScore", "setNervousScore", "getTimestamp", "getWakeUp0Time", "setTimestamp", "", "isValidSleep", "", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DayNightSleepReport extends DailyRecordItem {

    @SerializedName("awake_count")
    @Nullable
    private Integer awakeCount;

    @SerializedName("sleep_awake_duration")
    @Nullable
    private Integer awakeDuration;

    @SerializedName("bedtime")
    private long bedTime;

    @SerializedName("breath_quality")
    @Nullable
    private Integer breathQuality;

    @SerializedName("sleep_deep_duration")
    @Nullable
    private Integer deepDuration;

    @SerializedName("duration_score")
    @Nullable
    private Integer durationScore;

    @SerializedName("friendly_score")
    @Nullable
    private Integer friendlyTotalScore;

    @SerializedName("sleep_light_duration")
    @Nullable
    private Integer lightDuration;

    @SerializedName("nervous_score")
    @Nullable
    private Integer nervousScore;

    @SerializedName("quality_score")
    @Nullable
    private Integer qualityScore;

    @SerializedName("recover_score")
    @Nullable
    private Integer recoveryScore;

    @SerializedName("sleep_rem_duration")
    @Nullable
    private Integer remDuration;

    @SerializedName("sleep_advice")
    @Nullable
    private Integer sleepAdvice;

    @SerializedName("duration")
    private int sleepDuration;

    @SerializedName("items")
    @Nullable
    private List<SleepStateItem> sleepItems;

    @SerializedName("sleep_summary")
    @Nullable
    private Integer sleepSummary;

    @SerializedName("date_time")
    private long time;

    @SerializedName("total_score")
    @Nullable
    private Integer totalScore;

    @SerializedName("timezone")
    private final int tzIn15Min;

    @SerializedName("wake_up_time")
    private long wakeUpTime;

    public DayNightSleepReport(long j, int i) {
        super(null);
        this.time = j;
        this.tzIn15Min = i;
    }

    private final long getWakeUp0Time() {
        return FitnessDateUtils.changeToDestZeroTimeOneDay(this.wakeUpTime, FitnessDateUtils.getTzOffsetInSecBy15min(this.tzIn15Min), 0);
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
    public final Integer getBreathQuality() {
        return this.breathQuality;
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

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        long j = this.time;
        return j <= 0 ? getWakeUp0Time() : j;
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

    public final boolean isValidSleep() {
        if (this.bedTime > 0 && this.wakeUpTime > 0 && this.sleepDuration != 0) {
            return true;
        }
        List<SleepStateItem> list = this.sleepItems;
        return !(list == null || list.isEmpty());
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

    public final void setBreathQuality(@Nullable Integer num) {
        this.breathQuality = num;
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

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    public final void setTotalScore(@Nullable Integer num) {
        this.totalScore = num;
    }

    public final void setWakeUpTime(long j) {
        this.wakeUpTime = j;
    }

    @NotNull
    public String toString() {
        long j = this.bedTime;
        long j2 = 1000;
        String date = TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(j * j2));
        long j3 = this.wakeUpTime;
        String date2 = TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(j2 * j3));
        int i = this.sleepDuration;
        Integer num = this.deepDuration;
        Integer num2 = this.lightDuration;
        List<SleepStateItem> list = this.sleepItems;
        return "bedTime = " + j + "," + date + ", wakeUpTime = " + j3 + ", " + date2 + ",sleepDuration = " + i + ",deepDuration=" + num + ",lightDuration=" + num2 + ",sleepItems.size=" + (list != null ? Integer.valueOf(list.size()) : null) + ",breathQuality=" + this.breathQuality;
    }
}
