package com.xiaomi.hm.health.step.stage.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.step.stage.local.dao.StageDao;
import com.xiaomi.hm.health.step.stage.local.dao.StageDao_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class ActivityStageDb_Impl extends ActivityStageDb {
    private volatile StageDao c;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `activity_stage` (`userId` TEXT NOT NULL, `date` TEXT NOT NULL, `timeZoneId` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `stage` TEXT NOT NULL, `uploaded` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9b4fd55cc552f51db1839045bbb53326')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `activity_stage`");
            if (ActivityStageDb_Impl.this.mCallbacks != null) {
                int size = ActivityStageDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ActivityStageDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (ActivityStageDb_Impl.this.mCallbacks != null) {
                int size = ActivityStageDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ActivityStageDb_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            ActivityStageDb_Impl.this.mDatabase = _db;
            ActivityStageDb_Impl.this.internalInitInvalidationTracker(_db);
            if (ActivityStageDb_Impl.this.mCallbacks != null) {
                int size = ActivityStageDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ActivityStageDb_Impl.this.mCallbacks.get(i)).onOpen(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase _db) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase _db) {
            DBUtil.dropFtsSyncTriggers(_db);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
            HashMap map = new HashMap(6);
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map.put("date", new TableInfo.Column("date", "TEXT", true, 2, null, 1));
            map.put("timeZoneId", new TableInfo.Column("timeZoneId", "TEXT", true, 0, null, 1));
            map.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map.put(StepsInfo.KEY_STAGE, new TableInfo.Column(StepsInfo.KEY_STAGE, "TEXT", true, 0, null, 1));
            map.put("uploaded", new TableInfo.Column("uploaded", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("activity_stage", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "activity_stage");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "activity_stage(com.xiaomi.hm.health.step.stage.local.entity.StageEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `activity_stage`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "activity_stage");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(2), "9b4fd55cc552f51db1839045bbb53326", "be04982aaab36cafba9d4c587320fc4a")).build());
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(StageDao.class, StageDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.xiaomi.hm.health.step.stage.local.ActivityStageDb
    public StageDao stageDao() {
        StageDao stageDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new StageDao_Impl(this);
            }
            stageDao = this.c;
        }
        return stageDao;
    }
}
