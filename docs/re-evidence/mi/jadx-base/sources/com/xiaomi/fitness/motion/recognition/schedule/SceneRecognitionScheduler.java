package com.xiaomi.fitness.motion.recognition.schedule;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration;
import com.xiaomi.fitness.motion.recognition.SceneRecognitionHelper;
import com.xiaomi.fitness.motion.recognition.analyze.SceneAnalyzeStateDispatch;
import com.xiaomi.fitness.motion.recognition.utils.SceneUtils;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.onetrack.c.q;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0018J \u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0018H\u0003J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003J\u0018\u0010#\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0018\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0005H\u0007J\u0018\u0010&\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0018\u0010(\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0016\u0010*\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u0018J\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010-\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010.\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\u001b\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/schedule/SceneRecognitionScheduler;", "", "<init>", "()V", q.f13858b, "", "kotlin.jvm.PlatformType", "getAppId", "()Ljava/lang/String;", "Ljava/lang/String;", "ACTION_STOP_RECOGNITION_SERVICE", "getACTION_STOP_RECOGNITION_SERVICE", "ACTION_STOP_FOREVER_RECOGNITION_SERVICE", "getACTION_STOP_FOREVER_RECOGNITION_SERVICE", "ACTION_START_RECOGNITION_SERVICE", "getACTION_START_RECOGNITION_SERVICE", "ACTION_AUTO_RECOGNITION_SERVICE", "ACTION_SCHEDULE_UPDATE_DURATION", "getACTION_SCHEDULE_UPDATE_DURATION", "ACTION_ANALYZE_ENABLE", "getACTION_ANALYZE_ENABLE", "ACTION_ANALYZE_DISABLE", "getACTION_ANALYZE_DISABLE", "WINDOW_MILLIS", "", "mSceneRecognitionHelper", "Lcom/xiaomi/fitness/motion/recognition/SceneRecognitionHelper;", "initializeScheduler", "", "context", "Landroid/content/Context;", "sleepTime", "wakeupTime", "initialize", "openAutoStartIfPossible", "sendEvent", "action", "onHandleAction", "performAction", "actionMethod", "createPendingIntentWithMethod", "Landroid/app/PendingIntent;", "performNextSchedule", "delay", "cancelSchedule", "performForceStartWhenWakeUp", "cancelForceStartAndStop", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneRecognitionScheduler {

    @NotNull
    private static final String ACTION_ANALYZE_DISABLE;

    @NotNull
    private static final String ACTION_ANALYZE_ENABLE;

    @NotNull
    private static final String ACTION_AUTO_RECOGNITION_SERVICE;

    @NotNull
    private static final String ACTION_SCHEDULE_UPDATE_DURATION;

    @NotNull
    private static final String ACTION_START_RECOGNITION_SERVICE;

    @NotNull
    private static final String ACTION_STOP_FOREVER_RECOGNITION_SERVICE;

    @NotNull
    private static final String ACTION_STOP_RECOGNITION_SERVICE;

    @NotNull
    public static final SceneRecognitionScheduler INSTANCE = new SceneRecognitionScheduler();
    private static final long WINDOW_MILLIS;
    private static final String appId;

    @NotNull
    private static final SceneRecognitionHelper mSceneRecognitionHelper;

    static {
        String packageName = ApplicationExtKt.getApplication().getPackageName();
        appId = packageName;
        ACTION_STOP_RECOGNITION_SERVICE = packageName + ".action.STOP_RECOGNITION_SERVICE";
        ACTION_STOP_FOREVER_RECOGNITION_SERVICE = packageName + ".action.STOP_FOREVER_RECOGNITION_SERVICE";
        ACTION_START_RECOGNITION_SERVICE = packageName + ".action.START_RECOGNITION_SERVICE";
        ACTION_AUTO_RECOGNITION_SERVICE = packageName + ".action.AUTO_RECOGNITION_SERVICE";
        ACTION_SCHEDULE_UPDATE_DURATION = packageName + ".action.ACTION_SCHEDULE_UPDATE_DURATION";
        ACTION_ANALYZE_ENABLE = packageName + ".action.ACTION_ANALYZE_ENABLE";
        ACTION_ANALYZE_DISABLE = packageName + ".action.ACTION_ANALYZE_DISABLE";
        WINDOW_MILLIS = TimeUnit.HOURS.toMillis(3L);
        mSceneRecognitionHelper = new SceneRecognitionHelperImp();
    }

    private SceneRecognitionScheduler() {
    }

    private final PendingIntent createPendingIntentWithMethod(Context context, String action) {
        Intent intentPutExtra = new Intent(context, (Class<?>) SceneRecogBroadcastReceiver.class).setAction(action).addFlags(32).putExtra("from", "app");
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return PendingIntentExtKt.getBroadcastPendingIntent$default(context, 0, intentPutExtra, 0, 4, null);
    }

    private final void initialize(Context context, long sleepTime, long wakeupTime) {
        SceneUtils sceneUtils = SceneUtils.INSTANCE;
        sceneUtils.sceneRecoTrace("scene-sche init, sleepTime=" + sleepTime + ", wakeupTime=" + wakeupTime);
        openAutoStartIfPossible(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object systemService = context.getSystemService((Class<Object>) AlarmManager.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "getSystemService(...)");
        AlarmManager alarmManager = (AlarmManager) systemService;
        String str = ACTION_STOP_RECOGNITION_SERVICE;
        PendingIntent pendingIntentCreatePendingIntentWithMethod = createPendingIntentWithMethod(context, str);
        String str2 = ACTION_START_RECOGNITION_SERVICE;
        PendingIntent pendingIntentCreatePendingIntentWithMethod2 = createPendingIntentWithMethod(context, str2);
        alarmManager.cancel(pendingIntentCreatePendingIntentWithMethod);
        alarmManager.cancel(pendingIntentCreatePendingIntentWithMethod2);
        if (1 + sleepTime <= jCurrentTimeMillis && jCurrentTimeMillis < wakeupTime) {
            sendEvent(context, str);
            return;
        }
        alarmManager.set(0, sleepTime, pendingIntentCreatePendingIntentWithMethod);
        sceneUtils.sceneRecoTrace("schedule stop recognition service @ " + sleepTime);
        sendEvent(context, str2);
    }

    private final void openAutoStartIfPossible(Context context) {
    }

    private final void performAction(Context context, String actionMethod) {
        mSceneRecognitionHelper.handleAction(context, actionMethod);
    }

    private final void sendEvent(Context context, String action) {
        Intent intentPutExtra = new Intent(context, (Class<?>) SceneRecogBroadcastReceiver.class).setAction(action).putExtra("from", "app");
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        context.sendBroadcast(intentPutExtra);
    }

    public final void cancelForceStartAndStop(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) AlarmManager.class);
        Objects.requireNonNull(systemService);
        Intrinsics.checkNotNullExpressionValue(systemService, "requireNonNull(...)");
        AlarmManager alarmManager = (AlarmManager) systemService;
        PendingIntent pendingIntentCreatePendingIntentWithMethod = createPendingIntentWithMethod(context, ACTION_START_RECOGNITION_SERVICE);
        PendingIntent pendingIntentCreatePendingIntentWithMethod2 = createPendingIntentWithMethod(context, ACTION_STOP_RECOGNITION_SERVICE);
        alarmManager.cancel(pendingIntentCreatePendingIntentWithMethod);
        alarmManager.cancel(pendingIntentCreatePendingIntentWithMethod2);
    }

    public final void cancelSchedule(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PendingIntent broadcastPendingIntent$default = PendingIntentExtKt.getBroadcastPendingIntent$default(context, 0, new Intent(context, (Class<?>) SceneRecogBroadcastReceiver.class), 0, 4, null);
        Object systemService = context.getSystemService(DialWidgetType.ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).cancel(broadcastPendingIntent$default);
    }

    @NotNull
    public final String getACTION_ANALYZE_DISABLE() {
        return ACTION_ANALYZE_DISABLE;
    }

    @NotNull
    public final String getACTION_ANALYZE_ENABLE() {
        return ACTION_ANALYZE_ENABLE;
    }

    @NotNull
    public final String getACTION_SCHEDULE_UPDATE_DURATION() {
        return ACTION_SCHEDULE_UPDATE_DURATION;
    }

    @NotNull
    public final String getACTION_START_RECOGNITION_SERVICE() {
        return ACTION_START_RECOGNITION_SERVICE;
    }

    @NotNull
    public final String getACTION_STOP_FOREVER_RECOGNITION_SERVICE() {
        return ACTION_STOP_FOREVER_RECOGNITION_SERVICE;
    }

    @NotNull
    public final String getACTION_STOP_RECOGNITION_SERVICE() {
        return ACTION_STOP_RECOGNITION_SERVICE;
    }

    public final String getAppId() {
        return appId;
    }

    public final void initializeScheduler(@NotNull Context context, long sleepTime, long wakeupTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (SceneRecogConfiguration.INSTANCE.getAiMotorPerceptionEnable()) {
            initialize(context, sleepTime, wakeupTime);
        }
    }

    public final void onHandleAction(@NotNull Context context, @NotNull String action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        SceneUtils sceneUtils = SceneUtils.INSTANCE;
        sceneUtils.sceneRecoTrace("handle act: " + action);
        if (Intrinsics.areEqual(action, ACTION_AUTO_RECOGNITION_SERVICE)) {
            performAction(context, SceneRecognitionHelperImp.METHOD_START_AUTO_RECOGNITION);
            return;
        }
        if (Intrinsics.areEqual(action, ACTION_START_RECOGNITION_SERVICE)) {
            performAction(context, SceneRecognitionHelperImp.METHOD_START_AUTO_RECOGNITION);
            performAction(context, SceneRecognitionHelperImp.METHOD_UPDATE_ALARM);
            return;
        }
        if (Intrinsics.areEqual(action, ACTION_STOP_RECOGNITION_SERVICE)) {
            performAction(context, SceneRecognitionHelperImp.METHOD_STOP_RECOGNITION_SERVICE);
            return;
        }
        if (Intrinsics.areEqual(action, ACTION_STOP_FOREVER_RECOGNITION_SERVICE)) {
            performAction(context, SceneRecognitionHelperImp.METHOD_STOP_FOREVER_RECOGNITION_SERVICE);
            return;
        }
        if (Intrinsics.areEqual(action, ACTION_SCHEDULE_UPDATE_DURATION)) {
            performAction(context, SceneRecognitionHelperImp.METHOD_UPDATE_ALARM);
            return;
        }
        if (Intrinsics.areEqual(action, ACTION_ANALYZE_ENABLE)) {
            SceneAnalyzeStateDispatch.INSTANCE.markAnalyzeState(context, 3, System.currentTimeMillis());
            SceneRecogConfiguration.INSTANCE.setAnalyzeEnable(true);
        } else {
            if (Intrinsics.areEqual(action, ACTION_ANALYZE_DISABLE)) {
                SceneRecogConfiguration.INSTANCE.setAnalyzeEnable(false);
                return;
            }
            sceneUtils.sceneRecoTrace("unknown action " + action);
        }
    }

    public final void performForceStartWhenWakeUp(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        System.currentTimeMillis();
        Object systemService = context.getSystemService((Class<Object>) AlarmManager.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "getSystemService(...)");
        ((AlarmManager) systemService).setWindow(0, 1L, WINDOW_MILLIS, createPendingIntentWithMethod(context, ACTION_START_RECOGNITION_SERVICE));
        SceneUtils.INSTANCE.sceneRecoTrace("schedule start recognition service @ 1");
    }

    public final void performNextSchedule(@NotNull Context context, long delay) {
        Intrinsics.checkNotNullParameter(context, "context");
        PendingIntent broadcastPendingIntent$default = PendingIntentExtKt.getBroadcastPendingIntent$default(context, 0, new Intent(context, (Class<?>) SceneRecogBroadcastReceiver.class), 0, 4, null);
        long jElapsedRealtime = SystemClock.elapsedRealtime() + delay;
        SceneUtils.INSTANCE.sceneRecoTrace("sceneRecognitionScheduler next schedule " + TimeUnit.MILLISECONDS.toHours(delay) + " hour later");
        AlarmManagerExtKt.setExactAndAllowWhileIdleIfCan$default(context, jElapsedRealtime, broadcastPendingIntent$default, 0, 4, null);
    }
}
