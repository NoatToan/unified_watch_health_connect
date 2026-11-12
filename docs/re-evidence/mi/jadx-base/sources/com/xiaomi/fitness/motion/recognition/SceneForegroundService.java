package com.xiaomi.fitness.motion.recognition;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import androidx.core.app.TaskStackBuilder;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.motion.recognition.SceneForegroundService;
import com.xiaomi.fitness.motion.recognition.analyze.RecognitionManager;
import com.xiaomi.fitness.motion.recognition.analyze.SceneAnalyzeStateDispatch;
import com.xiaomi.fitness.motion.recognition.collection.SceneCollectManager;
import com.xiaomi.fitness.motion.recognition.utils.HarSensorHelper;
import com.xiaomi.fitness.motion.recognition.utils.SceneUtils;
import defpackage.hxi;
import defpackage.n0j;
import defpackage.wwg;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/SceneForegroundService;", "Landroid/app/Service;", "<init>", "()V", "mSceneCollectManager", "Lcom/xiaomi/fitness/motion/recognition/collection/SceneCollectManager;", "getMSceneCollectManager", "()Lcom/xiaomi/fitness/motion/recognition/collection/SceneCollectManager;", "mSceneCollectManager$delegate", "Lkotlin/Lazy;", "mSceneRecogManager", "Lcom/xiaomi/fitness/motion/recognition/analyze/RecognitionManager;", "getMSceneRecogManager", "()Lcom/xiaomi/fitness/motion/recognition/analyze/RecognitionManager;", "mSceneRecogManager$delegate", "onCreate", "", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "createNotification", "Landroid/app/Notification;", "context", "Landroid/content/Context;", "startCollectHarSensorEvent", LifecycleConstantKt.ON_DESTROY, "onBind", "Landroid/os/IBinder;", "startAnalyze", "Companion", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneForegroundService extends Service {

    @NotNull
    private static final String CHANNEL_ID_BACKGROUND_SERVICE = "channel:background_service";
    private static volatile long startTime;

    /* JADX INFO: renamed from: mSceneCollectManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSceneCollectManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rel
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SceneForegroundService.mSceneCollectManager_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mSceneRecogManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSceneRecogManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sel
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SceneForegroundService.mSceneRecogManager_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String ACTION_START_ANALYZE = ApplicationExtKt.getApplication().getPackageName() + ".action.START_ANALYZE";

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/SceneForegroundService$Companion;", "", "<init>", "()V", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "ACTION_START_ANALYZE", "", "getACTION_START_ANALYZE", "()Ljava/lang/String;", "CHANNEL_ID_BACKGROUND_SERVICE", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getACTION_START_ANALYZE() {
            return SceneForegroundService.ACTION_START_ANALYZE;
        }

        public final long getStartTime() {
            return SceneForegroundService.startTime;
        }

        public final void setStartTime(long j) {
            SceneForegroundService.startTime = j;
        }
    }

    private final Notification createNotification(Context context) {
        Intent intent = new Intent();
        String strIntern = (context.getPackageName() + ".action.SceneMotion").intern();
        Intrinsics.checkNotNullExpressionValue(strIntern, "intern(...)");
        intent.setAction(strIntern);
        intent.setPackage(getPackageName());
        TaskStackBuilder taskStackBuilderF = TaskStackBuilder.i(context).f(intent);
        Intrinsics.checkNotNullExpressionValue(taskStackBuilderF, "addNextIntentWithParentStack(...)");
        PendingIntent pendingIntentCompat$default = PendingIntentExtKt.getPendingIntentCompat$default(taskStackBuilderF, 502, 0, 2, null);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager.getNotificationChannel(CHANNEL_ID_BACKGROUND_SERVICE) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID_BACKGROUND_SERVICE, "motion-recognition", 3);
            notificationChannel.setDescription(getString(n0j.f27409b));
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        wwg.e eVarA = new wwg.e(context, CHANNEL_ID_BACKGROUND_SERVICE).u(hxi.f20573a).k(getString(n0j.f27409b)).j(getString(n0j.f27408a)).i(pendingIntentCompat$default).g(false).s(true).p("com.mi.health").t(-2).l(8).z(new long[]{0}).v(null).A(1);
        Intrinsics.checkNotNullExpressionValue(eVarA, "setVisibility(...)");
        Notification notificationD = eVarA.d();
        Intrinsics.checkNotNullExpressionValue(notificationD, "build(...)");
        return notificationD;
    }

    private final SceneCollectManager getMSceneCollectManager() {
        return (SceneCollectManager) this.mSceneCollectManager.getValue();
    }

    private final RecognitionManager getMSceneRecogManager() {
        return (RecognitionManager) this.mSceneRecogManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneCollectManager mSceneCollectManager_delegate$lambda$0() {
        return SceneCollectManager.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecognitionManager mSceneRecogManager_delegate$lambda$1() {
        return RecognitionManager.INSTANCE.getInstance();
    }

    private final void startAnalyze(Context context) {
        SceneRecogConfiguration sceneRecogConfiguration = SceneRecogConfiguration.INSTANCE;
        if (sceneRecogConfiguration.getAnalyzeEnable()) {
            getMSceneRecogManager().startAnalyze(context, RangesKt___RangesKt.coerceAtLeast(sceneRecogConfiguration.getLastSceneRecognizeEnd(), SceneRecogConfiguration.getLastMotorPerceptionStop() - sceneRecogConfiguration.getOFFSET_OF_STOP_TIME_FOR_ANALYZE()), System.currentTimeMillis());
        }
    }

    private final void startCollectHarSensorEvent(Context context) {
        if (getMSceneCollectManager().getIsStart()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SceneAnalyzeStateDispatch sceneAnalyzeStateDispatch = SceneAnalyzeStateDispatch.INSTANCE;
        sceneAnalyzeStateDispatch.markAnalyzeState(context, 0, jCurrentTimeMillis);
        startAnalyze(context);
        sceneAnalyzeStateDispatch.markAnalyzeState(context, 2, jCurrentTimeMillis);
        getMSceneCollectManager().start(context);
        SceneUtils.INSTANCE.sceneRecoTrace("start har sensor collect");
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        startTime = SystemClock.elapsedRealtime();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Context applicationContext = getApplicationContext();
        Logger.e("SceneForegroundService", "onDestroy: ");
        if (getMSceneCollectManager().getIsStart()) {
            SceneCollectManager mSceneCollectManager = getMSceneCollectManager();
            Intrinsics.checkNotNull(applicationContext);
            mSceneCollectManager.stop(applicationContext);
        }
        Intrinsics.checkNotNull(applicationContext);
        startAnalyze(applicationContext);
        stopForeground(true);
    }

    @Override // android.app.Service
    public int onStartCommand(@NotNull Intent intent, int flags, int startId) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Context applicationContext = getApplicationContext();
        if (Build.VERSION.SDK_INT >= 34) {
            Intrinsics.checkNotNull(applicationContext);
            startForeground(502, createNotification(applicationContext), 1073741824);
        } else {
            Intrinsics.checkNotNull(applicationContext);
            startForeground(502, createNotification(applicationContext));
        }
        if (HarSensorHelper.INSTANCE.supportSceneRecognition(applicationContext)) {
            getMSceneCollectManager().forceFlushHarSensor();
            startCollectHarSensorEvent(applicationContext);
        }
        if (!Intrinsics.areEqual(ACTION_START_ANALYZE, intent.getAction())) {
            return 3;
        }
        startAnalyze(applicationContext);
        return 3;
    }
}
