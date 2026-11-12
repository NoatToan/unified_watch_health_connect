package com.xiaomi.fit.fitness.persist.db;

import android.annotation.SuppressLint;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.persist.db.FitnessDBMigration;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0013\f\u000f\u0012\u0015\u0018\u001b\u001e!$'*-0369<?B\b\u0000\u0018\u0000 D2\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0010\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001cR\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u0010\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0010\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%R\u0010\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0004\n\u0002\u0010(R\u0010\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0004\n\u0002\u0010+R\u0010\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0004\n\u0002\u0010.R\u0010\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0004\n\u0002\u00101R\u0010\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0004\n\u0002\u00104R\u0010\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0004\n\u0002\u00107R\u0010\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0004\n\u0002\u0010:R\u0010\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0004\n\u0002\u0010=R\u0010\u0010>\u001a\u00020?X\u0082\u0004¢\u0006\u0004\n\u0002\u0010@R\u0010\u0010A\u001a\u00020BX\u0082\u0004¢\u0006\u0004\n\u0002\u0010C¨\u0006E"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration;", "", "<init>", "()V", "migrations", "", "Landroidx/room/migration/Migration;", "getMigrations", "()[Landroidx/room/migration/Migration;", "migrations$delegate", "Lkotlin/Lazy;", "migration_19_20", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_19_20$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_19_20$1;", "migration_18_19", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_18_19$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_18_19$1;", "migration_17_18", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_17_18$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_17_18$1;", "migration_16_17", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_16_17$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_16_17$1;", "migration_15_16", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_15_16$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_15_16$1;", "migration_14_15", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_14_15$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_14_15$1;", "migration_13_14", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_13_14$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_13_14$1;", "migration_12_13", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_12_13$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_12_13$1;", "migration_11_12", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_11_12$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_11_12$1;", "migration_10_11", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_10_11$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_10_11$1;", "migration_9_10", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_9_10$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_9_10$1;", "migration_8_9", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_8_9$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_8_9$1;", "migration_7_8", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_7_8$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_7_8$1;", "migration_6_7", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_6_7$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_6_7$1;", "migration_5_6", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_5_6$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_5_6$1;", "migration_4_5", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_4_5$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_4_5$1;", "migration_3_4", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_3_4$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_3_4$1;", "migration_2_3", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_2_3$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_2_3$1;", "migration_1_2", "com/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_1_2$1", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDBMigration$migration_1_2$1;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessDBMigration {
    public static final int DB_VERSION = 20;

    @NotNull
    public static final String TAG = "FitnessDBMigration";

    /* JADX INFO: renamed from: migrations$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy migrations = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yo9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDBMigration.migrations_delegate$lambda$0(this.f40368a);
        }
    });

    @NotNull
    private final FitnessDBMigration$migration_19_20$1 migration_19_20 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_19_20$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `temperature_trend` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            database.execSQL("CREATE TABLE IF NOT EXISTS `temperature_characteristic_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            database.execSQL("CREATE TABLE IF NOT EXISTS `algo_curse` ( `id` INTEGER NOT NULL,  `startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `ovulationTime` INTEGER NOT NULL,  `cursePeriod` INTEGER NOT NULL,  `menstrualPeriod` INTEGER NOT NULL,  `status` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_18_19$1 migration_18_19 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_18_19$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS `health_connect_sync_info` ( `uid` TEXT NOT NULL,  `dataType` INTEGER NOT NULL,  `type` TEXT NOT NULL,  `sid` TEXT NOT NULL,  `key` TEXT NOT NULL,  `time` INTEGER NOT NULL,  `timeZoneOffset` INTEGER NOT NULL,  `value` Text, `editedValue` Text,  `status` INTEGER NOT NULL,  `isDeleted` INTEGER NOT NULL,  `recordId` TEXT,  `clientRecordId` TEXT,  `startTime` INTEGER, `endTime` INTEGER, PRIMARY KEY(`uid`, `dataType`,`type`,`sid`,`key`,`time`))");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_17_18$1 migration_17_18 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_17_18$1
        @Override // androidx.room.migration.Migration
        @SuppressLint({"SuspiciousIndentation"})
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `training_plan_week` ( `type` INTEGER NOT NULL,  `id` INTEGER NOT NULL, `curWeekPlan` TEXT, `stopped` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            database.execSQL("CREATE TABLE IF NOT EXISTS `training_plan_cur_date` ( `type` INTEGER NOT NULL,  `id` INTEGER NOT NULL,  `date` INTEGER NOT NULL, `curDatePlan` TEXT,  PRIMARY KEY(`id`, `date`) )");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_16_17$1 migration_16_17 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_16_17$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `switch_song_dao` ( `time` INTEGER NOT NULL, `value` TEXT NOT NULL, `isUpload` INTEGER NOT NULL,  `extra` TEXT, PRIMARY KEY(`time`) )");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_15_16$1 migration_15_16 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_15_16$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `extra_data` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, `value` TEXT, PRIMARY KEY(`key`, `sid`,`time`))");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_14_15$1 migration_14_15 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_14_15$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `physical_fitness_status` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, `value` TEXT, PRIMARY KEY(`key`, `sid`,`time`))");
            database.execSQL("CREATE TABLE IF NOT EXISTS `lactate_threshold` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, `value` TEXT, PRIMARY KEY(`key`, `sid`,`time`))");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_13_14$1 migration_13_14 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_13_14$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `blood_sugar_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, `value` TEXT, PRIMARY KEY(`key`, `sid`,`time`))");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_12_13$1 migration_12_13 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_12_13$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `ecg_medical_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, `value` TEXT, `analyzedStatus` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`,`time`))");
            database.execSQL("CREATE TABLE IF NOT EXISTS `blood_pressure_medical_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, `value` TEXT, PRIMARY KEY(`key`, `sid`,`time`))");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_11_12$1 migration_11_12 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_11_12$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `vitality_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, `value` TEXT, PRIMARY KEY(`key`, `sid`,`time`))");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_10_11$1 migration_10_11 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_10_11$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            Logger.i(FitnessDBMigration.TAG, "curse migrate add updateTime");
            try {
                try {
                    database.execSQL("ALTER TABLE curse_record ADD COLUMN updateTime INTEGER NOT NULL DEFAULT 0");
                } catch (Exception e) {
                    Logger.i(FitnessDBMigration.TAG, "execSql exception " + e);
                }
            } finally {
                Logger.i(FitnessDBMigration.TAG, "curse migration_10_11 finish");
            }
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_9_10$1 migration_9_10 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_9_10$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `running_ability_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, `value` TEXT, PRIMARY KEY(`key`, `sid`,`time`))");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_8_9$1 migration_8_9 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_8_9$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            try {
                database.execSQL("ALTER TABLE `weight_item_record` ADD `value` TEXT; ");
            } catch (Exception e) {
                FitnessLogUtils.e(FitnessDBMigration.TAG, "migration_8_9", e);
            }
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_7_8$1 migration_7_8 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_7_8$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `temperature_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, `value` TEXT, PRIMARY KEY(`key`, `sid`,`time`))");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_6_7$1 migration_6_7 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_6_7$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `training_load_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, `value` TEXT, PRIMARY KEY(`key`, `sid`,`time`))");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_5_6$1 migration_5_6 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_5_6$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            try {
                database.execSQL("ALTER TABLE `fds_data_id` ADD `extra` TEXT; ");
            } catch (Exception e) {
                FitnessLogUtils.e(FitnessDBMigration.TAG, "migration_5_6", e);
            }
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_4_5$1 migration_4_5 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_4_5$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `fds_data_id` (`sid` TEXT NOT NULL, `idBytes` BLOB NOT NULL, `time` INTEGER NOT NULL, `dailyType` INTEGER NOT NULL, `sportType` INTEGER NOT NULL, `fileType` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, PRIMARY KEY(`sid`, `idBytes`))");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_3_4$1 migration_3_4 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_3_4$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("DROP TABLE IF EXISTS weight_record");
            database.execSQL("CREATE TABLE IF NOT EXISTS `weight_item_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `zeroTimeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, `weight` FLOAT NOT NULL, `bmi` FLOAT, `bodyFatRate` FLOAT, `moistureRate` FLOAT, `boneMass` FLOAT, `basalMetabolism` INTEGER, `muscleMass` FLOAT, `proteinRate` FLOAT, `visceralFat` FLOAT, PRIMARY KEY(`key`, `sid`,`time`))");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_2_3$1 migration_2_3 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase _db) {
            Intrinsics.checkNotNullParameter(_db, "_db");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `curse_observer` (`id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    };

    @NotNull
    private final FitnessDBMigration$migration_1_2$1 migration_1_2 = new Migration() { // from class: com.xiaomi.fit.fitness.persist.db.FitnessDBMigration$migration_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase _db) {
            Intrinsics.checkNotNullParameter(_db, "_db");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `curse_record` (`startSec0TZ` INTEGER NOT NULL, `endSec0TZ` INTEGER NOT NULL, `interval` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_curse_record_startSec0TZ` ON `curse_record` (`startSec0TZ`)");
            _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_curse_record_endSec0TZ` ON `curse_record` (`endSec0TZ`)");
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Migration[] migrations_delegate$lambda$0(FitnessDBMigration this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Migration[]{this$0.migration_1_2, this$0.migration_2_3, this$0.migration_3_4, this$0.migration_4_5, this$0.migration_5_6, this$0.migration_6_7, this$0.migration_7_8, this$0.migration_8_9, this$0.migration_9_10, this$0.migration_10_11, this$0.migration_11_12, this$0.migration_12_13, this$0.migration_13_14, this$0.migration_14_15, this$0.migration_15_16, this$0.migration_16_17, this$0.migration_17_18, this$0.migration_18_19, this$0.migration_19_20};
    }

    @NotNull
    public final Migration[] getMigrations() {
        return (Migration[]) this.migrations.getValue();
    }
}
