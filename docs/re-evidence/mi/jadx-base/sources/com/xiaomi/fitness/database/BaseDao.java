package com.xiaomi.fitness.database;

import androidx.room.Insert;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\"\u00028\u0000H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000H§@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/database/BaseDao;", "T", "", "insert", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOne", SearchIntents.EXTRA_QUERY, "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "list", "", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BaseDao<T> {
    @RawQuery
    @Nullable
    Object getOne(@NotNull SupportSQLiteQuery supportSQLiteQuery, @NotNull Continuation<? super T> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insert(@NotNull T[] tArr, @NotNull Continuation<? super Unit> continuation);

    @RawQuery
    @Nullable
    Object list(@NotNull SupportSQLiteQuery supportSQLiteQuery, @NotNull Continuation<? super List<T>> continuation);

    @Update
    @Nullable
    Object update(T t, @NotNull Continuation<? super Integer> continuation);
}
