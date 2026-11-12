package com.huami.assistant.ui.v2.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.assistant.ui.v2.model.ScheduleEventModel;
import com.huami.widget.share.ShareAnalytics;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bg\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H'J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H'J\u0016\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\b\u0010\r\u001a\u00020\u0007H'¨\u0006\u000f"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/ScheduleEventDao;", "", "", "Lcom/huami/assistant/ui/v2/model/ScheduleEventModel;", "getAll", "", "id", "", "deleteById", "model", "delete", ShareAnalytics.ParamValue.SAVE, "models", "clear", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public interface ScheduleEventDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/ScheduleEventDao$Companion;", "", "", "b", "Ljava/lang/String;", "TABLE_NAME", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final String TABLE_NAME = "schedule_event_model";

        private Companion() {
        }
    }

    @Query("delete from schedule_event_model")
    void clear();

    @Delete
    void delete(@NotNull ScheduleEventModel model);

    @Query("delete from schedule_event_model where id = :id")
    void deleteById(long id);

    @Query("select * from schedule_event_model")
    @NotNull
    List<ScheduleEventModel> getAll();

    @Insert(onConflict = 1)
    void save(@NotNull ScheduleEventModel model);

    @Insert(onConflict = 1)
    void save(@NotNull List<ScheduleEventModel> models);
}
