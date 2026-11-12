package com.xiaomi.xms.wearable.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.xms.wearable.db.dao.WatchAppCapabilityDao;
import com.xiaomi.xms.wearable.db.dao.WatchAppItemDao;
import defpackage.g4r;
import defpackage.q4r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class WatchAppItemDatabase_Impl extends WatchAppItemDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile WatchAppItemDao f14477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile WatchAppCapabilityDao f14478b;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `watch_app_item` (`packageName` TEXT NOT NULL, `did` TEXT NOT NULL, `fingerprint` BLOB NOT NULL, `canRemove` INTEGER NOT NULL, `appName` TEXT NOT NULL, `versionCode` INTEGER NOT NULL, PRIMARY KEY(`packageName`, `did`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `watch_app_capability` (`packageName` TEXT NOT NULL, `appName` TEXT NOT NULL, `hasNotificationPermission` INTEGER NOT NULL, `hasObserveStatePermission` INTEGER NOT NULL, PRIMARY KEY(`packageName`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7839f2ad23fa418bb92ef381f56bd7e2')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `watch_app_item`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `watch_app_capability`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            WatchAppItemDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(6);
            map.put("packageName", new TableInfo.Column("packageName", "TEXT", true, 1, null, 1));
            map.put("did", new TableInfo.Column("did", "TEXT", true, 2, null, 1));
            map.put("fingerprint", new TableInfo.Column("fingerprint", "BLOB", true, 0, null, 1));
            map.put("canRemove", new TableInfo.Column("canRemove", "INTEGER", true, 0, null, 1));
            map.put("appName", new TableInfo.Column("appName", "TEXT", true, 0, null, 1));
            map.put(CommonConstants.KEY_VERSION_CODE, new TableInfo.Column(CommonConstants.KEY_VERSION_CODE, "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("watch_app_item", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "watch_app_item");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "watch_app_item(com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(4);
            map2.put("packageName", new TableInfo.Column("packageName", "TEXT", true, 1, null, 1));
            map2.put("appName", new TableInfo.Column("appName", "TEXT", true, 0, null, 1));
            map2.put("hasNotificationPermission", new TableInfo.Column("hasNotificationPermission", "INTEGER", true, 0, null, 1));
            map2.put("hasObserveStatePermission", new TableInfo.Column("hasObserveStatePermission", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("watch_app_capability", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "watch_app_capability");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "watch_app_capability(com.xiaomi.xms.wearable.db.entity.WatchAppCapability).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "watch_app_item", "watch_app_capability");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "watch_app_item", "watch_app_capability");
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
        map.put(WatchAppItemDao.class, q4r.k());
        map.put(WatchAppCapabilityDao.class, g4r.i());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(2, "7839f2ad23fa418bb92ef381f56bd7e2", "17b932447a09b9bf45136a6ae5bc5165");
    }

    @Override // com.xiaomi.xms.wearable.db.WatchAppItemDatabase
    public WatchAppCapabilityDao watchAppCapabilityDao() {
        WatchAppCapabilityDao watchAppCapabilityDao;
        if (this.f14478b != null) {
            return this.f14478b;
        }
        synchronized (this) {
            try {
                if (this.f14478b == null) {
                    this.f14478b = new g4r(this);
                }
                watchAppCapabilityDao = this.f14478b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return watchAppCapabilityDao;
    }

    @Override // com.xiaomi.xms.wearable.db.WatchAppItemDatabase
    public WatchAppItemDao watchAppItemDao() {
        WatchAppItemDao watchAppItemDao;
        if (this.f14477a != null) {
            return this.f14477a;
        }
        synchronized (this) {
            try {
                if (this.f14477a == null) {
                    this.f14477a = new q4r(this);
                }
                watchAppItemDao = this.f14477a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return watchAppItemDao;
    }
}
