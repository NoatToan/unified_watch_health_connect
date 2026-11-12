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
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import defpackage.mzq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class VirtualAccountDatabase_Impl extends VirtualAccountDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile VirtualAccountDao f12123a;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `virtual_account` (`did` TEXT NOT NULL, `model` TEXT NOT NULL, `uid` INTEGER NOT NULL, `accountId` INTEGER NOT NULL, `name` TEXT NOT NULL, `icon` TEXT NOT NULL, `isDel` INTEGER NOT NULL, `isSyn` INTEGER NOT NULL, `type` INTEGER NOT NULL, `bodyComposition` TEXT NOT NULL, `createDate` TEXT NOT NULL, `createTime` INTEGER NOT NULL, `sn` TEXT NOT NULL DEFAULT '', `dataVersion` INTEGER NOT NULL DEFAULT 0, `sex` INTEGER NOT NULL DEFAULT -1, `birth` INTEGER NOT NULL DEFAULT 0, `height` INTEGER NOT NULL DEFAULT 0, `weightTarget` REAL NOT NULL DEFAULT 0, PRIMARY KEY(`createTime`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '63aa926a8825f7d24655ae2ec5cced60')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `virtual_account`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            VirtualAccountDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            map.put("did", new TableInfo.Column("did", "TEXT", true, 0, null, 1));
            map.put("model", new TableInfo.Column("model", "TEXT", true, 0, null, 1));
            map.put("uid", new TableInfo.Column("uid", "INTEGER", true, 0, null, 1));
            map.put(Column.ACCOUNT_ID, new TableInfo.Column(Column.ACCOUNT_ID, "INTEGER", true, 0, null, 1));
            map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            map.put("icon", new TableInfo.Column("icon", "TEXT", true, 0, null, 1));
            map.put("isDel", new TableInfo.Column("isDel", "INTEGER", true, 0, null, 1));
            map.put("isSyn", new TableInfo.Column("isSyn", "INTEGER", true, 0, null, 1));
            map.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, 1));
            map.put("bodyComposition", new TableInfo.Column("bodyComposition", "TEXT", true, 0, null, 1));
            map.put("createDate", new TableInfo.Column("createDate", "TEXT", true, 0, null, 1));
            map.put("createTime", new TableInfo.Column("createTime", "INTEGER", true, 1, null, 1));
            map.put("sn", new TableInfo.Column("sn", "TEXT", true, 0, "''", 1));
            map.put("dataVersion", new TableInfo.Column("dataVersion", "INTEGER", true, 0, "0", 1));
            map.put("sex", new TableInfo.Column("sex", "INTEGER", true, 0, "-1", 1));
            map.put(MedicalIdSPContract.PREF_BIRTHDAY, new TableInfo.Column(MedicalIdSPContract.PREF_BIRTHDAY, "INTEGER", true, 0, "0", 1));
            map.put("height", new TableInfo.Column("height", "INTEGER", true, 0, "0", 1));
            map.put("weightTarget", new TableInfo.Column("weightTarget", "REAL", true, 0, "0", 1));
            TableInfo tableInfo = new TableInfo("virtual_account", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "virtual_account");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "virtual_account(com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "virtual_account");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "virtual_account");
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
        map.put(VirtualAccountDao.class, mzq.r());
        return map;
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.VirtualAccountDatabase
    public VirtualAccountDao getVirtualAccountDao() {
        VirtualAccountDao virtualAccountDao;
        if (this.f12123a != null) {
            return this.f12123a;
        }
        synchronized (this) {
            try {
                if (this.f12123a == null) {
                    this.f12123a = new mzq(this);
                }
                virtualAccountDao = this.f12123a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return virtualAccountDao;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(2, "63aa926a8825f7d24655ae2ec5cced60", "f7b215425672658c4b9c47884a146a3f");
    }
}
