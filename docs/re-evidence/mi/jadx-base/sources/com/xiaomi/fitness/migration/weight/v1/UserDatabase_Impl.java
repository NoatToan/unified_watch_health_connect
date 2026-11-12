package com.xiaomi.fitness.migration.weight.v1;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import defpackage.hfq;
import defpackage.yeq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class UserDatabase_Impl extends UserDatabase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile yeq f12447b;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `weight` (`recordTime` INTEGER NOT NULL, `unit` INTEGER, `value` REAL NOT NULL, PRIMARY KEY(`recordTime`))");
            SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_weight_recordTime` ON `weight` (`recordTime`)");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `height` (`recordTime` INTEGER NOT NULL, `unit` INTEGER, `value` REAL NOT NULL, PRIMARY KEY(`recordTime`))");
            SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_height_recordTime` ON `height` (`recordTime`)");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6ff9b598207177aabd96e29d076837be')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `weight`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `height`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            UserDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(3);
            map.put("recordTime", new TableInfo.Column("recordTime", "INTEGER", true, 1, null, 1));
            map.put("unit", new TableInfo.Column("unit", "INTEGER", false, 0, null, 1));
            map.put("value", new TableInfo.Column("value", "REAL", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_weight_recordTime", false, Arrays.asList("recordTime"), Arrays.asList("ASC")));
            TableInfo tableInfo = new TableInfo("weight", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "weight");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "weight(com.xiaomi.fitness.migration.weight.v1.MiWeightItem).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(3);
            map2.put("recordTime", new TableInfo.Column("recordTime", "INTEGER", true, 1, null, 1));
            map2.put("unit", new TableInfo.Column("unit", "INTEGER", false, 0, null, 1));
            map2.put("value", new TableInfo.Column("value", "REAL", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new TableInfo.Index("index_height_recordTime", false, Arrays.asList("recordTime"), Arrays.asList("ASC")));
            TableInfo tableInfo3 = new TableInfo("height", map2, hashSet3, hashSet4);
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "height");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "height(com.xiaomi.fitness.migration.weight.v1.MiHeightItem).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "weight", "height");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "weight", "height");
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
        map.put(yeq.class, hfq.e());
        return map;
    }

    @Override // com.xiaomi.fitness.migration.weight.v1.UserDatabase
    public yeq i() {
        yeq yeqVar;
        if (this.f12447b != null) {
            return this.f12447b;
        }
        synchronized (this) {
            try {
                if (this.f12447b == null) {
                    this.f12447b = new hfq(this);
                }
                yeqVar = this.f12447b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yeqVar;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(1, "6ff9b598207177aabd96e29d076837be", "87f7f7f4c82d872d60d48e6259198bc1");
    }
}
