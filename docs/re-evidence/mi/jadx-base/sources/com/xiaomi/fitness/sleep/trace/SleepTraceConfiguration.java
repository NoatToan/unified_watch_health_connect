package com.xiaomi.fitness.sleep.trace;

import android.app.Notification;
import android.content.Context;
import com.xiaomi.fitness.instance.InstanceExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\fJ\u0016\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006J&\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u001d¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceConfiguration;", "", "<init>", "()V", "setSleepPredictCycles", "count", "", "setForegroundNotification", "notification", "Landroid/app/Notification;", "setDebugMode", "debugMode", "", "setSamplingRateWhenSleepPredict", "rate", "setSamplingRateWhenSleeping", "setSamplingRateWhenWakeupPredict", "setTraceDuration", "durationSec", "setEnable", "enable", "setSleepSchedule", "sleepTime", "wakeupTime", "sleepHour", "sleepMin", "wakeHour", "wakeMin", "apply", "", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepTraceConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);
    public static final int STATUS_SNORE_DETECTION_SWITCH_CLOSE = 0;
    public static final int STATUS_SNORE_DETECTION_SWITCH_CLOSE_ONCE = 1;
    public static final int STATUS_SNORE_DETECTION_SWITCH_OPEN = 2;
    private static final int earliestSleepHourOfDay;
    private static final int earliestSleepMin;
    private static final int earliestSleepTime;
    private static final int earliestWakeHourOfDay;
    private static final int earliestWakeMin;
    private static final int earliestWakeTime;

    @Nullable
    private static Notification foregroundNotification;
    private static final boolean isCustomSleepSchedule;
    private static boolean isDebugMode;

    @Nullable
    private static final ConfigurationInternal mConfiguration;
    private static final int samplingRateWhenSleepPredict;
    private static final int samplingRateWhenSleeping;
    private static final int samplingRateWhenWakeupPredict;
    private static final int sleepPredictCycles;
    private static final int traceDuration;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020.J\u000e\u00100\u001a\u0002012\u0006\u0010-\u001a\u00020.J\u000e\u00102\u001a\u00020\u00072\u0006\u0010-\u001a\u00020.R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u001e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R\u0011\u0010\u001f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010!\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0011\u0010#\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014R\u0011\u0010%\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u0011\u0010'\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0014R\u0011\u0010)\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0014¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceConfiguration$Companion;", "", "<init>", "()V", "mConfiguration", "Lcom/xiaomi/fitness/sleep/trace/ConfigurationInternal;", "STATUS_SNORE_DETECTION_SWITCH_CLOSE", "", "STATUS_SNORE_DETECTION_SWITCH_CLOSE_ONCE", "STATUS_SNORE_DETECTION_SWITCH_OPEN", "value", "Landroid/app/Notification;", "foregroundNotification", "getForegroundNotification", "()Landroid/app/Notification;", "", "isDebugMode", "()Z", "sleepPredictCycles", "getSleepPredictCycles", "()I", "isTestMode", "earliestSleepTime", "getEarliestSleepTime", "earliestWakeTime", "getEarliestWakeTime", "earliestSleepHourOfDay", "getEarliestSleepHourOfDay", "earliestSleepMin", "getEarliestSleepMin", "isCustomSleepSchedule", "earliestWakeHourOfDay", "getEarliestWakeHourOfDay", "earliestWakeMin", "getEarliestWakeMin", "samplingRateWhenSleepPredict", "getSamplingRateWhenSleepPredict", "samplingRateWhenSleeping", "getSamplingRateWhenSleeping", "samplingRateWhenWakeupPredict", "getSamplingRateWhenWakeupPredict", "traceDuration", "getTraceDuration", "edit", "Lcom/xiaomi/fitness/sleep/trace/SleepTraceConfiguration;", "context", "Landroid/content/Context;", "isEnable", "setup", "", "getEnable", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepTraceConfiguration edit(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new SleepTraceConfiguration(null);
        }

        public final int getEarliestSleepHourOfDay() {
            return SleepTraceConfiguration.earliestSleepHourOfDay;
        }

        public final int getEarliestSleepMin() {
            return SleepTraceConfiguration.earliestSleepMin;
        }

        public final int getEarliestSleepTime() {
            return SleepTraceConfiguration.earliestSleepTime;
        }

        public final int getEarliestWakeHourOfDay() {
            return SleepTraceConfiguration.earliestWakeHourOfDay;
        }

        public final int getEarliestWakeMin() {
            return SleepTraceConfiguration.earliestWakeMin;
        }

        public final int getEarliestWakeTime() {
            return SleepTraceConfiguration.earliestWakeTime;
        }

        public final int getEnable(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ConfigurationInternal configurationInternal = SleepTraceConfiguration.mConfiguration;
            if (configurationInternal != null) {
                return configurationInternal.getEnable(context);
            }
            return 0;
        }

        @Nullable
        public final Notification getForegroundNotification() {
            return SleepTraceConfiguration.foregroundNotification;
        }

        public final int getSamplingRateWhenSleepPredict() {
            return SleepTraceConfiguration.samplingRateWhenSleepPredict;
        }

        public final int getSamplingRateWhenSleeping() {
            return SleepTraceConfiguration.samplingRateWhenSleeping;
        }

        public final int getSamplingRateWhenWakeupPredict() {
            return SleepTraceConfiguration.samplingRateWhenWakeupPredict;
        }

        public final int getSleepPredictCycles() {
            return SleepTraceConfiguration.sleepPredictCycles;
        }

        public final int getTraceDuration() {
            return SleepTraceConfiguration.traceDuration;
        }

        public final boolean isCustomSleepSchedule() {
            return SleepTraceConfiguration.isCustomSleepSchedule;
        }

        public final boolean isDebugMode() {
            return SleepTraceConfiguration.isDebugMode;
        }

        public final boolean isEnable(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ConfigurationInternal configurationInternal = SleepTraceConfiguration.mConfiguration;
            if (configurationInternal != null) {
                return configurationInternal.isEnable(context);
            }
            return false;
        }

        public final boolean isTestMode() {
            return false;
        }

        public final void setup(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ConfigurationInternal configurationInternal = SleepTraceConfiguration.mConfiguration;
            if (configurationInternal != null) {
                configurationInternal.setup(context);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        ConfigurationInternal configurationInternal = (ConfigurationInternal) InstanceExtKt.getInstance(Reflection.getOrCreateKotlinClass(ConfigurationInternal.class));
        mConfiguration = configurationInternal;
        foregroundNotification = configurationInternal != null ? configurationInternal.getForegroundNotification() : null;
        sleepPredictCycles = configurationInternal != null ? configurationInternal.getSleepPredictCycles() : 0;
        earliestSleepTime = configurationInternal != null ? configurationInternal.getEarliestSleepTime() : 0;
        earliestWakeTime = configurationInternal != null ? configurationInternal.getEarliestWakeTime() : 0;
        earliestSleepHourOfDay = configurationInternal != null ? configurationInternal.getEarliestSleepHourOfDay() : 0;
        earliestSleepMin = configurationInternal != null ? configurationInternal.getEarliestSleepMin() : 0;
        isCustomSleepSchedule = configurationInternal != null ? configurationInternal.isCustomSleepSchedule() : false;
        earliestWakeHourOfDay = configurationInternal != null ? configurationInternal.getEarliestWakeHourOfDay() : 0;
        earliestWakeMin = configurationInternal != null ? configurationInternal.getEarliestWakeMin() : 0;
        samplingRateWhenSleepPredict = configurationInternal != null ? configurationInternal.getSamplingRateWhenSleepPredict() : 0;
        samplingRateWhenSleeping = configurationInternal != null ? configurationInternal.getSamplingRateWhenSleeping() : 0;
        samplingRateWhenWakeupPredict = configurationInternal != null ? configurationInternal.getSamplingRateWhenWakeupPredict() : 0;
        traceDuration = configurationInternal != null ? configurationInternal.getTraceDuration() : 0;
    }

    private SleepTraceConfiguration() {
    }

    public /* synthetic */ SleepTraceConfiguration(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void apply() {
        ConfigurationInternal configurationInternal = mConfiguration;
        if (configurationInternal != null) {
            configurationInternal.apply();
        }
    }

    @NotNull
    public final SleepTraceConfiguration setDebugMode(boolean debugMode) {
        isDebugMode = debugMode;
        return this;
    }

    @NotNull
    public final SleepTraceConfiguration setEnable(boolean enable) {
        ConfigurationInternal configurationInternal = mConfiguration;
        if (configurationInternal != null) {
            configurationInternal.setEnable(enable);
        }
        return this;
    }

    @NotNull
    public final SleepTraceConfiguration setForegroundNotification(@NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        ConfigurationInternal configurationInternal = mConfiguration;
        if (configurationInternal != null) {
            configurationInternal.setForegroundNotification(notification);
        }
        return this;
    }

    @NotNull
    public final SleepTraceConfiguration setSamplingRateWhenSleepPredict(int rate) {
        ConfigurationInternal configurationInternal = mConfiguration;
        if (configurationInternal != null) {
            configurationInternal.setSamplingRateWhenSleepPredict(rate);
        }
        return this;
    }

    @NotNull
    public final SleepTraceConfiguration setSamplingRateWhenSleeping(int rate) {
        ConfigurationInternal configurationInternal = mConfiguration;
        if (configurationInternal != null) {
            configurationInternal.setSamplingRateWhenSleeping(rate);
        }
        return this;
    }

    @NotNull
    public final SleepTraceConfiguration setSamplingRateWhenWakeupPredict(int rate) {
        ConfigurationInternal configurationInternal = mConfiguration;
        if (configurationInternal != null) {
            configurationInternal.setSamplingRateWhenWakeupPredict(rate);
        }
        return this;
    }

    @NotNull
    public final SleepTraceConfiguration setSleepPredictCycles(int count) {
        ConfigurationInternal configurationInternal = mConfiguration;
        if (configurationInternal != null) {
            configurationInternal.setSleepPredictCycles(count);
        }
        return this;
    }

    @NotNull
    public final SleepTraceConfiguration setSleepSchedule(int sleepTime, int wakeupTime) {
        ConfigurationInternal configurationInternal = mConfiguration;
        if (configurationInternal != null) {
            configurationInternal.setSleepSchedule(sleepTime, wakeupTime);
        }
        return this;
    }

    @NotNull
    public final SleepTraceConfiguration setTraceDuration(int durationSec) {
        ConfigurationInternal configurationInternal = mConfiguration;
        if (configurationInternal != null) {
            configurationInternal.setTraceDuration(durationSec);
        }
        return this;
    }

    @NotNull
    public final SleepTraceConfiguration setSleepSchedule(int sleepHour, int sleepMin, int wakeHour, int wakeMin) {
        ConfigurationInternal configurationInternal = mConfiguration;
        if (configurationInternal != null) {
            configurationInternal.setSleepSchedule(sleepHour, sleepMin, wakeHour, wakeMin);
        }
        return this;
    }
}
