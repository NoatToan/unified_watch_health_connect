package com.xiaomi.fitness.motion.recognition.utils;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecognitionScheduler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/utils/SceneUtils;", "", "<init>", "()V", "TAG", "", "sceneRecoTrace", "", "msg", "sceneRecoDebug", "openSceneRecognition", "context", "Landroid/content/Context;", "closeSceneRecognition", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneUtils {

    @NotNull
    public static final SceneUtils INSTANCE = new SceneUtils();

    @NotNull
    public static final String TAG = "scene_reco";

    private SceneUtils() {
    }

    public final void closeSceneRecognition(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) SceneRecogBroadcastReceiver.class);
        SceneRecognitionScheduler sceneRecognitionScheduler = SceneRecognitionScheduler.INSTANCE;
        intent.setAction(sceneRecognitionScheduler.getACTION_ANALYZE_DISABLE());
        context.sendBroadcast(intent);
        Intent intent2 = new Intent(context, (Class<?>) SceneRecogBroadcastReceiver.class);
        intent2.setAction(sceneRecognitionScheduler.getACTION_STOP_FOREVER_RECOGNITION_SERVICE());
        context.sendBroadcast(intent2);
    }

    public final void openSceneRecognition(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (SceneRecogConfiguration.INSTANCE.getAnalyzeEnable()) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) SceneRecogBroadcastReceiver.class);
        SceneRecognitionScheduler sceneRecognitionScheduler = SceneRecognitionScheduler.INSTANCE;
        intent.setAction(sceneRecognitionScheduler.getACTION_ANALYZE_ENABLE());
        context.sendBroadcast(intent);
        Intent intent2 = new Intent(context, (Class<?>) SceneRecogBroadcastReceiver.class);
        intent2.setAction(sceneRecognitionScheduler.getACTION_START_RECOGNITION_SERVICE());
        context.sendBroadcast(intent2);
    }

    public final void sceneRecoDebug(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.d(TAG, msg);
    }

    public final void sceneRecoTrace(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i(TAG, msg);
    }
}
