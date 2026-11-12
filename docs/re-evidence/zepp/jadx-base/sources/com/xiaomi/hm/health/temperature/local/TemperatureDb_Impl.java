package com.xiaomi.hm.health.temperature.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.temperature.local.dao.AllDayTempDao;
import com.xiaomi.hm.health.temperature.local.dao.AllDayTempDao_Impl;
import com.xiaomi.hm.health.temperature.local.dao.ManualTempDao;
import com.xiaomi.hm.health.temperature.local.dao.ManualTempDao_Impl;
import com.xiaomi.hm.health.temperature.local.dao.SingleTempDao;
import com.xiaomi.hm.health.temperature.local.dao.SingleTempDao_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class TemperatureDb_Impl extends TemperatureDb {
    private volatile AllDayTempDao a;
    private volatile SingleTempDao b;
    private volatile ManualTempDao c;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `ManualTemp` (`timestamp` INTEGER NOT NULL, `temp` REAL NOT NULL, `userId` TEXT NOT NULL, PRIMARY KEY(`timestamp`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `AllDayTemp` (`timestamp` INTEGER NOT NULL, `maxTemp` REAL NOT NULL, `minTemp` REAL NOT NULL, `avgTemp` REAL NOT NULL, `data` TEXT NOT NULL, `userId` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `deviceMac` TEXT NOT NULL, `deviceSn` TEXT NOT NULL, `deviceType` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `SingleTemp` (`timestamp` INTEGER NOT NULL, `temp` REAL NOT NULL, `userId` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `deviceMac` TEXT NOT NULL, `deviceSn` TEXT NOT NULL, `deviceType` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cd1f186c60855d696e95902defd7f4a5')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `ManualTemp`");
            _db.execSQL("DROP TABLE IF EXISTS `AllDayTemp`");
            _db.execSQL("DROP TABLE IF EXISTS `SingleTemp`");
            if (TemperatureDb_Impl.this.mCallbacks != null) {
                int size = TemperatureDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) TemperatureDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (TemperatureDb_Impl.this.mCallbacks != null) {
                int size = TemperatureDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) TemperatureDb_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            TemperatureDb_Impl.this.mDatabase = _db;
            TemperatureDb_Impl.this.internalInitInvalidationTracker(_db);
            if (TemperatureDb_Impl.this.mCallbacks != null) {
                int size = TemperatureDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) TemperatureDb_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            HashMap map = new HashMap(3);
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
            map.put("temp", new TableInfo.Column("temp", "REAL", true, 0, null, 1));
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("ManualTemp", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "ManualTemp");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "ManualTemp(com.xiaomi.hm.health.temperature.local.entity.ManualTempEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(11);
            map2.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
            map2.put("maxTemp", new TableInfo.Column("maxTemp", "REAL", true, 0, null, 1));
            map2.put("minTemp", new TableInfo.Column("minTemp", "REAL", true, 0, null, 1));
            map2.put("avgTemp", new TableInfo.Column("avgTemp", "REAL", true, 0, null, 1));
            map2.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, 1));
            map2.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map2.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map2.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map2.put(ParamKey.deviceMac, new TableInfo.Column(ParamKey.deviceMac, "TEXT", true, 0, null, 1));
            map2.put(ParamKey.deviceSn, new TableInfo.Column(ParamKey.deviceSn, "TEXT", true, 0, null, 1));
            map2.put("deviceType", new TableInfo.Column("deviceType", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("AllDayTemp", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(_db, "AllDayTemp");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "AllDayTemp(com.xiaomi.hm.health.temperature.local.entity.AllDayTempEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(8);
            map3.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
            map3.put("temp", new TableInfo.Column("temp", "REAL", true, 0, null, 1));
            map3.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map3.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map3.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map3.put(ParamKey.deviceMac, new TableInfo.Column(ParamKey.deviceMac, "TEXT", true, 0, null, 1));
            map3.put(ParamKey.deviceSn, new TableInfo.Column(ParamKey.deviceSn, "TEXT", true, 0, null, 1));
            map3.put("deviceType", new TableInfo.Column("deviceType", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo("SingleTemp", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(_db, "SingleTemp");
            if (tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "SingleTemp(com.xiaomi.hm.health.temperature.local.entity.SingleTempEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
        }
    }

    @Override // com.xiaomi.hm.health.temperature.local.TemperatureDb
    public AllDayTempDao allDayTempDao() {
        AllDayTempDao allDayTempDao;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new AllDayTempDao_Impl(this);
            }
            allDayTempDao = this.a;
        }
        return allDayTempDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `ManualTemp`");
            writableDatabase.execSQL("DELETE FROM `AllDayTemp`");
            writableDatabase.execSQL("DELETE FROM `SingleTemp`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "ManualTemp", "AllDayTemp", "SingleTemp");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(1), "cd1f186c60855d696e95902defd7f4a5", "18e22e85b4d024b8d026e9dad562c845")).build());
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(AllDayTempDao.class, AllDayTempDao_Impl.getRequiredConverters());
        map.put(SingleTempDao.class, SingleTempDao_Impl.getRequiredConverters());
        map.put(ManualTempDao.class, ManualTempDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.xiaomi.hm.health.temperature.local.TemperatureDb
    public ManualTempDao manualTempDao() {
        ManualTempDao manualTempDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new ManualTempDao_Impl(this);
            }
            manualTempDao = this.c;
        }
        return manualTempDao;
    }

    @Override // com.xiaomi.hm.health.temperature.local.TemperatureDb
    public SingleTempDao singleTempDao() {
        SingleTempDao singleTempDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new SingleTempDao_Impl(this);
            }
            singleTempDao = this.b;
        }
        return singleTempDao;
    }
}
