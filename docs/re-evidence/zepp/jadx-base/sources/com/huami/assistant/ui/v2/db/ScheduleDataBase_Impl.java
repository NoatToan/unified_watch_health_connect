package com.huami.assistant.ui.v2.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.assistant.ui.v2.db.dao.ScheduleDao;
import com.huami.assistant.ui.v2.db.dao.ScheduleDao_Impl;
import com.huami.assistant.ui.v2.db.dao.ScheduleEventDao;
import com.huami.assistant.ui.v2.db.dao.ScheduleEventDao_Impl;
import com.huami.assistant.ui.v2.db.dao.VocationDayDao;
import com.huami.assistant.ui.v2.db.dao.VocationDayDao_Impl;
import com.xiaomi.hm.health.device.settings.todo.datasource.impl.RemoteDataSourceImpl;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class ScheduleDataBase_Impl extends ScheduleDataBase {
    private volatile ScheduleDao b;
    private volatile ScheduleEventDao c;
    private volatile VocationDayDao d;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `schedule_model` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `desc` TEXT NOT NULL, `startTime` INTEGER NOT NULL, `stopTime` INTEGER NOT NULL, `alertTime` INTEGER NOT NULL, `repeatMode` INTEGER NOT NULL, `repeatStopTime` INTEGER NOT NULL, `isAllDayEvent` INTEGER NOT NULL, `imageUrl` TEXT NOT NULL, `source` INTEGER NOT NULL, `updateVersion` INTEGER NOT NULL, `address` TEXT NOT NULL, PRIMARY KEY(`id`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `schedule_event_model` (`id` INTEGER NOT NULL, `event_sync_id` TEXT NOT NULL, `schedule_id` INTEGER NOT NULL, `title` TEXT NOT NULL, `summary` TEXT NOT NULL, `start_time` INTEGER NOT NULL, `stop_time` INTEGER NOT NULL, `repeat_mode` INTEGER NOT NULL, `repeat_stop_time` INTEGER NOT NULL, `alert_time` INTEGER NOT NULL, `is_all_day_event` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `vocation_model` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `requestTimestampInMs` INTEGER NOT NULL, `code` TEXT NOT NULL, `year` TEXT NOT NULL, `isVocation` INTEGER NOT NULL, `date` TEXT NOT NULL)");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f6b371e1663e3c12d39b2748d11acce9')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `schedule_model`");
            _db.execSQL("DROP TABLE IF EXISTS `schedule_event_model`");
            _db.execSQL("DROP TABLE IF EXISTS `vocation_model`");
            if (ScheduleDataBase_Impl.this.mCallbacks != null) {
                int size = ScheduleDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ScheduleDataBase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (ScheduleDataBase_Impl.this.mCallbacks != null) {
                int size = ScheduleDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ScheduleDataBase_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            ScheduleDataBase_Impl.this.mDatabase = _db;
            ScheduleDataBase_Impl.this.internalInitInvalidationTracker(_db);
            if (ScheduleDataBase_Impl.this.mCallbacks != null) {
                int size = ScheduleDataBase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ScheduleDataBase_Impl.this.mCallbacks.get(i)).onOpen(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase _db) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase _db) {
            DBUtil.dropFtsSyncTriggers(_db);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
            HashMap map = new HashMap(13);
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
            map.put("desc", new TableInfo.Column("desc", "TEXT", true, 0, null, 1));
            map.put("startTime", new TableInfo.Column("startTime", "INTEGER", true, 0, null, 1));
            map.put("stopTime", new TableInfo.Column("stopTime", "INTEGER", true, 0, null, 1));
            map.put("alertTime", new TableInfo.Column("alertTime", "INTEGER", true, 0, null, 1));
            map.put(RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE, new TableInfo.Column(RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE, "INTEGER", true, 0, null, 1));
            map.put("repeatStopTime", new TableInfo.Column("repeatStopTime", "INTEGER", true, 0, null, 1));
            map.put("isAllDayEvent", new TableInfo.Column("isAllDayEvent", "INTEGER", true, 0, null, 1));
            map.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", true, 0, null, 1));
            map.put("source", new TableInfo.Column("source", "INTEGER", true, 0, null, 1));
            map.put("updateVersion", new TableInfo.Column("updateVersion", "INTEGER", true, 0, null, 1));
            map.put(IntegrityManager.INTEGRITY_TYPE_ADDRESS, new TableInfo.Column(IntegrityManager.INTEGRITY_TYPE_ADDRESS, "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("schedule_model", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "schedule_model");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "schedule_model(com.huami.assistant.ui.v2.model.ScheduleModel).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(11);
            map2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map2.put("event_sync_id", new TableInfo.Column("event_sync_id", "TEXT", true, 0, null, 1));
            map2.put("schedule_id", new TableInfo.Column("schedule_id", "INTEGER", true, 0, null, 1));
            map2.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
            map2.put("summary", new TableInfo.Column("summary", "TEXT", true, 0, null, 1));
            map2.put("start_time", new TableInfo.Column("start_time", "INTEGER", true, 0, null, 1));
            map2.put("stop_time", new TableInfo.Column("stop_time", "INTEGER", true, 0, null, 1));
            map2.put("repeat_mode", new TableInfo.Column("repeat_mode", "INTEGER", true, 0, null, 1));
            map2.put("repeat_stop_time", new TableInfo.Column("repeat_stop_time", "INTEGER", true, 0, null, 1));
            map2.put("alert_time", new TableInfo.Column("alert_time", "INTEGER", true, 0, null, 1));
            map2.put("is_all_day_event", new TableInfo.Column("is_all_day_event", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("schedule_event_model", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(_db, "schedule_event_model");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "schedule_event_model(com.huami.assistant.ui.v2.model.ScheduleEventModel).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(6);
            map3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map3.put("requestTimestampInMs", new TableInfo.Column("requestTimestampInMs", "INTEGER", true, 0, null, 1));
            map3.put("code", new TableInfo.Column("code", "TEXT", true, 0, null, 1));
            map3.put("year", new TableInfo.Column("year", "TEXT", true, 0, null, 1));
            map3.put("isVocation", new TableInfo.Column("isVocation", "INTEGER", true, 0, null, 1));
            map3.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo("vocation_model", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(_db, "vocation_model");
            if (tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "vocation_model(com.huami.assistant.ui.v2.model.VocationDayModel).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `schedule_model`");
            writableDatabase.execSQL("DELETE FROM `schedule_event_model`");
            writableDatabase.execSQL("DELETE FROM `vocation_model`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "schedule_model", "schedule_event_model", "vocation_model");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(4), "f6b371e1663e3c12d39b2748d11acce9", "6c05c62d8d4442f9b4b99a8f7aaa3066")).build());
    }

    @Override // com.huami.assistant.ui.v2.db.ScheduleDataBase
    public ScheduleDao scheduleDao() {
        ScheduleDao scheduleDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new ScheduleDao_Impl(this);
            }
            scheduleDao = this.b;
        }
        return scheduleDao;
    }

    @Override // com.huami.assistant.ui.v2.db.ScheduleDataBase
    public ScheduleEventDao scheduleEventDao() {
        ScheduleEventDao scheduleEventDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new ScheduleEventDao_Impl(this);
            }
            scheduleEventDao = this.c;
        }
        return scheduleEventDao;
    }

    @Override // com.huami.assistant.ui.v2.db.ScheduleDataBase
    public VocationDayDao vocationDayDao() {
        VocationDayDao vocationDayDao;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = new VocationDayDao_Impl(this);
            }
            vocationDayDao = this.d;
        }
        return vocationDayDao;
    }
}
