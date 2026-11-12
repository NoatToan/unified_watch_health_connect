package com.xiaomi.fitness.motion.recognition;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecognitionScheduler;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\tJ\u0006\u0010A\u001a\u00020\tJ\u000e\u0010B\u001a\u00020?2\u0006\u0010@\u001a\u00020\tJ\b\u0010C\u001a\u00020\tH\u0007J\u000e\u0010D\u001a\u00020?2\u0006\u0010@\u001a\u00020\tJ\b\u0010E\u001a\u00020\tH\u0007J\u000e\u0010F\u001a\u00020?2\u0006\u0010G\u001a\u00020\tJ\u000e\u0010H\u001a\u00020\t2\u0006\u0010I\u001a\u00020\tJ\u0016\u0010J\u001a\u00020?2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0017J\u0006\u0010N\u001a\u00020\u0017J\u000e\u0010O\u001a\u00020?2\u0006\u0010@\u001a\u00020\tJ\u0006\u0010P\u001a\u00020\tJ\u000e\u0010Q\u001a\u00020?2\u0006\u0010@\u001a\u00020\tJ\u0006\u0010R\u001a\u00020\tJ\u000e\u0010S\u001a\u00020?2\u0006\u0010T\u001a\u00020\u0017J\u0006\u0010U\u001a\u00020\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\"R/\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u0010*\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u001e\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\"R+\u0010.\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u001e\u001a\u0004\b/\u0010\u000b\"\u0004\b0\u0010\"R+\u00102\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001e\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR+\u00106\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u001e\u001a\u0004\b7\u0010\u000b\"\u0004\b8\u0010\"R+\u0010:\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010\u001e\u001a\u0004\b;\u0010\u000b\"\u0004\b<\u0010\"¨\u0006V"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/SceneRecogConfiguration;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "SCHEDULE_CYCLE_DURATION", "", "getSCHEDULE_CYCLE_DURATION", "()J", "SCHEDULE_UPDATE_DURATION", "getSCHEDULE_UPDATE_DURATION", "DEFAULT_SAMPLE", "", "getDEFAULT_SAMPLE", "()I", "MAX_REPORT_LATENCY", "getMAX_REPORT_LATENCY", "OFFSET_OF_STOP_TIME_FOR_ANALYZE", "getOFFSET_OF_STOP_TIME_FOR_ANALYZE", "<set-?>", "", "KEY_AI_MOTOR_PERCEPTION_ENABLE", "getKEY_AI_MOTOR_PERCEPTION_ENABLE", "()Z", "setKEY_AI_MOTOR_PERCEPTION_ENABLE", "(Z)V", "KEY_AI_MOTOR_PERCEPTION_ENABLE$delegate", "Lkotlin/properties/ReadWriteProperty;", "KEY_LAST_SCENE_RECOGNIZE_END", "getKEY_LAST_SCENE_RECOGNIZE_END", "setKEY_LAST_SCENE_RECOGNIZE_END", "(J)V", "KEY_LAST_SCENE_RECOGNIZE_END$delegate", "KEY_LAST_SCENE_UNCOMPLETED_TIME", "getKEY_LAST_SCENE_UNCOMPLETED_TIME", "()Ljava/lang/Long;", "setKEY_LAST_SCENE_UNCOMPLETED_TIME", "(Ljava/lang/Long;)V", "KEY_LAST_SCENE_UNCOMPLETED_TIME$delegate", "KEY_LAST_SCENE_EVENT_TIME", "getKEY_LAST_SCENE_EVENT_TIME", "setKEY_LAST_SCENE_EVENT_TIME", "KEY_LAST_SCENE_EVENT_TIME$delegate", "KEY_START_COLLECT_TIME", "getKEY_START_COLLECT_TIME", "setKEY_START_COLLECT_TIME", "KEY_START_COLLECT_TIME$delegate", "KEY_ANALYZE_ENABLE", "getKEY_ANALYZE_ENABLE", "setKEY_ANALYZE_ENABLE", "KEY_ANALYZE_ENABLE$delegate", "KEY_LAST_MOTOR_PERCEPTION_START_TIME", "getKEY_LAST_MOTOR_PERCEPTION_START_TIME", "setKEY_LAST_MOTOR_PERCEPTION_START_TIME", "KEY_LAST_MOTOR_PERCEPTION_START_TIME$delegate", "KEY_LAST_MOTOR_PERCEPTION_STOP_TIME", "getKEY_LAST_MOTOR_PERCEPTION_STOP_TIME", "setKEY_LAST_MOTOR_PERCEPTION_STOP_TIME", "KEY_LAST_MOTOR_PERCEPTION_STOP_TIME$delegate", "setLastSceneRecognizeEnd", "", "time", "getLastSceneRecognizeEnd", "setLastMotorPerceptionStart", "getLastMotorPerceptionStart", "setLastMotorPerceptionStop", "getLastMotorPerceptionStop", "setLastUnCompleteMinStartTime", "minStartTime", "getLastUnCompleteMinStartTime", "defTime", "setAiMotorPerceptionEnable", "context", "Landroid/content/Context;", "isEnable", "getAiMotorPerceptionEnable", "setLastSceneEventTime", "getLastSceneEventTime", "setStartSceneCollectTime", "getStartSceneCollectTime", "setAnalyzeEnable", "enable", "getAnalyzeEnable", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSceneRecogConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneRecogConfiguration.kt\ncom/xiaomi/fitness/motion/recognition/SceneRecogConfiguration\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,178:1\n135#2,6:179\n135#2,6:185\n149#2,5:191\n135#2,6:196\n135#2,6:202\n135#2,6:208\n135#2,6:214\n135#2,6:220\n*S KotlinDebug\n*F\n+ 1 SceneRecogConfiguration.kt\ncom/xiaomi/fitness/motion/recognition/SceneRecogConfiguration\n*L\n30#1:179,6\n38#1:185,6\n46#1:191,5\n51#1:196,6\n58#1:202,6\n60#1:208,6\n65#1:214,6\n73#1:220,6\n*E\n"})
public final class SceneRecogConfiguration extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SceneRecogConfiguration.class, "KEY_AI_MOTOR_PERCEPTION_ENABLE", "getKEY_AI_MOTOR_PERCEPTION_ENABLE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SceneRecogConfiguration.class, "KEY_LAST_SCENE_RECOGNIZE_END", "getKEY_LAST_SCENE_RECOGNIZE_END()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SceneRecogConfiguration.class, "KEY_LAST_SCENE_UNCOMPLETED_TIME", "getKEY_LAST_SCENE_UNCOMPLETED_TIME()Ljava/lang/Long;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SceneRecogConfiguration.class, "KEY_LAST_SCENE_EVENT_TIME", "getKEY_LAST_SCENE_EVENT_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SceneRecogConfiguration.class, "KEY_START_COLLECT_TIME", "getKEY_START_COLLECT_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SceneRecogConfiguration.class, "KEY_ANALYZE_ENABLE", "getKEY_ANALYZE_ENABLE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SceneRecogConfiguration.class, "KEY_LAST_MOTOR_PERCEPTION_START_TIME", "getKEY_LAST_MOTOR_PERCEPTION_START_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SceneRecogConfiguration.class, "KEY_LAST_MOTOR_PERCEPTION_STOP_TIME", "getKEY_LAST_MOTOR_PERCEPTION_STOP_TIME()J", 0))};
    private static final int DEFAULT_SAMPLE;

    @NotNull
    public static final SceneRecogConfiguration INSTANCE;

    /* JADX INFO: renamed from: KEY_AI_MOTOR_PERCEPTION_ENABLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_AI_MOTOR_PERCEPTION_ENABLE;

    /* JADX INFO: renamed from: KEY_ANALYZE_ENABLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_ANALYZE_ENABLE;

    /* JADX INFO: renamed from: KEY_LAST_MOTOR_PERCEPTION_START_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_LAST_MOTOR_PERCEPTION_START_TIME;

    /* JADX INFO: renamed from: KEY_LAST_MOTOR_PERCEPTION_STOP_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_LAST_MOTOR_PERCEPTION_STOP_TIME;

    /* JADX INFO: renamed from: KEY_LAST_SCENE_EVENT_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_LAST_SCENE_EVENT_TIME;

    /* JADX INFO: renamed from: KEY_LAST_SCENE_RECOGNIZE_END$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_LAST_SCENE_RECOGNIZE_END;

    /* JADX INFO: renamed from: KEY_LAST_SCENE_UNCOMPLETED_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_LAST_SCENE_UNCOMPLETED_TIME;

    /* JADX INFO: renamed from: KEY_START_COLLECT_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_START_COLLECT_TIME;
    private static final int MAX_REPORT_LATENCY;
    private static final long OFFSET_OF_STOP_TIME_FOR_ANALYZE;
    private static final long SCHEDULE_CYCLE_DURATION;
    private static final long SCHEDULE_UPDATE_DURATION;

    @NotNull
    private static final String spName;

    static {
        SceneRecogConfiguration sceneRecogConfiguration = new SceneRecogConfiguration();
        INSTANCE = sceneRecogConfiguration;
        spName = "scene_recognize.cfg";
        long millis = TimeUnit.HOURS.toMillis(1L);
        SCHEDULE_CYCLE_DURATION = millis;
        SCHEDULE_UPDATE_DURATION = millis / ((long) 2);
        DEFAULT_SAMPLE = (int) TimeUnit.SECONDS.toMicros(1L);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        MAX_REPORT_LATENCY = (int) timeUnit.toMicros(15L);
        OFFSET_OF_STOP_TIME_FOR_ANALYZE = timeUnit.toMillis(3L);
        KEY_AI_MOTOR_PERCEPTION_ENABLE = sceneRecogConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.FALSE, "ai_motor_enable", true);
        KEY_LAST_SCENE_RECOGNIZE_END = sceneRecogConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration$special$$inlined$bindToPreferenceField$default$2
        }.getType(), Long.valueOf(System.currentTimeMillis()), "last_recognize_end", true);
        KEY_LAST_SCENE_UNCOMPLETED_TIME = sceneRecogConfiguration.bindToPreferenceFieldNullable(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration$special$$inlined$bindToPreferenceFieldNullable$default$1
        }.getType(), "last_uncompleted_time", true);
        KEY_LAST_SCENE_EVENT_TIME = sceneRecogConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration$special$$inlined$bindToPreferenceField$default$3
        }.getType(), -1L, "last_scene_event_time", true);
        KEY_START_COLLECT_TIME = sceneRecogConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration$special$$inlined$bindToPreferenceField$default$4
        }.getType(), -1L, "start_collect_time", true);
        KEY_ANALYZE_ENABLE = sceneRecogConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration$special$$inlined$bindToPreferenceField$default$5
        }.getType(), Boolean.TRUE, "analyze_enable", true);
        KEY_LAST_MOTOR_PERCEPTION_START_TIME = sceneRecogConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration$special$$inlined$bindToPreferenceField$default$6
        }.getType(), Long.valueOf(sceneRecogConfiguration.getLastSceneRecognizeEnd()), "last_motor_perception_start_time", true);
        KEY_LAST_MOTOR_PERCEPTION_STOP_TIME = sceneRecogConfiguration.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration$special$$inlined$bindToPreferenceField$default$7
        }.getType(), Long.valueOf(sceneRecogConfiguration.getLastSceneEventTime()), "last_motor_perception_stop_time", true);
    }

    private SceneRecogConfiguration() {
    }

    private final boolean getKEY_ANALYZE_ENABLE() {
        return ((Boolean) KEY_ANALYZE_ENABLE.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    private final long getKEY_LAST_MOTOR_PERCEPTION_START_TIME() {
        return ((Number) KEY_LAST_MOTOR_PERCEPTION_START_TIME.getValue(this, $$delegatedProperties[6])).longValue();
    }

    private final long getKEY_LAST_MOTOR_PERCEPTION_STOP_TIME() {
        return ((Number) KEY_LAST_MOTOR_PERCEPTION_STOP_TIME.getValue(this, $$delegatedProperties[7])).longValue();
    }

    private final long getKEY_LAST_SCENE_EVENT_TIME() {
        return ((Number) KEY_LAST_SCENE_EVENT_TIME.getValue(this, $$delegatedProperties[3])).longValue();
    }

    private final long getKEY_LAST_SCENE_RECOGNIZE_END() {
        return ((Number) KEY_LAST_SCENE_RECOGNIZE_END.getValue(this, $$delegatedProperties[1])).longValue();
    }

    private final Long getKEY_LAST_SCENE_UNCOMPLETED_TIME() {
        return (Long) KEY_LAST_SCENE_UNCOMPLETED_TIME.getValue(this, $$delegatedProperties[2]);
    }

    private final long getKEY_START_COLLECT_TIME() {
        return ((Number) KEY_START_COLLECT_TIME.getValue(this, $$delegatedProperties[4])).longValue();
    }

    @JvmStatic
    public static final long getLastMotorPerceptionStart() {
        return INSTANCE.getKEY_LAST_MOTOR_PERCEPTION_START_TIME();
    }

    @JvmStatic
    public static final long getLastMotorPerceptionStop() {
        return INSTANCE.getKEY_LAST_MOTOR_PERCEPTION_STOP_TIME();
    }

    private final void setKEY_ANALYZE_ENABLE(boolean z) {
        KEY_ANALYZE_ENABLE.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    private final void setKEY_LAST_MOTOR_PERCEPTION_START_TIME(long j) {
        KEY_LAST_MOTOR_PERCEPTION_START_TIME.setValue(this, $$delegatedProperties[6], Long.valueOf(j));
    }

    private final void setKEY_LAST_MOTOR_PERCEPTION_STOP_TIME(long j) {
        KEY_LAST_MOTOR_PERCEPTION_STOP_TIME.setValue(this, $$delegatedProperties[7], Long.valueOf(j));
    }

    private final void setKEY_LAST_SCENE_EVENT_TIME(long j) {
        KEY_LAST_SCENE_EVENT_TIME.setValue(this, $$delegatedProperties[3], Long.valueOf(j));
    }

    private final void setKEY_LAST_SCENE_RECOGNIZE_END(long j) {
        KEY_LAST_SCENE_RECOGNIZE_END.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    private final void setKEY_LAST_SCENE_UNCOMPLETED_TIME(Long l) {
        KEY_LAST_SCENE_UNCOMPLETED_TIME.setValue(this, $$delegatedProperties[2], l);
    }

    private final void setKEY_START_COLLECT_TIME(long j) {
        KEY_START_COLLECT_TIME.setValue(this, $$delegatedProperties[4], Long.valueOf(j));
    }

    public final boolean getAiMotorPerceptionEnable() {
        return getKEY_AI_MOTOR_PERCEPTION_ENABLE();
    }

    public final boolean getAnalyzeEnable() {
        return getKEY_ANALYZE_ENABLE();
    }

    public final int getDEFAULT_SAMPLE() {
        return DEFAULT_SAMPLE;
    }

    public final boolean getKEY_AI_MOTOR_PERCEPTION_ENABLE() {
        return ((Boolean) KEY_AI_MOTOR_PERCEPTION_ENABLE.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final long getLastSceneEventTime() {
        return getKEY_LAST_SCENE_EVENT_TIME();
    }

    public final long getLastSceneRecognizeEnd() {
        return getKEY_LAST_SCENE_RECOGNIZE_END();
    }

    public final long getLastUnCompleteMinStartTime(long defTime) {
        Long key_last_scene_uncompleted_time = getKEY_LAST_SCENE_UNCOMPLETED_TIME();
        return key_last_scene_uncompleted_time != null ? key_last_scene_uncompleted_time.longValue() : defTime;
    }

    public final int getMAX_REPORT_LATENCY() {
        return MAX_REPORT_LATENCY;
    }

    public final long getOFFSET_OF_STOP_TIME_FOR_ANALYZE() {
        return OFFSET_OF_STOP_TIME_FOR_ANALYZE;
    }

    public final long getSCHEDULE_CYCLE_DURATION() {
        return SCHEDULE_CYCLE_DURATION;
    }

    public final long getSCHEDULE_UPDATE_DURATION() {
        return SCHEDULE_UPDATE_DURATION;
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return spName;
    }

    public final long getStartSceneCollectTime() {
        return getKEY_START_COLLECT_TIME();
    }

    public final void setAiMotorPerceptionEnable(@NotNull Context context, boolean isEnable) {
        Intrinsics.checkNotNullParameter(context, "context");
        setKEY_AI_MOTOR_PERCEPTION_ENABLE(isEnable);
        Intent intent = new Intent(context, (Class<?>) SceneRecogBroadcastReceiver.class);
        if (isEnable) {
            intent.setAction(SceneRecognitionScheduler.INSTANCE.getACTION_START_RECOGNITION_SERVICE());
        } else {
            intent.setAction(SceneRecognitionScheduler.INSTANCE.getACTION_STOP_FOREVER_RECOGNITION_SERVICE());
        }
        intent.putExtra("from", SceneRecogBroadcastReceiver.FROM_USER);
        context.sendBroadcast(intent);
    }

    public final void setAnalyzeEnable(boolean enable) {
        setKEY_ANALYZE_ENABLE(enable);
    }

    public final void setKEY_AI_MOTOR_PERCEPTION_ENABLE(boolean z) {
        KEY_AI_MOTOR_PERCEPTION_ENABLE.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setLastMotorPerceptionStart(long time) {
        setKEY_LAST_MOTOR_PERCEPTION_START_TIME(time);
    }

    public final void setLastMotorPerceptionStop(long time) {
        setKEY_LAST_MOTOR_PERCEPTION_STOP_TIME(time);
    }

    public final void setLastSceneEventTime(long time) {
        setKEY_LAST_SCENE_EVENT_TIME(time);
    }

    public final void setLastSceneRecognizeEnd(long time) {
        setKEY_LAST_SCENE_RECOGNIZE_END(time);
    }

    public final void setLastUnCompleteMinStartTime(long minStartTime) {
        setKEY_LAST_SCENE_UNCOMPLETED_TIME(Long.valueOf(minStartTime));
    }

    public final void setStartSceneCollectTime(long time) {
        setKEY_START_COLLECT_TIME(time);
    }
}
