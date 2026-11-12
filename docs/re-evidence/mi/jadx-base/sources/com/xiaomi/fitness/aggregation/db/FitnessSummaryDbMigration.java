package com.xiaomi.fitness.aggregation.db;

import android.os.Build;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.aggregation.db.FitnessSummaryDbMigration;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0005\f\u000f\u0012\u0015!\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0010\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/aggregation/db/FitnessSummaryDbMigration;", "", "<init>", "()V", "migrations", "", "Landroidx/room/migration/Migration;", "getMigrations", "()[Landroidx/room/migration/Migration;", "migrations$delegate", "Lkotlin/Lazy;", "migration_5_6", "com/xiaomi/fitness/aggregation/db/FitnessSummaryDbMigration$migration_5_6$1", "Lcom/xiaomi/fitness/aggregation/db/FitnessSummaryDbMigration$migration_5_6$1;", "migration_4_5", "com/xiaomi/fitness/aggregation/db/FitnessSummaryDbMigration$migration_4_5$1", "Lcom/xiaomi/fitness/aggregation/db/FitnessSummaryDbMigration$migration_4_5$1;", "migration_3_4", "com/xiaomi/fitness/aggregation/db/FitnessSummaryDbMigration$migration_3_4$1", "Lcom/xiaomi/fitness/aggregation/db/FitnessSummaryDbMigration$migration_3_4$1;", "migration_2_3", "com/xiaomi/fitness/aggregation/db/FitnessSummaryDbMigration$migration_2_3$1", "Lcom/xiaomi/fitness/aggregation/db/FitnessSummaryDbMigration$migration_2_3$1;", "onUpgradeToV3ByRenameColumn", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "onUpgradeToV3FullVersionSupport", "alterDailyReportV3", "", "alterRedDotV3", "alterDeviceListV3", "migration_1_2", "com/xiaomi/fitness/aggregation/db/FitnessSummaryDbMigration$migration_1_2$1", "Lcom/xiaomi/fitness/aggregation/db/FitnessSummaryDbMigration$migration_1_2$1;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessSummaryDbMigration {
    public static final int DB_VERSION = 6;

    @NotNull
    private static final String TAG = "FitnessSummaryDbMigration";

    /* JADX INFO: renamed from: migrations$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy migrations = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bw9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessSummaryDbMigration.migrations_delegate$lambda$0(this.f4669a);
        }
    });

    @NotNull
    private final FitnessSummaryDbMigration$migration_5_6$1 migration_5_6 = new Migration() { // from class: com.xiaomi.fitness.aggregation.db.FitnessSummaryDbMigration$migration_5_6$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            try {
                db.execSQL("CREATE TABLE IF NOT EXISTS `data_project_temp` (`sid` TEXT NOT NULL, `key` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffset` INTEGER NOT NULL, `timeInZero` INTEGER NOT NULL, `value` TEXT NOT NULL, 'projectId' INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `time`, `sid`, `projectId`))");
                db.execSQL("INSERT OR REPLACE INTO `data_project_temp` (`sid`, `key`, `time`, `zoneOffset`,`timeInZero`, `value`,`projectId` ,`isUpload`, `isDeleted`) SELECT `sid`, `key`, `time`, `zoneOffset`,`timeInZero`, `value`,`projectId` ,`isUpload`, `isDeleted` FROM data_project");
                db.execSQL("DROP TABLE `data_project`");
                db.execSQL("ALTER TABLE `data_project_temp` RENAME TO `data_project`");
            } catch (Exception e) {
                Logger.w("FitnessSummaryDbMigration", "migration_4_5", e);
            }
        }
    };

    @NotNull
    private final FitnessSummaryDbMigration$migration_4_5$1 migration_4_5 = new Migration() { // from class: com.xiaomi.fitness.aggregation.db.FitnessSummaryDbMigration$migration_4_5$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            try {
                db.execSQL("CREATE TABLE IF NOT EXISTS `data_project` (`sid` TEXT NOT NULL, `key` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffset` INTEGER NOT NULL, `timeInZero` INTEGER NOT NULL, `value` TEXT NOT NULL, 'projectId' INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `time`))");
            } catch (Exception e) {
                Logger.w("FitnessSummaryDbMigration", "migration_4_5", e);
            }
        }
    };

    @NotNull
    private final FitnessSummaryDbMigration$migration_3_4$1 migration_3_4 = new Migration() { // from class: com.xiaomi.fitness.aggregation.db.FitnessSummaryDbMigration$migration_3_4$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            try {
                db.execSQL("CREATE TABLE IF NOT EXISTS `stat_data` (`tag` TEXT NOT NULL, `key` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffset` INTEGER NOT NULL, `timeInZero` INTEGER NOT NULL, `value` TEXT NOT NULL, `updateTime` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`tag`, `key`, `time`))");
            } catch (Exception e) {
                Logger.w("FitnessSummaryDbMigration", "migration_3_4", e);
            }
        }
    };

    @NotNull
    private final FitnessSummaryDbMigration$migration_2_3$1 migration_2_3 = new Migration() { // from class: com.xiaomi.fitness.aggregation.db.FitnessSummaryDbMigration$migration_2_3$1
        {
            super(2, 3);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (Build.VERSION.SDK_INT > 29) {
                Logger.i("FitnessSummaryDbMigration", "onUpgradeToV3ByRenameColumn start");
                boolean zOnUpgradeToV3ByRenameColumn = this.this$0.onUpgradeToV3ByRenameColumn(db);
                Logger.i("FitnessSummaryDbMigration", "onUpgradeToV3ByRenameColumn result(" + zOnUpgradeToV3ByRenameColumn + ")");
                if (zOnUpgradeToV3ByRenameColumn) {
                    return;
                }
            }
            Logger.i("FitnessSummaryDbMigration", "onUpgradeToV3FullVersionSupport start");
            Logger.i("FitnessSummaryDbMigration", "onUpgradeToV3FullVersionSupport result(" + this.this$0.onUpgradeToV3FullVersionSupport(db) + ")");
        }
    };

    @NotNull
    private final FitnessSummaryDbMigration$migration_1_2$1 migration_1_2 = new Migration() { // from class: com.xiaomi.fitness.aggregation.db.FitnessSummaryDbMigration$migration_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS `tmp_red_dot` (`sid` TEXT NOT NULL, `dataType` TEXT NOT NULL, `timeInZero` INTEGER NOT NULL, `time` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`dataType`, `timeInZero`))");
            db.execSQL("INSERT OR REPLACE INTO `tmp_red_dot` (`sid`, `dataType`, `timeInZero`, `time`, `isUpload`, `isDeleted`) SELECT `sid`, `dataType`, `timeInZero`, `time`, `isUpload`, `isDeleted` FROM red_dot");
            db.execSQL("DROP TABLE IF EXISTS red_dot");
            db.execSQL("ALTER TABLE tmp_red_dot RENAME TO red_dot");
            db.execSQL("CREATE TABLE IF NOT EXISTS `tmp_device_list` (`sid` TEXT NOT NULL, `dataType` TEXT NOT NULL, `timeInZero` INTEGER NOT NULL, `time` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`dataType`, `sid`, `timeInZero`))");
            db.execSQL("INSERT OR REPLACE INTO `tmp_device_list` (`sid`, `dataType`, `timeInZero`, `time`, `isUpload`, `isDeleted`) SELECT `sid`, `dataType`, `timeInZero`, `time`, `isUpload`, `isDeleted` FROM device_list");
            db.execSQL("DROP TABLE IF EXISTS device_list");
            db.execSQL("ALTER TABLE tmp_device_list RENAME TO device_list");
        }
    };

    private final void alterDailyReportV3(SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `daily_report_tmp` (`sid` TEXT NOT NULL, `dataType` TEXT NOT NULL, `timeInZero` INTEGER NOT NULL, `updateTime` INTEGER NOT NULL, `viewTag` TEXT NOT NULL, `value` TEXT NOT NULL,  `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`dataType`, `sid`, `timeInZero`, `viewTag`))");
        db.execSQL("INSERT OR REPLACE INTO `daily_report_tmp` (`sid`, `dataType`, `timeInZero`, `updateTime`, `viewTag`, `value`, `isUpload`, `isDeleted`) SELECT `sid`, `dataType`, `timeInZero`, `time`, `viewTag`, `value`, `isUpload`, `isDeleted` FROM daily_report");
        db.execSQL("DROP TABLE IF EXISTS daily_report");
        db.execSQL("ALTER TABLE daily_report_tmp RENAME TO daily_report");
    }

    private final void alterDeviceListV3(SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `device_list_tmp` (`sid` TEXT NOT NULL, `dataType` TEXT NOT NULL, `timeInZero` INTEGER NOT NULL, `updateTime` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`dataType`, `sid`, `timeInZero`))");
        db.execSQL("INSERT OR REPLACE INTO `device_list_tmp` (`sid`, `dataType`, `timeInZero`, `updateTime`, `isUpload`, `isDeleted`) SELECT `sid`, `dataType`, `timeInZero`, `time`, `isUpload`, `isDeleted` FROM device_list");
        db.execSQL("DROP TABLE IF EXISTS device_list");
        db.execSQL("ALTER TABLE device_list_tmp RENAME TO device_list");
    }

    private final void alterRedDotV3(SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `red_dot_tmp` (`sid` TEXT NOT NULL, `dataType` TEXT NOT NULL, `timeInZero` INTEGER NOT NULL, `updateTime` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`dataType`, `timeInZero`))");
        db.execSQL("INSERT OR REPLACE INTO `red_dot_tmp` (`sid`, `dataType`, `timeInZero`, `updateTime`, `isUpload`, `isDeleted`) SELECT `sid`, `dataType`, `timeInZero`, `time`, `isUpload`, `isDeleted` FROM red_dot");
        db.execSQL("DROP TABLE IF EXISTS red_dot");
        db.execSQL("ALTER TABLE red_dot_tmp RENAME TO red_dot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Migration[] migrations_delegate$lambda$0(FitnessSummaryDbMigration this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Migration[]{this$0.migration_1_2, this$0.migration_2_3, this$0.migration_3_4, this$0.migration_4_5, this$0.migration_5_6};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onUpgradeToV3ByRenameColumn(SupportSQLiteDatabase db) {
        try {
            db.execSQL("ALTER TABLE daily_report RENAME COLUMN time TO updateTime;");
            db.execSQL("ALTER TABLE red_dot RENAME COLUMN time TO updateTime;");
            db.execSQL("ALTER TABLE device_list RENAME COLUMN time TO updateTime;");
            return true;
        } catch (Exception e) {
            Logger.e(TAG, "onUpgradeToV3ByRenameColumn exception", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onUpgradeToV3FullVersionSupport(SupportSQLiteDatabase db) {
        try {
            alterDailyReportV3(db);
            alterRedDotV3(db);
            alterDeviceListV3(db);
            return true;
        } catch (Exception e) {
            Logger.e(TAG, "onUpgradeToV3FullVersionSupport exception", e);
            return false;
        }
    }

    @NotNull
    public final Migration[] getMigrations() {
        return (Migration[]) this.migrations.getValue();
    }
}
