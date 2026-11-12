package com.xiaomi.fitness.device.manager.dao;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import defpackage.lje;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class DeviceDatabase_Impl extends DeviceDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile DeviceDao f11906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile LocalDeviceDao f11907b;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `device` (`did` TEXT NOT NULL, `productId` INTEGER NOT NULL, `model` TEXT NOT NULL, `name` TEXT NOT NULL, `extraValues` TEXT, `identifier` TEXT NOT NULL, `alias` TEXT NOT NULL, `status` INTEGER NOT NULL, `detail` TEXT, `uploaded` INTEGER NOT NULL, PRIMARY KEY(`did`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `local_device` (`app_device_id` TEXT NOT NULL, `token` TEXT, `sn` TEXT, `oob` TEXT, `did` TEXT NOT NULL, `productId` INTEGER NOT NULL, `model` TEXT NOT NULL, `name` TEXT NOT NULL, `alias` TEXT NOT NULL, `detail` TEXT, `extraValues` TEXT, `identifier` TEXT NOT NULL, `status` INTEGER NOT NULL, `uploaded` INTEGER NOT NULL, PRIMARY KEY(`app_device_id`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '81d72ac29c169ebf54de7ee75f32faed')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `device`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `local_device`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            DeviceDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(10);
            map.put("did", new TableInfo.Column("did", "TEXT", true, 1, null, 1));
            map.put("productId", new TableInfo.Column("productId", "INTEGER", true, 0, null, 1));
            map.put("model", new TableInfo.Column("model", "TEXT", true, 0, null, 1));
            map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            map.put("extraValues", new TableInfo.Column("extraValues", "TEXT", false, 0, null, 1));
            map.put("identifier", new TableInfo.Column("identifier", "TEXT", true, 0, null, 1));
            map.put("alias", new TableInfo.Column("alias", "TEXT", true, 0, null, 1));
            map.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
            map.put("detail", new TableInfo.Column("detail", "TEXT", false, 0, null, 1));
            map.put("uploaded", new TableInfo.Column("uploaded", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("device", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "device");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "device(com.xiaomi.fitness.device.manager.export.bean.WearableDevice).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(14);
            map2.put("app_device_id", new TableInfo.Column("app_device_id", "TEXT", true, 1, null, 1));
            map2.put("token", new TableInfo.Column("token", "TEXT", false, 0, null, 1));
            map2.put("sn", new TableInfo.Column("sn", "TEXT", false, 0, null, 1));
            map2.put("oob", new TableInfo.Column("oob", "TEXT", false, 0, null, 1));
            map2.put("did", new TableInfo.Column("did", "TEXT", true, 0, null, 1));
            map2.put("productId", new TableInfo.Column("productId", "INTEGER", true, 0, null, 1));
            map2.put("model", new TableInfo.Column("model", "TEXT", true, 0, null, 1));
            map2.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            map2.put("alias", new TableInfo.Column("alias", "TEXT", true, 0, null, 1));
            map2.put("detail", new TableInfo.Column("detail", "TEXT", false, 0, null, 1));
            map2.put("extraValues", new TableInfo.Column("extraValues", "TEXT", false, 0, null, 1));
            map2.put("identifier", new TableInfo.Column("identifier", "TEXT", true, 0, null, 1));
            map2.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
            map2.put("uploaded", new TableInfo.Column("uploaded", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("local_device", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "local_device");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "local_device(com.xiaomi.fitness.device.manager.export.bean.LocalDevice).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "device", "local_device");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "device", "local_device");
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceDatabase
    public DeviceDao getDeviceDao() {
        DeviceDao deviceDao;
        if (this.f11906a != null) {
            return this.f11906a;
        }
        synchronized (this) {
            try {
                if (this.f11906a == null) {
                    this.f11906a = new com.xiaomi.fitness.device.manager.dao.a(this);
                }
                deviceDao = this.f11906a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceDao;
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceDatabase
    public LocalDeviceDao getLocalDeviceDao() {
        LocalDeviceDao localDeviceDao;
        if (this.f11907b != null) {
            return this.f11907b;
        }
        synchronized (this) {
            try {
                if (this.f11907b == null) {
                    this.f11907b = new lje(this);
                }
                localDeviceDao = this.f11907b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return localDeviceDao;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(DeviceDao.class, com.xiaomi.fitness.device.manager.dao.a.n());
        map.put(LocalDeviceDao.class, lje.k());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(6, "81d72ac29c169ebf54de7ee75f32faed", "49836e240eb3914ce9520fb4bbced781");
    }
}
