package com.xiaomi.fitness.sleep.trace;

import android.app.Notification;
import android.content.Context;
import android.content.SharedPreferences;
import com.amap.api.services.core.AMapException;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.sleep.trace.SleepTraceConfigurationImpl;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.sleep.trace.extensions.TraceInternalExtKt;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b%\u0018\u0000 Q2\u00020\u0001:\u0002QRB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010*\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u0011H\u0016J\u0010\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u0011H\u0016J\u0010\u0010>\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u0011H\u0016J\u0010\u0010?\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u0011H\u0016J\u0010\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u00020\u0011H\u0016J\u0010\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u0007H\u0016J\u0018\u0010D\u001a\u00020\u00012\u0006\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u0011H\u0016J(\u0010D\u001a\u00020\u00012\u0006\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00112\u0006\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u0011H\u0016J\b\u0010K\u001a\u00020.H\u0016J\b\u0010L\u001a\u00020\u0011H\u0016J\b\u0010M\u001a\u00020\u0011H\u0016J\b\u0010N\u001a\u00020\u0011H\u0016J\b\u0010O\u001a\u00020\u0011H\u0016J\b\u0010P\u001a\u00020\u0007H\u0002R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0014\u0010\"\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0013R\u0014\u0010$\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0013R\u0014\u0010&\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0013R\u0014\u0010(\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0013R\u000e\u0010/\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u00100\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u00101R\u0012\u00102\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u00101R\u0010\u00103\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00104\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u00105\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u00101R\u0012\u00106\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u00101R\u0012\u00107\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u00101R\u0012\u00108\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u00101R\u0012\u00109\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u00101¨\u0006S"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceConfigurationImpl;", "Lcom/xiaomi/fitness/sleep/trace/ConfigurationInternal;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sEnable", "", "Ljava/lang/Boolean;", "mInitialized", "foregroundNotification", "Landroid/app/Notification;", "getForegroundNotification", "()Landroid/app/Notification;", "setForegroundNotification", "(Landroid/app/Notification;)V", "sleepPredictCycles", "", "getSleepPredictCycles", "()I", "earliestSleepTime", "getEarliestSleepTime", "earliestWakeTime", "getEarliestWakeTime", "earliestSleepHourOfDay", "getEarliestSleepHourOfDay", "earliestSleepMin", "getEarliestSleepMin", "isCustomSleepSchedule", "()Z", "earliestWakeHourOfDay", "getEarliestWakeHourOfDay", "earliestWakeMin", "getEarliestWakeMin", "samplingRateWhenSleepPredict", "getSamplingRateWhenSleepPredict", "samplingRateWhenSleeping", "getSamplingRateWhenSleeping", "samplingRateWhenWakeupPredict", "getSamplingRateWhenWakeupPredict", "traceDuration", "getTraceDuration", "edit", "isEnable", "getEnable", "setup", "", "mContext", "mEarliestSleepTime", "Ljava/lang/Integer;", "mEarliestWakeTime", "mForegroundNotification", "mEnable", "mTraceDuration", "mSamplingRateWhenSleepPredict", "mSamplingRateWhenSleeping", "mSamplingRateWhenWakeupPredict", "mSleepPredictCycles", "setSleepPredictCycles", "count", "setSamplingRateWhenSleepPredict", "rate", "setSamplingRateWhenSleeping", "setSamplingRateWhenWakeupPredict", "setTraceDuration", "durationSec", "setEnable", "enable", "setSleepSchedule", "sleepTime", "wakeupTime", "sleepHour", "sleepMin", "wakeHour", "wakeMin", "apply", "getCurSleepHour", "getCurSleepMinute", "getCurWakeHour", "getCurWakeMinute", "updateProperties", "Companion", "SleepTracePreference", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepTraceConfigurationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepTraceConfigurationImpl.kt\ncom/xiaomi/fitness/sleep/trace/SleepTraceConfigurationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1#2:292\n*E\n"})
public final class SleepTraceConfigurationImpl implements ConfigurationInternal {
    private static final boolean DEF_ENABLE = false;

    @NotNull
    private static final String KEY_ENABLE = "enable";

