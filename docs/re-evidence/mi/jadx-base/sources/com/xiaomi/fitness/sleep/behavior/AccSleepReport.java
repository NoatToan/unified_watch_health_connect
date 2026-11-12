package com.xiaomi.fitness.sleep.behavior;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001:\u0002FGB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010E\u001a\u00020\u0018H\u0016R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR \u0010 \u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR \u0010#\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001e\u0010&\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R&\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\b\"\u0004\b,\u0010\nR\u001e\u0010-\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R\u001e\u00100\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010\u0010R\u001e\u00103\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000e\"\u0004\b5\u0010\u0010R\u001e\u00106\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u000e\"\u0004\b8\u0010\u0010R\u001e\u00109\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010R\u001e\u0010<\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u000e\"\u0004\b>\u0010\u0010R\u001e\u0010?\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u000e\"\u0004\bA\u0010\u0010R\u001e\u0010B\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u000e\"\u0004\bD\u0010\u0010¨\u0006H"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/AccSleepReport;", "", "<init>", "()V", "report", "", "Lcom/xiaomi/fitness/sleep/behavior/AccSleepReport$SleepState;", "getReport", "()Ljava/util/List;", "setReport", "(Ljava/util/List;)V", "turn", "", "getTurn", "()I", "setTurn", "(I)V", TSMAuthContants.PARAM_THRESHOLD, "getThreshold", "setThreshold", "fallSleepDuration", "getFallSleepDuration", "setFallSleepDuration", "bedTime", "", "getBedTime", "()Ljava/lang/String;", "setBedTime", "(Ljava/lang/String;)V", "getupTime", "getGetupTime", "setGetupTime", "fallSleepTime", "getFallSleepTime", "setFallSleepTime", "wakeUpTime", "getWakeUpTime", "setWakeUpTime", "empty", "getEmpty", "setEmpty", "wakeList", "Lcom/xiaomi/fitness/sleep/behavior/AccSleepReport$WakeData;", "getWakeList", "setWakeList", "wakeUpCount", "getWakeUpCount", "setWakeUpCount", "totalScore", "getTotalScore", "setTotalScore", "sleepDurationScore", "getSleepDurationScore", "setSleepDurationScore", "fallSleepDurationScore", "getFallSleepDurationScore", "setFallSleepDurationScore", "wakeDurationScore", "getWakeDurationScore", "setWakeDurationScore", "getUpStableScore", "getGetUpStableScore", "setGetUpStableScore", "deepAndLightScore", "getDeepAndLightScore", "setDeepAndLightScore", "fallSleepTimeScore", "getFallSleepTimeScore", "setFallSleepTimeScore", "toString", "SleepState", "WakeData", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccSleepReport {

    @SerializedName("bedTime")
    @Nullable
    private String bedTime;

    @SerializedName("deepAndLightScore")
    private int deepAndLightScore;

    @SerializedName("empty")
    private int empty;

    @SerializedName("fallSleepDuration")
    private int fallSleepDuration;

    @SerializedName("fallSleepDurationScore")
    private int fallSleepDurationScore;

    @SerializedName("fallSleepTime")
    @Nullable
    private String fallSleepTime;

    @SerializedName("fallSleepTimeScore")
    private int fallSleepTimeScore;

    @SerializedName("getupStableScore")
    private int getUpStableScore;

    @SerializedName("getupTime")
    @Nullable
    private String getupTime;

    @SerializedName("report")
    @Nullable
    private List<SleepState> report;

    @SerializedName("sleepDurationScore")
    private int sleepDurationScore;

    @SerializedName(TSMAuthContants.PARAM_THRESHOLD)
    private int threshold;

    @SerializedName("totalScore")
    private int totalScore;

    @SerializedName("turn")
    private int turn;

    @SerializedName("wakeDurationScore")
    private int wakeDurationScore;

    @SerializedName("wakeList")
    @Nullable
    private List<WakeData> wakeList;

    @SerializedName("wakeUpCount")
    private int wakeUpCount;

    @SerializedName("wakeUpTime")
    @Nullable
    private String wakeUpTime;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0005H\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/AccSleepReport$SleepState;", "", "<init>", "()V", "time", "", "getTime", "()Ljava/lang/String;", "setTime", "(Ljava/lang/String;)V", "data", "", "getData", "()I", "setData", "(I)V", "toString", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SleepState {

        @SerializedName("data")
        private int data;

        @SerializedName("time")
        @Nullable
        private String time;

        public final int getData() {
            return this.data;
        }

        @Nullable
        public final String getTime() {
            return this.time;
        }

        public final void setData(int i) {
            this.data = i;
        }

        public final void setTime(@Nullable String str) {
            this.time = str;
        }

        @NotNull
        public String toString() {
            return "SleepState(time=" + this.time + ", data=" + this.data + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0005H\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/AccSleepReport$WakeData;", "", "<init>", "()V", "beginTime", "", "getBeginTime", "()Ljava/lang/String;", "setBeginTime", "(Ljava/lang/String;)V", "duration", "", "getDuration", "()I", "setDuration", "(I)V", "toString", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WakeData {

        @SerializedName("beginTime")
        @Nullable
        private String beginTime;

        @SerializedName("duration")
        private int duration;

        @Nullable
        public final String getBeginTime() {
            return this.beginTime;
        }

        public final int getDuration() {
            return this.duration;
        }

        public final void setBeginTime(@Nullable String str) {
            this.beginTime = str;
        }

        public final void setDuration(int i) {
            this.duration = i;
        }

        @NotNull
        public String toString() {
            return "WakeData(beginTime=" + this.beginTime + ", duration=" + this.duration + ")";
        }
    }

    @Nullable
    public final String getBedTime() {
        return this.bedTime;
    }

    public final int getDeepAndLightScore() {
        return this.deepAndLightScore;
    }

    public final int getEmpty() {
        return this.empty;
    }

    public final int getFallSleepDuration() {
        return this.fallSleepDuration;
    }

    public final int getFallSleepDurationScore() {
        return this.fallSleepDurationScore;
    }

    @Nullable
    public final String getFallSleepTime() {
        return this.fallSleepTime;
    }

    public final int getFallSleepTimeScore() {
        return this.fallSleepTimeScore;
    }

    public final int getGetUpStableScore() {
        return this.getUpStableScore;
    }

    @Nullable
    public final String getGetupTime() {
        return this.getupTime;
    }

    @Nullable
    public final List<SleepState> getReport() {
        return this.report;
    }

    public final int getSleepDurationScore() {
        return this.sleepDurationScore;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    public final int getTotalScore() {
        return this.totalScore;
    }

    public final int getTurn() {
        return this.turn;
    }

    public final int getWakeDurationScore() {
        return this.wakeDurationScore;
    }

    @Nullable
    public final List<WakeData> getWakeList() {
        return this.wakeList;
    }

    public final int getWakeUpCount() {
        return this.wakeUpCount;
    }

    @Nullable
    public final String getWakeUpTime() {
        return this.wakeUpTime;
    }

    public final void setBedTime(@Nullable String str) {
        this.bedTime = str;
    }

    public final void setDeepAndLightScore(int i) {
        this.deepAndLightScore = i;
    }

    public final void setEmpty(int i) {
        this.empty = i;
    }

    public final void setFallSleepDuration(int i) {
        this.fallSleepDuration = i;
    }

    public final void setFallSleepDurationScore(int i) {
        this.fallSleepDurationScore = i;
    }

    public final void setFallSleepTime(@Nullable String str) {
        this.fallSleepTime = str;
    }

    public final void setFallSleepTimeScore(int i) {
        this.fallSleepTimeScore = i;
    }

    public final void setGetUpStableScore(int i) {
        this.getUpStableScore = i;
    }

    public final void setGetupTime(@Nullable String str) {
        this.getupTime = str;
    }

    public final void setReport(@Nullable List<SleepState> list) {
        this.report = list;
    }

    public final void setSleepDurationScore(int i) {
        this.sleepDurationScore = i;
    }

    public final void setThreshold(int i) {
        this.threshold = i;
    }

    public final void setTotalScore(int i) {
        this.totalScore = i;
    }

    public final void setTurn(int i) {
        this.turn = i;
    }

    public final void setWakeDurationScore(int i) {
        this.wakeDurationScore = i;
    }

    public final void setWakeList(@Nullable List<WakeData> list) {
        this.wakeList = list;
    }

    public final void setWakeUpCount(int i) {
        this.wakeUpCount = i;
    }

    public final void setWakeUpTime(@Nullable String str) {
        this.wakeUpTime = str;
    }

    @NotNull
    public String toString() {
        return "AccSleepReport(report=" + this.report + ", turn=" + this.turn + ", threshold=" + this.threshold + ", fallSleepDuration=" + this.fallSleepDuration + ", bedTime=" + this.bedTime + ", getupTime=" + this.getupTime + ", fallSleepTime=" + this.fallSleepTime + ", wakeUpTime=" + this.wakeUpTime + ", empty=" + this.empty + ", wakeList=" + this.wakeList + ", wakeUpCount=" + this.wakeUpCount + ", totalScore=" + this.totalScore + ", sleepDurationScore=" + this.sleepDurationScore + ", fallSleepDurationScore=" + this.fallSleepDurationScore + ", wakeDurationScore=" + this.wakeDurationScore + ", getUpStableScore=" + this.getUpStableScore + ", deepAndLightScore=" + this.deepAndLightScore + ", fallSleepTimeScore=" + this.fallSleepTimeScore + ")";
    }
}
