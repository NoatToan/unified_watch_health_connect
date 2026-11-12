package com.xiaomi.fitness.eco.device.manager.dao;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import defpackage.uu7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class EcoLocalDeviceDatabase_Impl extends EcoLocalDeviceDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile EcoLocalDeviceDao f12082a;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `eco_local_device` (`app_device_id` TEXT NOT NULL, `token` TEXT, `sn` TEXT, `oob` TEXT, `did` TEXT NOT NULL, `productId` INTEGER NOT NULL, `model` TEXT NOT NULL, `name` TEXT NOT NULL, `alias` TEXT NOT NULL, `detail` TEXT, `extraValues` TEXT, `identifier` TEXT NOT NULL, `status` INTEGER NOT NULL, `deviceType` INTEGER NOT NULL, `isOwner` INTEGER NOT NULL, `userId` TEXT, `shareUserId` TEXT, `shareId` TEXT, PRIMARY KEY(`app_device_id`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '907c3af579035025903c37c9b6d375e5')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `eco_local_device`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            EcoLocalDeviceDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPostMigrate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPreMigrate(SQLiteConnection sQLiteConnection) {
            DBUtil.dropFtsSyncTriggers(sQLiteConnection);
        }

        @Override // androidx.room.RoomOpenDelegate
        public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
            HashMap map = new HashMap(18);
            map.put("app_device_id", new TableInfo.Column("app_device_id", "TEXT", true, 1, null, 1));
            map.put("token", new TableInfo.Column("token", "TEXT", false, 0, null, 1));
            map.put("sn", new TableInfo.Column("sn", "TEXT", false, 0, null, 1));
            map.put("oob", new TableInfo.Column("oob", "TEXT", false, 0, null, 1));
            map.put("did", new TableInfo.Column("did", "TEXT", true, 0, null, 1));
            map.put("productId", new TableInfo.Column("productId", "INTEGER", true, 0, null, 1));
            map.put("model", new TableInfo.Column("model", "TEXT", true, 0, null, 1));
            map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            map.put("alias", new TableInfo.Column("alias", "TEXT", true, 0, null, 1));
            map.put("detail", new TableInfo.Column("detail", "TEXT", false, 0, null, 1));
            map.put("extraValues", new TableInfo.Column("extraValues", "TEXT", false, 0, null, 1));
            map.put("identifier", new TableInfo.Column("identifier", "TEXT", true, 0, null, 1));
            map.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
            map.put("deviceType", new TableInfo.Column("deviceType", "INTEGER", true, 0, null, 1));
            map.put("isOwner", new TableInfo.Column("isOwner", "INTEGER", true, 0, null, 1));
            map.put("userId", new TableInfo.Column("userId", "TEXT", false, 0, null, 1));
            map.put("shareUserId", new TableInfo.Column("shareUserId", "TEXT", false, 0, null, 1));
            map.put("shareId", new TableInfo.Column("shareId", "TEXT", false, 0, null, 1));
            TableInfo tableInfo = new TableInfo("eco_local_device", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "eco_local_device");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "eco_local_device(com.xiaomi.fitness.eco.device.manager.export.bean.EcoLocalDevice).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "eco_local_device");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "eco_local_device");
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // com.xiaomi.fitness.eco.device.manager.dao.EcoLocalDeviceDatabase
    public EcoLocalDeviceDao getEcoLocalDeviceDao() {
        EcoLocalDeviceDao ecoLocalDeviceDao;
        if (this.f12082a != null) {
            return this.f12082a;
        }
        synchronized (this) {
            try {
                if (this.f12082a == null) {
                    this.f12082a = new uu7(this);
                }
                ecoLocalDeviceDao = this.f12082a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ecoLocalDeviceDao;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(EcoLocalDeviceDao.class, uu7.k());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(1, "907c3af579035025903c37c9b6d375e5", "d4556df87104e4f313afba75a763e30b");
    }
}
