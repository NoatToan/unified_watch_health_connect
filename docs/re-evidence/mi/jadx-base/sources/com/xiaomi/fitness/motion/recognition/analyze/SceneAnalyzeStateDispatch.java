package com.xiaomi.fitness.motion.recognition.analyze;

import android.content.Context;
import com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/analyze/SceneAnalyzeStateDispatch;", "", "<init>", "()V", "COLLECT_START", "", "ANALYZING", "NEXT_ANALYZE", "RESTART", "markAnalyzeState", "", "context", "Landroid/content/Context;", "state", "time", "", "markCollectStart", "markCollectRestart", "markLastEventTime", "markNextSceneRecognize", "getSceneEventQueryStartTime", "sceneStartTime", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneAnalyzeStateDispatch {
    public static final int ANALYZING = 1;
    public static final int COLLECT_START = 0;

    @NotNull
    public static final SceneAnalyzeStateDispatch INSTANCE = new SceneAnalyzeStateDispatch();
    public static final int NEXT_ANALYZE = 2;
    public static final int RESTART = 3;

    private SceneAnalyzeStateDispatch() {
    }

    private final void markCollectRestart(Context context, long time) {
        markNextSceneRecognize(context, time);
        SceneRecogConfiguration.INSTANCE.setLastUnCompleteMinStartTime(time);
    }

    private final void markCollectStart(Context context, long time) {
        SceneRecogConfiguration.INSTANCE.setStartSceneCollectTime(time);
    }

    private final void markLastEventTime(Context context, long time) {
        SceneRecogConfiguration.INSTANCE.setLastSceneEventTime(time);
    }

    private final void markNextSceneRecognize(Context context, long time) {
        SceneRecogConfiguration.INSTANCE.setLastSceneRecognizeEnd(time);
    }

    public final long getSceneEventQueryStartTime(@NotNull Context context, long sceneStartTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        SceneRecogConfiguration sceneRecogConfiguration = SceneRecogConfiguration.INSTANCE;
        long startSceneCollectTime = sceneRecogConfiguration.getStartSceneCollectTime();
        long lastSceneEventTime = sceneRecogConfiguration.getLastSceneEventTime();
        return (startSceneCollectTime == -1 || startSceneCollectTime >= lastSceneEventTime) ? sceneStartTime : lastSceneEventTime;
    }

    public final void markAnalyzeState(@NotNull Context context, int state, long time) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (state == 0) {
            markCollectStart(context, time);
            return;
        }
        if (state == 1) {
            markLastEventTime(context, time);
            return;
        }
        if (state == 2) {
            markNextSceneRecognize(context, time);
        } else {
            if (state != 3) {
                return;
            }
            markLastEventTime(context, time);
            markCollectRestart(context, time);
        }
    }
}
