package com.xiaomi.fitness.motion.recognition.stat;

import android.content.Context;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.motion.recognition.utils.SceneUtils;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.har.entity.ActivityEntity;
import defpackage.i71;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b;\u0010\u001cJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0015\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010,\u001a\u00020\r¢\u0006\u0004\b-\u0010$R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00102\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010/R\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010/R\u0014\u00104\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010/R\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010/R\u0014\u00106\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010/R\u0014\u00107\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010/R\u0014\u00108\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010/R\u0011\u00109\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/stat/SceneRecognitionStatHelper;", "", "Lcom/xiaomi/har/entity/ActivityEntity;", "activityEntity", "", EcgReportKey.dataSource, "", FitnessDBConstants.COL_IS_SLEEP_COMPLETE, "", "trackOneSceneRecogResult", "(Lcom/xiaomi/har/entity/ActivityEntity;Ljava/lang/String;Z)V", "filterUncompleteActivity", "(Lcom/xiaomi/har/entity/ActivityEntity;)Z", "", "startTime", "endTime", "getMinuteDiff", "(JJ)J", "event", "key", "value", "putCache", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "getCache", "(Ljava/lang/String;)Ljava/util/Map;", "removeCache", "clearCache", "()V", "Li71;", "result", "trackSceneRecognitionResult", "(Li71;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "prepareStart", "(Landroid/content/Context;J)V", "", "steps", "statStart", "(I)V", StatConstants.PARAM_START, "getTime", "(Z)J", "stopTime", "statStop", "SCENE_RECOGNITION_TYPE", "Ljava/lang/String;", "STEP_TYPE", "EVENT_START", "EVENT_STOP", "KEY_TIME", "KEY_DURATION_SINCE_LAST_STOP", "KEY_STEPS_SINCE_LAST_STOP", "KEY_DURATION_TO_WAKEUP", "KEY_DURATION_SINCE_LAST_START", "KEY_DURATION_TO_SLEEP", "isFirstStart", "()Z", "<init>", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SceneRecognitionStatHelper {

    @NotNull
    public static final String EVENT_START = "start_motor_perception";

    @NotNull
    public static final String EVENT_STOP = "stop_motor_perception";

    @NotNull
    public static final SceneRecognitionStatHelper INSTANCE = new SceneRecognitionStatHelper();

    @NotNull
    public static final String KEY_DURATION_SINCE_LAST_START = "duration_since_last_start";

    @NotNull
    public static final String KEY_DURATION_SINCE_LAST_STOP = "duration_since_last_stop";

    @NotNull
    public static final String KEY_DURATION_TO_SLEEP = "duration_to_sleep";

    @NotNull
    public static final String KEY_DURATION_TO_WAKEUP = "duration_to_wakeup";

    @NotNull
    public static final String KEY_STEPS_SINCE_LAST_STOP = "steps_since_last_stop";

    @NotNull
    public static final String KEY_TIME = "time";

    @NotNull
    public static final String SCENE_RECOGNITION_TYPE = "scene_recognition";

    @NotNull
    public static final String STEP_TYPE = "step";

    private SceneRecognitionStatHelper() {
    }

    private final boolean filterUncompleteActivity(ActivityEntity activityEntity) {
        long millis;
        Integer actType = activityEntity.getActType();
        if ((actType != null && actType.intValue() == 1) || ((actType != null && actType.intValue() == 2) || (actType != null && actType.intValue() == 4))) {
            millis = TimeUnit.MINUTES.toMillis(2L);
        } else {
            millis = (actType != null && actType.intValue() == 3) ? TimeUnit.SECONDS.toMillis(20L) : 0L;
        }
        return activityEntity.getContinued().longValue() >= millis;
    }

    private final long getMinuteDiff(long startTime, long endTime) {
        return ((long) (endTime > startTime ? 1 : -1)) * TimeUtils.INSTANCE.getMinsDistance(startTime, endTime);
    }

    private final void trackOneSceneRecogResult(ActivityEntity activityEntity, String dataSource, boolean isComplete) {
    }

    public final void clearCache() {
    }

    @Nullable
    public final Map<String, String> getCache(@Nullable String event) {
        return null;
    }

    public final long getTime(boolean start) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (start && getCache(EVENT_START) != null) {
            Map<String, String> cache = getCache(EVENT_START);
            Intrinsics.checkNotNull(cache);
            String str = cache.get("time");
            Intrinsics.checkNotNull(str);
            return Long.parseLong(str);
        }
        if (start || getCache(EVENT_STOP) == null) {
            return jCurrentTimeMillis;
        }
        Map<String, String> cache2 = getCache(EVENT_STOP);
        Intrinsics.checkNotNull(cache2);
        String str2 = cache2.get("time");
        Intrinsics.checkNotNull(str2);
        return Long.parseLong(str2);
    }

    public final boolean isFirstStart() {
        boolean z = getCache(EVENT_START) != null;
        SceneUtils.INSTANCE.sceneRecoDebug("motor perception is first start: " + z);
        return z;
    }

    public final void prepareStart(@NotNull Context context, long startTime) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void putCache(@Nullable String event, @Nullable String key, @Nullable String value) {
    }

    @NotNull
    public final Map<String, String> removeCache(@Nullable String event) {
        return new HashMap();
    }

    public final void statStart(int steps) {
        Map<String, String> cache = getCache(EVENT_START);
        Intrinsics.checkNotNull(cache);
        for (String str : cache.keySet()) {
            SceneUtils sceneUtils = SceneUtils.INSTANCE;
            Map<String, String> cache2 = getCache(EVENT_START);
            Intrinsics.checkNotNull(cache2);
            sceneUtils.sceneRecoDebug("statStart: " + str + ":" + ((Object) cache2.get(str)));
        }
        removeCache(EVENT_START);
    }

    public final void statStop(@NotNull Context context, long stopTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        removeCache(EVENT_STOP);
    }

    public final void trackSceneRecognitionResult(@Nullable i71 result, @NotNull String dataSource) {
        int stepCount;
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        int i = 0;
        if (result != null) {
            List<ActivityEntity> listA = result.a();
            Intrinsics.checkNotNull(listA);
            if (!listA.isEmpty()) {
                stepCount = 0;
                for (ActivityEntity activityEntity : listA) {
                    stepCount += activityEntity.getStepCount();
                    Intrinsics.checkNotNull(activityEntity);
                    trackOneSceneRecogResult(activityEntity, dataSource, true);
                }
            } else {
                stepCount = 0;
            }
            List<ActivityEntity> listE = result.e();
            Intrinsics.checkNotNull(listE);
            if (!listE.isEmpty()) {
                for (ActivityEntity activityEntity2 : listE) {
                    stepCount += activityEntity2.getStepCount();
                    Intrinsics.checkNotNull(activityEntity2);
                    if (filterUncompleteActivity(activityEntity2)) {
                        trackOneSceneRecogResult(activityEntity2, dataSource, false);
                    }
                }
            }
            i = stepCount;
        }
        if (isFirstStart()) {
            statStart(i);
        }
    }
}
