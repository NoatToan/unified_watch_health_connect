package com.xiaomi.hm.health.device.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.xiaomi.hm.health.device.database.dao.DeviceRecordDao;
import com.xiaomi.hm.health.device.database.dao.DeviceRecordDao_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class DeviceDataDb_Impl extends DeviceDataDb {
    private volatile DeviceRecordDao e;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `DeviceRecord` (`id` INTEGER NOT NULL, `recordTime` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `localPath` TEXT NOT NULL, `serverPath` TEXT NOT NULL, `fileSize` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '901e055ab973e6f8459bb373aff4494b')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `DeviceRecord`");
            if (DeviceDataDb_Impl.this.mCallbacks != null) {
                int size = DeviceDataDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) DeviceDataDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (DeviceDataDb_Impl.this.mCallbacks != null) {
                int size = DeviceDataDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) DeviceDataDb_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            DeviceDataDb_Impl.this.mDatabase = _db;
            DeviceDataDb_Impl.this.internalInitInvalidationTracker(_db);
            if (DeviceDataDb_Impl.this.mCallbacks != null) {
                int size = DeviceDataDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) DeviceDataDb_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("recordTime", new TableInfo.Column("recordTime", "INTEGER", true, 0, null, 1));
            map.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, 1));
            map.put("localPath", new TableInfo.Column("localPath", "TEXT", true, 0, null, 1));
            map.put("serverPath", new TableInfo.Column("serverPath", "TEXT", true, 0, null, 1));
            map.put("fileSize", new TableInfo.Column("fileSize", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("DeviceRecord", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "DeviceRecord");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "DeviceRecord(com.xiaomi.hm.health.device.database.entity.DeviceRecordEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `DeviceRecord`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "DeviceRecord");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(2), "901e055ab973e6f8459bb373aff4494b", "7dc5cd35f3b1a43ee919071ed29fff26")).build());
    }

    @Override // com.xiaomi.hm.health.device.database.DeviceDataDb
    public DeviceRecordDao deviceRecordDao() {
        DeviceRecordDao deviceRecordDao;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new DeviceRecordDao_Impl(this);
            }
            deviceRecordDao = this.e;
        }
        return deviceRecordDao;
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(DeviceRecordDao.class, DeviceRecordDao_Impl.getRequiredConverters());
        return map;
    }
}
