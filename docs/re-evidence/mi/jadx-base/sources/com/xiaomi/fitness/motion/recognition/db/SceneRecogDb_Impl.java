package com.xiaomi.fitness.motion.recognition.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.pel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class SceneRecogDb_Impl extends SceneRecogDb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SceneEventDao f12499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile SceneResultDao f12500b;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `scene_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `scene_time` INTEGER NOT NULL, `scene_type` INTEGER NOT NULL, `scene_accuracy` REAL NOT NULL, `scene_pressure` REAL NOT NULL)");
            SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `scene_event_index` ON `scene_event` (`scene_time`, `scene_type`)");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `scene_result` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `start` INTEGER NOT NULL, `act_type` INTEGER NOT NULL, `continue` INTEGER NOT NULL, `end` INTEGER NOT NULL, `step_count` INTEGER NOT NULL, `complete` INTEGER NOT NULL, `possible` INTEGER NOT NULL, `pressure_segment` TEXT)");
            SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `scene_result_index` ON `scene_result` (`start`, `act_type`)");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `scene_pressure_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `pressure` REAL NOT NULL)");
            SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `scene_pressure_event_index` ON `scene_pressure_event` (`time`, `pressure`)");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bf51801a4ec34774eb7efa4f672f78d5')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `scene_event`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `scene_result`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `scene_pressure_event`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            SceneRecogDb_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("scene_time", new TableInfo.Column("scene_time", "INTEGER", true, 0, null, 1));
            map.put("scene_type", new TableInfo.Column("scene_type", "INTEGER", true, 0, null, 1));
            map.put("scene_accuracy", new TableInfo.Column("scene_accuracy", "REAL", true, 0, null, 1));
            map.put("scene_pressure", new TableInfo.Column("scene_pressure", "REAL", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("scene_event_index", true, Arrays.asList("scene_time", "scene_type"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo = new TableInfo("scene_event", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "scene_event");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "scene_event(com.xiaomi.fitness.motion.recognition.db.entity.SceneEvent).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(9);
            map2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map2.put(StatConstants.PARAM_START, new TableInfo.Column(StatConstants.PARAM_START, "INTEGER", true, 0, null, 1));
            map2.put("act_type", new TableInfo.Column("act_type", "INTEGER", true, 0, null, 1));
            map2.put("continue", new TableInfo.Column("continue", "INTEGER", true, 0, null, 1));
            map2.put(StatConstants.PARAM_END, new TableInfo.Column(StatConstants.PARAM_END, "INTEGER", true, 0, null, 1));
            map2.put("step_count", new TableInfo.Column("step_count", "INTEGER", true, 0, null, 1));
            map2.put("complete", new TableInfo.Column("complete", "INTEGER", true, 0, null, 1));
            map2.put("possible", new TableInfo.Column("possible", "INTEGER", true, 0, null, 1));
            map2.put("pressure_segment", new TableInfo.Column("pressure_segment", "TEXT", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new TableInfo.Index("scene_result_index", true, Arrays.asList(StatConstants.PARAM_START, "act_type"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo3 = new TableInfo("scene_result", map2, hashSet3, hashSet4);
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "scene_result");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(false, "scene_result(com.xiaomi.fitness.motion.recognition.db.entity.SceneResult).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(3);
            map3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map3.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, 1));
            map3.put("pressure", new TableInfo.Column("pressure", "REAL", true, 0, null, 1));
            HashSet hashSet5 = new HashSet(0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new TableInfo.Index("scene_pressure_event_index", true, Arrays.asList("time", "pressure"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo5 = new TableInfo("scene_pressure_event", map3, hashSet5, hashSet6);
            TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "scene_pressure_event");
            if (tableInfo5.equals(tableInfo6)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "scene_pressure_event(com.xiaomi.fitness.motion.recognition.db.entity.ScenePressureEvent).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "scene_event", "scene_result", "scene_pressure_event");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "scene_event", "scene_result", "scene_pressure_event");
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
        map.put(SceneEventDao.class, pel.j());
        map.put(SceneResultDao.class, com.xiaomi.fitness.motion.recognition.db.a.i());
        return map;
    }

    @Override // com.xiaomi.fitness.motion.recognition.db.SceneRecogDb
    public SceneEventDao getSceneEventDao() {
        SceneEventDao sceneEventDao;
        if (this.f12499a != null) {
            return this.f12499a;
        }
        synchronized (this) {
            try {
                if (this.f12499a == null) {
                    this.f12499a = new pel(this);
                }
                sceneEventDao = this.f12499a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sceneEventDao;
    }

    @Override // com.xiaomi.fitness.motion.recognition.db.SceneRecogDb
    public SceneResultDao getSceneResultDao() {
        SceneResultDao sceneResultDao;
        if (this.f12500b != null) {
            return this.f12500b;
        }
        synchronized (this) {
            try {
                if (this.f12500b == null) {
                    this.f12500b = new com.xiaomi.fitness.motion.recognition.db.a(this);
                }
                sceneResultDao = this.f12500b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sceneResultDao;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(4, "bf51801a4ec34774eb7efa4f672f78d5", "c13f92a775f6e1061d5bbfd1887a2b31");
    }
}
