package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH'J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH'J\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H'¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanCurDateDao;", "", "insert", "", "entity", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanCurDateEntity;", "([Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanCurDateEntity;)V", "update", "getCurDatePlan", "", "type", "", "id", "", DialWidgetType.DATE, "getInfoByPlanId", "deleteInfoByPlanId", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TrainingPlanCurDateDao {
    @Delete
    void deleteInfoByPlanId(@NotNull TrainingPlanCurDateEntity entity);

    @Query("SELECT * FROM training_plan_cur_date")
    @Nullable
    List<TrainingPlanCurDateEntity> getCurDatePlan();

    @Query("SELECT * FROM training_plan_cur_date WHERE date = :date AND type = :type AND id = :id")
    @Nullable
    List<TrainingPlanCurDateEntity> getCurDatePlan(int type, long id, long date);

    @Query("SELECT * FROM training_plan_cur_date WHERE id = :id")
    @Nullable
    List<TrainingPlanCurDateEntity> getInfoByPlanId(long id);

    @Insert(onConflict = 1)
    void insert(@NotNull TrainingPlanCurDateEntity... entity);

    @Update
    void update(@NotNull TrainingPlanCurDateEntity... entity);
}
