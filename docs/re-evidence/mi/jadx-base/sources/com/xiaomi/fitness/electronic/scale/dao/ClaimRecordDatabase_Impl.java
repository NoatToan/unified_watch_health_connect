package com.xiaomi.fitness.electronic.scale.dao;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.xiaomi.fitness.electronic.scale.dao.dao.ClaimRecordDao;
import defpackage.fy3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class ClaimRecordDatabase_Impl extends ClaimRecordDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ClaimRecordDao f12121a;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `claim_record` (`did` TEXT NOT NULL, `type` TEXT NOT NULL, `weight` REAL NOT NULL, `unit` TEXT NOT NULL, `createTime` INTEGER NOT NULL, `heartRate` INTEGER NOT NULL, `lfz12` INTEGER NOT NULL, `lfz13` INTEGER NOT NULL, `lfz14` INTEGER NOT NULL, `lfz23` INTEGER NOT NULL, `lfz24` INTEGER NOT NULL, `lfz34` INTEGER NOT NULL, `hfz12` INTEGER NOT NULL, `hfz13` INTEGER NOT NULL, `hfz14` INTEGER NOT NULL, `hfz23` INTEGER NOT NULL, `hfz24` INTEGER NOT NULL, `hfz34` INTEGER NOT NULL, `id` INTEGER NOT NULL, `isCloud` INTEGER NOT NULL, PRIMARY KEY(`createTime`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ea8a5a78f4f96380f2a1d25df2672974')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `claim_record`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            ClaimRecordDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            map.put("did", new TableInfo.Column("did", "TEXT", true, 0, null, 1));
            map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
            map.put("weight", new TableInfo.Column("weight", "REAL", true, 0, null, 1));
            map.put("unit", new TableInfo.Column("unit", "TEXT", true, 0, null, 1));
            map.put("createTime", new TableInfo.Column("createTime", "INTEGER", true, 1, null, 1));
            map.put("heartRate", new TableInfo.Column("heartRate", "INTEGER", true, 0, null, 1));
            map.put("lfz12", new TableInfo.Column("lfz12", "INTEGER", true, 0, null, 1));
            map.put("lfz13", new TableInfo.Column("lfz13", "INTEGER", true, 0, null, 1));
            map.put("lfz14", new TableInfo.Column("lfz14", "INTEGER", true, 0, null, 1));
            map.put("lfz23", new TableInfo.Column("lfz23", "INTEGER", true, 0, null, 1));
            map.put("lfz24", new TableInfo.Column("lfz24", "INTEGER", true, 0, null, 1));
            map.put("lfz34", new TableInfo.Column("lfz34", "INTEGER", true, 0, null, 1));
            map.put("hfz12", new TableInfo.Column("hfz12", "INTEGER", true, 0, null, 1));
            map.put("hfz13", new TableInfo.Column("hfz13", "INTEGER", true, 0, null, 1));
            map.put("hfz14", new TableInfo.Column("hfz14", "INTEGER", true, 0, null, 1));
            map.put("hfz23", new TableInfo.Column("hfz23", "INTEGER", true, 0, null, 1));
            map.put("hfz24", new TableInfo.Column("hfz24", "INTEGER", true, 0, null, 1));
            map.put("hfz34", new TableInfo.Column("hfz34", "INTEGER", true, 0, null, 1));
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 0, null, 1));
            map.put("isCloud", new TableInfo.Column("isCloud", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("claim_record", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "claim_record");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "claim_record(com.xiaomi.fitness.electronic.scale.data.ClaimRecord).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "claim_record");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "claim_record");
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.ClaimRecordDatabase
    public ClaimRecordDao getClaimRecordDao() {
        ClaimRecordDao claimRecordDao;
        if (this.f12121a != null) {
            return this.f12121a;
        }
        synchronized (this) {
            try {
                if (this.f12121a == null) {
                    this.f12121a = new fy3(this);
                }
                claimRecordDao = this.f12121a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return claimRecordDao;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(ClaimRecordDao.class, fy3.j());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(1, "ea8a5a78f4f96380f2a1d25df2672974", "2ba6ea34e202ab9b096c1c9eef354f66");
    }
}
