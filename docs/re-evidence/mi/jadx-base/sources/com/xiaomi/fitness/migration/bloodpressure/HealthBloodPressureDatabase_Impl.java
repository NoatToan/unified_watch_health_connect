package com.xiaomi.fitness.migration.bloodpressure;

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
import defpackage.az2;
import defpackage.ez2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class HealthBloodPressureDatabase_Impl extends HealthBloodPressureDatabase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile az2 f12407b;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `record_blood_pressure` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `high_pressure` INTEGER NOT NULL, `low_pressure` INTEGER NOT NULL, `device_id` TEXT, `device_type` TEXT, `device_model` TEXT, `data_type` TEXT, `timestamp` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `update_time` INTEGER NOT NULL)");
            SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_record_blood_pressure_device_id_device_type_data_type_timestamp` ON `record_blood_pressure` (`device_id`, `device_type`, `data_type`, `timestamp`)");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8cb8f8dc126ca1cf1971161650dce74b')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `record_blood_pressure`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            HealthBloodPressureDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("high_pressure", new TableInfo.Column("high_pressure", "INTEGER", true, 0, null, 1));
            map.put("low_pressure", new TableInfo.Column("low_pressure", "INTEGER", true, 0, null, 1));
            map.put("device_id", new TableInfo.Column("device_id", "TEXT", false, 0, null, 1));
            map.put(DeviceContractKt.COLUMN_DEVICE_TYPE, new TableInfo.Column(DeviceContractKt.COLUMN_DEVICE_TYPE, "TEXT", false, 0, null, 1));
            map.put("device_model", new TableInfo.Column("device_model", "TEXT", false, 0, null, 1));
            map.put("data_type", new TableInfo.Column("data_type", "TEXT", false, 0, null, 1));
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            map.put("deleted", new TableInfo.Column("deleted", "INTEGER", true, 0, null, 1));
            map.put("update_time", new TableInfo.Column("update_time", "INTEGER", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_record_blood_pressure_device_id_device_type_data_type_timestamp", true, Arrays.asList("device_id", DeviceContractKt.COLUMN_DEVICE_TYPE, "data_type", "timestamp"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
            TableInfo tableInfo = new TableInfo("record_blood_pressure", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "record_blood_pressure");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "record_blood_pressure(com.xiaomi.fitness.migration.bloodpressure.BloodPressureRecord).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "record_blood_pressure");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "record_blood_pressure");
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
        map.put(az2.class, ez2.f());
        return map;
    }

    @Override // com.xiaomi.fitness.migration.bloodpressure.HealthBloodPressureDatabase
    public az2 h() {
        az2 az2Var;
        if (this.f12407b != null) {
            return this.f12407b;
        }
        synchronized (this) {
            try {
                if (this.f12407b == null) {
                    this.f12407b = new ez2(this);
                }
                az2Var = this.f12407b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return az2Var;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(1, "8cb8f8dc126ca1cf1971161650dce74b", "7f43b5dba511c19f40729c39fc19fca8");
    }
}
