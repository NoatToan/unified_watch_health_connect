package com.xiaomi.fitness.sleep.trace;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepAnalyzeContract;", "", "<init>", "()V", "unprotectedSleepDuration", "", "getUnprotectedSleepDuration", "()I", "sleepingCycleDuration", "getSleepingCycleDuration", "MAX_LIGHT_SLEEP_DURATION", "DEFAULT_PREPARE_SLEEP_DURATION", "prepareSleepDuration", "getPrepareSleepDuration", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepAnalyzeContract {
    private static final int DEFAULT_PREPARE_SLEEP_DURATION;

    @NotNull
    public static final SleepAnalyzeContract INSTANCE = new SleepAnalyzeContract();
    private static final int MAX_LIGHT_SLEEP_DURATION;
    private static final int sleepingCycleDuration;
    private static final int unprotectedSleepDuration;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        unprotectedSleepDuration = (int) timeUnit.toMillis(30L);
        sleepingCycleDuration = (int) timeUnit.toMillis(90L);
        MAX_LIGHT_SLEEP_DURATION = (int) (timeUnit.toMillis(110L) * 0.8f);
        DEFAULT_PREPARE_SLEEP_DURATION = (int) TimeUnit.HOURS.toMillis(2L);
    }

    private SleepAnalyzeContract() {
    }

    public final int getPrepareSleepDuration() {
        return SleepTraceConfiguration.INSTANCE.isCustomSleepSchedule() ? MAX_LIGHT_SLEEP_DURATION : DEFAULT_PREPARE_SLEEP_DURATION;
    }

    public final int getSleepingCycleDuration() {
        return sleepingCycleDuration;
    }

    public final int getUnprotectedSleepDuration() {
        return unprotectedSleepDuration;
    }
}
