package com.xiaomi.hm.health.healthdata.core;

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
import com.huami.snore.ui.fragment.SnoreListFragment;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import com.xiaomi.hm.health.healthdata.core.dao.HearingHealthEntityDao;
import com.xiaomi.hm.health.healthdata.core.dao.HearingHealthEntityDao_Impl;
import com.xiaomi.hm.health.healthdata.core.dao.Spo2Dao;
import com.xiaomi.hm.health.healthdata.core.dao.Spo2Dao_Impl;
import com.xiaomi.hm.health.healthdata.core.dao.Spo2DataLogDao;
import com.xiaomi.hm.health.healthdata.core.dao.Spo2DataLogDao_Impl;
import com.xiaomi.hm.health.healthdata.core.dao.SyncLogDao;
import com.xiaomi.hm.health.healthdata.core.dao.SyncLogDao_Impl;
import com.xiaomi.hm.health.healthdata.core.dao.UserHealthDataDao;
import com.xiaomi.hm.health.healthdata.core.dao.UserHealthDataDao_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class HealthDataDb_Impl extends HealthDataDb {
    private volatile UserHealthDataDao d;
    private volatile SyncLogDao e;
    private volatile Spo2Dao f;
    private volatile Spo2DataLogDao g;
    private volatile HearingHealthEntityDao h;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `UserDataEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userId` TEXT NOT NULL, `type` TEXT, `uploadTime` INTEGER, `lastUpdateTime` INTEGER, `eventValue` TEXT, `extValue` TEXT, `dateStr` TEXT)");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `SyncLogEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userId` TEXT, `startTime` INTEGER, `finishTime` INTEGER, `dataSize` INTEGER, `isFinished` INTEGER NOT NULL, `nextTime` INTEGER)");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `PSpo2Entity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userId` TEXT NOT NULL, `timeStamp` INTEGER NOT NULL, `spo2` INTEGER NOT NULL, `upload` INTEGER NOT NULL, `dateStr` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `sn` TEXT NOT NULL)");
            _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_PSpo2Entity_timeStamp_userId` ON `PSpo2Entity` (`timeStamp`, `userId`)");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `OsaProcessEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userId` TEXT NOT NULL, `timeStamp` INTEGER NOT NULL, `spo2` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `upload` INTEGER NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `sn` TEXT NOT NULL)");
            _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_OsaProcessEntity_timeStamp_userId` ON `OsaProcessEntity` (`timeStamp`, `userId`)");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `OsaEventEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userId` TEXT NOT NULL, `timeStamp` INTEGER NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `sn` TEXT NOT NULL, `dateStr` TEXT NOT NULL, `spo2Decrease` INTEGER NOT NULL, `spo2` TEXT NOT NULL, `hr` TEXT NOT NULL, `upload` INTEGER NOT NULL)");
            _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_OsaEventEntity_timeStamp_userId` ON `OsaEventEntity` (`timeStamp`, `userId`)");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `OdiEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userId` TEXT NOT NULL, `cost` INTEGER NOT NULL, `odi` REAL NOT NULL, `odTimes` INTEGER NOT NULL, `upload` INTEGER NOT NULL, `timeStamp` INTEGER NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `sn` TEXT NOT NULL, `valid` INTEGER NOT NULL, `dateStr` TEXT NOT NULL)");
            _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_OdiEntity_timeStamp_userId_dateStr` ON `OdiEntity` (`timeStamp`, `userId`, `dateStr`)");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `Spo2DataSyncLogEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `nextTime` INTEGER)");
            _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_Spo2DataSyncLogEntity_nextTime` ON `Spo2DataSyncLogEntity` (`nextTime`)");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `HearingHealthEntity` (`timestamp` INTEGER NOT NULL, `userId` TEXT NOT NULL, `eventType` TEXT NOT NULL, `data` TEXT NOT NULL, `status` INTEGER NOT NULL, PRIMARY KEY(`timestamp`, `userId`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5cdc901dbd059e1234ad22152459d19d')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `UserDataEntity`");
            _db.execSQL("DROP TABLE IF EXISTS `SyncLogEntity`");
            _db.execSQL("DROP TABLE IF EXISTS `PSpo2Entity`");
            _db.execSQL("DROP TABLE IF EXISTS `OsaProcessEntity`");
            _db.execSQL("DROP TABLE IF EXISTS `OsaEventEntity`");
            _db.execSQL("DROP TABLE IF EXISTS `OdiEntity`");
            _db.execSQL("DROP TABLE IF EXISTS `Spo2DataSyncLogEntity`");
            _db.execSQL("DROP TABLE IF EXISTS `HearingHealthEntity`");
            if (HealthDataDb_Impl.this.mCallbacks != null) {
                int size = HealthDataDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) HealthDataDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (HealthDataDb_Impl.this.mCallbacks != null) {
                int size = HealthDataDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) HealthDataDb_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            HealthDataDb_Impl.this.mDatabase = _db;
            HealthDataDb_Impl.this.internalInitInvalidationTracker(_db);
            if (HealthDataDb_Impl.this.mCallbacks != null) {
                int size = HealthDataDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) HealthDataDb_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            HashMap map = new HashMap(8);
            map.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, 1));
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, 1));
            map.put("uploadTime", new TableInfo.Column("uploadTime", "INTEGER", false, 0, null, 1));
            map.put("lastUpdateTime", new TableInfo.Column("lastUpdateTime", "INTEGER", false, 0, null, 1));
            map.put("eventValue", new TableInfo.Column("eventValue", "TEXT", false, 0, null, 1));
            map.put("extValue", new TableInfo.Column("extValue", "TEXT", false, 0, null, 1));
            map.put("dateStr", new TableInfo.Column("dateStr", "TEXT", false, 0, null, 1));
            TableInfo tableInfo = new TableInfo("UserDataEntity", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "UserDataEntity");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "UserDataEntity(com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(7);
            map2.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, 1));
            map2.put("userId", new TableInfo.Column("userId", "TEXT", false, 0, null, 1));
            map2.put("startTime", new TableInfo.Column("startTime", "INTEGER", false, 0, null, 1));
            map2.put("finishTime", new TableInfo.Column("finishTime", "INTEGER", false, 0, null, 1));
            map2.put("dataSize", new TableInfo.Column("dataSize", "INTEGER", false, 0, null, 1));
            map2.put("isFinished", new TableInfo.Column("isFinished", "INTEGER", true, 0, null, 1));
            map2.put("nextTime", new TableInfo.Column("nextTime", "INTEGER", false, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("SyncLogEntity", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(_db, "SyncLogEntity");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "SyncLogEntity(com.xiaomi.hm.health.healthdata.core.entity.SyncLogEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(9);
            map3.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, 1));
            map3.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map3.put("timeStamp", new TableInfo.Column("timeStamp", "INTEGER", true, 0, null, 1));
            map3.put("spo2", new TableInfo.Column("spo2", "INTEGER", true, 0, null, 1));
            map3.put(SnoreListFragment.TYPE_UPLOAD, new TableInfo.Column(SnoreListFragment.TYPE_UPLOAD, "INTEGER", true, 0, null, 1));
            map3.put("dateStr", new TableInfo.Column("dateStr", "TEXT", true, 0, null, 1));
            map3.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map3.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map3.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_PSpo2Entity_timeStamp_userId", true, Arrays.asList("timeStamp", "userId")));
            TableInfo tableInfo5 = new TableInfo("PSpo2Entity", map3, hashSet, hashSet2);
            TableInfo tableInfo6 = TableInfo.read(_db, "PSpo2Entity");
            if (!tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(false, "PSpo2Entity(com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.PSpo2Entity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
            }
            HashMap map4 = new HashMap(9);
            map4.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, 1));
            map4.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map4.put("timeStamp", new TableInfo.Column("timeStamp", "INTEGER", true, 0, null, 1));
            map4.put("spo2", new TableInfo.Column("spo2", "INTEGER", true, 0, null, 1));
            map4.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, 1));
            map4.put(SnoreListFragment.TYPE_UPLOAD, new TableInfo.Column(SnoreListFragment.TYPE_UPLOAD, "INTEGER", true, 0, null, 1));
            map4.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map4.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map4.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new TableInfo.Index("index_OsaProcessEntity_timeStamp_userId", true, Arrays.asList("timeStamp", "userId")));
            TableInfo tableInfo7 = new TableInfo("OsaProcessEntity", map4, hashSet3, hashSet4);
            TableInfo tableInfo8 = TableInfo.read(_db, "OsaProcessEntity");
            if (!tableInfo7.equals(tableInfo8)) {
                return new RoomOpenHelper.ValidationResult(false, "OsaProcessEntity(com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OsaProcessEntity).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
            }
            HashMap map5 = new HashMap(11);
            map5.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, 1));
            map5.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map5.put("timeStamp", new TableInfo.Column("timeStamp", "INTEGER", true, 0, null, 1));
            map5.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map5.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map5.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            map5.put("dateStr", new TableInfo.Column("dateStr", "TEXT", true, 0, null, 1));
            map5.put("spo2Decrease", new TableInfo.Column("spo2Decrease", "INTEGER", true, 0, null, 1));
            map5.put("spo2", new TableInfo.Column("spo2", "TEXT", true, 0, null, 1));
            map5.put(Constants.DATA_KEY_HR, new TableInfo.Column(Constants.DATA_KEY_HR, "TEXT", true, 0, null, 1));
            map5.put(SnoreListFragment.TYPE_UPLOAD, new TableInfo.Column(SnoreListFragment.TYPE_UPLOAD, "INTEGER", true, 0, null, 1));
            HashSet hashSet5 = new HashSet(0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new TableInfo.Index("index_OsaEventEntity_timeStamp_userId", true, Arrays.asList("timeStamp", "userId")));
            TableInfo tableInfo9 = new TableInfo("OsaEventEntity", map5, hashSet5, hashSet6);
            TableInfo tableInfo10 = TableInfo.read(_db, "OsaEventEntity");
            if (!tableInfo9.equals(tableInfo10)) {
                return new RoomOpenHelper.ValidationResult(false, "OsaEventEntity(com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OsaEventEntity).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
            }
            HashMap map6 = new HashMap(12);
            map6.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, 1));
            map6.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map6.put(HMFwOnlineAnalyticsKt.COST, new TableInfo.Column(HMFwOnlineAnalyticsKt.COST, "INTEGER", true, 0, null, 1));
            map6.put("odi", new TableInfo.Column("odi", "REAL", true, 0, null, 1));
            map6.put("odTimes", new TableInfo.Column("odTimes", "INTEGER", true, 0, null, 1));
            map6.put(SnoreListFragment.TYPE_UPLOAD, new TableInfo.Column(SnoreListFragment.TYPE_UPLOAD, "INTEGER", true, 0, null, 1));
            map6.put("timeStamp", new TableInfo.Column("timeStamp", "INTEGER", true, 0, null, 1));
            map6.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map6.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map6.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            map6.put("valid", new TableInfo.Column("valid", "INTEGER", true, 0, null, 1));
            map6.put("dateStr", new TableInfo.Column("dateStr", "TEXT", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(0);
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new TableInfo.Index("index_OdiEntity_timeStamp_userId_dateStr", true, Arrays.asList("timeStamp", "userId", "dateStr")));
            TableInfo tableInfo11 = new TableInfo("OdiEntity", map6, hashSet7, hashSet8);
            TableInfo tableInfo12 = TableInfo.read(_db, "OdiEntity");
            if (!tableInfo11.equals(tableInfo12)) {
                return new RoomOpenHelper.ValidationResult(false, "OdiEntity(com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OdiEntity).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
            }
            HashMap map7 = new HashMap(2);
            map7.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, 1));
            map7.put("nextTime", new TableInfo.Column("nextTime", "INTEGER", false, 0, null, 1));
            HashSet hashSet9 = new HashSet(0);
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new TableInfo.Index("index_Spo2DataSyncLogEntity_nextTime", true, Arrays.asList("nextTime")));
            TableInfo tableInfo13 = new TableInfo("Spo2DataSyncLogEntity", map7, hashSet9, hashSet10);
            TableInfo tableInfo14 = TableInfo.read(_db, "Spo2DataSyncLogEntity");
            if (!tableInfo13.equals(tableInfo14)) {
                return new RoomOpenHelper.ValidationResult(false, "Spo2DataSyncLogEntity(com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.Spo2DataSyncLogEntity).\n Expected:\n" + tableInfo13 + "\n Found:\n" + tableInfo14);
            }
            HashMap map8 = new HashMap(5);
            map8.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
            map8.put("userId", new TableInfo.Column("userId", "TEXT", true, 2, null, 1));
            map8.put("eventType", new TableInfo.Column("eventType", "TEXT", true, 0, null, 1));
            map8.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, 1));
            map8.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo15 = new TableInfo("HearingHealthEntity", map8, new HashSet(0), new HashSet(0));
            TableInfo tableInfo16 = TableInfo.read(_db, "HearingHealthEntity");
            if (tableInfo15.equals(tableInfo16)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "HearingHealthEntity(com.xiaomi.hm.health.healthdata.core.entity.HearingHealthEntity).\n Expected:\n" + tableInfo15 + "\n Found:\n" + tableInfo16);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `UserDataEntity`");
            writableDatabase.execSQL("DELETE FROM `SyncLogEntity`");
            writableDatabase.execSQL("DELETE FROM `PSpo2Entity`");
            writableDatabase.execSQL("DELETE FROM `OsaProcessEntity`");
            writableDatabase.execSQL("DELETE FROM `OsaEventEntity`");
            writableDatabase.execSQL("DELETE FROM `OdiEntity`");
            writableDatabase.execSQL("DELETE FROM `Spo2DataSyncLogEntity`");
            writableDatabase.execSQL("DELETE FROM `HearingHealthEntity`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "UserDataEntity", "SyncLogEntity", "PSpo2Entity", "OsaProcessEntity", "OsaEventEntity", "OdiEntity", "Spo2DataSyncLogEntity", "HearingHealthEntity");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(16), "5cdc901dbd059e1234ad22152459d19d", "b384f6c129d58995200c3b9d8cb159dc")).build());
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(UserHealthDataDao.class, UserHealthDataDao_Impl.getRequiredConverters());
        map.put(SyncLogDao.class, SyncLogDao_Impl.getRequiredConverters());
        map.put(Spo2Dao.class, Spo2Dao_Impl.getRequiredConverters());
        map.put(Spo2DataLogDao.class, Spo2DataLogDao_Impl.getRequiredConverters());
        map.put(HearingHealthEntityDao.class, HearingHealthEntityDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.xiaomi.hm.health.healthdata.core.HealthDataDb
    public HearingHealthEntityDao hearingHealthDao() {
        HearingHealthEntityDao hearingHealthEntityDao;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = new HearingHealthEntityDao_Impl(this);
            }
            hearingHealthEntityDao = this.h;
        }
        return hearingHealthEntityDao;
    }

    @Override // com.xiaomi.hm.health.healthdata.core.HealthDataDb
    public Spo2Dao spo2Dao() {
        Spo2Dao spo2Dao;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            if (this.f == null) {
                this.f = new Spo2Dao_Impl(this);
            }
            spo2Dao = this.f;
        }
        return spo2Dao;
    }

    @Override // com.xiaomi.hm.health.healthdata.core.HealthDataDb
    public Spo2DataLogDao spo2LogDao() {
        Spo2DataLogDao spo2DataLogDao;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = new Spo2DataLogDao_Impl(this);
            }
            spo2DataLogDao = this.g;
        }
        return spo2DataLogDao;
    }

    @Override // com.xiaomi.hm.health.healthdata.core.HealthDataDb
    public SyncLogDao syncLogDao() {
        SyncLogDao syncLogDao;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new SyncLogDao_Impl(this);
            }
            syncLogDao = this.e;
        }
        return syncLogDao;
    }

    @Override // com.xiaomi.hm.health.healthdata.core.HealthDataDb
    public UserHealthDataDao userHealthDataDao() {
        UserHealthDataDao userHealthDataDao;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = new UserHealthDataDao_Impl(this);
            }
            userHealthDataDao = this.d;
        }
        return userHealthDataDao;
    }
}
