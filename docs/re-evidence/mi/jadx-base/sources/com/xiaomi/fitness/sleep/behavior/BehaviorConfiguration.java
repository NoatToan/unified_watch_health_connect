package com.xiaomi.fitness.sleep.behavior;

import android.content.Context;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.SensorCompat;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.sleep.trace.SleepTraceConfiguration;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b \bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\bJ\u0006\u0010J\u001a\u00020HJ\u000e\u0010K\u001a\u00020H2\u0006\u0010L\u001a\u00020\bJ\u0006\u0010M\u001a\u00020\u0005J\u0006\u0010N\u001a\u00020HJ\u0006\u0010V\u001a\u00020HJ\u000e\u0010c\u001a\u00020\u00102\u0006\u0010d\u001a\u00020eJ\u000e\u0010f\u001a\u00020\u00102\u0006\u0010d\u001a\u00020eJ\u0016\u0010g\u001a\u00020\u00102\u0006\u0010d\u001a\u00020e2\u0006\u0010h\u001a\u00020\bJ\u000e\u0010i\u001a\u00020\u00102\u0006\u0010h\u001a\u00020\bJ\u000e\u0010j\u001a\u00020\u00102\u0006\u0010d\u001a\u00020eJ\u000e\u0010k\u001a\u00020\u00102\u0006\u0010d\u001a\u00020eJ\u000e\u0010l\u001a\u00020\u00102\u0006\u0010d\u001a\u00020eJ\u000e\u0010p\u001a\u00020\u00102\u0006\u0010d\u001a\u00020eJ\u000e\u0010q\u001a\u00020\u00102\u0006\u0010d\u001a\u00020eJ\u0016\u0010r\u001a\u00020\u00102\u0006\u0010d\u001a\u00020e2\u0006\u0010s\u001a\u00020\u0010J\u000e\u0010t\u001a\u00020\u00102\u0006\u0010d\u001a\u00020eJ\u0010\u0010w\u001a\u00020\u00102\u0006\u0010d\u001a\u00020eH\u0002J\u0010\u0010z\u001a\u00020H2\u0006\u0010{\u001a\u00020\u001cH\u0002J\u0010\u0010|\u001a\u00020H2\u0006\u0010@\u001a\u00020\bH\u0002J\u0019\u0010\u007f\u001a\u00020\u00102\u0006\u0010d\u001a\u00020e2\u0007\u0010\u0080\u0001\u001a\u00020\u0010H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000R+\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010'\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010&\u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$R+\u0010+\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00101\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010&\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u00104R+\u00106\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010&\u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\u000e\u0010:\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000R$\u0010A\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u00104R\u0011\u0010C\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bD\u0010\"R\u0011\u0010E\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bF\u0010\"R$\u0010O\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u00104R$\u0010Q\u001a\u00020\b2\u0006\u0010@\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010\"\"\u0004\bS\u0010$R$\u0010T\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u00104R$\u0010X\u001a\u00020\b2\u0006\u0010W\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010\"\"\u0004\bZ\u0010$R+\u0010[\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010&\u001a\u0004\b\\\u0010\"\"\u0004\b]\u0010$R+\u0010_\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010&\u001a\u0004\b`\u0010\u0006\"\u0004\ba\u00104R\u0011\u0010m\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010u\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010oR\u0014\u0010x\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\by\u0010oR\u0011\u0010}\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b~\u0010oR\u0013\u0010\u0081\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\"R\u0013\u0010\u0083\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\"¨\u0006\u0085\u0001"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/BehaviorConfiguration;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "isMultipleProcessListener", "", "()Z", "ACC_DEFAULT_SAMPLING", "", "ACC_DEFAULT_INTERNAL", "ACC_SENSOR_TYPE_DEFAULT", "", "DEFAULT_ACC_USELESS_DATA", "", "ACC_DATA_SIZE_TOLERANCE", "SNAIL_COLLECTOR_ACC_DIR_NAME", "", "SNORE_DECIBEL_DATA_FILE_NAME", "SNAIL_COLLECTOR_AUDIO_DIR_NAME", "AUDIO_COLLECTOR_DIR", "AUDIO_CONFIG_DIR_NAME", "AUDIO_RESULT_DIR_NAME", "AUDIO_FILE_NAME", "AUDIO_PROFILE_DESCRIPTION_FILE_NAME", "AUDIO_DESCRIPTION_FILE_NAME", "AUDIO_TEMP_RESULT_DIR_NAME", "PATTERN_Y_M_D", "STATUS_SNORE_DETECTION_SWITCH_CLOSE", "", "STATUS_SNORE_DETECTION_SWITCH_CLOSE_ONCE", "STATUS_SNORE_DETECTION_SWITCH_OPEN", "<set-?>", "KEY_SLEEP_START_DETECTION", "getKEY_SLEEP_START_DETECTION", "()J", "setKEY_SLEEP_START_DETECTION", "(J)V", "KEY_SLEEP_START_DETECTION$delegate", "Lkotlin/properties/ReadWriteProperty;", "KEY_LAST_WRITE_TIMESTAMP", "getKEY_LAST_WRITE_TIMESTAMP", "setKEY_LAST_WRITE_TIMESTAMP", "KEY_LAST_WRITE_TIMESTAMP$delegate", "KEY_SNORE_DETECTION_STATUS", "getKEY_SNORE_DETECTION_STATUS", "()I", "setKEY_SNORE_DETECTION_STATUS", "(I)V", "KEY_SNORE_DETECTION_STATUS$delegate", "KEY_SNORE_DETECTION_IN_PROGRESS", "getKEY_SNORE_DETECTION_IN_PROGRESS$sleep_trace_chinaProductRelease", "setKEY_SNORE_DETECTION_IN_PROGRESS$sleep_trace_chinaProductRelease", "(Z)V", "KEY_SNORE_DETECTION_IN_PROGRESS$delegate", "KEY_SNORE_REQUEST_STATUS", "getKEY_SNORE_REQUEST_STATUS", "setKEY_SNORE_REQUEST_STATUS", "KEY_SNORE_REQUEST_STATUS$delegate", "KEY_SNORE_DETECTION_FIRST_START_TIME", "KEY_SNORE_DETECTION_NEED_GENERATE_REPORT", "KEY_SNORE_DETECTION_FINISH_TIME", "AUDIO_CHANNELS", "AUDIO_SAMPLING_RATE", "AUDIO_ENCODING", "value", "isDeepLightSleepDetectionEnable", "setDeepLightSleepDetectionEnable", "snailSleepDetectionStartTime", "getSnailSleepDetectionStartTime", "lastWriteDataTimeStamp", "getLastWriteDataTimeStamp", "updateLastWriteDataTimeStamp", "", "time", "cleanLastWriteDataTimeStamp", "updateSleepDetectionStartTime", "startTime", "hasSleepDetectionStartTime", "cleanSleepDetectionStartTime", "isSleepSnoreDetectionEnable", "setSleepSnoreDetectionEnable", "sleepSnoreRequestStatus", "getSleepSnoreRequestStatus", "setSleepSnoreRequestStatus", "isSleepSnoreDetectionCloseOnce", "setSleepSnoreDetectionCloseOnce", "resetSnoreIfNeed", "timeMills", "snoreDetectionFirstStartTimeMills", "getSnoreDetectionFirstStartTimeMills", "setSnoreDetectionFirstStartTimeMills", "snoreDetectionFinishTimeMills", "getSnoreDetectionFinishTimeMills$sleep_trace_chinaProductRelease", "setSnoreDetectionFinishTimeMills$sleep_trace_chinaProductRelease", "snoreDetectionFinishTimeMills$delegate", "isSnoreNeedGenerateReport", "isSnoreNeedGenerateReport$sleep_trace_chinaProductRelease", "setSnoreNeedGenerateReport$sleep_trace_chinaProductRelease", "isSnoreNeedGenerateReport$delegate", "getTempResultDirAbsolutePath", "context", "Landroid/content/Context;", "getCurrentDayFilePath", "getAudioResultDir", "timeInMillis", "getAudioResultRelativeDir", "getSnailAudioConfigTempDirPath", "getSnailAudioResultTempPath", "getSnailTodayAudioResultPath", "snailTodayAudioResultRelativePath", "getSnailTodayAudioResultRelativePath", "()Ljava/lang/String;", "getAudioProfileDescriptionFilePath", "getAudioDescriptionFilePath", "getAudioDecibelFilePath", "decibleFileName", "getOriginAudioFilePath", "tempResultDirRelativePath", "getTempResultDirRelativePath", "getAudioRootPath", "spName", "getSpName", "setSleepSnoreDetectionSwitchStatus", "status", "setSleepSnoreRequestTimeValue", "audioRelativePath", "getAudioRelativePath", "getTodayAudioPath", "fileName", "scheduleGetUpTime", "getScheduleGetUpTime", "scheduleSleepTime", "getScheduleSleepTime", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBehaviorConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BehaviorConfiguration.kt\ncom/xiaomi/fitness/sleep/behavior/BehaviorConfiguration\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,336:1\n135#2,6:337\n135#2,6:343\n135#2,6:349\n135#2,6:355\n135#2,6:361\n135#2,6:367\n135#2,6:373\n*S KotlinDebug\n*F\n+ 1 BehaviorConfiguration.kt\ncom/xiaomi/fitness/sleep/behavior/BehaviorConfiguration\n*L\n72#1:337,6\n74#1:343,6\n76#1:349,6\n81#1:355,6\n86#1:361,6\n189#1:367,6\n194#1:373,6\n*E\n"})
public final class BehaviorConfiguration extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BehaviorConfiguration.class, "KEY_SLEEP_START_DETECTION", "getKEY_SLEEP_START_DETECTION()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BehaviorConfiguration.class, "KEY_LAST_WRITE_TIMESTAMP", "getKEY_LAST_WRITE_TIMESTAMP()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BehaviorConfiguration.class, "KEY_SNORE_DETECTION_STATUS", "getKEY_SNORE_DETECTION_STATUS()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BehaviorConfiguration.class, "KEY_SNORE_DETECTION_IN_PROGRESS", "getKEY_SNORE_DETECTION_IN_PROGRESS$sleep_trace_chinaProductRelease()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BehaviorConfiguration.class, "KEY_SNORE_REQUEST_STATUS", "getKEY_SNORE_REQUEST_STATUS()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BehaviorConfiguration.class, "snoreDetectionFinishTimeMills", "getSnoreDetectionFinishTimeMills$sleep_trace_chinaProductRelease()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BehaviorConfiguration.class, "isSnoreNeedGenerateReport", "isSnoreNeedGenerateReport$sleep_trace_chinaProductRelease()Z", 0))};
    public static final float ACC_DATA_SIZE_TOLERANCE = 0.3f;
    public static final long ACC_DEFAULT_INTERNAL = 500;
    public static final long ACC_DEFAULT_SAMPLING = 200;
    public static final double ACC_SENSOR_TYPE_DEFAULT = 1.0d;
    public static final int AUDIO_CHANNELS = 1;

    @NotNull
    private static final String AUDIO_COLLECTOR_DIR = "Audio";

    @NotNull
    private static final String AUDIO_CONFIG_DIR_NAME = "AudioConfig";

    @NotNull
    public static final String AUDIO_DESCRIPTION_FILE_NAME = "filelist.json";
    public static final int AUDIO_ENCODING = 2;

    @NotNull
    private static final String AUDIO_FILE_NAME = "origin_audio.raw";

    @NotNull
    private static final String AUDIO_PROFILE_DESCRIPTION_FILE_NAME = "statistic_info.json";

    @NotNull
    private static final String AUDIO_RESULT_DIR_NAME = "AudioResult";
    public static final int AUDIO_SAMPLING_RATE = 16000;

    @NotNull
    private static final String AUDIO_TEMP_RESULT_DIR_NAME = "TempStoreFile";
    public static final float DEFAULT_ACC_USELESS_DATA = 100.0f;

    @NotNull
    public static final BehaviorConfiguration INSTANCE;

    /* JADX INFO: renamed from: KEY_LAST_WRITE_TIMESTAMP$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_LAST_WRITE_TIMESTAMP;

    /* JADX INFO: renamed from: KEY_SLEEP_START_DETECTION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SLEEP_START_DETECTION;

    @NotNull
    private static String KEY_SNORE_DETECTION_FINISH_TIME = null;

    @NotNull
    private static String KEY_SNORE_DETECTION_FIRST_START_TIME = null;

    /* JADX INFO: renamed from: KEY_SNORE_DETECTION_IN_PROGRESS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SNORE_DETECTION_IN_PROGRESS;

    @NotNull
    private static String KEY_SNORE_DETECTION_NEED_GENERATE_REPORT = null;

    /* JADX INFO: renamed from: KEY_SNORE_DETECTION_STATUS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SNORE_DETECTION_STATUS;

    /* JADX INFO: renamed from: KEY_SNORE_REQUEST_STATUS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SNORE_REQUEST_STATUS;

    @NotNull
    private static final String PATTERN_Y_M_D = "yyyy-MM-dd";

    @NotNull
    public static final String SNAIL_COLLECTOR_ACC_DIR_NAME = "SnailCollectorAcc";

    @NotNull
    public static final String SNAIL_COLLECTOR_AUDIO_DIR_NAME = "SnailCollector";

    @NotNull
    public static final String SNORE_DECIBEL_DATA_FILE_NAME = "snore_info.dat";
    public static final int STATUS_SNORE_DETECTION_SWITCH_CLOSE = 0;
    public static final int STATUS_SNORE_DETECTION_SWITCH_CLOSE_ONCE = 1;
    public static final int STATUS_SNORE_DETECTION_SWITCH_OPEN = 2;

    /* JADX INFO: renamed from: isSnoreNeedGenerateReport$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty isSnoreNeedGenerateReport;

    /* JADX INFO: renamed from: snoreDetectionFinishTimeMills$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty snoreDetectionFinishTimeMills;

    @NotNull
    private static final String spName;

    static {
        BehaviorConfiguration behaviorConfiguration = new BehaviorConfiguration();
        INSTANCE = behaviorConfiguration;
        KEY_SLEEP_START_DETECTION = behaviorConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0L, "sleep_detection_start", true);
        KEY_LAST_WRITE_TIMESTAMP = behaviorConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0L, "last_write_data_time", true);
        KEY_SNORE_DETECTION_STATUS = behaviorConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration$special$$inlined$bindToPreferenceField$default$3
        }.getType(), 0, "sleep_snore_detection_status", true);
        KEY_SNORE_DETECTION_IN_PROGRESS = behaviorConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration$special$$inlined$bindToPreferenceField$default$4
        }.getType(), Boolean.FALSE, "sleep_snore_detection_completed", true);
        KEY_SNORE_REQUEST_STATUS = behaviorConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration$special$$inlined$bindToPreferenceField$default$5
        }.getType(), 0L, "sleep_snore_REQUEST_status", true);
        KEY_SNORE_DETECTION_FIRST_START_TIME = "sleep_snore_detection_first_time";
        KEY_SNORE_DETECTION_NEED_GENERATE_REPORT = "sn_g_r";
        KEY_SNORE_DETECTION_FINISH_TIME = "sndf_t";
        snoreDetectionFinishTimeMills = behaviorConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration$special$$inlined$bindToPreferenceField$default$6
        }.getType(), 0L, KEY_SNORE_DETECTION_FINISH_TIME, true);
        isSnoreNeedGenerateReport = behaviorConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration$special$$inlined$bindToPreferenceField$default$7
        }.getType(), Boolean.TRUE, KEY_SNORE_DETECTION_NEED_GENERATE_REPORT, true);
        spName = "snail_sleep.cfg";
    }

    private BehaviorConfiguration() {
    }

    private final String getAudioRootPath(Context context) {
        return FileUtils.getFilesPath(context);
    }

    private final long getKEY_LAST_WRITE_TIMESTAMP() {
        return ((Number) KEY_LAST_WRITE_TIMESTAMP.getValue(this, $$delegatedProperties[1])).longValue();
    }

    private final long getKEY_SLEEP_START_DETECTION() {
        return ((Number) KEY_SLEEP_START_DETECTION.getValue(this, $$delegatedProperties[0])).longValue();
    }

    private final String getTempResultDirRelativePath() {
        return getAudioRelativePath() + File.separator + AUDIO_TEMP_RESULT_DIR_NAME;
    }

    private final String getTodayAudioPath(Context context, String fileName) {
        return getSnailTodayAudioResultPath(context) + File.separator + fileName;
    }

    private final void setKEY_LAST_WRITE_TIMESTAMP(long j) {
        KEY_LAST_WRITE_TIMESTAMP.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    private final void setKEY_SLEEP_START_DETECTION(long j) {
        KEY_SLEEP_START_DETECTION.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    private final void setSleepSnoreDetectionSwitchStatus(int status) {
        LogExtKt.logi("switch sleep snore detect to " + status);
        setKEY_SNORE_DETECTION_STATUS(status);
    }

    private final void setSleepSnoreRequestTimeValue(long value) {
        LogExtKt.logi("setSleepSnoreRequestStatus " + value);
        setKEY_SNORE_REQUEST_STATUS(value);
    }

    public final void cleanLastWriteDataTimeStamp() {
        remove("last_write_data_time");
    }

    public final void cleanSleepDetectionStartTime() {
        remove("sleep_detection_start");
    }

    @NotNull
    public final String getAudioDecibelFilePath(@NotNull Context context, @NotNull String decibleFileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(decibleFileName, "decibleFileName");
        return getTodayAudioPath(context, decibleFileName + ".json");
    }

    @NotNull
    public final String getAudioDescriptionFilePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getTodayAudioPath(context, AUDIO_DESCRIPTION_FILE_NAME);
    }

    @NotNull
    public final String getAudioProfileDescriptionFilePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getTodayAudioPath(context, AUDIO_PROFILE_DESCRIPTION_FILE_NAME);
    }

    @NotNull
    public final String getAudioRelativePath() {
        return SNAIL_COLLECTOR_AUDIO_DIR_NAME + File.separator + AUDIO_COLLECTOR_DIR;
    }

    @NotNull
    public final String getAudioResultDir(@NotNull Context context, long timeInMillis) {
        Intrinsics.checkNotNullParameter(context, "context");
        String date = TimeUtils.formatDate("yyyy-MM-dd", Long.valueOf(timeInMillis));
        String audioRootPath = getAudioRootPath(context);
        String str = File.separator;
        return audioRootPath + str + getAudioRelativePath() + str + date + str + AUDIO_RESULT_DIR_NAME;
    }

    @NotNull
    public final String getAudioResultRelativeDir(long timeInMillis) {
        String date = TimeUtils.formatDate("yyyy-MM-dd", Long.valueOf(timeInMillis));
        String audioRelativePath = getAudioRelativePath();
        String str = File.separator;
        return audioRelativePath + str + date + str + AUDIO_RESULT_DIR_NAME;
    }

    @NotNull
    public final String getCurrentDayFilePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String date = TimeUtils.formatDate("yyyy-MM-dd", Long.valueOf(System.currentTimeMillis()));
        String audioRootPath = getAudioRootPath(context);
        String str = File.separator;
        return audioRootPath + str + getAudioRelativePath() + str + date;
    }

    public final boolean getKEY_SNORE_DETECTION_IN_PROGRESS$sleep_trace_chinaProductRelease() {
        return ((Boolean) KEY_SNORE_DETECTION_IN_PROGRESS.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final int getKEY_SNORE_DETECTION_STATUS() {
        return ((Number) KEY_SNORE_DETECTION_STATUS.getValue(this, $$delegatedProperties[2])).intValue();
    }

    public final long getKEY_SNORE_REQUEST_STATUS() {
        return ((Number) KEY_SNORE_REQUEST_STATUS.getValue(this, $$delegatedProperties[4])).longValue();
    }

    public final long getLastWriteDataTimeStamp() {
        return getKEY_LAST_WRITE_TIMESTAMP();
    }

    @NotNull
    public final String getOriginAudioFilePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String audioRootPath = getAudioRootPath(context);
        String str = File.separator;
        return audioRootPath + str + getAudioRelativePath() + str + AUDIO_FILE_NAME;
    }

    public final long getScheduleGetUpTime() {
        SleepTraceConfiguration.Companion companion = SleepTraceConfiguration.INSTANCE;
        return TimeUtils.getTodayOffsetMills(0, companion.getEarliestWakeHourOfDay(), companion.getEarliestWakeHourOfDay());
    }

    public final long getScheduleSleepTime() {
        SleepTraceConfiguration.Companion companion = SleepTraceConfiguration.INSTANCE;
        int earliestWakeHourOfDay = companion.getEarliestWakeHourOfDay();
        int earliestSleepHourOfDay = companion.getEarliestSleepHourOfDay();
        return TimeUtils.getTodayOffsetMills(earliestWakeHourOfDay > earliestSleepHourOfDay ? 0 : -1, earliestSleepHourOfDay, companion.getEarliestSleepMin());
    }

    public final long getSleepSnoreRequestStatus() {
        return getKEY_SNORE_REQUEST_STATUS();
    }

    @NotNull
    public final String getSnailAudioConfigTempDirPath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String path = FileUtils.INSTANCE.createDirInFiles(context, getTempResultDirRelativePath() + File.separator + AUDIO_CONFIG_DIR_NAME).getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    @NotNull
    public final String getSnailAudioResultTempPath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String path = FileUtils.INSTANCE.createDirInFiles(context, getTempResultDirRelativePath() + File.separator + AUDIO_RESULT_DIR_NAME).getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    public final long getSnailSleepDetectionStartTime() {
        return getKEY_SLEEP_START_DETECTION();
    }

    @NotNull
    public final String getSnailTodayAudioResultPath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String path = FileUtils.INSTANCE.createDirInFiles(context, getSnailTodayAudioResultRelativePath()).getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    @NotNull
    public final String getSnailTodayAudioResultRelativePath() {
        return getAudioResultRelativeDir(System.currentTimeMillis());
    }

    public final long getSnoreDetectionFinishTimeMills$sleep_trace_chinaProductRelease() {
        return ((Number) snoreDetectionFinishTimeMills.getValue(this, $$delegatedProperties[5])).longValue();
    }

    public final long getSnoreDetectionFirstStartTimeMills() {
        return getPreferences().getLong(KEY_SNORE_DETECTION_FIRST_START_TIME, 0L);
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return spName;
    }

    @NotNull
    public final String getTempResultDirAbsolutePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getAudioRootPath(context) + File.separator + getTempResultDirRelativePath();
    }

    public final boolean hasSleepDetectionStartTime() {
        return getKEY_SLEEP_START_DETECTION() != 0;
    }

    public final boolean isDeepLightSleepDetectionEnable() {
        return ((Boolean) getValue("deep_light_sleep_detection_enable", Boolean.valueOf(SensorCompat.INSTANCE.hasNonWakeUpSensor(ApplicationExtKt.getApplication(), 1)))).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    /* JADX INFO: renamed from: isMultipleProcessListener */
    public boolean getIsMultipleProcessListener() {
        return true;
    }

    public final boolean isSleepSnoreDetectionCloseOnce() {
        return getKEY_SNORE_DETECTION_STATUS() == 1;
    }

    public final boolean isSleepSnoreDetectionEnable() {
        return SleepTraceConfiguration.INSTANCE.isEnable(ApplicationExtKt.getApplication()) && getKEY_SNORE_DETECTION_STATUS() == 2;
    }

    public final boolean isSnoreNeedGenerateReport$sleep_trace_chinaProductRelease() {
        return ((Boolean) isSnoreNeedGenerateReport.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    public final void resetSnoreIfNeed() {
        if (isSleepSnoreDetectionCloseOnce()) {
            setSleepSnoreDetectionEnable(true);
        }
    }

    public final void setDeepLightSleepDetectionEnable(boolean z) {
        putValue("deep_light_sleep_detection_enable", Boolean.valueOf(z));
    }

    public final void setKEY_SNORE_DETECTION_IN_PROGRESS$sleep_trace_chinaProductRelease(boolean z) {
        KEY_SNORE_DETECTION_IN_PROGRESS.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setKEY_SNORE_DETECTION_STATUS(int i) {
        KEY_SNORE_DETECTION_STATUS.setValue(this, $$delegatedProperties[2], Integer.valueOf(i));
    }

    public final void setKEY_SNORE_REQUEST_STATUS(long j) {
        KEY_SNORE_REQUEST_STATUS.setValue(this, $$delegatedProperties[4], Long.valueOf(j));
    }

    public final void setSleepSnoreDetectionCloseOnce(boolean z) {
        if (z) {
            setSleepSnoreDetectionSwitchStatus(1);
        }
    }

    public final void setSleepSnoreDetectionEnable(boolean z) {
        if (z) {
            setSleepSnoreDetectionSwitchStatus(2);
        } else {
            setSleepSnoreDetectionSwitchStatus(0);
        }
    }

    public final void setSleepSnoreRequestStatus(long j) {
        setSleepSnoreRequestTimeValue(j);
    }

    public final void setSnoreDetectionFinishTimeMills$sleep_trace_chinaProductRelease(long j) {
        snoreDetectionFinishTimeMills.setValue(this, $$delegatedProperties[5], Long.valueOf(j));
    }

    public final void setSnoreDetectionFirstStartTimeMills(long j) {
        getPreferences().edit().putLong(KEY_SNORE_DETECTION_FIRST_START_TIME, j).apply();
    }

    public final void setSnoreNeedGenerateReport$sleep_trace_chinaProductRelease(boolean z) {
        isSnoreNeedGenerateReport.setValue(this, $$delegatedProperties[6], Boolean.valueOf(z));
    }

    public final void updateLastWriteDataTimeStamp(long time) {
        setKEY_LAST_WRITE_TIMESTAMP(time);
    }

    public final void updateSleepDetectionStartTime(long startTime) {
        setKEY_SLEEP_START_DETECTION(startTime);
    }
}
