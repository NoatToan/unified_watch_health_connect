package com.huami.training.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.training.db.po.Promotion;
import com.huami.training.db.po.Training;
import com.huami.training.dto.PromotePlace;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H'¨\u0006\r"}, d2 = {"Lcom/huami/training/db/dao/PromotionDao;", "", "", "Lcom/huami/training/db/po/Promotion;", "promotions", "", "insertPromotions", "Lcom/huami/training/dto/PromotePlace;", "promotePlace", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/db/po/Training;", "queryLatestThreePromotionalTrainings", "deletePromotionalTrainings", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface PromotionDao {
    @Query("DELETE FROM Promotion WHERE promotePlace = :promotePlace")
    void deletePromotionalTrainings(@NotNull PromotePlace promotePlace);

    @Insert(onConflict = 1)
    void insertPromotions(@NotNull List<Promotion> promotions);

    @Query("SELECT Training.id, listImage, name, difficulty, contentCount, consumption, participants, type, label FROM Training INNER JOIN Promotion WHERE promotePlace = :promotePlace AND Training.id = trainingId ORDER BY Promotion.id LIMIT 3")
    @NotNull
    LiveData<List<Training>> queryLatestThreePromotionalTrainings(@NotNull PromotePlace promotePlace);
}
