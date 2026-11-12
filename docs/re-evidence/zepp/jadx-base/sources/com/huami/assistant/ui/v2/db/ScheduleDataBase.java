package com.huami.assistant.ui.v2.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.huami.assistant.ui.v2.db.dao.ScheduleDao;
import com.huami.assistant.ui.v2.db.dao.ScheduleEventDao;
import com.huami.assistant.ui.v2.db.dao.VocationDayDao;
import com.huami.assistant.ui.v2.model.ScheduleEventModel;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.assistant.ui.v2.model.VocationDayModel;
import com.huami.tools.analytics.DbUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Database(entities = {ScheduleModel.class, ScheduleEventModel.class, VocationDayModel.class}, exportSchema = false, version = 4)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/huami/assistant/ui/v2/db/ScheduleDataBase;", "Landroidx/room/RoomDatabase;", "Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "scheduleDao", "Lcom/huami/assistant/ui/v2/db/dao/ScheduleEventDao;", "scheduleEventDao", "Lcom/huami/assistant/ui/v2/db/dao/VocationDayDao;", "vocationDayDao", "<init>", "()V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public abstract class ScheduleDataBase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile ScheduleDataBase a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/assistant/ui/v2/db/ScheduleDataBase$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/assistant/ui/v2/db/ScheduleDataBase;", "getInstance", "sInstance", "Lcom/huami/assistant/ui/v2/db/ScheduleDataBase;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ScheduleDataBase getInstance(@NotNull Context context) {
            if (ScheduleDataBase.a == null) {
                synchronized (this) {
                    if (ScheduleDataBase.a == null) {
                        Companion companion = ScheduleDataBase.INSTANCE;
                        RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(context.getApplicationContext(), ScheduleDataBase.class, "schedule.db");
                        Migration[] migrations = MigrationHelper.INSTANCE.getMigrations();
                        ScheduleDataBase.a = (ScheduleDataBase) builderDatabaseBuilder.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length)).allowMainThreadQueries().build();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return ScheduleDataBase.a;
        }
    }

    @NotNull
    public abstract ScheduleDao scheduleDao();

    @NotNull
    public abstract ScheduleEventDao scheduleEventDao();

    @NotNull
    public abstract VocationDayDao vocationDayDao();
}
