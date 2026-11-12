package com.xiaomi.fit.fitness.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.xiaomi.fit.fitness.db.dao.CgmGlucoseDao;
import com.xiaomi.fit.fitness.db.dao.DeviceDataSyncDao;
import defpackage.k36;
import defpackage.ss3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class FitnessSyncDataBase_Impl extends FitnessSyncDataBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile DeviceDataSyncDao f11306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile CgmGlucoseDao f11307b;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `device_sync` (`sid` TEXT NOT NULL, `idBytes` BLOB NOT NULL, `syncStatus` INTEGER NOT NULL, `forceSync` INTEGER NOT NULL, PRIMARY KEY(`sid`, `idBytes`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `cgm_glucose` (`did` TEXT NOT NULL, `time` INTEGER NOT NULL, `dataType` INTEGER NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`did`, `time`, `dataType`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '03bd8a39680d30658ab9002cfd8908e9')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `device_sync`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `cgm_glucose`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            FitnessSyncDataBase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(4);
            map.put("sid", new TableInfo.Column("sid", "TEXT", true, 1, null, 1));
            map.put("idBytes", new TableInfo.Column("idBytes", "BLOB", true, 2, null, 1));
            map.put("syncStatus", new TableInfo.Column("syncStatus", "INTEGER", true, 0, null, 1));
            map.put("forceSync", new TableInfo.Column("forceSync", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("device_sync", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "device_sync");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "device_sync(com.xiaomi.fit.fitness.db.dao.DataSyncEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(4);
            map2.put("did", new TableInfo.Column("did", "TEXT", true, 1, null, 1));
            map2.put("time", new TableInfo.Column("time", "INTEGER", true, 2, null, 1));
            map2.put("dataType", new TableInfo.Column("dataType", "INTEGER", true, 3, null, 1));
            map2.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("cgm_glucose", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "cgm_glucose");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "cgm_glucose(com.xiaomi.fit.fitness.db.dao.CgmGlucoseEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // com.xiaomi.fit.fitness.db.FitnessSyncDataBase
    public CgmGlucoseDao cgmGlucoseDao() {
        CgmGlucoseDao cgmGlucoseDao;
        if (this.f11307b != null) {
            return this.f11307b;
        }
        synchronized (this) {
            try {
                if (this.f11307b == null) {
                    this.f11307b = new ss3(this);
                }
                cgmGlucoseDao = this.f11307b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cgmGlucoseDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "device_sync", "cgm_glucose");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "device_sync", "cgm_glucose");
    }

    @Override // com.xiaomi.fit.fitness.db.FitnessSyncDataBase
    public DeviceDataSyncDao deviceDataSyncDao() {
        DeviceDataSyncDao deviceDataSyncDao;
        if (this.f11306a != null) {
            return this.f11306a;
        }
        synchronized (this) {
            try {
                if (this.f11306a == null) {
                    this.f11306a = new k36(this);
                }
                deviceDataSyncDao = this.f11306a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceDataSyncDao;
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
        map.put(DeviceDataSyncDao.class, k36.h());
        map.put(CgmGlucoseDao.class, ss3.d());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(3, "03bd8a39680d30658ab9002cfd8908e9", "fe4a3170fc605f309d9f9a7f334d17cd");
    }
}
