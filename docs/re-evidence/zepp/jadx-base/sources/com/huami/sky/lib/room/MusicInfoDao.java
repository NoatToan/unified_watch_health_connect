package com.huami.sky.lib.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.sky.lib.entity.MusicEntity;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H'¨\u0006\u000b"}, d2 = {"Lcom/huami/sky/lib/room/MusicInfoDao;", "", "Lcom/huami/sky/lib/entity/MusicEntity;", "info", "", Constant.METHOD_INSERT, "", "count", "Lkotlinx/coroutines/flow/Flow;", "", "getMusicInfoLimit", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface MusicInfoDao {
    @Query("select * from music_entity order by time desc limit :count")
    @NotNull
    Flow<List<MusicEntity>> getMusicInfoLimit(int count);

    @Insert(onConflict = 1)
    long insert(@NotNull MusicEntity info);
}
