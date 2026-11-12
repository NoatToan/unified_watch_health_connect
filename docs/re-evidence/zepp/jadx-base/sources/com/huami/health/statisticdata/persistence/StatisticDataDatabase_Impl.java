package com.huami.health.statisticdata.persistence;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public final class StatisticDataDatabase_Impl extends StatisticDataDatabase {
    private volatile StatisticDataDao a;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `statistic_data_entity_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `version` INTEGER NOT NULL, `age_group` INTEGER NOT NULL, `time_group` INTEGER, `item_type` TEXT NOT NULL, `gender` INTEGER NOT NULL, `category` REAL NOT NULL, `count` INTEGER NOT NULL, `location` TEXT NOT NULL, `category_count` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0c53574d86197c3891c3c86fb764a55c')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `statistic_data_entity_table`");
            if (StatisticDataDatabase_Impl.this.mCallbacks != null) {
                int size = StatisticDataDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) StatisticDataDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (StatisticDataDatabase_Impl.this.mCallbacks != null) {
                int size = StatisticDataDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) StatisticDataDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            StatisticDataDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
            StatisticDataDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (StatisticDataDatabase_Impl.this.mCallbacks != null) {
                int size = StatisticDataDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) StatisticDataDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(10);
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("version", new TableInfo.Column("version", "INTEGER", true, 0, null, 1));
            map.put("age_group", new TableInfo.Column("age_group", "INTEGER", true, 0, null, 1));
            map.put("time_group", new TableInfo.Column("time_group", "INTEGER", false, 0, null, 1));
            map.put("item_type", new TableInfo.Column("item_type", "TEXT", true, 0, null, 1));
            map.put("gender", new TableInfo.Column("gender", "INTEGER", true, 0, null, 1));
            map.put("category", new TableInfo.Column("category", "REAL", true, 0, null, 1));
            map.put("count", new TableInfo.Column("count", "INTEGER", true, 0, null, 1));
            map.put("location", new TableInfo.Column("location", "TEXT", true, 0, null, 1));
            map.put("category_count", new TableInfo.Column("category_count", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("statistic_data_entity_table", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "statistic_data_entity_table");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "statistic_data_entity_table(com.huami.health.statisticdata.persistence.StatisticDataEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `statistic_data_entity_table`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "statistic_data_entity_table");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(3), "0c53574d86197c3891c3c86fb764a55c", "cdd7585ae2359a3228af10177afe49d7")).build());
    }

    @Override // com.huami.health.statisticdata.persistence.StatisticDataDatabase
    public StatisticDataDao statisticDataDao() {
        StatisticDataDao statisticDataDao;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new StatisticDataDao_Impl(this);
            }
            statisticDataDao = this.a;
        }
        return statisticDataDao;
    }
}
