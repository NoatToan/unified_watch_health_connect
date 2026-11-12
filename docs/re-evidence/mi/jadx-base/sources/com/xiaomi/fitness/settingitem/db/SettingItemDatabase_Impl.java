package com.xiaomi.fitness.settingitem.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.xiaomi.fitness.settingitem.db.dao.SettingDeviceDao;
import com.xiaomi.fitness.settingitem.db.dao.SettingItemDao;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.h1m;
import defpackage.w1m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class SettingItemDatabase_Impl extends SettingItemDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SettingItemDao f12865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile SettingDeviceDao f12866b;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `settingitem` (`key` TEXT NOT NULL, `value` TEXT, `did` TEXT NOT NULL, `module` TEXT NOT NULL, `updateTime` INTEGER NOT NULL, `modifyTime` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isBig` INTEGER NOT NULL, PRIMARY KEY(`did`, `key`, `module`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `settingdevice` (`module` TEXT NOT NULL, `did` TEXT NOT NULL, `updateTime` INTEGER NOT NULL, `lastId` INTEGER NOT NULL, PRIMARY KEY(`did`, `module`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8b3f1233ebe26d1d1411f6c06a3e728b')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `settingitem`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `settingdevice`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            SettingItemDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(8);
            map.put("key", new TableInfo.Column("key", "TEXT", true, 2, null, 1));
            map.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map.put("did", new TableInfo.Column("did", "TEXT", true, 1, null, 1));
            map.put(RnReportConst.ApiReport.PARAM_MODULE, new TableInfo.Column(RnReportConst.ApiReport.PARAM_MODULE, "TEXT", true, 3, null, 1));
            map.put("updateTime", new TableInfo.Column("updateTime", "INTEGER", true, 0, null, 1));
            map.put("modifyTime", new TableInfo.Column("modifyTime", "INTEGER", true, 0, null, 1));
            map.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map.put("isBig", new TableInfo.Column("isBig", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("settingitem", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "settingitem");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "settingitem(com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(4);
            map2.put(RnReportConst.ApiReport.PARAM_MODULE, new TableInfo.Column(RnReportConst.ApiReport.PARAM_MODULE, "TEXT", true, 2, null, 1));
            map2.put("did", new TableInfo.Column("did", "TEXT", true, 1, null, 1));
            map2.put("updateTime", new TableInfo.Column("updateTime", "INTEGER", true, 0, null, 1));
            map2.put("lastId", new TableInfo.Column("lastId", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("settingdevice", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "settingdevice");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "settingdevice(com.xiaomi.fitness.settingitem.db.entity.SettingDeviceEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "settingitem", "settingdevice");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "settingitem", "settingdevice");
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(SettingItemDao.class, w1m.m());
        map.put(SettingDeviceDao.class, h1m.j());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(2, "8b3f1233ebe26d1d1411f6c06a3e728b", "748717fd7f7a41f309b5cfd5224c8428");
    }

    @Override // com.xiaomi.fitness.settingitem.db.SettingItemDatabase
    public SettingDeviceDao settingDeviceDao() {
        SettingDeviceDao settingDeviceDao;
        if (this.f12866b != null) {
            return this.f12866b;
        }
        synchronized (this) {
            try {
                if (this.f12866b == null) {
                    this.f12866b = new h1m(this);
                }
                settingDeviceDao = this.f12866b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return settingDeviceDao;
    }

    @Override // com.xiaomi.fitness.settingitem.db.SettingItemDatabase
    public SettingItemDao settingItemDao() {
        SettingItemDao settingItemDao;
        if (this.f12865a != null) {
            return this.f12865a;
        }
        synchronized (this) {
            try {
                if (this.f12865a == null) {
                    this.f12865a = new w1m(this);
                }
                settingItemDao = this.f12865a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return settingItemDao;
    }
}
