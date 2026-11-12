package com.huami.watchfacesstore.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.watchfacesstore.room.publisher.PublisherDao;
import com.huami.watchfacesstore.room.publisher.PublisherDao_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class WatchFaceDataBase_Impl extends WatchFaceDataBase {
    private volatile WatchFaceDao a;
    private volatile PublisherDao b;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `WatchFaceInfo` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `rating` REAL NOT NULL, `price` INTEGER NOT NULL, `customizable` INTEGER NOT NULL, `is_free` INTEGER NOT NULL, `thumbnail_image_path` TEXT, `dial_path` TEXT NOT NULL, `transparent_background_path` TEXT, `gif_img_path` TEXT, `device_id` TEXT NOT NULL, `minimum_firmware_version` TEXT NOT NULL, `size` INTEGER NOT NULL, `create_time` INTEGER NOT NULL, `bg_path` TEXT, `color` INTEGER, `publisher_id` INTEGER, `version` TEXT NOT NULL, `real_price` REAL NOT NULL, PRIMARY KEY(`id`, `device_id`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `PublisherInfo` (`id` INTEGER NOT NULL, `name` TEXT, `icon` TEXT, `description` TEXT, PRIMARY KEY(`id`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ee39b81f2fa13f989a5823db2f082bcd')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `WatchFaceInfo`");
            _db.execSQL("DROP TABLE IF EXISTS `PublisherInfo`");
            if (WatchFaceDataBase_Impl.this.mCallbacks != null) {
                int size = WatchFaceDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) WatchFaceDataBase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (WatchFaceDataBase_Impl.this.mCallbacks != null) {
                int size = WatchFaceDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) WatchFaceDataBase_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            WatchFaceDataBase_Impl.this.mDatabase = _db;
            WatchFaceDataBase_Impl.this.internalInitInvalidationTracker(_db);
            if (WatchFaceDataBase_Impl.this.mCallbacks != null) {
                int size = WatchFaceDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) WatchFaceDataBase_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            HashMap map = new HashMap(20);
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            map.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
            map.put("rating", new TableInfo.Column("rating", "REAL", true, 0, null, 1));
            map.put(FirebaseAnalytics.Param.PRICE, new TableInfo.Column(FirebaseAnalytics.Param.PRICE, "INTEGER", true, 0, null, 1));
            map.put("customizable", new TableInfo.Column("customizable", "INTEGER", true, 0, null, 1));
            map.put("is_free", new TableInfo.Column("is_free", "INTEGER", true, 0, null, 1));
            map.put("thumbnail_image_path", new TableInfo.Column("thumbnail_image_path", "TEXT", false, 0, null, 1));
            map.put("dial_path", new TableInfo.Column("dial_path", "TEXT", true, 0, null, 1));
            map.put("transparent_background_path", new TableInfo.Column("transparent_background_path", "TEXT", false, 0, null, 1));
            map.put("gif_img_path", new TableInfo.Column("gif_img_path", "TEXT", false, 0, null, 1));
            map.put("device_id", new TableInfo.Column("device_id", "TEXT", true, 2, null, 1));
            map.put("minimum_firmware_version", new TableInfo.Column("minimum_firmware_version", "TEXT", true, 0, null, 1));
            map.put("size", new TableInfo.Column("size", "INTEGER", true, 0, null, 1));
            map.put("create_time", new TableInfo.Column("create_time", "INTEGER", true, 0, null, 1));
            map.put("bg_path", new TableInfo.Column("bg_path", "TEXT", false, 0, null, 1));
            map.put("color", new TableInfo.Column("color", "INTEGER", false, 0, null, 1));
            map.put("publisher_id", new TableInfo.Column("publisher_id", "INTEGER", false, 0, null, 1));
            map.put("version", new TableInfo.Column("version", "TEXT", true, 0, null, 1));
            map.put("real_price", new TableInfo.Column("real_price", "REAL", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("WatchFaceInfo", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "WatchFaceInfo");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "WatchFaceInfo(com.huami.watchfacesstore.room.WatchFaceInfo).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(4);
            map2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map2.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
            map2.put("icon", new TableInfo.Column("icon", "TEXT", false, 0, null, 1));
            map2.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("PublisherInfo", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(_db, "PublisherInfo");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "PublisherInfo(com.huami.watchfacesstore.room.publisher.PublisherInfo).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `WatchFaceInfo`");
            writableDatabase.execSQL("DELETE FROM `PublisherInfo`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "WatchFaceInfo", "PublisherInfo");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(4), "ee39b81f2fa13f989a5823db2f082bcd", "971f2a1abf6d366c066481a24c95fb71")).build());
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(WatchFaceDao.class, WatchFaceDao_Impl.getRequiredConverters());
        map.put(PublisherDao.class, PublisherDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.huami.watchfacesstore.room.WatchFaceDataBase
    public PublisherDao publisherDao() {
        PublisherDao publisherDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new PublisherDao_Impl(this);
            }
            publisherDao = this.b;
        }
        return publisherDao;
    }

    @Override // com.huami.watchfacesstore.room.WatchFaceDataBase
    public WatchFaceDao watchFaceDao() {
        WatchFaceDao watchFaceDao;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new WatchFaceDao_Impl(this);
            }
            watchFaceDao = this.a;
        }
        return watchFaceDao;
    }
}
