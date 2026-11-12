package com.huawei.maps.offlinedata.service.persist;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huawei.maps.offlinedata.service.persist.dao.c;
import com.huawei.maps.offlinedata.service.persist.dao.d;
import com.huawei.maps.offlinedata.service.persist.dao.e;
import com.huawei.maps.offlinedata.service.persist.dao.f;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes40.dex */
public final class OfflineMapDatabase_Impl extends OfflineMapDatabase {
    private volatile com.huawei.maps.offlinedata.service.persist.dao.a f;
    private volatile c g;
    private volatile e h;

    class a extends RoomOpenHelper.Delegate {
        a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `map_offline_data_item` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dataType` TEXT, `countryId` TEXT, `countryCode` TEXT, `countryName` TEXT, `regionId` TEXT, `regionName` TEXT, `cityId` TEXT, `cityName` TEXT, `political` TEXT, `fileId` TEXT, `version` TEXT, `packageSize` TEXT, `originalSize` TEXT, `fileCheck` TEXT, `lon` TEXT, `lat` TEXT, `maxLon` TEXT, `maxLat` TEXT, `minLon` TEXT, `minLat` TEXT, `lastModifiedTime` TEXT)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `world_map_offline_data_item` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dataType` TEXT, `countryId` TEXT, `countryName` TEXT, `regionId` TEXT, `regionName` TEXT, `cityId` TEXT, `cityName` TEXT, `political` TEXT, `fileId` TEXT, `version` TEXT, `packageSize` TEXT, `originalSize` TEXT, `fileCheck` TEXT, `lastModifiedTime` TEXT)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `offline_data_task` (`id` TEXT NOT NULL, `dataType` TEXT, `countryId` TEXT, `countryName` TEXT, `regionId` TEXT, `regionName` TEXT, `cityId` TEXT, `cityName` TEXT, `political` TEXT, `version` TEXT, `taskId` TEXT, `taskState` TEXT, `itemState` TEXT, `downloadProgress` INTEGER, `transmitProgress` INTEGER, `lastModifyTime` TEXT, `downloadType` INTEGER, `manualPause` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '175edca0200047bfb16064736f164423')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `map_offline_data_item`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `world_map_offline_data_item`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `offline_data_task`");
            if (OfflineMapDatabase_Impl.this.mCallbacks != null) {
                int size = OfflineMapDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) OfflineMapDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (OfflineMapDatabase_Impl.this.mCallbacks != null) {
                int size = OfflineMapDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) OfflineMapDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            OfflineMapDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
            OfflineMapDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (OfflineMapDatabase_Impl.this.mCallbacks != null) {
                int size = OfflineMapDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) OfflineMapDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(22);
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("dataType", new TableInfo.Column("dataType", "TEXT", false, 0, null, 1));
            map.put("countryId", new TableInfo.Column("countryId", "TEXT", false, 0, null, 1));
            map.put("countryCode", new TableInfo.Column("countryCode", "TEXT", false, 0, null, 1));
            map.put("countryName", new TableInfo.Column("countryName", "TEXT", false, 0, null, 1));
            map.put("regionId", new TableInfo.Column("regionId", "TEXT", false, 0, null, 1));
            map.put("regionName", new TableInfo.Column("regionName", "TEXT", false, 0, null, 1));
            map.put("cityId", new TableInfo.Column("cityId", "TEXT", false, 0, null, 1));
            map.put("cityName", new TableInfo.Column("cityName", "TEXT", false, 0, null, 1));
            map.put("political", new TableInfo.Column("political", "TEXT", false, 0, null, 1));
            map.put(RecommendConstants.FILE_ID, new TableInfo.Column(RecommendConstants.FILE_ID, "TEXT", false, 0, null, 1));
            map.put("version", new TableInfo.Column("version", "TEXT", false, 0, null, 1));
            map.put("packageSize", new TableInfo.Column("packageSize", "TEXT", false, 0, null, 1));
            map.put("originalSize", new TableInfo.Column("originalSize", "TEXT", false, 0, null, 1));
            map.put("fileCheck", new TableInfo.Column("fileCheck", "TEXT", false, 0, null, 1));
            map.put("lon", new TableInfo.Column("lon", "TEXT", false, 0, null, 1));
            map.put("lat", new TableInfo.Column("lat", "TEXT", false, 0, null, 1));
            map.put("maxLon", new TableInfo.Column("maxLon", "TEXT", false, 0, null, 1));
            map.put("maxLat", new TableInfo.Column("maxLat", "TEXT", false, 0, null, 1));
            map.put("minLon", new TableInfo.Column("minLon", "TEXT", false, 0, null, 1));
            map.put("minLat", new TableInfo.Column("minLat", "TEXT", false, 0, null, 1));
            map.put("lastModifiedTime", new TableInfo.Column("lastModifiedTime", "TEXT", false, 0, null, 1));
            TableInfo tableInfo = new TableInfo("map_offline_data_item", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "map_offline_data_item");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "map_offline_data_item(com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(15);
            map2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map2.put("dataType", new TableInfo.Column("dataType", "TEXT", false, 0, null, 1));
            map2.put("countryId", new TableInfo.Column("countryId", "TEXT", false, 0, null, 1));
            map2.put("countryName", new TableInfo.Column("countryName", "TEXT", false, 0, null, 1));
            map2.put("regionId", new TableInfo.Column("regionId", "TEXT", false, 0, null, 1));
            map2.put("regionName", new TableInfo.Column("regionName", "TEXT", false, 0, null, 1));
            map2.put("cityId", new TableInfo.Column("cityId", "TEXT", false, 0, null, 1));
            map2.put("cityName", new TableInfo.Column("cityName", "TEXT", false, 0, null, 1));
            map2.put("political", new TableInfo.Column("political", "TEXT", false, 0, null, 1));
            map2.put(RecommendConstants.FILE_ID, new TableInfo.Column(RecommendConstants.FILE_ID, "TEXT", false, 0, null, 1));
            map2.put("version", new TableInfo.Column("version", "TEXT", false, 0, null, 1));
            map2.put("packageSize", new TableInfo.Column("packageSize", "TEXT", false, 0, null, 1));
            map2.put("originalSize", new TableInfo.Column("originalSize", "TEXT", false, 0, null, 1));
            map2.put("fileCheck", new TableInfo.Column("fileCheck", "TEXT", false, 0, null, 1));
            map2.put("lastModifiedTime", new TableInfo.Column("lastModifiedTime", "TEXT", false, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("world_map_offline_data_item", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "world_map_offline_data_item");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "world_map_offline_data_item(com.huawei.maps.offlinedata.handler.dto.persist.WorldMapOfflineDataItemEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(18);
            map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
            map3.put("dataType", new TableInfo.Column("dataType", "TEXT", false, 0, null, 1));
            map3.put("countryId", new TableInfo.Column("countryId", "TEXT", false, 0, null, 1));
            map3.put("countryName", new TableInfo.Column("countryName", "TEXT", false, 0, null, 1));
            map3.put("regionId", new TableInfo.Column("regionId", "TEXT", false, 0, null, 1));
            map3.put("regionName", new TableInfo.Column("regionName", "TEXT", false, 0, null, 1));
            map3.put("cityId", new TableInfo.Column("cityId", "TEXT", false, 0, null, 1));
            map3.put("cityName", new TableInfo.Column("cityName", "TEXT", false, 0, null, 1));
            map3.put("political", new TableInfo.Column("political", "TEXT", false, 0, null, 1));
            map3.put("version", new TableInfo.Column("version", "TEXT", false, 0, null, 1));
            map3.put("taskId", new TableInfo.Column("taskId", "TEXT", false, 0, null, 1));
            map3.put("taskState", new TableInfo.Column("taskState", "TEXT", false, 0, null, 1));
            map3.put("itemState", new TableInfo.Column("itemState", "TEXT", false, 0, null, 1));
            map3.put("downloadProgress", new TableInfo.Column("downloadProgress", "INTEGER", false, 0, null, 1));
            map3.put("transmitProgress", new TableInfo.Column("transmitProgress", "INTEGER", false, 0, null, 1));
            map3.put("lastModifyTime", new TableInfo.Column("lastModifyTime", "TEXT", false, 0, null, 1));
            map3.put("downloadType", new TableInfo.Column("downloadType", "INTEGER", false, 0, null, 1));
            map3.put("manualPause", new TableInfo.Column("manualPause", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo("offline_data_task", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(supportSQLiteDatabase, "offline_data_task");
            if (tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "offline_data_task(com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `map_offline_data_item`");
            writableDatabase.execSQL("DELETE FROM `world_map_offline_data_item`");
            writableDatabase.execSQL("DELETE FROM `offline_data_task`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "map_offline_data_item", "world_map_offline_data_item", "offline_data_task");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(5), "175edca0200047bfb16064736f164423", "cd34b13efa417ffd9540176758177b68")).build());
    }

    @Override // androidx.room.RoomDatabase
    public List getAutoMigrations(Map map) {
        return Arrays.asList(new Migration[0]);
    }

    @Override // androidx.room.RoomDatabase
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(com.huawei.maps.offlinedata.service.persist.dao.a.class, com.huawei.maps.offlinedata.service.persist.dao.b.c());
        map.put(c.class, d.c());
        map.put(e.class, f.c());
        return map;
    }

    @Override // com.huawei.maps.offlinedata.service.persist.OfflineMapDatabase
    public e c() {
        e eVar;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = new f(this);
            }
            eVar = this.h;
        }
        return eVar;
    }

    @Override // com.huawei.maps.offlinedata.service.persist.OfflineMapDatabase
    public com.huawei.maps.offlinedata.service.persist.dao.a a() {
        com.huawei.maps.offlinedata.service.persist.dao.a aVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            if (this.f == null) {
                this.f = new com.huawei.maps.offlinedata.service.persist.dao.b(this);
            }
            aVar = this.f;
        }
        return aVar;
    }

    @Override // com.huawei.maps.offlinedata.service.persist.OfflineMapDatabase
    public c b() {
        c cVar;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = new d(this);
            }
            cVar = this.g;
        }
        return cVar;
    }
}
