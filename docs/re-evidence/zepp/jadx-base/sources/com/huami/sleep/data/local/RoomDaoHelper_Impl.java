package com.huami.sleep.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.sleep.data.local.tonality.RatingCacheDao;
import com.huami.sleep.data.local.tonality.RatingCacheDao_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public final class RoomDaoHelper_Impl extends RoomDaoHelper {
    private volatile RatingCacheDao b;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `RatingCacheBean` (`uid` TEXT NOT NULL, `cache_day` TEXT NOT NULL, `rating_score` INTEGER NOT NULL, PRIMARY KEY(`uid`, `cache_day`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '605bf4f0b7f82dafef23cf00e6aca385')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `RatingCacheBean`");
            if (RoomDaoHelper_Impl.this.mCallbacks != null) {
                int size = RoomDaoHelper_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) RoomDaoHelper_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (RoomDaoHelper_Impl.this.mCallbacks != null) {
                int size = RoomDaoHelper_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) RoomDaoHelper_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            RoomDaoHelper_Impl.this.mDatabase = _db;
            RoomDaoHelper_Impl.this.internalInitInvalidationTracker(_db);
            if (RoomDaoHelper_Impl.this.mCallbacks != null) {
                int size = RoomDaoHelper_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) RoomDaoHelper_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            map.put("uid", new TableInfo.Column("uid", "TEXT", true, 1, null, 1));
            map.put("cache_day", new TableInfo.Column("cache_day", "TEXT", true, 2, null, 1));
            map.put("rating_score", new TableInfo.Column("rating_score", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("RatingCacheBean", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "RatingCacheBean");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "RatingCacheBean(com.huami.sleep.data.local.tonality.RatingCacheBean).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `RatingCacheBean`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "RatingCacheBean");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(1), "605bf4f0b7f82dafef23cf00e6aca385", "567020503c29c149392f30fff1ec2b85")).build());
    }

    @Override // com.huami.sleep.data.local.RoomDaoHelper
    public RatingCacheDao getRatingCacheDao() {
        RatingCacheDao ratingCacheDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new RatingCacheDao_Impl(this);
            }
            ratingCacheDao = this.b;
        }
        return ratingCacheDao;
    }
}
