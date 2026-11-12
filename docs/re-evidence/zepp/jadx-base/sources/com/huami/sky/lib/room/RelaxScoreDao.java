package com.huami.sky.lib.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.huami.sky.lib.entity.UserRelaxScore;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH'J$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H'¨\u0006\u0010"}, d2 = {"Lcom/huami/sky/lib/room/RelaxScoreDao;", "", "", "Lcom/huami/sky/lib/entity/UserRelaxScore;", "relaxScores", "", Constant.METHOD_INSERT, "", "userId", "", "start", "end", "getRelaxScoreByRange", "Lkotlinx/coroutines/flow/Flow;", "getRelaxScoreAfterTime", "getLatestRelaxScore", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface RelaxScoreDao {
    @Query("select * from relaxScore where userId=:userId order by createdAt limit 1")
    @Nullable
    UserRelaxScore getLatestRelaxScore(@NotNull String userId);

    @Query("select * from relaxScore where userId=:userId and createdAt >= :start order by createdAt")
    @NotNull
    Flow<List<UserRelaxScore>> getRelaxScoreAfterTime(@NotNull String userId, long start);

    @Query("select * from relaxScore where userId=:userId and createdAt between :start and :end order by createdAt")
    @NotNull
    List<UserRelaxScore> getRelaxScoreByRange(@NotNull String userId, long start, long end);

    @Insert(onConflict = 1)
    @Transaction
    @NotNull
    long[] insert(@NotNull List<UserRelaxScore> relaxScores);
}
