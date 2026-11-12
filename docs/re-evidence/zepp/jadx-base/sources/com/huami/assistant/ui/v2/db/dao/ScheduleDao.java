package com.huami.assistant.ui.v2.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\bg\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H'J\b\u0010\n\u001a\u00020\bH'J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH'J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H'J\u0016\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\b\u0010\u0011\u001a\u00020\u0010H'J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH'J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000bH'J\b\u0010\u0014\u001a\u00020\bH'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0010H'J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0016\u001a\u00020\u0010H'¨\u0006\u001a"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", "getAllData", "getAll", "schedule", "", "delete", "deleteAll", "", "id", "deleteById", "insertOrUpdate", "schedules", "", "getCount", "getById", "getByIdAsData", "deleteLunar", "queryLunar", "source", "deleteModelBySource", "queryModelBySource", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public interface ScheduleDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao$Companion;", "", "", "b", "Ljava/lang/String;", "TABLE_NAME", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final String TABLE_NAME = "schedule_model";

        private Companion() {
        }
    }

    @Delete
    void delete(@NotNull ScheduleModel schedule);

    @Query("delete from schedule_model")
    void deleteAll();

    @Query("delete from schedule_model where id = :id")
    void deleteById(long id);

    @Query("delete from schedule_model where source = 0x10")
    void deleteLunar();

    @Query("delete from schedule_model where source = :source")
    void deleteModelBySource(int source);

    @Query("select * from schedule_model")
    @NotNull
    List<ScheduleModel> getAll();

    @Query("select * from schedule_model")
    @NotNull
    LiveData<List<ScheduleModel>> getAllData();

    @Query("select * from schedule_model where id = :id")
    @Nullable
    ScheduleModel getById(long id);

    @Query("select * from schedule_model where id = :id")
    @NotNull
    LiveData<ScheduleModel> getByIdAsData(long id);

    @Query("select count(*) from schedule_model")
    int getCount();

    @Insert(onConflict = 1)
    void insertOrUpdate(@NotNull ScheduleModel schedule);

    @Insert(onConflict = 1)
    void insertOrUpdate(@NotNull List<ScheduleModel> schedules);

    @Query("select * from schedule_model where source = 0x10 order by startTime")
    @NotNull
    List<ScheduleModel> queryLunar();

    @Query("select * from schedule_model where source = :source")
    @NotNull
    List<ScheduleModel> queryModelBySource(int source);
}
