package com.xiaomi.fitness.migration.exercise;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import defpackage.ceo;
import defpackage.ydo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class ExerciseDatabase_Impl extends ExerciseDatabase {
    public volatile ydo d;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `step_detail` (`beginTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `julianDay` INTEGER NOT NULL, `mode` INTEGER NOT NULL, `steps` INTEGER NOT NULL, `distance` REAL NOT NULL, `speed` REAL NOT NULL, `consumption` REAL NOT NULL, `deleted` INTEGER NOT NULL, `origin` TEXT, PRIMARY KEY(`beginTime`))");
            SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_step_detail_beginTime` ON `step_detail` (`beginTime`)");
            SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_step_detail_julianDay` ON `step_detail` (`julianDay`)");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `goal` (`julianDay` INTEGER NOT NULL, `recordTime` INTEGER NOT NULL, `type` INTEGER NOT NULL, `value` INTEGER NOT NULL, PRIMARY KEY(`recordTime`, `type`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '74a4db646abd0d1f84a4b6f95aeddedf')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `step_detail`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `goal`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            ExerciseDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            map.put("beginTime", new TableInfo.Column("beginTime", "INTEGER", true, 1, null, 1));
            map.put("endTime", new TableInfo.Column("endTime", "INTEGER", true, 0, null, 1));
            map.put("julianDay", new TableInfo.Column("julianDay", "INTEGER", true, 0, null, 1));
            map.put("mode", new TableInfo.Column("mode", "INTEGER", true, 0, null, 1));
            map.put("steps", new TableInfo.Column("steps", "INTEGER", true, 0, null, 1));
            map.put("distance", new TableInfo.Column("distance", "REAL", true, 0, null, 1));
            map.put("speed", new TableInfo.Column("speed", "REAL", true, 0, null, 1));
            map.put("consumption", new TableInfo.Column("consumption", "REAL", true, 0, null, 1));
            map.put("deleted", new TableInfo.Column("deleted", "INTEGER", true, 0, null, 1));
            map.put("origin", new TableInfo.Column("origin", "TEXT", false, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new TableInfo.Index("index_step_detail_beginTime", false, Arrays.asList("beginTime"), Arrays.asList("ASC")));
            hashSet2.add(new TableInfo.Index("index_step_detail_julianDay", false, Arrays.asList("julianDay"), Arrays.asList("ASC")));
            TableInfo tableInfo = new TableInfo("step_detail", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "step_detail");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "step_detail(com.xiaomi.fitness.migration.exercise.entity.StepDetail).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(4);
            map2.put("julianDay", new TableInfo.Column("julianDay", "INTEGER", true, 0, null, 1));
            map2.put("recordTime", new TableInfo.Column("recordTime", "INTEGER", true, 1, null, 1));
            map2.put("type", new TableInfo.Column("type", "INTEGER", true, 2, null, 1));
            map2.put("value", new TableInfo.Column("value", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo(FitnessPersistKey.Rainbow, map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, FitnessPersistKey.Rainbow);
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "goal(com.xiaomi.fitness.migration.exercise.entity.ExerciseGoal).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "step_detail", FitnessPersistKey.Rainbow);
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "step_detail", FitnessPersistKey.Rainbow);
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
        map.put(ydo.class, ceo.f());
        return map;
    }

    @Override // com.xiaomi.fitness.migration.exercise.ExerciseDatabase
    public ydo h() {
        ydo ydoVar;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            try {
                if (this.d == null) {
                    this.d = new ceo(this);
                }
                ydoVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ydoVar;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(3, "74a4db646abd0d1f84a4b6f95aeddedf", "2aa6d1a995a0227b3759e3ff053a4427");
    }
}
