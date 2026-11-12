package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J!\u0010\t\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\r\u001a\u00020\u000eH'J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0017\u001a\u00020\u0011H'J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/FDSDataIdDao;", "", "insert", "", "entity", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/FDSDataIdEntity;", "([Lcom/xiaomi/fit/fitness/persist/db/internal/FDSDataIdEntity;)V", "update", "delete", "getNotUploadIds", "", "getTheDeviceAllIds", "sid", "", "getDailyFDSIds", "dailyType", "", "time", "", "getSportFDSIds", DailyRecordKey.sportType, "getSportReportIds", "limit", "queryAllIds", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FDSDataIdDao {
    @Delete
    void delete(@NotNull FDSDataIdEntity... entity);

    @Query("SELECT * FROM fds_data_id WHERE sid = :sid AND dailyType = :dailyType AND time >= :time")
    @NotNull
    List<FDSDataIdEntity> getDailyFDSIds(@NotNull String sid, int dailyType, long time);

    @Query("SELECT * FROM fds_data_id WHERE isUpload = 0")
    @NotNull
    List<FDSDataIdEntity> getNotUploadIds();

    @Query("SELECT * FROM fds_data_id WHERE sid = :sid AND sportType = :sportType AND time = :time")
    @NotNull
    List<FDSDataIdEntity> getSportFDSIds(@NotNull String sid, int sportType, long time);

    @Query("SELECT * FROM fds_data_id WHERE sportType > 0 AND fileType = 1 limit :limit")
    @NotNull
    List<FDSDataIdEntity> getSportReportIds(int limit);

    @Query("SELECT * FROM fds_data_id WHERE sid = :sid")
    @NotNull
    List<FDSDataIdEntity> getTheDeviceAllIds(@NotNull String sid);

    @Insert(onConflict = 1)
    void insert(@NotNull FDSDataIdEntity... entity);

    @Query("select * from fds_data_id")
    @NotNull
    List<FDSDataIdEntity> queryAllIds();

    @Update
    void update(@NotNull FDSDataIdEntity... entity);
}
