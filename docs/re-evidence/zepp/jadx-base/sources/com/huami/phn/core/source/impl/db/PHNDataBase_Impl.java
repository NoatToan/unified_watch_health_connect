package com.huami.phn.core.source.impl.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.phn.core.model.PHNDailyAnalysisResult;
import com.huami.phn.core.model.PHNProjectRecord;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes12.dex */
public final class PHNDataBase_Impl extends PHNDataBase {
    private volatile PHNProjectRecordDao b;
    private volatile PHNDailyAnaResultDao c;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `phn_project` (`timestamp` INTEGER NOT NULL, `version` TEXT NOT NULL, `setting` TEXT NOT NULL, `result` TEXT, `source` INTEGER NOT NULL, `synced` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `phn_daily_ana_result` (`timestamp` INTEGER NOT NULL, `timezoneOffset` INTEGER NOT NULL, `phnPlanId` INTEGER NOT NULL, `result` TEXT NOT NULL, `synced` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8c9935b9d2e5d907ffd3a83ccaca9743')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `phn_project`");
            _db.execSQL("DROP TABLE IF EXISTS `phn_daily_ana_result`");
            if (PHNDataBase_Impl.this.mCallbacks != null) {
                int size = PHNDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) PHNDataBase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (PHNDataBase_Impl.this.mCallbacks != null) {
                int size = PHNDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) PHNDataBase_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            PHNDataBase_Impl.this.mDatabase = _db;
            PHNDataBase_Impl.this.internalInitInvalidationTracker(_db);
            if (PHNDataBase_Impl.this.mCallbacks != null) {
                int size = PHNDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) PHNDataBase_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
            map.put("version", new TableInfo.Column("version", "TEXT", true, 0, null, 1));
            map.put("setting", new TableInfo.Column("setting", "TEXT", true, 0, null, 1));
            map.put("result", new TableInfo.Column("result", "TEXT", false, 0, null, 1));
            map.put("source", new TableInfo.Column("source", "INTEGER", true, 0, null, 1));
            map.put("synced", new TableInfo.Column("synced", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo(PHNProjectRecord.TABLE_NAME, map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, PHNProjectRecord.TABLE_NAME);
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "phn_project(com.huami.phn.core.model.PHNProjectRecord).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(5);
            map2.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
            map2.put("timezoneOffset", new TableInfo.Column("timezoneOffset", "INTEGER", true, 0, null, 1));
            map2.put("phnPlanId", new TableInfo.Column("phnPlanId", "INTEGER", true, 0, null, 1));
            map2.put("result", new TableInfo.Column("result", "TEXT", true, 0, null, 1));
            map2.put("synced", new TableInfo.Column("synced", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo(PHNDailyAnalysisResult.TABLE_NAME, map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(_db, PHNDailyAnalysisResult.TABLE_NAME);
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "phn_daily_ana_result(com.huami.phn.core.model.PHNDailyAnalysisResult).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `phn_project`");
            writableDatabase.execSQL("DELETE FROM `phn_daily_ana_result`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), PHNProjectRecord.TABLE_NAME, PHNDailyAnalysisResult.TABLE_NAME);
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(1), "8c9935b9d2e5d907ffd3a83ccaca9743", "a8e1cc547167a7a3855fac9935d34bb9")).build());
    }

    @Override // com.huami.phn.core.source.impl.db.PHNDataBase
    public PHNDailyAnaResultDao phnDailyAnaResultDao() {
        PHNDailyAnaResultDao pHNDailyAnaResultDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new PHNDailyAnaResultDao_Impl(this);
            }
            pHNDailyAnaResultDao = this.c;
        }
        return pHNDailyAnaResultDao;
    }

    @Override // com.huami.phn.core.source.impl.db.PHNDataBase
    public PHNProjectRecordDao phnProjectRecordDao() {
        PHNProjectRecordDao pHNProjectRecordDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new PHNProjectRecordDao_Impl(this);
            }
            pHNProjectRecordDao = this.b;
        }
        return pHNProjectRecordDao;
    }
}
