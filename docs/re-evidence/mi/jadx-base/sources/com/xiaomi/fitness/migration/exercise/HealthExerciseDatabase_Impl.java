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
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import defpackage.efo;
import defpackage.kg8;
import defpackage.og8;
import defpackage.seo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class HealthExerciseDatabase_Impl extends HealthExerciseDatabase {
    public volatile seo f;
    public volatile kg8 g;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `record_step` (`begin_time` INTEGER NOT NULL, `end_time` INTEGER NOT NULL, `step_distance` REAL NOT NULL, `steps` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `device_id` TEXT, `device_type` TEXT, `device_model` TEXT, `data_type` TEXT, `timestamp` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `update_time` INTEGER NOT NULL)");
            SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_record_step_device_id_device_type_data_type_timestamp` ON `record_step` (`device_id`, `device_type`, `data_type`, `timestamp`)");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `record_exercise` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sports_type` TEXT, `begin_time` INTEGER NOT NULL, `end_time` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `distance` INTEGER NOT NULL, `calories` INTEGER NOT NULL, `total_consume` INTEGER NOT NULL, `track_filename` TEXT, `pressure_filename` TEXT, `intensity` TEXT, `source` INTEGER NOT NULL, `course_id` INTEGER NOT NULL, `detail` TEXT, `device_id` TEXT, `device_type` TEXT, `device_model` TEXT, `data_type` TEXT, `timestamp` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `update_time` INTEGER NOT NULL)");
            SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_record_exercise_device_id_device_type_data_type_timestamp` ON `record_exercise` (`device_id`, `device_type`, `data_type`, `timestamp`)");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '439dbbf75c28d2dbeaa0304afadebccf')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `record_step`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `record_exercise`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            HealthExerciseDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(12);
            map.put("begin_time", new TableInfo.Column("begin_time", "INTEGER", true, 0, null, 1));
            map.put(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, new TableInfo.Column(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, "INTEGER", true, 0, null, 1));
            map.put("step_distance", new TableInfo.Column("step_distance", "REAL", true, 0, null, 1));
            map.put("steps", new TableInfo.Column("steps", "INTEGER", true, 0, null, 1));
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("device_id", new TableInfo.Column("device_id", "TEXT", false, 0, null, 1));
            map.put(DeviceContractKt.COLUMN_DEVICE_TYPE, new TableInfo.Column(DeviceContractKt.COLUMN_DEVICE_TYPE, "TEXT", false, 0, null, 1));
            map.put("device_model", new TableInfo.Column("device_model", "TEXT", false, 0, null, 1));
            map.put("data_type", new TableInfo.Column("data_type", "TEXT", false, 0, null, 1));
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            map.put("deleted", new TableInfo.Column("deleted", "INTEGER", true, 0, null, 1));
            map.put("update_time", new TableInfo.Column("update_time", "INTEGER", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_record_step_device_id_device_type_data_type_timestamp", true, Arrays.asList("device_id", DeviceContractKt.COLUMN_DEVICE_TYPE, "data_type", "timestamp"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
            TableInfo tableInfo = new TableInfo("record_step", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "record_step");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "record_step(com.xiaomi.fitness.migration.exercise.entity.HealthStepRecord).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(21);
            map2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map2.put("sports_type", new TableInfo.Column("sports_type", "TEXT", false, 0, null, 1));
            map2.put("begin_time", new TableInfo.Column("begin_time", "INTEGER", true, 0, null, 1));
            map2.put(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, new TableInfo.Column(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, "INTEGER", true, 0, null, 1));
            map2.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, 1));
            map2.put("distance", new TableInfo.Column("distance", "INTEGER", true, 0, null, 1));
            map2.put("calories", new TableInfo.Column("calories", "INTEGER", true, 0, null, 1));
            map2.put("total_consume", new TableInfo.Column("total_consume", "INTEGER", true, 0, null, 1));
            map2.put("track_filename", new TableInfo.Column("track_filename", "TEXT", false, 0, null, 1));
            map2.put("pressure_filename", new TableInfo.Column("pressure_filename", "TEXT", false, 0, null, 1));
            map2.put("intensity", new TableInfo.Column("intensity", "TEXT", false, 0, null, 1));
            map2.put("source", new TableInfo.Column("source", "INTEGER", true, 0, null, 1));
            map2.put("course_id", new TableInfo.Column("course_id", "INTEGER", true, 0, null, 1));
            map2.put("detail", new TableInfo.Column("detail", "TEXT", false, 0, null, 1));
            map2.put("device_id", new TableInfo.Column("device_id", "TEXT", false, 0, null, 1));
            map2.put(DeviceContractKt.COLUMN_DEVICE_TYPE, new TableInfo.Column(DeviceContractKt.COLUMN_DEVICE_TYPE, "TEXT", false, 0, null, 1));
            map2.put("device_model", new TableInfo.Column("device_model", "TEXT", false, 0, null, 1));
            map2.put("data_type", new TableInfo.Column("data_type", "TEXT", false, 0, null, 1));
            map2.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            map2.put("deleted", new TableInfo.Column("deleted", "INTEGER", true, 0, null, 1));
            map2.put("update_time", new TableInfo.Column("update_time", "INTEGER", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new TableInfo.Index("index_record_exercise_device_id_device_type_data_type_timestamp", true, Arrays.asList("device_id", DeviceContractKt.COLUMN_DEVICE_TYPE, "data_type", "timestamp"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
            TableInfo tableInfo3 = new TableInfo("record_exercise", map2, hashSet3, hashSet4);
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "record_exercise");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "record_exercise(com.xiaomi.fitness.migration.exercise.entity.ExerciseRecord).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "record_step", "record_exercise");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "record_step", "record_exercise");
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
        map.put(seo.class, efo.f());
        map.put(kg8.class, og8.f());
        return map;
    }

    @Override // com.xiaomi.fitness.migration.exercise.HealthExerciseDatabase
    public kg8 h() {
        kg8 kg8Var;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            try {
                if (this.g == null) {
                    this.g = new og8(this);
                }
                kg8Var = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kg8Var;
    }

    @Override // com.xiaomi.fitness.migration.exercise.HealthExerciseDatabase
    public seo j() {
        seo seoVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new efo(this);
                }
                seoVar = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return seoVar;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(5, "439dbbf75c28d2dbeaa0304afadebccf", "ba60cf2441cbfd3468d9bb65f3d3b86c");
    }
}
