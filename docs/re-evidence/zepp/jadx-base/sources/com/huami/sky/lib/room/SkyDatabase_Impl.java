package com.huami.sky.lib.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.sky.lib.constant.WebConstant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class SkyDatabase_Impl extends SkyDatabase {
    private volatile RelaxScoreDao b;
    private volatile MusicTagDao c;
    private volatile MusicInfoDao d;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `relaxScore` (`userId` TEXT NOT NULL, `value` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`userId`, `createdAt`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `musicTag` (`userId` TEXT NOT NULL, `sleepStartTime` INTEGER NOT NULL, `musicTags` TEXT NOT NULL, `scores` TEXT NOT NULL, `daysOfContinuous` TEXT, PRIMARY KEY(`userId`, `sleepStartTime`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `music_entity` (`time` INTEGER NOT NULL, `animationUrl` TEXT NOT NULL, `tags` TEXT NOT NULL, `clipId` TEXT NOT NULL, `url` TEXT NOT NULL, PRIMARY KEY(`time`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '80391d558d8388001259020a7ccc1e4f')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `relaxScore`");
            _db.execSQL("DROP TABLE IF EXISTS `musicTag`");
            _db.execSQL("DROP TABLE IF EXISTS `music_entity`");
            if (SkyDatabase_Impl.this.mCallbacks != null) {
                int size = SkyDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) SkyDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (SkyDatabase_Impl.this.mCallbacks != null) {
                int size = SkyDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) SkyDatabase_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            SkyDatabase_Impl.this.mDatabase = _db;
            SkyDatabase_Impl.this.internalInitInvalidationTracker(_db);
            if (SkyDatabase_Impl.this.mCallbacks != null) {
                int size = SkyDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) SkyDatabase_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map.put("value", new TableInfo.Column("value", "INTEGER", true, 0, null, 1));
            map.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 2, null, 1));
            TableInfo tableInfo = new TableInfo("relaxScore", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "relaxScore");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "relaxScore(com.huami.sky.lib.entity.UserRelaxScore).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(5);
            map2.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map2.put("sleepStartTime", new TableInfo.Column("sleepStartTime", "INTEGER", true, 2, null, 1));
            map2.put("musicTags", new TableInfo.Column("musicTags", "TEXT", true, 0, null, 1));
            map2.put("scores", new TableInfo.Column("scores", "TEXT", true, 0, null, 1));
            map2.put("daysOfContinuous", new TableInfo.Column("daysOfContinuous", "TEXT", false, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("musicTag", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(_db, "musicTag");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "musicTag(com.huami.sky.lib.entity.UserMusicTag).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(5);
            map3.put("time", new TableInfo.Column("time", "INTEGER", true, 1, null, 1));
            map3.put("animationUrl", new TableInfo.Column("animationUrl", "TEXT", true, 0, null, 1));
            map3.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, 1));
            map3.put(WebConstant.QueryParam.CLIP_ID, new TableInfo.Column(WebConstant.QueryParam.CLIP_ID, "TEXT", true, 0, null, 1));
            map3.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo("music_entity", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(_db, "music_entity");
            if (tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "music_entity(com.huami.sky.lib.entity.MusicEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `relaxScore`");
            writableDatabase.execSQL("DELETE FROM `musicTag`");
            writableDatabase.execSQL("DELETE FROM `music_entity`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "relaxScore", "musicTag", "music_entity");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(6), "80391d558d8388001259020a7ccc1e4f", "4d5805e9e36fc97fa40b931063623eae")).build());
    }

    @Override // com.huami.sky.lib.room.SkyDatabase
    public MusicInfoDao getMusicInfoDao() {
        MusicInfoDao musicInfoDao;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = new MusicInfoDao_Impl(this);
            }
            musicInfoDao = this.d;
        }
        return musicInfoDao;
    }

    @Override // com.huami.sky.lib.room.SkyDatabase
    public MusicTagDao getMusicTagDao() {
        MusicTagDao musicTagDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new MusicTagDao_Impl(this);
            }
            musicTagDao = this.c;
        }
        return musicTagDao;
    }

    @Override // com.huami.sky.lib.room.SkyDatabase
    public RelaxScoreDao getRelaxScoreDao() {
        RelaxScoreDao relaxScoreDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new RelaxScoreDao_Impl(this);
            }
            relaxScoreDao = this.b;
        }
        return relaxScoreDao;
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(RelaxScoreDao.class, RelaxScoreDao_Impl.getRequiredConverters());
        map.put(MusicTagDao.class, MusicTagDao_Impl.getRequiredConverters());
        map.put(MusicInfoDao.class, MusicInfoDao_Impl.getRequiredConverters());
        return map;
    }
}
