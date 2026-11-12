package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.xiaomi.fitness.sport_eco.SportConstants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\ba\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH'J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH'¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/SwitchSongDao;", "", "insert", "", "entity", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/SwitchSongEntity;", "([Lcom/xiaomi/fit/fitness/persist/db/internal/SwitchSongEntity;)V", "update", "getNotUploadEntities", "", "getEntityByTimeStamp", SportConstants.KEY_TIMESTAMP, "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SwitchSongDao {
    @Query("SELECT * FROM switch_song_dao WHERE time = :timeStamp")
    @Nullable
    SwitchSongEntity getEntityByTimeStamp(long timeStamp);

    @Query("SELECT * FROM switch_song_dao WHERE isUpload = 0")
    @Nullable
    List<SwitchSongEntity> getNotUploadEntities();

    @Insert(onConflict = 1)
    void insert(@NotNull SwitchSongEntity... entity);

    @Update
    void update(@NotNull SwitchSongEntity... entity);
}
