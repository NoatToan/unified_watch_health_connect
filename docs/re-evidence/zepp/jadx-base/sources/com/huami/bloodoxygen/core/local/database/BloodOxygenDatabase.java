package com.huami.bloodoxygen.core.local.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.huami.bloodoxygen.core.local.database.dao.ClickMeasureSpo2Dao;
import com.huami.bloodoxygen.core.local.database.dao.OdiDao;
import com.huami.bloodoxygen.core.local.database.dao.OriginOsaEventDao;
import com.huami.bloodoxygen.core.local.database.dao.OriginOsaProcessDao;
import com.huami.bloodoxygen.core.local.database.dao.OsaEventDao;
import com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao;
import com.huami.bloodoxygen.core.local.database.dao.SyncLogDao;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.database.entity.IntArrayConverter;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaProcess;
import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OsaProcess;
import com.huami.bloodoxygen.core.local.database.entity.SubTypeConverter;
import com.huami.bloodoxygen.core.local.database.entity.SyncLog;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.baseutil.MD5Util;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@TypeConverters({IntArrayConverter.class, SubTypeConverter.class})
@Database(entities = {ClickMeasuredSpo2.class, Odi.class, OsaEvent.class, OsaProcess.class, SyncLog.class, OriginOsaEvent.class, OriginOsaProcess.class}, exportSchema = true, version = 4)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0013"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/BloodOxygenDatabase;", "Landroidx/room/RoomDatabase;", "Lcom/huami/bloodoxygen/core/local/database/dao/ClickMeasureSpo2Dao;", "clickMeasureSpo2Dao", "Lcom/huami/bloodoxygen/core/local/database/dao/OdiDao;", "odiDao", "Lcom/huami/bloodoxygen/core/local/database/dao/OsaEventDao;", "osaEventDao", "Lcom/huami/bloodoxygen/core/local/database/dao/OsaProcessDao;", "osaProcessDao", "Lcom/huami/bloodoxygen/core/local/database/dao/SyncLogDao;", "syncLogDao", "Lcom/huami/bloodoxygen/core/local/database/dao/OriginOsaProcessDao;", "originOsaProcessDao", "Lcom/huami/bloodoxygen/core/local/database/dao/OriginOsaEventDao;", "originOsaEventDao", "<init>", "()V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public abstract class BloodOxygenDatabase extends RoomDatabase {

    @NotNull
    private static final String a = "BloodOxygenDatabase";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, BloodOxygenDatabase> b = new ConcurrentHashMap<>();

    @NotNull
    private static final BloodOxygenDatabase$Companion$MIGRAGTION_1_2$1 c = new Migration() { // from class: com.huami.bloodoxygen.core.local.database.BloodOxygenDatabase$Companion$MIGRAGTION_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            database.execSQL("CREATE TABLE IF NOT EXISTS `origin_osa_event` AS SELECT * FROM `osa_event`");
            database.execSQL("CREATE TABLE IF NOT EXISTS `origin_osa_process` AS SELECT * FROM `osa_process`");
        }
    };

    @NotNull
    private static final BloodOxygenDatabase$Companion$MIGRAGTION_2_3$1 d = new Migration() { // from class: com.huami.bloodoxygen.core.local.database.BloodOxygenDatabase$Companion$MIGRAGTION_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE odi ADD COLUMN score INTEGER NOT NULL DEFAULT -1");
            database.execSQL("ALTER TABLE odi ADD COLUMN dispCode INTEGER NOT NULL DEFAULT -1");
        }
    };

    @NotNull
    private static final BloodOxygenDatabase$Companion$MIGRAGTION_3_4$1 e = new Migration() { // from class: com.huami.bloodoxygen.core.local.database.BloodOxygenDatabase$Companion$MIGRAGTION_3_4$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE osa_process ADD COLUMN sleepDate TEXT NOT NULL DEFAULT ''");
            database.execSQL("ALTER TABLE osa_process ADD COLUMN toDelete INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE osa_event ADD COLUMN sleepDate TEXT NOT NULL DEFAULT ''");
            database.execSQL("ALTER TABLE osa_event ADD COLUMN toDelete INTEGER NOT NULL DEFAULT 0");
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0003\b\u000b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/BloodOxygenDatabase$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "userId", "Lcom/huami/bloodoxygen/core/local/database/BloodOxygenDatabase;", "create", "com/huami/bloodoxygen/core/local/database/BloodOxygenDatabase$Companion$MIGRAGTION_1_2$1", "MIGRAGTION_1_2", "Lcom/huami/bloodoxygen/core/local/database/BloodOxygenDatabase$Companion$MIGRAGTION_1_2$1;", "com/huami/bloodoxygen/core/local/database/BloodOxygenDatabase$Companion$MIGRAGTION_2_3$1", "MIGRAGTION_2_3", "Lcom/huami/bloodoxygen/core/local/database/BloodOxygenDatabase$Companion$MIGRAGTION_2_3$1;", "com/huami/bloodoxygen/core/local/database/BloodOxygenDatabase$Companion$MIGRAGTION_3_4$1", "MIGRAGTION_3_4", "Lcom/huami/bloodoxygen/core/local/database/BloodOxygenDatabase$Companion$MIGRAGTION_3_4$1;", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BloodOxygenDatabase create(@NotNull Context context, @NotNull String userId) {
            BloodOxygenDatabase bloodOxygenDatabase;
            synchronized (BloodOxygenDatabase.class) {
                if (BloodOxygenDatabase.b.get(userId) == null) {
                    String mD5String = MD5Util.getMD5String(userId);
                    BloodOxygenDatabase.b.put(userId, Room.databaseBuilder(context.getApplicationContext(), BloodOxygenDatabase.class, "spo2_" + mD5String).addMigrations(BloodOxygenDatabase.c, BloodOxygenDatabase.d, BloodOxygenDatabase.e).build());
                }
                bloodOxygenDatabase = (BloodOxygenDatabase) BloodOxygenDatabase.b.get(userId);
            }
            return bloodOxygenDatabase;
        }
    }

    @NotNull
    public abstract ClickMeasureSpo2Dao clickMeasureSpo2Dao();

    @NotNull
    public abstract OdiDao odiDao();

    @NotNull
    public abstract OriginOsaEventDao originOsaEventDao();

    @NotNull
    public abstract OriginOsaProcessDao originOsaProcessDao();

    @NotNull
    public abstract OsaEventDao osaEventDao();

    @NotNull
    public abstract OsaProcessDao osaProcessDao();

    @NotNull
    public abstract SyncLogDao syncLogDao();
}
