package com.huami.training.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.huami.training.db.po.PlanTraining;
import com.huami.training.db.po.TrainingPlan;
import com.huami.training.db.po.TrainingPlanWithTrainings;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'J\b\u0010\n\u001a\u00020\u0004H'J\b\u0010\u000b\u001a\u00020\u0004H'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH'J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H'¨\u0006\u0016"}, d2 = {"Lcom/huami/training/db/dao/PlanDao;", "", "Lcom/huami/training/db/po/TrainingPlan;", "plan", "", "insertPlan", "", "Lcom/huami/training/db/po/PlanTraining;", "dayTrainings", "insertPlanTrainings", "clearPlan", "clearPlanTrainings", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/db/po/TrainingPlanWithTrainings;", "queryPlanWithTrainings", "", "trainingId", "", "dayIndex", "", "finished", "finishPlanTraining", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface PlanDao {
    @Query("DELETE FROM TrainingPlan")
    void clearPlan();

    @Query("DELETE FROM PlanTraining")
    void clearPlanTrainings();

    @Query("UPDATE PlanTraining SET isFinished = :finished WHERE trainingId = :trainingId AND dayIndex = :dayIndex")
    void finishPlanTraining(long trainingId, int dayIndex, boolean finished);

    @Insert(onConflict = 1)
    void insertPlan(@NotNull TrainingPlan plan);

    @Insert(onConflict = 1)
    void insertPlanTrainings(@NotNull List<PlanTraining> dayTrainings);

    @Query("SELECT * FROM TrainingPlan")
    @Transaction
    @NotNull
    LiveData<TrainingPlanWithTrainings> queryPlanWithTrainings();
}
