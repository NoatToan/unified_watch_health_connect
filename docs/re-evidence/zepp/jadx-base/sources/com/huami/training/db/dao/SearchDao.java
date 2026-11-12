package com.huami.training.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.training.db.po.SearchResult;
import com.huami.training.db.po.Tag;
import com.huami.training.db.po.Training;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH'J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH'J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH'J\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H'¨\u0006\u0016"}, d2 = {"Lcom/huami/training/db/dao/SearchDao;", "", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/training/db/po/Tag;", "loadHotSearchResults", "Lcom/huami/training/db/po/SearchResult;", "searchResult", "", "insertSearchResult", "", "query", "mode", "deleteSearchResult", "search", "querySearchResult", "", "ids", "Lcom/huami/training/db/po/Training;", "loadById", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class SearchDao {
    @Query("DELETE FROM SearchResult WHERE `query` = :query AND mode = :mode")
    public abstract void deleteSearchResult(@NotNull String query, @NotNull String mode);

    @Insert(onConflict = 1)
    public abstract void insertSearchResult(@NotNull SearchResult searchResult);

    @Query("SELECT * FROM Training WHERE id in (:ids)")
    @NotNull
    public abstract LiveData<List<Training>> loadById(@NotNull List<Long> ids);

    @Query("SELECT * FROM Tag")
    @NotNull
    public abstract LiveData<List<Tag>> loadHotSearchResults();

    @Query("SELECT * FROM SearchResult WHERE `query` = :query AND mode = :mode")
    @Nullable
    public abstract SearchResult querySearchResult(@NotNull String query, @NotNull String mode);

    @Query("SELECT * FROM SearchResult WHERE `query` = :query AND mode = :mode")
    @NotNull
    public abstract LiveData<SearchResult> search(@NotNull String query, @NotNull String mode);
}
