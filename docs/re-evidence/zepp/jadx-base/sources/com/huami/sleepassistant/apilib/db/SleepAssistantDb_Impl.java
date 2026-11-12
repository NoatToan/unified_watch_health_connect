package com.huami.sleepassistant.apilib.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao;
import com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao_Impl;
import com.huami.sleepassistant.apilib.utils.WebConst;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class SleepAssistantDb_Impl extends SleepAssistantDb {
    private volatile SleepAssistantDao b;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Music` (`id` TEXT NOT NULL, `whetherPay` INTEGER NOT NULL, `goodsId` TEXT, `scIntroduction` TEXT, `supportDevices` TEXT, `deliveryApps` TEXT, `deliveryTime` TEXT, `expiredTime` TEXT, `languages` TEXT, `simpleChinese` TEXT, `bigImgUrl` TEXT, `smallImgUrl` TEXT, `audioUrl` TEXT, `sort` INTEGER NOT NULL, `ispresence` INTEGER NOT NULL, `playAddress` TEXT, `isPlay` INTEGER NOT NULL, `progress` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `LiveMusic` (`sid` TEXT NOT NULL, `userId` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `playTime` INTEGER NOT NULL, `itemImgUrl` TEXT NOT NULL, `isDown` INTEGER NOT NULL, `progress` INTEGER NOT NULL, PRIMARY KEY(`sid`))");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5a130cc0e6031ba1866a814116233867')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Music`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `LiveMusic`");
            if (SleepAssistantDb_Impl.this.mCallbacks != null) {
                int size = SleepAssistantDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) SleepAssistantDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (SleepAssistantDb_Impl.this.mCallbacks != null) {
                int size = SleepAssistantDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) SleepAssistantDb_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            SleepAssistantDb_Impl.this.mDatabase = supportSQLiteDatabase;
            SleepAssistantDb_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (SleepAssistantDb_Impl.this.mCallbacks != null) {
                int size = SleepAssistantDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) SleepAssistantDb_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
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
            HashMap map = new HashMap(18);
            map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
            map.put("whetherPay", new TableInfo.Column("whetherPay", "INTEGER", true, 0, null, 1));
            map.put("goodsId", new TableInfo.Column("goodsId", "TEXT", false, 0, null, 1));
            map.put("scIntroduction", new TableInfo.Column("scIntroduction", "TEXT", false, 0, null, 1));
            map.put("supportDevices", new TableInfo.Column("supportDevices", "TEXT", false, 0, null, 1));
            map.put("deliveryApps", new TableInfo.Column("deliveryApps", "TEXT", false, 0, null, 1));
            map.put("deliveryTime", new TableInfo.Column("deliveryTime", "TEXT", false, 0, null, 1));
            map.put("expiredTime", new TableInfo.Column("expiredTime", "TEXT", false, 0, null, 1));
            map.put("languages", new TableInfo.Column("languages", "TEXT", false, 0, null, 1));
            map.put("simpleChinese", new TableInfo.Column("simpleChinese", "TEXT", false, 0, null, 1));
            map.put("bigImgUrl", new TableInfo.Column("bigImgUrl", "TEXT", false, 0, null, 1));
            map.put("smallImgUrl", new TableInfo.Column("smallImgUrl", "TEXT", false, 0, null, 1));
            map.put("audioUrl", new TableInfo.Column("audioUrl", "TEXT", false, 0, null, 1));
            map.put("sort", new TableInfo.Column("sort", "INTEGER", true, 0, null, 1));
            map.put("ispresence", new TableInfo.Column("ispresence", "INTEGER", true, 0, null, 1));
            map.put("playAddress", new TableInfo.Column("playAddress", "TEXT", false, 0, null, 1));
            map.put("isPlay", new TableInfo.Column("isPlay", "INTEGER", true, 0, null, 1));
            map.put("progress", new TableInfo.Column("progress", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("Music", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "Music");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "Music(com.huami.sleepassistant.apilib.db.po.Music).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(8);
            map2.put("sid", new TableInfo.Column("sid", "TEXT", true, 1, null, 1));
            map2.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map2.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            map2.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
            map2.put(WebConst.QueryParam.PLAY_TIME, new TableInfo.Column(WebConst.QueryParam.PLAY_TIME, "INTEGER", true, 0, null, 1));
            map2.put("itemImgUrl", new TableInfo.Column("itemImgUrl", "TEXT", true, 0, null, 1));
            map2.put("isDown", new TableInfo.Column("isDown", "INTEGER", true, 0, null, 1));
            map2.put("progress", new TableInfo.Column("progress", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("LiveMusic", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "LiveMusic");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "LiveMusic(com.huami.sleepassistant.apilib.db.po.LiveMusic).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `Music`");
            writableDatabase.execSQL("DELETE FROM `LiveMusic`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "Music", "LiveMusic");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(2), "5a130cc0e6031ba1866a814116233867", "c3d11ad224e6c479dd223574b7650beb")).build());
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(SleepAssistantDao.class, SleepAssistantDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.huami.sleepassistant.apilib.db.SleepAssistantDb
    public SleepAssistantDao sleepAssistantDao() {
        SleepAssistantDao sleepAssistantDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new SleepAssistantDao_Impl(this);
            }
            sleepAssistantDao = this.b;
        }
        return sleepAssistantDao;
    }
}
