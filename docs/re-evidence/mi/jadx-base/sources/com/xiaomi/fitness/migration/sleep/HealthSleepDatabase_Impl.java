package com.xiaomi.fitness.migration.sleep;

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
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.szm;
import defpackage.u3n;
import defpackage.xzm;
import defpackage.y3n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class HealthSleepDatabase_Impl extends HealthSleepDatabase {
    public volatile szm e;
    public volatile u3n f;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `record_sleep` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `begin_time` INTEGER NOT NULL, `end_time` INTEGER NOT NULL, `stage` INTEGER NOT NULL, `segEnd` INTEGER NOT NULL, `device_id` TEXT, `device_type` TEXT, `device_model` TEXT, `data_type` TEXT, `timestamp` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `update_time` INTEGER NOT NULL)");
            SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_record_sleep_device_id_device_type_data_type_timestamp` ON `record_sleep` (`device_id`, `device_type`, `data_type`, `timestamp`)");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `snore_report` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `max_noise_decibel` REAL NOT NULL, `snore_frequency` INTEGER NOT NULL, `max_snore_decibel` REAL NOT NULL, `snore_times` INTEGER NOT NULL, `snore_duration` INTEGER NOT NULL, `snore_list` TEXT, `dream_talk_list` TEXT, `noise_list` TEXT, `device_id` TEXT, `device_type` TEXT, `device_model` TEXT, `data_type` TEXT, `timestamp` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `update_time` INTEGER NOT NULL)");
            SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_snore_report_device_id_device_type_data_type_timestamp` ON `snore_report` (`device_id`, `device_type`, `data_type`, `timestamp`)");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '73fe11a4af2abad64ac8f4d28e33e73b')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `record_sleep`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `snore_report`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            HealthSleepDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("begin_time", new TableInfo.Column("begin_time", "INTEGER", true, 0, null, 1));
            map.put(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, new TableInfo.Column(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, "INTEGER", true, 0, null, 1));
            map.put(StepsInfo.KEY_STAGE, new TableInfo.Column(StepsInfo.KEY_STAGE, "INTEGER", true, 0, null, 1));
            map.put("segEnd", new TableInfo.Column("segEnd", "INTEGER", true, 0, null, 1));
            map.put("device_id", new TableInfo.Column("device_id", "TEXT", false, 0, null, 1));
            map.put(DeviceContractKt.COLUMN_DEVICE_TYPE, new TableInfo.Column(DeviceContractKt.COLUMN_DEVICE_TYPE, "TEXT", false, 0, null, 1));
            map.put("device_model", new TableInfo.Column("device_model", "TEXT", false, 0, null, 1));
            map.put("data_type", new TableInfo.Column("data_type", "TEXT", false, 0, null, 1));
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            map.put("deleted", new TableInfo.Column("deleted", "INTEGER", true, 0, null, 1));
            map.put("update_time", new TableInfo.Column("update_time", "INTEGER", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_record_sleep_device_id_device_type_data_type_timestamp", true, Arrays.asList("device_id", DeviceContractKt.COLUMN_DEVICE_TYPE, "data_type", "timestamp"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
            TableInfo tableInfo = new TableInfo("record_sleep", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "record_sleep");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "record_sleep(com.xiaomi.fitness.migration.sleep.SleepStageRecord).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(16);
            map2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map2.put("max_noise_decibel", new TableInfo.Column("max_noise_decibel", "REAL", true, 0, null, 1));
            map2.put("snore_frequency", new TableInfo.Column("snore_frequency", "INTEGER", true, 0, null, 1));
            map2.put("max_snore_decibel", new TableInfo.Column("max_snore_decibel", "REAL", true, 0, null, 1));
            map2.put("snore_times", new TableInfo.Column("snore_times", "INTEGER", true, 0, null, 1));
            map2.put("snore_duration", new TableInfo.Column("snore_duration", "INTEGER", true, 0, null, 1));
            map2.put("snore_list", new TableInfo.Column("snore_list", "TEXT", false, 0, null, 1));
            map2.put("dream_talk_list", new TableInfo.Column("dream_talk_list", "TEXT", false, 0, null, 1));
            map2.put("noise_list", new TableInfo.Column("noise_list", "TEXT", false, 0, null, 1));
            map2.put("device_id", new TableInfo.Column("device_id", "TEXT", false, 0, null, 1));
            map2.put(DeviceContractKt.COLUMN_DEVICE_TYPE, new TableInfo.Column(DeviceContractKt.COLUMN_DEVICE_TYPE, "TEXT", false, 0, null, 1));
            map2.put("device_model", new TableInfo.Column("device_model", "TEXT", false, 0, null, 1));
            map2.put("data_type", new TableInfo.Column("data_type", "TEXT", false, 0, null, 1));
            map2.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            map2.put("deleted", new TableInfo.Column("deleted", "INTEGER", true, 0, null, 1));
            map2.put("update_time", new TableInfo.Column("update_time", "INTEGER", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new TableInfo.Index("index_snore_report_device_id_device_type_data_type_timestamp", true, Arrays.asList("device_id", DeviceContractKt.COLUMN_DEVICE_TYPE, "data_type", "timestamp"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
            TableInfo tableInfo3 = new TableInfo("snore_report", map2, hashSet3, hashSet4);
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "snore_report");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "snore_report(com.xiaomi.fitness.migration.sleep.snore.SnailSleepSnoreReport).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "record_sleep", "snore_report");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "record_sleep", "snore_report");
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
        map.put(szm.class, xzm.i());
        map.put(u3n.class, y3n.g());
        return map;
    }

    @Override // com.xiaomi.fitness.migration.sleep.HealthSleepDatabase
    public u3n i() {
        u3n u3nVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new y3n(this);
                }
                u3nVar = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return u3nVar;
    }

    @Override // com.xiaomi.fitness.migration.sleep.HealthSleepDatabase
    public szm j() {
        szm szmVar;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            try {
                if (this.e == null) {
                    this.e = new xzm(this);
                }
                szmVar = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return szmVar;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(3, "73fe11a4af2abad64ac8f4d28e33e73b", "466630f25a5c02ecd1154d95bf3692c1");
    }
}
