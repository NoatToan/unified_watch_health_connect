package com.huami.bloodoxygen.core.local.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H'J \u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H'J\u0016\u0010\r\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\tH'J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H'J,\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H'J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H'J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u001b"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/dao/OdiDao;", "", "", "userId", "date", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "getValidFlow", "getFlow", "", "getShouldUpload", "odi", "", Constant.METHOD_INSERT, "odis", "", "from", "to", "query", "getListFow", "queryLatest", "getLatestFlow", "", "clear", "", "getIfRawExistsFlow", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public interface OdiDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String ODI_VALID_SQL = "(valid = 1 OR valid = 2)";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/dao/OdiDao$Companion;", "", "", "ODI_VALID_SQL", "Ljava/lang/String;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String ODI_VALID_SQL = "(valid = 1 OR valid = 2)";
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @Query("DELETE FROM odi WHERE userId = :userId")
    void clear(@NotNull String userId);

    @Query("SELECT * FROM odi WHERE userId = :userId AND date = :date")
    @NotNull
    Flow<Odi> getFlow(@NotNull String userId, @NotNull String date);

    @Query("SELECT EXISTS (SELECT * FROM odi WHERE userId = :userId)")
    @NotNull
    Flow<Boolean> getIfRawExistsFlow(@NotNull String userId);

    @Query("SELECT * FROM odi WHERE userId = :userId ORDER BY date DESC LIMIT 1")
    @NotNull
    Flow<Odi> getLatestFlow(@NotNull String userId);

    @Query("SELECT * FROM odi WHERE userId = :userId AND date BETWEEN :from AND :to")
    @NotNull
    Flow<List<Odi>> getListFow(@NotNull String userId, @NotNull String from, @NotNull String to);

    @Query("SELECT * FROM odi WHERE userId = :userId AND uploaded = 0")
    @NotNull
    List<Odi> getShouldUpload(@NotNull String userId);

    @Query("SELECT * FROM odi WHERE userId = :userId AND date = :date AND (valid = 1 OR valid = 2)")
    @NotNull
    Flow<Odi> getValidFlow(@NotNull String userId, @NotNull String date);

    @Insert(onConflict = 1)
    long insert(@NotNull Odi odi);

    @Insert(onConflict = 1)
    @NotNull
    long[] insert(@NotNull List<Odi> odis);

    @Query("SELECT * FROM odi WHERE userId = :userId AND date == :date")
    @Nullable
    Odi query(@NotNull String userId, @NotNull String date);

    @Query("SELECT * FROM odi WHERE userId = :userId AND date BETWEEN :from AND :to")
    @NotNull
    List<Odi> query(@NotNull String userId, @NotNull String from, @NotNull String to);

    @Query("SELECT * FROM odi WHERE userId = :userId ORDER BY date DESC LIMIT 1")
    @Nullable
    Odi queryLatest(@NotNull String userId);
}
