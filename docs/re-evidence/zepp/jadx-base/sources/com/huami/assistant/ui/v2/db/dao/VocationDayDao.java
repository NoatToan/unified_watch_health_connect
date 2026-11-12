package com.huami.assistant.ui.v2.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.assistant.ui.v2.model.VocationDayModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bg\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH'J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H'J\b\u0010\r\u001a\u00020\nH'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0003H'J\u0016\u0010\u0012\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¨\u0006\u0015"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/VocationDayDao;", "", "", "Lcom/huami/assistant/ui/v2/model/VocationDayModel;", "getAll", "", "year", "getYearData", "", "id", "", "deleteById", "deleteByYear", "deleteAll", "getRestDay", "getUnRestDay", "getUnRest", "vocationDayModel", "insertOrUpdate", "vocationDayModels", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public interface VocationDayDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/VocationDayDao$Companion;", "", "", "b", "Ljava/lang/String;", "TABLE_NAME", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final String TABLE_NAME = "vocation_model";

        private Companion() {
        }
    }

    @Query("delete from vocation_model")
    void deleteAll();

    @Query("delete from vocation_model where id = :id")
    void deleteById(long id);

    @Query("delete from vocation_model where id = :year")
    void deleteByYear(@NotNull String year);

    @Query("select * from vocation_model Order by date")
    @NotNull
    List<VocationDayModel> getAll();

    @Query("select * from vocation_model where isVocation = 1 Order by date")
    @NotNull
    List<VocationDayModel> getRestDay();

    @Query("select * from vocation_model where year = :year and isVocation = 1 Order by date")
    @NotNull
    List<VocationDayModel> getRestDay(@NotNull String year);

    @Query("select * from vocation_model where year = :year and isVocation = 0 Order by date")
    @NotNull
    List<VocationDayModel> getUnRest(@NotNull String year);

    @Query("select * from vocation_model where isVocation = 0 Order by date")
    @NotNull
    List<VocationDayModel> getUnRestDay();

    @Query("select * from vocation_model where year= :year Order by date")
    @NotNull
    List<VocationDayModel> getYearData(@NotNull String year);

    @Insert(onConflict = 1)
    void insertOrUpdate(@NotNull VocationDayModel vocationDayModel);

    @Insert(onConflict = 1)
    void insertOrUpdate(@NotNull List<VocationDayModel> vocationDayModels);
}
