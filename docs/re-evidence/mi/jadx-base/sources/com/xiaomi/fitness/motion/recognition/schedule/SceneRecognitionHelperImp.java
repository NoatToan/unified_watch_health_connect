package com.xiaomi.fitness.motion.recognition.schedule;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fitness.common.utils.ServiceCompat;
import com.xiaomi.fitness.motion.recognition.SceneForegroundService;
import com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration;
import com.xiaomi.fitness.motion.recognition.SceneRecognitionHelper;
import com.xiaomi.fitness.motion.recognition.analyze.RecognitionManager;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecognitionHelperImp;
import com.xiaomi.fitness.motion.recognition.stat.SceneRecognitionStatHelper;
import com.xiaomi.fitness.motion.recognition.utils.HarSensorHelper;
import com.xiaomi.fitness.motion.recognition.utils.SceneUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/schedule/SceneRecognitionHelperImp;", "Lcom/xiaomi/fitness/motion/recognition/SceneRecognitionHelper;", "<init>", "()V", "mInteractiveReceiver", "Landroid/content/BroadcastReceiver;", "mInteractiveRegister", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mHandler", "Landroid/os/Handler;", "handleAction", "", "context", "Landroid/content/Context;", "method", "", "startRecognition", "stopRecognitionService", "stopForeverRecognitionService", "stopServiceDelayIfNeed", "Companion", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneRecognitionHelperImp implements SceneRecognitionHelper {

    @NotNull
    public static final String METHOD_START_AUTO_RECOGNITION = "start_auto_recognition";

    @NotNull
    public static final String METHOD_STOP_FOREVER_RECOGNITION_SERVICE = "stop_forever_recognition_service";

    @NotNull
    public static final String METHOD_STOP_RECOGNITION_SERVICE = "stop_recognition_service";

    @NotNull
    public static final String METHOD_UPDATE_ALARM = "update_alarm";

    @NotNull
    private final BroadcastReceiver mInteractiveReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.motion.recognition.schedule.SceneRecognitionHelperImp$mInteractiveReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String action = intent.getAction();
            if (!HarSensorHelper.INSTANCE.supportSceneRecognition(context)) {
                if (Intrinsics.areEqual("android.intent.action.USER_PRESENT", action)) {
                    SceneUtils.INSTANCE.sceneRecoTrace("receive user present");
                    RecognitionManager.INSTANCE.startAnalyzeByStep(context);
                    return;
                }
                return;
            }
            Intent intent2 = new Intent(context, (Class<?>) SceneForegroundService.class);
            if (Intrinsics.areEqual("android.intent.action.SCREEN_OFF", action)) {
                SceneUtils.INSTANCE.sceneRecoTrace("receive screen off");
                ServiceCompat.INSTANCE.startForegroundService(context, intent2);
            } else if (Intrinsics.areEqual("android.intent.action.USER_PRESENT", action)) {
                SceneUtils.INSTANCE.sceneRecoTrace("receive user present");
                intent2.setAction(SceneForegroundService.INSTANCE.getACTION_START_ANALYZE());
                ServiceCompat.INSTANCE.startForegroundService(context, intent2);
            }
        }
    };

    @NotNull
    private final AtomicBoolean mInteractiveRegister = new AtomicBoolean();

    @NotNull
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    private final void startRecognition(Context context) {
        this.mInteractiveReceiver.onReceive(context, new Intent("android.intent.action.SCREEN_OFF"));
        if (this.mInteractiveRegister.compareAndSet(false, true)) {
            SceneUtils.INSTANCE.sceneRecoTrace("register screen on and off action");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.mInteractiveReceiver, intentFilter, 4);
            } else {
                context.registerReceiver(this.mInteractiveReceiver, intentFilter);
            }
        }
    }

    private final void stopForeverRecognitionService(Context context) {
        if (this.mInteractiveRegister.compareAndSet(true, false)) {
            context.unregisterReceiver(this.mInteractiveReceiver);
        }
        SceneRecognitionScheduler sceneRecognitionScheduler = SceneRecognitionScheduler.INSTANCE;
        sceneRecognitionScheduler.cancelSchedule(context);
        sceneRecognitionScheduler.cancelForceStartAndStop(context);
        stopServiceDelayIfNeed(context);
    }

    private final void stopRecognitionService(Context context) {
        if (this.mInteractiveRegister.compareAndSet(true, false)) {
            context.unregisterReceiver(this.mInteractiveReceiver);
        }
        SceneRecognitionScheduler sceneRecognitionScheduler = SceneRecognitionScheduler.INSTANCE;
        sceneRecognitionScheduler.cancelSchedule(context);
        sceneRecognitionScheduler.performForceStartWhenWakeUp(context);
        stopServiceDelayIfNeed(context);
    }

    private final void stopServiceDelayIfNeed(final Context context) {
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.postDelayed(new Runnable() { // from class: tel
            @Override // java.lang.Runnable
            public final void run() {
                SceneRecognitionHelperImp.stopServiceDelayIfNeed$lambda$0(context);
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopServiceDelayIfNeed$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        SceneUtils.INSTANCE.sceneRecoTrace("stop SceneForegroundService");
        context.stopService(new Intent(context, (Class<?>) SceneForegroundService.class));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.xiaomi.fitness.motion.recognition.SceneRecognitionHelper
    public void handleAction(@NotNull Context context, @NotNull String method) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(method, "method");
        switch (method.hashCode()) {
            case -2062722920:
                if (method.equals(METHOD_STOP_FOREVER_RECOGNITION_SERVICE)) {
                    stopForeverRecognitionService(context);
                    SceneUtils.INSTANCE.sceneRecoTrace("stop recognition service forever");
                    SceneRecogConfiguration.INSTANCE.setLastMotorPerceptionStop(SceneRecognitionStatHelper.INSTANCE.getTime(false));
                    break;
                }
                break;
            case -1061201052:
                if (method.equals(METHOD_START_AUTO_RECOGNITION)) {
                    startRecognition(context);
                    SceneUtils.INSTANCE.sceneRecoTrace("start recognition");
                    SceneRecogConfiguration.INSTANCE.setLastMotorPerceptionStart(SceneRecognitionStatHelper.INSTANCE.getTime(true));
                    break;
                }
                break;
            case -614425765:
                if (method.equals(METHOD_UPDATE_ALARM)) {
                    SceneRecognitionScheduler.INSTANCE.performNextSchedule(context, SceneRecogConfiguration.INSTANCE.getSCHEDULE_CYCLE_DURATION());
                    SceneUtils.INSTANCE.sceneRecoTrace("update recognition alarm");
                    break;
                }
                break;
            case -47069584:
                if (method.equals(METHOD_STOP_RECOGNITION_SERVICE)) {
                    stopRecognitionService(context);
                    SceneUtils.INSTANCE.sceneRecoTrace("stop recognition service");
                    SceneRecogConfiguration.INSTANCE.setLastMotorPerceptionStop(SceneRecognitionStatHelper.INSTANCE.getTime(false));
                    break;
                }
                break;
        }
    }
}
