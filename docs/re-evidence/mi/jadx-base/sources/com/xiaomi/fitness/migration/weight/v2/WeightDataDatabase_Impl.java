package com.xiaomi.fitness.migration.weight.v2;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import defpackage.bfr;
import defpackage.efr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class WeightDataDatabase_Impl extends WeightDataDatabase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile bfr f12450b;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `weight` (`recordTime` INTEGER NOT NULL, `record_day_time` TEXT NOT NULL, `bmi` REAL NOT NULL, `source_type` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `unit` INTEGER, `value` REAL NOT NULL, PRIMARY KEY(`recordTime`))");
            SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_weight_recordTime` ON `weight` (`recordTime`)");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ee22b0c471ec912b2bd9d16e6385febb')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `weight`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            WeightDataDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(7);
            map.put("recordTime", new TableInfo.Column("recordTime", "INTEGER", true, 1, null, 1));
            map.put("record_day_time", new TableInfo.Column("record_day_time", "TEXT", true, 0, null, 1));
            map.put("bmi", new TableInfo.Column("bmi", "REAL", true, 0, null, 1));
            map.put("source_type", new TableInfo.Column("source_type", "INTEGER", true, 0, null, 1));
            map.put("update_time", new TableInfo.Column("update_time", "INTEGER", true, 0, null, 1));
            map.put("unit", new TableInfo.Column("unit", "INTEGER", false, 0, null, 1));
            map.put("value", new TableInfo.Column("value", "REAL", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_weight_recordTime", false, Arrays.asList("recordTime"), Arrays.asList("ASC")));
            TableInfo tableInfo = new TableInfo("weight", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "weight");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "weight(com.xiaomi.fitness.migration.weight.v2.WeightItemV2).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "weight");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "weight");
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
        map.put(bfr.class, efr.d());
        return map;
    }

    @Override // com.xiaomi.fitness.migration.weight.v2.WeightDataDatabase
    public bfr j() {
        bfr bfrVar;
        if (this.f12450b != null) {
            return this.f12450b;
        }
        synchronized (this) {
            try {
                if (this.f12450b == null) {
                    this.f12450b = new efr(this);
                }
                bfrVar = this.f12450b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bfrVar;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(1, "ee22b0c471ec912b2bd9d16e6385febb", "d48192e174490fded4bfb146e331c25e");
    }
}
