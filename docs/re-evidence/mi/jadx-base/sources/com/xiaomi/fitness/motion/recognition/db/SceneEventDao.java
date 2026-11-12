package com.xiaomi.fitness.motion.recognition.db;

import androidx.room.Insert;
import androidx.room.Query;
import com.xiaomi.fitness.database.BaseDao;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneEvent;
import com.xiaomi.fitness.motion.recognition.db.entity.ScenePressureEvent;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H'J!\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH'¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H'¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/db/SceneEventDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneEvent;", "querySceneEvents", "", "startTime", "", "endTime", "insertPressure", "", "pressureEvents", "", "Lcom/xiaomi/fitness/motion/recognition/db/entity/ScenePressureEvent;", "([Lcom/xiaomi/fitness/motion/recognition/db/entity/ScenePressureEvent;)V", "queryScenePressureEvents", "deleteScenePressureEvents", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SceneEventDao extends BaseDao<SceneEvent> {
    @Query("DELETE FROM scene_pressure_event WHERE time BETWEEN :startTime AND :endTime")
    void deleteScenePressureEvents(long startTime, long endTime);

    @Insert(onConflict = 1)
    void insertPressure(@NotNull ScenePressureEvent... pressureEvents);

    @Query("SELECT * FROM scene_event WHERE scene_time BETWEEN :startTime AND :endTime ORDER BY scene_time")
    @NotNull
    List<SceneEvent> querySceneEvents(long startTime, long endTime);

    @Query("SELECT * FROM scene_pressure_event WHERE time BETWEEN :startTime AND :endTime ORDER BY time")
    @NotNull
    List<ScenePressureEvent> queryScenePressureEvents(long startTime, long endTime);
}
