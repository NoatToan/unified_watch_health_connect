package com.huami.bloodoxygen.core.local.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.bloodoxygen.core.local.database.dao.ClickMeasureSpo2Dao;
import com.huami.bloodoxygen.core.local.database.dao.ClickMeasureSpo2Dao_Impl;
import com.huami.bloodoxygen.core.local.database.dao.OdiDao;
import com.huami.bloodoxygen.core.local.database.dao.OdiDao_Impl;
import com.huami.bloodoxygen.core.local.database.dao.OriginOsaEventDao;
import com.huami.bloodoxygen.core.local.database.dao.OriginOsaEventDao_Impl;
import com.huami.bloodoxygen.core.local.database.dao.OriginOsaProcessDao;
import com.huami.bloodoxygen.core.local.database.dao.OriginOsaProcessDao_Impl;
import com.huami.bloodoxygen.core.local.database.dao.OsaEventDao;
import com.huami.bloodoxygen.core.local.database.dao.OsaEventDao_Impl;
import com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao;
import com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao_Impl;
import com.huami.bloodoxygen.core.local.database.dao.SyncLogDao;
import com.huami.bloodoxygen.core.local.database.dao.SyncLogDao_Impl;
import com.huami.mifit.sportlib.common.Constants;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class BloodOxygenDatabase_Impl extends BloodOxygenDatabase {
    private volatile ClickMeasureSpo2Dao f;
    private volatile OdiDao g;
    private volatile OsaEventDao h;
    private volatile OsaProcessDao i;
    private volatile SyncLogDao j;
    private volatile OriginOsaProcessDao k;
    private volatile OriginOsaEventDao l;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `click_measured_spo2` (`userId` TEXT NOT NULL, `utcTimestamp` INTEGER NOT NULL, `spo2` INTEGER NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `sn` TEXT NOT NULL, `spo2History` TEXT NOT NULL, `timeZoneId` TEXT NOT NULL, `date` TEXT NOT NULL, `uploaded` INTEGER NOT NULL, PRIMARY KEY(`userId`, `utcTimestamp`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `odi` (`userId` TEXT NOT NULL, `utcTimestamp` INTEGER NOT NULL, `odTimes` INTEGER NOT NULL, `cost` INTEGER NOT NULL, `odi` REAL NOT NULL, `deviceSource` INTEGER NOT NULL, `timeZoneId` TEXT NOT NULL, `valid` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `sn` TEXT NOT NULL, `version` TEXT NOT NULL, `score` INTEGER NOT NULL, `dispCode` INTEGER NOT NULL, `date` TEXT NOT NULL, `uploaded` INTEGER NOT NULL, PRIMARY KEY(`userId`, `utcTimestamp`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `osa_event` (`userId` TEXT NOT NULL, `utcTimestamp` INTEGER NOT NULL, `spo2` TEXT NOT NULL, `hr` TEXT NOT NULL, `spo2Decrease` INTEGER NOT NULL, `timeZoneId` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `sn` TEXT NOT NULL, `version` TEXT NOT NULL, `date` TEXT NOT NULL, `uploaded` INTEGER NOT NULL, `sleepDate` TEXT NOT NULL, `toDelete` INTEGER NOT NULL, PRIMARY KEY(`userId`, `utcTimestamp`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `osa_process` (`userId` TEXT NOT NULL, `utcTimestamp` INTEGER NOT NULL, `spo2` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `timeZoneId` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `sn` TEXT NOT NULL, `spo2High` TEXT NOT NULL, `spo2Low` TEXT NOT NULL, `signalQuality` TEXT NOT NULL, `extended` TEXT NOT NULL, `version` TEXT NOT NULL, `date` TEXT NOT NULL, `uploaded` INTEGER NOT NULL, `sleepDate` TEXT NOT NULL, `toDelete` INTEGER NOT NULL, PRIMARY KEY(`userId`, `utcTimestamp`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `sync_log` (`userId` TEXT NOT NULL, `type` TEXT NOT NULL, `date` TEXT NOT NULL, PRIMARY KEY(`userId`, `type`, `date`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `origin_osa_event` (`userId` TEXT NOT NULL, `utcTimestamp` INTEGER NOT NULL, `spo2` TEXT NOT NULL, `hr` TEXT NOT NULL, `spo2Decrease` INTEGER NOT NULL, `timeZoneId` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `sn` TEXT NOT NULL, `date` TEXT NOT NULL, `uploaded` INTEGER NOT NULL, PRIMARY KEY(`userId`, `utcTimestamp`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `origin_osa_process` (`userId` TEXT NOT NULL, `utcTimestamp` INTEGER NOT NULL, `spo2` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `timeZoneId` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `sn` TEXT NOT NULL, `spo2High` TEXT NOT NULL, `spo2Low` TEXT NOT NULL, `signalQuality` TEXT NOT NULL, `extended` TEXT NOT NULL, `date` TEXT NOT NULL, `uploaded` INTEGER NOT NULL, PRIMARY KEY(`userId`, `utcTimestamp`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7ec4f2cd1713e9ebc49e3f0814583a90')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `click_measured_spo2`");
            _db.execSQL("DROP TABLE IF EXISTS `odi`");
            _db.execSQL("DROP TABLE IF EXISTS `osa_event`");
            _db.execSQL("DROP TABLE IF EXISTS `osa_process`");
            _db.execSQL("DROP TABLE IF EXISTS `sync_log`");
            _db.execSQL("DROP TABLE IF EXISTS `origin_osa_event`");
            _db.execSQL("DROP TABLE IF EXISTS `origin_osa_process`");
            if (BloodOxygenDatabase_Impl.this.mCallbacks != null) {
                int size = BloodOxygenDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) BloodOxygenDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (BloodOxygenDatabase_Impl.this.mCallbacks != null) {
                int size = BloodOxygenDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) BloodOxygenDatabase_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            BloodOxygenDatabase_Impl.this.mDatabase = _db;
            BloodOxygenDatabase_Impl.this.internalInitInvalidationTracker(_db);
            if (BloodOxygenDatabase_Impl.this.mCallbacks != null) {
                int size = BloodOxygenDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) BloodOxygenDatabase_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            HashMap map = new HashMap(10);
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map.put("utcTimestamp", new TableInfo.Column("utcTimestamp", "INTEGER", true, 2, null, 1));
            map.put("spo2", new TableInfo.Column("spo2", "INTEGER", true, 0, null, 1));
            map.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            map.put("spo2History", new TableInfo.Column("spo2History", "TEXT", true, 0, null, 1));
            map.put("timeZoneId", new TableInfo.Column("timeZoneId", "TEXT", true, 0, null, 1));
            map.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
            map.put("uploaded", new TableInfo.Column("uploaded", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("click_measured_spo2", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "click_measured_spo2");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "click_measured_spo2(com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(15);
            map2.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map2.put("utcTimestamp", new TableInfo.Column("utcTimestamp", "INTEGER", true, 2, null, 1));
            map2.put("odTimes", new TableInfo.Column("odTimes", "INTEGER", true, 0, null, 1));
            map2.put(HMFwOnlineAnalyticsKt.COST, new TableInfo.Column(HMFwOnlineAnalyticsKt.COST, "INTEGER", true, 0, null, 1));
            map2.put("odi", new TableInfo.Column("odi", "REAL", true, 0, null, 1));
            map2.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map2.put("timeZoneId", new TableInfo.Column("timeZoneId", "TEXT", true, 0, null, 1));
            map2.put("valid", new TableInfo.Column("valid", "INTEGER", true, 0, null, 1));
            map2.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map2.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            map2.put("version", new TableInfo.Column("version", "TEXT", true, 0, null, 1));
            map2.put("score", new TableInfo.Column("score", "INTEGER", true, 0, null, 1));
            map2.put("dispCode", new TableInfo.Column("dispCode", "INTEGER", true, 0, null, 1));
            map2.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
            map2.put("uploaded", new TableInfo.Column("uploaded", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("odi", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(_db, "odi");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "odi(com.huami.bloodoxygen.core.local.database.entity.Odi).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(14);
            map3.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map3.put("utcTimestamp", new TableInfo.Column("utcTimestamp", "INTEGER", true, 2, null, 1));
            map3.put("spo2", new TableInfo.Column("spo2", "TEXT", true, 0, null, 1));
            map3.put(Constants.DATA_KEY_HR, new TableInfo.Column(Constants.DATA_KEY_HR, "TEXT", true, 0, null, 1));
            map3.put("spo2Decrease", new TableInfo.Column("spo2Decrease", "INTEGER", true, 0, null, 1));
            map3.put("timeZoneId", new TableInfo.Column("timeZoneId", "TEXT", true, 0, null, 1));
            map3.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map3.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map3.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            map3.put("version", new TableInfo.Column("version", "TEXT", true, 0, null, 1));
            map3.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
            map3.put("uploaded", new TableInfo.Column("uploaded", "INTEGER", true, 0, null, 1));
            map3.put("sleepDate", new TableInfo.Column("sleepDate", "TEXT", true, 0, null, 1));
            map3.put("toDelete", new TableInfo.Column("toDelete", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo("osa_event", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(_db, "osa_event");
            if (!tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(false, "osa_event(com.huami.bloodoxygen.core.local.database.entity.OsaEvent).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
            }
            HashMap map4 = new HashMap(17);
            map4.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map4.put("utcTimestamp", new TableInfo.Column("utcTimestamp", "INTEGER", true, 2, null, 1));
            map4.put("spo2", new TableInfo.Column("spo2", "INTEGER", true, 0, null, 1));
            map4.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, 1));
            map4.put("timeZoneId", new TableInfo.Column("timeZoneId", "TEXT", true, 0, null, 1));
            map4.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map4.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map4.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            map4.put("spo2High", new TableInfo.Column("spo2High", "TEXT", true, 0, null, 1));
            map4.put("spo2Low", new TableInfo.Column("spo2Low", "TEXT", true, 0, null, 1));
            map4.put("signalQuality", new TableInfo.Column("signalQuality", "TEXT", true, 0, null, 1));
            map4.put("extended", new TableInfo.Column("extended", "TEXT", true, 0, null, 1));
            map4.put("version", new TableInfo.Column("version", "TEXT", true, 0, null, 1));
            map4.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
            map4.put("uploaded", new TableInfo.Column("uploaded", "INTEGER", true, 0, null, 1));
            map4.put("sleepDate", new TableInfo.Column("sleepDate", "TEXT", true, 0, null, 1));
            map4.put("toDelete", new TableInfo.Column("toDelete", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo7 = new TableInfo("osa_process", map4, new HashSet(0), new HashSet(0));
            TableInfo tableInfo8 = TableInfo.read(_db, "osa_process");
            if (!tableInfo7.equals(tableInfo8)) {
                return new RoomOpenHelper.ValidationResult(false, "osa_process(com.huami.bloodoxygen.core.local.database.entity.OsaProcess).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
            }
            HashMap map5 = new HashMap(3);
            map5.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map5.put("type", new TableInfo.Column("type", "TEXT", true, 2, null, 1));
            map5.put("date", new TableInfo.Column("date", "TEXT", true, 3, null, 1));
            TableInfo tableInfo9 = new TableInfo("sync_log", map5, new HashSet(0), new HashSet(0));
            TableInfo tableInfo10 = TableInfo.read(_db, "sync_log");
            if (!tableInfo9.equals(tableInfo10)) {
                return new RoomOpenHelper.ValidationResult(false, "sync_log(com.huami.bloodoxygen.core.local.database.entity.SyncLog).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
            }
            HashMap map6 = new HashMap(11);
            map6.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map6.put("utcTimestamp", new TableInfo.Column("utcTimestamp", "INTEGER", true, 2, null, 1));
            map6.put("spo2", new TableInfo.Column("spo2", "TEXT", true, 0, null, 1));
            map6.put(Constants.DATA_KEY_HR, new TableInfo.Column(Constants.DATA_KEY_HR, "TEXT", true, 0, null, 1));
            map6.put("spo2Decrease", new TableInfo.Column("spo2Decrease", "INTEGER", true, 0, null, 1));
            map6.put("timeZoneId", new TableInfo.Column("timeZoneId", "TEXT", true, 0, null, 1));
            map6.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map6.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map6.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            map6.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
            map6.put("uploaded", new TableInfo.Column("uploaded", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo11 = new TableInfo("origin_osa_event", map6, new HashSet(0), new HashSet(0));
            TableInfo tableInfo12 = TableInfo.read(_db, "origin_osa_event");
            if (!tableInfo11.equals(tableInfo12)) {
                return new RoomOpenHelper.ValidationResult(false, "origin_osa_event(com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
            }
            HashMap map7 = new HashMap(14);
            map7.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map7.put("utcTimestamp", new TableInfo.Column("utcTimestamp", "INTEGER", true, 2, null, 1));
            map7.put("spo2", new TableInfo.Column("spo2", "INTEGER", true, 0, null, 1));
            map7.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, 1));
            map7.put("timeZoneId", new TableInfo.Column("timeZoneId", "TEXT", true, 0, null, 1));
            map7.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map7.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map7.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            map7.put("spo2High", new TableInfo.Column("spo2High", "TEXT", true, 0, null, 1));
            map7.put("spo2Low", new TableInfo.Column("spo2Low", "TEXT", true, 0, null, 1));
            map7.put("signalQuality", new TableInfo.Column("signalQuality", "TEXT", true, 0, null, 1));
            map7.put("extended", new TableInfo.Column("extended", "TEXT", true, 0, null, 1));
            map7.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
            map7.put("uploaded", new TableInfo.Column("uploaded", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo13 = new TableInfo("origin_osa_process", map7, new HashSet(0), new HashSet(0));
            TableInfo tableInfo14 = TableInfo.read(_db, "origin_osa_process");
            if (tableInfo13.equals(tableInfo14)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "origin_osa_process(com.huami.bloodoxygen.core.local.database.entity.OriginOsaProcess).\n Expected:\n" + tableInfo13 + "\n Found:\n" + tableInfo14);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `click_measured_spo2`");
            writableDatabase.execSQL("DELETE FROM `odi`");
            writableDatabase.execSQL("DELETE FROM `osa_event`");
            writableDatabase.execSQL("DELETE FROM `osa_process`");
            writableDatabase.execSQL("DELETE FROM `sync_log`");
            writableDatabase.execSQL("DELETE FROM `origin_osa_event`");
            writableDatabase.execSQL("DELETE FROM `origin_osa_process`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // com.huami.bloodoxygen.core.local.database.BloodOxygenDatabase
    public ClickMeasureSpo2Dao clickMeasureSpo2Dao() {
        ClickMeasureSpo2Dao clickMeasureSpo2Dao;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            if (this.f == null) {
                this.f = new ClickMeasureSpo2Dao_Impl(this);
            }
            clickMeasureSpo2Dao = this.f;
        }
        return clickMeasureSpo2Dao;
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "click_measured_spo2", "odi", "osa_event", "osa_process", "sync_log", "origin_osa_event", "origin_osa_process");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(4), "7ec4f2cd1713e9ebc49e3f0814583a90", "81ab2b78ecfc09766c973c0d28644289")).build());
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(ClickMeasureSpo2Dao.class, ClickMeasureSpo2Dao_Impl.getRequiredConverters());
        map.put(OdiDao.class, OdiDao_Impl.getRequiredConverters());
        map.put(OsaEventDao.class, OsaEventDao_Impl.getRequiredConverters());
        map.put(OsaProcessDao.class, OsaProcessDao_Impl.getRequiredConverters());
        map.put(SyncLogDao.class, SyncLogDao_Impl.getRequiredConverters());
        map.put(OriginOsaProcessDao.class, OriginOsaProcessDao_Impl.getRequiredConverters());
        map.put(OriginOsaEventDao.class, OriginOsaEventDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.huami.bloodoxygen.core.local.database.BloodOxygenDatabase
    public OdiDao odiDao() {
        OdiDao odiDao;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = new OdiDao_Impl(this);
            }
            odiDao = this.g;
        }
        return odiDao;
    }

    @Override // com.huami.bloodoxygen.core.local.database.BloodOxygenDatabase
    public OriginOsaEventDao originOsaEventDao() {
        OriginOsaEventDao originOsaEventDao;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new OriginOsaEventDao_Impl(this);
            }
            originOsaEventDao = this.l;
        }
        return originOsaEventDao;
    }

    @Override // com.huami.bloodoxygen.core.local.database.BloodOxygenDatabase
    public OriginOsaProcessDao originOsaProcessDao() {
        OriginOsaProcessDao originOsaProcessDao;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new OriginOsaProcessDao_Impl(this);
            }
            originOsaProcessDao = this.k;
        }
        return originOsaProcessDao;
    }

    @Override // com.huami.bloodoxygen.core.local.database.BloodOxygenDatabase
    public OsaEventDao osaEventDao() {
        OsaEventDao osaEventDao;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = new OsaEventDao_Impl(this);
            }
            osaEventDao = this.h;
        }
        return osaEventDao;
    }

    @Override // com.huami.bloodoxygen.core.local.database.BloodOxygenDatabase
    public OsaProcessDao osaProcessDao() {
        OsaProcessDao osaProcessDao;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = new OsaProcessDao_Impl(this);
            }
            osaProcessDao = this.i;
        }
        return osaProcessDao;
    }

    @Override // com.huami.bloodoxygen.core.local.database.BloodOxygenDatabase
    public SyncLogDao syncLogDao() {
        SyncLogDao syncLogDao;
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new SyncLogDao_Impl(this);
            }
            syncLogDao = this.j;
        }
        return syncLogDao;
    }
}
