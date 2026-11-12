package com.huami.ecg.core.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.ecg.core.db.dao.EcgCacheTimeDao;
import com.huami.ecg.core.db.dao.EcgCacheTimeDao_Impl;
import com.huami.ecg.core.db.dao.EcgDao;
import com.huami.ecg.core.db.dao.EcgDao_Impl;
import com.huami.ecg.core.db.dao.EcgTagDao;
import com.huami.ecg.core.db.dao.EcgTagDao_Impl;
import com.huami.ecg.core.db.entity.EcgCacheTime;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTag;
import com.xmlywind.sdk.common.mta.PointType;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class EcgDataBase_Impl extends EcgDataBase {
    private volatile EcgDao e;
    private volatile EcgTagDao f;
    private volatile EcgCacheTimeDao g;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `ecg_data` (`generatedTime` INTEGER NOT NULL, `timeZone` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL DEFAULT 4, `type` TEXT NOT NULL DEFAULT 'HEART', `groupId` INTEGER NOT NULL DEFAULT -1, `bioIdMatchType` TEXT NOT NULL DEFAULT 'MATCHED', `bioIdFeedback` TEXT, `diagnosis` TEXT, `measureState` TEXT NOT NULL, `online` INTEGER NOT NULL DEFAULT 0, `isAttention` INTEGER NOT NULL DEFAULT 0, `isContainPPG` INTEGER NOT NULL DEFAULT 0, `posture` TEXT NOT NULL DEFAULT 'INDOOR_STAND', `wearPosition` TEXT NOT NULL DEFAULT 'LEFT_HAND', `ecgSamplingRate` INTEGER NOT NULL DEFAULT 250, `measureSeconds` INTEGER NOT NULL DEFAULT 30, `resultData` TEXT NOT NULL, `rawDataURI` TEXT NOT NULL DEFAULT '', `updateTime` INTEGER NOT NULL DEFAULT -1, `errorCause` INTEGER NOT NULL DEFAULT 0, `diseaseType` TEXT, `generateAppName` TEXT NOT NULL, `ext_none_bioid_self` INTEGER NOT NULL, `ext_fatigue` INTEGER NOT NULL, `ext_bpsys` INTEGER NOT NULL, `ext_bpdias` INTEGER NOT NULL, `thumbnailPath` TEXT NOT NULL, `filter` INTEGER NOT NULL, `localUpdatedTime` INTEGER NOT NULL, `rawLocalPath` TEXT NOT NULL, `rawLocalPathPPG` TEXT NOT NULL, `userId` TEXT NOT NULL DEFAULT '', `deviceId` TEXT NOT NULL DEFAULT '', `sn` TEXT NOT NULL DEFAULT '', `extraStatus` TEXT, PRIMARY KEY(`generatedTime`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `ecg_tag` (`ecg_id` INTEGER NOT NULL, `synced` INTEGER NOT NULL DEFAULT 0, `stringTags` TEXT, `customTag` TEXT DEFAULT '', `voiceTag` TEXT DEFAULT '', `voiceUpdateTime` INTEGER, PRIMARY KEY(`ecg_id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `ecg_sync_time` (`userId` TEXT NOT NULL DEFAULT '', `cacheStartDay` INTEGER NOT NULL, `cacheEndDay` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e80ff405d2ce9193442b80f54cb21aea')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `ecg_data`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `ecg_tag`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `ecg_sync_time`");
            if (EcgDataBase_Impl.this.mCallbacks != null) {
                int size = EcgDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) EcgDataBase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (EcgDataBase_Impl.this.mCallbacks != null) {
                int size = EcgDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) EcgDataBase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            EcgDataBase_Impl.this.mDatabase = supportSQLiteDatabase;
            EcgDataBase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (EcgDataBase_Impl.this.mCallbacks != null) {
                int size = EcgDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) EcgDataBase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
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
            HashMap map = new HashMap(35);
            map.put("generatedTime", new TableInfo.Column("generatedTime", "INTEGER", true, 1, null, 1));
            map.put("timeZone", new TableInfo.Column("timeZone", "TEXT", true, 0, null, 1));
            map.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, "4", 1));
            map.put("type", new TableInfo.Column("type", "TEXT", true, 0, "'HEART'", 1));
            map.put(EcgData.GROUP_ID, new TableInfo.Column(EcgData.GROUP_ID, "INTEGER", true, 0, EcgData.DEFAULT_DIGIT_VALUE, 1));
            map.put(EcgData.BIOID_MATCHED_TYPE, new TableInfo.Column(EcgData.BIOID_MATCHED_TYPE, "TEXT", true, 0, "'MATCHED'", 1));
            map.put(EcgData.BIOID_FEEDBACK, new TableInfo.Column(EcgData.BIOID_FEEDBACK, "TEXT", false, 0, null, 1));
            map.put(EcgData.DIAGNOSIS, new TableInfo.Column(EcgData.DIAGNOSIS, "TEXT", false, 0, null, 1));
            map.put(EcgData.MEASURE_STATE, new TableInfo.Column(EcgData.MEASURE_STATE, "TEXT", true, 0, null, 1));
            map.put("online", new TableInfo.Column("online", "INTEGER", true, 0, "0", 1));
            map.put(EcgData.USER_ATTENTION, new TableInfo.Column(EcgData.USER_ATTENTION, "INTEGER", true, 0, "0", 1));
            map.put(EcgData.IS_CONTAIN_PPG, new TableInfo.Column(EcgData.IS_CONTAIN_PPG, "INTEGER", true, 0, "0", 1));
            map.put(EcgData.MEASURE_POSTURE, new TableInfo.Column(EcgData.MEASURE_POSTURE, "TEXT", true, 0, "'INDOOR_STAND'", 1));
            map.put(EcgData.WEAR_POSITION, new TableInfo.Column(EcgData.WEAR_POSITION, "TEXT", true, 0, "'LEFT_HAND'", 1));
            map.put(EcgData.SAMPLE_RATE, new TableInfo.Column(EcgData.SAMPLE_RATE, "INTEGER", true, 0, "250", 1));
            map.put(EcgData.MEASURE_SECOND, new TableInfo.Column(EcgData.MEASURE_SECOND, "INTEGER", true, 0, PointType.DOWNLOAD_TRACKING, 1));
            map.put(EcgData.RESULT_DATA, new TableInfo.Column(EcgData.RESULT_DATA, "TEXT", true, 0, null, 1));
            map.put(EcgData.SERVER_RAW_FILE_PATH, new TableInfo.Column(EcgData.SERVER_RAW_FILE_PATH, "TEXT", true, 0, "''", 1));
            map.put(EcgData.TIMESTAMP_SERVER_UPDATED, new TableInfo.Column(EcgData.TIMESTAMP_SERVER_UPDATED, "INTEGER", true, 0, EcgData.DEFAULT_DIGIT_VALUE, 1));
            map.put(EcgData.ERROR_CODE, new TableInfo.Column(EcgData.ERROR_CODE, "INTEGER", true, 0, "0", 1));
            map.put(EcgData.DISEASE_TYPE, new TableInfo.Column(EcgData.DISEASE_TYPE, "TEXT", false, 0, null, 1));
            map.put(EcgData.APP_NAME, new TableInfo.Column(EcgData.APP_NAME, "TEXT", true, 0, null, 1));
            map.put(EcgData.LOCAL_NONE_BIOID_SELF, new TableInfo.Column(EcgData.LOCAL_NONE_BIOID_SELF, "INTEGER", true, 0, null, 1));
            map.put(EcgData.LOCAL_EXT_FATIGUE, new TableInfo.Column(EcgData.LOCAL_EXT_FATIGUE, "INTEGER", true, 0, null, 1));
            map.put(EcgData.LOCAL_EXT_BPSYS, new TableInfo.Column(EcgData.LOCAL_EXT_BPSYS, "INTEGER", true, 0, null, 1));
            map.put(EcgData.LOCAL_EXT_BPDIAS, new TableInfo.Column(EcgData.LOCAL_EXT_BPDIAS, "INTEGER", true, 0, null, 1));
            map.put(EcgData.THUMBNAIL_PATH, new TableInfo.Column(EcgData.THUMBNAIL_PATH, "TEXT", true, 0, null, 1));
            map.put("filter", new TableInfo.Column("filter", "INTEGER", true, 0, null, 1));
            map.put(EcgData.TIMESTAMP_LOCAL_UPDATED, new TableInfo.Column(EcgData.TIMESTAMP_LOCAL_UPDATED, "INTEGER", true, 0, null, 1));
            map.put(EcgData.LOCAL_ECG_RAW_FILE_PATH, new TableInfo.Column(EcgData.LOCAL_ECG_RAW_FILE_PATH, "TEXT", true, 0, null, 1));
            map.put(EcgData.LOCAL_PPG_RAW_FILE_PATH, new TableInfo.Column(EcgData.LOCAL_PPG_RAW_FILE_PATH, "TEXT", true, 0, null, 1));
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, "''", 1));
            map.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, "''", 1));
            map.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, "''", 1));
            map.put(EcgData.EXTRA_STATUS, new TableInfo.Column(EcgData.EXTRA_STATUS, "TEXT", false, 0, null, 1));
            TableInfo tableInfo = new TableInfo("ecg_data", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "ecg_data");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "ecg_data(com.huami.ecg.core.db.entity.EcgData).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(6);
            map2.put(EcgTag.ECG_ID, new TableInfo.Column(EcgTag.ECG_ID, "INTEGER", true, 1, null, 1));
            map2.put("synced", new TableInfo.Column("synced", "INTEGER", true, 0, "0", 1));
            map2.put(EcgTag.STRING_TAGS, new TableInfo.Column(EcgTag.STRING_TAGS, "TEXT", false, 0, null, 1));
            map2.put(EcgTag.CUSTOM_TAG, new TableInfo.Column(EcgTag.CUSTOM_TAG, "TEXT", false, 0, "''", 1));
            map2.put(EcgTag.VOICE_TAG, new TableInfo.Column(EcgTag.VOICE_TAG, "TEXT", false, 0, "''", 1));
            map2.put(EcgTag.LOCAL_VOICE_UPDATE_TIME, new TableInfo.Column(EcgTag.LOCAL_VOICE_UPDATE_TIME, "INTEGER", false, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("ecg_tag", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "ecg_tag");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "ecg_tag(com.huami.ecg.core.db.entity.EcgTag).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(3);
            map3.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, "''", 1));
            map3.put(EcgCacheTime.CACHE_START_DAY, new TableInfo.Column(EcgCacheTime.CACHE_START_DAY, "INTEGER", true, 0, null, 1));
            map3.put(EcgCacheTime.CACHE_END_DAY, new TableInfo.Column(EcgCacheTime.CACHE_END_DAY, "INTEGER", true, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo(EcgCacheTime.TABLE_NAME, map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(supportSQLiteDatabase, EcgCacheTime.TABLE_NAME);
            if (tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "ecg_sync_time(com.huami.ecg.core.db.entity.EcgCacheTime).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `ecg_data`");
            writableDatabase.execSQL("DELETE FROM `ecg_tag`");
            writableDatabase.execSQL("DELETE FROM `ecg_sync_time`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "ecg_data", "ecg_tag", EcgCacheTime.TABLE_NAME);
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(4), "e80ff405d2ce9193442b80f54cb21aea", "170268ff94235755dfe7789654c56b4d")).build());
    }

    @Override // com.huami.ecg.core.db.EcgDataBase
    public EcgCacheTimeDao ecgCacheTimeDao() {
        EcgCacheTimeDao ecgCacheTimeDao;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = new EcgCacheTimeDao_Impl(this);
            }
            ecgCacheTimeDao = this.g;
        }
        return ecgCacheTimeDao;
    }

    @Override // com.huami.ecg.core.db.EcgDataBase
    public EcgDao ecgDao() {
        EcgDao ecgDao;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new EcgDao_Impl(this);
            }
            ecgDao = this.e;
        }
        return ecgDao;
    }

    @Override // com.huami.ecg.core.db.EcgDataBase
    public EcgTagDao ecgTagDao() {
        EcgTagDao ecgTagDao;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            if (this.f == null) {
                this.f = new EcgTagDao_Impl(this);
            }
            ecgTagDao = this.f;
        }
        return ecgTagDao;
    }
}