    @NotNull
    private static final String TAG = "ConfigurationInternal";
    private final int earliestSleepHourOfDay;
    private final int earliestSleepMin;
    private final int earliestSleepTime;
    private final int earliestWakeHourOfDay;
    private final int earliestWakeMin;
    private final int earliestWakeTime;

    @Nullable
    private Notification foregroundNotification;
    private final boolean isCustomSleepSchedule;

    @NotNull
    private final Context mContext;

    @Nullable
    private Integer mEarliestSleepTime;

    @Nullable
    private Integer mEarliestWakeTime;

    @Nullable
    private Boolean mEnable;

    @Nullable
    private Notification mForegroundNotification;
    private boolean mInitialized;

    @Nullable
    private Integer mSamplingRateWhenSleepPredict;

    @Nullable
    private Integer mSamplingRateWhenSleeping;

    @Nullable
    private Integer mSamplingRateWhenWakeupPredict;

    @Nullable
    private Integer mSleepPredictCycles;

    @Nullable
    private Integer mTraceDuration;

    @Nullable
    private Boolean sEnable;
    private final int samplingRateWhenSleepPredict;
    private final int samplingRateWhenSleeping;
    private final int samplingRateWhenWakeupPredict;
    private final int sleepPredictCycles;
    private final int traceDuration;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b)\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R+\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R+\u0010\u001d\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0014\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R+\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0014\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R+\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0014\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012R+\u0010)\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0014\u001a\u0004\b*\u0010\u0010\"\u0004\b+\u0010\u0012R/\u0010-\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0014\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00103\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\n¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceConfigurationImpl$SleepTracePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "isMultipleProcessListener", "", "()Z", "DEF_TRACE_DURATION", "", "<set-?>", "RATE_SLEEPING", "getRATE_SLEEPING$sleep_trace_chinaProductRelease", "()I", "setRATE_SLEEPING$sleep_trace_chinaProductRelease", "(I)V", "RATE_SLEEPING$delegate", "Lkotlin/properties/ReadWriteProperty;", "RATE_PRE_SLEEP", "getRATE_PRE_SLEEP$sleep_trace_chinaProductRelease", "setRATE_PRE_SLEEP$sleep_trace_chinaProductRelease", "RATE_PRE_SLEEP$delegate", "RATE_PRE_WAKE", "getRATE_PRE_WAKE$sleep_trace_chinaProductRelease", "setRATE_PRE_WAKE$sleep_trace_chinaProductRelease", "RATE_PRE_WAKE$delegate", "PREDICT_CYCLES", "getPREDICT_CYCLES$sleep_trace_chinaProductRelease", "setPREDICT_CYCLES$sleep_trace_chinaProductRelease", "PREDICT_CYCLES$delegate", "TRACE_DURATION", "getTRACE_DURATION$sleep_trace_chinaProductRelease", "setTRACE_DURATION$sleep_trace_chinaProductRelease", "TRACE_DURATION$delegate", "EARLIEST_SLEEP", "getEARLIEST_SLEEP$sleep_trace_chinaProductRelease", "setEARLIEST_SLEEP$sleep_trace_chinaProductRelease", "EARLIEST_SLEEP$delegate", "EARLIEST_WAKE", "getEARLIEST_WAKE$sleep_trace_chinaProductRelease", "setEARLIEST_WAKE$sleep_trace_chinaProductRelease", "EARLIEST_WAKE$delegate", "NEED_RESET", "getNEED_RESET$sleep_trace_chinaProductRelease", "()Ljava/lang/Boolean;", "setNEED_RESET$sleep_trace_chinaProductRelease", "(Ljava/lang/Boolean;)V", "NEED_RESET$delegate", "isCustomSleepSchedule", "isCustomSleepSchedule$sleep_trace_chinaProductRelease", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSleepTraceConfigurationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepTraceConfigurationImpl.kt\ncom/xiaomi/fitness/sleep/trace/SleepTraceConfigurationImpl$SleepTracePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,291:1\n135#2,6:292\n135#2,6:298\n135#2,6:304\n135#2,6:310\n135#2,6:316\n135#2,6:322\n135#2,6:328\n149#2,5:334\n*S KotlinDebug\n*F\n+ 1 SleepTraceConfigurationImpl.kt\ncom/xiaomi/fitness/sleep/trace/SleepTraceConfigurationImpl$SleepTracePreference\n*L\n268#1:292,6\n270#1:298,6\n272#1:304,6\n274#1:310,6\n276#1:316,6\n280#1:322,6\n282#1:328,6\n284#1:334,5\n*E\n"})
    public static final class SleepTracePreference extends PreferenceSupport {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePreference.class, "RATE_SLEEPING", "getRATE_SLEEPING$sleep_trace_chinaProductRelease()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePreference.class, "RATE_PRE_SLEEP", "getRATE_PRE_SLEEP$sleep_trace_chinaProductRelease()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePreference.class, "RATE_PRE_WAKE", "getRATE_PRE_WAKE$sleep_trace_chinaProductRelease()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePreference.class, "PREDICT_CYCLES", "getPREDICT_CYCLES$sleep_trace_chinaProductRelease()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePreference.class, "TRACE_DURATION", "getTRACE_DURATION$sleep_trace_chinaProductRelease()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePreference.class, "EARLIEST_SLEEP", "getEARLIEST_SLEEP$sleep_trace_chinaProductRelease()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePreference.class, "EARLIEST_WAKE", "getEARLIEST_WAKE$sleep_trace_chinaProductRelease()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePreference.class, "NEED_RESET", "getNEED_RESET$sleep_trace_chinaProductRelease()Ljava/lang/Boolean;", 0))};
        private static final int DEF_TRACE_DURATION;

        /* JADX INFO: renamed from: EARLIEST_SLEEP$delegate, reason: from kotlin metadata */
        @NotNull
        private static final ReadWriteProperty EARLIEST_SLEEP;

        /* JADX INFO: renamed from: EARLIEST_WAKE$delegate, reason: from kotlin metadata */
        @NotNull
        private static final ReadWriteProperty EARLIEST_WAKE;

        @NotNull
        public static final SleepTracePreference INSTANCE;

        /* JADX INFO: renamed from: NEED_RESET$delegate, reason: from kotlin metadata */
        @NotNull
        private static final ReadWriteProperty NEED_RESET;

        /* JADX INFO: renamed from: PREDICT_CYCLES$delegate, reason: from kotlin metadata */
        @NotNull
        private static final ReadWriteProperty PREDICT_CYCLES;

        /* JADX INFO: renamed from: RATE_PRE_SLEEP$delegate, reason: from kotlin metadata */
        @NotNull
        private static final ReadWriteProperty RATE_PRE_SLEEP;

        /* JADX INFO: renamed from: RATE_PRE_WAKE$delegate, reason: from kotlin metadata */
        @NotNull
        private static final ReadWriteProperty RATE_PRE_WAKE;

        /* JADX INFO: renamed from: RATE_SLEEPING$delegate, reason: from kotlin metadata */
        @NotNull
        private static final ReadWriteProperty RATE_SLEEPING;

        /* JADX INFO: renamed from: TRACE_DURATION$delegate, reason: from kotlin metadata */
        @NotNull
        private static final ReadWriteProperty TRACE_DURATION;

        @NotNull
        private static final String spName;

        static {
            SleepTracePreference sleepTracePreference = new SleepTracePreference();
            INSTANCE = sleepTracePreference;
            spName = "sleep_trace.cfg";
            int millis = (int) TimeUnit.SECONDS.toMillis(7L);
            DEF_TRACE_DURATION = millis;
            RATE_SLEEPING = sleepTracePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sleep.trace.SleepTraceConfigurationImpl$SleepTracePreference$special$$inlined$bindToPreferenceField$default$1
            }.getType(), 120, "rate_sleeping", true);
            RATE_PRE_SLEEP = sleepTracePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sleep.trace.SleepTraceConfigurationImpl$SleepTracePreference$special$$inlined$bindToPreferenceField$default$2
            }.getType(), 15, "rate_pre_sleep", true);
            RATE_PRE_WAKE = sleepTracePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sleep.trace.SleepTraceConfigurationImpl$SleepTracePreference$special$$inlined$bindToPreferenceField$default$3
            }.getType(), 20, "rate_pre_wake", true);
            PREDICT_CYCLES = sleepTracePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sleep.trace.SleepTraceConfigurationImpl$SleepTracePreference$special$$inlined$bindToPreferenceField$default$4
            }.getType(), 6, "predict_cycles", true);
            TRACE_DURATION = sleepTracePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sleep.trace.SleepTraceConfigurationImpl$SleepTracePreference$special$$inlined$bindToPreferenceField$default$5
            }.getType(), Integer.valueOf(millis), "trace_duration", true);
            EARLIEST_SLEEP = sleepTracePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sleep.trace.SleepTraceConfigurationImpl$SleepTracePreference$special$$inlined$bindToPreferenceField$default$6
            }.getType(), Integer.valueOf(AMapException.CODE_AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR), "earliest_sleep", true);
            EARLIEST_WAKE = sleepTracePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sleep.trace.SleepTraceConfigurationImpl$SleepTracePreference$special$$inlined$bindToPreferenceField$default$7
            }.getType(), 600, "earliest_wake", true);
            NEED_RESET = sleepTracePreference.bindToPreferenceFieldNullable(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sleep.trace.SleepTraceConfigurationImpl$SleepTracePreference$special$$inlined$bindToPreferenceFieldNullable$default$1
            }.getType(), null, false);
        }

        private SleepTracePreference() {
        }

        public final int getEARLIEST_SLEEP$sleep_trace_chinaProductRelease() {
            return ((Number) EARLIEST_SLEEP.getValue(this, $$delegatedProperties[5])).intValue();
        }

        public final int getEARLIEST_WAKE$sleep_trace_chinaProductRelease() {
            return ((Number) EARLIEST_WAKE.getValue(this, $$delegatedProperties[6])).intValue();
        }

        @Nullable
        public final Boolean getNEED_RESET$sleep_trace_chinaProductRelease() {
            return (Boolean) NEED_RESET.getValue(this, $$delegatedProperties[7]);
        }

        public final int getPREDICT_CYCLES$sleep_trace_chinaProductRelease() {
            return ((Number) PREDICT_CYCLES.getValue(this, $$delegatedProperties[3])).intValue();
        }

        public final int getRATE_PRE_SLEEP$sleep_trace_chinaProductRelease() {
            return ((Number) RATE_PRE_SLEEP.getValue(this, $$delegatedProperties[1])).intValue();
        }

        public final int getRATE_PRE_WAKE$sleep_trace_chinaProductRelease() {
            return ((Number) RATE_PRE_WAKE.getValue(this, $$delegatedProperties[2])).intValue();
        }

        public final int getRATE_SLEEPING$sleep_trace_chinaProductRelease() {
            return ((Number) RATE_SLEEPING.getValue(this, $$delegatedProperties[0])).intValue();
        }

        @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
        @NotNull
        public String getSpName() {
            return spName;
        }

        public final int getTRACE_DURATION$sleep_trace_chinaProductRelease() {
            return ((Number) TRACE_DURATION.getValue(this, $$delegatedProperties[4])).intValue();
        }

        public final boolean isCustomSleepSchedule$sleep_trace_chinaProductRelease() {
            return getPreferences().contains("earliest_sleep") && getPreferences().contains("earliest_wake");
        }

        @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
        /* JADX INFO: renamed from: isMultipleProcessListener */
        public boolean getIsMultipleProcessListener() {
            return true;
        }

        public final void setEARLIEST_SLEEP$sleep_trace_chinaProductRelease(int i) {
            EARLIEST_SLEEP.setValue(this, $$delegatedProperties[5], Integer.valueOf(i));
        }

        public final void setEARLIEST_WAKE$sleep_trace_chinaProductRelease(int i) {
            EARLIEST_WAKE.setValue(this, $$delegatedProperties[6], Integer.valueOf(i));
        }

        public final void setNEED_RESET$sleep_trace_chinaProductRelease(@Nullable Boolean bool) {
            NEED_RESET.setValue(this, $$delegatedProperties[7], bool);
        }

        public final void setPREDICT_CYCLES$sleep_trace_chinaProductRelease(int i) {
            PREDICT_CYCLES.setValue(this, $$delegatedProperties[3], Integer.valueOf(i));
        }

        public final void setRATE_PRE_SLEEP$sleep_trace_chinaProductRelease(int i) {
            RATE_PRE_SLEEP.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
        }

        public final void setRATE_PRE_WAKE$sleep_trace_chinaProductRelease(int i) {
            RATE_PRE_WAKE.setValue(this, $$delegatedProperties[2], Integer.valueOf(i));
        }

        public final void setRATE_SLEEPING$sleep_trace_chinaProductRelease(int i) {
            RATE_SLEEPING.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
        }

        public final void setTRACE_DURATION$sleep_trace_chinaProductRelease(int i) {
            TRACE_DURATION.setValue(this, $$delegatedProperties[4], Integer.valueOf(i));
        }
    }

    public SleepTraceConfigurationImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SleepTracePreference sleepTracePreference = SleepTracePreference.INSTANCE;
        this.sleepPredictCycles = sleepTracePreference.getPREDICT_CYCLES$sleep_trace_chinaProductRelease();
        this.earliestSleepTime = sleepTracePreference.getEARLIEST_SLEEP$sleep_trace_chinaProductRelease();
        this.earliestWakeTime = sleepTracePreference.getEARLIEST_WAKE$sleep_trace_chinaProductRelease();
        this.earliestSleepHourOfDay = sleepTracePreference.getEARLIEST_SLEEP$sleep_trace_chinaProductRelease() / 100;
        this.earliestSleepMin = sleepTracePreference.getEARLIEST_SLEEP$sleep_trace_chinaProductRelease() % 100;
        this.isCustomSleepSchedule = sleepTracePreference.isCustomSleepSchedule$sleep_trace_chinaProductRelease();
        this.earliestWakeHourOfDay = sleepTracePreference.getEARLIEST_WAKE$sleep_trace_chinaProductRelease() / 100;
        this.earliestWakeMin = sleepTracePreference.getEARLIEST_WAKE$sleep_trace_chinaProductRelease() % 100;
        this.samplingRateWhenSleepPredict = sleepTracePreference.getRATE_PRE_SLEEP$sleep_trace_chinaProductRelease();
        this.samplingRateWhenSleeping = sleepTracePreference.getRATE_SLEEPING$sleep_trace_chinaProductRelease();
        this.samplingRateWhenWakeupPredict = sleepTracePreference.getRATE_PRE_WAKE$sleep_trace_chinaProductRelease();
        this.traceDuration = sleepTracePreference.getTRACE_DURATION$sleep_trace_chinaProductRelease();
        this.mContext = ApplicationExtKt.getSafeContext(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setup$lambda$1(SleepTraceConfigurationImpl this$0, final Context ctx, SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ctx, "$ctx");
        SleepTracePreference sleepTracePreference = SleepTracePreference.INSTANCE;
        Boolean nEED_RESET$sleep_trace_chinaProductRelease = sleepTracePreference.getNEED_RESET$sleep_trace_chinaProductRelease();
        StringBuilder sb = new StringBuilder();
        sb.append("setup: key=");
        sb.append(str);
        sb.append("::::");
        sb.append(nEED_RESET$sleep_trace_chinaProductRelease);
        if (Intrinsics.areEqual("key_need_reset", str) && Intrinsics.areEqual(sleepTracePreference.getNEED_RESET$sleep_trace_chinaProductRelease(), Boolean.TRUE)) {
            final boolean z = this$0.getEnable(ctx) == 1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setup: changedEnable=");
            sb2.append(z);
            if (AppUtil.INSTANCE.isMainThread()) {
                ExecutorHelper.runInBackground(new Runnable() { // from class: n0n
                    @Override // java.lang.Runnable
                    public final void run() {
                        SleepTraceConfigurationImpl.setup$lambda$1$lambda$0(ctx, z);
                    }
                });
            } else {
                SleepTraceScheduler.INSTANCE.onSleepTraceConfigChange(ctx, z);
            }
            this$0.sEnable = Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setup$lambda$1$lambda$0(Context ctx, boolean z) {
        Intrinsics.checkNotNullParameter(ctx, "$ctx");
        SleepTraceScheduler.INSTANCE.onSleepTraceConfigChange(ctx, z);
    }

    private final boolean updateProperties() {
        boolean z;
        Boolean bool = this.mEnable;
        boolean z2 = true;
        if (bool != null) {
            this.sEnable = bool;
            LogExtKt.logi("sleep trace enable " + bool);
            SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
            Context context = this.mContext;
            Boolean bool2 = this.sEnable;
            Intrinsics.checkNotNull(bool2);
            settingsPropertiesUtil.setBool(context, "enable", bool2.booleanValue());
            z = true;
        } else {
            z = false;
        }
        Integer num = this.mEarliestSleepTime;
        if (num != null) {
            SleepTracePreference sleepTracePreference = SleepTracePreference.INSTANCE;
            Intrinsics.checkNotNull(num);
            sleepTracePreference.setEARLIEST_SLEEP$sleep_trace_chinaProductRelease(num.intValue());
            z = true;
        }
        Integer num2 = this.mEarliestWakeTime;
        if (num2 != null) {
            SleepTracePreference sleepTracePreference2 = SleepTracePreference.INSTANCE;
            Intrinsics.checkNotNull(num2);
            sleepTracePreference2.setEARLIEST_WAKE$sleep_trace_chinaProductRelease(num2.intValue());
        } else {
            z2 = z;
        }
        Notification notification = this.mForegroundNotification;
        if (notification != null) {
            setForegroundNotification(notification);
        }
        Integer num3 = this.mTraceDuration;
        if (num3 != null) {
            SleepTracePreference sleepTracePreference3 = SleepTracePreference.INSTANCE;
            Intrinsics.checkNotNull(num3);
            sleepTracePreference3.setTRACE_DURATION$sleep_trace_chinaProductRelease(num3.intValue());
        }
        Integer num4 = this.mSamplingRateWhenSleepPredict;
        if (num4 != null) {
            SleepTracePreference sleepTracePreference4 = SleepTracePreference.INSTANCE;
            Intrinsics.checkNotNull(num4);
            sleepTracePreference4.setRATE_PRE_SLEEP$sleep_trace_chinaProductRelease(num4.intValue());
        }
        Integer num5 = this.mSamplingRateWhenSleeping;
        if (num5 != null) {
            SleepTracePreference sleepTracePreference5 = SleepTracePreference.INSTANCE;
            Intrinsics.checkNotNull(num5);
            sleepTracePreference5.setRATE_SLEEPING$sleep_trace_chinaProductRelease(num5.intValue());
        }
        Integer num6 = this.mSamplingRateWhenWakeupPredict;
        if (num6 != null) {
            SleepTracePreference sleepTracePreference6 = SleepTracePreference.INSTANCE;
            Intrinsics.checkNotNull(num6);
            sleepTracePreference6.setRATE_PRE_WAKE$sleep_trace_chinaProductRelease(num6.intValue());
        }
        Integer num7 = this.mSleepPredictCycles;
        if (num7 != null) {
            SleepTracePreference sleepTracePreference7 = SleepTracePreference.INSTANCE;
            Intrinsics.checkNotNull(num7);
            sleepTracePreference7.setPREDICT_CYCLES$sleep_trace_chinaProductRelease(num7.intValue());
        }
        return z2;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public void apply() {
        if (updateProperties()) {
            SleepTracePreference.INSTANCE.setNEED_RESET$sleep_trace_chinaProductRelease(Boolean.TRUE);
        }
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    @NotNull
    public ConfigurationInternal edit(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new SleepTraceConfigurationImpl(context);
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getCurSleepHour() {
        return SleepTracePreference.INSTANCE.getEARLIEST_SLEEP$sleep_trace_chinaProductRelease() / 100;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getCurSleepMinute() {
        return SleepTracePreference.INSTANCE.getEARLIEST_SLEEP$sleep_trace_chinaProductRelease() % 100;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getCurWakeHour() {
        return SleepTracePreference.INSTANCE.getEARLIEST_WAKE$sleep_trace_chinaProductRelease() / 100;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getCurWakeMinute() {
        return SleepTracePreference.INSTANCE.getEARLIEST_WAKE$sleep_trace_chinaProductRelease() % 100;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getEarliestSleepHourOfDay() {
        return this.earliestSleepHourOfDay;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getEarliestSleepMin() {
        return this.earliestSleepMin;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getEarliestSleepTime() {
        return this.earliestSleepTime;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getEarliestWakeHourOfDay() {
        return this.earliestWakeHourOfDay;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getEarliestWakeMin() {
        return this.earliestWakeMin;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getEarliestWakeTime() {
        return this.earliestWakeTime;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getEnable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (TraceInternalExtKt.getInstance(SleepTracerInternal.INSTANCE).isSupport()) {
            return SettingsPropertiesUtil.INSTANCE.getInt(context, "enable", -1);
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    @Nullable
    public Notification getForegroundNotification() {
        return this.foregroundNotification;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getSamplingRateWhenSleepPredict() {
        return this.samplingRateWhenSleepPredict;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getSamplingRateWhenSleeping() {
        return this.samplingRateWhenSleeping;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getSamplingRateWhenWakeupPredict() {
        return this.samplingRateWhenWakeupPredict;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getSleepPredictCycles() {
        return this.sleepPredictCycles;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public int getTraceDuration() {
        return this.traceDuration;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    /* JADX INFO: renamed from: isCustomSleepSchedule, reason: from getter */
    public boolean getIsCustomSleepSchedule() {
        return this.isCustomSleepSchedule;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public boolean isEnable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!TraceInternalExtKt.getInstance(SleepTracerInternal.INSTANCE).isSupport()) {
            return false;
        }
        if (this.sEnable == null) {
            this.sEnable = Boolean.valueOf(SettingsPropertiesUtil.INSTANCE.getBool(context, "enable", false));
        }
        LogExtKt.logi("sleep get enable: " + this.sEnable);
        Boolean bool = this.sEnable;
        Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    @NotNull
    public ConfigurationInternal setEnable(boolean enable) {
        this.mEnable = Boolean.valueOf(enable);
        return this;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public void setForegroundNotification(@Nullable Notification notification) {
        this.foregroundNotification = notification;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    @NotNull
    public ConfigurationInternal setSamplingRateWhenSleepPredict(int rate) {
        this.mSamplingRateWhenSleepPredict = Integer.valueOf(rate);
        return this;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    @NotNull
    public ConfigurationInternal setSamplingRateWhenSleeping(int rate) {
        this.mSamplingRateWhenSleeping = Integer.valueOf(rate);
        return this;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    @NotNull
    public ConfigurationInternal setSamplingRateWhenWakeupPredict(int rate) {
        this.mSamplingRateWhenWakeupPredict = Integer.valueOf(rate);
        return this;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    @NotNull
    public ConfigurationInternal setSleepPredictCycles(int count) {
        this.mSleepPredictCycles = Integer.valueOf(count);
        return this;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    @NotNull
    public ConfigurationInternal setSleepSchedule(int sleepTime, int wakeupTime) {
        return setSleepSchedule(sleepTime / 100, sleepTime % 100, wakeupTime / 100, wakeupTime % 100);
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    @NotNull
    public ConfigurationInternal setTraceDuration(int durationSec) {
        this.mTraceDuration = Integer.valueOf(durationSec);
        return this;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    public void setup(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.mInitialized) {
            return;
        }
        final Context safeContext = ApplicationExtKt.getSafeContext(context);
        SleepTraceScheduler.INSTANCE.init(safeContext, isEnable(safeContext));
        SleepTracePreference.INSTANCE.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o0n
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                SleepTraceConfigurationImpl.setup$lambda$1(this.f28621a, safeContext, sharedPreferences, str);
            }
        });
        this.mInitialized = true;
    }

    @Override // com.xiaomi.fitness.sleep.trace.ConfigurationInternal
    @NotNull
    public ConfigurationInternal setSleepSchedule(int sleepHour, int sleepMin, int wakeHour, int wakeMin) {
        if (sleepHour >= 0 && sleepMin >= 0 && wakeHour >= 0 && wakeMin >= 0) {
            if (sleepHour == wakeHour && sleepMin == wakeMin) {
                this.mEarliestSleepTime = null;
                this.mEarliestWakeTime = null;
            } else {
                this.mEarliestSleepTime = Integer.valueOf((sleepHour * 100) + sleepMin);
                this.mEarliestWakeTime = Integer.valueOf((wakeHour * 100) + wakeMin);
            }
            SleepTraceUtil.INSTANCE.sleepTrace("update sleep schedule: " + this.mEarliestSleepTime + " - " + this.mEarliestWakeTime, new Object[0]);
            return this;
        }
        throw new IllegalStateException("can't be negative.".toString());
    }
}
