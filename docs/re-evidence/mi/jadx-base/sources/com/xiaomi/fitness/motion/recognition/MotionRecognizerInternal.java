package com.xiaomi.fitness.motion.recognition;

import com.xiaomi.fitness.motion.recognition.db.entity.SceneResult;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&R\u0018\u0010\u0007\u001a\u00020\bX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/MotionRecognizerInternal;", "Lcom/xiaomi/fitness/motion/recognition/MotionRecognizer;", "notifyResultListener", "", "result", "", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;", "stepProvider", "Lcom/xiaomi/fitness/motion/recognition/SceneStepProvider;", "getStepProvider", "()Lcom/xiaomi/fitness/motion/recognition/SceneStepProvider;", "setStepProvider", "(Lcom/xiaomi/fitness/motion/recognition/SceneStepProvider;)V", "Companion", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MotionRecognizerInternal extends MotionRecognizer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/MotionRecognizerInternal$Companion;", "", "<init>", "()V", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    SceneStepProvider getStepProvider();

    void notifyResultListener(@Nullable List<SceneResult> result);

    void setStepProvider(@NotNull SceneStepProvider sceneStepProvider);
}
