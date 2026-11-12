package com.xiaomi.fitness.watch.face.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import defpackage.m5r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class WatchFaceDataBase_Impl extends WatchFaceDataBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile WatchFaceDao f13354a;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `face_ble_photo` (`id` TEXT NOT NULL, `path` TEXT, `md5` TEXT, `list` TEXT, PRIMARY KEY(`id`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `face_huami_realm` (`timestamp` INTEGER NOT NULL, `id` TEXT NOT NULL, `did` TEXT NOT NULL, `fileMd5` TEXT NOT NULL, `name` TEXT NOT NULL, `imgMd5` TEXT, `spiritColor` TEXT, `isCurrent` INTEGER NOT NULL, PRIMARY KEY(`id`, `did`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `photo_bean` (`cropPath` TEXT NOT NULL, `oriPath` TEXT, `nodeId` TEXT, PRIMARY KEY(`cropPath`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `face_common_table` (`combineId` TEXT NOT NULL, `timestamp` INTEGER, `did` TEXT, `faceId` TEXT, `name` TEXT, `upperColor` TEXT, `backgroundColor` TEXT, `md5` TEXT, `path` TEXT, `multiPhotoDataList` TEXT, PRIMARY KEY(`combineId`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'af0fdd08b6fd1d76e843a9aa9b9da626')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `face_ble_photo`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `face_huami_realm`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `photo_bean`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `face_common_table`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            WatchFaceDataBase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
            map.put("path", new TableInfo.Column("path", "TEXT", false, 0, null, 1));
            map.put("md5", new TableInfo.Column("md5", "TEXT", false, 0, null, 1));
            map.put("list", new TableInfo.Column("list", "TEXT", false, 0, null, 1));
            TableInfo tableInfo = new TableInfo("face_ble_photo", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "face_ble_photo");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "face_ble_photo(com.xiaomi.fitness.watch.face.db.FaceBlePhoto).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(8);
            map2.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
            map2.put("did", new TableInfo.Column("did", "TEXT", true, 2, null, 1));
            map2.put("fileMd5", new TableInfo.Column("fileMd5", "TEXT", true, 0, null, 1));
            map2.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            map2.put("imgMd5", new TableInfo.Column("imgMd5", "TEXT", false, 0, null, 1));
            map2.put("spiritColor", new TableInfo.Column("spiritColor", "TEXT", false, 0, null, 1));
            map2.put("isCurrent", new TableInfo.Column("isCurrent", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("face_huami_realm", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "face_huami_realm");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(false, "face_huami_realm(com.xiaomi.fitness.watch.face.db.FaceHuaMiRealm).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(3);
            map3.put("cropPath", new TableInfo.Column("cropPath", "TEXT", true, 1, null, 1));
            map3.put("oriPath", new TableInfo.Column("oriPath", "TEXT", false, 0, null, 1));
            map3.put("nodeId", new TableInfo.Column("nodeId", "TEXT", false, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo("photo_bean", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "photo_bean");
            if (!tableInfo5.equals(tableInfo6)) {
                return new RoomOpenDelegate.ValidationResult(false, "photo_bean(com.xiaomi.fitness.watch.face.db.PhotoBean).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
            }
            HashMap map4 = new HashMap(10);
            map4.put("combineId", new TableInfo.Column("combineId", "TEXT", true, 1, null, 1));
            map4.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", false, 0, null, 1));
            map4.put("did", new TableInfo.Column("did", "TEXT", false, 0, null, 1));
            map4.put(FaceInfoBase.FACE_ID, new TableInfo.Column(FaceInfoBase.FACE_ID, "TEXT", false, 0, null, 1));
            map4.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
            map4.put("upperColor", new TableInfo.Column("upperColor", "TEXT", false, 0, null, 1));
            map4.put("backgroundColor", new TableInfo.Column("backgroundColor", "TEXT", false, 0, null, 1));
            map4.put("md5", new TableInfo.Column("md5", "TEXT", false, 0, null, 1));
            map4.put("path", new TableInfo.Column("path", "TEXT", false, 0, null, 1));
            map4.put("multiPhotoDataList", new TableInfo.Column("multiPhotoDataList", "TEXT", false, 0, null, 1));
            TableInfo tableInfo7 = new TableInfo("face_common_table", map4, new HashSet(0), new HashSet(0));
            TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "face_common_table");
            if (tableInfo7.equals(tableInfo8)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "face_common_table(com.xiaomi.fitness.watch.face.db.FaceCommonEntity).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "face_ble_photo", "face_huami_realm", "photo_bean", "face_common_table");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "face_ble_photo", "face_huami_realm", "photo_bean", "face_common_table");
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
        map.put(WatchFaceDao.class, m5r.k());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(2, "af0fdd08b6fd1d76e843a9aa9b9da626", "e68d48b19564917df06ad5e5dafb690d");
    }

    @Override // com.xiaomi.fitness.watch.face.db.WatchFaceDataBase
    public WatchFaceDao watchFaceDao() {
        WatchFaceDao watchFaceDao;
        if (this.f13354a != null) {
            return this.f13354a;
        }
        synchronized (this) {
            try {
                if (this.f13354a == null) {
                    this.f13354a = new m5r(this);
                }
                watchFaceDao = this.f13354a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return watchFaceDao;
    }
}
