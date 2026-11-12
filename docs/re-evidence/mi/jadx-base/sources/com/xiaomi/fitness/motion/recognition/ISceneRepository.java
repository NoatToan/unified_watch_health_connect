package com.xiaomi.fitness.motion.recognition;

import androidx.lifecycle.LiveData;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneEvent;
import com.xiaomi.fitness.motion.recognition.db.entity.ScenePressureEvent;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H&¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J!\u0010\r\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0005\"\u00020\u000fH&¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J!\u0010\u0013\u001a\u00020\u00032\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0005\"\u00020\u0015H&¢\u0006\u0002\u0010\u0016J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J$\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t0\u001b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH&¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/ISceneRepository;", "", "insert", "", "sceneResults", "", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneEvent;", "([Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneEvent;)V", "querySceneEvents", "", "startTime", "", "endTime", "insertPressure", "pressureEvents", "Lcom/xiaomi/fitness/motion/recognition/db/entity/ScenePressureEvent;", "([Lcom/xiaomi/fitness/motion/recognition/db/entity/ScenePressureEvent;)V", "queryScenePressureEvents", "deleteScenePressureEvents", "insertResult", "activityEntities", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;", "([Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;)V", "queryResults", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAllNoCompleteResults", "queryPossibleResults", "Landroidx/lifecycle/LiveData;", "deleteResult", "actType", "", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISceneRepository {
    void deleteResult(long startTime, int actType);

    void deleteScenePressureEvents(long startTime, long endTime);

    void insert(@NotNull SceneEvent... sceneResults);

    void insertPressure(@NotNull ScenePressureEvent... pressureEvents);

    void insertResult(@NotNull SceneResult... activityEntities);

    @NotNull
    List<SceneResult> queryAllNoCompleteResults(long startTime, long endTime);

    @NotNull
    LiveData<List<SceneResult>> queryPossibleResults(long startTime, long endTime);

    @Nullable
    Object queryResults(long j, long j2, @NotNull Continuation<? super List<SceneResult>> continuation);

    @NotNull
    List<SceneEvent> querySceneEvents(long startTime, long endTime);

    @NotNull
    List<ScenePressureEvent> queryScenePressureEvents(long startTime, long endTime);
}
