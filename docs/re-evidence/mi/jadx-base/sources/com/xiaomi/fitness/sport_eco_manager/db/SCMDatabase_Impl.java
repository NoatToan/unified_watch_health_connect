package com.xiaomi.fitness.sport_eco_manager.db;

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
import com.xiaomi.fitness.sport_eco_manager_export.listener.SCMDao;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.w6l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class SCMDatabase_Impl extends SCMDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SCMDao f13142a;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `eco_scm_table` (`sportType` INTEGER NOT NULL, `isLight` INTEGER NOT NULL, `isRemindHr` INTEGER NOT NULL, `heartRate` INTEGER NOT NULL, `isRemindSpeed` INTEGER NOT NULL, `speed` INTEGER NOT NULL, `riding` REAL NOT NULL, `isNotifyKm` INTEGER NOT NULL, `isMetronome` INTEGER NOT NULL, `metronomeRate` INTEGER NOT NULL, `isLockScreen` INTEGER NOT NULL, `remindHertRateRange` TEXT, `basicVoiceRemind` INTEGER NOT NULL, `isNotifyHrIntervalChange` INTEGER NOT NULL, `isAutoPause` INTEGER NOT NULL, `countdown` INTEGER NOT NULL, `countingInterval` INTEGER NOT NULL, `reportingInterval` INTEGER NOT NULL, PRIMARY KEY(`sportType`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '04fbdebf9368343399a76b337543ca8a')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `eco_scm_table`");
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
            HashMap map = new HashMap(18);
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
            map.put(DialWidgetType.COUNT_DOWN, new TableInfo.Column(DialWidgetType.COUNT_DOWN, "INTEGER", true, 0, null, 1));
            map.put("countingInterval", new TableInfo.Column("countingInterval", "INTEGER", true, 0, null, 1));
            map.put("reportingInterval", new TableInfo.Column("reportingInterval", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo(SCMConstants.scm_table, map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, SCMConstants.scm_table);
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "eco_scm_table(com.xiaomi.fitness.sport_eco_manager_export.data.SportConfigModel).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
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
        map.put(SCMDao.class, w6l.j());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(3, "04fbdebf9368343399a76b337543ca8a", "b373a5e863ef52ba71799f0509b7a027");
    }

    @Override // com.xiaomi.fitness.sport_eco_manager.db.SCMDatabase
    public SCMDao scmDao() {
        SCMDao sCMDao;
        if (this.f13142a != null) {
            return this.f13142a;
        }
        synchronized (this) {
            try {
                if (this.f13142a == null) {
                    this.f13142a = new w6l(this);
                }
                sCMDao = this.f13142a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sCMDao;
    }
}
