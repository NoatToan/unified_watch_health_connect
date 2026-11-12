package com.huami.restheartrate.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.watch.companion.dataflow.Constant;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public final class RestHeartDb_Impl extends RestHeartDb {
    private volatile RestHeartDao c;
    private volatile MaxHeartDao d;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `rest_heart_rate` (`userId` TEXT NOT NULL, `date` TEXT NOT NULL, `heartRate` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `max_heart_rate` (`userId` TEXT NOT NULL, `date` TEXT NOT NULL, `heartRate` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dd08d5406949a52312695b54ab2aedcd')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `rest_heart_rate`");
            _db.execSQL("DROP TABLE IF EXISTS `max_heart_rate`");
            if (RestHeartDb_Impl.this.mCallbacks != null) {
                int size = RestHeartDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) RestHeartDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (RestHeartDb_Impl.this.mCallbacks != null) {
                int size = RestHeartDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) RestHeartDb_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            RestHeartDb_Impl.this.mDatabase = _db;
            RestHeartDb_Impl.this.internalInitInvalidationTracker(_db);
            if (RestHeartDb_Impl.this.mCallbacks != null) {
                int size = RestHeartDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) RestHeartDb_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            HashMap map = new HashMap(4);
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map.put("date", new TableInfo.Column("date", "TEXT", true, 2, null, 1));
            map.put(Constant.KEY_HR_VALUE, new TableInfo.Column(Constant.KEY_HR_VALUE, "INTEGER", true, 0, null, 1));
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("rest_heart_rate", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "rest_heart_rate");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "rest_heart_rate(com.huami.restheartrate.entity.RestHeartEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(4);
            map2.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map2.put("date", new TableInfo.Column("date", "TEXT", true, 2, null, 1));
            map2.put(Constant.KEY_HR_VALUE, new TableInfo.Column(Constant.KEY_HR_VALUE, "INTEGER", true, 0, null, 1));
            map2.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("max_heart_rate", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(_db, "max_heart_rate");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "max_heart_rate(com.huami.restheartrate.entity.MaxHeartEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `rest_heart_rate`");
            writableDatabase.execSQL("DELETE FROM `max_heart_rate`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "rest_heart_rate", "max_heart_rate");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(2), "dd08d5406949a52312695b54ab2aedcd", "424cd76ba32cdfbdd59e893520a3204e")).build());
    }

    @Override // com.huami.restheartrate.room.RestHeartDb
    public MaxHeartDao getMaxHeartDao() {
        MaxHeartDao maxHeartDao;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = new MaxHeartDao_Impl(this);
            }
            maxHeartDao = this.d;
        }
        return maxHeartDao;
    }

    @Override // com.huami.restheartrate.room.RestHeartDb
    public RestHeartDao getRestHeartDao() {
        RestHeartDao restHeartDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new RestHeartDao_Impl(this);
            }
            restHeartDao = this.c;
        }
        return restHeartDao;
    }
}
