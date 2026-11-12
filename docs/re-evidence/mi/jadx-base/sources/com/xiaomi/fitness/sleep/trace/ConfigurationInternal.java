package com.xiaomi.fitness.sleep.trace;

import android.app.Notification;
import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0017\bf\u0018\u00002\u00020\u0001J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%H&J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%H&J\u0010\u0010'\u001a\u00020\t2\u0006\u0010$\u001a\u00020%H&J\u0010\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020%H&J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\tH&J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\tH&J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\tH&J\u0010\u0010/\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\tH&J\u0010\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\tH&J\u0010\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0015H&J\u0018\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\tH&J(\u00104\u001a\u00020\u00002\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH&J\b\u0010;\u001a\u00020)H&J\b\u0010<\u001a\u00020\tH&J\b\u0010=\u001a\u00020\tH&J\b\u0010>\u001a\u00020\tH&J\b\u0010?\u001a\u00020\tH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0012\u0010\u0010\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0012\u0010\u0012\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u0012\u0010\u0019\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000bR\u0012\u0010\u001b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000bR\u0012\u0010\u001d\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000bR\u0012\u0010\u001f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u000bR\u0012\u0010!\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000b¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/ConfigurationInternal;", "", "foregroundNotification", "Landroid/app/Notification;", "getForegroundNotification", "()Landroid/app/Notification;", "setForegroundNotification", "(Landroid/app/Notification;)V", "sleepPredictCycles", "", "getSleepPredictCycles", "()I", "earliestSleepTime", "getEarliestSleepTime", "earliestWakeTime", "getEarliestWakeTime", "earliestSleepHourOfDay", "getEarliestSleepHourOfDay", "earliestSleepMin", "getEarliestSleepMin", "isCustomSleepSchedule", "", "()Z", "earliestWakeHourOfDay", "getEarliestWakeHourOfDay", "earliestWakeMin", "getEarliestWakeMin", "samplingRateWhenSleepPredict", "getSamplingRateWhenSleepPredict", "samplingRateWhenSleeping", "getSamplingRateWhenSleeping", "samplingRateWhenWakeupPredict", "getSamplingRateWhenWakeupPredict", "traceDuration", "getTraceDuration", "edit", "context", "Landroid/content/Context;", "isEnable", "getEnable", "setup", "", "setSleepPredictCycles", "count", "setSamplingRateWhenSleepPredict", "rate", "setSamplingRateWhenSleeping", "setSamplingRateWhenWakeupPredict", "setTraceDuration", "durationSec", "setEnable", "enable", "setSleepSchedule", "sleepTime", "wakeupTime", "sleepHour", "sleepMin", "wakeHour", "wakeMin", "apply", "getCurSleepHour", "getCurSleepMinute", "getCurWakeHour", "getCurWakeMinute", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ConfigurationInternal {
    void apply();

    @NotNull
    ConfigurationInternal edit(@NotNull Context context);

    int getCurSleepHour();

    int getCurSleepMinute();

    int getCurWakeHour();

    int getCurWakeMinute();

    int getEarliestSleepHourOfDay();

    int getEarliestSleepMin();

    int getEarliestSleepTime();

    int getEarliestWakeHourOfDay();

    int getEarliestWakeMin();

    int getEarliestWakeTime();

    int getEnable(@NotNull Context context);

    @Nullable
    Notification getForegroundNotification();

    int getSamplingRateWhenSleepPredict();

    int getSamplingRateWhenSleeping();

    int getSamplingRateWhenWakeupPredict();

    int getSleepPredictCycles();

    int getTraceDuration();

    boolean isCustomSleepSchedule();

    boolean isEnable(@NotNull Context context);

    @NotNull
    ConfigurationInternal setEnable(boolean enable);

    void setForegroundNotification(@Nullable Notification notification);

    @NotNull
    ConfigurationInternal setSamplingRateWhenSleepPredict(int rate);

    @NotNull
    ConfigurationInternal setSamplingRateWhenSleeping(int rate);

    @NotNull
    ConfigurationInternal setSamplingRateWhenWakeupPredict(int rate);

    @NotNull
    ConfigurationInternal setSleepPredictCycles(int count);

    @NotNull
    ConfigurationInternal setSleepSchedule(int sleepTime, int wakeupTime);

    @NotNull
    ConfigurationInternal setSleepSchedule(int sleepHour, int sleepMin, int wakeHour, int wakeMin);

    @NotNull
    ConfigurationInternal setTraceDuration(int durationSec);

    void setup(@NotNull Context context);
}
