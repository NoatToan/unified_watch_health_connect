package com.huami.health.statisticdata.persistence;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH'J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH'J(\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH'J \u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH'J\b\u0010\u000f\u001a\u00020\u0005H'¨\u0006\u0010"}, d2 = {"Lcom/huami/health/statisticdata/persistence/StatisticDataDao;", "", "", "Lcom/huami/health/statisticdata/persistence/StatisticDataEntity;", "modelsList", "", "insertStatisticDataEntityList", "", "itemType", "", "ageGroup", "gender", "timeGroup", "queryStatisticDataEntityList", "deleteByAgeGroupAndGender", "deleteAll", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
public interface StatisticDataDao {
    @Query("DELETE FROM statistic_data_entity_table")
    void deleteAll();

    @Query("DELETE FROM statistic_data_entity_table WHERE item_type=:itemType AND age_group = :ageGroup AND gender = :gender")
    void deleteByAgeGroupAndGender(@NotNull String itemType, int ageGroup, int gender);

    @Query("DELETE FROM statistic_data_entity_table WHERE item_type=:itemType AND age_group = :ageGroup AND time_group = :timeGroup AND gender = :gender")
    void deleteByAgeGroupAndGender(@NotNull String itemType, int ageGroup, int gender, int timeGroup);

    @Insert
    void insertStatisticDataEntityList(@NotNull List<StatisticDataEntity> modelsList);

    @Query("SELECT * FROM statistic_data_entity_table WHERE item_type=:itemType AND age_group = :ageGroup AND gender = :gender ORDER BY category ASC")
    @NotNull
    List<StatisticDataEntity> queryStatisticDataEntityList(@NotNull String itemType, int ageGroup, int gender);

    @Query("SELECT * FROM statistic_data_entity_table WHERE item_type=:itemType AND age_group = :ageGroup AND time_group = :timeGroup AND gender = :gender ORDER BY category ASC")
    @NotNull
    List<StatisticDataEntity> queryStatisticDataEntityList(@NotNull String itemType, int ageGroup, int gender, int timeGroup);
}
