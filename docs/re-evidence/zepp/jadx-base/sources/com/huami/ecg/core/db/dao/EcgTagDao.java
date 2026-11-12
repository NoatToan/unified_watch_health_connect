package com.huami.ecg.core.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.ecg.core.db.entity.EcgTag;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H'¢\u0006\u0004\b\u0005\u0010\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'J\u001d\u0010\t\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H'¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H'J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH'J\u0010\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u000eH'J\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H'J\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H'J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH'J\b\u0010\u0016\u001a\u00020\u0004H'¨\u0006\u0018"}, d2 = {"Lcom/huami/ecg/core/db/dao/EcgTagDao;", "", "Lcom/huami/ecg/core/db/entity/EcgTag;", "tag", "", "insertOrReplace", "", "", "([Lcom/huami/ecg/core/db/entity/EcgTag;)V", "insertIgnore", "getUnSyncTag", "", "id", "get", "Landroidx/lifecycle/LiveData;", "getData", "getAll", "getAllData", "ids", "getTags", "getTagsData", "delete", "clear", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public interface EcgTagDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/ecg/core/db/dao/EcgTagDao$Companion;", "", "", "a", "Ljava/lang/String;", "TABLE_NAME", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private static final String TABLE_NAME = "ecg_tag";
        public static final /* synthetic */ Companion b = new Companion();

        private Companion() {
        }
    }

    @Query("delete from ecg_tag")
    void clear();

    @Query("delete from ecg_tag where ecg_id = :id")
    void delete(long id);

    @Delete
    void delete(@NotNull EcgTag tag);

    @Query("select * from ecg_tag where ecg_id = :id limit 1")
    @Nullable
    EcgTag get(long id);

    @Query("select * from ecg_tag")
    @Nullable
    List<EcgTag> getAll();

    @Query("select * from ecg_tag")
    @NotNull
    LiveData<List<EcgTag>> getAllData();

    @Query("select * from ecg_tag where ecg_id = :id limit 1")
    @NotNull
    LiveData<EcgTag> getData(long id);

    @Query("select * from ecg_tag where ecg_id in (:ids)")
    @Nullable
    List<EcgTag> getTags(@NotNull List<Long> ids);

    @Query("select * from ecg_tag where ecg_id in (:ids)")
    @NotNull
    LiveData<List<EcgTag>> getTagsData(@NotNull List<Long> ids);

    @Query("select * from ecg_tag where synced = 0 and ecg_id > 0")
    @Nullable
    List<EcgTag> getUnSyncTag();

    @Insert(onConflict = 5)
    void insertIgnore(@NotNull EcgTag tag);

    @Insert(onConflict = 5)
    void insertIgnore(@NotNull List<EcgTag> tag);

    @Insert(onConflict = 5)
    void insertIgnore(@NotNull EcgTag[] tag);

    @Insert(onConflict = 1)
    void insertOrReplace(@NotNull EcgTag tag);

    @Insert(onConflict = 1)
    void insertOrReplace(@NotNull List<EcgTag> tag);

    @Insert(onConflict = 1)
    void insertOrReplace(@NotNull EcgTag[] tag);
}
