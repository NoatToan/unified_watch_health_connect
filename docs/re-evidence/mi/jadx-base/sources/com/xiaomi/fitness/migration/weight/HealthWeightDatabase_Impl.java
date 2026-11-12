package com.xiaomi.fitness.migration.weight;

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
import defpackage.u3c;
import defpackage.y3c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class HealthWeightDatabase_Impl extends HealthWeightDatabase {
    public volatile u3c d;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `record_weight` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `record_day_time` TEXT, `weight` REAL NOT NULL, `height` REAL NOT NULL, `bmi` REAL NOT NULL, `fat_rate` REAL NOT NULL, `body_water_rate` REAL NOT NULL, `bone_mass` REAL NOT NULL, `metabolism` REAL NOT NULL, `muscle_rate` REAL NOT NULL, `visceral_fat` REAL NOT NULL, `impedance` INTEGER NOT NULL, `protein_rate` REAL NOT NULL, `device_id` TEXT, `device_type` TEXT, `device_model` TEXT, `data_type` TEXT, `timestamp` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `update_time` INTEGER NOT NULL)");
            SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_record_weight_device_id_device_type_data_type_timestamp` ON `record_weight` (`device_id`, `device_type`, `data_type`, `timestamp`)");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0355f0b4d2991aad9cee02109394e75b')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `record_weight`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            HealthWeightDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(20);
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("record_day_time", new TableInfo.Column("record_day_time", "TEXT", false, 0, null, 1));
            map.put("weight", new TableInfo.Column("weight", "REAL", true, 0, null, 1));
            map.put("height", new TableInfo.Column("height", "REAL", true, 0, null, 1));
            map.put("bmi", new TableInfo.Column("bmi", "REAL", true, 0, null, 1));
            map.put("fat_rate", new TableInfo.Column("fat_rate", "REAL", true, 0, null, 1));
            map.put("body_water_rate", new TableInfo.Column("body_water_rate", "REAL", true, 0, null, 1));
            map.put("bone_mass", new TableInfo.Column("bone_mass", "REAL", true, 0, null, 1));
            map.put("metabolism", new TableInfo.Column("metabolism", "REAL", true, 0, null, 1));
            map.put("muscle_rate", new TableInfo.Column("muscle_rate", "REAL", true, 0, null, 1));
            map.put("visceral_fat", new TableInfo.Column("visceral_fat", "REAL", true, 0, null, 1));
            map.put("impedance", new TableInfo.Column("impedance", "INTEGER", true, 0, null, 1));
            map.put("protein_rate", new TableInfo.Column("protein_rate", "REAL", true, 0, null, 1));
            map.put("device_id", new TableInfo.Column("device_id", "TEXT", false, 0, null, 1));
            map.put(DeviceContractKt.COLUMN_DEVICE_TYPE, new TableInfo.Column(DeviceContractKt.COLUMN_DEVICE_TYPE, "TEXT", false, 0, null, 1));
            map.put("device_model", new TableInfo.Column("device_model", "TEXT", false, 0, null, 1));
            map.put("data_type", new TableInfo.Column("data_type", "TEXT", false, 0, null, 1));
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            map.put("deleted", new TableInfo.Column("deleted", "INTEGER", true, 0, null, 1));
            map.put("update_time", new TableInfo.Column("update_time", "INTEGER", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_record_weight_device_id_device_type_data_type_timestamp", true, Arrays.asList("device_id", DeviceContractKt.COLUMN_DEVICE_TYPE, "data_type", "timestamp"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
            TableInfo tableInfo = new TableInfo("record_weight", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "record_weight");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "record_weight(com.xiaomi.fitness.migration.weight.HealthWeightRecord).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "record_weight");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "record_weight");
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
        map.put(u3c.class, y3c.f());
        return map;
    }

    @Override // com.xiaomi.fitness.migration.weight.HealthWeightDatabase
    public u3c i() {
        u3c u3cVar;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            try {
                if (this.d == null) {
                    this.d = new y3c(this);
                }
                u3cVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return u3cVar;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(2, "0355f0b4d2991aad9cee02109394e75b", "264b5849255f79d45843731da061a2d9");
    }
}
