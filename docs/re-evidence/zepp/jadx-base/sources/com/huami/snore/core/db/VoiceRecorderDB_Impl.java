package com.huami.snore.core.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.snore.core.db.dao.VoiceRecorderDao;
import com.huami.snore.core.db.dao.VoiceRecorderDao_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public final class VoiceRecorderDB_Impl extends VoiceRecorderDB {
    private volatile VoiceRecorderDao _voiceRecorderDao;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `voice_recorder_table`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "voice_recorder_table");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) { // from class: com.huami.snore.core.db.VoiceRecorderDB_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `voice_recorder_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uid` TEXT NOT NULL, `duration` INTEGER NOT NULL, `type` TEXT NOT NULL, `start_time` INTEGER, `file_path` TEXT, `uploaded` INTEGER NOT NULL)");
                _db.execSQL(RoomMasterTable.CREATE_QUERY);
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ee5a7a49b5cd7d3193a98c00a46fb462')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("DROP TABLE IF EXISTS `voice_recorder_table`");
                if (VoiceRecorderDB_Impl.this.mCallbacks != null) {
                    int size = VoiceRecorderDB_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) VoiceRecorderDB_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase _db) {
                if (VoiceRecorderDB_Impl.this.mCallbacks != null) {
                    int size = VoiceRecorderDB_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) VoiceRecorderDB_Impl.this.mCallbacks.get(i)).onCreate(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase _db) {
                VoiceRecorderDB_Impl.this.mDatabase = _db;
                VoiceRecorderDB_Impl.this.internalInitInvalidationTracker(_db);
                if (VoiceRecorderDB_Impl.this.mCallbacks != null) {
                    int size = VoiceRecorderDB_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) VoiceRecorderDB_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
                HashMap map = new HashMap(7);
                map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map.put("uid", new TableInfo.Column("uid", "TEXT", true, 0, null, 1));
                map.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, 1));
                map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                map.put("start_time", new TableInfo.Column("start_time", "INTEGER", false, 0, null, 1));
                map.put("file_path", new TableInfo.Column("file_path", "TEXT", false, 0, null, 1));
                map.put("uploaded", new TableInfo.Column("uploaded", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("voice_recorder_table", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(_db, "voice_recorder_table");
                if (tableInfo.equals(tableInfo2)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "voice_recorder_table(com.huami.snore.core.db.entity.VoiceRecorderEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
        }, "ee5a7a49b5cd7d3193a98c00a46fb462", "5c10cec0508416a89988a4dfad86d232")).build());
    }

    @Override // com.huami.snore.core.db.VoiceRecorderDB
    public VoiceRecorderDao voiceRecorderDao() {
        VoiceRecorderDao voiceRecorderDao;
        if (this._voiceRecorderDao != null) {
            return this._voiceRecorderDao;
        }
        synchronized (this) {
            if (this._voiceRecorderDao == null) {
                this._voiceRecorderDao = new VoiceRecorderDao_Impl(this);
            }
            voiceRecorderDao = this._voiceRecorderDao;
        }
        return voiceRecorderDao;
    }
}
