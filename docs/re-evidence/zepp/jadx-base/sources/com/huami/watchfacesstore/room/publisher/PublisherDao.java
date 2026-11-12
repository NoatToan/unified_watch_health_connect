package com.huami.watchfacesstore.room.publisher;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH'J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003H'J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH'¨\u0006\u0010"}, d2 = {"Lcom/huami/watchfacesstore/room/publisher/PublisherDao;", "", "", "Lcom/huami/watchfacesstore/room/publisher/PublisherInfo;", "publisher", "", "insertPublisher", "([Lcom/huami/watchfacesstore/room/publisher/PublisherInfo;)V", "", "publisherId", "getPublisherInfo", "info", "updatePublisherInfo", "", "ids", "deletePublisherInfoByIds", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface PublisherDao {
    @Query("DELETE FROM PublisherInfo WHERE id IN (:ids)")
    int deletePublisherInfoByIds(@NotNull int[] ids);

    @Query("SELECT * FROM PublisherInfo WHERE id = :publisherId")
    @Nullable
    PublisherInfo getPublisherInfo(int publisherId);

    @Insert
    void insertPublisher(@NotNull PublisherInfo... publisher);

    @Update(entity = PublisherInfo.class)
    int updatePublisherInfo(@NotNull PublisherInfo info);
}
