package com.huami.pai.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.pai.db.dao.FitnessAgeDao;
import com.huami.pai.db.dao.FitnessAgeDao_Impl;
import com.huami.pai.db.dao.PaiDao;
import com.huami.pai.db.dao.PaiDao_Impl;
import com.huami.pai.db.userpai.PaiUserDao;
import com.huami.pai.db.userpai.PaiUserDao_Impl;
import com.huami.pai.koin.PaiScopeNames;
import com.xiaomi.hm.health.Constant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class PaiDb_Impl extends PaiDb {
    private volatile PaiDao a;
    private volatile FitnessAgeDao b;
    private volatile PaiUserDao c;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `Pai` (`date` TEXT NOT NULL, `lp` INTEGER NOT NULL, `mp` INTEGER NOT NULL, `hp` INTEGER NOT NULL, `lm` INTEGER NOT NULL, `mm` INTEGER NOT NULL, `hm` INTEGER NOT NULL, `dp` INTEGER NOT NULL, `tp` INTEGER NOT NULL, `as` TEXT, `nas` TEXT, `maxHr` INTEGER NOT NULL, `rhr` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `hrLowLimit` INTEGER NOT NULL, `hrMediumLimit` INTEGER NOT NULL, `hrHighLimit` INTEGER NOT NULL, PRIMARY KEY(`date`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `FitnessAge` (`date` TEXT NOT NULL, `age` REAL NOT NULL, `vo2max` REAL NOT NULL, `source` TEXT NOT NULL, PRIMARY KEY(`date`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `PAIDataVo` (`date` TEXT NOT NULL, `activityScore` TEXT NOT NULL, `nextActivityScore` TEXT NOT NULL, `lp` REAL NOT NULL, `mp` REAL NOT NULL, `hp` REAL NOT NULL, `lm` INTEGER NOT NULL, `mm` INTEGER NOT NULL, `hm` INTEGER NOT NULL, `dp` REAL NOT NULL, `tp` REAL NOT NULL, `age` INTEGER NOT NULL, `gd` INTEGER NOT NULL, `lhr` INTEGER NOT NULL, `mhr` INTEGER NOT NULL, `hhr` INTEGER NOT NULL, `restHr` INTEGER NOT NULL, `maxHr` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `time` INTEGER NOT NULL, `timeZone` INTEGER NOT NULL, `index` INTEGER NOT NULL, `version` INTEGER NOT NULL, `uploadTimestamp` INTEGER NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `sn` TEXT NOT NULL, `userId` TEXT NOT NULL, `eventType` TEXT NOT NULL, `subType` TEXT NOT NULL, `isUpload` INTEGER NOT NULL, PRIMARY KEY(`userId`, `timestamp`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a13741e6e97670da0d369672358deae4')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `Pai`");
            _db.execSQL("DROP TABLE IF EXISTS `FitnessAge`");
            _db.execSQL("DROP TABLE IF EXISTS `PAIDataVo`");
            if (PaiDb_Impl.this.mCallbacks != null) {
                int size = PaiDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) PaiDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (PaiDb_Impl.this.mCallbacks != null) {
                int size = PaiDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) PaiDb_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            PaiDb_Impl.this.mDatabase = _db;
            PaiDb_Impl.this.internalInitInvalidationTracker(_db);
            if (PaiDb_Impl.this.mCallbacks != null) {
                int size = PaiDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) PaiDb_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            HashMap map = new HashMap(17);
            map.put("date", new TableInfo.Column("date", "TEXT", true, 1, null, 1));
            map.put(Constant.PAI_KEY_LOW_ZONE_PAI, new TableInfo.Column(Constant.PAI_KEY_LOW_ZONE_PAI, "INTEGER", true, 0, null, 1));
            map.put(Constant.PAI_KEY_MEDIUM_ZONE_PAI, new TableInfo.Column(Constant.PAI_KEY_MEDIUM_ZONE_PAI, "INTEGER", true, 0, null, 1));
            map.put(Constant.PAI_KEY_HIGH_ZONE_PAI, new TableInfo.Column(Constant.PAI_KEY_HIGH_ZONE_PAI, "INTEGER", true, 0, null, 1));
            map.put(Constant.PAI_KEY_LOW_ZONE_MINUTES, new TableInfo.Column(Constant.PAI_KEY_LOW_ZONE_MINUTES, "INTEGER", true, 0, null, 1));
            map.put(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES, new TableInfo.Column(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES, "INTEGER", true, 0, null, 1));
            map.put(Constant.PAI_KEY_HIGH_ZONE_MINUTES, new TableInfo.Column(Constant.PAI_KEY_HIGH_ZONE_MINUTES, "INTEGER", true, 0, null, 1));
            map.put(Constant.PAI_KEY_DAILY_PAI, new TableInfo.Column(Constant.PAI_KEY_DAILY_PAI, "INTEGER", true, 0, null, 1));
            map.put("tp", new TableInfo.Column("tp", "INTEGER", true, 0, null, 1));
            map.put(Constant.PAI_KEY_ACTIVITY_SCORES, new TableInfo.Column(Constant.PAI_KEY_ACTIVITY_SCORES, "TEXT", false, 0, null, 1));
            map.put("nas", new TableInfo.Column("nas", "TEXT", false, 0, null, 1));
            map.put(Constant.PAI_KEY_MAX_HR, new TableInfo.Column(Constant.PAI_KEY_MAX_HR, "INTEGER", true, 0, null, 1));
            map.put("rhr", new TableInfo.Column("rhr", "INTEGER", true, 0, null, 1));
            map.put("gender", new TableInfo.Column("gender", "INTEGER", true, 0, null, 1));
            map.put("hrLowLimit", new TableInfo.Column("hrLowLimit", "INTEGER", true, 0, null, 1));
            map.put("hrMediumLimit", new TableInfo.Column("hrMediumLimit", "INTEGER", true, 0, null, 1));
            map.put("hrHighLimit", new TableInfo.Column("hrHighLimit", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo(PaiScopeNames.PAI, map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, PaiScopeNames.PAI);
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "Pai(com.huami.pai.db.po.Pai).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(4);
            map2.put("date", new TableInfo.Column("date", "TEXT", true, 1, null, 1));
            map2.put("age", new TableInfo.Column("age", "REAL", true, 0, null, 1));
            map2.put("vo2max", new TableInfo.Column("vo2max", "REAL", true, 0, null, 1));
            map2.put("source", new TableInfo.Column("source", "TEXT", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("FitnessAge", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(_db, "FitnessAge");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "FitnessAge(com.huami.pai.db.po.FitnessAge).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(31);
            map3.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
            map3.put("activityScore", new TableInfo.Column("activityScore", "TEXT", true, 0, null, 1));
            map3.put("nextActivityScore", new TableInfo.Column("nextActivityScore", "TEXT", true, 0, null, 1));
            map3.put(Constant.PAI_KEY_LOW_ZONE_PAI, new TableInfo.Column(Constant.PAI_KEY_LOW_ZONE_PAI, "REAL", true, 0, null, 1));
            map3.put(Constant.PAI_KEY_MEDIUM_ZONE_PAI, new TableInfo.Column(Constant.PAI_KEY_MEDIUM_ZONE_PAI, "REAL", true, 0, null, 1));
            map3.put(Constant.PAI_KEY_HIGH_ZONE_PAI, new TableInfo.Column(Constant.PAI_KEY_HIGH_ZONE_PAI, "REAL", true, 0, null, 1));
            map3.put(Constant.PAI_KEY_LOW_ZONE_MINUTES, new TableInfo.Column(Constant.PAI_KEY_LOW_ZONE_MINUTES, "INTEGER", true, 0, null, 1));
            map3.put(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES, new TableInfo.Column(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES, "INTEGER", true, 0, null, 1));
            map3.put(Constant.PAI_KEY_HIGH_ZONE_MINUTES, new TableInfo.Column(Constant.PAI_KEY_HIGH_ZONE_MINUTES, "INTEGER", true, 0, null, 1));
            map3.put(Constant.PAI_KEY_DAILY_PAI, new TableInfo.Column(Constant.PAI_KEY_DAILY_PAI, "REAL", true, 0, null, 1));
            map3.put("tp", new TableInfo.Column("tp", "REAL", true, 0, null, 1));
            map3.put("age", new TableInfo.Column("age", "INTEGER", true, 0, null, 1));
            map3.put(Constant.PAI_KEY_GENDER, new TableInfo.Column(Constant.PAI_KEY_GENDER, "INTEGER", true, 0, null, 1));
            map3.put(Constant.PAI_KEY_LHR, new TableInfo.Column(Constant.PAI_KEY_LHR, "INTEGER", true, 0, null, 1));
            map3.put(Constant.PAI_KEY_MHR, new TableInfo.Column(Constant.PAI_KEY_MHR, "INTEGER", true, 0, null, 1));
            map3.put(Constant.PAI_KEY_HHR, new TableInfo.Column(Constant.PAI_KEY_HHR, "INTEGER", true, 0, null, 1));
            map3.put(Constant.PAI_KEY_RHR, new TableInfo.Column(Constant.PAI_KEY_RHR, "INTEGER", true, 0, null, 1));
            map3.put(Constant.PAI_KEY_MAX_HR, new TableInfo.Column(Constant.PAI_KEY_MAX_HR, "INTEGER", true, 0, null, 1));
            map3.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 2, null, 1));
            map3.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, 1));
            map3.put("timeZone", new TableInfo.Column("timeZone", "INTEGER", true, 0, null, 1));
            map3.put("index", new TableInfo.Column("index", "INTEGER", true, 0, null, 1));
            map3.put("version", new TableInfo.Column("version", "INTEGER", true, 0, null, 1));
            map3.put("uploadTimestamp", new TableInfo.Column("uploadTimestamp", "INTEGER", true, 0, null, 1));
            map3.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map3.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map3.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            map3.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map3.put("eventType", new TableInfo.Column("eventType", "TEXT", true, 0, null, 1));
            map3.put("subType", new TableInfo.Column("subType", "TEXT", true, 0, null, 1));
            map3.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo("PAIDataVo", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(_db, "PAIDataVo");
            if (tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "PAIDataVo(com.huami.pai.vo.PAIDataVo).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `Pai`");
            writableDatabase.execSQL("DELETE FROM `FitnessAge`");
            writableDatabase.execSQL("DELETE FROM `PAIDataVo`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), PaiScopeNames.PAI, "FitnessAge", "PAIDataVo");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(9), "a13741e6e97670da0d369672358deae4", "9dea7802405eecff40a3a2e17f51c35c")).build());
    }

    @Override // com.huami.pai.db.PaiDb
    public FitnessAgeDao fitnessAgeDao() {
        FitnessAgeDao fitnessAgeDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new FitnessAgeDao_Impl(this);
            }
            fitnessAgeDao = this.b;
        }
        return fitnessAgeDao;
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(PaiDao.class, PaiDao_Impl.getRequiredConverters());
        map.put(FitnessAgeDao.class, FitnessAgeDao_Impl.getRequiredConverters());
        map.put(PaiUserDao.class, PaiUserDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.huami.pai.db.PaiDb
    public PaiDao paiDao() {
        PaiDao paiDao;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new PaiDao_Impl(this);
            }
            paiDao = this.a;
        }
        return paiDao;
    }

    @Override // com.huami.pai.db.PaiDb
    public PaiUserDao paiUserDB() {
        PaiUserDao paiUserDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new PaiUserDao_Impl(this);
            }
            paiUserDao = this.c;
        }
        return paiUserDao;
    }
}
