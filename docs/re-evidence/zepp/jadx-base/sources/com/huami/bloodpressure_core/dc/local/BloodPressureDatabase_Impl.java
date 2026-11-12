package com.huami.bloodpressure_core.dc.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodPressureDatabase_Impl extends BloodPressureDatabase {
    private volatile IBloodPressureDao b;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `BloodPressureDbVo` (`measureTime` INTEGER NOT NULL, `sbp` INTEGER NOT NULL, `dbp` INTEGER NOT NULL, `bpm` INTEGER, `timeZone` INTEGER, `userId` TEXT NOT NULL, `eventType` TEXT NOT NULL, `subType` TEXT NOT NULL, `isUpload` INTEGER NOT NULL, `dateStr` TEXT NOT NULL, `dataSource` INTEGER NOT NULL, `extra1` TEXT, `extra2` TEXT, PRIMARY KEY(`userId`, `measureTime`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0ae1452e49f527a3c17e44a4fc86293c')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `BloodPressureDbVo`");
            if (BloodPressureDatabase_Impl.this.mCallbacks != null) {
                int size = BloodPressureDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) BloodPressureDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (BloodPressureDatabase_Impl.this.mCallbacks != null) {
                int size = BloodPressureDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) BloodPressureDatabase_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            BloodPressureDatabase_Impl.this.mDatabase = _db;
            BloodPressureDatabase_Impl.this.internalInitInvalidationTracker(_db);
            if (BloodPressureDatabase_Impl.this.mCallbacks != null) {
                int size = BloodPressureDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) BloodPressureDatabase_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            map.put(BloodPressureConst.ParamKey.MEASURETIME, new TableInfo.Column(BloodPressureConst.ParamKey.MEASURETIME, "INTEGER", true, 2, null, 1));
            map.put("sbp", new TableInfo.Column("sbp", "INTEGER", true, 0, null, 1));
            map.put("dbp", new TableInfo.Column("dbp", "INTEGER", true, 0, null, 1));
            map.put("bpm", new TableInfo.Column("bpm", "INTEGER", false, 0, null, 1));
            map.put("timeZone", new TableInfo.Column("timeZone", "INTEGER", false, 0, null, 1));
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
            map.put("eventType", new TableInfo.Column("eventType", "TEXT", true, 0, null, 1));
            map.put("subType", new TableInfo.Column("subType", "TEXT", true, 0, null, 1));
            map.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map.put("dateStr", new TableInfo.Column("dateStr", "TEXT", true, 0, null, 1));
            map.put(ParamKey.dataSource, new TableInfo.Column(ParamKey.dataSource, "INTEGER", true, 0, null, 1));
            map.put("extra1", new TableInfo.Column("extra1", "TEXT", false, 0, null, 1));
            map.put("extra2", new TableInfo.Column("extra2", "TEXT", false, 0, null, 1));
            TableInfo tableInfo = new TableInfo("BloodPressureDbVo", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "BloodPressureDbVo");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "BloodPressureDbVo(com.huami.bloodpressure_core.dc.local.BloodPressureDbVo).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // com.huami.bloodpressure_core.dc.local.BloodPressureDatabase
    public IBloodPressureDao bpDao() {
        IBloodPressureDao iBloodPressureDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new IBloodPressureDao_Impl(this);
            }
            iBloodPressureDao = this.b;
        }
        return iBloodPressureDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `BloodPressureDbVo`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "BloodPressureDbVo");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(1), "0ae1452e49f527a3c17e44a4fc86293c", "d2f28e5a490716f36deba1bc03569cfd")).build());
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(IBloodPressureDao.class, IBloodPressureDao_Impl.getRequiredConverters());
        return map;
    }
}
