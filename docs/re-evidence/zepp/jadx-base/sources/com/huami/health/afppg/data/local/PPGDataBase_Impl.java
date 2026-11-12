package com.huami.health.afppg.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.health.afppg.data.local.bean.HREventData;
import com.huami.health.afppg.data.local.bean.RRPeak;
import com.huami.health.afppg.data.local.dao.AFibDao;
import com.huami.health.afppg.data.local.dao.AFibDao_Impl;
import com.huami.health.afppg.data.local.dao.HREventDao;
import com.huami.health.afppg.data.local.dao.HREventDao_Impl;
import com.huami.health.afppg.data.local.dao.RRPeakDao;
import com.huami.health.afppg.data.local.dao.RRPeakDao_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public final class PPGDataBase_Impl extends PPGDataBase {
    private volatile RRPeakDao d;
    private volatile AFibDao e;
    private volatile HREventDao f;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `rrpeak` (`deviceSource` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `sn` TEXT NOT NULL, `fwVer` TEXT NOT NULL, `userId` TEXT NOT NULL, `dataType` INTEGER NOT NULL, `length` INTEGER NOT NULL, `generatedTime` INTEGER NOT NULL, `lastRrPackageTime` INTEGER NOT NULL, `rrRecordSize` INTEGER NOT NULL, `rawLocalPath` TEXT NOT NULL, `rawDataURI` TEXT NOT NULL, `synced` INTEGER NOT NULL, `afData` TEXT NOT NULL, `afResult` INTEGER NOT NULL, `timeZone` TEXT NOT NULL, `date` TEXT NOT NULL, PRIMARY KEY(`generatedTime`, `userId`, `date`, `dataType`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `afib` (`type` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `deviceSource` INTEGER NOT NULL, `value` INTEGER NOT NULL, `groupTime` INTEGER NOT NULL, `synced` INTEGER NOT NULL, `userId` TEXT NOT NULL, `sn` TEXT NOT NULL, `deviceId` TEXT NOT NULL, `appName` TEXT NOT NULL, `fwVer` TEXT NOT NULL, `timeZone` TEXT NOT NULL, `date` TEXT NOT NULL, PRIMARY KEY(`userId`, `timestamp`, `date`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `hr_events` (`userID` TEXT NOT NULL, `eventType` TEXT NOT NULL, `subType` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `timeZone` TEXT NOT NULL, `duration` INTEGER NOT NULL, `highHR` INTEGER NOT NULL, `lowHR` INTEGER NOT NULL, `deviceSource` INTEGER NOT NULL, `diagnosis` TEXT NOT NULL, `deviceID` TEXT NOT NULL, `sn` TEXT NOT NULL, `fwVer` TEXT NOT NULL, `synced` INTEGER NOT NULL, `date` TEXT NOT NULL, PRIMARY KEY(`userID`, `timestamp`, `date`))");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '941d03de2b1b3233f532abdd3554f4bc')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `rrpeak`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `afib`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `hr_events`");
            if (PPGDataBase_Impl.this.mCallbacks != null) {
                int size = PPGDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) PPGDataBase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (PPGDataBase_Impl.this.mCallbacks != null) {
                int size = PPGDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) PPGDataBase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            PPGDataBase_Impl.this.mDatabase = supportSQLiteDatabase;
            PPGDataBase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (PPGDataBase_Impl.this.mCallbacks != null) {
                int size = PPGDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) PPGDataBase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
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
            HashMap map = new HashMap(17);
            map.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            map.put("fwVer", new TableInfo.Column("fwVer", "TEXT", true, 0, null, 1));
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 2, null, 1));
            map.put("dataType", new TableInfo.Column("dataType", "INTEGER", true, 4, null, 1));
            map.put(SessionDescription.p, new TableInfo.Column(SessionDescription.p, "INTEGER", true, 0, null, 1));
            map.put("generatedTime", new TableInfo.Column("generatedTime", "INTEGER", true, 1, null, 1));
            map.put("lastRrPackageTime", new TableInfo.Column("lastRrPackageTime", "INTEGER", true, 0, null, 1));
            map.put("rrRecordSize", new TableInfo.Column("rrRecordSize", "INTEGER", true, 0, null, 1));
            map.put(EcgData.LOCAL_ECG_RAW_FILE_PATH, new TableInfo.Column(EcgData.LOCAL_ECG_RAW_FILE_PATH, "TEXT", true, 0, null, 1));
            map.put(EcgData.SERVER_RAW_FILE_PATH, new TableInfo.Column(EcgData.SERVER_RAW_FILE_PATH, "TEXT", true, 0, null, 1));
            map.put("synced", new TableInfo.Column("synced", "INTEGER", true, 0, null, 1));
            map.put("afData", new TableInfo.Column("afData", "TEXT", true, 0, null, 1));
            map.put("afResult", new TableInfo.Column("afResult", "INTEGER", true, 0, null, 1));
            map.put("timeZone", new TableInfo.Column("timeZone", "TEXT", true, 0, null, 1));
            map.put("date", new TableInfo.Column("date", "TEXT", true, 3, null, 1));
            TableInfo tableInfo = new TableInfo(RRPeak.TABLE_NAME, map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, RRPeak.TABLE_NAME);
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "rrpeak(com.huami.health.afppg.data.local.bean.RRPeak).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(13);
            map2.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
            map2.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 2, null, 1));
            map2.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map2.put("value", new TableInfo.Column("value", "INTEGER", true, 0, null, 1));
            map2.put("groupTime", new TableInfo.Column("groupTime", "INTEGER", true, 0, null, 1));
            map2.put("synced", new TableInfo.Column("synced", "INTEGER", true, 0, null, 1));
            map2.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map2.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            map2.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map2.put("appName", new TableInfo.Column("appName", "TEXT", true, 0, null, 1));
            map2.put("fwVer", new TableInfo.Column("fwVer", "TEXT", true, 0, null, 1));
            map2.put("timeZone", new TableInfo.Column("timeZone", "TEXT", true, 0, null, 1));
            map2.put("date", new TableInfo.Column("date", "TEXT", true, 3, null, 1));
            TableInfo tableInfo3 = new TableInfo("afib", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "afib");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "afib(com.huami.health.afppg.data.local.bean.AFibData).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(15);
            map3.put(SDKConstants.PARAM_USER_ID, new TableInfo.Column(SDKConstants.PARAM_USER_ID, "TEXT", true, 1, null, 1));
            map3.put("eventType", new TableInfo.Column("eventType", "TEXT", true, 0, null, 1));
            map3.put("subType", new TableInfo.Column("subType", "TEXT", true, 0, null, 1));
            map3.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 2, null, 1));
            map3.put("timeZone", new TableInfo.Column("timeZone", "TEXT", true, 0, null, 1));
            map3.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, 1));
            map3.put("highHR", new TableInfo.Column("highHR", "INTEGER", true, 0, null, 1));
            map3.put("lowHR", new TableInfo.Column("lowHR", "INTEGER", true, 0, null, 1));
            map3.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map3.put(EcgData.DIAGNOSIS, new TableInfo.Column(EcgData.DIAGNOSIS, "TEXT", true, 0, null, 1));
            map3.put("deviceID", new TableInfo.Column("deviceID", "TEXT", true, 0, null, 1));
            map3.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, null, 1));
            map3.put("fwVer", new TableInfo.Column("fwVer", "TEXT", true, 0, null, 1));
            map3.put("synced", new TableInfo.Column("synced", "INTEGER", true, 0, null, 1));
            map3.put("date", new TableInfo.Column("date", "TEXT", true, 3, null, 1));
            TableInfo tableInfo5 = new TableInfo(HREventData.TABLE_NAME, map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(supportSQLiteDatabase, HREventData.TABLE_NAME);
            if (tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "hr_events(com.huami.health.afppg.data.local.bean.HREventData).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
        }
    }

    @Override // com.huami.health.afppg.data.local.PPGDataBase
    public AFibDao afibDAO() {
        AFibDao aFibDao;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new AFibDao_Impl(this);
            }
            aFibDao = this.e;
        }
        return aFibDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `rrpeak`");
            writableDatabase.execSQL("DELETE FROM `afib`");
            writableDatabase.execSQL("DELETE FROM `hr_events`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), RRPeak.TABLE_NAME, "afib", HREventData.TABLE_NAME);
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(1), "941d03de2b1b3233f532abdd3554f4bc", "b534b78a4ef0113d2d2150a2c6f5b888")).build());
    }

    @Override // com.huami.health.afppg.data.local.PPGDataBase
    public HREventDao hrEventDAO() {
        HREventDao hREventDao;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            if (this.f == null) {
                this.f = new HREventDao_Impl(this);
            }
            hREventDao = this.f;
        }
        return hREventDao;
    }

    @Override // com.huami.health.afppg.data.local.PPGDataBase
    public RRPeakDao rrPeakDAO() {
        RRPeakDao rRPeakDao;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = new RRPeakDao_Impl(this);
            }
            rRPeakDao = this.d;
        }
        return rRPeakDao;
    }
}
