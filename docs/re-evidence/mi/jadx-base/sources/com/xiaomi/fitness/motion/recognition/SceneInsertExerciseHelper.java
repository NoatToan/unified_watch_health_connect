package com.xiaomi.fitness.motion.recognition;

import android.content.Context;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneResult;
import com.xiaomi.fitness.motion.recognition.pressure.PressureSegment;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/SceneInsertExerciseHelper;", "", "<init>", "()V", "KEY_STEP_ZERO_RESULT", "", "KEY_SPORT_TYPE", "KEY_SPORT_DURATION", "insertExerciseRecordFromSceneResults", "", "sceneResultList", "", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;", "context", "Landroid/content/Context;", "InsertOrUpdateExerciseRecord", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneInsertExerciseHelper {

    @NotNull
    public static final SceneInsertExerciseHelper INSTANCE = new SceneInsertExerciseHelper();

    @NotNull
    private static final String KEY_SPORT_DURATION = "sport_duration";

    @NotNull
    private static final String KEY_SPORT_TYPE = "sport_type";

    @NotNull
    private static final String KEY_STEP_ZERO_RESULT = "step_zero_result";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/SceneInsertExerciseHelper$InsertOrUpdateExerciseRecord;", "Ljava/lang/Runnable;", "context", "Landroid/content/Context;", "list", "", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "run", "", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSceneInsertExerciseHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneInsertExerciseHelper.kt\ncom/xiaomi/fitness/motion/recognition/SceneInsertExerciseHelper$InsertOrUpdateExerciseRecord\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1863#2,2:153\n*S KotlinDebug\n*F\n+ 1 SceneInsertExerciseHelper.kt\ncom/xiaomi/fitness/motion/recognition/SceneInsertExerciseHelper$InsertOrUpdateExerciseRecord\n*L\n32#1:153,2\n*E\n"})
    public static final class InsertOrUpdateExerciseRecord implements Runnable {

        @NotNull
        private final Context context;

        @Nullable
        private final List<SceneResult> list;

        public InsertOrUpdateExerciseRecord(@NotNull Context context, @Nullable List<SceneResult> list) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.list = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<SceneResult> list = this.list;
            if (list != null) {
                for (SceneResult sceneResult : list) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("run: ");
                    sb.append(sceneResult);
                }
            }
            List<SceneResult> list2 = this.list;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            for (SceneResult sceneResult2 : this.list) {
                if (sceneResult2.getStepCount() == 0) {
                    HashMap map = new HashMap();
                    map.put("sport_type", String.valueOf(sceneResult2.getActType()));
                    map.put(SceneInsertExerciseHelper.KEY_SPORT_DURATION, String.valueOf(sceneResult2.getContinued()));
                }
                PressureSegment pressureSegment = sceneResult2.getPressureSegment();
                if (pressureSegment != null && pressureSegment.getTotalUpAltitude() == 0.0f) {
                    pressureSegment.getTotalDownAltitude();
                }
            }
        }
    }

    private SceneInsertExerciseHelper() {
    }

    public final synchronized void insertExerciseRecordFromSceneResults(@Nullable List<SceneResult> sceneResultList, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ExecutorHelper.runInBackground(new InsertOrUpdateExerciseRecord(context, sceneResultList));
    }
}
