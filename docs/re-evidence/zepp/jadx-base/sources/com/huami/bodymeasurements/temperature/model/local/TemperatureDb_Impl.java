package com.huami.bodymeasurements.temperature.model.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao;
import com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao_Impl;
import com.huami.bodymeasurements.temperature.model.local.dao.EightySecondsTempDao;
import com.huami.bodymeasurements.temperature.model.local.dao.EightySecondsTempDao_Impl;
import com.huami.bodymeasurements.temperature.model.local.dao.ManualTempDao;
import com.huami.bodymeasurements.temperature.model.local.dao.ManualTempDao_Impl;
import com.huami.bodymeasurements.temperature.model.local.dao.SingleTempDao;
import com.huami.bodymeasurements.temperature.model.local.dao.SingleTempDao_Impl;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class TemperatureDb_Impl extends TemperatureDb {
    private volatile AllDayTempDao c;
    private volatile SingleTempDao d;
    private volatile ManualTempDao e;
    private volatile EightySecondsTempDao f;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `ManualTemp` (`timestamp` INTEGER NOT NULL, `temp` REAL NOT NULL, `userId` TEXT NOT NULL, `appName` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `AllDayTemp` (`timestamp` INTEGER NOT NULL, `maxTemp` REAL NOT NULL, `minTemp` REAL NOT NULL, `avgTemp` REAL NOT NULL, `data` TEXT NOT NULL, `originalRawData` TEXT NOT NULL, `userId` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `deviceMac` TEXT NOT NULL, `deviceSn` TEXT NOT NULL, `deviceType` INTEGER NOT NULL, `appName` TEXT NOT NULL, `firmVersion` TEXT NOT NULL, `phoneSource` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `SingleTemp` (`timestamp` INTEGER NOT NULL, `temp` REAL NOT NULL, `envTemp` REAL NOT NULL, `userId` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `deviceMac` TEXT NOT NULL, `deviceSn` TEXT NOT NULL, `deviceType` INTEGER NOT NULL, `appName` TEXT NOT NULL, `firmVersion` TEXT NOT NULL, `phoneSource` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `EightySecondsTemp` (`timestamp` INTEGER NOT NULL, `flag` INTEGER NOT NULL, `wearDuration` INTEGER NOT NULL, `temp` REAL NOT NULL, `rawData` TEXT NOT NULL, `userId` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `deviceMac` TEXT NOT NULL, `deviceSn` TEXT NOT NULL, `deviceType` INTEGER NOT NULL, `appName` TEXT NOT NULL, `firmVersion` TEXT NOT NULL, `phoneSource` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f2d8a5ab3526b93f84793a3232aedaf8')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `ManualTemp`");
            _db.execSQL("DROP TABLE IF EXISTS `AllDayTemp`");
            _db.execSQL("DROP TABLE IF EXISTS `SingleTemp`");
            _db.execSQL("DROP TABLE IF EXISTS `EightySecondsTemp`");
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
            HashMap map = new HashMap(5);
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
            map.put("temp", new TableInfo.Column("temp", "REAL", true, 0, null, 1));
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map.put("appName", new TableInfo.Column("appName", "TEXT", true, 0, null, 1));
            map.put("syncStatus", new TableInfo.Column("syncStatus", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("ManualTemp", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "ManualTemp");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "ManualTemp(com.huami.bodymeasurements.temperature.model.local.entity.ManualTempEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(16);
            map2.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
            map2.put("maxTemp", new TableInfo.Column("maxTemp", "REAL", true, 0, null, 1));
            map2.put("minTemp", new TableInfo.Column("minTemp", "REAL", true, 0, null, 1));
            map2.put("avgTemp", new TableInfo.Column("avgTemp", "REAL", true, 0, null, 1));
            map2.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, 1));
            map2.put("originalRawData", new TableInfo.Column("originalRawData", "TEXT", true, 0, null, 1));
            map2.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map2.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map2.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map2.put(ParamKey.deviceMac, new TableInfo.Column(ParamKey.deviceMac, "TEXT", true, 0, null, 1));
            map2.put(ParamKey.deviceSn, new TableInfo.Column(ParamKey.deviceSn, "TEXT", true, 0, null, 1));
            map2.put("deviceType", new TableInfo.Column("deviceType", "INTEGER", true, 0, null, 1));
            map2.put("appName", new TableInfo.Column("appName", "TEXT", true, 0, null, 1));
            map2.put("firmVersion", new TableInfo.Column("firmVersion", "TEXT", true, 0, null, 1));
            map2.put("phoneSource", new TableInfo.Column("phoneSource", "TEXT", true, 0, null, 1));
            map2.put("syncStatus", new TableInfo.Column("syncStatus", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("AllDayTemp", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(_db, "AllDayTemp");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "AllDayTemp(com.huami.bodymeasurements.temperature.model.local.entity.AllDayTempEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(13);
            map3.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
            map3.put("temp", new TableInfo.Column("temp", "REAL", true, 0, null, 1));
            map3.put("envTemp", new TableInfo.Column("envTemp", "REAL", true, 0, null, 1));
            map3.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map3.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map3.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map3.put(ParamKey.deviceMac, new TableInfo.Column(ParamKey.deviceMac, "TEXT", true, 0, null, 1));
            map3.put(ParamKey.deviceSn, new TableInfo.Column(ParamKey.deviceSn, "TEXT", true, 0, null, 1));
            map3.put("deviceType", new TableInfo.Column("deviceType", "INTEGER", true, 0, null, 1));
            map3.put("appName", new TableInfo.Column("appName", "TEXT", true, 0, null, 1));
            map3.put("firmVersion", new TableInfo.Column("firmVersion", "TEXT", true, 0, null, 1));
            map3.put("phoneSource", new TableInfo.Column("phoneSource", "TEXT", true, 0, null, 1));
            map3.put("syncStatus", new TableInfo.Column("syncStatus", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo("SingleTemp", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(_db, "SingleTemp");
            if (!tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(false, "SingleTemp(com.huami.bodymeasurements.temperature.model.local.entity.SingleTempEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
            }
            HashMap map4 = new HashMap(15);
            map4.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
            map4.put("flag", new TableInfo.Column("flag", "INTEGER", true, 0, null, 1));
            map4.put("wearDuration", new TableInfo.Column("wearDuration", "INTEGER", true, 0, null, 1));
            map4.put("temp", new TableInfo.Column("temp", "REAL", true, 0, null, 1));
            map4.put("rawData", new TableInfo.Column("rawData", "TEXT", true, 0, null, 1));
            map4.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map4.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map4.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map4.put(ParamKey.deviceMac, new TableInfo.Column(ParamKey.deviceMac, "TEXT", true, 0, null, 1));
            map4.put(ParamKey.deviceSn, new TableInfo.Column(ParamKey.deviceSn, "TEXT", true, 0, null, 1));
            map4.put("deviceType", new TableInfo.Column("deviceType", "INTEGER", true, 0, null, 1));
            map4.put("appName", new TableInfo.Column("appName", "TEXT", true, 0, null, 1));
            map4.put("firmVersion", new TableInfo.Column("firmVersion", "TEXT", true, 0, null, 1));
            map4.put("phoneSource", new TableInfo.Column("phoneSource", "TEXT", true, 0, null, 1));
            map4.put("syncStatus", new TableInfo.Column("syncStatus", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo7 = new TableInfo("EightySecondsTemp", map4, new HashSet(0), new HashSet(0));
            TableInfo tableInfo8 = TableInfo.read(_db, "EightySecondsTemp");
            if (tableInfo7.equals(tableInfo8)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "EightySecondsTemp(com.huami.bodymeasurements.temperature.model.local.entity.EightySecondsTempEntity).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
        }
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.TemperatureDb
    public AllDayTempDao allDayTempDao() {
        AllDayTempDao allDayTempDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new AllDayTempDao_Impl(this);
            }
            allDayTempDao = this.c;
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
            writableDatabase.execSQL("DELETE FROM `EightySecondsTemp`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "ManualTemp", "AllDayTemp", "SingleTemp", "EightySecondsTemp");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(3), "f2d8a5ab3526b93f84793a3232aedaf8", "e1023d17b84e6f4069602d808b954759")).build());
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.TemperatureDb
    public EightySecondsTempDao eightySecondsTempDao() {
        EightySecondsTempDao eightySecondsTempDao;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            if (this.f == null) {
                this.f = new EightySecondsTempDao_Impl(this);
            }
            eightySecondsTempDao = this.f;
        }
        return eightySecondsTempDao;
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.TemperatureDb
    public ManualTempDao manualTempDao() {
        ManualTempDao manualTempDao;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new ManualTempDao_Impl(this);
            }
            manualTempDao = this.e;
        }
        return manualTempDao;
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.TemperatureDb
    public SingleTempDao singleTempDao() {
        SingleTempDao singleTempDao;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = new SingleTempDao_Impl(this);
            }
            singleTempDao = this.d;
        }
        return singleTempDao;
    }
}
