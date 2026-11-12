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
import defpackage.pb6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class DeviceRecordDatabase_Impl extends DeviceRecordDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile DeviceRecordDao f11909a;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `device_record` (`deviceRecordId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `deviceRecordValue` TEXT, `did` TEXT, `need_check` INTEGER NOT NULL, `record_time` INTEGER NOT NULL)");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a02362c9e80d04b2b57f4cc526a62630')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `device_record`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            DeviceRecordDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(5);
            map.put("deviceRecordId", new TableInfo.Column("deviceRecordId", "INTEGER", true, 1, null, 1));
            map.put("deviceRecordValue", new TableInfo.Column("deviceRecordValue", "TEXT", false, 0, null, 1));
            map.put("did", new TableInfo.Column("did", "TEXT", false, 0, null, 1));
            map.put("need_check", new TableInfo.Column("need_check", "INTEGER", true, 0, null, 1));
            map.put("record_time", new TableInfo.Column("record_time", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("device_record", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "device_record");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "device_record(com.xiaomi.fitness.device.manager.export.bean.DeviceRecord).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "device_record");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "device_record");
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceRecordDatabase
    public DeviceRecordDao getDeviceRecordDao() {
        DeviceRecordDao deviceRecordDao;
        if (this.f11909a != null) {
            return this.f11909a;
        }
        synchronized (this) {
            try {
                if (this.f11909a == null) {
                    this.f11909a = new pb6(this);
                }
                deviceRecordDao = this.f11909a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceRecordDao;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(DeviceRecordDao.class, pb6.n());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(3, "a02362c9e80d04b2b57f4cc526a62630", "c9c9c06b7ca425e4a99aa999f4c924dd");
    }
}
