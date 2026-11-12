package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/PagedLoadDao;", "T", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;", "", "loadDataPaged", "", SearchIntents.EXTRA_QUERY, "Landroidx/sqlite/db/SupportSQLiteQuery;", "loadDataPagedDesc", "getTableName", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PagedLoadDao<T extends DailyRecordBaseEntity> {
    @NotNull
    String getTableName();

    @RawQuery
    @NotNull
    List<T> loadDataPaged(@NotNull SupportSQLiteQuery query);

    @RawQuery
    @NotNull
    List<T> loadDataPagedDesc(@NotNull SupportSQLiteQuery query);
}
