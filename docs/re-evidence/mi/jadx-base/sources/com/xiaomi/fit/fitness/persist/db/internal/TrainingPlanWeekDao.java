package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\ba\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH'J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH'¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanWeekDao;", "", "insert", "", "entity", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanWeekEntity;", "([Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanWeekEntity;)V", "update", "getCurWeekPlan", "", "getWeekPlanById", "id", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TrainingPlanWeekDao {
    @Query("SELECT * FROM training_plan_week WHERE stopped = 0")
    @Nullable
    List<TrainingPlanWeekEntity> getCurWeekPlan();

    @Query("SELECT * FROM training_plan_week WHERE id = :id")
    @Nullable
    TrainingPlanWeekEntity getWeekPlanById(long id);

    @Insert(onConflict = 1)
    void insert(@NotNull TrainingPlanWeekEntity... entity);

    @Update
    void update(@NotNull TrainingPlanWeekEntity... entity);
}
