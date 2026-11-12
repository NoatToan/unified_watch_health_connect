package com.xiaomi.fitness.motion.recognition.schedule;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.motion.recognition.stat.SceneRecognitionStatHelper;
import com.xiaomi.fitness.motion.recognition.utils.SceneUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/schedule/SceneRecogBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneRecogBroadcastReceiver extends BroadcastReceiver {

    @NotNull
    public static final String EXTRA_FROM = "from";

    @NotNull
    public static final String FROM_APP = "app";

    @NotNull
    public static final String FROM_USER = "user";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        SceneUtils.INSTANCE.sceneRecoTrace("receive scene recognition event");
        String action = intent.getAction();
        if (action != null) {
            if (Intrinsics.areEqual("app", intent.getStringExtra("from"))) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                SceneRecognitionScheduler sceneRecognitionScheduler = SceneRecognitionScheduler.INSTANCE;
                if (Intrinsics.areEqual(sceneRecognitionScheduler.getACTION_START_RECOGNITION_SERVICE(), action)) {
                    SceneRecognitionStatHelper.INSTANCE.prepareStart(context, jCurrentTimeMillis);
                } else if (Intrinsics.areEqual(sceneRecognitionScheduler.getACTION_STOP_FOREVER_RECOGNITION_SERVICE(), action) || Intrinsics.areEqual(sceneRecognitionScheduler.getACTION_STOP_RECOGNITION_SERVICE(), action)) {
                    SceneRecognitionStatHelper.INSTANCE.statStop(context, jCurrentTimeMillis);
                }
            }
            StickyWorkHelper.INSTANCE.startStickyWork(ApplicationExtKt.getSafeContext(context), action);
        }
    }
}
