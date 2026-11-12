package com.huami.treadmill.data.source.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes15.dex */
public final class TreadmillDb_Impl extends TreadmillDb {
    private volatile TdKingDiligentDao _tdKingDiligentDao;
    private volatile TdKingSpeedDao _tdKingSpeedDao;
    private volatile TdPromotionLineDao _tdPromotionLineDao;
    private volatile TdRecordDao _tdRecordDao;
    private volatile TdlineDao _tdlineDao;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `tdpromotionlines`");
            writableDatabase.execSQL("DELETE FROM `tdlines`");
            writableDatabase.execSQL("DELETE FROM `td_record`");
            writableDatabase.execSQL("DELETE FROM `king_rank`");
            writableDatabase.execSQL("DELETE FROM `speed_king_rank`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "tdpromotionlines", "tdlines", "td_record", "king_rank", "speed_king_rank");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(6) { // from class: com.huami.treadmill.data.source.db.TreadmillDb_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `tdpromotionlines` (`index` INTEGER NOT NULL, `runLineIcon` TEXT, `runLineDetailIcon` TEXT, `runLineTitle` TEXT NOT NULL, `runLineIntroduction` TEXT NOT NULL, `runLineArea` TEXT, `runLineRunDetail` TEXT, `runLineDis` REAL NOT NULL, `runLineMan` INTEGER NOT NULL, `runLineId` INTEGER NOT NULL, `runLineTime` INTEGER NOT NULL, PRIMARY KEY(`runLineId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `tdlines` (`index` INTEGER NOT NULL, `runLineIcon` TEXT, `runLineDetailIcon` TEXT, `runLineTitle` TEXT NOT NULL, `runLineIntroduction` TEXT NOT NULL, `runLineArea` TEXT, `runLineDis` REAL NOT NULL, `runLineMan` INTEGER NOT NULL, `runLineId` INTEGER NOT NULL, `runLineTime` INTEGER NOT NULL, PRIMARY KEY(`runLineId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `td_record` (`runDis` REAL NOT NULL, `date` INTEGER NOT NULL, `useTime` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `king_rank` (`index` INTEGER NOT NULL, `userId` TEXT NOT NULL, `nickName` TEXT, `value` INTEGER NOT NULL, `icon` TEXT, `startDay` INTEGER NOT NULL, `continueDays` INTEGER NOT NULL, PRIMARY KEY(`startDay`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `speed_king_rank` (`index` INTEGER NOT NULL, `userId` TEXT NOT NULL, `nickName` TEXT, `value` INTEGER NOT NULL, `icon` TEXT, `startDay` INTEGER NOT NULL, `continueDays` INTEGER NOT NULL, PRIMARY KEY(`startDay`))");
                supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ccb11e6918e0eff6529d56e9cbd22262')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `tdpromotionlines`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `tdlines`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `td_record`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `king_rank`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `speed_king_rank`");
                if (TreadmillDb_Impl.this.mCallbacks != null) {
                    int size = TreadmillDb_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) TreadmillDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (TreadmillDb_Impl.this.mCallbacks != null) {
                    int size = TreadmillDb_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) TreadmillDb_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                TreadmillDb_Impl.this.mDatabase = supportSQLiteDatabase;
                TreadmillDb_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (TreadmillDb_Impl.this.mCallbacks != null) {
                    int size = TreadmillDb_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) TreadmillDb_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap map = new HashMap(11);
                map.put("index", new TableInfo.Column("index", "INTEGER", true, 0, null, 1));
                map.put("runLineIcon", new TableInfo.Column("runLineIcon", "TEXT", false, 0, null, 1));
                map.put("runLineDetailIcon", new TableInfo.Column("runLineDetailIcon", "TEXT", false, 0, null, 1));
                map.put("runLineTitle", new TableInfo.Column("runLineTitle", "TEXT", true, 0, null, 1));
                map.put("runLineIntroduction", new TableInfo.Column("runLineIntroduction", "TEXT", true, 0, null, 1));
                map.put("runLineArea", new TableInfo.Column("runLineArea", "TEXT", false, 0, null, 1));
                map.put("runLineRunDetail", new TableInfo.Column("runLineRunDetail", "TEXT", false, 0, null, 1));
                map.put("runLineDis", new TableInfo.Column("runLineDis", "REAL", true, 0, null, 1));
                map.put("runLineMan", new TableInfo.Column("runLineMan", "INTEGER", true, 0, null, 1));
                map.put("runLineId", new TableInfo.Column("runLineId", "INTEGER", true, 1, null, 1));
                map.put("runLineTime", new TableInfo.Column("runLineTime", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("tdpromotionlines", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "tdpromotionlines");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenHelper.ValidationResult(false, "tdpromotionlines(com.huami.treadmill.data.TdPromotionLine).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                HashMap map2 = new HashMap(10);
                map2.put("index", new TableInfo.Column("index", "INTEGER", true, 0, null, 1));
                map2.put("runLineIcon", new TableInfo.Column("runLineIcon", "TEXT", false, 0, null, 1));
                map2.put("runLineDetailIcon", new TableInfo.Column("runLineDetailIcon", "TEXT", false, 0, null, 1));
                map2.put("runLineTitle", new TableInfo.Column("runLineTitle", "TEXT", true, 0, null, 1));
                map2.put("runLineIntroduction", new TableInfo.Column("runLineIntroduction", "TEXT", true, 0, null, 1));
                map2.put("runLineArea", new TableInfo.Column("runLineArea", "TEXT", false, 0, null, 1));
                map2.put("runLineDis", new TableInfo.Column("runLineDis", "REAL", true, 0, null, 1));
                map2.put("runLineMan", new TableInfo.Column("runLineMan", "INTEGER", true, 0, null, 1));
                map2.put("runLineId", new TableInfo.Column("runLineId", "INTEGER", true, 1, null, 1));
                map2.put("runLineTime", new TableInfo.Column("runLineTime", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("tdlines", map2, new HashSet(0), new HashSet(0));
                TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "tdlines");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenHelper.ValidationResult(false, "tdlines(com.huami.treadmill.data.TdLine).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                HashMap map3 = new HashMap(4);
                map3.put("runDis", new TableInfo.Column("runDis", "REAL", true, 0, null, 1));
                map3.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, 1));
                map3.put("useTime", new TableInfo.Column("useTime", "INTEGER", true, 0, null, 1));
                map3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                TableInfo tableInfo5 = new TableInfo("td_record", map3, new HashSet(0), new HashSet(0));
                TableInfo tableInfo6 = TableInfo.read(supportSQLiteDatabase, "td_record");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenHelper.ValidationResult(false, "td_record(com.huami.treadmill.data.TdRecord).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                HashMap map4 = new HashMap(7);
                map4.put("index", new TableInfo.Column("index", "INTEGER", true, 0, null, 1));
                map4.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
                map4.put("nickName", new TableInfo.Column("nickName", "TEXT", false, 0, null, 1));
                map4.put("value", new TableInfo.Column("value", "INTEGER", true, 0, null, 1));
                map4.put("icon", new TableInfo.Column("icon", "TEXT", false, 0, null, 1));
                map4.put("startDay", new TableInfo.Column("startDay", "INTEGER", true, 1, null, 1));
                map4.put("continueDays", new TableInfo.Column("continueDays", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo7 = new TableInfo("king_rank", map4, new HashSet(0), new HashSet(0));
                TableInfo tableInfo8 = TableInfo.read(supportSQLiteDatabase, "king_rank");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenHelper.ValidationResult(false, "king_rank(com.huami.treadmill.data.TdkingBean).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
                }
                HashMap map5 = new HashMap(7);
                map5.put("index", new TableInfo.Column("index", "INTEGER", true, 0, null, 1));
                map5.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
                map5.put("nickName", new TableInfo.Column("nickName", "TEXT", false, 0, null, 1));
                map5.put("value", new TableInfo.Column("value", "INTEGER", true, 0, null, 1));
                map5.put("icon", new TableInfo.Column("icon", "TEXT", false, 0, null, 1));
                map5.put("startDay", new TableInfo.Column("startDay", "INTEGER", true, 1, null, 1));
                map5.put("continueDays", new TableInfo.Column("continueDays", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo9 = new TableInfo("speed_king_rank", map5, new HashSet(0), new HashSet(0));
                TableInfo tableInfo10 = TableInfo.read(supportSQLiteDatabase, "speed_king_rank");
                if (tableInfo9.equals(tableInfo10)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "speed_king_rank(com.huami.treadmill.data.TdSpeedKingBean).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
            }
        }, "ccb11e6918e0eff6529d56e9cbd22262", "a44df4e8008218aaded5ac5a6a02e141")).build());
    }

    @Override // com.huami.treadmill.data.source.db.TreadmillDb
    public TdKingDiligentDao kingsDiligent() {
        TdKingDiligentDao tdKingDiligentDao;
        if (this._tdKingDiligentDao != null) {
            return this._tdKingDiligentDao;
        }
        synchronized (this) {
            if (this._tdKingDiligentDao == null) {
                this._tdKingDiligentDao = new TdKingDiligentDao_Impl(this);
            }
            tdKingDiligentDao = this._tdKingDiligentDao;
        }
        return tdKingDiligentDao;
    }

    @Override // com.huami.treadmill.data.source.db.TreadmillDb
    public TdKingSpeedDao kingsSpeed() {
        TdKingSpeedDao tdKingSpeedDao;
        if (this._tdKingSpeedDao != null) {
            return this._tdKingSpeedDao;
        }
        synchronized (this) {
            if (this._tdKingSpeedDao == null) {
                this._tdKingSpeedDao = new TdKingSpeedDao_Impl(this);
            }
            tdKingSpeedDao = this._tdKingSpeedDao;
        }
        return tdKingSpeedDao;
    }

    @Override // com.huami.treadmill.data.source.db.TreadmillDb
    public TdlineDao lines() {
        TdlineDao tdlineDao;
        if (this._tdlineDao != null) {
            return this._tdlineDao;
        }
        synchronized (this) {
            if (this._tdlineDao == null) {
                this._tdlineDao = new TdlineDao_Impl(this);
            }
            tdlineDao = this._tdlineDao;
        }
        return tdlineDao;
    }

    @Override // com.huami.treadmill.data.source.db.TreadmillDb
    public TdPromotionLineDao promotionLines() {
        TdPromotionLineDao tdPromotionLineDao;
        if (this._tdPromotionLineDao != null) {
            return this._tdPromotionLineDao;
        }
        synchronized (this) {
            if (this._tdPromotionLineDao == null) {
                this._tdPromotionLineDao = new TdPromotionLineDao_Impl(this);
            }
            tdPromotionLineDao = this._tdPromotionLineDao;
        }
        return tdPromotionLineDao;
    }

    @Override // com.huami.treadmill.data.source.db.TreadmillDb
    public TdRecordDao records() {
        TdRecordDao tdRecordDao;
        if (this._tdRecordDao != null) {
            return this._tdRecordDao;
        }
        synchronized (this) {
            if (this._tdRecordDao == null) {
                this._tdRecordDao = new TdRecordDao_Impl(this);
            }
            tdRecordDao = this._tdRecordDao;
        }
        return tdRecordDao;
    }
}
