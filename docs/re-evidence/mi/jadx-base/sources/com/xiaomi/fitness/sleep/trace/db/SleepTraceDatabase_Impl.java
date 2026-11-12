package com.xiaomi.fitness.sleep.trace.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import defpackage.u0n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class SleepTraceDatabase_Impl extends SleepTraceDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SleepTraceDao f12906a;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `sleep_trace_log` (`version` INTEGER NOT NULL, `category` INTEGER NOT NULL, `event` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `desc` TEXT, `timestamp` INTEGER NOT NULL)");
            SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_sleep_trace_log_timestamp` ON `sleep_trace_log` (`timestamp`)");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2e30031678a0fc27f922f7d28b6aeb03')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `sleep_trace_log`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            SleepTraceDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            map.put("version", new TableInfo.Column("version", "INTEGER", true, 0, null, 1));
            map.put("category", new TableInfo.Column("category", "INTEGER", true, 0, null, 1));
            map.put("event", new TableInfo.Column("event", "INTEGER", true, 0, null, 1));
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("desc", new TableInfo.Column("desc", "TEXT", false, 0, null, 1));
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_sleep_trace_log_timestamp", false, Arrays.asList("timestamp"), Arrays.asList("ASC")));
            TableInfo tableInfo = new TableInfo("sleep_trace_log", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "sleep_trace_log");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "sleep_trace_log(com.xiaomi.fitness.sleep.trace.db.SleepTraceLog).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "sleep_trace_log");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "sleep_trace_log");
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
        map.put(SleepTraceDao.class, u0n.f());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(1, "2e30031678a0fc27f922f7d28b6aeb03", "6d3111d56e74ad2646c6163c70957416");
    }

    @Override // com.xiaomi.fitness.sleep.trace.db.SleepTraceDatabase
    public SleepTraceDao sleepTraceDao() {
        SleepTraceDao sleepTraceDao;
        if (this.f12906a != null) {
            return this.f12906a;
        }
        synchronized (this) {
            try {
                if (this.f12906a == null) {
                    this.f12906a = new u0n(this);
                }
                sleepTraceDao = this.f12906a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sleepTraceDao;
    }
}
