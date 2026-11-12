package com.huami.bodymeasurements.temperature.model.local;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao;
import com.huami.bodymeasurements.temperature.model.local.dao.EightySecondsTempDao;
import com.huami.bodymeasurements.temperature.model.local.dao.ManualTempDao;
import com.huami.bodymeasurements.temperature.model.local.dao.SingleTempDao;
import com.huami.bodymeasurements.temperature.model.local.entity.AllDayTempEntity;
import com.huami.bodymeasurements.temperature.model.local.entity.EightySecondsTempEntity;
import com.huami.bodymeasurements.temperature.model.local.entity.ManualTempEntity;
import com.huami.bodymeasurements.temperature.model.local.entity.SingleTempEntity;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Database(entities = {ManualTempEntity.class, AllDayTempEntity.class, SingleTempEntity.class, EightySecondsTempEntity.class}, exportSchema = false, version = 3)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&¨\u0006\r"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/TemperatureDb;", "Landroidx/room/RoomDatabase;", "Lcom/huami/bodymeasurements/temperature/model/local/dao/AllDayTempDao;", "allDayTempDao", "Lcom/huami/bodymeasurements/temperature/model/local/dao/SingleTempDao;", "singleTempDao", "Lcom/huami/bodymeasurements/temperature/model/local/dao/ManualTempDao;", "manualTempDao", "Lcom/huami/bodymeasurements/temperature/model/local/dao/EightySecondsTempDao;", "eightySecondsTempDao", "<init>", "()V", "Companion", "temperature_release"}, k = 1, mv = {1, 5, 1})
public abstract class TemperatureDb extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TemperatureDb$Companion$MIGRATION_1_2$1 a = new Migration() { // from class: com.huami.bodymeasurements.temperature.model.local.TemperatureDb$Companion$MIGRATION_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE `AllDayTemp` ADD `originalRawData` TEXT NOT NULL DEFAULT ''");
            database.execSQL("ALTER TABLE `AllDayTemp` ADD `firmVersion` TEXT NOT NULL DEFAULT ''");
            database.execSQL("ALTER TABLE `AllDayTemp` ADD `phoneSource` TEXT NOT NULL DEFAULT ''");
            database.execSQL("ALTER TABLE `SingleTemp` ADD `firmVersion` TEXT NOT NULL DEFAULT ''");
            database.execSQL("ALTER TABLE `SingleTemp` ADD `phoneSource` TEXT NOT NULL DEFAULT ''");
            database.execSQL("CREATE TABLE IF NOT EXISTS `EightySecondsTemp`(`timestamp` INTEGER NOT NULL, `flag` INTEGER NOT NULL, `wearDuration` INTEGER NOT NULL, `temp` REAL NOT NULL, `rawData` TEXT NOT NULL, `userId` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `deviceMac` TEXT NOT NULL, `deviceSn` TEXT NOT NULL, `deviceType` INTEGER NOT NULL, `appName` TEXT NOT NULL, `firmVersion` TEXT NOT NULL, `phoneSource` TEXT NOT NULL, PRIMARY KEY(`timestamp`))");
        }
    };

    @NotNull
    private static final TemperatureDb$Companion$MIGRATION_2_3$1 b = new Migration() { // from class: com.huami.bodymeasurements.temperature.model.local.TemperatureDb$Companion$MIGRATION_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE `AllDayTemp` ADD `syncStatus` INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE `SingleTemp` ADD `syncStatus` INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE `ManualTemp` ADD `syncStatus` INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE `EightySecondsTemp` ADD `syncStatus` INTEGER NOT NULL DEFAULT 0");
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0006*\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/TemperatureDb$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "dbName", "Lcom/huami/bodymeasurements/temperature/model/local/TemperatureDb;", "create", "com/huami/bodymeasurements/temperature/model/local/TemperatureDb$Companion$MIGRATION_1_2$1", "MIGRATION_1_2", "Lcom/huami/bodymeasurements/temperature/model/local/TemperatureDb$Companion$MIGRATION_1_2$1;", "com/huami/bodymeasurements/temperature/model/local/TemperatureDb$Companion$MIGRATION_2_3$1", "MIGRATION_2_3", "Lcom/huami/bodymeasurements/temperature/model/local/TemperatureDb$Companion$MIGRATION_2_3$1;", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TemperatureDb create(@NotNull Context context, @NotNull String dbName) {
            return (TemperatureDb) Room.databaseBuilder(context, TemperatureDb.class, dbName).addMigrations(TemperatureDb.a).addMigrations(TemperatureDb.b).build();
        }
    }

    @NotNull
    public abstract AllDayTempDao allDayTempDao();

    @NotNull
    public abstract EightySecondsTempDao eightySecondsTempDao();

    @NotNull
    public abstract ManualTempDao manualTempDao();

    @NotNull
    public abstract SingleTempDao singleTempDao();
}
