package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import defpackage.sn1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class AudioRecordDataBase_Impl extends AudioRecordDataBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile AudioRecordDao f11962a;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `audio_record` (`timestamp` INTEGER NOT NULL, `title` TEXT NOT NULL, `newTitle` TEXT NOT NULL, `did` TEXT NOT NULL, `duration` INTEGER NOT NULL, `status` INTEGER NOT NULL, `format` INTEGER NOT NULL, `fdsName` TEXT, `contentList` TEXT, PRIMARY KEY(`title`, `did`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '051c6993ec5eb041723c7eba86ad185e')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `audio_record`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            AudioRecordDataBase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(9);
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            map.put("title", new TableInfo.Column("title", "TEXT", true, 1, null, 1));
            map.put("newTitle", new TableInfo.Column("newTitle", "TEXT", true, 0, null, 1));
            map.put("did", new TableInfo.Column("did", "TEXT", true, 2, null, 1));
            map.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, 1));
            map.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
            map.put("format", new TableInfo.Column("format", "INTEGER", true, 0, null, 1));
            map.put("fdsName", new TableInfo.Column("fdsName", "TEXT", false, 0, null, 1));
            map.put("contentList", new TableInfo.Column("contentList", "TEXT", false, 0, null, 1));
            TableInfo tableInfo = new TableInfo(AudioRecordDataBase.sName, map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, AudioRecordDataBase.sName);
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "audio_record(com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordDataBase
    public AudioRecordDao audioRecordDao() {
        AudioRecordDao audioRecordDao;
        if (this.f11962a != null) {
            return this.f11962a;
        }
        synchronized (this) {
            try {
                if (this.f11962a == null) {
                    this.f11962a = new sn1(this);
                }
                audioRecordDao = this.f11962a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return audioRecordDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, AudioRecordDataBase.sName);
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), AudioRecordDataBase.sName);
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
        map.put(AudioRecordDao.class, sn1.i());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(2, "051c6993ec5eb041723c7eba86ad185e", "3d077c0da49cd9e1d7c913e7dabfdfbd");
    }
}
