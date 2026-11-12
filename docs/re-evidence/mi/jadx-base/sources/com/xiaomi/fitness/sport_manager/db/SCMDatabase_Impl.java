package com.xiaomi.fitness.sport_manager.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_manager_export.listener.SCMDao;
import defpackage.v6l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class SCMDatabase_Impl extends SCMDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SCMDao f13185a;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `scm_table` (`sportType` INTEGER NOT NULL, `isLight` INTEGER NOT NULL, `isRemindHr` INTEGER NOT NULL, `heartRate` INTEGER NOT NULL, `isRemindSpeed` INTEGER NOT NULL, `speed` INTEGER NOT NULL, `riding` REAL NOT NULL, `isNotifyKm` INTEGER NOT NULL, `isMetronome` INTEGER NOT NULL, `metronomeRate` INTEGER NOT NULL, `isLockScreen` INTEGER NOT NULL, `remindHertRateRange` TEXT, `basicVoiceRemind` INTEGER NOT NULL, `isNotifyHrIntervalChange` INTEGER NOT NULL, `isAutoPause` INTEGER NOT NULL, PRIMARY KEY(`sportType`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4a4eed9c515a9ba799ded1e316d67bf7')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `scm_table`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            SCMDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(15);
            map.put(DailyRecordKey.sportType, new TableInfo.Column(DailyRecordKey.sportType, "INTEGER", true, 1, null, 1));
            map.put("isLight", new TableInfo.Column("isLight", "INTEGER", true, 0, null, 1));
            map.put("isRemindHr", new TableInfo.Column("isRemindHr", "INTEGER", true, 0, null, 1));
            map.put("heartRate", new TableInfo.Column("heartRate", "INTEGER", true, 0, null, 1));
            map.put("isRemindSpeed", new TableInfo.Column("isRemindSpeed", "INTEGER", true, 0, null, 1));
            map.put("speed", new TableInfo.Column("speed", "INTEGER", true, 0, null, 1));
            map.put("riding", new TableInfo.Column("riding", "REAL", true, 0, null, 1));
            map.put("isNotifyKm", new TableInfo.Column("isNotifyKm", "INTEGER", true, 0, null, 1));
            map.put("isMetronome", new TableInfo.Column("isMetronome", "INTEGER", true, 0, null, 1));
            map.put("metronomeRate", new TableInfo.Column("metronomeRate", "INTEGER", true, 0, null, 1));
            map.put("isLockScreen", new TableInfo.Column("isLockScreen", "INTEGER", true, 0, null, 1));
            map.put("remindHertRateRange", new TableInfo.Column("remindHertRateRange", "TEXT", false, 0, null, 1));
            map.put("basicVoiceRemind", new TableInfo.Column("basicVoiceRemind", "INTEGER", true, 0, null, 1));
            map.put("isNotifyHrIntervalChange", new TableInfo.Column("isNotifyHrIntervalChange", "INTEGER", true, 0, null, 1));
            map.put("isAutoPause", new TableInfo.Column("isAutoPause", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo(SCMConstants.scm_table, map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, SCMConstants.scm_table);
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "scm_table(com.xiaomi.fitness.sport_manager_export.data.SportConfigModel).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, SCMConstants.scm_table);
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), SCMConstants.scm_table);
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
        map.put(SCMDao.class, v6l.j());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(2, "4a4eed9c515a9ba799ded1e316d67bf7", "a443b31e1a4e1fc16c4a7d3acd2a4565");
    }

    @Override // com.xiaomi.fitness.sport_manager.db.SCMDatabase
    public SCMDao scmDao() {
        SCMDao sCMDao;
        if (this.f13185a != null) {
            return this.f13185a;
        }
        synchronized (this) {
            try {
                if (this.f13185a == null) {
                    this.f13185a = new v6l(this);
                }
                sCMDao = this.f13185a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sCMDao;
    }
}
