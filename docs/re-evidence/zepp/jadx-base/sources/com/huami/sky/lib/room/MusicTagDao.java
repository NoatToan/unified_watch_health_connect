package com.huami.sky.lib.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.sky.lib.entity.UserMusicTag;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J \u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H'¨\u0006\u000b"}, d2 = {"Lcom/huami/sky/lib/room/MusicTagDao;", "", "Lcom/huami/sky/lib/entity/UserMusicTag;", "tag", "", Constant.METHOD_INSERT, "", "userId", "sleepStartTime", "Lkotlinx/coroutines/flow/Flow;", "getMusicTag", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface MusicTagDao {
    @Query("select * from musicTag where userId=:userId and sleepStartTime = :sleepStartTime")
    @NotNull
    Flow<UserMusicTag> getMusicTag(@NotNull String userId, long sleepStartTime);

    @Insert(onConflict = 1)
    long insert(@NotNull UserMusicTag tag);
}
