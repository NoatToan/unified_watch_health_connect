package com.huami.rawdata_uploader.relation.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class RawDataDataBase_Impl extends RawDataDataBase {
    private volatile RawDataDao b;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `RawDataDbVo` (`measureTime` INTEGER NOT NULL, `userId` TEXT NOT NULL, `dataType` INTEGER NOT NULL, `zipName` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceType` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `deviceMac` TEXT NOT NULL, `firmVersion` TEXT NOT NULL, `sn` TEXT NOT NULL, `rawLocalPath` TEXT NOT NULL, `rawLocalFileSize` INTEGER NOT NULL, `extra` TEXT NOT NULL, `extra1` TEXT NOT NULL, PRIMARY KEY(`measureTime`, `userId`, `dataType`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6a3e6b0833477a6b78e800cc65ce384c')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `RawDataDbVo`");
            if (RawDataDataBase_Impl.this.mCallbacks != null) {
                int size = RawDataDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) RawDataDataBase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (RawDataDataBase_Impl.this.mCallbacks != null) {
                int size = RawDataDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) RawDataDataBase_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            RawDataDataBase_Impl.this.mDatabase = _db;
            RawDataDataBase_Impl.this.internalInitInvalidationTracker(_db);
            if (RawDataDataBase_Impl.this.mCallbacks != null) {
                int size = RawDataDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) RawDataDataBase_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            HashMap map = new HashMap(14);
            map.put(BloodPressureConst.ParamKey.MEASURETIME, new TableInfo.Column(BloodPressureConst.ParamKey.MEASURETIME, "INTEGER", true, 1, null, 1));
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 2, null, 1));
            map.put("dataType", new TableInfo.Column("dataType", "INTEGER", true, 3, null, 1));
            map.put("zipName", new TableInfo.Column("zipName", "TEXT", true, 0, null, 1));
            map.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map.put("deviceType", new TableInfo.Column("deviceType", "INTEGER", true, 0, null, 1));
            map.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map.put(ParamKey.deviceMac, new TableInfo.Column(ParamKey.deviceMac, "TEXT", true, 0, null, 1));
            map.put("firmVersion", new TableInfo.Column("firmVersion", "TEXT", true, 0, null, 1));
            map.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            map.put(EcgData.LOCAL_ECG_RAW_FILE_PATH, new TableInfo.Column(EcgData.LOCAL_ECG_RAW_FILE_PATH, "TEXT", true, 0, null, 1));
            map.put("rawLocalFileSize", new TableInfo.Column("rawLocalFileSize", "INTEGER", true, 0, null, 1));
            map.put("extra", new TableInfo.Column("extra", "TEXT", true, 0, null, 1));
            map.put("extra1", new TableInfo.Column("extra1", "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo(RawDataDbVo.TABLE_NAME, map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, RawDataDbVo.TABLE_NAME);
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "RawDataDbVo(com.huami.rawdata_uploader.relation.local.RawDataDbVo).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `RawDataDbVo`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), RawDataDbVo.TABLE_NAME);
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(1), "6a3e6b0833477a6b78e800cc65ce384c", "0c7fe3260ad5b0c04d85602185ece688")).build());
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(RawDataDao.class, RawDataDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.huami.rawdata_uploader.relation.local.RawDataDataBase
    public RawDataDao rawDataDao() {
        RawDataDao rawDataDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new RawDataDao_Impl(this);
            }
            rawDataDao = this.b;
        }
        return rawDataDao;
    }
}
