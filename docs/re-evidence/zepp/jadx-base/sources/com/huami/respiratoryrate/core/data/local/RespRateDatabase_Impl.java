package com.huami.respiratoryrate.core.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.respiratoryrate.core.data.local.dao.RespRateDao;
import com.huami.respiratoryrate.core.data.local.dao.RespRateDao_Impl;
import com.huami.respiratoryrate.core.data.remote.entity.RespRateEventItem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class RespRateDatabase_Impl extends RespRateDatabase {
    private volatile RespRateDao c;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `RespiratoryRate` (`respRateTime` INTEGER NOT NULL, `respRate` INTEGER NOT NULL, `offset` INTEGER NOT NULL, `userId` TEXT NOT NULL, `sync` INTEGER NOT NULL, PRIMARY KEY(`respRateTime`))");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a369022239d73a4f17b7877e6e212473')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `RespiratoryRate`");
            if (RespRateDatabase_Impl.this.mCallbacks != null) {
                int size = RespRateDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) RespRateDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (RespRateDatabase_Impl.this.mCallbacks != null) {
                int size = RespRateDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) RespRateDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            RespRateDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
            RespRateDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (RespRateDatabase_Impl.this.mCallbacks != null) {
                int size = RespRateDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) RespRateDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(5);
            map.put("respRateTime", new TableInfo.Column("respRateTime", "INTEGER", true, 1, null, 1));
            map.put("respRate", new TableInfo.Column("respRate", "INTEGER", true, 0, null, 1));
            map.put("offset", new TableInfo.Column("offset", "INTEGER", true, 0, null, 1));
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map.put("sync", new TableInfo.Column("sync", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo(RespRateEventItem.EventType, map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, RespRateEventItem.EventType);
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "RespiratoryRate(com.huami.respiratoryrate.core.data.local.entity.RespRateEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `RespiratoryRate`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), RespRateEventItem.EventType);
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(1), "a369022239d73a4f17b7877e6e212473", "7031cdc6b752f69805f7c2bdaa0fbf27")).build());
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(RespRateDao.class, RespRateDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.huami.respiratoryrate.core.data.local.RespRateDatabase
    public RespRateDao respRateDao() {
        RespRateDao respRateDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new RespRateDao_Impl(this);
            }
            respRateDao = this.c;
        }
        return respRateDao;
    }
}
