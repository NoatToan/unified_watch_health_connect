package com.huami.heartrate.repository.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.mifit.sportlib.common.Constants;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateDb_Impl extends HeartRateDb {
    private volatile HeartRateDao b;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `HEART_RATE` (`type` INTEGER, `deviceType` INTEGER, `deviceSource` INTEGER, `time` INTEGER NOT NULL, `hr` INTEGER, `state` INTEGER, `timeZone` INTEGER, `deviceId` TEXT, `userId` TEXT, PRIMARY KEY(`time`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f5daf37225e581fff50b4a1ca25348a8')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `HEART_RATE`");
            if (HeartRateDb_Impl.this.mCallbacks != null) {
                int size = HeartRateDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) HeartRateDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (HeartRateDb_Impl.this.mCallbacks != null) {
                int size = HeartRateDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) HeartRateDb_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            HeartRateDb_Impl.this.mDatabase = _db;
            HeartRateDb_Impl.this.internalInitInvalidationTracker(_db);
            if (HeartRateDb_Impl.this.mCallbacks != null) {
                int size = HeartRateDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) HeartRateDb_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            HashMap map = new HashMap(9);
            map.put("type", new TableInfo.Column("type", "INTEGER", false, 0, null, 1));
            map.put("deviceType", new TableInfo.Column("deviceType", "INTEGER", false, 0, null, 1));
            map.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", false, 0, null, 1));
            map.put("time", new TableInfo.Column("time", "INTEGER", true, 1, null, 1));
            map.put(Constants.DATA_KEY_HR, new TableInfo.Column(Constants.DATA_KEY_HR, "INTEGER", false, 0, null, 1));
            map.put("state", new TableInfo.Column("state", "INTEGER", false, 0, null, 1));
            map.put("timeZone", new TableInfo.Column("timeZone", "INTEGER", false, 0, null, 1));
            map.put("deviceId", new TableInfo.Column("deviceId", "TEXT", false, 0, null, 1));
            map.put("userId", new TableInfo.Column("userId", "TEXT", false, 0, null, 1));
            TableInfo tableInfo = new TableInfo("HEART_RATE", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "HEART_RATE");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "HEART_RATE(com.huami.heartrate.repository.entity.HeartRateEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `HEART_RATE`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "HEART_RATE");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(1), "f5daf37225e581fff50b4a1ca25348a8", "0b32755ef68f521feb4aa3f41543b199")).build());
    }

    @Override // com.huami.heartrate.repository.db.HeartRateDb
    public HeartRateDao manualHeartRateDao() {
        HeartRateDao heartRateDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new HeartRateDao_Impl(this);
            }
            heartRateDao = this.b;
        }
        return heartRateDao;
    }
}
